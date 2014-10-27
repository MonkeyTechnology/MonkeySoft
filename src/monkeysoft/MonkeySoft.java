package monkeysoft;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import principal.Log;

/**
 *
 * @author Juan Camilo
 */
public class MonkeySoft {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), MonkeySoft.class.getName(), JOptionPane.ERROR_MESSAGE);
        }
        Log login = new Log();
        login.setLocationRelativeTo(null);
        login.show();
    }

}
