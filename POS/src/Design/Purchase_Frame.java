package Design;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import pos.AutoIncrementedValue;
import pos.Features;
import pos.Inventory;
import pos.Product;
import pos.Purchase;

public class Purchase_Frame extends javax.swing.JFrame {

    public Purchase_Frame() {
        initComponents();
        appIconSet();
        init();

    }

    public void init() {
        getContentPane().setBackground(Features.theme.colorBck);
        setLocationRelativeTo(null);
        setVisible(true);

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
            java.util.logging.Logger.getLogger(Purchase_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Purchase_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Purchase_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Purchase_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
    }

    public void appIconSet() {
        setIconImage(new ImageIcon(getClass().getResource("/pic/icon1.PNG")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonPurchase = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jTextFieldQuantity = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldCategory = new javax.swing.JTextField();
        jTextFieldPrice = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldID_Prdt = new javax.swing.JTextField();
        jTextFieldCost = new javax.swing.JTextField();
        jTextFieldName = new javax.swing.JTextField();

        setTitle("Purchase");

        jButtonPurchase.setBackground(Features.theme.colorBtn);
        jButtonPurchase.setFont(new java.awt.Font("Arista 2.0 Light", 1, 14)); // NOI18N
        jButtonPurchase.setText("Purchase");
        jButtonPurchase.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jButtonPurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPurchaseActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arista 2.0 Light", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(235, 220, 178));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add New Products");
        jLabel1.setAutoscrolls(true);
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTextFieldQuantity.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldQuantity.setForeground(new java.awt.Color(42, 50, 65));

        jLabel3.setFont(new java.awt.Font("Arista 2.0 Light", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(235, 220, 178));
        jLabel3.setText("Name:");

        jLabel4.setFont(new java.awt.Font("Arista 2.0 Light", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(235, 220, 178));
        jLabel4.setText("Price:");

        jLabel6.setFont(new java.awt.Font("Arista 2.0 Light", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(235, 220, 178));
        jLabel6.setText("Quantity:");

        jTextFieldCategory.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldCategory.setForeground(new java.awt.Color(42, 50, 65));

        jTextFieldPrice.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldPrice.setForeground(new java.awt.Color(42, 50, 65));

        jLabel2.setFont(new java.awt.Font("Arista 2.0 Light", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(235, 220, 178));
        jLabel2.setText("Product ID:");

        jLabel7.setFont(new java.awt.Font("Arista 2.0 Light", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(235, 220, 178));
        jLabel7.setText("Category:");

        jLabel5.setFont(new java.awt.Font("Arista 2.0 Light", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(235, 220, 178));
        jLabel5.setText("Cost:");

        jTextFieldID_Prdt.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldID_Prdt.setForeground(new java.awt.Color(42, 50, 65));

        jTextFieldCost.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldCost.setForeground(new java.awt.Color(42, 50, 65));

        jTextFieldName.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldName.setForeground(new java.awt.Color(42, 50, 65));

        jLayeredPane1.setLayer(jTextFieldQuantity, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTextFieldCategory, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTextFieldPrice, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTextFieldID_Prdt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTextFieldCost, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTextFieldName, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(99, 99, 99)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCost, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldID_Prdt, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLayeredPane1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextFieldCategory, jTextFieldCost, jTextFieldID_Prdt, jTextFieldName, jTextFieldPrice, jTextFieldQuantity});

        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldID_Prdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLayeredPane1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTextFieldCategory, jTextFieldCost, jTextFieldID_Prdt, jTextFieldName, jTextFieldPrice, jTextFieldQuantity});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonPurchase)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPurchaseActionPerformed

        Inventory inventory = new Inventory();
        String id_prdt = jTextFieldID_Prdt.getText(),
                name = jTextFieldName.getText(),
                category = jTextFieldCategory.getText();
        int price = 0, cost = 0, quantity = 0;
        Product tempP2 = null;

        try {
            if (id_prdt.equals("") && jTextFieldQuantity.getText().equals("")) {
                new Warning_Frame("Fillup Product ID Field");
            } else {
                //====== checking if product already exits or not ========
                if (inventory.searchProductByIDboolean(id_prdt)) {
                    /**
                     * if exists getting info(name,price,cost,category) from DB
                     * not from form
                     */
                    setVisible(false);
                    Product tempP1 = inventory.searchProductByID(id_prdt);
                    name = tempP1.name;
                    price = tempP1.price;
                    cost = tempP1.cost;
                    category = tempP1.category;
                    if (!jTextFieldQuantity.getText().equals("")) {
                        quantity = Integer.parseInt(jTextFieldQuantity.getText());
                         tempP2 = new Product(id_prdt, name, price, cost, quantity, category);
                    }

                } else {
                    /**
                     * if not exists getting all info from form
                     */

                    if (!jTextFieldID_Prdt.getText().equals("")
                            && !jTextFieldName.getText().equals("")
                            && !jTextFieldPrice.getText().equals("")
                            && !jTextFieldCost.getText().equals("")
                            && !jTextFieldQuantity.getText().equals("")
                            && !jTextFieldCategory.getText().equals("")) {
                        setVisible(false);
                        name = jTextFieldName.getText();
                        price = Integer.parseInt(jTextFieldPrice.getText());
                        cost = Integer.parseInt(jTextFieldCost.getText());
                        quantity = Integer.parseInt(jTextFieldQuantity.getText());
                        category = jTextFieldCategory.getText();
                        tempP2 = new Product(id_prdt, name, price, cost, quantity, category);
                    } else {
                        new Warning_Frame("Fillup All the Fields");
                    }
                }

                //===== creating temporary product from form =======
                // ==================== update DB ==================
                String purID = AutoIncrementedValue.autoIncrementedValue("prchs", "", "auto_purchase_id.dat");
                Purchase purchase = new Purchase(purID, tempP2, (tempP2.cost * tempP2.getQuantity()), new GregorianCalendar());
                purchase.inventoryUpdateAfterPurchase();
                purchase.addPurchaseLogtoDB();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        //============ clear fields after job done ==============
        jTextFieldID_Prdt.setText("");
        jTextFieldName.setText("");
        jTextFieldPrice.setText("");
        jTextFieldCost.setText("");
        jTextFieldQuantity.setText("");
        jTextFieldCategory.setText("");
    }//GEN-LAST:event_jButtonPurchaseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPurchase;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JTextField jTextFieldCategory;
    private javax.swing.JTextField jTextFieldCost;
    private javax.swing.JTextField jTextFieldID_Prdt;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPrice;
    private javax.swing.JTextField jTextFieldQuantity;
    // End of variables declaration//GEN-END:variables
}
