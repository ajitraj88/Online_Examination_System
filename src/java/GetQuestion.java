
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import jdbc.JdbcConnection;

@WebServlet(urlPatterns = {"/GetQuestion"})
public class GetQuestion extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("inside question");

        int i = 0;

        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession();
        i = (int) (session.getAttribute("qno"));

        String[] resArr = (String[]) (session.getAttribute("resArray"));

        if (request.getParameter("question").equals("submit")) {
            
            out.print(i);
            session.setAttribute("qno", i +1);

            System.out.println("before return");
            return;
            
        }

        if (request.getParameter("question").equals("getnextquestion")) {
            System.out.println("/nNext question called/n/n/n/n");

            out.print(i);
            session.setAttribute("qno", i + 1);

            return;

        }
        if (request.getParameter("question").equals("getprevquestion")) {
            System.out.println("/nPrev question called/n/n/n/n");

            out.print(i);
            session.setAttribute("qno", i - 1);

            return;
        }

        i = Integer.parseInt(request.getParameter("question"));
        //System.out.println(i);
        String answ = (request.getParameter("answer"));
        if (answ.equals("undefined")) {
            resArr[i - 1] = "0";
            System.out.println(resArr[i]);
            session.setAttribute("resArray", resArr);
        } else {
            resArr[i - 1] = answ;
            System.out.println(resArr[i]);
            session.setAttribute("resArray", resArr);
        }

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        try {
            Connection con = JdbcConnection.getConnection(out);
            Statement st = con.createStatement();
            String stmt = "select * from c_language_question where sno='" + i + "'";
            ResultSet rs = st.executeQuery(stmt);
            String questiontext = null;
            String option_a = null;
            String option_b = null;
            String option_c = null;
            String option_d = null;
            String answer = null;

            while (rs.next() && i <= 20) {
                questiontext = rs.getString("questions");
                option_a = rs.getString("option_a");
                option_b = rs.getString("option_b");
                option_c = rs.getString("option_c");
                option_d = rs.getString("option_d");
                answer = rs.getString("answers");

                //String str="ctestlevel1.jsp?q="+question+"&o_a="+option_a+"&o_b="+option_b+"&o_c="+option_d+"&o_d="+option_d+"&q_no="+i+"";
                response.getWriter().print("" + questiontext + "  ");
                //break;
                //response.sendRedirect(str);

                // res[i] = request.getParameter("ans");
                //res[i - 1] = request.getParameter("answer");
                //request.getSession().setAttribute("answer",res[i]);
                i++;

                session.setAttribute("qno",i);
                /* for(int i=0;i<res.length;i++){
            out.print(res[i]);
            }*/
            }
            System.out.println("\n\nAfter while:");
            if (i == 21) {
                i = 1;
            }

        } catch (Exception e) {
            System.out.println("Exception here is" + e);
        }
    }

}
