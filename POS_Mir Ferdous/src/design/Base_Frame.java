package design;

import java.awt.Color;
import java.beans.Visibility;
import javax.swing.*;
import pos.Features;

public class Base_Frame extends javax.swing.JFrame {

    public Base_Frame() {
        initComponents();
        appIconSet();
        init();
    }

    public void init() {
        getContentPane().setBackground(Features.theme.colorBck);
        setSize(1024, 710);
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
            java.util.logging.Logger.getLogger(Base_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Base_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Base_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Base_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
//</editor-fold>
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButtonDelCus = new javax.swing.JButton();
        jButtonShowCus = new javax.swing.JButton();
        jButtonSetStoreInfo = new javax.swing.JButton();
        jButtonShowStoreInfo = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButtonAddEmp = new javax.swing.JButton();
        jButtonDelEmp = new javax.swing.JButton();
        jButtonShowEmp = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButtonSell = new javax.swing.JButton();
        jButtonAbout = new javax.swing.JButton();
        jButtonReport = new javax.swing.JButton();
        jButtonPur1 = new javax.swing.JButton();
        jButtonInven1 = new javax.swing.JButton();
        jButtonSettings = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Point Of Sale");
        setBackground(new java.awt.Color(0, 102, 102));
        setMinimumSize(new java.awt.Dimension(1024, 710));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arista 2.0 Light", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(235, 220, 178));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Inventory");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(670, 359, 130, 30);

        jLabel2.setFont(new java.awt.Font("Arista 2.0 Light", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(235, 220, 178));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Purchase");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(750, 160, 130, 30);

        jLabel3.setFont(new java.awt.Font("Arista 2.0 Light", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(235, 220, 178));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Sell");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(590, 160, 130, 30);

        jLabel4.setFont(new java.awt.Font("Arista 2.0 Light", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(235, 220, 178));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("MENU");
        jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 20, 420, 40);

        jLabel5.setFont(new java.awt.Font("Arista 2.0 Light", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(235, 220, 178));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("About");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(500, 359, 130, 30);

        jLabel6.setFont(new java.awt.Font("Arista 2.0 Light", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(235, 220, 178));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Report");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(840, 360, 130, 30);

        jLabel7.setFont(new java.awt.Font("Arista 2.0 Light", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(235, 220, 178));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Customer Management");
        jLabel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(jLabel7);
        jLabel7.setBounds(110, 100, 220, 40);

        jButtonDelCus.setBackground(Features.theme.colorBtn);
        jButtonDelCus.setFont(new java.awt.Font("Arista 2.0 Light", 1, 14)); // NOI18N
        jButtonDelCus.setText("Delete Customer");
        jButtonDelCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDelCusActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDelCus);
        jButtonDelCus.setBounds(220, 160, 150, 31);

        jButtonShowCus.setBackground(Features.theme.colorBtn);
        jButtonShowCus.setFont(new java.awt.Font("Arista 2.0 Light", 1, 14)); // NOI18N
        jButtonShowCus.setText("Show Customer");
        jButtonShowCus.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButtonShowCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowCusActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonShowCus);
        jButtonShowCus.setBounds(80, 160, 140, 31);

        jButtonSetStoreInfo.setBackground(Features.theme.colorBtn);
        jButtonSetStoreInfo.setFont(new java.awt.Font("Arista 2.0 Light", 1, 14)); // NOI18N
        jButtonSetStoreInfo.setText("Set Store Info");
        jButtonSetStoreInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSetStoreInfoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSetStoreInfo);
        jButtonSetStoreInfo.setBounds(80, 390, 130, 31);

        jButtonShowStoreInfo.setBackground(Features.theme.colorBtn);
        jButtonShowStoreInfo.setFont(new java.awt.Font("Arista 2.0 Light", 1, 14)); // NOI18N
        jButtonShowStoreInfo.setText("Show Store Info");
        jButtonShowStoreInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowStoreInfoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonShowStoreInfo);
        jButtonShowStoreInfo.setBounds(210, 390, 150, 31);

        jLabel9.setFont(new java.awt.Font("Arista 2.0 Light", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(235, 220, 178));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Store Management");
        jLabel9.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(jLabel9);
        jLabel9.setBounds(110, 330, 210, 40);

        jButtonAddEmp.setBackground(Features.theme.colorBtn);
        jButtonAddEmp.setFont(new java.awt.Font("Arista 2.0 Light", 1, 14)); // NOI18N
        jButtonAddEmp.setText("Add Employee");
        jButtonAddEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddEmpActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAddEmp);
        jButtonAddEmp.setBounds(150, 280, 130, 31);

        jButtonDelEmp.setBackground(Features.theme.colorBtn);
        jButtonDelEmp.setFont(new java.awt.Font("Arista 2.0 Light", 1, 14)); // NOI18N
        jButtonDelEmp.setText("Delete Employee");
        jButtonDelEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDelEmpActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDelEmp);
        jButtonDelEmp.setBounds(280, 280, 150, 31);

        jButtonShowEmp.setBackground(Features.theme.colorBtn);
        jButtonShowEmp.setFont(new java.awt.Font("Arista 2.0 Light", 1, 14)); // NOI18N
        jButtonShowEmp.setText("Show Employee");
        jButtonShowEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowEmpActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonShowEmp);
        jButtonShowEmp.setBounds(10, 280, 140, 31);

