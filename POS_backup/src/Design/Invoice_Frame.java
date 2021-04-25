package Design;

import pos.Store;
import pos.Product;
import pos.Invoice;
import pos.Features;
import pos.Cart;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class Invoice_Frame extends javax.swing.JFrame {

    Invoice invoice = new Invoice();
    // saleForm = new Sale_Frame();
    DefaultTableModel model = invoice.invoiceTableModel(Cart.prdtList);

    public Invoice_Frame() {
        initComponents();
        appIconSet();
        init();
    }

    public void init() {
        jLabelTotal.setText(String.valueOf(totalCalculate((LinkedList<Product>) Cart.prdtList)));
        //========== store info heading ======================
        String s = "";
        Store store = null;
        try {
            store = Store.getStoreInfo();
        } catch (Exception e) {
            e.printStackTrace();
        }
        jTextAreaShopInfo.append(store.storeInfoAsPara());

        //============ customer's name =================        
        jLabelCus.setText("Customer's Name :   " + Cart.cstmr.name);

        //============ Invoice ID =============        
        jLabelInvNO.setText("Invoice No: " + Cart.id_inv);

        //============= Date ==============             
        String date = new SimpleDateFormat("dd-MM-yyyy").format(Cart.time.getTime());
        jLabelDate.setText("Date: " + date);

        //============= Total Bill==============        
        jLabelTotal.setText(Integer.toString(Cart.total));

        getContentPane().setBackground(Features.theme.colorBck);
        setTitle("Invoice");
        setLocationRelativeTo(null);
        setSize(1024, 710);
        setResizable(false);
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
            java.util.logging.Logger.getLogger(Invoice_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Invoice_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Invoice_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Invoice_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

    }

    public void appIconSet() {
        setIconImage(new ImageIcon(getClass().getResource("/pic/icon1.PNG")).getImage());
    }

    public int totalCalculate(LinkedList<Product> prdtList) {
        int t = 0;
        for (Product product : prdtList) {
            t += product.price * product.getQuantity();
        }

        //t=invoice.getTotal();
        return t;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableInvoice = new javax.swing.JTable();
        jLabelInvNO = new javax.swing.JLabel();
        jLabelDate = new javax.swing.JLabel();
        jLabelCus = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaShopInfo = new javax.swing.JTextArea();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();

        setTitle("Invoice");

        jTableInvoice.setBackground(new java.awt.Color(255, 255, 204));
        jTableInvoice.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTableInvoice.setForeground(new java.awt.Color(0, 0, 0));
        jTableInvoice.setModel(model);
        jTableInvoice.setFocusable(false);
        jTableInvoice.setGridColor(new java.awt.Color(255, 255, 204));
        jTableInvoice.setRequestFocusEnabled(false);
        jTableInvoice.setRowSelectionAllowed(false);
        jTableInvoice.setSelectionBackground(new java.awt.Color(255, 255, 204));
        jTableInvoice.setShowHorizontalLines(false);
        jTableInvoice.setShowVerticalLines(false);
        jTableInvoice.setUpdateSelectionOnSort(false);
        jTableInvoice.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(jTableInvoice);
        if (jTableInvoice.getColumnModel().getColumnCount() > 0) {
            jTableInvoice.getColumnModel().getColumn(0).setHeaderValue("Name");
            jTableInvoice.getColumnModel().getColumn(1).setHeaderValue("Rate");
            jTableInvoice.getColumnModel().getColumn(2).setHeaderValue("Quantity");
            jTableInvoice.getColumnModel().getColumn(3).setHeaderValue("Price");
        }

        jLabelInvNO.setFont(new java.awt.Font("Arista 2.0 Light", 1, 13)); // NOI18N
        jLabelInvNO.setForeground(new java.awt.Color(235, 220, 178));
        jLabelInvNO.setText("Invoice no");

        jLabelDate.setFont(new java.awt.Font("Arista 2.0 Light", 1, 13)); // NOI18N
        jLabelDate.setForeground(new java.awt.Color(235, 220, 178));
        jLabelDate.setText("Date");

        jLabelCus.setBackground(new java.awt.Color(42, 50, 65));
        jLabelCus.setFont(new java.awt.Font("Arista 2.0 Light", 1, 16)); // NOI18N
        jLabelCus.setForeground(new java.awt.Color(235, 220, 178));
        jLabelCus.setText("Customer");

        jTextAreaShopInfo.setEditable(false);
        jTextAreaShopInfo.setBackground(new java.awt.Color(26, 79, 73));
        jTextAreaShopInfo.setColumns(1);
        jTextAreaShopInfo.setFont(new java.awt.Font("Beon", 1, 19)); // NOI18N
        jTextAreaShopInfo.setForeground(new java.awt.Color(235, 220, 178));
        jTextAreaShopInfo.setRows(3);
        jTextAreaShopInfo.setAutoscrolls(false);
        jTextAreaShopInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextAreaShopInfo.setFocusable(false);
        jTextAreaShopInfo.setOpaque(false);
        jScrollPane2.setViewportView(jTextAreaShopInfo);

        jLabel1.setFont(new java.awt.Font("Arista 2.0 Light", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(235, 220, 178));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Total Bill -");

        jLabelTotal.setFont(new java.awt.Font("Arista 2.0 Light", 1, 16)); // NOI18N
        jLabelTotal.setForeground(new java.awt.Color(235, 220, 178));
        jLabelTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabelTotal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLayeredPane1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabelTotal});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCus, javax.swing.GroupLayout.PREFERRED_SIZE, 923, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelInvNO, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 693, Short.MAX_VALUE)
                        .addComponent(jLabelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCus, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelInvNO, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCus;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelInvNO;
    public javax.swing.JLabel jLabelTotal;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableInvoice;
    private javax.swing.JTextArea jTextAreaShopInfo;
    // End of variables declaration//GEN-END:variables
}
