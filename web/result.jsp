<%@ page import="java.util.* "%>
<%@ page import="java.io.*" %>
<%@ page import="java.sql.*" %>
<%@ page import="javax.servlet.*" %>
<%@ page import="javax.servlet.http.*" %>

<html>
<head>
<style>
div{
position:fixed;
top:50%;
left:50%;
margin-top: -100px;
margin-left: -200px;
}</style>
</head>
<%
	 if(request.getSession().getAttribute("name")==null){
            
            response.sendRedirect("invalid.html");
            
            
            }


	

	PrintWriter pw=response.getWriter();
	response.setContentType("text/html");
	try{
	
	String[] ans=new String[10];

	for(int i=0;i<10;i++){
	String str="Q"+(i+1);
	ans[i]=request.getParameter(str);
	


	}

	Class.forName("com.mysql.jdbc.Driver");

	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rblaster_vinay","rblaster_java","leN7RSp@l");


	int score=0;
	int total_attempted=0;
	int wrong_attempted=0;
	int wright_attempted=0;
	

	for(int i=0;i<10;i++){

	PreparedStatement ps=con.prepareStatement("select answers from c_language_question where sno=?");

	ps.setInt(1,i+1);

	ResultSet rs= ps.executeQuery();

	while(rs.next()){

	String result=rs.getString("answers");
	

	if(ans[i]==null)
	score=score;

	 else if(result.equals(ans[i])){
	score++;
	wright_attempted++;
	}

			else if(!result.equals(ans[i])){
	if(ans[i]==null){
	score=score;
	}
	wrong_attempted++;
	score--;

	}
	}
	}

HttpSession session1=request.getSession();
session1.setAttribute("right_attempt",wright_attempted);
session1.setAttribute("wrong_attempt",wrong_attempted);
session1.setAttribute("total_attempt",total_attempted);
session1.setAttribute("score",score);


%>

<body>
<div >
<table>
    <tr>
        <th>  <a href="studentd_dashboard.jsp"> Profile</a>     </th>
        <th>        <th>
        <th>  <a href="LogOut"> Logout  </a>     </th>
        <th></th>
        
    </tr>
    <tr>
        <br>
        <br>
        
        </tr>
<tr>

    <th>   total attempt	<%  out.println(wrong_attempted+wright_attempted); %>	</th>
<th>   wrong attempt	<% out.println(wrong_attempted); %>	</th>
<th>   right attempt	<% out.println(wright_attempted); %>	</th>
<th>score		<% out.println(score); %></th>


<%
	}
catch(Exception e2){

	pw.println(e2);

}

%>
</tr>

<tr>

<th>		</th>
<th>		</th>
<th>		</th>
<th>		</th>
</tr>

</table>


</div>
</body>
</html>