/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design;

import java.awt.Color;
import javax.swing.ImageIcon;
import pos.User;

public class LoginM_Frame extends javax.swing.JFrame {

    public static Base_Frame base_Frame;

    public LoginM_Frame() {
        initComponents();
        appIconSet();
        jPasswordField.setEchoChar('•');

        setSize(960, 600);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public void appIconSet() {
        setIconImage(new ImageIcon(getClass().getResource("/pic/icon1.PNG")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldU = new javax.swing.JTextField();
        jPasswordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jButtonLgin = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Log In");
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arista 2.0 Light", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(219, 156, 113));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("User Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 240, 130, 50);

        jLabel3.setFont(new java.awt.Font("Arista 2.0 Light", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(219, 156, 113));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(620, 240, 130, 50);

        jTextFieldU.setBackground(new java.awt.Color(95, 56, 77));
        jTextFieldU.setFont(new java.awt.Font("Arista 2.0 Light", 1, 14)); // NOI18N
        jTextFieldU.setForeground(new java.awt.Color(219, 156, 113));
        jTextFieldU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldU);
        jTextFieldU.setBounds(100, 280, 210, 30);

        jPasswordField.setBackground(new java.awt.Color(95, 56, 77));
        jPasswordField.setFont(new java.awt.Font("Arista 2.0 Light", 1, 24)); // NOI18N
        jPasswordField.setForeground(new java.awt.Color(219, 156, 113));
        getContentPane().add(jPasswordField);
        jPasswordField.setBounds(650, 280, 220, 30);

        jLabel1.setFont(new java.awt.Font("Beon", 1, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(219, 156, 113));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("POINT OF SALE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 50, 550, 100);

        jButtonLgin.setBackground(new java.awt.Color(95, 56, 77));
        jButtonLgin.setFont(new java.awt.Font("Arista 2.0 Light", 1, 16)); // NOI18N
        jButtonLgin.setForeground(new java.awt.Color(219, 156, 113));
        jButtonLgin.setText("Log In");
        jButtonLgin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLginActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLgin);
        jButtonLgin.setBounds(400, 460, 160, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(219, 156, 113));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("@Copyright  Mir Ferdous");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(730, 530, 200, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/loginM.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 960, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLginActionPerformed
        try {
            User user = new User(jTextFieldU.getText(), String.valueOf(jPasswordField.getPassword()));
            if (user.login() == true && base_Frame == null) {
                base_Frame = new Base_Frame();
                setVisible(false);
            } else {
                new WarningLogin_Frame("Access Denied. Wrong UserName or Password", new Color(95, 56, 77));
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButtonLginActionPerformed

    private void jTextFieldUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUActionPerformed

    }//GEN-LAST:event_jTextFieldUActionPerformed

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
            java.util.logging.Logger.getLogger(LoginM_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginM_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginM_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginM_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginM_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLgin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextFieldU;
    // End of variables declaration//GEN-END:variables
}
