import java.io.*;
import javax.servlet.*;
import java.sql.*;
import javax.servlet.http.*;
public class TeacherSignUp extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
	PrintWriter obj=response.getWriter();
		try{
			
			
			String firstname=request.getParameter("firstname");
			String lastname=request.getParameter("lastname");
			String emailid=request.getParameter("email");
			String phone=request.getParameter("phone");
			String pass=request.getParameter("password");
			
			
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rblaster_vinay","rblaster_java","leN7RSp@l");
	PreparedStatement ps=con.prepareStatement("select * from teacherdata where firstname=? and lastname=? and pass=?");
	ps.setString(1,firstname);
	ps.setString(2,lastname);
	ps.setString(3,pass);
	ResultSet rs= ps.executeQuery();
	int i=0;
	while(rs.next()){
	i++;
	}
	if(i>=1){
	obj.println("<html>");
	obj.println("<body>");
	obj.println("username and password are already register<br><br>");
	obj.println("<a href=\"index.jsp\">");	
	obj.println("Login</a>");
	obj.println("<br><br>");
	obj.print("<a href=\"teacher_dashboard.jsp\">");
		obj.println("Join_Us</a>");
	obj.println("</body>");
	obj.println("</html>");
	}
	else{	
	PreparedStatement ps1=con.prepareStatement("insert into teacherdata(firstname,lastname,emailid,phone,pass) values(?,?,?,?,?)");
	ps1.setString(1,firstname);
	ps1.setString(2,lastname);
	ps1.setString(3,emailid);
	ps1.setString(4,phone);
	ps1.setString(5,pass);
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