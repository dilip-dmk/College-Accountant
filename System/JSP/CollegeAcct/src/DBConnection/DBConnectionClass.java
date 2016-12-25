package DBConnection;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import java.io.Reader;

public class DBConnectionClass {
	
	 public static SqlMapClient getDBAccess()
	    {
	        
	         
	        SqlMapClient smc = null;
	        try{
	            Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml");
	            smc = SqlMapClientBuilder.buildSqlMapClient(rd);
	        }
	        catch(Exception e){
	            System.out.println(": DBConnection : SqlMapClient : "+e.getMessage());
	        }
	        return smc;
	    }

}
