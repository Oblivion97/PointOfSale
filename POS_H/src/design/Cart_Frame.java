package design;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.RowSorter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import pos.AutoIncrementedValue;
import pos.Cart;
import pos.Customer;
import pos.Features;
import pos.Inventory;
import pos.Invoice;
import pos.Product;

public class Cart_Frame extends javax.swing.JFrame {

    Inventory inventory = new Inventory();
    DefaultTableModel model = Cart.cartToTableModel();

    public Cart_Frame() {
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
        jButtonMakeInvoice = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCart = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jButtonMakeInvoice1 = new javax.swing.JButton();

        setTitle("Your Cart");
        setMinimumSize(new java.awt.Dimension(1024, 710));

        jLabelTitle.setFont(new java.awt.Font("Arista 2.0 Light", 1, 36)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(235, 220, 178));
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/cart.png"))); // NOI18N
        jLabelTitle.setText("YOUR CART");
        jLabelTitle.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButtonMakeInvoice.setBackground(Features.theme.colorBtn);
        jButtonMakeInvoice.setFont(new java.awt.Font("Arista 2.0 Light", 1, 16)); // NOI18N
        jButtonMakeInvoice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/make_invoice.png"))); // NOI18N
        jButtonMakeInvoice.setText("Make Invoice");
        jButtonMakeInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMakeInvoiceActionPerformed(evt);
            }
        });

        jTableCart.setBackground(new java.awt.Color(102, 102, 102));
        jTableCart.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTableCart.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTableCart.setForeground(new java.awt.Color(255, 255, 255));
        jTableCart.setModel(model);
        jTableCart.setFocusable(false);
        jTableCart.setOpaque(false);
        jTableCart.setShowVerticalLines(false);
        jScrollPane1.setViewportView(jTableCart);

        jLabel3.setBackground(new java.awt.Color(235, 220, 178));
        jLabel3.setOpaque(true);

        jButtonMakeInvoice1.setBackground(Features.theme.colorBtn);
        jButtonMakeInvoice1.setFont(new java.awt.Font("Arista 2.0 Light", 1, 16)); // NOI18N
        jButtonMakeInvoice1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/removeFromCart.png"))); // NOI18N
        jButtonMakeInvoice1.setText("Remove");
        jButtonMakeInvoice1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMakeInvoice1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 1012, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonMakeInvoice1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonMakeInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonMakeInvoice1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMakeInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void jButtonMakeInvoice1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMakeInvoice1ActionPerformed
        try {
            int selectedRow = jTableCart.getSelectedRow();
            String id_prdt = jTableCart.getValueAt(jTableCart.getSelectedRow(), 0).toString();            
            Product tempPrdt = new Inventory().searchProductByID(id_prdt);

            if (selectedRow != -1) {
                model.removeRow(selectedRow);
                Features.removeProductFromList(Cart.prdtList, tempPrdt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_jButtonMakeInvoice1ActionPerformed

    public void init() {

        jTableCart.setSize(940, 580);
        jTableCart.setColumnSelectionAllowed(false);
        jTableCart.setDragEnabled(false);
        //sorting table
        RowSorter<TableModel> sorter = new TableRowSorter<TableModel>(model);
        jTableCart.setRowSorter(sorter);

        jLabelTitle.setSize(1024, 60);
        setResizable(false);
        getContentPane().setBackground(Features.theme.colorBck);
        setTitle("Inventory");

        setLocationRelativeTo(null);
        setSize(1024, 710);
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
            java.util.logging.Logger.getLogger(Cart_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cart_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cart_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cart_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ShowInventory().setVisible(true);
//            }
//        });
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ShowInventory().setVisible(true);
//            }
//        });
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ShowInventory().setVisible(true);
//            }
//        });
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ShowInventory().setVisible(true);
//            }
//        });
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ShowInventory().setVisible(true);
//            }
//        });
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ShowInventory().setVisible(true);
//            }
//        });
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ShowInventory().setVisible(true);
//            }
//        });
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ShowInventory().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonMakeInvoice;
    private javax.swing.JButton jButtonMakeInvoice1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCart;
    // End of variables declaration//GEN-END:variables
}
