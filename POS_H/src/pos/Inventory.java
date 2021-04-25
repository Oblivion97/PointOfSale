package pos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Inventory {

    public static String dbName = Features.dbName;
    public static String dbSoftware = Features.dbSoftware;
   
    //============================= Database Variables ==============================
    Connection conn = null;
    String sql = "";
    PreparedStatement pstmt = null;
    Statement stmt = null;
    ResultSet rs = null;

    String id;          //product id
    String name;
    Integer price;
    Integer cost;
    private Integer quantity;
    String category;
    Product tempPrdt;
    boolean found = false;

    //============================ Methods ==================================
    //-------------Inventory Methods----------
    public Product searchProductByID(String id) {
        try {
            conn = Features.getDBConnection(Features.dbName);
            sql = "SELECT * FROM inventory WHERE id=?;";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                this.id = rs.getString("id");
                name = rs.getString("name");
                price = rs.getInt("price");
                cost = rs.getInt("cost");
                quantity = rs.getInt("quantity");
                category = rs.getString("category");
            }
            tempPrdt = new Product(this.id, name, price, cost, quantity, category);

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

        return tempPrdt;
    }

    public boolean searchProductByIDboolean(String id) {
        found = false;
        try {
            conn = Features.getDBConnection(Features.dbName);

            sql = "SELECT * FROM inventory WHERE id=?;";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                found = true;
            }

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
        return found;
    }

    public Product searchProductByName(String name) {
        try {
            conn = Features.getDBConnection(Features.dbName);

            sql = "SELECT * FROM inventory WHERE name=?;";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                this.id = rs.getString("id");
                name = rs.getString("name");
                price = rs.getInt("price");
                cost = rs.getInt("cost");
                quantity = rs.getInt("quantity");
                category = rs.getString("category");
            }
            tempPrdt = new Product(this.id, name, price, cost, quantity, category);

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

        return tempPrdt;
    }

    public void showInventory() {
        try {
            conn = Features.getDBConnection(Features.dbName);

            sql = "SELECT * FROM inventory;";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                this.id = rs.getString("id");
                name = rs.getString("name");
                price = rs.getInt("price");
                cost = rs.getInt("cost");
                quantity = rs.getInt("quantity");
                category = rs.getString("category");

                tempPrdt = new Product(this.id, name, price, cost, quantity, category);
                //System.out.println(tempPrdt);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public List<Product> inventoryLinkedListFromResultSet() {
        LinkedList<Product> prdtList = new LinkedList<>();
        try {
            conn = Features.getDBConnection(Features.dbName);

            sql = "SELECT * FROM inventory;";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                this.id = rs.getString("id");
                name = rs.getString("name");
                price = rs.getInt("price");
                cost = rs.getInt("cost");
                quantity = rs.getInt("quantity");
                category = rs.getString("category");

                tempPrdt = new Product(this.id, name, price, cost, quantity, category);
                prdtList.add(tempPrdt);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return prdtList;
    }

    public DefaultTableModel inventoryTableModel(List<Product> prdts) {
        DefaultTableModel model;

        // Array Implementation
        String id = null, name = null, cost = null, quantity = null, price = null, catagory = null;
        String[] columnNames = {"ID", "Name of Product", "Sell Price", "Cost Price", "Quantity", "Catagory"};
        int i = 0, j = 0, totalP = 0, row = prdts.size(), column = 6;
        String[][] data = new String[row][column];

        for (i = 0; i < prdts.size(); i++) {
            Product tempPrdt = prdts.get(i);
            id = tempPrdt.id;
            name = tempPrdt.name;
            price = Integer.toString(tempPrdt.price);
            cost = Integer.toString(tempPrdt.cost);
            quantity = Integer.toString(tempPrdt.getQuantity());
            catagory = tempPrdt.category;

            data[i][j] = id;
            data[i][j + 1] = name;
            data[i][j + 2] = price;
            data[i][j + 3] = cost;
            data[i][j + 4] = quantity;
            data[i][j + 5] = catagory;
            //System.out.println(data[i][j]);
            j = 0;

        }

        model = new DefaultTableModel(data, columnNames);
        return model;
    }
}
