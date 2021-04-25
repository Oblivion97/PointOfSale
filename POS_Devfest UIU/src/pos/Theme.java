package pos;

import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Theme implements Serializable {

    public Color colorBck = new Color(83,48,70); 
    public Color colorBtn = new Color(235,220,178);
    public Color colorTxtField = new Color(204, 204, 255);
    public Color colorLabel = new Color(235, 220, 178);
    public Color colorTxt = new Color(45, 50, 65);

    public void saveTheme(Theme theme) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("themedata.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(theme);
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

    public  Theme getTheme() {
        Theme theme = null;
        try {
            FileInputStream fis = new FileInputStream("themedata.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            theme = (Theme) ois.readObject();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return theme;
    }

    @Override
    public String toString() {
        return "Theme{" + "colorBck=" + colorBck + ", colorBtn=" + colorBtn + ", colorTxtField=" + colorTxtField + ", colorLabel=" + colorLabel + ", colorTxt=" + colorTxt + '}';
    }

    public Theme() {
    }

    
}
