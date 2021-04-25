package pos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class Customer {

    public String name;
    public String address;
    public String phone;


    //=========================constructor========================

    public Customer() {
    }

    public Customer(String name, String phone) {
        this.name = name;
        this.phone = phone;
        // addCustomer();
    }

    public Customer(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        // addCustomer();
    }

    //*******************Method***********************************
    @Override
    public String toString() {
        return "\nCustomer's Name : " + name
                + "\nAddress : " + address
                + "\nPhone : " + phone;
    }

    public void addCustomer() {
        try {
            conn = Features.getDBConnection(Features.dbName);
            sql = "INSERT INTO customer VALUES ( ?, ?, ? );";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setString(2, address);
            pstmt.setString(3, phone);
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
            //System.out.println("Customer Added successfully");
        }

    }

    public int deleteCustomer(String phone) {
        int found = 0;
        try {
            conn = Features.getDBConnection(Features.dbName);
            sql = "DELETE FROM customer WHERE phone=?;";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, phone);
            found = pstmt.executeUpdate();

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

    public List<Customer> customersLinkedListFromResultSet() {
        LinkedList<Customer> cusList = new LinkedList<>();
        Customer tempCus;
        try {
            conn = Features.getDBConnection(Features.dbName);

            sql = "SELECT * FROM customer;";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()) {

                name = rs.getString("name");
                address = rs.getString("address");
                phone = rs.getString("phone");

                tempCus = new Customer(name, address, phone);
                cusList.add(tempCus);
                // System.out.println(tempCus);
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
        return cusList;
    }

    public DefaultTableModel customerTableModel(List<Customer> cusList) {
        DefaultTableModel model;

        //-----------vec implementation-------------------
        Vector<String> column = new Vector<>();
        column.add("Customer's Name");
        column.add("Address");
        column.add("Phone Number");

        Vector<Vector<String>> vec2D = new Vector<>();
        for (Customer tempCus : cusList) {
            Vector<String> vecRow = new Vector<>();
            vecRow.add(tempCus.name);
            vecRow.add(tempCus.address);
            vecRow.add(tempCus.phone);
            // System.out.println(vecRow);
            vec2D.add(vecRow);
        }
        //System.out.println(vec2D);
        model = new DefaultTableModel(vec2D, column);
        return model;
    }

    public Customer searchCustomerByPhone(String phone) {
        Customer tempCus = null;

        try {
            conn = Features.getDBConnection(Features.dbName);

            sql = "SELECT * FROM customer WHERE phone=?;";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, phone);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                String name = rs.getString(1);
                String add = rs.getString(2);
                String phne = rs.getString(3);
                tempCus = new Customer(name, add, phne);
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

        return tempCus;
    }

    
    
    
    
    
    //=============================Database Variables==============================
    Connection conn = null;
    String sql = "";
  
    PreparedStatement pstmt = null;
    Statement stmt = null;
    ResultSet rs = null;

    Inventory inventory = new Inventory();
}
