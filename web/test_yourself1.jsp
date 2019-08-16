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
        
    //HttpSession session1=(HttpSession)request.getSession();
    if(session==null){
    response.sendRedirect("invalid.html");
    
    }
    Integer i=new Integer(1);
    session.setAttribute("qno",i);
    String result[]=new String[21];
    for(int j=0;j<20;j++){
        result[j]="0";
    }
    session.setAttribute("resArray",result);
    
        %>
    <div class="container-fluid">
       
        <div style="background-color: #444"><br></div>
        <div style="padding-top:8px; padding-bottom: 8px ">
            <img src="test.png" height="80"><span style="font-family: sofia;font-size: 30px"> ASSESS</span> <span style="float: right ">Hi, user  </span>
            </div>
        
   <div>
    
       <nav class="navbar navbar-expand-sm bg-dark navbar-dark sticky-top">
        <ul class="navbar-nav">
      
            <li class="nav-item"><a class="nav-link " href="studentd_dashboard.jsp">DASHBOARD</a></li>
            <li class="nav-item"><a class="nav-link active" href="test_yourself1.jsp">TEST</a></li>
          
          </ul></nav>
       
         </div> 
       <br> 
        <div class="row">
     <div class="col">   <strong>C</strong>
        <ul class="list-group">
  <li class="list-group-item"><a href="questions.jsp">level 1</a></li>
  <li class="list-group-item">Level 2</li>
  <li class="list-group-item">Level 3</li>
         </ul></div>
        
        
        
     <div class="col">   <strong>JAVA</strong>
        <ul class="list-group">
  <li class="list-group-item">level 1</li>
  <li class="list-group-item">Level 2</li>
  <li class="list-group-item">Level 3</li>
         </ul></div>
        
        
     <div class="col">   <strong>PYTHON</strong>
        <ul class="list-group">
  <li class="list-group-item">level 1</li>
  <li class="list-group-item">Level 2</li>
  <li class="list-group-item">Level 3</li>
</ul>
        </div>
            
        </div>
        <br>
        <div class="row">
     <div class="col">   <strong>Data Structure</strong>
        <ul class="list-group">
  <li class="list-group-item">level 1</li>
  <li class="list-group-item">Level 2</li>
  <li class="list-group-item">Level 3</li>
         </ul></div>
        
        
        
     <div class="col">   <strong>Aptitude</strong>
        <ul class="list-group">
  <li class="list-group-item">level 1</li>
  <li class="list-group-item">Level 2</li>
  <li class="list-group-item">Level 3</li>
         </ul></div>
        
        
     <div class="col">   <strong> Kaun Banega crorepati</strong>
        <ul class="list-group">
  <li class="list-group-item">level 1</li>
  <li class="list-group-item">Level 2</li>
  <li class="list-group-item">Level 3</li>
</ul>
        </div>
            
        </div>
        <br>
        <div style="background-color:#333; text-align: right; font-family: sans-serif;font-size: 8px" class="text-muted">
        
        Developed by vinay pundir & co.</div>
    
    
    
    </div>


</body>
</html>