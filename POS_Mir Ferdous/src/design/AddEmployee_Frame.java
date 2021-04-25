package design;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import pos.Features;
import pos.SalesPerson;

public class AddEmployee_Frame extends javax.swing.JFrame {

    public AddEmployee_Frame() {
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

        jButtonAddEmp = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldAddress = new javax.swing.JTextField();
        jTextFieldPhone = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldSalary = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        jButtonAddEmp.setBackground(Features.theme.colorBtn);
        jButtonAddEmp.setFont(new java.awt.Font("Arista 2.0 Light", 1, 14)); // NOI18N
        jButtonAddEmp.setText("Add Employee");
        jButtonAddEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddEmpActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAddEmp);
        jButtonAddEmp.setBounds(440, 320, 130, 43);

        jLabel2.setFont(new java.awt.Font("Arista 2.0 Light", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(235, 220, 178));
        jLabel2.setText("Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 120, 70, 20);

        jLabel3.setFont(new java.awt.Font("Arista 2.0 Light", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(235, 220, 178));
        jLabel3.setText("Address");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 170, 63, 20);

        jLabel4.setFont(new java.awt.Font("Arista 2.0 Light", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(235, 220, 178));
        jLabel4.setText("Phone");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 220, 60, 20);

        jTextFieldName.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldName.setToolTipText("");
        getContentPane().add(jTextFieldName);
        jTextFieldName.setBounds(150, 120, 440, 25);

        jTextFieldAddress.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldAddress.setToolTipText("");
        getContentPane().add(jTextFieldAddress);
        jTextFieldAddress.setBounds(150, 170, 440, 25);

        jTextFieldPhone.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldPhone.setToolTipText("");
        getContentPane().add(jTextFieldPhone);
        jTextFieldPhone.setBounds(150, 220, 280, 25);

        jLabel1.setFont(new java.awt.Font("Arista 2.0 Light", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(235, 220, 178));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add New Employee");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 10, 440, 51);

        jLabel5.setFont(new java.awt.Font("Arista 2.0 Light", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(235, 220, 178));
        jLabel5.setText("Salary");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 270, 60, 20);

        jTextFieldSalary.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldSalary.setToolTipText("");
        jTextFieldSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSalaryActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldSalary);
        jTextFieldSalary.setBounds(150, 270, 200, 25);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/addEmpLogo.PNG"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(80, 0, 90, 100);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddEmpActionPerformed
        setVisible(false);
        String name, address, phone, salary;
        name = jTextFieldName.getText();
        address = jTextFieldAddress.getText();
        phone = jTextFieldPhone.getText();
        salary = (jTextFieldSalary.getText());
        if (!name.isEmpty() && !salary.isEmpty()) {
            SalesPerson salesPerson = new SalesPerson(name, address, phone, Integer.parseInt(salary));
            salesPerson.addSalesPerson();
        }
    }//GEN-LAST:event_jButtonAddEmpActionPerformed

    private void jTextFieldSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSalaryActionPerformed

    /**
     * @param args the command line arguments
     */
    public void init() {
        getContentPane().setBackground(Features.theme.colorBck);
        setTitle("Add Employee");
        setSize(630, 430);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddEmployee_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployee_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployee_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployee_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AddEmployee().setVisible(true);
//            }
//        });
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AddEmployee_Frame().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddEmp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextFieldAddress;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPhone;
    private javax.swing.JTextField jTextFieldSalary;
    // End of variables declaration//GEN-END:variables
}
