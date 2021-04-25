package draftForTestingClasses;


import java.awt.Color;
import java.util.LinkedList;
import javax.swing.*;
import pos.Product;

public class TArea {

    JTextArea area;
    JFrame f;

    TArea() {
        f = new JFrame();
        
        
        
        //*****************Product add******************
        LinkedList<Product> prdtList = new LinkedList<>();

        prdtList.add(new Product("p2", "soap", 202, 180, 51, "general"));
        prdtList.add(new Product("p2", "soap", 202, 180, 51, "general"));
        prdtList.add(new Product("p2", "soap", 202, 180, 51, "general"));
        prdtList.add(new Product("p2", "soap", 202, 180, 51, "general"));

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < prdtList.size(); i++) {
            sb.append(prdtList.get(i));
            sb.append("\n");
        }
        
        
area = new JTextArea(prdtList.toString());
        
        
        //area = new JTextArea(sb.toString());
        area.setBounds(10, 30, 600, 300);

        //area.setBackground(Color.black);  
        //area.setForeground(Color.white);  
        area.setEditable(false);

        f.add(area);

        
        
        

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new TArea();
    }
}
