package Design;

import javax.swing.ImageIcon;
import pos.Cart;
import pos.Customer;
import pos.Features;

public class AddCustomer_Frame extends javax.swing.JFrame {

    public AddCustomer_Frame() {
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

        jButtonAddCus = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldAddress = new javax.swing.JTextField();
        jTextFieldPhone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(42, 50, 65));
        getContentPane().setLayout(null);

        jButtonAddCus.setBackground(Features.theme.colorBtn);
        jButtonAddCus.setFont(new java.awt.Font("Arista 2.0 Light", 1, 16)); // NOI18N
        jButtonAddCus.setText("Add Customer");
        jButtonAddCus.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jButtonAddCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddCusActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAddCus);
        jButtonAddCus.setBounds(420, 290, 150, 40);

        jLabel2.setFont(new java.awt.Font("Arista 2.0 Light", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(235, 220, 178));
        jLabel2.setText("Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 110, 60, 20);

        jLabel3.setFont(new java.awt.Font("Arista 2.0 Light", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(235, 220, 178));
        jLabel3.setText("Address");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 170, 70, 20);

        jLabel4.setFont(new java.awt.Font("Arista 2.0 Light", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(235, 220, 178));
        jLabel4.setText("Phone");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 220, 70, 20);

        jTextFieldName.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldName.setForeground(new java.awt.Color(0, 51, 51));
        getContentPane().add(jTextFieldName);
        jTextFieldName.setBounds(155, 109, 420, 24);

        jTextFieldAddress.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldAddress.setForeground(new java.awt.Color(0, 51, 51));
        getContentPane().add(jTextFieldAddress);
        jTextFieldAddress.setBounds(155, 164, 420, 24);

        jTextFieldPhone.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldPhone.setForeground(new java.awt.Color(0, 51, 51));
        getContentPane().add(jTextFieldPhone);
        jTextFieldPhone.setBounds(155, 217, 420, 24);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/addCusLogo.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(70, 0, 90, 90);

        jLabel1.setFont(new java.awt.Font("Arista 2.0 Light", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(235, 220, 178));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add New Customer");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 10, 450, 51);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddCusActionPerformed
        try {
            setVisible(false);
            String name, address, phone;
            int salary;
            name = jTextFieldName.getText();
            address = jTextFieldAddress.getText();
            phone = jTextFieldPhone.getText();

            Customer customer = new Customer(name, address, phone);
            customer.addCustomer();

            //========to cart class========
            Cart.cstmr = customer;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonAddCusActionPerformed

    public void init() {
        getContentPane().setBackground(Features.theme.colorBck);
        setTitle("Add Customer");
        setSize(630, 390);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddCustomer_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCustomer_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCustomer_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCustomer_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddCus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextFieldAddress;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPhone;
    // End of variables declaration//GEN-END:variables
}
