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
            <img src="test.png" height="80"><span style="font-family: sofia;font-size: 30px"> ASSESS</span> <span style="float: right ">Hi, user  </span>
            </div>
        
   <div>
    
       <nav class="navbar navbar-expand-sm bg-dark navbar-dark sticky-top">
        <ul class="navbar-nav">
      
            <li class="nav-item"><a class="nav-link" href="teacher_dashboard.jsp">DASHBOARD</a></li>
            <li class="nav-item"><a class="nav-link active" href="contribute.jsp">CONTRIBUTE</a></li>
          
          </ul></nav>
       
         </div> 
        <br>
        
           <div style="font-family: sofia; font-size: 35px; text-align: center" >ADD question</div>
        
        <div class="container" >
        
        <form action="TeacherContribution" method="post" class="form-group " ><br>
             <input type="text" name="subject" placeholder="subject" class="form-control"><br>
		
             
            <select name="level" placeholder="Select level" class="form-control">
                <option value="1">Level 1</option>
                <option value="2">Level 2</option>
                <option value="3">Level 3</option></select><br>
            <input type="text" name="question" placeholder="Write your question here........" class="form-control"><br>

		<input type="text" name="option_a" placeholder="option_a" class="form-control"><br>
		<input type="text" name="option_b" placeholder="option_b" class="form-control"><br>
		<input type="text" name="option_c" placeholder="option_c" class="form-control"><br>
		<input type="text" name="option_d" placeholder="option_d" class="form-control"><br>
            <input type="text" name="answer" placeholder="Write your answer" class="form-control"><br>
             
            
   <input type="submit" value="ADD QUESTION" class="form-control btn btn-primary" style="background-color: cadetblue; color: aliceblue;border-color: cadetblue" data-toggle="modal" data-target="#myModal" > <br>
            
     
        </form>
            
  
          <!-- The Modal -->
  <div class="modal fade" id="myModal">
    <div class="modal-dialog">
      <div class="modal-content">
      
        <!-- Modal Header -->
        <div class="modal-header">
          <h4 class="modal-title">Question Added SUCCESSFULLY</h4>
          <button type="button" class="close" data-dismiss="modal">&times;</button>
        </div>

 <div class="modal-footer">
     <a href="contribute.jsp">   <button type="button" class="btn btn-primary" >Add another question</button> </a> 
      </div>
        
       
        
       
        
      </div>
    </div>
  </div>
                
        
        </div> 
        
        </div>
        
        
        
        
        
        
        
       <br> 
        <br>
        <div style="background-color:#333; text-align: right; font-family: sans-serif;font-size: 8px" class="text-muted">
        
        Developed by Vinay pundir & co.</div>
    
    
    
    </div>


</body>
</html>