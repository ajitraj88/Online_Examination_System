   
import java.io.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import jdbc.JdbcConnection;

public class LoginRequest extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        String email = req.getParameter("uname");
        String pass = req.getParameter("pass");
        PrintWriter pw = res.getWriter();
        try {
            /*Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexaminationsystem","root","vinay");*/

            Connection con = JdbcConnection.getConnection(pw);
            PreparedStatement ps = con.prepareStatement("select * from register where email=? and password=?");

            ps.setString(1, email);
            ps.setString(2, pass);

            ResultSet rs = ps.executeQuery();

            PreparedStatement ps1 = con.prepareStatement("select * from teacherdata where firstname=? and pass=?");

            ps1.setString(1, email);
            ps1.setString(2, pass);

            ResultSet rs1 = ps1.executeQuery();

            int i = 0;

            String course = null;
            String year = null;
            String mob_no = null;
            String emailid = null;
            String college = null;
            String name = null;

            while (rs.next()) {
                i++;
                name = rs.getString("name");
                course = rs.getString("course");
                year = rs.getString("year");
                mob_no = rs.getString("mobile_no");
                emailid = rs.getString("email");
                college = rs.getString("college");

            }

            int j = 0;
            while (rs1.next()) {
                j++;
            }

            HttpSession session = req.getSession();
            if (i >= 1) {

                session.setAttribute("name", name);
                session.setAttribute("emailid", email);
                session.setAttribute("course", course);
                session.setAttribute("year", year);
                session.setAttribute("mob_no", mob_no);
                session.setAttribute("college", college);

                pw.println("hello " + email);

                res.sendRedirect("studentd_dashboard.jsp");
            } else if (j >= 1) {
                session.setAttribute("emailid", email);
                pw.println("hello " + email);
                res.sendRedirect("contribute.jsp");
            } else {
                res.sendRedirect("invalid.html");
            }
        } catch (SQLException | IOException e2) {
            pw.println(e2);
        } catch (Exception ex) {
            Logger.getLogger(LoginRequest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
