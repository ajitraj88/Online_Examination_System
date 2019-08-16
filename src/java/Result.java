
import java.util.*;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Result extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        
        PrintWriter pw=res.getWriter();
        
        HttpSession session=req.getSession();
        
        int q=Integer.parseInt(req.getParameter("question"));
        String ans=req.getParameter("answer");
        
        
        
        String result[]=(String [])(session.getAttribute("resArray"));
        if(ans.equals("undefined")){
            result[q-1]="0";
        }else
        result[q-1]=ans;
        
        pw.println(Arrays.toString(result));
        

        /*PrintWriter pw=res.getWriter();
	res.setContentType("text/html");
	try{
	
	String[] ans=new String[10];

	for(int i=0;i<10;i++){
	String str="Q"+(i+1);
	ans[i]=req.getParameter(str);
	


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

pw.println("Score : "+score);
pw.println("wrong_attempted : "+wrong_attempted);
pw.println("wright_attempted : "+wright_attempted);
pw.println("total_attempted : "+(wrong_attempted+wright_attempted));
}catch(Exception e2){

	pw.println(e2);

}*/
    }
}
