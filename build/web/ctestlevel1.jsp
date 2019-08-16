<%@ page import="java.io.*" %>
<%@ page import="java.sql.*" %>
<%@ page import="javax.servlet.*" %>
<%@ page import="javax.servlet.http.*" %>
<%@ page import="java.util.Random" %>
<%@ page import="jdbc.*" %>

<html>

    <%

            
        
        if (request.getSession().getAttribute("name") == null) {

            response.sendRedirect("invalid.html");
        }

        String questions = request.getParameter("q");
       // out.println(questions);
        String option_a = request.getParameter("o_a");

        String option_b = request.getParameter("o_b");
        String option_c = request.getParameter("o_c");
        String option_d = request.getParameter("o_d");
        String i = request.getParameter("q_no");


    %>
    <body>
        <form action="result.jsp" method="post">


            <%    try {
                    String qno = "Q" + i;
                    out.println(qno + " ");
                    out.print(questions);

                    String ans = "<ul class=\"answers\" id=\"answer\">  "
                            + "		<input type=\"radio\" name=" + qno + "  value=\"1\" />"+option_a+"</br>   "
                            + "		<input type=\"radio\" name=" + qno + "  value=\"2\" />"+option_b+"</br>   "
                            + "		<input type=\"radio\" name=" + qno + "  value=\"3\" />"+option_c+"</br>   "
                            + "		<input type=\"radio\" name=" + qno + "  value=\"4\" />"+option_d+"</br>   "
                            + "		</ul></a>";

                    out.println(ans);
                       
                    out.println(session.getAttribute("answer"));

                } catch (Exception e) {
                    out.println(e);
                }
            %>

            <br><button type="button" id="getPrevQuestion" onclick="prevQuestion">
          <br> <button type="button" id="getQuestion" onClick="nextQuestion()">next</button>
            
<script>
     function nextQuestion() {
      
     document.location.href="./GetQuestion?ans="+document.getElementsById(answer).value+"";     
     }

     function prevQuestion(){
         document.location.href="./GetPrevQuestion";
         
     }
 </script>
</body>
</html>