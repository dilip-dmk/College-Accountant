package properties;

import java.io.File;
import javax.swing.filechooser.FileSystemView;

/**
@author Dilip Pc
 */

public class ProjResouces 
{
    public static String logFileCreation(int logType)
    {
        boolean flag = false;
        boolean dirFlag = false;
        String loginlocation = null;
    
        FileSystemView fsv = FileSystemView.getFileSystemView();
        File dir_location =  new File(fsv.getHomeDirectory()+"\\log");
        dirFlag = dir_location.mkdir();
        
        if(logType==1)
        {
            File location = new File(fsv.getHomeDirectory().toString()+"\\log\\loginTrace.txt");
            loginlocation = location.toString();
            try
            {   
                flag = location.createNewFile();
            }
            catch(Exception e)
            {
                System.out.println("Error in writting log file: "+e.getMessage());
            }
      
            System.out.println("location: "+location+" : flag : "+flag+" loginlocation "+loginlocation);
        }
        return loginlocation;
    }
    
    public static String LOGIN_LOG_PATH = ProjResouces.logFileCreation(1);
}
