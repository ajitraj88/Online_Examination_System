import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = {"/LogOut"})

public class LogOut extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();

	HttpSession session1=request.getSession();
	session1.invalidate();
	
	RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
	rd.forward(request,response);

	out.close();
	
	}
}