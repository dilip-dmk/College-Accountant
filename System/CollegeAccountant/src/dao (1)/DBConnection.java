package dao;

import properties.ProjResouces;
import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.util.Date;

/**
@author Dilip Pc
 */

public class DBConnection {
    public static SqlMapClient getDBAccess()
    {
        try
        {
            FileOutputStream f = new FileOutputStream(ProjResouces.LOGIN_LOG_PATH);
            System.setErr(new PrintStream(f));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
         
        SqlMapClient smc = null;
        try{
            Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml");
            smc = SqlMapClientBuilder.buildSqlMapClient(rd);
        }
        catch(Exception e){
            System.err.println(new Date().toString()+": DBConnection : SqlMapClient : "+e.getMessage());
        }
        return smc;
    }
}
