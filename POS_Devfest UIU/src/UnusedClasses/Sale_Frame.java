package UnusedClasses;

import pos.Product;
import pos.Inventory;
import pos.Customer;
import pos.Invoice;
import pos.Features;
import pos.AutoIncrementedValue;
import pos.Cart;
import Design.AddCustomer_Frame;
import Design.Invoice_Frame;
import Design.SaleWithCart_Frame;
import Design.SearchCustomer;
import Design.Warning_Frame;
import java.awt.Color;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Sale_Frame extends javax.swing.JFrame {

    Inventory inventory = new Inventory();
    Customer customer = new Customer();

//==================== Constructor ==============================
    public Sale_Frame() {
        initComponents();
        appIconSet();
        init();

    }
//==================== Methods ===================================

    public void appIconSet() {
        setIconImage(new ImageIcon(getClass().getResource("/pic/icon1.PNG")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAddToCart = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldQuantity = new javax.swing.JTextField();
        jLabelQuantity = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jButtonShowPrdt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaPrdt = new javax.swing.JTextArea();
        jButtonMakeInvoice = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jButtonOldCstmr = new javax.swing.JButton();
        jButtonNewCstmr = new javax.swing.JButton();
        jButtonShowPrdt1 = new javax.swing.JButton();

        setTitle("Sale");

        jButtonAddToCart.setBackground(Features.theme.colorBtn);
        jButtonAddToCart.setFont(new java.awt.Font("Arista 2.0 Light", 1, 14)); // NOI18N
        jButtonAddToCart.setText("Add to Cart");
        jButtonAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddToCartActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arista 2.0 Light", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(235, 220, 178));
        jLabel1.setText("Product ID:");

        jTextFieldQuantity.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldQuantity.setForeground(new java.awt.Color(45, 50, 65));

        jLabelQuantity.setFont(new java.awt.Font("Arista 2.0 Light", 1, 16)); // NOI18N
        jLabelQuantity.setForeground(new java.awt.Color(235, 220, 178));
        jLabelQuantity.setText("Quantity:");

        jTextFieldID.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldID.setForeground(new java.awt.Color(45, 50, 65));
        jTextFieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDActionPerformed(evt);
            }
        });

        jButtonShowPrdt.setBackground(Features.theme.colorBtn);
        jButtonShowPrdt.setFont(new java.awt.Font("Arista 2.0 Light", 1, 12)); // NOI18N
        jButtonShowPrdt.setText("Search Product");
        jButtonShowPrdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowPrdtActionPerformed(evt);
            }
        });

        jTextAreaPrdt.setEditable(false);
        jTextAreaPrdt.setBackground(new java.awt.Color(204, 204, 255));
        jTextAreaPrdt.setColumns(20);
        jTextAreaPrdt.setFont(new java.awt.Font("Dialog", 1, 19)); // NOI18N
        jTextAreaPrdt.setForeground(new java.awt.Color(45, 50, 65));
        jTextAreaPrdt.setRows(5);
        jTextAreaPrdt.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextAreaPrdt.setCaretColor(new java.awt.Color(153, 204, 255));
        jScrollPane1.setViewportView(jTextAreaPrdt);

        jButtonMakeInvoice.setBackground(Features.theme.colorBtn);
        jButtonMakeInvoice.setFont(new java.awt.Font("Arista 2.0 Light", 1, 14)); // NOI18N
        jButtonMakeInvoice.setText("Make Invoice");
        jButtonMakeInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMakeInvoiceActionPerformed(evt);
            }
        });

        jButtonClear.setBackground(Features.theme.colorBtn);
        jButtonClear.setFont(new java.awt.Font("Arista 2.0 Light", 1, 12)); // NOI18N
        jButtonClear.setText("Clear Product");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

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

        jButtonShowPrdt1.setBackground(Features.theme.colorBtn);
        jButtonShowPrdt1.setFont(new java.awt.Font("Arista 2.0 Light", 1, 12)); // NOI18N
        jButtonShowPrdt1.setText("Inventory");
        jButtonShowPrdt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowPrdt1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonMakeInvoice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonAddToCart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonNewCstmr)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                .addComponent(jButtonOldCstmr))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldID, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                    .addComponent(jTextFieldQuantity))))))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonShowPrdt, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonShowPrdt1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextFieldID, jTextFieldQuantity});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonNewCstmr, jButtonOldCstmr});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonClear, jButtonShowPrdt, jButtonShowPrdt1});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonShowPrdt)
                            .addComponent(jButtonClear)
                            .addComponent(jButtonShowPrdt1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelQuantity)
                            .addComponent(jTextFieldQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonNewCstmr, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonOldCstmr, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71)
                        .addComponent(jButtonAddToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonMakeInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTextFieldID, jTextFieldQuantity});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonNewCstmr, jButtonOldCstmr});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonClear, jButtonShowPrdt, jButtonShowPrdt1});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDActionPerformed

    }//GEN-LAST:event_jTextFieldIDActionPerformed

    private void jButtonShowPrdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowPrdtActionPerformed
        String id_prdt = jTextFieldID.getText();
        if (jTextAreaPrdt.getText().equals("")) {           //printing single entry
            Product prdtTemp = inventory.searchProductByID(id_prdt);

            if (prdtTemp.getQuantity() == null || prdtTemp.getQuantity() <= 0) {
                jTextAreaPrdt.append("Product Not Found");
            } else {
                jTextAreaPrdt.append(prdtTemp.productDisplay());
            }

        }
    }//GEN-LAST:event_jButtonShowPrdtActionPerformed

    private void jButtonAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddToCartActionPerformed

        String id = jTextFieldID.getText();
        Product prdtTemp = inventory.searchProductByID(id);
        Integer quantity = Integer.parseInt(jTextFieldQuantity.getText());

        prdtTemp.setQuantity(quantity);
        Cart.prdtList.add(prdtTemp);
        
        
        //============ clear fields after job done ==============
        jTextFieldID.setText("");
        jTextFieldQuantity.setText("");
        jTextAreaPrdt.setText("");
        

        //=========== option pane to show added to cart =============
        new Warning_Frame("Added To Cart");      
    }//GEN-LAST:event_jButtonAddToCartActionPerformed

    private void jButtonMakeInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMakeInvoiceActionPerformed
        setVisible(false);

        //======= Cart to Invoice ==========
        Cart.id_inv = AutoIncrementedValue.autoIncrementedValue("inv", "", "auto_invoice_id.dat");
        if (Cart.cstmr == null) {
            Cart.cstmr = new Customer("", "", "");//for making string fields null to escaping error in DB entry
        }
        //System.out.println(Cart.cstmr);
        Invoice invoice = new Invoice(Cart.id_inv, Cart.prdtList, new GregorianCalendar(), Cart.cstmr);
        Cart.total = invoice.getTotal();
        Cart.time = invoice.time;

        //====== DB Update for Invoice ===========
        invoice.inventoryUpdateAfterInvoice((LinkedList<Product>) Cart.prdtList);
        invoice.addSalesLogToDB(invoice);
        new Invoice_Frame();

        //======== Empty Cart ============
        Cart.prdtList.clear();
        Cart.id_inv = null;
        Cart.cstmr = null;
        Cart.sPer = null;
        Cart.total = 0;
        Cart.time = null;
    }//GEN-LAST:event_jButtonMakeInvoiceActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        jTextAreaPrdt.setText(null);
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonNewCstmrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewCstmrActionPerformed
        new AddCustomer_Frame();
    }//GEN-LAST:event_jButtonNewCstmrActionPerformed

    private void jButtonOldCstmrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOldCstmrActionPerformed
        new SearchCustomer();
    }//GEN-LAST:event_jButtonOldCstmrActionPerformed

    private void jButtonShowPrdt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowPrdt1ActionPerformed
        new SaleWithCart_Frame();
    }//GEN-LAST:event_jButtonShowPrdt1ActionPerformed

    public void init() {
        getContentPane().setBackground(Features.theme.colorBck);       
        setLocationRelativeTo(null);
        // setVisible(true);

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
            java.util.logging.Logger.getLogger(Sale_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sale_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sale_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sale_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddToCart;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonMakeInvoice;
    private javax.swing.JButton jButtonNewCstmr;
    private javax.swing.JButton jButtonOldCstmr;
    private javax.swing.JButton jButtonShowPrdt;
    private javax.swing.JButton jButtonShowPrdt1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelQuantity;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaPrdt;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldQuantity;
    // End of variables declaration//GEN-END:variables
}
