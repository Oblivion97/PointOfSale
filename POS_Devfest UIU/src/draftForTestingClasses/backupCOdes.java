package draftForTestingClasses;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import pos.Cart;
import pos.Features;
import pos.Product;

/** 
  @author Mir Ferdous 
 */
public class backupCOdes {

    
    
    /*
      private void jButtonAddToCartActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        try {
            String id_prdt = "";
            int quantity = 0;

            if (!jTextFieldQuantity.getText().equals("")) {
                quantity = Integer.parseInt(jTextFieldQuantity.getText());
            }

            try {
                id_prdt = jTableInventory.getValueAt(jTableInventory.getSelectedRow(), 0).toString();
                // System.out.println(id_prdt);

                if (!id_prdt.equals("")) {
                    if (quantity >= 0) {
                        Product prdtTemp = inventory.searchProductByID(id_prdt);
                        prdtTemp.setQuantity(quantity);
                        Cart.prdtList.add(prdtTemp);
                        // popup dialog
                        UIManager UI = new UIManager();
                        UI.put("OptionPane.background", Features.theme.colorBck);
                        UI.put("Panel.background", Features.theme.colorBck);
                        JOptionPane.showMessageDialog(this, prdtTemp.name + " Added to Cart");
                    } else {
                        // popup dialog
                        UIManager UI = new UIManager();
                        UI.put("OptionPane.background", Features.theme.colorBck);
                        UI.put("Panel.background", Features.theme.colorBck);
                        JOptionPane.showMessageDialog(this, "Please Set Quantity");
                    }
                } else {
                    // popup dialog
                    UIManager UI = new UIManager();
                    UI.put("OptionPane.background", Features.theme.colorBck);
                    UI.put("Panel.background", Features.theme.colorBck);
                    JOptionPane.showMessageDialog(this, "Please Select a Product");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                 e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }          
      
      */
}
