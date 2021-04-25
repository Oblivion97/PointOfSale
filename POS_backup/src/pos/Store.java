package pos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Store implements Serializable {

    private String name;
    private String address;
    private String phone;

    //***************Methods******************
    public static void saveStroreInfo(Store store) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("storedata.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(store);
            oos.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static Store getStoreInfo() {
        Store store = null;
        try {
            FileInputStream fis = new FileInputStream("storedata.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            store = (Store) ois.readObject();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return store;
    }

    @Override
    public String toString() {
        return "Store Name : " + name + "\n"
                + "Address : " + address + "\n"
                + "Phone : " + phone;
    }

    public String storeInfoAsPara() {
        return name + "\n"
                + "Address : " + address + "\n"
                + "Phone : " + phone;
    }

//*************************Get & SET********************
    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String aAddress) {
        address = aAddress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String aPhone) {
        phone = aPhone;
    }

}
