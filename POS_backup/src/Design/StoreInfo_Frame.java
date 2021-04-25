package Design;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import pos.Features;
import pos.Store;

public class StoreInfo_Frame extends javax.swing.JFrame {

    public StoreInfo_Frame() {
        initComponents();
        appIconSet();
        init();
    }

    public void init() {
        String s = "";
        Store store = null;
        try {
            store = new Store().getStoreInfo();
        } catch (Exception e) {
            e.printStackTrace();
        }

        s = store.toString();
        jTextAreaStoreInfo.append(s);

        getContentPane().setBackground(Features.theme.colorBck);
        setTitle("Store Info");
        setSize(830, 439);
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
            java.util.logging.Logger.getLogger(StoreInfo_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StoreInfo_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StoreInfo_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StoreInfo_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaStoreInfo = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setTitle("Store Info");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arista 2.0 Light", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(235, 220, 178));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Store Info");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(235, 220, 178)));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 800, 63);

        jTextAreaStoreInfo.setEditable(false);
        jTextAreaStoreInfo.setBackground(Features.theme.colorBck);
        jTextAreaStoreInfo.setColumns(20);
        jTextAreaStoreInfo.setFont(new java.awt.Font("Arista 2.0 Light", 1, 32)); // NOI18N
        jTextAreaStoreInfo.setForeground(new java.awt.Color(235, 220, 178));
        jTextAreaStoreInfo.setRows(5);
        jScrollPane1.setViewportView(jTextAreaStoreInfo);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(63, 87, 694, 280);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/sotreBck.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -5, 830, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaStoreInfo;
    // End of variables declaration//GEN-END:variables
}
