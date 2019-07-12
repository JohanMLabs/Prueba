package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RegistrarHardware_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        \n");
      out.write("    <from>\n");
      out.write("        <div class=\"from\" tabindex=\"-1\" role=\"dialog\" aria-hidden=\"true\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("                <h4 class=\"text-center\"> Registrar Hardware</h4>\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("             \n");
      out.write("                <form action=\"Hardware\" method=\"POST\" class=\"text-center\" id=\"formRegistrarHardware\">\n");
      out.write("                    <input style=\"width: 49%;height: 34px;\"name=\"IdHardware\" id=\"IdHardware\" class=\"required\" placeholder=\" IdHardware\" type=\"number\">\n");
      out.write("                    <input style=\"width: 49%;height: 34px;\"name=\"Nombre\" id=\"usuario\" class=\"required\" placeholder=\"Nombre\" type=\"text\"><br><br>\n");
      out.write("                    <input style=\"width: 49%;height: 34px;\"name=\"Descripcion\" id=\"clave\" class=\"required\" placeholder=\" Descripcion\" type=\"text\">\n");
      out.write("                    <input style=\"width: 49%;height: 34px;\" name=\"Observacion\" id=\"nombres\" class=\"required\" placeholder=\" Nombres\" type=\"text\"><br><br>\n");
      out.write("                    <label>PrestamoFK</label><br>\n");
      out.write("                    \n");
      out.write("                    <select name=\"EstadoFK\" >\n");
      out.write("\n");
      out.write("                        <option>Libre</option>\n");
      out.write("\n");
      out.write("                        <option>Ocupado</option>\n");
      out.write("                        \n");
      out.write("                    </select>\n");
      out.write("\n");
      out.write("                    <input style=\"width: 49%;height: 34px;\" name=\"EstadoObjeto\" id=\"EstadoObjeto\" class=\"required\" placeholder=\" Estado del Objeto\" type=\"text\"><br><br>\n");
      out.write("                    <input style=\"width: 49%;height: 34px;\"  name=\"Marca\" id=\"Marca\" class=\"required \" placeholder=\" Marca\" type=\"text\">\n");
      out.write("                    <input style=\"width: 49%;height: 34px;\"  name=\"Referencia\" id=\"Referencia\" class=\"required \" placeholder=\" Referencia\" type=\"text\">\n");
      out.write("                    <input style=\"width: 49%;height: 34px;\"  name=\"AsignacionFK\" id=\"AsignacionFK\" class=\"required \" placeholder=\" AsignacionFK\" type=\"text\">\n");
      out.write("                    <input style=\"width: 49%;height: 34px;\"  name=\"FechaCreado\" id=\"FechaCreado\" class=\"required \" placeholder=\" Fecha de Creado\" type=\"date\">\n");
      out.write("                    <input style=\"width: 49%;height: 34px;\"  name=\"FechaModifi\" id=\"FechaModifi\" class=\"required \" placeholder=\" Fecha de Modificacion\" type=\"date\">\n");
      out.write("                    <label>PrestamoFK</label><br>\n");
      out.write("                    \n");
      out.write("                    <select name=\"UsuarioFK\" >\n");
      out.write("\n");
      out.write("                        <option>Libre</option>\n");
      out.write("\n");
      out.write("                        <option>Ocupado</option>\n");
      out.write("                        <\n");
      out.write("                    </select>\n");
      out.write("                    <input style=\"width: 49%;height: 34px;\"  name=\"Marca\" id=\"Marca\" class=\"required \" placeholder=\" Marca\" type=\"text\">\n");
      out.write("                    <input style=\"width: 49%;height: 34px;\"  name=\"Marca\" id=\"Marca\" class=\"required \" placeholder=\" Marca\" type=\"text\">\n");
      out.write("                    \n");
      out.write("                    <input id=\"btnRegistrar\" class=\"btn btn-outline-primary\" type=\"submit\" name=\"opcion\" value=\"1\">\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-footer\">\n");
      out.write("                <a class=\"btn btn-danger\" type=\"button\" href=\"ListarHardware.jsp\" type=\"button\" >Cerrar</>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("    </from>   \n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
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
