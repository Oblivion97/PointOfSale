/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import pos.Features;
import pos.User;

public class LoginH_Frame extends javax.swing.JFrame {

    public LoginH_Frame() {
        initComponents();
        appIconSet();
        setSize(960, 600);
        setLocationRelativeTo(null);
        setResizable(false);

        jPasswordField.setEchoChar('•');

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
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arista 2.0 Light", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(46, 94, 107));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("User Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 240, 130, 50);

        jLabel3.setFont(new java.awt.Font("Arista 2.0 Light", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(46, 94, 107));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(620, 240, 130, 50);

        jTextFieldU.setBackground(new java.awt.Color(110, 150, 161));
        jTextFieldU.setFont(new java.awt.Font("Arista 2.0 Light", 1, 14)); // NOI18N
        jTextFieldU.setForeground(new java.awt.Color(46, 94, 106));
        jTextFieldU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldU);
        jTextFieldU.setBounds(100, 280, 210, 30);

        jPasswordField.setBackground(new java.awt.Color(110, 150, 161));
        jPasswordField.setFont(new java.awt.Font("Arista 2.0 Light", 1, 14)); // NOI18N
        jPasswordField.setForeground(new java.awt.Color(46, 94, 106));
        getContentPane().add(jPasswordField);
        jPasswordField.setBounds(650, 280, 220, 30);

        jLabel1.setFont(new java.awt.Font("Beon", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(46, 94, 107));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Retail OPS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 30, 960, 120);

        jButtonLgin.setBackground(new java.awt.Color(110, 150, 161));
        jButtonLgin.setFont(new java.awt.Font("Arista 2.0 Light", 1, 16)); // NOI18N
        jButtonLgin.setForeground(new java.awt.Color(46, 94, 107));
        jButtonLgin.setText("Login");
        jButtonLgin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLginActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLgin);
        jButtonLgin.setBounds(420, 460, 130, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/loginHridoy.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 960, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLginActionPerformed
        User user = new User(jTextFieldU.getText(), String.valueOf(jPasswordField.getPassword()));
        if (user.login() == true) {
            new Base_Frame();
            setVisible(false);
        } else {
            new WarningLogin_Frame("Access Denied. Wrong UserName or Password", new Color(110, 150, 161));
        }
    }//GEN-LAST:event_jButtonLginActionPerformed

    private void jTextFieldUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(LoginH_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginH_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginH_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginH_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginH_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLgin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextFieldU;
    // End of variables declaration//GEN-END:variables
}
