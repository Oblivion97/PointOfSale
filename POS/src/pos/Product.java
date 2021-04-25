package pos;

import java.io.*;
import java.util.Formatter;
import java.util.Vector;

public class Product {

    public String id;                  //mandatory
    public String name;                  //mandatory
    public Integer price;                  //mandatory
    public Integer cost;                  //mandatory
    private Integer quantity;       //mandatory
    public String category;

    //========================= Methods ========================
    public static void addCatagory(String category) {
        File file = null;
        PrintWriter pw = null;
        try {
            file = new File("categoryData.dat");
            pw = new PrintWriter(new FileOutputStream(file, true));
            if (!file.exists()) {
                file.createNewFile();
            }
            pw.println(category);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            pw.close();
        }
    }

    public static boolean delCategory(String category) {
        boolean found = false;
        FileReader fr = null;
        BufferedReader br = null;
        File f1 = null;
        Vector<String> categoryList = null;
        try {
            f1 = new File("categoryData.dat");
            fr = new FileReader(f1);
            br = new BufferedReader(fr);
            categoryList = new Vector<>();

            String data = br.readLine();
            while (data != null) {
                categoryList.add(data);
                data = br.readLine();
            }
            //System.out.println(categoryList);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                fr.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        found = categoryList.remove(category);
        f1.delete();
        for (String temp : categoryList) {
            addCatagory(temp);
        }

        return found;
    }

    //================= display ==============
    public String rowWiseToString() {
        int totalPrice = price * quantity;
        Formatter formatter = new Formatter();
        String s = String.format("%s\t\t%s\t\t%s\t\t%s\n", name, price, quantity, totalPrice);

        return s;
    }

    @Override
    public String toString() {
        return "Product ID: " + id
                + " Name: " + name
                + " Price: " + price
                + " Quantity: " + quantity
                + " Category: " + category;
    }

    public String productDisplay() {
        return "Product ID: " + id
                + "\n\nProduct Name: " + name
                + "\n\nPrice: " + price
                + "\n\nQuantity: " + quantity
                + "\n\nCategory: " + category;
    }

    public void editPrice(Integer price) {
        this.price = price;
    }

    //=========================Get&Set========================
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    //=========================constructor========================

    public Product() {
    }
   
    
    public Product(String id, String name, Integer price, Integer cost, Integer quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.cost = cost;
        this.quantity = quantity;
    }

    public Product(String id, String name, Integer price, Integer cost, Integer quantity, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.cost = cost;
        this.quantity = quantity;
        this.category = category;
    }

}
