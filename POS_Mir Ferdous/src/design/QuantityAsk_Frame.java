package design;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import pos.*;
import pos.Features;
import pos.Product;

public class QuantityAsk_Frame extends javax.swing.JFrame {

    String id_prdtSelected;
    Inventory inventory = new Inventory();

    public QuantityAsk_Frame(String id_prdtSelected) {
        this.id_prdtSelected = id_prdtSelected;
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

        jLabel1 = new javax.swing.JLabel();
        jTextFieldQuantity = new javax.swing.JTextField();
        jButtonAddToCartConfirmation = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Arista 2.0 Light", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(235, 220, 178));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Set Quantity");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTextFieldQuantity.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldQuantity.setForeground(new java.awt.Color(45, 50, 65));

        jButtonAddToCartConfirmation.setBackground(Features.theme.colorBtn);
        jButtonAddToCartConfirmation.setFont(new java.awt.Font("Arista 2.0 Light", 1, 16)); // NOI18N
        jButtonAddToCartConfirmation.setText("Confirm");
        jButtonAddToCartConfirmation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddToCartConfirmationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                            .addComponent(jButtonAddToCartConfirmation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 77, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jTextFieldQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jButtonAddToCartConfirmation)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddToCartConfirmationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddToCartConfirmationActionPerformed

        try {
            String id_prdt = id_prdtSelected;
            int quantity;
            if (!jTextFieldQuantity.getText().equals("")) {
                quantity = Integer.parseInt(jTextFieldQuantity.getText());
                Product prdtTemp = inventory.searchProductByID(id_prdt);
                if (quantity <= prdtTemp.getQuantity() && quantity != 0) {
                    prdtTemp.setQuantity(quantity);
                    Cart.prdtList.add(prdtTemp);
                } else {
                    new Warning_Frame("Not Enough Products Availale. In Stock Now : " + prdtTemp.getQuantity());
                }
            } else {
                new Warning_Frame("Please Enter Quantity");
            }

            setVisible(false);

        } catch (Exception e) {
            e.printStackTrace();
        }
        id_prdtSelected = "";
    }//GEN-LAST:event_jButtonAddToCartConfirmationActionPerformed

    public void init() {
        setTitle("Delete Customer");
        getContentPane().setBackground(Features.theme.colorBck);
        setResizable(false);
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
            java.util.logging.Logger.getLogger(QuantityAsk_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuantityAsk_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuantityAsk_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuantityAsk_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddToCartConfirmation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextFieldQuantity;
    // End of variables declaration//GEN-END:variables
}
