

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.event.TableModelListener;
import javax.swing.plaf.basic.BasicSplitPaneUI;
import javax.swing.plaf.basic.BasicSplitPaneUI.BasicVerticalLayoutManager;
import javax.swing.plaf.basic.BasicTabbedPaneUI;
import javax.swing.table.TableModel;
import pos.Inventory;
import pos.Product;

/**
 * @author Mir Ferdous
 */
public class tableTest1 extends JFrame {

    public tableTest1() {
        init();
        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setResizable(true);
        setLayout(new GridBagLayout());

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void init() {

        JTable jTable = new JTable(data, columHead);
        add(jTable);
        JScrollPane jScrollPane = new JScrollPane(jTable);
        add(jScrollPane);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new FlowLayout());
        add(jPanel);

        JButton jButton = new JButton("Add to Cart");
        jPanel.add(jButton);
        JButton jButton2 = new JButton("Show");
        jPanel.add(jButton2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(39, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton)
                                        .addComponent(jButton2))
                                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jButton)
                                .addGap(21, 21, 21)
                                .addComponent(jButton2)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane)
                                        .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }

    public static void main(String[] args) {
        tableTest1 jtableTest1 = new tableTest1();
    }

    
    
    
    
    //********************Table Data***********************************
    String columHead[] = {"id", "name", "price", "cost", "quantity", "category"};
    Object[][] data = new Object[50][columHead.length];

    {
        LinkedList<Product> ll = new LinkedList<>();
        ll = (LinkedList<Product>) new Inventory().inventoryLinkedListFromResultSet();
        
        
        
        int a = 0;
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < columHead.length; j++) {
                data[i][j] = a;
                a++;
            }
            a = 0;
        }
    }
}
