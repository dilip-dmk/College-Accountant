package loginInfo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBConnection.DBConnectionClass;

import com.ibatis.sqlmap.client.SqlMapClient;

public class homePageServlet extends HttpServlet{

    protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		String studId=req.getParameter("studentId");
		String name=req.getParameter("studentName");
		String mobile=req.getParameter("mobile");
		String amount=req.getParameter("amount");
		
		System.out.println(studId);
		System.out.println(name);
		System.out.println(mobile);
		System.out.println(amount);
		
		 
	}
    
    
   

}
