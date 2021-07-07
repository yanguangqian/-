package wd;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.http.*;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

@WebServlet("/dl")
public class dl extends HttpServlet{
	private static final long serialVersionUID = 1L;
	   Connection dbconn = null;
	   public void init() 
	   {
	      String driver = "com.mysql.cj.jdbc.Driver";
	      
	      String dburl = "jdbc:mysql://127.0.0.1:3306/ygq?useSSL=false&serverTimezone=UTC";
	      
	      String username = "root";
	      
	      String password = "root";
	      
	      try
	      {
	          Class.forName(driver); // 加载驱动程序
	          
	          // 创建连接对象
	          dbconn = DriverManager.getConnection(dburl,username,password);
	          
	      }
	      catch(ClassNotFoundException e1)
	      {
	          System.out.println(e1);
	          getServletContext().log("驱动程序类找不到！");   
	      }catch(SQLException e2){
	    	  System.out.println(e2);
	      }
	   }

public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
{
	request.setCharacterEncoding("utf-8");
	 response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		response.setHeader("content-type","text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
	    String username = request.getParameter("sno");
	    String password = request.getParameter("sname");
	    String dbUser;
	    String dbPass;

	      String sql="SELECT * FROM ygq WHERE username = ?";

			PreparedStatement pstmt;
			try {
				
				pstmt = dbconn.prepareStatement(sql);
				 pstmt.setString(1,username);
			      //pstmt.setString(2,password);
		
				 ResultSet rst = pstmt.executeQuery();
			      //out.print(n);
				 while(rst.next())
			        {
			           
					 dbUser = rst.getString("username");
			         dbPass = rst.getString("password");
			         if(dbUser.equals(username)) {
			        	 
			        	 if(dbPass.equals(password)) {
			        		 request.getSession().setAttribute("userId",username);
			        		 out.print("<script>alert('登录成功')</script>");
			        		 response.setHeader("refresh", "1;url=wenda.jsp");
			        		 
			        	 }else {
			        		 out.print("<script>alert('密码错误，登录失败')</script>");
			        		 response.setHeader("refresh", "1;url=dl.jsp");
			        	 }
			        	 
			         }else {
			        	 out.print("<script>alert('没有该用户，登录失败')</script>");
			        	 response.setHeader("refresh", "1;url=dl.jsp");
			         }
			          
			           
			           
			        }
				 
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			
		      
   

	
	
	
	      
	    
	     
	      
	 



    
}
}