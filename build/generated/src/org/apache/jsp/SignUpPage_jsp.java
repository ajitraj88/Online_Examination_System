package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SignUpPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!doctype html>\n");
      out.write("<head lang=\"en\">\n");
      out.write("<title>ASSESS</title>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Sofia' rel='stylesheet'>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("<!-- jQuery library -->\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Popper JS -->\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Latest compiled JavaScript -->\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body >\n");
      out.write("\n");
      out.write("        <div ><a href=\"index.jsp\">     <button style=\"color:dimgrey;margin: 5px; background-color: #fff;border-color: cadetblue;border-radius: 5px\">HOME</button></a></div>\n");
      out.write("        <div style=\"font-family: sofia; font-size: 35px; text-align: center\" >Enter your details</div>\n");
      out.write("\n");
      out.write("        <div class=\"container\" >\n");
      out.write("\n");
      out.write("        <form action=\"SignUpRequest\" method=\"POST\" class=\"form-group \" ><br>\n");
      out.write("             <input type=\"text\" name=\"name\" placeholder=\" Name\" class=\"form-control\"><br>\n");
      out.write("\t\n");
      out.write("<input type=\"text\" name=\"college\" placeholder=\"ENTER COLLEGE NAME\" class=\"form-control\"><br>\n");
      out.write("\n");
      out.write(" <input type=\"text\" name=\"mob\" placeholder=\"Phone_number\" class=\"form-control\"><br>\n");
      out.write("\n");
      out.write("            <select name=\"course\" placeholder=\"course\" class=\"form-control\">\n");
      out.write("                <option>B.tech</option>\n");
      out.write("                <option>MCA</option>\n");
      out.write("                <option>other</option></select><br>\n");
      out.write("            <select name=\"year\" placeholder=\"year\" class=\"form-control\">\n");
      out.write("\n");
      out.write("                <option value=\"first\">1</option>\n");
      out.write("                <option value=\"second\">2</option>\n");
      out.write("                <option value=\"third\">3</option>\n");
      out.write("                <option value=\"fourth\">4</option>\n");
      out.write("              </select><br>\n");
      out.write("\t<input type=\"email\" name=\"email\" placeholder=\"enter email id\" class=\"form-control\"><br>\n");
      out.write("           \n");
      out.write("             <input type=\"password\" name=\"pass\" placeholder=\"password\"  class=\"form-control\"><br><br>\n");
      out.write("\t\t<br><br>\n");
      out.write("   <input type=\"submit\" value=\"SIGN UP\" class=\"form-control btn btn-primary\" style=\"background-color: cadetblue; color: aliceblue;border-color: cadetblue\" data-toggle=\"modal\" data-target=\"#myModal\" /> <br>\n");
      out.write("\n");
      out.write("     \n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("          <!-- The Modal -->\n");
      out.write("  <div class=\"modal fade\" id=\"myModal\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("\n");
      out.write("        <!-- Modal Header -->\n");
      out.write("        <div class=\"modal-header\">\n");
      out.write("          <h4 class=\"modal-title\">Sign Up SUCCESSFULLY</h4>\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write(" <div class=\"modal-footer\">\n");
      out.write("     <a href=\"index.jsp\">   <button type=\"button\" class=\"btn btn-primary\" >LOGIN</button> </a>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div style=\" text-align:right; font-family: sans-serif;font-size: 10px\" class=\"text-muted\">\n");
      out.write("\n");
      out.write("        Developed by Vinay Pundir & co.</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
