package sql;
	import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
	import javax.servlet.http.*;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;

	@WebServlet("/zcsql")
	public class zcsql extends HttpServlet{
		private static final long serialVersionUID = 1L;
		   Connection dbconn = null;
		   public void init() 
		   {
		      String driver = "com.mysql.cj.jdbc.Driver";
		      
		      String dburl = "jdbc:mysql://127.0.0.1:3306/ygq?useSSL=true&serverTimezone=UTC";
		      
		      String username = "root";
		      
		      String password = "root";
		      
		      try
		      {
		          Class.forName(driver); // ������������
		          
		          // �������Ӷ���
		          dbconn = DriverManager.getConnection(dburl,username,password);
		          
		      }
		      catch(ClassNotFoundException e1)
		      {
		          System.out.println(e1);
		          getServletContext().log("�����������Ҳ�����");   
		      }catch(SQLException e2){
		    	  System.out.println(e2);
		      }
		   }
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
	{
		//�������
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		response.setHeader("content-type","text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
	    String username = request.getParameter("username");
	    String password = request.getParameter("password");
	    
	    
	    
	     
	      String sql="INSERT INTO ygq VALUES(?,?)";
	      
	       
		try {
			PreparedStatement pstmt = dbconn.prepareStatement(sql);
			 pstmt.setString(1,username);
		      pstmt.setString(2,password);
		      
		      
		      int n = pstmt.executeUpdate();
		      //out.print(n);
		      if(n==1) {	//�Ƿ����ɹ�
		    	 out.print("<script>alert('ע��ɹ���')</script>");

		 		response.setHeader("refresh", "1;url=dl.jsp");
		      }else {
		    	  out.print("<script>alert('ע��ʧ�ܣ�������ע�ᣡ')</script>");
		    	  response.setHeader("refresh", "1;url=zc.jsp");
		    	  
		      }
		      
		      
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	      
	    
	     
	      
	 
}
}
