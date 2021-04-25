/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUITest;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.RowSorter;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import pos.Cart;
import pos.Features;
import pos.Inventory;
import pos.Product;

/**
 *
 * @author Mir Ferdous
 */
public class tableoutofboundtest extends javax.swing.JFrame {

    Inventory inventory = new Inventory();
    DefaultTableModel modelSearchRes;

    public tableoutofboundtest() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jButtonAddToCart = new javax.swing.JButton();
        jLabelQuantity = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonSearchPrdt = new javax.swing.JButton();
        jTextFieldID_Prdt = new javax.swing.JTextField();
        jTextFieldQuantity = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableInventory = new javax.swing.JTable();
        Print = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonAddToCart.setBackground(Features.theme.colorBtn);
        jButtonAddToCart.setFont(new java.awt.Font("Arista 2.0 Light", 1, 16)); // NOI18N
        jButtonAddToCart.setForeground(Features.theme.colorLabel);
        jButtonAddToCart.setText("Add To Cart");
        jButtonAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddToCartActionPerformed(evt);
            }
        });

        jLabelQuantity.setFont(new java.awt.Font("Arista 2.0 Light", 1, 16)); // NOI18N
        jLabelQuantity.setForeground(new java.awt.Color(235, 220, 178));
        jLabelQuantity.setText("Quantity:");

        jLabel1.setFont(new java.awt.Font("Arista 2.0 Light", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(235, 220, 178));
        jLabel1.setText("Product ID:");

        jButtonSearchPrdt.setBackground(Features.theme.colorBtn);
        jButtonSearchPrdt.setFont(new java.awt.Font("Arista 2.0 Light", 1, 16)); // NOI18N
        jButtonSearchPrdt.setForeground(Features.theme.colorLabel);
        jButtonSearchPrdt.setText("Search");
        jButtonSearchPrdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchPrdtActionPerformed(evt);
            }
        });

        jTextFieldID_Prdt.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldID_Prdt.setForeground(new java.awt.Color(45, 50, 65));
        jTextFieldID_Prdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldID_PrdtActionPerformed(evt);
            }
        });

        jTextFieldQuantity.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldQuantity.setForeground(new java.awt.Color(45, 50, 65));
        jTextFieldQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantityActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(jButtonAddToCart, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabelQuantity, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButtonSearchPrdt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTextFieldID_Prdt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTextFieldQuantity, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldID_Prdt, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSearchPrdt, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabelQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jTextFieldQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jButtonAddToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldID_Prdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabelQuantity))
                            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonAddToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jButtonSearchPrdt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jTableInventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"fsafd","fsafd", "fsafd", "fsafd"},
                {"fsafd", "fsafd", "fsafd","fsafd"},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableInventory);

        Print.setText("Print");
        Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 917, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Print)
                .addGap(131, 131, 131))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(Print)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddToCartActionPerformed
        String id_prdt = "";
        int quantity = 0;

        if (!jTextFieldQuantity.getText().equals("")) {
            quantity = Integer.parseInt(jTextFieldQuantity.getText());
        }

        try {
            id_prdt = jTableInventory.getValueAt(jTableInventory.getSelectedRow(), 0).toString();
            // System.out.println(id_prdt);

            if (!id_prdt.equals("")) {
                if (quantity >= 0) {
                    Product prdtTemp = inventory.searchProductByID(id_prdt);
                    prdtTemp.setQuantity(quantity);
                    Cart.prdtList.add(prdtTemp);
                    setVisible(false);
                } else {
                    // popup dialog
                    UIManager UI = new UIManager();
                    UI.put("OptionPane.background", Features.theme.colorBck);
                    UI.put("Panel.background", Features.theme.colorBck);
                    JOptionPane.showMessageDialog(this, "Please Set Quantity");
                }
            } else {
                // popup dialog
                UIManager UI = new UIManager();
                UI.put("OptionPane.background", Features.theme.colorBck);
                UI.put("Panel.background", Features.theme.colorBck);
                JOptionPane.showMessageDialog(this, "Please Select a Product");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
        }

    }//GEN-LAST:event_jButtonAddToCartActionPerformed

    private void jTextFieldQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldQuantityActionPerformed

    private void jTextFieldID_PrdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldID_PrdtActionPerformed

    }//GEN-LAST:event_jTextFieldID_PrdtActionPerformed

    private void jButtonSearchPrdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchPrdtActionPerformed
        String id_prdt = jTextFieldID_Prdt.getText();
        Product prdtTemp = inventory.searchProductByID(id_prdt);
        //row
        Vector<String> rowVec = new Vector<>();
        rowVec.add(prdtTemp.id);
        rowVec.add(prdtTemp.name);
        rowVec.add(Integer.toString(prdtTemp.price));
        rowVec.add(Integer.toString(prdtTemp.cost));
        rowVec.add(Integer.toString(prdtTemp.getQuantity()));
        rowVec.add(prdtTemp.category);

        Vector<Vector<String>> vec2D = new Vector<>();
        vec2D.add(rowVec);

        // colums
        Vector<String> column = new Vector<>();
        column.add("ID");
        column.add("Name of Product");
        column.add("Sell Price");
        column.add("Cost Price");
        column.add("Quantity");
        column.add("Catagory");

        modelSearchRes = new DefaultTableModel(vec2D, column);
        //model = modelSearchRes;
        jTableInventory.setModel(modelSearchRes);
        jTableInventory.repaint();

        // excess
        //        if (prdtTemp.getQuantity() == null || prdtTemp.getQuantity() <= 0) {
        //            System.out.println("Product Not Found");
        //        } else {
        //            System.out.println(prdtTemp.productDisplay());
        //        }
    }//GEN-LAST:event_jButtonSearchPrdtActionPerformed

    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintActionPerformed
        BufferedImage image = null;
        try {
            image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
        } catch (AWTException ex) {
            Logger.getLogger(tableoutofboundtest.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ImageIO.write(image, "png", new File("/screenshot.png"));
        } catch (IOException ex) {
            Logger.getLogger(tableoutofboundtest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_PrintActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tableoutofboundtest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tableoutofboundtest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tableoutofboundtest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tableoutofboundtest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tableoutofboundtest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Print;
    private javax.swing.JButton jButtonAddToCart;
    private javax.swing.JButton jButtonSearchPrdt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelQuantity;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableInventory;
    private javax.swing.JTextField jTextFieldID_Prdt;
    private javax.swing.JTextField jTextFieldQuantity;
    // End of variables declaration//GEN-END:variables
}