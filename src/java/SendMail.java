import java.util.Properties;  
  
import javax.mail.*;  
import javax.mail.internet.InternetAddress;  
import javax.mail.internet.MimeMessage;  

import java.io.IOException;  
import java.io.PrintWriter;  
import java.util.Random;
  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
  
  
class Mailer {  
public static void send(String to,String subject,String msg){  
  
final String user="";//change accordingly  
final String pass="";  
  
final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";

//1st step) Get the session object    
Properties props = new Properties();  
props.setProperty("mail.smtp.host", "smtp.gmail.com");
     props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
     props.setProperty("mail.smtp.socketFactory.fallback", "false");
     props.setProperty("mail.smtp.port", "465");
     props.setProperty("mail.smtp.socketFactory.port", "465");
     props.put("mail.smtp.auth", "true");
     props.put("mail.debug", "true");
     props.put("mail.store.protocol", "pop3");
     props.put("mail.transport.protocol", "smtp");  
  
Session session = Session.getDefaultInstance(props,  
 new javax.mail.Authenticator() {  
  protected PasswordAuthentication getPasswordAuthentication() {  
   return new PasswordAuthentication(user,pass);  
   }  
});  
//2nd step)compose message  
try {  
 MimeMessage message = new MimeMessage(session);  
 message.setFrom(new InternetAddress(user));  
 message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
 message.setSubject(subject);  
 message.setText(msg);  
   
 //3rd step)send message  
 Transport.send(message);  
  
 System.out.println("Done");  
  
 } catch (MessagingException e) {  
    throw new RuntimeException(e);  
 }  
      
}  
}  



  
public class SendMail extends HttpServlet {  
public void doGet(HttpServletRequest request,  
 HttpServletResponse response)  
    throws ServletException, IOException {  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
      
   // String to=request.getParameter("to"); 
    String to=(String)request.getSession().getAttribute("email"); 
    String subject="Online Test";//request.getParameter("subject"); 
    Random obj=new Random();
    int i=obj.nextInt(9999);
    
    request.getSession().setAttribute("random",i);
    String msg="you have registered successfully.clickthe link to follow the next steps.";//request.getParameter("msg");  
          
    Mailer.send(to, subject, msg+i); 
    
    out.print("message has been sent successfully");  
    response.sendRedirect("otp.jsp");
    out.close();  
    
    }  
  
}  