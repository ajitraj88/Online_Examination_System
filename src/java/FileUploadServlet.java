
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import static sun.awt.geom.Curve.prev;

@WebServlet(name = "FileUploadServlet", urlPatterns = {"/upload"})
@MultipartConfig
public class FileUploadServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        PrintWriter pw = response.getWriter();
        String dirName = (String) (request.getSession()).getAttribute("name");

        File file = new File("C:\\Users\\vinay\\Documents\\NetBeansProjects\\webapp\\web\\Profile_pics" + File.separator + dirName);

        if (!file.exists()) {
            try {
                file.mkdir();
                System.out.println("directory created");
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        DataInputStream din = new DataInputStream(request.getInputStream());
        int total_byte = request.getContentLength();
        pw.println(total_byte);
        try {
            byte b[] = new byte[total_byte];
            int bytes = 0, readbytes = 0;
            while (readbytes < total_byte) {
                bytes = din.read(b, readbytes, total_byte);
                readbytes += bytes;
            }
            String filein = new String(b);
            int ind1 = filein.indexOf("Content-Disposition") + 19;
            ind1 = filein.indexOf("filename=", ind1) + 10;
            int ind2 = filein.indexOf("\"", ind1);

            String filename = filein.substring(ind1, ind2);

            int content_index1 = filein.indexOf("Content-Type:");

            content_index1 = filein.indexOf("\n", content_index1) + 3;

            int content_index2 = filein.indexOf("----", content_index1) - 2;

            String content = filein.substring(content_index1, content_index2);

            FileOutputStream fout = new FileOutputStream(new File(file.getAbsolutePath() + File.separator + filename));
            fout.write(b, content_index1, content_index2 - content_index1);
            fout.close();
            din.close();

        } catch (Exception e) {
            pw.println(e);
        }

    }

}
