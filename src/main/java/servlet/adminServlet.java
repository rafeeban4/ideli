package servlet;
import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.io.*;
import java.nio.charset.*;


@WebServlet(
        name = "MyServlet",
        urlPatterns = {"/admin"}
)

public class adminServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println(printHead());
        out.println(printBody());
        out.println(printTail());
        out.flush();
        out.close();
    }
    protected String printHead(){
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "    <head>\n" +
                "        <meta charset=\"utf-8\" />\n" +
                "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\n" +
                "        <meta name=\"description\" content=\"\" />\n" +
                "        <meta name=\"author\" content=\"Rafee\" />\n" +
                "        <title>IDeli</title>\n" +
                "        <!-- Favicon-->\n" +
                "        <link rel=\"icon\" type=\"image/x-icon\" href=\"assets/img/favicon.ico\" />\n" +
                "        <!-- Font Awesome icons (free version)-->\n" +
                "        <script src=\"https://use.fontawesome.com/releases/v5.13.0/js/all.js\" crossorigin=\"anonymous\"></script>\n" +
                "        <!-- Bootstrap core JS-->\n" +
                "        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n" +
                "        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.bundle.min.js\"></script>\n" +
                "        <!-- Third party plugin JS-->\n" +
                "        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.min.js\"></script>\n" +
                "        <!-- Contact form JS-->\n" +
                "        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jqBootstrapValidation/1.3.7/jqBootstrapValidation.min.js\"></script>\n" +
                "        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jqBootstrapValidation/1.3.7/jqBootstrapValidation.min.js\"></script>\n" +
                "        <!-- Core theme JS-->\n" +
                "        <!--<script src=\"js/scripts.js\"></script>-->\n" +
                "        <!-- Google fonts-->\n" +
                "        <link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700\" rel=\"stylesheet\" type=\"text/css\" />\n" +
                "        <link href=\"https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic\" rel=\"stylesheet\" type=\"text/css\" />\n" +
                "        <!-- Core theme CSS (includes Bootstrap)-->\n" +
                "        <link href=\"styles.css\" rel=\"stylesheet\" type=\"text/css\" />"+
                "    </head>";
    }
    protected String printBody(){
        return "<body id=\"page-top\">\n" +
                "        <!-- Masthead-->\n" +
                "        <header class=\"masthead bg-primary text-white text-center\">\n" +
                "            <div class=\"container d-flex align-items-center flex-column\">\n" +
                "                <!-- Masthead Heading-->\n" +
                "                <h1 class=\"masthead-heading text-uppercase mb-0\">I-Deli</h1>\n" +
                "                <!-- Icon Divider-->\n" +
                "                <div class=\"divider-custom divider-light\">\n" +
                "                    <div class=\"divider-custom-line\"></div>\n" +
                "                    <div class=\"divider-custom-icon\"><i class=\"fas fa-star\"></i></div>\n" +
                "                    <div class=\"divider-custom-line\"></div>\n" +
                "                </div>\n" +
                "                <!-- Masthead Subheading-->\n" +
                "                <p class=\"masthead-subheading font-weight-light mb-0\">Quick Way Food Mart, Rani's Indian Deli, Convenience Store</p>\n" +
                "            </div>\n" +
                "        </header>\n" +
                "        <!-- Login-->\n" +
                "        <section class=\"page-section portfolio\" id=\"announcements\">\n" +
                "            <div class=\"container align-items-center\">\n" +
                "                <!-- Announcements Section Heading-->\n" +
                "                <h2 class=\"page-section-heading text-center text-uppercase text-secondary mb-0\">Announcements</h2>\n" +
                "                <!-- Icon Divider-->\n" +
                "                <div class=\"divider-custom\">\n" +
                "                   <form>\n" +
                "                       <input type=\"text\" id=\"login\" class=\"fadeIn second\" name=\"login\" placeholder=\"login\">\n" +
                "                       <input type=\"text\" id=\"password\" class=\"fadeIn third\" name=\"login\" placeholder=\"password\">\n" +
                "                       <input type=\"submit\" class=\"fadeIn fourth\" value=\"Log In\">\n" +
                "                   </form>" +
                "                </div>\n" +
                "                <!-- Announcements Section Content-->\n" +
                "                <div class=\"row text-center\">\n" +
                "                    <div class=\"col-sm-12 \"><p class=\"lead\">Announcements Here</p></div>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "        </section>\n" +
                "\n" +
                "    </body>";
    }
    protected String printTail(){
        return "</html>";
    }
}