package servlet;
import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.UpdateResult;
import org.apache.commons.io.*;
import org.bson.Document;
import org.bson.conversions.Bson;

import java.nio.charset.*;

import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.set;


@WebServlet(
        name = "AdminServlet",
        urlPatterns = {"/administrator"}
)

public class adminServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        setAccessControlHeaders(res);
        res.setContentType("text/plain");
        res.setCharacterEncoding("UTF-8");

        String uri = "mongodb+srv://admin1:Admin1@cluster0.78zu6.mongodb.net/test";
        MongoClientURI clientURI = new MongoClientURI(uri);
        MongoClient mongoClient = new MongoClient(clientURI);

        // Connect to database and connection
        MongoDatabase mongoDatabase = mongoClient.getDatabase("ideli");
        MongoCollection collection = mongoDatabase.getCollection("login");
        String x = req.getParameter("user");
        String y = req.getParameter("pass");

        FindIterable<Document> data = collection.find();
        boolean match = false;
        for (Document doc : data) {
            if (doc.get("user") != null && doc.get("user").equals(x) && doc.get("pass").equals(y)) {
                match = true;
                updateLoggedIn();
            }
        }
        PrintWriter out = res.getWriter();
        if(match){
            out.println("great success");
        }else{
            out.println("wrong_user");
        }
        out.flush();
        out.close();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println(printHead());
        out.println(printBody());
        out.println(printScript());
        out.println(printTail());
        out.flush();
        out.close();
    }
    protected void updateLoggedIn(){
        String uri = "mongodb+srv://admin1:Admin1@cluster0.78zu6.mongodb.net/test";
        MongoClientURI clientURI = new MongoClientURI(uri);
        MongoClient mongoClient = new MongoClient(clientURI);

        // Connect to database and connection
        MongoDatabase mongoDatabase = mongoClient.getDatabase("ideli");
        MongoCollection collection = mongoDatabase.getCollection("login");
        Bson filter = eq("logged in", "false");
        Bson updateOperation = set("logged in", "true");
        UpdateResult updateResult = collection.updateOne(filter, updateOperation);
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
                "                <!-- Icon Divider-->\n" +
                "                <div class=\"divider-custom\">\n" +
                "                   <form accept-charset=utf-8>\n" +
                "                       <input type=\"text\" id=\"login\" class=\"fadeIn second\" name=\"login\" placeholder=\"login\">\n" +
                "                       <input type=\"text\" id=\"password\" class=\"fadeIn third\" name=\"login\" placeholder=\"password\">\n" +
                "                       <input type=\"submit\" onclick=\"checkLogin();event.preventDefault();\" class=\"fadeIn fourth\" value=\"Log In\">\n" +
                "                   </form>" +
                "                </div>\n" +
                "            </div>\n" +
                "        </section>\n" +
                "\n";
    }
    protected String printScript() {
        return   "        <script>\n"+
                "  function checkLogin(){\n" +
                "              let user = jQuery('#login').val();\n" +
                "              let pass = jQuery('#password').val();\n" +
                "              jQuery.post( 'https://ideli.herokuapp.com/administrator', {user: user, pass: pass}, function( data ) {\n" +
                "                  if (data.includes('wrong_user'))\n" +
                "                      alert('Wrong User!!!');\n" +
                "                  else {\n" +
                "                      window.location.assign(window.location.origin+\"/edit9f3857n398457fn\");\n" +
                "                  }\n" +
                "              })\n" +
                "          }" +
                "        </script>\n"+
        "    </body>";
    }
    protected String printTail(){
        return "</html>";
    }

    private void setAccessControlHeaders(HttpServletResponse response) {
        response.addHeader("Access-Control-Allow-Origin", "*");
        response.addHeader("Access-Control-Allow-Methods", "POST, GET");
        response.addHeader("Access-Control-Allow-Headers", "Origin, Content-Type, X-Auth-Token");
        response.addHeader("Access-Control-Max-Age", "1728000");
    }
}