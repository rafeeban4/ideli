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
        name = "EditServlet",
        urlPatterns = {"/edit9f3857n398457fn"}
)

public class editServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        setAccessControlHeaders(res);
        res.setContentType("text/plain");
        res.setCharacterEncoding("UTF-8");

        String function = req.getParameter("function");
        if(function.equals("addAnnouncement"))
            addAnnounce(req.getParameter("storage"));
        else if (function.equals("deleteAnnouncement"))
            deleteAnnounce(req.getParameter("content"));
        else if (function.equals("logOut"))
            logOut();

        PrintWriter out = res.getWriter();
        out.println("great Success");
        out.flush();
        out.close();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        setAccessControlHeaders(res);
        res.setContentType("text/plain");
        res.setCharacterEncoding("UTF-8");
        if(isLoggedIn()){
            res.setContentType("text/html");
            PrintWriter out = res.getWriter();
            out.println(printHead());
            out.println(printBody());
            out.println(announcements());
            out.println(printTail());
            out.flush();
            out.close();
        }
    }
    protected void addAnnounce(String text){

        String uri = "mongodb+srv://admin1:Admin1@cluster0.78zu6.mongodb.net/test";
        MongoClientURI clientURI = new MongoClientURI(uri);
        MongoClient mongoClient = new MongoClient(clientURI);

        // Connect to database and connection
        MongoDatabase mongoDatabase = mongoClient.getDatabase("ideli");
        MongoCollection collection = mongoDatabase.getCollection("announcements");
        // Insert request parameters into the document
        Document document = new Document();
        document.append("content", text);

        // Insert document into the database
        collection.insertOne(document);
    }
    protected void deleteAnnounce(String text){
        String uri = "mongodb+srv://admin1:Admin1@cluster0.78zu6.mongodb.net/test";
        MongoClientURI clientURI = new MongoClientURI(uri);
        MongoClient mongoClient = new MongoClient(clientURI);

        // Connect to database and connection
        MongoDatabase mongoDatabase = mongoClient.getDatabase("ideli");
        MongoCollection collection = mongoDatabase.getCollection("announcements");
        // Insert request parameters into the document
        collection.deleteOne(eq("content", text));

    }
    protected String announcements(){
        String uri = "mongodb+srv://admin1:Admin1@cluster0.78zu6.mongodb.net/test";
        MongoClientURI clientURI = new MongoClientURI(uri);
        MongoClient mongoClient = new MongoClient(clientURI);

        // Connect to database and connection
        MongoDatabase mongoDatabase = mongoClient.getDatabase("ideli");
        MongoCollection collection = mongoDatabase.getCollection("announcements");
        StringBuilder s = new StringBuilder();
        FindIterable<Document> data = collection.find();
        for (Document x : data) {
            s.append("<div class=\"row text-center\">\n" +
                    "                    <div class=\"col-sm-12 \"><p class=\"lead\" id=\""+x.get("_id")+"\" onclick=\"deleteText(event);event.preventDefault();\">");

            s.append(x.get("content")+"</p></div>\n" +
                    "                </div>\n");
        }
        return s.toString();
    }

    private Boolean isLoggedIn() {
        String uri = "mongodb+srv://admin1:Admin1@cluster0.78zu6.mongodb.net/test";
        MongoClientURI clientURI = new MongoClientURI(uri);
        MongoClient mongoClient = new MongoClient(clientURI);

        // Connect to database and connection
        MongoDatabase mongoDatabase = mongoClient.getDatabase("ideli");
        MongoCollection collection = mongoDatabase.getCollection("login");

        FindIterable<Document> docs = collection.find();
        boolean ret = false;
        for(Document doc: docs) {
            if (doc.get("logged in") != null &&doc.get("logged in").equals("true")){
                ret=  true;
            }
        }
        return ret;
    }
    protected void logOut(){
        String uri = "mongodb+srv://admin1:Admin1@cluster0.78zu6.mongodb.net/test";
        MongoClientURI clientURI = new MongoClientURI(uri);
        MongoClient mongoClient = new MongoClient(clientURI);

        // Connect to database and connection
        MongoDatabase mongoDatabase = mongoClient.getDatabase("ideli");
        MongoCollection collection = mongoDatabase.getCollection("login");
        Bson filter = eq("logged in", "true");
        Bson updateOperation = set("logged in", "false");
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
                "        <button type=\"button\" class=\"btn btn-primary\" onClick=\"logOut()\">Log Out</button>" +
                "            <div class=\"container align-items-center\">\n" +
                "                <!-- Icon Divider-->\n" +
                "                <div class=\"divider-custom\">\n" +
                "                   <form accept-charset=utf-8>\n" +
                "                       <input  type=\"text\" id=\"text\" class=\"form-control form-control-lg fadeIn second\" name=\"login\" placeholder=\"login\">\n" +
                "                       <input type=\"submit\" value=\"Add Announcement\" class=\"fadeIn fourth\" onclick=\"addText();event.preventDefault();\">\n" +
                "                   </form>" +
                "                </div>\n";

    }
    protected String printTail(){
        return "            </div>\n" +
                "        </section>\n" +
                "\n"+printScript()+"    </body>\n"+"</html>";
    }
    protected String printScript(){
        return "<script>\n" +
                "          function addText(){\n" +
                "              let text = jQuery('#text').val();\n" +
                "              jQuery.post( 'https://ideli.herokuapp.com/edit9f3857n398457fn', {storage: text, function: 'addAnnouncement'}, function( data ) {\n" +
                "                  if(data.includes(\"Success\")){\n" +
                "                      alert(\"Announcement Added Successfully\");\n" +
                "                      location.reload();\n" +
                "                  }else{\n" +
                "                      alert(\"ERROR\")\n" +
                "                  }\n" +
                "              });\n" +
                "          }\n" +
                "          function deleteText(event){\n" +
                "              jQuery.post( 'https://ideli.herokuapp.com/edit9f3857n398457fn', {content: jQuery('#' + event.target.id).html(), function: 'deleteAnnouncement'}, function( data ) {\n" +
                "                  if(data.includes(\"Success\")){\n" +
                "                      alert(\"Announcement Deleted Successfully\");\n" +
                "                      location.reload();\n" +
                "                  }else{\n" +
                "                      alert(\"ERROR\")\n" +
                "                  }\n" +
                "              });\n" +
                "          }\n" +
                "          function logOut(){\n" +
                "              jQuery.post( 'https://ideli.herokuapp.com/edit9f3857n398457fn', {function: 'logOut'}, function( data ) {\n" +
                "                  if(data.includes(\"Success\")){\n" +
                "                      alert(\"Logged Out Successfully\");\n" +
                "                      location.reload();\n" +
                "                  }else{\n" +
                "                      alert(\"ERROR\")\n" +
                "                  }\n" +
                "              });\n" +
                "          }\n" +
                "        </script>";
    }

    private void setAccessControlHeaders(HttpServletResponse response) {
        response.addHeader("Access-Control-Allow-Origin", "*");
        response.addHeader("Access-Control-Allow-Methods", "POST, GET");
        response.addHeader("Access-Control-Allow-Headers", "Origin, Content-Type, X-Auth-Token");
        response.addHeader("Access-Control-Max-Age", "1728000");
    }

}