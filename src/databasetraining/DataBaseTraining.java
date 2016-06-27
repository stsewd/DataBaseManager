package databasetraining;

import gui.LoginWindow;
import javax.swing.UIManager;

/**
 *
 * @author santos
 */
public class DataBaseTraining {

    public static void main(String[] args) {
        try {
            //Look and feel para sistemas linux con gtk
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel"); 
        } catch (Exception e){
            try {
                //Look and feel para sistemas windows
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            } catch (Exception ex) {
                //Carga interfaz por defecto de java swing
            }
        } finally {
            LoginWindow loginWindow = new LoginWindow();
            loginWindow.setLocationRelativeTo(null);
            loginWindow.setVisible(true);
        }
    }
    
}
