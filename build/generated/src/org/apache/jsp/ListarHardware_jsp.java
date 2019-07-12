package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import Config.Conexion;
import java.util.ArrayList;
import java.util.List;
import DAO.HardwareDAO;
import VO.HardwareVO;

public final class ListarHardware_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"js/datatables.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/jquery.validate.js\" ></script>\n");
      out.write("<script src=\"js/messages_es.js.js\"></script>\n");
      out.write("\n");
      out.write("      <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\"\n");
      out.write("              crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("<h1 class=\"text-center\">Consultar Hardware.</h1><br>\n");
      out.write("<a class=\"add-proj brd-rd5\" href=\"#\" data-toggle=\"modal\" data-target=\".bs-example-modal-sm\" title=\"Add Project\">+ Agregar</a>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<style>\n");
      out.write("    label.error{\n");
      out.write("        position:absolute;\n");
      out.write("        display: block;\n");
      out.write("        color: red;\n");
      out.write("    }\n");
      out.write("    label.valid{\n");
      out.write("        padding:10px;\n");
      out.write("        margin-left:10px;\n");
      out.write("        display: inline;\n");
      out.write("\n");
      out.write("    }\n");
      out.write("\n");
      out.write("</style>\n");

    Conexion conexion = new Conexion();
    Statement puente;
    ResultSet rs;
    puente = conexion.obtenerConexion().createStatement();
    // rs = puente.executeQuery("select idUsuario,Usuario,Nombres,Apellidos,Telefono,Correo,Rol from usuarios where Rol = 'cliente' and Estado=1;");
    rs = puente.executeQuery("SELECT `IdHardware`, `Nombre`, `Descripcion`, `Observacion`, `PrestamoFK`, `Estado`, `EstadoObjeto`, `Marca`, `Referencia`, `AsignacionFK`, `FechaCreado`, `FechaModifi`, `UsuarioFK`, `BodegaFK` FROM `hardware` ;");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<form action=\"Hardware\" method=\"POST\">\n");
      out.write("    <table id=\"datatable-keytable\" class=\"table table-striped table-bordered\" style=\"width: 100%;\">\n");
      out.write("        <thead>\n");
      out.write("            <tr>\n");
      out.write("                <td style=\"border: 3px;border-bottom-color: #007bff;\" class=\"text-center\">IdHardware</td>\n");
      out.write("                <td style=\"border: 3px;border-bottom-color: #007bff;\" class=\"text-center\">Nombre</td>\n");
      out.write("                <td style=\"border: 3px;border-bottom-color: #007bff;\" class=\"text-center\">Descripción</td>\n");
      out.write("                <td style=\"border: 3px;border-bottom-color: #007bff;\" class=\"text-center\">Observación</td>\n");
      out.write("                <td style=\"border: 3px;border-bottom-color: #007bff;\" class=\"text-center\">PrestamoFK</td>\n");
      out.write("                <td style=\"border: 3px;border-bottom-color: #007bff;\" class=\"text-center\">Estado</td>\n");
      out.write("                <td style=\"border: 3px;border-bottom-color: #007bff;\" class=\"text-center\">EstadoObjeto</td>\n");
      out.write("                <td style=\"border: 3px;border-bottom-color: #007bff;\" class=\"text-center\">Marca</td>\n");
      out.write("                <td style=\"border: 3px;border-bottom-color: #007bff;\" class=\"text-center\">Referencia</td>\n");
      out.write("                <td style=\"border: 3px;border-bottom-color: #007bff;\" class=\"text-center\">AsignacionFK</td>\n");
      out.write("                <td style=\"border: 3px;border-bottom-color: #007bff;\" class=\"text-center\">FechaCreado</td>\n");
      out.write("                <td style=\"border: 3px;border-bottom-color: #007bff;\" class=\"text-center\">FechaModifi</td>\n");
      out.write("                <td style=\"border: 3px;border-bottom-color: #007bff;\" class=\"text-center\">UsuarioFK</td>\n");
      out.write("                <td style=\"border: 3px;border-bottom-color: #007bff;\" class=\"text-center\">BodegaFK</td>\n");
      out.write("                <td style=\"border: 3px;border-bottom-color: #007bff;\" class=\"text-center\">Acciones</td>\n");
      out.write("\n");
      out.write("            </tr>                    \n");
      out.write("        </thead>\n");
      out.write("        <tbody>\n");
      out.write("\n");
      out.write("            ");

                while (rs.next()) {
            
      out.write("\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td class=\"text-center\">");
      out.print( rs.getString("IdHardware"));
      out.write("</td>\n");
      out.write("                <td class=\"text-center\">");
      out.print( rs.getString("Nombre"));
      out.write("</td>\n");
      out.write("                <td class=\"text-center\">");
      out.print( rs.getString("Descripcion"));
      out.write("</td>\n");
      out.write("                <td class=\"text-center\">");
      out.print( rs.getString("Observacion"));
      out.write("</td>\n");
      out.write("                <td class=\"text-center\">");
      out.print( rs.getString("PrestamoFK"));
      out.write("</td>\n");
      out.write("                <td class=\"text-center\">");
      out.print( rs.getString("Estado"));
      out.write("</td>\n");
      out.write("                <td class=\"text-center\">");
      out.print( rs.getString("EstadoObjeto"));
      out.write("</td>\n");
      out.write("                <td class=\"text-center\">");
      out.print( rs.getString("Marca"));
      out.write("</td>\n");
      out.write("                <td class=\"text-center\">");
      out.print( rs.getString("Referencia"));
      out.write("</td>\n");
      out.write("                <td class=\"text-center\">");
      out.print( rs.getString("AsignacionFK"));
      out.write("</td>\n");
      out.write("                <td class=\"text-center\">");
      out.print( rs.getString("FechaCreado"));
      out.write("</td>\n");
      out.write("                <td class=\"text-center\">");
      out.print( rs.getString("FechaModifi"));
      out.write("</td>\n");
      out.write("                <td class=\"text-center\">");
      out.print( rs.getString("UsuarioFK"));
      out.write("</td>\n");
      out.write("                <td class=\"text-center\">");
      out.print( rs.getString("BodegaFK"));
      out.write("</td>\n");
      out.write("                <td class=\"text-center\">\n");
      out.write("                    <a class=\"btn btn-warning btnEditarHard\" data-id=\"");
      out.print(rs.getString("IdHardware"));
      out.write("\"><i class=\"fa fa-pencil\"></i> Editar</a>\n");
      out.write("                    <a class=\"btn btn-danger btnEliminarHard\" data-id=\"");
      out.print(rs.getString("IdHardware"));
      out.write("\"><i class=\"fa fa-trash-o\"></i> Eliminar</a>\n");
      out.write("\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("        </tbody>\n");
      out.write("    </table>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("<!-- Modal -->\n");
      out.write("<div class=\"modal fade bs-example-modal-sm\" tabindex=\"-1\" role=\"dialog\" aria-hidden=\"true\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("        <!-- Modal content-->\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("                <h4 class=\"text-center\"> Registrar Hardware</h4>\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("                IdHardware`, `Nombre`, `Descripcion`, `Observacion`, `PrestamoFK`, `Estado`, `EstadoObjeto`, `Marca`, `Referencia`, `AsignacionFK`, `FechaCreado`, `FechaModifi`, `UsuarioFK`, `BodegaFK`\n");
      out.write("                <form action=\"Hardware\" method=\"POST\" class=\"text-center\" id=\"formRegistrarHardware\">\n");
      out.write("                    <input style=\"width: 49%;height: 34px;\"name=\"IdHardware\" id=\"IdHardware\" class=\"required\" placeholder=\" IdHardware\" type=\"number\">\n");
      out.write("                    <input style=\"width: 49%;height: 34px;\"name=\"Nombre\" id=\"usuario\" class=\"required\" placeholder=\" Nombre\" type=\"text\"><br><br>\n");
      out.write("                    <input style=\"width: 49%;height: 34px;\"name=\"Descripcion\" id=\"clave\" class=\"required\" placeholder=\" Descripcion\" type=\"text\">\n");
      out.write("                    <input style=\"width: 49%;height: 34px;\" name=\"Observacion\" id=\"nombres\" class=\"required\" placeholder=\" Nombres\" type=\"text\"><br><br>\n");
      out.write("                    <label>PrestamoFK</label><br>\n");
      out.write("                    \n");
      out.write("                    <select name=\"Estado\" >\n");
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
      out.write("                    <input id=\"btnRegistrar\" class=\"btn btn-outline-primary\" type=\"submit\" name=\"accion\" value=\"RegistrarVeterinario\">\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-footer\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-danger\" data-dismiss=\"modal\">Cerrar</button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("\n");
      out.write("    $('#datatable-keytable').DataTable({\n");
      out.write("        language: {\n");
      out.write("            \"decimal\": \"\",\n");
      out.write("            \"emptyTable\": \"No hay información\",\n");
      out.write("            \"info\": \"Mostrando _START_ a _END_ de _TOTAL_ Entradas\",\n");
      out.write("            \"infoEmpty\": \"Mostrando 0 to 0 of 0 Entradas\",\n");
      out.write("            \"infoFiltered\": \"(Filtrado de _MAX_ total entradas)\",\n");
      out.write("            \"infoPostFix\": \"\",\n");
      out.write("            \"thousands\": \",\",\n");
      out.write("            \"lengthMenu\": \"Mostrar _MENU_ Entradas\",\n");
      out.write("            \"loadingRecords\": \"Cargando...\",\n");
      out.write("            \"processing\": \"Procesando...\",\n");
      out.write("            \"search\": \"Buscar:\",\n");
      out.write("            \"zeroRecords\": \"Sin resultados encontrados\",\n");
      out.write("            \"paginate\": {\n");
      out.write("                \"first\": \"Primero\",\n");
      out.write("                \"last\": \"Ultimo\",\n");
      out.write("                \"next\": \"Siguiente\",\n");
      out.write("                \"previous\": \"Anterior\"\n");
      out.write("            }\n");
      out.write("        },\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    $(document).ready(function () {\n");
      out.write("\n");
      out.write("        $(\"#formRegistrarHardware\").validate({\n");
      out.write("            rules: {\n");
      out.write("                IdHardware: {\n");
      out.write("                    required: true,\n");
      out.write("                    number: true,\n");
      out.write("\n");
      out.write("                },\n");
      out.write("                usuario: {\n");
      out.write("                    required: true,\n");
      out.write("                },\n");
      out.write("                clave: {\n");
      out.write("                    required: true,\n");
      out.write("                    number: true,\n");
      out.write("                },\n");
      out.write("                nombre: {\n");
      out.write("                    required: true,\n");
      out.write("                },\n");
      out.write("                apellidos: {\n");
      out.write("                    required: true,\n");
      out.write("                },\n");
      out.write("                telefono: {\n");
      out.write("                    required: true,\n");
      out.write("                    number: true,\n");
      out.write("                    rangelength: [7, 10],\n");
      out.write("                },\n");
      out.write("                correo: {\n");
      out.write("                    required: true,\n");
      out.write("                    email: true,\n");
      out.write("                },\n");
      out.write("            },\n");
      out.write("            messages: {\n");
      out.write("                cedula:\n");
      out.write("                        {\n");
      out.write("                            required: \"Campo obligatorio\",\n");
      out.write("                            number: \"Campo númerico\",\n");
      out.write("                            rangelength: \"Debe estar entre 1 a 10 dígitos\",\n");
      out.write("                        },\n");
      out.write("                telefono:\n");
      out.write("                        {\n");
      out.write("                            required: \"Campo obligatorio\",\n");
      out.write("                            number: \"Campo númerico\",\n");
      out.write("                            rangelength: \"Debe estar entre 7 a 10 números\",\n");
      out.write("                        },\n");
      out.write("            },\n");
      out.write("\n");
      out.write("        })\n");
      out.write("    })\n");
      out.write("\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
if (request.getAttribute("error") != null) {
      out.write('\n');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('\n');
} else {
      out.write('\n');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${exito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('\n');
}
      out.write(' ');
      out.write('\n');
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
