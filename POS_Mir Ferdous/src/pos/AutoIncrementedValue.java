package pos;

import java.io.*;

public class AutoIncrementedValue {

    public static String autoIncrementedValue(String prefix, String suffix, String fileName) {
        int value;
        String id = "";
        FileReader file = null;
        PrintWriter p=null;
        BufferedReader b = null;
        try {
           //*************read***************
            file = new FileReader(fileName);
            b = new BufferedReader(file);
            id = b.readLine();
            
            //***********increament***************
            value = Integer.parseInt(id);
            value++;
            
            //**********write************
             p=new PrintWriter(new File(fileName));
            p.write(Integer.toString(value));
            p.flush();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                b.close();
                p.close();
                file.close();
                
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return prefix+id+suffix;
    }

    public static boolean ResetAutoIncrementedValue(int resetPoint , String fileName/*to what value u want to reset*/) {
        boolean success = false;
        int value;
        String id = "";
        FileReader file = null;
        PrintWriter p=null;
        BufferedReader b = null;
        try {
            value = resetPoint;

            //**********write************
             p=new PrintWriter(new File(fileName));
            p.write(Integer.toString(value));
            p.flush();
            
             //*************read check success or not***************
            file = new FileReader(fileName);
            b = new BufferedReader(file);
            id = b.readLine();
             value = Integer.parseInt(id);
            if (value == resetPoint) {
                success = true;
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                b.close();
                p.close();
                file.close();
                
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return success;
    }

}
