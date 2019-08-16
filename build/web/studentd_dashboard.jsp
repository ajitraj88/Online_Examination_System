<%@ page import="java.io.*" %>
<%@ page import="java.sql.*" %>
<%@ page import="javax.servlet.*" %>
<%@ page import="javax.servlet.http.*" %>
<%@ page import="jdbc.*" %>

<!doctype html>
<head lang="en">
    <title>ASSESS</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href='https://fonts.googleapis.com/css?family=Sofia' rel='stylesheet'>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">

    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

    <!-- Popper JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>


    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>


</head>

<body>

    <%

        if (request.getSession().getAttribute("name") == null) {

            response.sendRedirect("invalid.html");

        } else {
            HttpSession sessoin1 = request.getSession(true);
            String name = (String) request.getSession().getAttribute("name");
            String college = (String) request.getSession().getAttribute("college");
            String course = (String) request.getSession().getAttribute("course");
            String email = (String) request.getSession().getAttribute("emailid");
            String mob_no = (String) request.getSession().getAttribute("mob_no");
            String year = (String) request.getSession().getAttribute("year");

            if (name != null)

    %>

    <div class="container-fluid">

        <div style="background-color: #444"><br></div>
        <div style="padding-top:8px; padding-bottom: 8px ">
            <img src="test.png" height="80px"><span style="font-family: sofia;font-size: 30px"> ASSESS</span> <span style="float: right ">Hi , <% out.println(name); %></span>
        </div>

        <div>

            <nav class="navbar navbar-expand-sm bg-dark navbar-dark sticky-top">
                <ul class="navbar-nav">

                    <li class="nav-item"><a class="nav-link active" href="studentd_dashboard.jsp">DASHBOARD</a></li>
                    <li class="nav-item"><a class="nav-link" href="test_yourself1.jsp">TEST</a></li>
                    <li class="nav-item"><a class="nav-link" href="LogOut">Logout</a></li>

                </ul></nav>

        </div> 
        <br>

        <div class="row">

            <%

                String name1 = name;
                String dir = "Profile_pics" + File.separator + name1 + File.separator + "pic.jpg";
                System.out.println(dir);
            %>
            <div class="col-4"><img src="<% out.println(dir); %>" alt="<% out.println(name); %>" ></div>
            <div class="col-8">


                <pre >

                    <% out.println("     NAME:           " + name); %>
                    <% out.println("     COLLEGE:        " + college + ""); %>  
                    <% out.println("     COURSE:         " + course + ""); %>
                    <% out.println("     YEAR:           " + year + ""); %>
                    <% out.println("     EMAIL ID:       " + email + ""); %>
                    <% out.println("     MOBILE NUMBER:  " + mob_no + "");
                        }%>
            
            change password
            
           <a href="result.jsp">RESULT</a>
	
                    
                </pre>


            </div>


        </div>

        <br> 
        <br>
        <div style="background-color:#333; text-align: right; font-family: sans-serif;font-size: 8px" class="text-muted">

            Developed by Vinay Pundir & co.</div>



    </div>


</body>
</html>