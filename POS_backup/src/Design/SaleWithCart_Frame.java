package Design;

import pos.Product;
import pos.Inventory;
import pos.Features;
import javax.swing.ImageIcon;
import javax.swing.RowSorter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class SaleWithCart_Frame extends javax.swing.JFrame {

    public static Product prdtTemp;   //used in product searched Windows

    Inventory inventory = new Inventory();
    DefaultTableModel model = inventory.inventoryTableModel(inventory.inventoryLinkedListFromResultSet());

    public SaleWithCart_Frame() {
        initComponents();
        appIconSet();
        init();
    }

    public void appIconSet() {
        setIconImage(new ImageIcon(getClass().getResource("/pic/icon1.PNG")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableInventory = new javax.swing.JTable();
        jButtonAddToCart = new javax.swing.JButton();
        jButtonShowCart = new javax.swing.JButton();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jButtonOldCstmr = new javax.swing.JButton();
        jButtonNewCstmr = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldID_Prdt = new javax.swing.JTextField();
        jButtonSearchPrdt = new javax.swing.JButton();

        setTitle("INVENTORY");
        setMinimumSize(new java.awt.Dimension(1024, 710));
        getContentPane().setLayout(null);

        jLabelTitle.setFont(new java.awt.Font("Arista 2.0 Light", 1, 24)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(235, 220, 178));
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("Available Products");
        jLabelTitle.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(jLabelTitle);
        jLabelTitle.setBounds(-10, 150, 1010, 40);

        jTableInventory.setBackground(new java.awt.Color(99, 99, 101));
        jTableInventory.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTableInventory.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTableInventory.setForeground(new java.awt.Color(255, 255, 255));
        jTableInventory.setModel(model);
        jTableInventory.setFocusable(false);
        jTableInventory.setOpaque(false);
        jTableInventory.setSelectionBackground(Features.theme.colorBck);
        jTableInventory.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableInventory.setShowVerticalLines(false);
        jScrollPane1.setViewportView(jTableInventory);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 210, 960, 410);

        jButtonAddToCart.setBackground(Features.theme.colorBtn);
        jButtonAddToCart.setFont(new java.awt.Font("Arista 2.0 Light", 1, 16)); // NOI18N
        jButtonAddToCart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/addToCart.png"))); // NOI18N
        jButtonAddToCart.setText("Add To Cart");
        jButtonAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddToCartActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAddToCart);
        jButtonAddToCart.setBounds(770, 80, 196, 60);

        jButtonShowCart.setBackground(Features.theme.colorBtn);
        jButtonShowCart.setFont(new java.awt.Font("Arista 2.0 Light", 1, 16)); // NOI18N
        jButtonShowCart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/cart.png"))); // NOI18N
        jButtonShowCart.setText("Show Cart");
        jButtonShowCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowCartActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonShowCart);
        jButtonShowCart.setBounds(260, 30, 190, 75);

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createLineBorder(Features.theme.colorLabel));

        jButtonOldCstmr.setBackground(Features.theme.colorBtn);
        jButtonOldCstmr.setFont(new java.awt.Font("Arista 2.0 Light", 1, 14)); // NOI18N
        jButtonOldCstmr.setText("Old Customer");
        jButtonOldCstmr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOldCstmrActionPerformed(evt);
            }
        });

        jButtonNewCstmr.setBackground(Features.theme.colorBtn);
        jButtonNewCstmr.setFont(new java.awt.Font("Arista 2.0 Light", 1, 14)); // NOI18N
        jButtonNewCstmr.setText("New Customer");
        jButtonNewCstmr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewCstmrActionPerformed(evt);
            }
        });

        jLayeredPane2.setLayer(jButtonOldCstmr, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jButtonNewCstmr, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonNewCstmr)
                    .addComponent(jButtonOldCstmr))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLayeredPane2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonNewCstmr, jButtonOldCstmr});

        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jButtonNewCstmr, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonOldCstmr, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLayeredPane2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonNewCstmr, jButtonOldCstmr});

        getContentPane().add(jLayeredPane2);
        jLayeredPane2.setBounds(40, 20, 160, 90);

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createLineBorder(Features.theme.colorLabel));

        jLabel1.setFont(new java.awt.Font("Arista 2.0 Light", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(235, 220, 178));
        jLabel1.setText("Product ID:");
        jLabel1.setPreferredSize(new java.awt.Dimension(83, 24));

        jTextFieldID_Prdt.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldID_Prdt.setForeground(new java.awt.Color(45, 50, 65));
        jTextFieldID_Prdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldID_PrdtActionPerformed(evt);
            }
        });

        jButtonSearchPrdt.setBackground(Features.theme.colorBtn);
        jButtonSearchPrdt.setFont(new java.awt.Font("Arista 2.0 Light", 1, 16)); // NOI18N
        jButtonSearchPrdt.setText("Search");
        jButtonSearchPrdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchPrdtActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTextFieldID_Prdt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButtonSearchPrdt, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jTextFieldID_Prdt, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jButtonSearchPrdt, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldID_Prdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSearchPrdt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        getContentPane().add(jLayeredPane1);
        jLayeredPane1.setBounds(550, 20, 410, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddToCartActionPerformed

        try {
            String id_prdt = "";
            id_prdt = jTableInventory.getValueAt(jTableInventory.getSelectedRow(), 0).toString();

            new QuantityAsk_Frame(id_prdt);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonAddToCartActionPerformed

    private void jTextFieldID_PrdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldID_PrdtActionPerformed

    }//GEN-LAST:event_jTextFieldID_PrdtActionPerformed

    private void jButtonSearchPrdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchPrdtActionPerformed
        String id_prdt = jTextFieldID_Prdt.getText();
        try {
            if (!id_prdt.equals("")) {
                prdtTemp = inventory.searchProductByID(id_prdt);
                //System.out.println(Features.prdtTemp);
                jTextFieldID_Prdt.setText("");
                if (prdtTemp != null) {
                    new SearchedProductForm(prdtTemp);
                } else if (prdtTemp == null) {
                    new Warning_Frame("Product not Found");
                }
            } else {
                new Warning_Frame("Enter Product ID to Search");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonSearchPrdtActionPerformed

    private void jButtonShowCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowCartActionPerformed
        new Cart_Frame();
    }//GEN-LAST:event_jButtonShowCartActionPerformed

    private void jButtonOldCstmrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOldCstmrActionPerformed
        new SearchCustomer();
    }//GEN-LAST:event_jButtonOldCstmrActionPerformed

    private void jButtonNewCstmrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewCstmrActionPerformed
        new AddCustomer_Frame();
    }//GEN-LAST:event_jButtonNewCstmrActionPerformed

    public void init() {
        // Table settings

        jTableInventory.setSize(940, 580);
        jTableInventory.setColumnSelectionAllowed(false);
        jTableInventory.setDragEnabled(false);

        //sorting table
        RowSorter<TableModel> sorter = new TableRowSorter<TableModel>(model);
        jTableInventory.setRowSorter(sorter);
        jLabelTitle.setSize(1024, 60);
        setResizable(false);
        getContentPane().setBackground(Features.theme.colorBck);
        setTitle("Inventory");
        setSize(1024, 710);
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
            java.util.logging.Logger.getLogger(SaleWithCart_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SaleWithCart_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SaleWithCart_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SaleWithCart_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddToCart;
    private javax.swing.JButton jButtonNewCstmr;
    private javax.swing.JButton jButtonOldCstmr;
    private javax.swing.JButton jButtonSearchPrdt;
    private javax.swing.JButton jButtonShowCart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableInventory;
    private javax.swing.JTextField jTextFieldID_Prdt;
    // End of variables declaration//GEN-END:variables
}
