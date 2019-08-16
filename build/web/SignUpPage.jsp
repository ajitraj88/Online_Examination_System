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

<body >

   
        <div ><a href="index.jsp">     <button style="color:dimgrey;margin: 5px; background-color: #fff;border-color: cadetblue;border-radius: 5px">HOME</button></a></div>
        <div style="font-family: sofia; font-size: 35px; text-align: center" >Enter your details</div>

        <div class="container" >

        <form action="CreateFileRegister" method="POST" class="form-group " ><br>
             <input type="text" name="name" placeholder=" Name" class="form-control"><br>
	
<input type="text" name="college" placeholder="ENTER COLLEGE NAME" class="form-control"><br>

 <input type="text" name="mob" placeholder="Phone_number" class="form-control"><br>

            <select name="course" placeholder="course" class="form-control">
                <option>B.tech</option>
                <option>MCA</option>
                <option>other</option></select><br>
            <select name="year" placeholder="year" class="form-control">

                <option value="first">1</option>
                <option value="second">2</option>
                <option value="third">3</option>
                <option value="fourth">4</option>
              </select><br>
	<input type="email" name="email" placeholder="enter email id" class="form-control"><br>
           
             <input type="password" name="pass" placeholder="password"  class="form-control"><br><br>
		<br><br>
   <input type="submit" value="SIGN UP" class="form-control btn btn-primary" style="background-color: cadetblue; color: aliceblue;border-color: cadetblue" data-toggle="modal" data-target="#myModal" /> <br>

     
        </form>


          <!-- The Modal -->
  <div class="modal fade" id="myModal">
    <div class="modal-dialog">
      <div class="modal-content">

        <!-- Modal Header -->
        <div class="modal-header">
          <h4 class="modal-title">Sign Up SUCCESSFULLY</h4>
          <button type="button" class="close" data-dismiss="modal">&times;</button>
        </div>

 <div class="modal-footer">
     <a href="index.jsp">   <button type="button" class="btn btn-primary" >LOGIN</button> </a>
      </div>





      </div>
    </div>
  </div>


        </div>







        <div style=" text-align:right; font-family: sans-serif;font-size: 10px" class="text-muted">

        Developed by Vinay Pundir & co.</div>






</body>
</html>
