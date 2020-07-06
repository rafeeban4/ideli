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
        urlPatterns = {"/main"}
)

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        //File css = new File("webapp/WEB-INF/classes");
        //String x = FileUtils.readFileToString(css, StandardCharsets.UTF_8);
        //out.println(System.getProperty("user.dir"));
        out.println(printHead());
        out.println("<style>");
        printStyle(out);
        out.println("");
        out.println("");
        out.println("");
        out.println("");
        out.println("");
        out.println("");
        out.println("");
        out.println("</style>");
        out.println(printBody());
        out.println(printTail());
        out.flush();
        out.close();
    }
    protected void printStyle(PrintWriter out){
        out.println(":root {\n" +
                "  --blue: #007bff;\n" +
                "  --indigo: #6610f2;\n" +
                "  --purple: #6f42c1;\n" +
                "  --pink: #e83e8c;\n" +
                "  --red: #dc3545;\n" +
                "  --orange: #fd7e14;\n" +
                "  --yellow: #ffc107;\n" +
                "  --green: #28a745;\n" +
                "  --teal: #1abc9c;\n" +
                "  --cyan: #17a2b8;\n" +
                "  --white: #fff;\n" +
                "  --gray: #6c757d;\n" +
                "  --gray-dark: #343a40;\n" +
                "  --primary: #1abc9c;\n" +
                "  --secondary: #2c3e50;\n" +
                "  --success: #28a745;\n" +
                "  --info: #17a2b8;\n" +
                "  --warning: #ffc107;\n" +
                "  --danger: #dc3545;\n" +
                "  --light: #f8f9fa;\n" +
                "  --dark: #343a40;\n" +
                "  --breakpoint-xs: 0;\n" +
                "  --breakpoint-sm: 576px;\n" +
                "  --breakpoint-md: 768px;\n" +
                "  --breakpoint-lg: 992px;\n" +
                "  --breakpoint-xl: 1200px;\n" +
                "  --font-family-sans-serif: \"Lato\", -apple-system, BlinkMacSystemFont, \"Segoe UI\", Roboto, \"Helvetica Neue\", Arial, \"Noto Sans\", sans-serif, \"Apple Color Emoji\", \"Segoe UI Emoji\", \"Segoe UI Symbol\", \"Noto Color Emoji\";\n" +
                "  --font-family-monospace: SFMono-Regular, Menlo, Monaco, Consolas, \"Liberation Mono\", \"Courier New\", monospace;\n" +
                "}\n" +
                "\n" +
                "*,\n" +
                "*::before,\n" +
                "*::after {\n" +
                "  box-sizing: border-box;\n" +
                "}\n" +
                "\n" +
                "html {\n" +
                "  font-family: sans-serif;\n" +
                "  line-height: 1.15;\n" +
                "  -webkit-text-size-adjust: 100%;\n" +
                "  -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\n" +
                "}\n" +
                "\n" +
                "article, aside, figcaption, figure, footer, header, hgroup, main, nav, section {\n" +
                "  display: block;\n" +
                "}\n" +
                "\n" +
                "body {\n" +
                "  margin: 0;\n" +
                "  font-family: \"Lato\", -apple-system, BlinkMacSystemFont, \"Segoe UI\", Roboto, \"Helvetica Neue\", Arial, \"Noto Sans\", sans-serif, \"Apple Color Emoji\", \"Segoe UI Emoji\", \"Segoe UI Symbol\", \"Noto Color Emoji\";\n" +
                "  font-size: 1rem;\n" +
                "  font-weight: 400;\n" +
                "  line-height: 1.5;\n" +
                "  color: #212529;\n" +
                "  text-align: center;\n" +
                "  background-color: #fff;\n" +
                "}\n" +
                "\n" +
                "[tabindex=\"-1\"]:focus:not(:focus-visible) {\n" +
                "  outline: 0 !important;\n" +
                "}\n" +
                "\n" +
                "hr {\n" +
                "  box-sizing: content-box;\n" +
                "  height: 0;\n" +
                "  overflow: visible;\n" +
                "}\n" +
                "\n" +
                "h1, h2, h3, h4, h5, h6 {\n" +
                "  margin-top: 0;\n" +
                "  margin-bottom: 0.5rem;\n" +
                "  text-align: center;\n" +
                "}\n" +
                "\n" +
                "p {\n" +
                "  margin-top: 0;\n" +
                "  margin-bottom: 1rem;\n" +
                "  text-align: center;\n" +
                "}\n" +
                "\n" +
                "abbr[title],\n" +
                "abbr[data-original-title] {\n" +
                "  text-decoration: underline;\n" +
                "  -webkit-text-decoration: underline dotted;\n" +
                "          text-decoration: underline dotted;\n" +
                "  cursor: help;\n" +
                "  border-bottom: 0;\n" +
                "  -webkit-text-decoration-skip-ink: none;\n" +
                "          text-decoration-skip-ink: none;\n" +
                "}");
        out.println(".masthead {\n" +
                "  padding-top: calc(6rem + 74px);\n" +
                "  padding-bottom: 6rem;\n" +
                "}\n" +
                ".masthead .masthead-heading {\n" +
                "  font-size: 2.75rem;\n" +
                "  line-height: 2.75rem;\n" +
                "}\n" +
                ".masthead .masthead-subheading {\n" +
                "  font-size: 1.25rem;\n" +
                "}\n" +
                ".masthead .masthead-avatar {\n" +
                "  width: 15rem;\n" +
                "}");
        out.println(".bg-primary {\n" +
                "  background-color: #1abc9c !important;\n" +
                "}\n" +
                ".text-white {\n" +
                "  color: #fff !important;\n" +
                "}\n" +
                ".text-center {\n" +
                "  text-align: center !important;\n" +
                "}\n" +
                ".container {\n" +
                "    min-width: 992px !important;\n" +
                "}\n" +
                ".d-flex {\n" +
                "  display: flex !important;\n" +
                "}\n" +
                ".align-items-center {\n" +
                "  align-items: center !important;\n" +
                "}\n" +
                ".flex-column {\n" +
                "  flex-direction: column !important;\n" +
                "}\n" +
                ".text-uppercase {\n" +
                "  text-transform: uppercase !important;\n" +
                "}\n" +
                ".mb-0,\n" +
                ".my-0 {\n" +
                "  margin-bottom: 0 !important;\n" +
                "}\n" +
                ".divider-custom {\n" +
                "  margin: 1.25rem 0 1.5rem;\n" +
                "  width: 100%;\n" +
                "  display: flex;\n" +
                "  justify-content: center;\n" +
                "  align-items: center;\n" +
                "}\n" +
                ".divider-custom .divider-custom-line {\n" +
                "  width: 100%;\n" +
                "  max-width: 7rem;\n" +
                "  height: 0.25rem;\n" +
                "  background-color: #2c3e50;\n" +
                "  border-radius: 1rem;\n" +
                "  border-color: #2c3e50 !important;\n" +
                "}\n" +
                ".divider-custom .divider-custom-line:first-child {\n" +
                "  margin-right: 1rem;\n" +
                "}\n" +
                ".divider-custom .divider-custom-line:last-child {\n" +
                "  margin-left: 1rem;\n" +
                "}\n" +
                ".divider-custom .divider-custom-icon {\n" +
                "  color: #2c3e50 !important;\n" +
                "  font-size: 2rem;\n" +
                "}\n" +
                ".divider-custom.divider-light .divider-custom-line {\n" +
                "  background-color: #fff;\n" +
                "}\n" +
                ".divider-custom.divider-light .divider-custom-icon {\n" +
                "  color: #fff !important;\n" +
                "}\n" +
                ".font-weight-light {\n" +
                "  font-weight: 300 !important;\n" +
                "}\n");
        out.println(".page-section {\n" +
                "  padding: 6rem 0;\n" +
                "}\n" +
                ".page-section .page-section-heading {\n" +
                "  font-size: 2.25rem;\n" +
                "  line-height: 2rem;\n" +
                "}\n" +
                ".portfolio .portfolio-item {\n" +
                "  cursor: pointer;\n" +
                "  position: relative;\n" +
                "  display: block;\n" +
                "  max-width: 25rem;\n" +
                "  border-radius: 0.5rem;\n" +
                "  overflow: hidden;\n" +
                "}\n" +
                ".portfolio .portfolio-item .portfolio-item-caption {\n" +
                "  position: absolute;\n" +
                "  top: 0;\n" +
                "  left: 0;\n" +
                "  transition: all 0.2s ease-in-out;\n" +
                "  opacity: 0;\n" +
                "  background-color: rgba(26, 188, 156, 0.9);\n" +
                "}\n" +
                ".portfolio .portfolio-item .portfolio-item-caption:hover {\n" +
                "  opacity: 1;\n" +
                "}\n" +
                ".portfolio .portfolio-item .portfolio-item-caption .portfolio-item-caption-content {\n" +
                "  font-size: 1.5rem;\n" +
                "}\n" +
                "\n" +
                ".portfolio-modal .portfolio-modal-title {\n" +
                "  font-size: 2.25rem;\n" +
                "  line-height: 2rem;\n" +
                "}\n" +
                ".text-secondary {\n" +
                "  color: #2c3e50 !important;\n" +
                "}\n" +
                ".row {\n" +
                "  display: flex;\n" +
                "  flex-wrap: wrap;\n" +
                "  margin-right: -1.5rem;\n" +
                "  margin-left: -1.5rem;\n" +
                "  text-align: center;\n" +
                "}\n" +
                ".lead {\n" +
                "  font-size: 1.25rem;\n" +
                "  font-weight: 300;\n" +
                "  display: inline-block\n" +
                "}\n" +
                ".col-xl,\n" +
                ".col-xl-auto, .col-xl-12, .col-xl-11, .col-xl-10, .col-xl-9, .col-xl-8, .col-xl-7, .col-xl-6, .col-xl-5, .col-xl-4, .col-xl-3, .col-xl-2, .col-xl-1, .col-lg,\n" +
                ".col-lg-auto, .col-lg-12, .col-lg-11, .col-lg-10, .col-lg-9, .col-lg-8, .col-lg-7, .col-lg-6, .col-lg-5, .col-lg-4, .col-lg-3, .col-lg-2, .col-lg-1, .col-md,\n" +
                ".col-md-auto, .col-md-12, .col-md-11, .col-md-10, .col-md-9, .col-md-8, .col-md-7, .col-md-6, .col-md-5, .col-md-4, .col-md-3, .col-md-2, .col-md-1, .col-sm,\n" +
                ".col-sm-auto, .col-sm-12, .col-sm-11, .col-sm-10, .col-sm-9, .col-sm-8, .col-sm-7, .col-sm-6, .col-sm-5, .col-sm-4, .col-sm-3, .col-sm-2, .col-sm-1, .col,\n" +
                ".col-auto, .col-12, .col-11, .col-10, .col-9, .col-8, .col-7, .col-6, .col-5, .col-4, .col-3, .col-2, .col-1 {\n" +
                "  position: relative;\n" +
                "  width: 100%;\n" +
                "  padding-right: 1.5rem;\n" +
                "  padding-left: 1.5rem;\n" +
                "  text-align: center;\n" +
                "}\n" +
                ".col {\n" +
                "  flex-basis: 0;\n" +
                "  flex-grow: 1;\n" +
                "  min-width: 0;\n" +
                "  max-width: 100%;\n" +
                "}\n" +
                ".bg-primary {\n" +
                "  background-color: #1abc9c !important;\n" +
                "}");
        out.println(".business-hours {\n" +
                "background: #222; \n" +
                "padding: 40px 14px;\n" +
                "margin-top: -15px;\n" +
                "position: relative;\n" +
                "}\n" +
                ".business-hours:before{\n" +
                "content: '';\n" +
                "width: 23px;\n" +
                "height: 23px;\n" +
                "background: #111;\n" +
                "position: absolute;\n" +
                "top: 5px;\n" +
                "left: -12px;\n" +
                "transform: rotate(-45deg);\n" +
                "z-index: -1;\n" +
                "}\n" +
                ".business-hours .title {\n" +
                "font-size: 20px;\n" +
                "color: #BBB;\n" +
                "text-transform: uppercase;\n" +
                "padding-left: 5px;\n" +
                "border-left: 4px solid #ffac0c; \n" +
                "}\n" +
                ".business-hours li {\n" +
                "color: #888;\n" +
                "line-height: 30px;\n" +
                "border-bottom: 1px solid #333; \n" +
                "}\n" +
                ".business-hours li:last-child {\n" +
                "border-bottom: none; \n" +
                "}\n" +
                ".business-hours .opening-hours li.today {\n" +
                "color: #ffac0c; \n" +
                "}\n" +
                ".footer {\n" +
                "  padding-top: 5rem;\n" +
                "  padding-bottom: 5rem;\n" +
                "  background-color: #2c3e50;\n" +
                "  color: #fff;\n" +
                "}\n" +
                "\n" +
                ".copyright {\n" +
                "  background-color: #1a252f;\n" +
                "}\n" +
                ".demo-bg{\n" +
                "background: #ffac0c;\n" +
                "margin-top: 60px;\n" +
                "}\n" +
                ".mb-lg-0,\n" +
                ".my-lg-0 {\n" +
                "    margin-bottom: 0 !important;\n" +
                "  }\n" +
                ".mb-5,\n" +
                ".my-5 {\n" +
                "  margin-bottom: 3rem !important;\n" +
                "}\n" +
                ".mb-4,\n" +
                ".my-4 {\n" +
                "  margin-bottom: 1.5rem !important;\n" +
                "}\n" +
                ".pb-5,\n" +
                ".py-5 {\n" +
                "  padding-bottom: 3rem !important;\n" +
                "}\n" +
                ".scroll-to-top {\n" +
                "  z-index: 1042;\n" +
                "  right: 1rem;\n" +
                "  bottom: 1rem;\n" +
                "  display: none;\n" +
                "}\n" +
                ".scroll-to-top a {\n" +
                "  width: 3.5rem;\n" +
                "  height: 3.5rem;\n" +
                "  background-color: rgba(33, 37, 41, 0.5);\n" +
                "  line-height: 3.1rem;\n" +
                "}\n" +
                ".d-lg-none {\n" +
                "    display: none !important;\n" +
                "}\n" +
                ".position-fixed {\n" +
                "  position: fixed !important;\n" +
                "}\n" +
                ".d-none {\n" +
                "  display: none !important;\n" +
                "}\n" +
                "\n" +
                ".d-inline {\n" +
                "  display: inline !important;\n" +
                "}\n" +
                "\n" +
                ".d-inline-block {\n" +
                "  display: inline-block !important;\n" +
                "}\n" +
                "\n" +
                ".d-block {\n" +
                "  display: block !important;\n" +
                "}\n" +
                "\n" +
                ".d-table {\n" +
                "  display: table !important;\n" +
                "}\n" +
                ".rounded-sm {\n" +
                "  border-radius: 0.25rem !important;\n" +
                "}\n" +
                "\n" +
                ".rounded {\n" +
                "  border-radius: 0.5rem !important;\n" +
                "}\n" +
                "\n" +
                ".rounded-top {\n" +
                "  border-top-left-radius: 0.5rem !important;\n" +
                "  border-top-right-radius: 0.5rem !important;\n" +
                "}");
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