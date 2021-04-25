package pos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class Purchase {

    String id_pur;          //mandatory purchase voucher id
    Product prdt;           //mandatory
    private int bill;       //mandatory
    Calendar time;          //mandatory

    @Override
    public String toString() {
        return "Purchase{" + "\nPurchase ID=" + id_pur + ", \nProduct={" + prdt + "},\nBill=" + bill + ", \nTime=" + time + '}';
    }

    //=========================Methods========================
    public int getBill() {
        return bill;
    }

    //=========================== Purchase Database Update Methods ===========================
    public void inventoryUpdateAfterPurchase() {
        if (inventory.searchProductByIDboolean(prdt.id)) {
            increaseQuantityToExistingItem(this.prdt);
        }
        if (!(inventory.searchProductByIDboolean(prdt.id))) {
            addNewItemInInventory(this.prdt);
        }

    }

    public void addNewItemInInventory(Product prdt) {
        try {
            conn = Features.getDBConnection(Features.dbName);
            sql = "INSERT INTO inventory VALUES (?, ?, ?, ?, ?, ? );";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, prdt.id);
            pstmt.setString(2, prdt.name);
            pstmt.setInt(3, prdt.price);
            pstmt.setInt(4, prdt.cost);
            pstmt.setInt(5, prdt.getQuantity());
            pstmt.setString(6, prdt.category);
            pstmt.execute();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                pstmt.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void increaseQuantityToExistingItem(Product prdt) {
        Product tempPrdt = inventory.searchProductByID(prdt.id);
        int newQuantity = tempPrdt.getQuantity() + prdt.getQuantity();

        try {
            conn = Features.getDBConnection(Features.dbName);

            sql = "UPDATE inventory SET quantity=? WHERE id=?;";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, newQuantity);
            pstmt.setString(2, prdt.id);
            pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                pstmt.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        //System.out.println("Qunatity increased successfully");
    }

    //=========================== Purchase LOG Related Methods ===========================
    public void addPurchaseLogtoDB() {
        String date = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(time.getTime());
//        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
//        time = new GregorianCalendar();
//        String dateTime = sdf.format(time.getTime());
        //System.out.println(dateTime);
        try {
            conn = Features.getDBConnection(Features.dbName);
            sql = "INSERT INTO purchaseLog VALUES (?, ?, ?, ?);";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id_pur);
            pstmt.setString(2, prdt.id);
            pstmt.setInt(3, getBill());
            pstmt.setString(4, date);
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                pstmt.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    }

    public LinkedList<Purchase> purchaseLogLinkedListFromResultSet() {
        LinkedList<Purchase> purLogList = new LinkedList<>();
        try {
            conn = Features.getDBConnection(Features.dbName);
            sql = "SELECT * FROM purchaseLog;";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String id_pur = rs.getString(1);
                String id_prdt = rs.getString(2);
                int bill = rs.getInt(3);
                String time = rs.getString(4);

                Product tempPrdt = inventory.searchProductByID(id_prdt);
                int quant = bill / tempPrdt.price;
                tempPrdt.setQuantity(quant);
                //System.out.println(tempPrdt);

                Purchase tempPur = new Purchase(id_pur, tempPrdt, bill, stringToCalendar(time));
                purLogList.add(tempPur);
                //System.out.println(purLogList);
            }
        } catch (Exception e) {
        } finally {
            try {
                stmt.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return purLogList;
    }

    public DefaultTableModel purchaseLogTableModel(List<Purchase> purLogList) {
        DefaultTableModel model = null;
        Vector<String> column = new Vector<>();
        column.add("Purchase ID");
        column.add("Product ID");
        column.add("Bill");
        column.add("Time");
        Vector<Vector<String>> vec2D = new Vector<>();

        for (Purchase tempPurLog : purLogList) {
            Vector<String> vecRow = new Vector<>();
            vecRow.add(tempPurLog.id_pur);
            vecRow.add(tempPurLog.prdt.id);
            vecRow.add(Integer.toString(tempPurLog.bill));
            vecRow.add(calendarToString(tempPurLog.time));

            vec2D.add(vecRow);
           // System.out.println(vec2D);
        }
        model = new DefaultTableModel(vec2D, column);
        return model;
    }

    //============= DATE Time Related Methods ========================
    public static Calendar stringToCalendar(String timeS) {
        Calendar cal = null;

        DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date date;
        try {
            date = df.parse(timeS);
            cal = new GregorianCalendar();
            cal.setTime(date);
            //System.out.println(df.format(date));

        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return cal;
    }

    public static String calendarToString(Calendar cal) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String time = sdf.format(cal.getTime());
        return time;
    }

//========================= Constructors ========================
    public Purchase() {
    }

    public Purchase(String id_pur, Product prdt, Calendar time) {
        this.id_pur = id_pur;
        this.prdt = prdt;
        this.time = time;
        this.bill = this.prdt.cost * this.prdt.getQuantity();
    }

    //it will be used for getting purchase log from database to table
    public Purchase(String id_pur, Product prdt, int bill, Calendar time) {
        this.id_pur = id_pur;
        this.prdt = prdt;
        this.bill = bill;
        this.time = time;
    }

    //============================= Database Variavbles ==============================
    Connection conn;
    String sql;
    PreparedStatement pstmt;
    Statement stmt;
    ResultSet rs;
    Inventory inventory = new Inventory();
}
