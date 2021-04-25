package Design;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.RowSorter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import pos.Features;
import pos.Inventory;
import pos.Invoice;

public class Inventory_Frame extends javax.swing.JFrame {

    Inventory inventory = new Inventory();
    DefaultTableModel model = inventory.inventoryTableModel(inventory.inventoryLinkedListFromResultSet());

    public Inventory_Frame() {
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

        jLabelTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableInventory = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setTitle("INVENTORY");
        setMinimumSize(new java.awt.Dimension(1024, 710));

        jLabelTitle.setFont(new java.awt.Font("Arista 2.0 Light", 1, 36)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(235, 220, 178));
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("INVENTORY");
        jLabelTitle.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTableInventory.setBackground(new java.awt.Color(102, 102, 102));
        jTableInventory.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTableInventory.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTableInventory.setForeground(new java.awt.Color(255, 255, 255));
        jTableInventory.setModel(model);
        jTableInventory.setFocusable(false);
        jTableInventory.setOpaque(false);
        jTableInventory.setShowVerticalLines(false);
        jScrollPane1.setViewportView(jTableInventory);

        jLabel3.setBackground(new java.awt.Color(235, 220, 178));
        jLabel3.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void init() {

        jTableInventory.setSize(940, 580);
        jTableInventory.setColumnSelectionAllowed(false);
        jTableInventory.setDragEnabled(false);
         //sorting table
        RowSorter<TableModel> sorter = new TableRowSorter<TableModel>(model);
        jTableInventory.setRowSorter(sorter);

        jLabelTitle.setSize(1024, 60);
        setResizable(false);
        getContentPane().setBackground(Features.theme.colorBck);
        setTitle("Inventory");
        setSize(1024, 710);
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
            java.util.logging.Logger.getLogger(Inventory_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventory_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventory_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventory_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ShowInventory().setVisible(true);
//            }
//        });
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ShowInventory().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableInventory;
    // End of variables declaration//GEN-END:variables
}