        jLabel10.setFont(new java.awt.Font("Arista 2.0 Light", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(235, 220, 178));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Employee Management");
        jLabel10.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(jLabel10);
        jLabel10.setBounds(110, 220, 220, 40);

        jLabel12.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(jLabel12);
        jLabel12.setBounds(440, 0, 20, 710);

        jButtonSell.setBackground(new java.awt.Color(102, 102, 102));
        jButtonSell.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButtonSell.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/sellbtn2.png"))); // NOI18N
        jButtonSell.setToolTipText("");
        jButtonSell.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255)))); // NOI18N
        jButtonSell.setMaximumSize(new java.awt.Dimension(120, 120));
        jButtonSell.setMinimumSize(new java.awt.Dimension(120, 120));
        jButtonSell.setPreferredSize(new java.awt.Dimension(120, 120));
        jButtonSell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSellActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSell);
        jButtonSell.setBounds(590, 190, 130, 130);

        jButtonAbout.setBackground(new java.awt.Color(102, 102, 102));
        jButtonAbout.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButtonAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/aboutbtn1.jpg"))); // NOI18N
        jButtonAbout.setToolTipText("");
        jButtonAbout.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255)))); // NOI18N
        jButtonAbout.setMaximumSize(new java.awt.Dimension(120, 120));
        jButtonAbout.setMinimumSize(new java.awt.Dimension(120, 120));
        jButtonAbout.setPreferredSize(new java.awt.Dimension(120, 120));
        jButtonAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAboutActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAbout);
        jButtonAbout.setBounds(500, 390, 130, 130);

        jButtonReport.setBackground(new java.awt.Color(102, 102, 102));
        jButtonReport.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButtonReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/reportbtn1.png"))); // NOI18N
        jButtonReport.setToolTipText("");
        jButtonReport.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255)))); // NOI18N
        jButtonReport.setMaximumSize(new java.awt.Dimension(120, 120));
        jButtonReport.setMinimumSize(new java.awt.Dimension(120, 120));
        jButtonReport.setPreferredSize(new java.awt.Dimension(120, 120));
        jButtonReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReportActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonReport);
        jButtonReport.setBounds(840, 390, 130, 130);

        jButtonPur1.setBackground(new java.awt.Color(102, 102, 102));
        jButtonPur1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButtonPur1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/purchasebtn1.jpg"))); // NOI18N
        jButtonPur1.setToolTipText("");
        jButtonPur1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255)))); // NOI18N
        jButtonPur1.setMaximumSize(new java.awt.Dimension(120, 120));
        jButtonPur1.setMinimumSize(new java.awt.Dimension(120, 120));
        jButtonPur1.setPreferredSize(new java.awt.Dimension(120, 120));
        jButtonPur1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPur1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPur1);
        jButtonPur1.setBounds(750, 190, 130, 130);

        jButtonInven1.setBackground(new java.awt.Color(102, 102, 102));
        jButtonInven1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButtonInven1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/inventorybutton.PNG"))); // NOI18N
        jButtonInven1.setToolTipText("");
        jButtonInven1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255)))); // NOI18N
        jButtonInven1.setMaximumSize(new java.awt.Dimension(120, 120));
        jButtonInven1.setMinimumSize(new java.awt.Dimension(120, 120));
        jButtonInven1.setPreferredSize(new java.awt.Dimension(120, 120));
        jButtonInven1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInven1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonInven1);
        jButtonInven1.setBounds(670, 390, 130, 130);

        jButtonSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/settingsBtn60.jpg"))); // NOI18N
        jButtonSettings.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButtonSettings.setPreferredSize(new java.awt.Dimension(60, 60));
        jButtonSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSettingsActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSettings);
        jButtonSettings.setBounds(920, 10, 70, 70);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/posLogo.png"))); // NOI18N
        jLabel8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 570, 100, 100);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDelCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDelCusActionPerformed
        new DelCus_Frame();
    }//GEN-LAST:event_jButtonDelCusActionPerformed

    private void jButtonShowCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowCusActionPerformed
        new CustomerList_Frame();
    }//GEN-LAST:event_jButtonShowCusActionPerformed

    private void jButtonSetStoreInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSetStoreInfoActionPerformed
        new SetStoreInfo_Frame();
    }//GEN-LAST:event_jButtonSetStoreInfoActionPerformed

    private void jButtonShowStoreInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowStoreInfoActionPerformed
        new StoreInfo_Frame();
    }//GEN-LAST:event_jButtonShowStoreInfoActionPerformed

    private void jButtonAddEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddEmpActionPerformed
        new AddEmployee_Frame();
    }//GEN-LAST:event_jButtonAddEmpActionPerformed

    private void jButtonDelEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDelEmpActionPerformed
        DelEmp_Frame delEmp = new DelEmp_Frame();
    }//GEN-LAST:event_jButtonDelEmpActionPerformed

    private void jButtonShowEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowEmpActionPerformed
        new EmployeeList_Frame();
    }//GEN-LAST:event_jButtonShowEmpActionPerformed

    private void jButtonSellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSellActionPerformed
       // new Sale_Frame_Select().setVisible(true);
       new SaleWithCart_Frame();
    }//GEN-LAST:event_jButtonSellActionPerformed

    private void jButtonAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAboutActionPerformed
        new AboutM();
    }//GEN-LAST:event_jButtonAboutActionPerformed

    private void jButtonReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReportActionPerformed
        new Report_Frame();
    }//GEN-LAST:event_jButtonReportActionPerformed

    private void jButtonPur1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPur1ActionPerformed
        new Purchase_Frame();
    }//GEN-LAST:event_jButtonPur1ActionPerformed

    private void jButtonInven1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInven1ActionPerformed
        new Inventory_Frame();
    }//GEN-LAST:event_jButtonInven1ActionPerformed

    private void jButtonSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSettingsActionPerformed
        new Settings_Frame();
        setVisible(false);
    }//GEN-LAST:event_jButtonSettingsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAbout;
    private javax.swing.JButton jButtonAddEmp;
    private javax.swing.JButton jButtonDelCus;
    private javax.swing.JButton jButtonDelEmp;
    private javax.swing.JButton jButtonInven1;
    private javax.swing.JButton jButtonPur1;
    private javax.swing.JButton jButtonReport;
    private javax.swing.JButton jButtonSell;
    private javax.swing.JButton jButtonSetStoreInfo;
    private javax.swing.JButton jButtonSettings;
    private javax.swing.JButton jButtonShowCus;
    private javax.swing.JButton jButtonShowEmp;
    private javax.swing.JButton jButtonShowStoreInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
