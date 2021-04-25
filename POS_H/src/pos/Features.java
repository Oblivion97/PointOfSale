package pos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

public class Features {

    public static Theme theme = new Theme().getTheme();      // new Theme();        
    public static String dbName = Features.getDataBaseInfoToFile();
    public static String dbSoftware = "jdbc:sqlite:";

    //===================== temp variables to transfer value from frame to frame  =======================
    //public static String id_prdtTempSelected;   //when product is selectd from inventory to buy
    //public static String id_prdtTempSearched;   //when product Searched to buy
    //public static Product prdtTemp;

    //============================= Database Methods ==============================
    public static Connection getDBConnection(String dbName) {
        String db_url = Features.dbSoftware + Features.dbName;
        Connection conn = null;
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(db_url);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    //===================== Database Info(Metadata) Saving  =================================
    public static void saveDataBaseInfoToFile(String dbName) {
        File f = null;
        PrintWriter pw = null;
        try {
            f = new File("dataBaseInfo.dat");
            pw = new PrintWriter(f);
            pw.println(dbName);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            pw.close();
        }
    }

    public static String getDataBaseInfoToFile() {
        String dbName = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader("dataBaseInfo.dat");
            br = new BufferedReader(fr);
            dbName = br.readLine();
            //System.out.println(dbName);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                br.close();
                fr.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return dbName;
    }
    
     public static boolean removeProductFromList(List<Product> tList, Object item) {
        boolean removed = false;
        int index = 0;

        for (int i = 0; i < tList.size(); i++) {
            if (tList.get(i).equals(item)) {
                index = i;
            }
        }
        tList.remove(index);

        return removed;
    }

    //================== DATE Time Related Methods ========================    
//    public static Calendar stringToCalendar(String timeS) {
//        Calendar cal = null;
//
//        DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
//        Date date;
//        try {
//            date = df.parse(timeS);
//            cal = new GregorianCalendar();
//            cal.setTime(date);
//            //System.out.println(df.format(date));
//
//        } catch (ParseException ex) {
//            ex.printStackTrace();
//        }
//        return cal;
//    }
//
//    public static String calendarToString(Calendar cal) {
//        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
//        String time = sdf.format(cal.getTime());
//        return time;
//    }
}
