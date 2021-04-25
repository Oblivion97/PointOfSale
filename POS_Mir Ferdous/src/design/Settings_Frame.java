package design;

import java.awt.Color;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import pos.AutoIncrementedValue;
import pos.Customer;
import pos.Features;
import pos.SalesPerson;
import pos.User;
import java.io.*;

public class Settings_Frame extends javax.swing.JFrame {

    public static Vector<String> uList = new Vector<>();
    Customer customer = new Customer();
    SalesPerson salesPerson = new SalesPerson();

    public Settings_Frame() {
        initComponents();
        appIconSet();
        init();

    }

    public void init() {
        jTextFieldCurrentDB.setText(Features.dbName);

        getContentPane().setBackground(Features.theme.colorBck);
        setTitle("Settings");
        setSize(1024, 716);
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
            java.util.logging.Logger.getLogger(Settings_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Settings_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Settings_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Settings_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

    }

    public void appIconSet() {
        setIconImage(new ImageIcon(getClass().getResource("/pic/icon1.PNG")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonTheme = new javax.swing.JButton();
        jButtonShowAllUser1 = new javax.swing.JButton();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        jLayeredPane6 = new javax.swing.JLayeredPane();
        jTextFieldResPur = new javax.swing.JTextField();
        jButtonResetPur = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLayeredPane7 = new javax.swing.JLayeredPane();
        jLabel4 = new javax.swing.JLabel();
        jLayeredPane5 = new javax.swing.JLayeredPane();
        jButtonResetInvoice = new javax.swing.JButton();
        jTextFieldResInv = new javax.swing.JTextField();
        jButtonBack = new javax.swing.JButton();
        jPanelChangePass = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jButtonChngPass = new javax.swing.JButton();
        jTextFieldOldPass = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldNewPass = new javax.swing.JTextField();
        jTextFieldChangePassUser = new javax.swing.JTextField();
        jLayeredPaneUserAdd = new javax.swing.JLayeredPane();
        jTextFieldUserAdd = new javax.swing.JTextField();
        jButtonAddUser = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldPass = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanelUDel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jButtonDel1 = new javax.swing.JButton();
        jTextFieldUserDel1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldDBName = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jButtonSetDB = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldCurrentDB = new javax.swing.JTextField();
        jLabelUSettingsTitile = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Settings");
        getContentPane().setLayout(null);

        jButtonTheme.setBackground(Features.theme.colorBtn);
        jButtonTheme.setFont(new java.awt.Font("Arista 2.0 Light", 1, 18)); // NOI18N
        jButtonTheme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/themeIcon.png"))); // NOI18N
        jButtonTheme.setText("Change Theme");
        jButtonTheme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThemeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonTheme);
        jButtonTheme.setBounds(130, 460, 290, 100);

        jButtonShowAllUser1.setBackground(Features.theme.colorBtn);
        jButtonShowAllUser1.setFont(new java.awt.Font("Arista 2.0 Light", 1, 18)); // NOI18N
        jButtonShowAllUser1.setText("Show All Users");
        jButtonShowAllUser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowAllUser1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonShowAllUser1);
        jButtonShowAllUser1.setBounds(690, 620, 200, 60);

        jTextFieldResPur.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldResPur.setForeground(new java.awt.Color(51, 51, 51));

        jButtonResetPur.setBackground(Features.theme.colorBtn);
        jButtonResetPur.setFont(new java.awt.Font("Arista 2.0 Light", 1, 14)); // NOI18N
        jButtonResetPur.setText("Reset");
        jButtonResetPur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetPurActionPerformed(evt);
            }
        });

        jLayeredPane6.setLayer(jTextFieldResPur, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane6.setLayer(jButtonResetPur, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane6Layout = new javax.swing.GroupLayout(jLayeredPane6);
        jLayeredPane6.setLayout(jLayeredPane6Layout);
        jLayeredPane6Layout.setHorizontalGroup(
            jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane6Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jTextFieldResPur, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonResetPur)
                .addGap(29, 29, 29))
        );
        jLayeredPane6Layout.setVerticalGroup(
            jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane6Layout.createSequentialGroup()
                .addGroup(jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldResPur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonResetPur))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Arista 2.0 Light", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(235, 220, 178));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Format Purchase ID");
        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLayeredPane4.setLayer(jLayeredPane6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane4Layout = new javax.swing.GroupLayout(jLayeredPane4);
        jLayeredPane4.setLayout(jLayeredPane4Layout);
        jLayeredPane4Layout.setHorizontalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 9, Short.MAX_VALUE))
        );
        jLayeredPane4Layout.setVerticalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLayeredPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jLayeredPane4);
        jLayeredPane4.setBounds(290, 30, 220, 110);

        jLabel4.setFont(new java.awt.Font("Arista 2.0 Light", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(235, 220, 178));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Format Invoice ID");
        jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButtonResetInvoice.setBackground(Features.theme.colorBtn);
        jButtonResetInvoice.setFont(new java.awt.Font("Arista 2.0 Light", 1, 14)); // NOI18N
        jButtonResetInvoice.setText("Reset ");
        jButtonResetInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetInvoiceActionPerformed(evt);
            }
        });

        jTextFieldResInv.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldResInv.setForeground(new java.awt.Color(51, 51, 51));

        jLayeredPane5.setLayer(jButtonResetInvoice, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(jTextFieldResInv, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane5Layout = new javax.swing.GroupLayout(jLayeredPane5);
        jLayeredPane5.setLayout(jLayeredPane5Layout);
        jLayeredPane5Layout.setHorizontalGroup(
            jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jTextFieldResInv, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonResetInvoice)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jLayeredPane5Layout.setVerticalGroup(
            jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane5Layout.createSequentialGroup()
                .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldResInv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonResetInvoice))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLayeredPane7.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(jLayeredPane5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane7Layout = new javax.swing.GroupLayout(jLayeredPane7);
        jLayeredPane7.setLayout(jLayeredPane7Layout);
        jLayeredPane7Layout.setHorizontalGroup(
            jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLayeredPane7Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel4, jLayeredPane5});

        jLayeredPane7Layout.setVerticalGroup(
            jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane7Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLayeredPane5)
                .addContainerGap())
        );

        getContentPane().add(jLayeredPane7);
        jLayeredPane7.setBounds(30, 30, 220, 110);

        jButtonBack.setBackground(Features.theme.colorBtn);
        jButtonBack.setFont(new java.awt.Font("Arista 2.0 Light", 1, 18)); // NOI18N
        jButtonBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/back.PNG"))); // NOI18N
        jButtonBack.setText("Back To Main Menu");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBack);
        jButtonBack.setBounds(130, 580, 290, 100);

        jPanelChangePass.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanelChangePass.setOpaque(false);

        jLabel9.setFont(new java.awt.Font("Arista 2.0 Light", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(235, 220, 178));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText(" Change Password");
        jLabel9.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButtonChngPass.setBackground(Features.theme.colorBtn);
        jButtonChngPass.setFont(new java.awt.Font("Arista 2.0 Light", 1, 14)); // NOI18N
        jButtonChngPass.setText("Change Password");
        jButtonChngPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChngPassActionPerformed(evt);
            }
        });

        jTextFieldOldPass.setBackground(new java.awt.Color(204, 204, 255));

        jLabel11.setFont(new java.awt.Font("Arista 2.0 Light", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(235, 220, 178));
        jLabel11.setText("User Name");

        jLabel12.setFont(new java.awt.Font("Arista 2.0 Light", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(235, 220, 178));
        jLabel12.setText("New Pass");

        jLabel13.setFont(new java.awt.Font("Arista 2.0 Light", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(235, 220, 178));
        jLabel13.setText("Old Pass");

        jTextFieldNewPass.setBackground(new java.awt.Color(204, 204, 255));

        jTextFieldChangePassUser.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanelChangePassLayout = new javax.swing.GroupLayout(jPanelChangePass);
        jPanelChangePass.setLayout(jPanelChangePassLayout);
        jPanelChangePassLayout.setHorizontalGroup(
            jPanelChangePassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelChangePassLayout.createSequentialGroup()
                .addGroup(jPanelChangePassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelChangePassLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelChangePassLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanelChangePassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelChangePassLayout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelChangePassLayout.createSequentialGroup()
                                .addGroup(jPanelChangePassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelChangePassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldOldPass, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldChangePassUser, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanelChangePassLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jButtonChngPass)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelChangePassLayout.setVerticalGroup(
            jPanelChangePassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelChangePassLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelChangePassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldChangePassUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelChangePassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldOldPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelChangePassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonChngPass)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelChangePass);
        jPanelChangePass.setBounds(630, 360, 310, 240);

        jLayeredPaneUserAdd.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jTextFieldUserAdd.setBackground(new java.awt.Color(204, 204, 255));

        jButtonAddUser.setBackground(Features.theme.colorBtn);
        jButtonAddUser.setFont(new java.awt.Font("Arista 2.0 Light", 1, 14)); // NOI18N
        jButtonAddUser.setText("Add New User");
        jButtonAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddUserActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arista 2.0 Light", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(235, 220, 178));
        jLabel7.setText("Password");

        jTextFieldPass.setBackground(new java.awt.Color(204, 204, 255));

        jLabel8.setFont(new java.awt.Font("Arista 2.0 Light", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(235, 220, 178));
        jLabel8.setText("User Name");

        jLayeredPaneUserAdd.setLayer(jTextFieldUserAdd, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPaneUserAdd.setLayer(jButtonAddUser, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPaneUserAdd.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPaneUserAdd.setLayer(jTextFieldPass, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPaneUserAdd.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPaneUserAddLayout = new javax.swing.GroupLayout(jLayeredPaneUserAdd);
        jLayeredPaneUserAdd.setLayout(jLayeredPaneUserAddLayout);
        jLayeredPaneUserAddLayout.setHorizontalGroup(
            jLayeredPaneUserAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPaneUserAddLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jLayeredPaneUserAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jLayeredPaneUserAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldUserAdd)
                    .addComponent(jTextFieldPass, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
            .addGroup(jLayeredPaneUserAddLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jButtonAddUser)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPaneUserAddLayout.setVerticalGroup(
            jLayeredPaneUserAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPaneUserAddLayout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addGroup(jLayeredPaneUserAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldUserAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPaneUserAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayeredPaneUserAddLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jTextFieldPass, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButtonAddUser)
                .addGap(17, 17, 17))
        );

        jLayeredPaneUserAddLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTextFieldPass, jTextFieldUserAdd});

        getContentPane().add(jLayeredPaneUserAdd);
        jLayeredPaneUserAdd.setBounds(630, 90, 310, 151);

        jPanelUDel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanelUDel.setOpaque(false);

        jLabel10.setFont(new java.awt.Font("Arista 2.0 Light", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(235, 220, 178));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Enter User Name To Delete");
        jLabel10.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButtonDel1.setBackground(Features.theme.colorBtn);
        jButtonDel1.setFont(new java.awt.Font("Arista 2.0 Light", 1, 14)); // NOI18N
        jButtonDel1.setText("Delete User");
        jButtonDel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDel1ActionPerformed(evt);
            }
        });

        jTextFieldUserDel1.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldUserDel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUserDel1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelUDelLayout = new javax.swing.GroupLayout(jPanelUDel);
        jPanelUDel.setLayout(jPanelUDelLayout);
        jPanelUDelLayout.setHorizontalGroup(
            jPanelUDelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUDelLayout.createSequentialGroup()
                .addGroup(jPanelUDelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelUDelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE))
                    .addGroup(jPanelUDelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jTextFieldUserDel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonDel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addContainerGap())
        );
        jPanelUDelLayout.setVerticalGroup(
            jPanelUDelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUDelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelUDelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDel1)
                    .addComponent(jTextFieldUserDel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelUDel);
        jPanelUDel.setBounds(628, 250, 310, 100);

        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Features.theme.colorLabel));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(570, 0, 10, 710);

        jLabel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 430, 570, 10);

        jLabel14.setFont(new java.awt.Font("Arista 2.0 Light", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(235, 220, 178));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText(" Database Settings");
        jLabel14.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(jLabel14);
        jLabel14.setBounds(100, 170, 330, 60);

        jTextFieldDBName.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldDBName.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(jTextFieldDBName);
        jTextFieldDBName.setBounds(180, 290, 120, 24);

        jLabel15.setFont(new java.awt.Font("Arista 2.0 Light", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(235, 220, 178));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Current Database  ");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(370, 270, 160, 20);

        jButtonSetDB.setBackground(Features.theme.colorBtn);
        jButtonSetDB.setFont(new java.awt.Font("Arista 2.0 Light", 1, 14)); // NOI18N
        jButtonSetDB.setText("Set Database");
        jButtonSetDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSetDBActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSetDB);
        jButtonSetDB.setBounds(130, 340, 170, 30);

        jLabel16.setFont(new java.awt.Font("Arista 2.0 Light", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(235, 220, 178));
        jLabel16.setText("Name of Database : ");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(20, 290, 160, 20);

        jLabel17.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(jLabel17);
        jLabel17.setBounds(0, 140, 570, 10);

        jTextFieldCurrentDB.setEditable(false);
        jTextFieldCurrentDB.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldCurrentDB.setFont(new java.awt.Font("Arista 2.0 Light", 0, 16)); // NOI18N
        jTextFieldCurrentDB.setForeground(new java.awt.Color(51, 51, 51));
        jTextFieldCurrentDB.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCurrentDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCurrentDBActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCurrentDB);
        jTextFieldCurrentDB.setBounds(360, 290, 170, 60);

        jLabelUSettingsTitile.setFont(new java.awt.Font("Arista 2.0 Light", 1, 20)); // NOI18N
        jLabelUSettingsTitile.setForeground(new java.awt.Color(235, 220, 178));
        jLabelUSettingsTitile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUSettingsTitile.setText("User Settings");
        jLabelUSettingsTitile.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(jLabelUSettingsTitile);
        jLabelUSettingsTitile.setBounds(606, 20, 350, 49);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonResetInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetInvoiceActionPerformed
        try {
            int value = Integer.parseInt(jTextFieldResInv.getText());
            AutoIncrementedValue.ResetAutoIncrementedValue(value, "auto_invoice_id.dat");

            jTextFieldResInv.setText("");
            // popup dialog
            new Warning_Frame("Invoice Serial no Resetted");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButtonResetInvoiceActionPerformed

    private void jButtonResetPurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetPurActionPerformed
        try {
            int value = Integer.parseInt(jTextFieldResPur.getText());
            AutoIncrementedValue.ResetAutoIncrementedValue(value, "auto_purchase_id.dat");

            jTextFieldResPur.setText("");
            // popup dialog
            new Warning_Frame("Purchase Serial no Resetted");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_jButtonResetPurActionPerformed

    private void jButtonChngPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChngPassActionPerformed
        try {
            User uTemp = null;
            uTemp = User.searchUser(jTextFieldChangePassUser.getText());
            if (uTemp != null && !jTextFieldChangePassUser.getText().equals("") && !jTextFieldOldPass.getText().equals("") && !jTextFieldNewPass.getText().equals("")) {
                int found = User.changePass(jTextFieldChangePassUser.getText(), jTextFieldOldPass.getText(), jTextFieldNewPass.getText());
                //field clear after deleting
                jTextFieldChangePassUser.setText(null);
                jTextFieldOldPass.setText(null);
                jTextFieldNewPass.setText(null);
                // popup dialogbox
                if (found == 1) {
                    new Warning_Frame("Password Changed");
                } else {
                    new Warning_Frame("Not A Valid Username OR Password");
                }

            } else {
                new Warning_Frame("Not A Valid Username OR Password");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButtonChngPassActionPerformed

    private void jButtonThemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThemeActionPerformed
        new Theme_Frame();
        setVisible(false);
    }//GEN-LAST:event_jButtonThemeActionPerformed

    private void jButtonShowAllUser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowAllUser1ActionPerformed
        try {
            uList = User.showUserList();
            new UserList_Frame();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButtonShowAllUser1ActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        setVisible(false);
        new Base_Frame();
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jButtonDel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDel1ActionPerformed
        try {

            String user = jTextFieldUserDel1.getText();
            int found = User.deleteUserDB(user);

            if (found == 1) {
                //field clear after deleting
                jTextFieldUserDel1.setText(null);
                // popup dialogbox
                new Warning_Frame("User Deleted");

            } else {
                // popup dialogbox
                new Warning_Frame("User doesn't Exists");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonDel1ActionPerformed

    private void jTextFieldUserDel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUserDel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUserDel1ActionPerformed

    private void jButtonSetDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSetDBActionPerformed
        String dbName = jTextFieldDBName.getText();
        try {
            File f = new File(dbName);
            if (f.exists() && !f.isDirectory()) {
                Features.saveDataBaseInfoToFile(dbName);// for permanent change
                Features.dbName = dbName;// for runtime change
                jTextFieldCurrentDB.setText(dbName);
                // popup dialogbox
                new Warning_Frame("Database Changed");
            } else {
                jTextFieldCurrentDB.setText("Not a Valid Database");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButtonSetDBActionPerformed

    private void jTextFieldCurrentDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCurrentDBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCurrentDBActionPerformed

    private void jButtonAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddUserActionPerformed
        try {
            String user = jTextFieldUserAdd.getText();
            String pass = jTextFieldPass.getText();

            if (!user.equals("") && !pass.equals("")) {

                User.addUserToDB(user, pass);

                //field clear after adding
                jTextFieldUserAdd.setText(null);
                jTextFieldPass.setText(null);
                // popup dialogbox
                new Warning_Frame("User Added");
            } else {
                new Warning_Frame("Not A Valid Username OR Password");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonAddUserActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddUser;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonChngPass;
    private javax.swing.JButton jButtonDel1;
    private javax.swing.JButton jButtonResetInvoice;
    private javax.swing.JButton jButtonResetPur;
    private javax.swing.JButton jButtonSetDB;
    private javax.swing.JButton jButtonShowAllUser1;
    private javax.swing.JButton jButtonTheme;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelUSettingsTitile;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JLayeredPane jLayeredPane5;
    private javax.swing.JLayeredPane jLayeredPane6;
    private javax.swing.JLayeredPane jLayeredPane7;
    private javax.swing.JLayeredPane jLayeredPaneUserAdd;
    private javax.swing.JPanel jPanelChangePass;
    private javax.swing.JPanel jPanelUDel;
    private javax.swing.JTextField jTextFieldChangePassUser;
    private javax.swing.JTextField jTextFieldCurrentDB;
    private javax.swing.JTextField jTextFieldDBName;
    private javax.swing.JTextField jTextFieldNewPass;
    private javax.swing.JTextField jTextFieldOldPass;
    private javax.swing.JTextField jTextFieldPass;
    private javax.swing.JTextField jTextFieldResInv;
    private javax.swing.JTextField jTextFieldResPur;
    private javax.swing.JTextField jTextFieldUserAdd;
    private javax.swing.JTextField jTextFieldUserDel1;
    // End of variables declaration//GEN-END:variables
}
