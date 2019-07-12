package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("               <div>\n");
      out.write("            <a class=\"hiddenanchor\" id=\"signup\"></a>\n");
      out.write("            <a class=\"hiddenanchor\" id=\"signin\"></a>\n");
      out.write("\n");
      out.write("            <div class=\"login_wrapper\">\n");
      out.write("                <div class=\"animate form login_form\">\n");
      out.write("                    <section class=\"login_content\">                       \n");
      out.write("                        <form  method=\"post\" class=\"InicioForm\" action=\"Menu.jsp\">\n");
      out.write("                            <h1>Iniciar Sesion</h1>\n");
      out.write("                            <div>\n");
      out.write("                                <input type=\"text\" name=\"IdUsuario\" class=\"form-control\" placeholder=\"Ingrese Pin\" value=\"\"  />\n");
      out.write("                            </div>\n");
      out.write("                            <div>\n");
      out.write("                                <input type=\"text\" name=\"Nombre\" class=\"form-control\" value=\"\" placeholder=\"Nombre Usuario\"  />\n");
      out.write("                            </div>\n");
      out.write("                            <div>\n");
      out.write("                                <input class=\"btn btn-default submit btnIngresar text-center\" class=\"button_text\" type=\"submit\" name=\"submit\" value=\"Ingresar\">\n");
      out.write("                                <a class=\"reset_pass\" href=\"recuperarContraseña.jsp\">Olvidaste tu contraseña?</a>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"clearfix\"></div>\n");
      out.write("\n");
      out.write("                            <div class=\"separator\">\n");
      out.write("                                <p class=\"change_link\">New to site?\n");
      out.write("                                    <a href=\"#signup\" class=\"to_register\"> Crear Cuenta </a>\n");
      out.write("                                </p>\n");
      out.write("\n");
      out.write("                                <div class=\"clearfix\"></div>\n");
      out.write("                                <br/>\n");
      out.write("                                <div>\n");
      out.write("                                    <h1><i class=\"fa fa-paw\"></i> Prueba!</h1>\n");
      out.write("                                    <p>©2019 All Rights Reserved. Prueba! </p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </section>\n");
      out.write("                </div>\n");
      out.write("                <script>\n");
      out.write("                String IdUsuario = request.getParameter(\"IdUsuario\");    \n");
      out.write("    String Nombre = request.getParameter(\"Nombre\");\n");
      out.write("    Class.forName(\"com.mysql.jdbc.Driver\");\n");
      out.write("    Connection con = DriverManager.getConnection(\"jdbc:mysql://localhost:3306/prueba\",\n");
      out.write("            \"root\", \"root\");\n");
      out.write("    Statement st = con.createStatement();\n");
      out.write("    ResultSet rs;\n");
      out.write("           session.setAttribute(\" rs = st.executeQuery(\"select * from usuario where IdUsuario='\" + IdUsuario + \"' and Nombre='\" + Nombre + \"'\");\"\n");
      out.write("\n");
      out.write("    if (rs.next()) {\n");
      out.write("        alert(111);\n");
      out.write("       // session.setAttribute(\"IdUsuario\", IdUsuario);\n");
      out.write("         response.sendRedirect(\"Menu.jsp\");\n");
      out.write("    } else {\n");
      out.write("        alert(11);\n");
      out.write("       response.sendRedirect(\"errorLogin.jsp\");\n");
      out.write("    }\n");
      out.write("    </script>\n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("    \n");
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
