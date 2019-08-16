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
    <div class="container-fluid">
        <div style="background-color: #444"><br></div>
        <div style="padding-top:8px; padding-bottom: 8px ">
            <img src="test.png" height="80" ><span style="font-family: sofia;font-size: 30px"> ASSESS</span>
           </div>
        
    
    
       <nav class="navbar navbar-expand-sm bg-dark navbar-dark sticky-top">
        <ul class="navbar-nav">
            <li class="nav-item"><a class="nav-link active" href="index.jsp">HOME</a></li>
            <li class="nav-item"><a class="nav-link" href="test_yourself.jsp">TEST Yourself</a></li>
            <li class="nav-item"><a class="nav-link" href="join_us.jsp">JOIN US</a></li>
            <li class="nav-item"><a class="nav-link" href="about_us.jsp">ABOUT US</a></li></ul></nav>
       <div>
        <pre>
        <strong style="font-size: 25px">Do you like to create problems?</strong>
           Then join us now and publish your questions here.
           </pre> 
           <hr></div>
               <div class="container" >
        
        <form action="/WebApplication1/TeacherSignUp" method="post" class="form-group " ><br>
             <input type="text" name="firstname" placeholder="First Name" class="form-control"><br>
             <input type="text" name="lastname" placeholder="Last Name" class="form-control"><br>
            
            <input type="text" name="email" placeholder="email_id" class="form-control"><br>
            <input type="text" name="phone" placeholder="Phone_number" class="form-control"><br>
             <input type="password" name="password" placeholder="password" id="pwd" class="form-control"><br><br>
            
   <input type="submit" value="JOIN US" class="form-control btn btn-primary" style="background-color: cadetblue; color: aliceblue;border-color: cadetblue"> <br>
            
     
                   </form></div>
            
  
    
        <div style="background-color:#333; text-align: right; font-family: sans-serif;font-size: 8px" class="text-muted">
        
        Developed by Vinay pundir & co.</div>
    
    
    
    </div>


</body>
</html>