package utils;

import properties.ProjResouces;
import com.ibatis.sqlmap.client.SqlMapClient;
import dao.DBConnection;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
@author Dilip Pc
 */

public class LoginUtils 
{
    
    public static ArrayList getLoginInfo(String userName)
    {
        try
        {
            FileOutputStream f = new FileOutputStream(ProjResouces.LOGIN_LOG_PATH);
            System.setErr(new PrintStream(f));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        ArrayList<String> loginDetailList = new ArrayList<String>();
        try
        {
            SqlMapClient smc = DBConnection.getDBAccess();
            List<Map<String,Object>> getloginResult = (List<Map<String,Object>>) smc.queryForList("CollegeAccountDB.getLoginDetail",userName);
        
            for (Map<String,Object> loginResultMap : getloginResult) 
            {
                loginDetailList.add((String)loginResultMap.get("username"));
                loginDetailList.add((String)loginResultMap.get("userpassword"));
                loginDetailList.add((String)loginResultMap.get("accountflag"));
                
                System.err.println( new Date().toString()+":LoginUtils: "+"loginResultMap.get(\"username\") : "+loginResultMap.get("username"));
            }
             
        }
        catch(Exception e){
            System.err.println( new Date().toString()+":LoginUtils: "+e.getMessage());
        }
        return loginDetailList;
    }
}
