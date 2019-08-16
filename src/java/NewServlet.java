/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author vinay
 */
public class NewServlet extends HttpServlet {

    PrintWriter pw=null;
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        pw=resp.getWriter();
        try{
            HttpSession session =req.getSession();
            Enumeration e=session.getAttributeNames();
            while(e.hasMoreElements()){
                String name= (String)e.nextElement();
                pw.println(name+"\t\t"+session.getAttribute(name));
            }
        }catch(Exception e){
            System.out.println("NewServlet:"+e);
        }
        
    }


}
