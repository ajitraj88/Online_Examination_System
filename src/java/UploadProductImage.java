/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Set;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Raja
 */
public class UploadProductImage extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter pw = resp.getWriter();
        HttpSession session = req.getSession();
        /*String department = (String) session.getAttribute("dept");
        String sub_department = (String) session.getAttribute("sub_dept");
        String catagory = (String) session.getAttribute("catagory");
        String sub_catagory = (String) session.getAttribute("sub_catagory");
        String product_id = (String) session.getAttribute("product_id");
        String more_image = req.getParameter("more_image");
        */
        int image_no = Integer.parseInt(req.getParameter("no"));

        File f = new File(getServletContext().getRealPath("") + "/" + "ProductImages/" + department + "/" + sub_department + "/" + catagory + "/" + sub_catagory+"/"+product_id);
        f.mkdirs();
        DataInputStream din = new DataInputStream(req.getInputStream());
        int totalbyte = req.getContentLength();
        pw.println(totalbyte);
        try {
            byte b[] = new byte[totalbyte];
            int bytes = 0, readbyte = 0;
            while (readbyte < totalbyte) {
                bytes = din.read(b, readbyte, totalbyte);
                readbyte += bytes;

            }
            String file = new String(b);
            int ind1 = file.indexOf("Content-Disposition") + 19;
            ind1 = file.indexOf("filename=", ind1) + 10;
            ind1 = file.indexOf(".", ind1);
            int ind2 = file.indexOf("\"", ind1);
            String format = file.substring(ind1, ind2);
            int content_index1 = file.indexOf("Content-Type:");
            content_index1 = file.indexOf("\n", content_index1) + 3;
            int content_index2 = file.indexOf("----", content_index1) - 2;
            String content = file.substring(content_index1, content_index2);
            FileOutputStream fout = new FileOutputStream(f.toString() + "/" + product_id + "_" + image_no + format);
            fout.write(b, content_index1, content_index2 - content_index1);
            fout.close();
            if ("true".equals(more_image)) {
                resp.sendRedirect("UploadProductImage.jsp?no=" + (image_no + 1));
            }
            session.setAttribute("format",format);
            resp.sendRedirect("SaveProductDetail");
        } catch (Exception e) {
            pw.println(e);
        }

    }
}
