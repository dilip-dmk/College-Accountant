package loginInfo;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import DBConnection.DBConnectionClass;

import com.ibatis.sqlmap.client.SqlMapClient;
import java.awt.Color;
import java.awt.List;
import java.io.FileOutputStream;
import java.io.PrintStream;

import java.util.ArrayList;
import java.util.Map;

public class OnServletLogin extends HttpServlet  
{
    protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		String user=req.getParameter("loginId");
		String pass=req.getParameter("password");
		
		ArrayList<String> loginInfo = new ArrayList<String>();
		
		loginInfo = getLoginInfo();
		System.out.println("list size ::"+loginInfo.size());
		String userNameDB = loginInfo.get(0);
		String passDB = loginInfo.get(1);
		
		if(user.equalsIgnoreCase(userNameDB) && pass.equalsIgnoreCase(passDB))
		{
			res.sendRedirect("Home.jsp");
			
			System.out.println("login id pwd are same");
		}
		else
		{
			res.sendRedirect("Error.jsp");
			System.out.println("login id pwd are NOT SAME");
		}
			
		System.out.println("DB details ::"+userNameDB+":::password ::"+passDB);
		
		
		
		
		
		/*pw.print("<font face='verdana'>");

	        if(user.equals("admin")&&pass.equals("admin"))
			pw.println("Login Success...!");
			else
			pw.println("Login Failed...!");
	        
	    pw.print("</font>");
		pw.close();*/
	
	}
    
    public static ArrayList getLoginInfo()
    {
         
        ArrayList<String> loginDetailList = new ArrayList<String>();
        try
        {
            SqlMapClient smc = DBConnectionClass.getDBAccess();
            java.util.List<Map<String,Object>> getloginResult = (java.util.List<Map<String,Object>>) smc.queryForList("CollegeAccountDB.getLoginDetail");
        
            for (Map<String,Object> loginResultMap : getloginResult) 
            {
                loginDetailList.add((String)loginResultMap.get("username"));
                loginDetailList.add((String)loginResultMap.get("userpassword"));
                
                
                System.out.println( ":LoginUtils: "+"loginResultMap.get(\"username\") : "+loginResultMap.get("username"));
            }
             
        }
        catch(Exception e){
            System.out.println(  ":LoginUtils: "+e.getMessage());
        }
        return loginDetailList;
    }

}
