package pos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class Invoice {          //when objcet is created only product is added to cart not changed in db

    String id_inv;                        //mandatory
    public List<Product> prdts;           //mandatory
    private int total;                    //mandatory
    public Calendar time;                 //mandatory
    Customer cstmr;
    SalesPerson sPer;

    //=========================Methods========================
    //*************Table******************
    public DefaultTableModel invoiceTableModel(List<Product> prdts) {
        DefaultTableModel model;

        //-----------vec implementation-------------------
        Vector<String> column = new Vector<>();
        column.add("ProductName");
        column.add("Rate");
        column.add("Quantity");
        column.add("Price");

        Vector<Vector<String>> vec2D = new Vector<>();

        for (Product tempP : prdts) {
            Vector<String> vecRow = new Vector<>();
            vecRow.add(tempP.name);
            vecRow.add(Integer.toString(tempP.price));
            vecRow.add(Integer.toString(tempP.getQuantity()));
            int totalP = tempP.price * tempP.getQuantity();
            vecRow.add(Integer.toString(totalP));
            // System.out.println(vecRow);
            vec2D.add(vecRow);
        }
        //System.out.println(vec2D);
       
        model = new DefaultTableModel(vec2D, column);
        return model;

    }

    //========================= Sales Log ========================
    public void addSalesLogToDB(Invoice invoice) {
        String date = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(time.getTime());
        try {
            conn = Features.getDBConnection(Features.dbName);
            sql = "INSERT INTO salesLog VALUES (?, ?, ?, ?, ?);";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, invoice.id_inv);
            pstmt.setInt(2, invoice.getTotal());
            pstmt.setString(3, date);
            pstmt.setString(4, invoice.cstmr.phone);
            pstmt.setObject(5, prdts);
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

    public DefaultTableModel salesLogToTableModel() {
        DefaultTableModel model = null;
        Vector<Vector<String>> vec2D = new Vector<>();
        try {
            conn = Features.getDBConnection(Features.dbName);
            sql = "SELECT * FROM salesLog;";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String id_inv = rs.getString("id_invoice");
                int total = rs.getInt("total");
                String time = rs.getString("time");
               // String id_cstmr = rs.getString("id_cstmr");

                Vector<String> vecRow = new Vector<>();
                vecRow.add(id_inv);
                vecRow.add(Integer.toString(total));
                vecRow.add(time);
               // vecRow.add(id_cstmr);
                vec2D.add(vecRow);
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
        
        Vector<String> column=new Vector<>();
        column.add("Invoice ID");
        column.add("Billed Total");
        column.add("Time");
        //column.add("Customer ID");
        
        model=new DefaultTableModel(vec2D, column);
        return model;
    }

    //========================== inventory update after sale ============== 
    public void inventoryUpdateAfterInvoice(LinkedList<Product> prdtList) {    //Adding To a list after choosing before finalizing db for invoice             
        for (int i = 0; i < prdtList.size(); i++) {
            singleItemSaleUpdate(prdtList.get(i));
        }
    }

    public void singleItemSaleUpdate(Product prdt) {
        int stockQuantity = (inventory.searchProductByID(prdt.id)).getQuantity();
        int newQuantity = stockQuantity - prdt.getQuantity();
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
    }

    //==================== other methods ==================
    public void setTotal() {
        Integer total = 0;
        for (Product x : this.prdts) {
            total += x.price * x.getQuantity();
        }
        this.total = total;
    }

    public int getTotal() {
        return this.total;
    }

    @Override
    public String toString() {
        return "Invoice{" + "Inovicce id=" + id_inv + ", prdts=" + prdts + ", total=" + total + ", time=" + time + '}';
    }

    //=========================Get&Set========================
    //=========================constructor========================
    public Invoice() {
    }

    public Invoice(String id, List<Product> prdts) {
        this.id_inv = id;
        this.prdts = prdts;
        this.time = new GregorianCalendar().getInstance();
        setTotal();
    }

    public Invoice(String id, List<Product> prdts, Calendar time) {
        this.id_inv = id;
        this.prdts = prdts;
        this.time = time;
        setTotal();
    }

    public Invoice(String id, List<Product> prdts, Calendar time, Customer cstmr) {
        this.id_inv = id;
        this.prdts = prdts;
        this.time = time;
        this.cstmr = cstmr;
        setTotal();
    }

    public Invoice(String id, List<Product> prdts, Calendar time, Customer cstmr, SalesPerson sPer) {
        this.id_inv = id;
        this.prdts = prdts;
        this.time = time;
        this.cstmr = cstmr;
        this.sPer = sPer;
        setTotal();
    }

    //=============================Database Variables==============================
    Connection conn;
    String sql;
 
    PreparedStatement pstmt, stmtupdt;
    Statement stmt;
    ResultSet rs;

    Inventory inventory = new Inventory();
    Product tempP;
}
