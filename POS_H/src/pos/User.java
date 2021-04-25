package pos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class User {

    private String user;
    private String pass;

    //*******************Methods*****************************
    public boolean login() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        String u = "", p = "-";
        boolean match = false;
        try {
            conn = Features.getDBConnection(Features.dbName);

            sql = "select * from userTable where user=?;";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, this.user);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                u = rs.getString("user");
                p = rs.getString("pass");
            }

            if (pass.equals(p)) {
                match = true;
            }

            pstmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return match;
    }

    public static void addUserToDB(String user, String pass) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = Features.getDBConnection(Features.dbName);
            sql = "INSERT INTO userTable VALUES ( ?, ?);";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, user);
            pstmt.setString(2, pass);
            pstmt.executeUpdate();

        } catch (Exception e) {
        } finally {
            try {
                pstmt.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static int deleteUserDB(String username) {
        int found = 0;
        try {
            conn = Features.getDBConnection(Features.dbName);
            sql = "DELETE FROM userTable WHERE user=?;";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, username);
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

    public static int changePass(String user, String oPass, String nPass) {
        int found = 0;
        Connection conn = null;
        PreparedStatement pstmt = null;
        String sql;
        try {
            conn = Features.getDBConnection(Features.dbName);
            sql = "UPDATE userTable SET pass=? WHERE user=?;";

            User uTemp = User.searchUser(user);
            if (uTemp != null && oPass.equals( uTemp.getPass())) {

                pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, nPass);
                pstmt.setString(2, user);
                found = pstmt.executeUpdate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return found;
    }

    public static User searchUser(String user) {
        User tempUser = null;

        try {
            conn = Features.getDBConnection(Features.dbName);
            sql = "SELECT * FROM userTable WHERE user=?;";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, user);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                String userT = rs.getString(1);
                String pass = rs.getString(2);
                tempUser = new User(userT, pass);
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
        return tempUser;
    }

    public static Vector<String> showUserList() {
        Vector<String> uList = new Vector<>();
        try {
            conn = Features.getDBConnection(Features.dbName);
            sql = "SELECT user FROM userTable;";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                String user = rs.getString(1);
                uList.add(user);
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

        return uList;
    }

    @Override
    public String toString() {
        return "User{" + "user=" + user + ", pass=" + pass + '}';
    }

    
    
    //************************Construc && get set******************************
    public User(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    //============================= Database Variables ==============================
    static Connection conn;
    static String sql;
    static PreparedStatement pstmt = null;
    static ResultSet rs;

}
