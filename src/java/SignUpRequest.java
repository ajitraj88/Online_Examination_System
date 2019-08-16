
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import jdbc.JdbcConnection;

public class SignUpRequest extends HttpServlet {

    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        PrintWriter obj = res.getWriter();
        res.setContentType("text/html");

        FileInputStream fin = new FileInputStream(new File("C:\\Users\\vinay\\Documents\\NetBeansProjects\\webapp\\web\\Tmp\\tmp.txt"));

        String str = "";
        int b;
        while ((b = fin.read()) > 0) {
            str += (char) b;
        }

        obj.print(str);
        /*
        
        String name = req.getParameter("name");
        String mob = req.getParameter("mob");
        String course = req.getParameter("course");
        String year = req.getParameter("year");
        String pass = req.getParameter("pass");
        String emailid = req.getParameter("email");
        String college = req.getParameter("college");

        HttpSession session = req.getSession();
        session.setAttribute("name", name);

        try {

            obj.println("a");

            Class.forName("com.mysql.jdbc.Driver");

            Connection con = JdbcConnection.getConnection(obj);

            //Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rblaster_vinay","rblaster_java","leN7RSp@l");
            PreparedStatement ps = con.prepareStatement("select * from register where email=? and password=?");
            ps.setString(1, emailid);
            ps.setString(2, pass);

            ResultSet rs = ps.executeQuery();

            int i = 0;

            while (rs.next()) {

                i++;

            }

            if (i >= 1) {

                obj.println("<html>");
                obj.println("<body>");
                obj.println("username and password are already register<br><br>");
                obj.println("<a href=\"index.jsp\">");
                obj.println("Login</a>");
                obj.println("<br><br>");
                obj.print("<a href=\"/SignUpPage.jsp\">");
                obj.println("Sign up</a>");
                obj.println("</body>");
                obj.println("</html>");

            } else {

                PreparedStatement ps1 = con.prepareStatement("insert into register(name,password,course,year,mobile_no,email,college) values(?,?,?,?,?,?,?)");
                ps1.setString(1, name);
                ps1.setString(2, pass);
                ps1.setString(3, course);
                ps1.setString(4, year);
                ps1.setString(5, mob);
                ps1.setString(6, emailid);
                ps1.setString(7, college);

                int result = ps1.executeUpdate();

                if (result == 1) {

                    res.sendRedirect("Upload.jsp");

                } else {

                    res.sendRedirect("error.html");

                }
            }
        } catch (Exception e2) {

            obj.println(e2);
        }*/
    }
}
