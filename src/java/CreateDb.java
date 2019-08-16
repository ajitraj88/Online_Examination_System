import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Random;


public class CreateDb extends HttpServlet{

	PrintWriter pw;
	
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
	
	PrintWriter pw=response.getWriter();
			
	
	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rblaster_vinay","rblaster_java","leN7RSp@l");
		
		Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
		Random rd=new Random();
		for(int i=0;i<10000;i++){
			
			int ans=rd.nextInt(4)+1;
			st.executeUpdate("insert into c_language_question values('"+(i+1)+"','c_question_"+(i+1)+" and its answer is "+(ans)+"','op_a','op_b','op_c','op_d','"+(ans)+"')");
			
				}
			pw.println("completed");
					}catch(Exception e){
						pw.println("Exception"+e);
		
		}

	
	}


}