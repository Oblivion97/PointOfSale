package pos;

import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class Cart {

    public static String id_inv;                                        //mandatory
    public static List<Product> prdtList = new LinkedList<>();          //mandatory
    public static int total;                                            //mandatory
    public static Calendar time;                                        //mandatory
    public static Customer cstmr;
    public static SalesPerson sPer;

    //==================== Methods =========================
    public static DefaultTableModel cartToTableModel() {
        DefaultTableModel model = null;
      
        Vector<String> column = new Vector<>();
        column.add("ProductName");
        column.add("Rate");
        column.add("Quantity");
        column.add("Price");

        Vector<Vector<String>> vec2D = new Vector<>();
        for (Product tempP : prdtList) {
            Vector<String> vecRow = new Vector<>();
            vecRow.add(tempP.name);
            vecRow.add(Integer.toString(tempP.price));
            vecRow.add(Integer.toString(tempP.getQuantity()));
            int totalP = tempP.price * tempP.getQuantity();
            vecRow.add(Integer.toString(totalP));            
            vec2D.add(vecRow);
        }

        model = new DefaultTableModel(vec2D, column);
        return model;
    }

    public void cartTotalBill() {
        Integer total = 0;
        for (Product x : this.prdtList) {
            total += x.price * x.getQuantity();
        }
        this.total = total;
    }
}
