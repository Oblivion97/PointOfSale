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
import java.util.GregorianCalendar;
import java.util.LinkedList;
import javax.swing.ImageIcon;

public class Sale_Frame_Select extends javax.swing.JFrame {

    Inventory inventory = new Inventory();
    Customer customer = new Customer();

//==================== Constructor ==============================
    public Sale_Frame_Select() {
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

        jButtonMakeInvoice = new javax.swing.JButton();
        jButtonShowPrdt1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jButtonOldCstmr = new javax.swing.JButton();
        jButtonNewCstmr = new javax.swing.JButton();

        setTitle("Sale");

        jButtonMakeInvoice.setBackground(Features.theme.colorBtn);
        jButtonMakeInvoice.setFont(new java.awt.Font("Arista 2.0 Light", 1, 16)); // NOI18N
        jButtonMakeInvoice.setText("Make Invoice");
        jButtonMakeInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMakeInvoiceActionPerformed(evt);
            }
        });

        jButtonShowPrdt1.setBackground(Features.theme.colorBtn);
        jButtonShowPrdt1.setFont(new java.awt.Font("Arista 2.0 Light", 1, 16)); // NOI18N
        jButtonShowPrdt1.setText("Products List");
        jButtonShowPrdt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowPrdt1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arista 2.0 Light", 1, 24)); // NOI18N
        jLabel1.setForeground(Features.theme.colorBtn);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Product Selection");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setFont(new java.awt.Font("Arista 2.0 Light", 1, 24)); // NOI18N
        jLabel2.setForeground(Features.theme.colorBtn);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Customer Selection");
        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

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
                .addContainerGap()
                .addComponent(jButtonNewCstmr)
                .addGap(32, 32, 32)
                .addComponent(jButtonOldCstmr)
                .addContainerGap())
        );

        jLayeredPane2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonNewCstmr, jButtonOldCstmr});

        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonOldCstmr, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNewCstmr, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLayeredPane2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonNewCstmr, jButtonOldCstmr});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(72, 72, 72))
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
            .addGroup(layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonMakeInvoice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonShowPrdt1, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(31, 31, 31)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(45, 45, 45)
                .addComponent(jButtonShowPrdt1)
                .addGap(50, 50, 50)
                .addComponent(jButtonMakeInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonMakeInvoice, jButtonShowPrdt1});

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
        jButtonMakeInvoice.setVisible(false);

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
            java.util.logging.Logger.getLogger(Sale_Frame_Select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sale_Frame_Select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sale_Frame_Select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sale_Frame_Select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonMakeInvoice;
    private javax.swing.JButton jButtonNewCstmr;
    private javax.swing.JButton jButtonOldCstmr;
    private javax.swing.JButton jButtonShowPrdt1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane2;
    // End of variables declaration//GEN-END:variables
}
