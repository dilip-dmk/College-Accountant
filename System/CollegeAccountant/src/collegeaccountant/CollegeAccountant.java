package collegeaccountant;


import javax.swing.filechooser.FileSystemView;
import login.LoginScreen;
import properties.ProjResouces;

/**
@author Dilip Pc
 */

public class CollegeAccountant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ProjResouces resource = new ProjResouces();
            
        LoginScreen logScreen = new LoginScreen();
        logScreen.setSize(800, 550);
        logScreen.setLocationRelativeTo(null);
        logScreen.setVisible(true);
    }
    
}
