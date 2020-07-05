package servlet;

import java.io.PrintWriter;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.io.*;


@WebServlet(
        name = "MyServlet",
        urlPatterns = {"/main"}
)

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        File css = new File("/style.css");
        String x = FileUtils.readFileToString(css, StandardCharsets.UTF_8);
        out.println(printHead());
        out.println("<style>"+x+"</style>");
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
                "        <!-- Announcements Section-->\n" +
                "        <section class=\"page-section portfolio\" id=\"announcements\">\n" +
                "            <div class=\"container align-items-center\">\n" +
                "                <!-- Announcements Section Heading-->\n" +
                "                <h2 class=\"page-section-heading text-center text-uppercase text-secondary mb-0\">Announcements</h2>\n" +
                "                <!-- Icon Divider-->\n" +
                "                <div class=\"divider-custom\">\n" +
                "                    <div class=\"divider-custom-line\"></div>\n" +
                "                    <div class=\"divider-custom-icon\"><i class=\"fas fa-star\"></i></div>\n" +
                "                    <div class=\"divider-custom-line\"></div>\n" +
                "                </div>\n" +
                "                <!-- Announcements Section Content-->\n" +
                "                <div class=\"row text-center\">\n" +
                "                    <div class=\"col-sm-12 \"><p class=\"lead\">Announcements Here</p></div>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "        </section>\n" +
                "\n" +
                "        <!-- About Section-->\n" +
                "        <section class=\"page-section bg-primary text-white mb-0\" id=\"about\">\n" +
                "            <div class=\"container \">\n" +
                "                <!-- About Section Heading-->\n" +
                "                <h2 class=\"page-section-heading text-center text-uppercase text-white\">About</h2>\n" +
                "                <!-- Icon Divider-->\n" +
                "                <div class=\"divider-custom divider-light\">\n" +
                "                    <div class=\"divider-custom-line\"></div>\n" +
                "                    <div class=\"divider-custom-icon\"><i class=\"fas fa-star\"></i></div>\n" +
                "                    <div class=\"divider-custom-line\"></div>\n" +
                "                </div>\n" +
                "                <!-- About Section Content-->\n" +
                "                <div class=\"row align-items-center\">\n" +
                "                    <p class=\"lead\">I-Deli, also known as Rani's Indian Deli, is a family owned business that has been serving the Lansdale Community for over 20 years</p>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "        </section>\n" +
                "        <section class=\"page-section portfolio\" id=\"hours\">\n" +
                "        <div class=\"container align-items-center text-center\">\n" +
                "            <!-- About Section Heading-->\n" +
                "            <h2 class=\"page-section-heading text-center text-uppercase text-secondary mb-0\">Business Hours</h2>\n" +
                "            <!-- Icon Divider-->\n" +
                "            <div class=\"divider-custom\">\n" +
                "                <div class=\"divider-custom-line\"></div>\n" +
                "                <div class=\"divider-custom-icon\"><i class=\"fas fa-star\"></i></div>\n" +
                "                <div class=\"divider-custom-line\"></div>\n" +
                "            </div>\n" +
                "            <div class=\"container bg-primary\">\n" +
                "                <div class=\"row\">\n" +
                "                    <div class=\"col-sm-4\"></div>\n" +
                "                    <div class=\"col-sm-4\">\n" +
                "                        <div class=\"business-hours\">\n" +
                "                            <ul class=\"list-unstyled opening-hours\">\n" +
                "                                <li>Monday <span class=\"pull-right \">9:00 AM - 9:00 PM</span></li>\n" +
                "                                <li>Tuesday <span class=\"pull-right\">9:00 AM - 9:00 PM</span></li>\n" +
                "                                <li>Wednesday <span class=\"pull-right\">9:00 AM - 9:00 PM</span></li>\n" +
                "                                <li>Thursday <span class=\"pull-right\">9:00 AM - 9:00 PM</span></li>\n" +
                "                                <li>Friday <span class=\"pull-right\">9:00 AM - 9:00 PM</span></li>\n" +
                "                                <li>Saturday <span class=\"pull-right\">12:00 PM - 9:00 PM</span></li>\n" +
                "                                <li>Sunday <span class=\"pull-right\">12:00 PM - 9:00 PM</span></li>\n" +
                "                            </ul>\n" +
                "                        </div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "            <!-- About Section Content-->\n" +
                "        </div>\n" +
                "        </section>\n" +
                "        <!-- Contact Section-->\n" +
                "        <!-- Footer-->\n" +
                "        <footer class=\"footer text-center\">\n" +
                "            <div class=\"container\">\n" +
                "                <div class=\"row align-items-center\">\n" +
                "                    <!-- Footer Location-->\n" +
                "                    <div class=\"col-sm-12 mb-5 mb-lg-0\">\n" +
                "                        <h4 class=\"text-uppercase mb-4\">Location</h4>\n" +
                "                        <p class=\"lead mb-0\">\n" +
                "                            209 South Broad St\n" +
                "                            <br />\n" +
                "                            Lansdale, PA 19446\n" +
                "                        </p>\n" +
                "                        <br>\n" +
                "                        <br>\n" +
                "                        <br>\n" +
                "                        <h4 class=\"text-uppercase mb-4\">Contact Us</h4>\n" +
                "                        <p class=\"lead mb-0\">\n" +
                "                            215-XXX-XXXX\n" +
                "                        </p>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "        </footer>\n" +
                "        <!-- Copyright Section-->\n" +
                "        <div class=\"copyright py-4 text-center text-white\">\n" +
                "            <div class=\"container\"><small>Copyright © IDeli 2020</small></div>\n" +
                "        </div>\n" +
                "        <!-- Scroll to Top Button (Only visible on small and extra-small screen sizes)-->\n" +
                "        <div class=\"scroll-to-top d-lg-none position-fixed\">\n" +
                "            <a class=\"js-scroll-trigger d-block text-center text-white rounded\" href=\"#page-top\"><i class=\"fa fa-chevron-up\"></i></a>\n" +
                "        </div>\n" +
                "\n" +
                "    </body>";
    }
    protected String printTail(){
        return "</html>";
    }
}