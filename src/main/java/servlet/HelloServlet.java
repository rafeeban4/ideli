package servlet;

import java.io.PrintWriter;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
        name = "MyServlet",
        urlPatterns = {"/main"}
    )

public class HelloServlet extends HttpServlet
{
  @Override
   protected void doGet  (HttpServletRequest req, HttpServletResponse res)
          throws ServletException, IOException
   {

        res.setContentType ("text/html");
        PrintWriter out = res.getWriter ();

        out.println ("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "    <head>\n" +
                "        <meta charset=\"utf-8\" />\n" +
                "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\n" +
                "        <meta name=\"description\" content=\"\" />\n" +
                "        <meta name=\"author\" content=\"\" />\n" +
                "        <title>Freelancer - Start Bootstrap Theme</title>\n" +
                "        <!-- Favicon-->\n" +
                "        <link rel=\"icon\" type=\"image/x-icon\" href=\"assets/img/favicon.ico\" />\n" +
                "        <!-- Font Awesome icons (free version)-->\n" +
                "        <script src=\"https://use.fontawesome.com/releases/v5.13.0/js/all.js\" crossorigin=\"anonymous\"></script>\n" +
                "        <!-- Google fonts-->\n" +
                "        <link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700\" rel=\"stylesheet\" type=\"text/css\" />\n" +
                "        <link href=\"https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic\" rel=\"stylesheet\" type=\"text/css\" />\n" +
                "        <!-- Core theme CSS (includes Bootstrap)-->\n" +
                "        <link href=\"css/styles.css\" rel=\"stylesheet\" />\n" +
                "    </head>\n" +
                "    <body id=\"page-top\">\n" +
                "        <!-- Navigation-->\n" +
                "        <nav class=\"navbar navbar-expand-lg bg-secondary text-uppercase fixed-top\" id=\"mainNav\">\n" +
                "            <div class=\"container\">\n" +
                "                <a class=\"navbar-brand js-scroll-trigger\" href=\"#page-top\">Start Bootstrap</a>\n" +
                "                <button class=\"navbar-toggler navbar-toggler-right text-uppercase font-weight-bold bg-primary text-white rounded\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n" +
                "                    Menu\n" +
                "                    <i class=\"fas fa-bars\"></i>\n" +
                "                </button>\n" +
                "                <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\n" +
                "                    <ul class=\"navbar-nav ml-auto\">\n" +
                "                        <li class=\"nav-item mx-0 mx-lg-1\"><a class=\"nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger\" href=\"#portfolio\">Portfolio</a></li>\n" +
                "                        <li class=\"nav-item mx-0 mx-lg-1\"><a class=\"nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger\" href=\"#about\">About</a></li>\n" +
                "                        <li class=\"nav-item mx-0 mx-lg-1\"><a class=\"nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger\" href=\"#contact\">Contact</a></li>\n" +
                "                    </ul>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "        </nav>\n" +
                "        <!-- Masthead-->\n" +
                "        <header class=\"masthead bg-primary text-white text-center\">\n" +
                "            <div class=\"container d-flex align-items-center flex-column\">\n" +
                "                <!-- Masthead Avatar Image-->\n" +
                "                <img class=\"masthead-avatar mb-5\" src=\"assets/img/avataaars.svg\" alt=\"\" />\n" +
                "                <!-- Masthead Heading-->\n" +
                "                <h1 class=\"masthead-heading text-uppercase mb-0\">Start Bootstrap</h1>\n" +
                "                <!-- Icon Divider-->\n" +
                "                <div class=\"divider-custom divider-light\">\n" +
                "                    <div class=\"divider-custom-line\"></div>\n" +
                "                    <div class=\"divider-custom-icon\"><i class=\"fas fa-star\"></i></div>\n" +
                "                    <div class=\"divider-custom-line\"></div>\n" +
                "                </div>\n" +
                "                <!-- Masthead Subheading-->\n" +
                "                <p class=\"masthead-subheading font-weight-light mb-0\">Graphic Artist - Web Designer - Illustrator</p>\n" +
                "            </div>\n" +
                "        </header>\n" +
                "        <!-- Portfolio Section-->\n" +
                "        <section class=\"page-section portfolio\" id=\"portfolio\">\n" +
                "            <div class=\"container\">\n" +
                "                <!-- Portfolio Section Heading-->\n" +
                "                <h2 class=\"page-section-heading text-center text-uppercase text-secondary mb-0\">Portfolio</h2>\n" +
                "                <!-- Icon Divider-->\n" +
                "                <div class=\"divider-custom\">\n" +
                "                    <div class=\"divider-custom-line\"></div>\n" +
                "                    <div class=\"divider-custom-icon\"><i class=\"fas fa-star\"></i></div>\n" +
                "                    <div class=\"divider-custom-line\"></div>\n" +
                "                </div>\n" +
                "                <!-- Portfolio Grid Items-->\n" +
                "                <div class=\"row\">\n" +
                "                    <!-- Portfolio Item 1-->\n" +
                "                    <div class=\"col-md-6 col-lg-4 mb-5\">\n" +
                "                        <div class=\"portfolio-item mx-auto\" data-toggle=\"modal\" data-target=\"#portfolioModal1\">\n" +
                "                            <div class=\"portfolio-item-caption d-flex align-items-center justify-content-center h-100 w-100\">\n" +
                "                                <div class=\"portfolio-item-caption-content text-center text-white\"><i class=\"fas fa-plus fa-3x\"></i></div>\n" +
                "                            </div>\n" +
                "                            <img class=\"img-fluid\" src=\"assets/img/portfolio/cabin.png\" alt=\"\" />\n" +
                "                        </div>\n" +
                "                    </div>\n" +
                "                    <!-- Portfolio Item 2-->\n" +
                "                    <div class=\"col-md-6 col-lg-4 mb-5\">\n" +
                "                        <div class=\"portfolio-item mx-auto\" data-toggle=\"modal\" data-target=\"#portfolioModal2\">\n" +
                "                            <div class=\"portfolio-item-caption d-flex align-items-center justify-content-center h-100 w-100\">\n" +
                "                                <div class=\"portfolio-item-caption-content text-center text-white\"><i class=\"fas fa-plus fa-3x\"></i></div>\n" +
                "                            </div>\n" +
                "                            <img class=\"img-fluid\" src=\"assets/img/portfolio/cake.png\" alt=\"\" />\n" +
                "                        </div>\n" +
                "                    </div>\n" +
                "                    <!-- Portfolio Item 3-->\n" +
                "                    <div class=\"col-md-6 col-lg-4 mb-5\">\n" +
                "                        <div class=\"portfolio-item mx-auto\" data-toggle=\"modal\" data-target=\"#portfolioModal3\">\n" +
                "                            <div class=\"portfolio-item-caption d-flex align-items-center justify-content-center h-100 w-100\">\n" +
                "                                <div class=\"portfolio-item-caption-content text-center text-white\"><i class=\"fas fa-plus fa-3x\"></i></div>\n" +
                "                            </div>\n" +
                "                            <img class=\"img-fluid\" src=\"assets/img/portfolio/circus.png\" alt=\"\" />\n" +
                "                        </div>\n" +
                "                    </div>\n" +
                "                    <!-- Portfolio Item 4-->\n" +
                "                    <div class=\"col-md-6 col-lg-4 mb-5 mb-lg-0\">\n" +
                "                        <div class=\"portfolio-item mx-auto\" data-toggle=\"modal\" data-target=\"#portfolioModal4\">\n" +
                "                            <div class=\"portfolio-item-caption d-flex align-items-center justify-content-center h-100 w-100\">\n" +
                "                                <div class=\"portfolio-item-caption-content text-center text-white\"><i class=\"fas fa-plus fa-3x\"></i></div>\n" +
                "                            </div>\n" +
                "                            <img class=\"img-fluid\" src=\"assets/img/portfolio/game.png\" alt=\"\" />\n" +
                "                        </div>\n" +
                "                    </div>\n" +
                "                    <!-- Portfolio Item 5-->\n" +
                "                    <div class=\"col-md-6 col-lg-4 mb-5 mb-md-0\">\n" +
                "                        <div class=\"portfolio-item mx-auto\" data-toggle=\"modal\" data-target=\"#portfolioModal5\">\n" +
                "                            <div class=\"portfolio-item-caption d-flex align-items-center justify-content-center h-100 w-100\">\n" +
                "                                <div class=\"portfolio-item-caption-content text-center text-white\"><i class=\"fas fa-plus fa-3x\"></i></div>\n" +
                "                            </div>\n" +
                "                            <img class=\"img-fluid\" src=\"assets/img/portfolio/safe.png\" alt=\"\" />\n" +
                "                        </div>\n" +
                "                    </div>\n" +
                "                    <!-- Portfolio Item 6-->\n" +
                "                    <div class=\"col-md-6 col-lg-4\">\n" +
                "                        <div class=\"portfolio-item mx-auto\" data-toggle=\"modal\" data-target=\"#portfolioModal6\">\n" +
                "                            <div class=\"portfolio-item-caption d-flex align-items-center justify-content-center h-100 w-100\">\n" +
                "                                <div class=\"portfolio-item-caption-content text-center text-white\"><i class=\"fas fa-plus fa-3x\"></i></div>\n" +
                "                            </div>\n" +
                "                            <img class=\"img-fluid\" src=\"assets/img/portfolio/submarine.png\" alt=\"\" />\n" +
                "                        </div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "        </section>\n" +
                "        <!-- About Section-->\n" +
                "        <section class=\"page-section bg-primary text-white mb-0\" id=\"about\">\n" +
                "            <div class=\"container\">\n" +
                "                <!-- About Section Heading-->\n" +
                "                <h2 class=\"page-section-heading text-center text-uppercase text-white\">About</h2>\n" +
                "                <!-- Icon Divider-->\n" +
                "                <div class=\"divider-custom divider-light\">\n" +
                "                    <div class=\"divider-custom-line\"></div>\n" +
                "                    <div class=\"divider-custom-icon\"><i class=\"fas fa-star\"></i></div>\n" +
                "                    <div class=\"divider-custom-line\"></div>\n" +
                "                </div>\n" +
                "                <!-- About Section Content-->\n" +
                "                <div class=\"row\">\n" +
                "                    <div class=\"col-lg-4 ml-auto\"><p class=\"lead\">Freelancer is a free bootstrap theme created by Start Bootstrap. The download includes the complete source files including HTML, CSS, and JavaScript as well as optional SASS stylesheets for easy customization.</p></div>\n" +
                "                    <div class=\"col-lg-4 mr-auto\"><p class=\"lead\">You can create your own custom avatar for the masthead, change the icon in the dividers, and add your email address to the contact form to make it fully functional!</p></div>\n" +
                "                </div>\n" +
                "                <!-- About Section Button-->\n" +
                "                <div class=\"text-center mt-4\">\n" +
                "                    <a class=\"btn btn-xl btn-outline-light\" href=\"https://startbootstrap.com/themes/freelancer/\">\n" +
                "                        <i class=\"fas fa-download mr-2\"></i>\n" +
                "                        Free Download!\n" +
                "                    </a>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "        </section>\n" +
                "        <!-- Contact Section-->\n" +
                "        <section class=\"page-section\" id=\"contact\">\n" +
                "            <div class=\"container\">\n" +
                "                <!-- Contact Section Heading-->\n" +
                "                <h2 class=\"page-section-heading text-center text-uppercase text-secondary mb-0\">Contact Me</h2>\n" +
                "                <!-- Icon Divider-->\n" +
                "                <div class=\"divider-custom\">\n" +
                "                    <div class=\"divider-custom-line\"></div>\n" +
                "                    <div class=\"divider-custom-icon\"><i class=\"fas fa-star\"></i></div>\n" +
                "                    <div class=\"divider-custom-line\"></div>\n" +
                "                </div>\n" +
                "                <!-- Contact Section Form-->\n" +
                "                <div class=\"row\">\n" +
                "                    <div class=\"col-lg-8 mx-auto\">\n" +
                "                        <!-- To configure the contact form email address, go to mail/contact_me.php and update the email address in the PHP file on line 19.-->\n" +
                "                        <form id=\"contactForm\" name=\"sentMessage\" novalidate=\"novalidate\">\n" +
                "                            <div class=\"control-group\">\n" +
                "                                <div class=\"form-group floating-label-form-group controls mb-0 pb-2\">\n" +
                "                                    <label>Name</label>\n" +
                "                                    <input class=\"form-control\" id=\"name\" type=\"text\" placeholder=\"Name\" required=\"required\" data-validation-required-message=\"Please enter your name.\" />\n" +
                "                                    <p class=\"help-block text-danger\"></p>\n" +
                "                                </div>\n" +
                "                            </div>\n" +
                "                            <div class=\"control-group\">\n" +
                "                                <div class=\"form-group floating-label-form-group controls mb-0 pb-2\">\n" +
                "                                    <label>Email Address</label>\n" +
                "                                    <input class=\"form-control\" id=\"email\" type=\"email\" placeholder=\"Email Address\" required=\"required\" data-validation-required-message=\"Please enter your email address.\" />\n" +
                "                                    <p class=\"help-block text-danger\"></p>\n" +
                "                                </div>\n" +
                "                            </div>\n" +
                "                            <div class=\"control-group\">\n" +
                "                                <div class=\"form-group floating-label-form-group controls mb-0 pb-2\">\n" +
                "                                    <label>Phone Number</label>\n" +
                "                                    <input class=\"form-control\" id=\"phone\" type=\"tel\" placeholder=\"Phone Number\" required=\"required\" data-validation-required-message=\"Please enter your phone number.\" />\n" +
                "                                    <p class=\"help-block text-danger\"></p>\n" +
                "                                </div>\n" +
                "                            </div>\n" +
                "                            <div class=\"control-group\">\n" +
                "                                <div class=\"form-group floating-label-form-group controls mb-0 pb-2\">\n" +
                "                                    <label>Message</label>\n" +
                "                                    <textarea class=\"form-control\" id=\"message\" rows=\"5\" placeholder=\"Message\" required=\"required\" data-validation-required-message=\"Please enter a message.\"></textarea>\n" +
                "                                    <p class=\"help-block text-danger\"></p>\n" +
                "                                </div>\n" +
                "                            </div>\n" +
                "                            <br />\n" +
                "                            <div id=\"success\"></div>\n" +
                "                            <div class=\"form-group\"><button class=\"btn btn-primary btn-xl\" id=\"sendMessageButton\" type=\"submit\">Send</button></div>\n" +
                "                        </form>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "        </section>\n" +
                "        <!-- Footer-->\n" +
                "        <footer class=\"footer text-center\">\n" +
                "            <div class=\"container\">\n" +
                "                <div class=\"row\">\n" +
                "                    <!-- Footer Location-->\n" +
                "                    <div class=\"col-lg-4 mb-5 mb-lg-0\">\n" +
                "                        <h4 class=\"text-uppercase mb-4\">Location</h4>\n" +
                "                        <p class=\"lead mb-0\">\n" +
                "                            2215 John Daniel Drive\n" +
                "                            <br />\n" +
                "                            Clark, MO 65243\n" +
                "                        </p>\n" +
                "                    </div>\n" +
                "                    <!-- Footer Social Icons-->\n" +
                "                    <div class=\"col-lg-4 mb-5 mb-lg-0\">\n" +
                "                        <h4 class=\"text-uppercase mb-4\">Around the Web</h4>\n" +
                "                        <a class=\"btn btn-outline-light btn-social mx-1\" href=\"#!\"><i class=\"fab fa-fw fa-facebook-f\"></i></a>\n" +
                "                        <a class=\"btn btn-outline-light btn-social mx-1\" href=\"#!\"><i class=\"fab fa-fw fa-twitter\"></i></a>\n" +
                "                        <a class=\"btn btn-outline-light btn-social mx-1\" href=\"#!\"><i class=\"fab fa-fw fa-linkedin-in\"></i></a>\n" +
                "                        <a class=\"btn btn-outline-light btn-social mx-1\" href=\"#!\"><i class=\"fab fa-fw fa-dribbble\"></i></a>\n" +
                "                    </div>\n" +
                "                    <!-- Footer About Text-->\n" +
                "                    <div class=\"col-lg-4\">\n" +
                "                        <h4 class=\"text-uppercase mb-4\">About Freelancer</h4>\n" +
                "                        <p class=\"lead mb-0\">\n" +
                "                            Freelance is a free to use, MIT licensed Bootstrap theme created by\n" +
                "                            <a href=\"http://startbootstrap.com\">Start Bootstrap</a>\n" +
                "                            .\n" +
                "                        </p>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "        </footer>\n" +
                "        <!-- Copyright Section-->\n" +
                "        <div class=\"copyright py-4 text-center text-white\">\n" +
                "            <div class=\"container\"><small>Copyright © Your Website 2020</small></div>\n" +
                "        </div>\n" +
                "        <!-- Scroll to Top Button (Only visible on small and extra-small screen sizes)-->\n" +
                "        <div class=\"scroll-to-top d-lg-none position-fixed\">\n" +
                "            <a class=\"js-scroll-trigger d-block text-center text-white rounded\" href=\"#page-top\"><i class=\"fa fa-chevron-up\"></i></a>\n" +
                "        </div>\n" +
                "        <!-- Portfolio Modals-->\n" +
                "        <!-- Portfolio Modal 1-->\n" +
                "        <div class=\"portfolio-modal modal fade\" id=\"portfolioModal1\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"portfolioModal1Label\" aria-hidden=\"true\">\n" +
                "            <div class=\"modal-dialog modal-xl\" role=\"document\">\n" +
                "                <div class=\"modal-content\">\n" +
                "                    <button class=\"close\" type=\"button\" data-dismiss=\"modal\" aria-label=\"Close\">\n" +
                "                        <span aria-hidden=\"true\"><i class=\"fas fa-times\"></i></span>\n" +
                "                    </button>\n" +
                "                    <div class=\"modal-body text-center\">\n" +
                "                        <div class=\"container\">\n" +
                "                            <div class=\"row justify-content-center\">\n" +
                "                                <div class=\"col-lg-8\">\n" +
                "                                    <!-- Portfolio Modal - Title-->\n" +
                "                                    <h2 class=\"portfolio-modal-title text-secondary text-uppercase mb-0\" id=\"portfolioModal1Label\">Log Cabin</h2>\n" +
                "                                    <!-- Icon Divider-->\n" +
                "                                    <div class=\"divider-custom\">\n" +
                "                                        <div class=\"divider-custom-line\"></div>\n" +
                "                                        <div class=\"divider-custom-icon\"><i class=\"fas fa-star\"></i></div>\n" +
                "                                        <div class=\"divider-custom-line\"></div>\n" +
                "                                    </div>\n" +
                "                                    <!-- Portfolio Modal - Image-->\n" +
                "                                    <img class=\"img-fluid rounded mb-5\" src=\"assets/img/portfolio/cabin.png\" alt=\"\" />\n" +
                "                                    <!-- Portfolio Modal - Text-->\n" +
                "                                    <p class=\"mb-5\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Mollitia neque assumenda ipsam nihil, molestias magnam, recusandae quos quis inventore quisquam velit asperiores, vitae? Reprehenderit soluta, eos quod consequuntur itaque. Nam.</p>\n" +
                "                                    <button class=\"btn btn-primary\" data-dismiss=\"modal\">\n" +
                "                                        <i class=\"fas fa-times fa-fw\"></i>\n" +
                "                                        Close Window\n" +
                "                                    </button>\n" +
                "                                </div>\n" +
                "                            </div>\n" +
                "                        </div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "        <!-- Portfolio Modal 2-->\n" +
                "        <div class=\"portfolio-modal modal fade\" id=\"portfolioModal2\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"portfolioModal2Label\" aria-hidden=\"true\">\n" +
                "            <div class=\"modal-dialog modal-xl\" role=\"document\">\n" +
                "                <div class=\"modal-content\">\n" +
                "                    <button class=\"close\" type=\"button\" data-dismiss=\"modal\" aria-label=\"Close\">\n" +
                "                        <span aria-hidden=\"true\"><i class=\"fas fa-times\"></i></span>\n" +
                "                    </button>\n" +
                "                    <div class=\"modal-body text-center\">\n" +
                "                        <div class=\"container\">\n" +
                "                            <div class=\"row justify-content-center\">\n" +
                "                                <div class=\"col-lg-8\">\n" +
                "                                    <!-- Portfolio Modal - Title-->\n" +
                "                                    <h2 class=\"portfolio-modal-title text-secondary text-uppercase mb-0\" id=\"portfolioModal2Label\">Tasty Cake</h2>\n" +
                "                                    <!-- Icon Divider-->\n" +
                "                                    <div class=\"divider-custom\">\n" +
                "                                        <div class=\"divider-custom-line\"></div>\n" +
                "                                        <div class=\"divider-custom-icon\"><i class=\"fas fa-star\"></i></div>\n" +
                "                                        <div class=\"divider-custom-line\"></div>\n" +
                "                                    </div>\n" +
                "                                    <!-- Portfolio Modal - Image-->\n" +
                "                                    <img class=\"img-fluid rounded mb-5\" src=\"assets/img/portfolio/cake.png\" alt=\"\" />\n" +
                "                                    <!-- Portfolio Modal - Text-->\n" +
                "                                    <p class=\"mb-5\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Mollitia neque assumenda ipsam nihil, molestias magnam, recusandae quos quis inventore quisquam velit asperiores, vitae? Reprehenderit soluta, eos quod consequuntur itaque. Nam.</p>\n" +
                "                                    <button class=\"btn btn-primary\" data-dismiss=\"modal\">\n" +
                "                                        <i class=\"fas fa-times fa-fw\"></i>\n" +
                "                                        Close Window\n" +
                "                                    </button>\n" +
                "                                </div>\n" +
                "                            </div>\n" +
                "                        </div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "        <!-- Portfolio Modal 3-->\n" +
                "        <div class=\"portfolio-modal modal fade\" id=\"portfolioModal3\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"portfolioModal3Label\" aria-hidden=\"true\">\n" +
                "            <div class=\"modal-dialog modal-xl\" role=\"document\">\n" +
                "                <div class=\"modal-content\">\n" +
                "                    <button class=\"close\" type=\"button\" data-dismiss=\"modal\" aria-label=\"Close\">\n" +
                "                        <span aria-hidden=\"true\"><i class=\"fas fa-times\"></i></span>\n" +
                "                    </button>\n" +
                "                    <div class=\"modal-body text-center\">\n" +
                "                        <div class=\"container\">\n" +
                "                            <div class=\"row justify-content-center\">\n" +
                "                                <div class=\"col-lg-8\">\n" +
                "                                    <!-- Portfolio Modal - Title-->\n" +
                "                                    <h2 class=\"portfolio-modal-title text-secondary text-uppercase mb-0\" id=\"portfolioModal3Label\">Circus Tent</h2>\n" +
                "                                    <!-- Icon Divider-->\n" +
                "                                    <div class=\"divider-custom\">\n" +
                "                                        <div class=\"divider-custom-line\"></div>\n" +
                "                                        <div class=\"divider-custom-icon\"><i class=\"fas fa-star\"></i></div>\n" +
                "                                        <div class=\"divider-custom-line\"></div>\n" +
                "                                    </div>\n" +
                "                                    <!-- Portfolio Modal - Image-->\n" +
                "                                    <img class=\"img-fluid rounded mb-5\" src=\"assets/img/portfolio/circus.png\" alt=\"\" />\n" +
                "                                    <!-- Portfolio Modal - Text-->\n" +
                "                                    <p class=\"mb-5\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Mollitia neque assumenda ipsam nihil, molestias magnam, recusandae quos quis inventore quisquam velit asperiores, vitae? Reprehenderit soluta, eos quod consequuntur itaque. Nam.</p>\n" +
                "                                    <button class=\"btn btn-primary\" data-dismiss=\"modal\">\n" +
                "                                        <i class=\"fas fa-times fa-fw\"></i>\n" +
                "                                        Close Window\n" +
                "                                    </button>\n" +
                "                                </div>\n" +
                "                            </div>\n" +
                "                        </div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "        <!-- Portfolio Modal 4-->\n" +
                "        <div class=\"portfolio-modal modal fade\" id=\"portfolioModal4\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"portfolioModal4Label\" aria-hidden=\"true\">\n" +
                "            <div class=\"modal-dialog modal-xl\" role=\"document\">\n" +
                "                <div class=\"modal-content\">\n" +
                "                    <button class=\"close\" type=\"button\" data-dismiss=\"modal\" aria-label=\"Close\">\n" +
                "                        <span aria-hidden=\"true\"><i class=\"fas fa-times\"></i></span>\n" +
                "                    </button>\n" +
                "                    <div class=\"modal-body text-center\">\n" +
                "                        <div class=\"container\">\n" +
                "                            <div class=\"row justify-content-center\">\n" +
                "                                <div class=\"col-lg-8\">\n" +
                "                                    <!-- Portfolio Modal - Title-->\n" +
                "                                    <h2 class=\"portfolio-modal-title text-secondary text-uppercase mb-0\" id=\"portfolioModal4Label\">Controller</h2>\n" +
                "                                    <!-- Icon Divider-->\n" +
                "                                    <div class=\"divider-custom\">\n" +
                "                                        <div class=\"divider-custom-line\"></div>\n" +
                "                                        <div class=\"divider-custom-icon\"><i class=\"fas fa-star\"></i></div>\n" +
                "                                        <div class=\"divider-custom-line\"></div>\n" +
                "                                    </div>\n" +
                "                                    <!-- Portfolio Modal - Image-->\n" +
                "                                    <img class=\"img-fluid rounded mb-5\" src=\"assets/img/portfolio/game.png\" alt=\"\" />\n" +
                "                                    <!-- Portfolio Modal - Text-->\n" +
                "                                    <p class=\"mb-5\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Mollitia neque assumenda ipsam nihil, molestias magnam, recusandae quos quis inventore quisquam velit asperiores, vitae? Reprehenderit soluta, eos quod consequuntur itaque. Nam.</p>\n" +
                "                                    <button class=\"btn btn-primary\" data-dismiss=\"modal\">\n" +
                "                                        <i class=\"fas fa-times fa-fw\"></i>\n" +
                "                                        Close Window\n" +
                "                                    </button>\n" +
                "                                </div>\n" +
                "                            </div>\n" +
                "                        </div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "        <!-- Portfolio Modal 5-->\n" +
                "        <div class=\"portfolio-modal modal fade\" id=\"portfolioModal5\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"portfolioModal5Label\" aria-hidden=\"true\">\n" +
                "            <div class=\"modal-dialog modal-xl\" role=\"document\">\n" +
                "                <div class=\"modal-content\">\n" +
                "                    <button class=\"close\" type=\"button\" data-dismiss=\"modal\" aria-label=\"Close\">\n" +
                "                        <span aria-hidden=\"true\"><i class=\"fas fa-times\"></i></span>\n" +
                "                    </button>\n" +
                "                    <div class=\"modal-body text-center\">\n" +
                "                        <div class=\"container\">\n" +
                "                            <div class=\"row justify-content-center\">\n" +
                "                                <div class=\"col-lg-8\">\n" +
                "                                    <!-- Portfolio Modal - Title-->\n" +
                "                                    <h2 class=\"portfolio-modal-title text-secondary text-uppercase mb-0\" id=\"portfolioModal5Label\">Locked Safe</h2>\n" +
                "                                    <!-- Icon Divider-->\n" +
                "                                    <div class=\"divider-custom\">\n" +
                "                                        <div class=\"divider-custom-line\"></div>\n" +
                "                                        <div class=\"divider-custom-icon\"><i class=\"fas fa-star\"></i></div>\n" +
                "                                        <div class=\"divider-custom-line\"></div>\n" +
                "                                    </div>\n" +
                "                                    <!-- Portfolio Modal - Image-->\n" +
                "                                    <img class=\"img-fluid rounded mb-5\" src=\"assets/img/portfolio/safe.png\" alt=\"\" />\n" +
                "                                    <!-- Portfolio Modal - Text-->\n" +
                "                                    <p class=\"mb-5\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Mollitia neque assumenda ipsam nihil, molestias magnam, recusandae quos quis inventore quisquam velit asperiores, vitae? Reprehenderit soluta, eos quod consequuntur itaque. Nam.</p>\n" +
                "                                    <button class=\"btn btn-primary\" data-dismiss=\"modal\">\n" +
                "                                        <i class=\"fas fa-times fa-fw\"></i>\n" +
                "                                        Close Window\n" +
                "                                    </button>\n" +
                "                                </div>\n" +
                "                            </div>\n" +
                "                        </div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "        <!-- Portfolio Modal 6-->\n" +
                "        <div class=\"portfolio-modal modal fade\" id=\"portfolioModal6\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"portfolioModal6Label\" aria-hidden=\"true\">\n" +
                "            <div class=\"modal-dialog modal-xl\" role=\"document\">\n" +
                "                <div class=\"modal-content\">\n" +
                "                    <button class=\"close\" type=\"button\" data-dismiss=\"modal\" aria-label=\"Close\">\n" +
                "                        <span aria-hidden=\"true\"><i class=\"fas fa-times\"></i></span>\n" +
                "                    </button>\n" +
                "                    <div class=\"modal-body text-center\">\n" +
                "                        <div class=\"container\">\n" +
                "                            <div class=\"row justify-content-center\">\n" +
                "                                <div class=\"col-lg-8\">\n" +
                "                                    <!-- Portfolio Modal - Title-->\n" +
                "                                    <h2 class=\"portfolio-modal-title text-secondary text-uppercase mb-0\" id=\"portfolioModal6Label\">Submarine</h2>\n" +
                "                                    <!-- Icon Divider-->\n" +
                "                                    <div class=\"divider-custom\">\n" +
                "                                        <div class=\"divider-custom-line\"></div>\n" +
                "                                        <div class=\"divider-custom-icon\"><i class=\"fas fa-star\"></i></div>\n" +
                "                                        <div class=\"divider-custom-line\"></div>\n" +
                "                                    </div>\n" +
                "                                    <!-- Portfolio Modal - Image-->\n" +
                "                                    <img class=\"img-fluid rounded mb-5\" src=\"assets/img/portfolio/submarine.png\" alt=\"\" />\n" +
                "                                    <!-- Portfolio Modal - Text-->\n" +
                "                                    <p class=\"mb-5\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Mollitia neque assumenda ipsam nihil, molestias magnam, recusandae quos quis inventore quisquam velit asperiores, vitae? Reprehenderit soluta, eos quod consequuntur itaque. Nam.</p>\n" +
                "                                    <button class=\"btn btn-primary\" data-dismiss=\"modal\">\n" +
                "                                        <i class=\"fas fa-times fa-fw\"></i>\n" +
                "                                        Close Window\n" +
                "                                    </button>\n" +
                "                                </div>\n" +
                "                            </div>\n" +
                "                        </div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "        <!-- Bootstrap core JS-->\n" +
                "        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n" +
                "        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.bundle.min.js\"></script>\n" +
                "        <!-- Third party plugin JS-->\n" +
                "        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.min.js\"></script>\n" +
                "        <!-- Contact form JS-->\n" +
                "        <script src=\"assets/mail/jqBootstrapValidation.js\"></script>\n" +
                "        <script src=\"assets/mail/contact_me.js\"></script>\n" +
                "        <!-- Core theme JS-->\n" +
                "        <script src=\"js/scripts.js\"></script>\n" +
                "    </body>\n" +
                "</html>\n");
        out.flush();

        out.close ();

    }
}
