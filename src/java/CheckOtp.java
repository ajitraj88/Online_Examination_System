/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author vinay
 */
@WebServlet(urlPatterns = {"/CheckOtp"})
public class CheckOtp extends HttpServlet {

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter pw=response.getWriter();
        try{
        if(((int)request.getSession().getAttribute("random"))==(Integer.parseInt((String)request.getParameter("random")))){
            response.sendRedirect("SignUpRequest");
        }
        }catch(Exception e){
            pw.print(e);
        }
    }

   
 
}
