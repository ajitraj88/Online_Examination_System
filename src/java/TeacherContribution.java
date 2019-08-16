import java.io.*;
import javax.servlet.*;
import java.sql.*;
import javax.servlet.http.*;
public class TeacherContribution extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
	PrintWriter obj=response.getWriter();
		try{
			
			
			String level=request.getParameter("level");
			String subject=request.getParameter("subject");
			String question=request.getParameter("question");
			String option_a=request.getParameter("option_a");
			String option_b=request.getParameter("option_b");
			String option_c=request.getParameter("option_c");
			String option_d=request.getParameter("option_d");
			String answer=request.getParameter("answer");
			
			
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rblaster_vinay","rblaster_java","leN7RSp@l");
	PreparedStatement ps=con.prepareStatement("select question from contribution where level=? and subject=?");
	ps.setString(1,level);
	ps.setString(2,subject);
	
	ResultSet rs= ps.executeQuery();
	int i=0;
	while(rs.next()){
	i++;
	}
	/*if(i>=1){
	obj.println("<html>");
	obj.println("<body>");
	obj.println("username and password are already register<br><br>");
	obj.println("<a href=\"/WebApplication1/index.jsp\">");	
	obj.println("Login</a>");
	obj.println("<br><br>");
	obj.print("<a href=\"join_us.jsp\">");
		obj.println("Join_Us</a>");
	obj.println("</body>");
	obj.println("</html>");
	}*/
	{	
	PreparedStatement ps1=con.prepareStatement("insert into contribution(subject,level,question,option_a,option_b,option_c,option_d,answer) values(?,?,?,?,?,?,?,?)");
	ps1.setString(1,subject);
	ps1.setString(2,level);
	ps1.setString(3,question);
	ps1.setString(4,option_a);
	ps1.setString(5,option_b);
	ps1.setString(6,option_c);
	ps1.setString(7,option_d);
	ps1.setString(8,answer);
	int result=ps1.executeUpdate();
	if(result==1)
	{
	response.sendRedirect("contribute.jsp");
	}
	else
	{
	response.sendRedirect("error.html");
	}
	}
		}catch(Exception e){
			obj.println(e);
		}
	}
	}
