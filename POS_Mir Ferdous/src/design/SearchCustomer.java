package design;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import pos.Cart;
import pos.Customer;
import pos.Features;

public class SearchCustomer extends javax.swing.JFrame {

    public SearchCustomer() {
        initComponents();
        appIconSet();
        init();
    }

    public void init() {

        getContentPane().setBackground(Features.theme.colorBck);
        setTitle("Search Customer");
        setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(SearchCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>       
    }

    public void appIconSet() {
        setIconImage(new ImageIcon(getClass().getResource("/pic/icon1.PNG")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldPhone = new javax.swing.JTextField();
        jButtonShowCus = new javax.swing.JButton();
        jButtonSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaCusInfos = new javax.swing.JTextArea();

        jLabel1.setBackground(new java.awt.Color(42, 50, 65));
        jLabel1.setFont(new java.awt.Font("Arista 2.0 Light", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(235, 220, 178));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Existing Customer");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setFont(new java.awt.Font("Arista 2.0 Light", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(235, 220, 178));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Search Cusotmer By Phone Number");

        jTextFieldPhone.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldPhone.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jTextFieldPhone.setForeground(new java.awt.Color(45, 50, 65));

        jButtonShowCus.setBackground(Features.theme.colorBtn);
        jButtonShowCus.setFont(new java.awt.Font("Arista 2.0 Light", 1, 14)); // NOI18N
        jButtonShowCus.setText("Show Customer's Database");
        jButtonShowCus.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButtonShowCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowCusActionPerformed(evt);
            }
        });

        jButtonSearch.setBackground(Features.theme.colorBtn);
        jButtonSearch.setFont(new java.awt.Font("Arista 2.0 Light", 1, 14)); // NOI18N
        jButtonSearch.setText("Search & Select Customer");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jTextAreaCusInfos.setEditable(false);
        jTextAreaCusInfos.setBackground(new java.awt.Color(204, 204, 255));
        jTextAreaCusInfos.setColumns(1);
        jTextAreaCusInfos.setFont(new java.awt.Font("Dialog", 0, 19)); // NOI18N
        jTextAreaCusInfos.setForeground(new java.awt.Color(45, 50, 65));
        jTextAreaCusInfos.setRows(3);
        jTextAreaCusInfos.setBorder(null);
        jTextAreaCusInfos.setFocusable(false);
        jScrollPane1.setViewportView(jTextAreaCusInfos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSearch)))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonShowCus)
                .addGap(216, 216, 216))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jButtonShowCus, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSearch))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        String phone = jTextFieldPhone.getText();
        Cart.cstmr = new Customer("", "", "");  //for making string fields null to escaping error in DB entry
        Customer customer = new Customer().searchCustomerByPhone(phone);
        Cart.cstmr = customer;

        if (customer != null) {
            jTextAreaCusInfos.append(Cart.cstmr.toString());
        } else {
            jTextAreaCusInfos.append("\nCustomer Not Found");
        }
        //System.out.println(Cart.cstmr);
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jButtonShowCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowCusActionPerformed
        new CustomerList_Frame();
    }//GEN-LAST:event_jButtonShowCusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JButton jButtonShowCus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaCusInfos;
    private javax.swing.JTextField jTextFieldPhone;
    // End of variables declaration//GEN-END:variables
}
