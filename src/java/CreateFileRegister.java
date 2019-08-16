
import java.io.File;
import java.io.FileOutputStream;
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
@WebServlet(urlPatterns = {"/CreateFileRegister"})
public class CreateFileRegister extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter pw=response.getWriter();
        String name=request.getParameter("name");
        String college=request.getParameter("college");
        String mob=request.getParameter("mob");
        String course=request.getParameter("course");
        String year=request.getParameter("year");
        String email=request.getParameter("email");
        String pass=request.getParameter("pass");
        String str="name="+name+"\r\n"+
                "college="+college+"\r\n"+
                "mob="+mob+"\r\n"+
                "course="+course+"\r\n"+
                "year="+year+"\r\n"+
                "email="+email+"\r\n"+
                "pass="+pass+"\r\n";
        try{
            
        String routePath = this.getClass().getClassLoader().getResource(File.separator).getPath();
        //pw.write(routePath);
        
        String dir=routePath.substring(0,routePath.indexOf("/build"));
        pw.println("\n"+dir+"/web"+"/"+"Tmp"+"/"+"tmp.txt");
        FileOutputStream fout=new FileOutputStream(new File(dir+"/web"+"/"+"Tmp"+"/"+"tmp.txt"));
        //String path=request.getServletContext();
        byte res[]=str.getBytes();
        fout.write(res);
        //pw.write(routePath);
        fout.close();
        request.getSession().setAttribute("email",email);
        
        response.sendRedirect("SendMail");
        
        }catch(Exception e){
            pw.println("\r\n"+e);
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
