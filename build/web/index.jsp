
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
    <style>
        .image-container{
            position: relative;

        }
        .image-container .image-button{
             position: absolute;
  top: 60%;
  left: 50%;
  
  
  transform: translate(-50%, -50%);
  -ms-transform: translate(-50%, -50%);
  background-color: #555;
  color: white;
  font-size: 16px;
  padding: 12px 24px;
  border: none;
  cursor: pointer;
  border-radius: 5px;

        }
         .image-button:hover {
  background-color:cadetblue;
}
        .image-text{
            font-family: "sofia";
            font-size: 35px;
            color: #eee;
            position: absolute;
            top: 25%;
            left:30%;
        }
    </style>
</head>

<body>
    <%
     if(request.getSession().getAttribute("name")!=null){
            
            response.sendRedirect("studentd_dashboard.jsp");
            
            
            }
     else
    
    %>
    
    
    <div >
        <div style="background-color: #444"><br></div>
        <div style="padding-top:8px; padding-bottom: 8px ">
            <img src="test.png" height="80px"><span style="font-family: sofia;font-size: 30px"> ASSESS</span>
            <form style="float: right ; padding-top: 20px" class="form-inline" action="LoginRequest" method = "post">

  <input type="text" name="uname" maxlength="100" class="form-control" id="email" placeholder="username"><pre>  </pre>

  <input type="password" name="pass" maxlength="100" class="form-control" id="pwd" placeholder="password"><pre>  </pre>

  <button type="submit"  class="btn btn-primary" style="background-color: cadetblue;border-color: cadetblue">LOGIN</button>
</form></div>



       <nav class="navbar navbar-expand-sm bg-dark navbar-dark sticky-top">
        <ul class="navbar-nav">
            <li class="nav-item"><a class="nav-link active" href="index.jsp">HOME</a></li>
            <li class="nav-item"><a class="nav-link" href="test_yourself.jsp">TEST Yourself</a></li>
            <li class="nav-item"><a class="nav-link" href="join_us.jsp">JOIN US</a></li>
            <li class="nav-item"><a class="nav-link" href="about_us.jsp">ABOUT US</a></li>
          </ul></nav>

         <div style="padding-top: 8px;padding-bottom: 8px" class="image-container">
                <img width="100%"  src="test2.jpg">
                <div class="image-text ">ASSESS your skills, learn and compete.</div>
               <a href="SignUpPage.jsp"> <button class="image-button">SIGN UP</button></a>

             </div>

        <div style="background-color:#333; text-align: right; font-family: sans-serif;font-size: 8px" class="text-muted">

        Developed by Vinay pundir & co.</div>



    </div>


</body>
</html>
