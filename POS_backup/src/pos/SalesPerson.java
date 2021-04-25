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

public class SalesPerson {

    String name;
    String address;
    String phone;
    int salary;

//*******************Method***********************************
    public void addSalesPerson() {
        try {
            conn = Features.getDBConnection(Features.dbName);
            sql = "INSERT INTO salesperson VALUES ( ?, ?, ? ,?);";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setString(2, address);
            pstmt.setString(3, phone);
            pstmt.setInt(4, salary);
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
        //System.out.println("Sales Person Added successfully");
    }

    public int deleteSalesPerson(String phone) {
        int found = 0;
        try {
            conn = Features.getDBConnection(Features.dbName);
            sql = "DELETE FROM salesperson WHERE phone=?;";
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

    public List<SalesPerson> salesPersonLinkedListFromResultSet() {
        LinkedList<SalesPerson> salePList = new LinkedList<>();
        SalesPerson tempSaleP;
        try {
            conn = Features.getDBConnection(Features.dbName);

            sql = "SELECT * FROM salesperson;";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                name = rs.getString("name");
                address = rs.getString("address");
                phone = rs.getString("phone");
                salary = Integer.parseInt(rs.getString("salary"));

                tempSaleP = new SalesPerson(name, address, phone, salary);
                salePList.add(tempSaleP);
                //System.out.println(tempSaleP);
            }
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return salePList;
    }

    public DefaultTableModel salesPersonTableModel(List<SalesPerson> spList) {
        DefaultTableModel model;

        //-----------vec implementation-------------------
        Vector<String> column = new Vector<>();
        column.add("Customer's Name");
        column.add("Address");
        column.add("Phone Number");
        column.add("Salary");

        Vector<Vector<String>> vec2D = new Vector<>();
        for (SalesPerson tempSP : spList) {
            Vector<String> vecRow = new Vector<>();
            vecRow.add(tempSP.name);
            vecRow.add(tempSP.address);
            vecRow.add(tempSP.phone);
            vecRow.add(Integer.toString(tempSP.salary));
            vec2D.add(vecRow);
        }

        model = new DefaultTableModel(vec2D, column);
        return model;
    }

    //=========================constructor========================
    public SalesPerson() {
    }

    public SalesPerson(String name, String phone, int salary) {
        this.name = name;
        this.phone = phone;
        this.salary = salary;
        // addSalesPerson();
    }

    public SalesPerson(String name, String address, String phone, int salary) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.salary = salary;
        //  addSalesPerson();
    }

//=============================Database Variables==============================
    Connection conn = null;
    String sql = "";
    PreparedStatement pstmt = null;
    Statement stmt = null;
    ResultSet rs = null;

    Inventory inventory = new Inventory();
}
