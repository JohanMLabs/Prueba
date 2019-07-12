package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import Config.Conexion;

public final class ListarUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script src=\"js/datatables.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/jquery.validate.js\" ></script>\n");
      out.write("<script src=\"js/messages_es.js.js\"></script>\n");
      out.write("\n");
      out.write("      <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\"\n");
      out.write("              crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<style>\n");
      out.write("            /* Dropdown Button */\n");
      out.write(".dropbtn {\n");
      out.write(" \n");
      out.write("  color: white;\n");
      out.write("  padding: 16px;\n");
      out.write("  font-size: 16px;\n");
      out.write("  border: none;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown {\n");
      out.write("  position: relative;\n");
      out.write("  display: inline-block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content {\n");
      out.write("  display: none;\n");
      out.write("  position: absolute;\n");
      out.write("  background-color: #f9f9f9;\n");
      out.write("  min-width: 160px;\n");
      out.write("  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\n");
      out.write("  z-index: 1;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content a {\n");
      out.write("  color: black;\n");
      out.write("  padding: 12px 16px;\n");
      out.write("  text-decoration: none;\n");
      out.write("  display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content a:hover {background-color: #f1f1f1}\n");
      out.write("\n");
      out.write(".dropdown:hover .dropdown-content {\n");
      out.write("  display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown:hover .dropbtn {\n");
      out.write("  background-color: activecaption;\n");
      out.write("}\n");
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
    rs = puente.executeQuery(" SELECT `IdUsuario`, `Nombre`, `RolFK`, `DepartametoFK` FROM `usuario`  ;");

      out.write("\n");
      out.write("\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("  <a class=\"navbar-brand\" href=\"#\">Prueba</a>\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("  </button>\n");
      out.write("\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("         <li class=\"nav-item active\">\n");
      out.write("        <div class=\"dropdown\">\n");
      out.write("          \n");
      out.write("            <a class=\"nav-link\" href=\"Menu.jsp\"class=\"dropbtn\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("     \n");
      out.write("        </div>\n");
      out.write("         </li> \n");
      out.write("           <li class=\"nav-item\">\n");
      out.write("      <div class=\"dropdown\">\n");
      out.write("    \n");
      out.write("        <a class=\"nav-link\" href=\"#\"class=\"dropbtn\">Link</a>   \n");
      out.write("      \n");
      out.write("      </div>\n");
      out.write("      </li> \n");
      out.write("      <li class=\"nav-item\">\n");
      out.write(" \n");
      out.write("          <div class=\"dropdown\">\n");
      out.write("  <a onclick=\"myFunction()\" class=\"dropbtn\">Registros</a>\n");
      out.write("  <div id=\"myDropdown1\" class=\"dropdown-content\">\n");
      out.write("    <a href=\"RegistrarHardware.jsp\">Registro Hardware</a>\n");
      out.write("    <a href=\"#\">Registro Software</a>\n");
      out.write("    <a href=\"#\">Registro Compra</a>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("     \n");
      out.write("      </li>\n");
      out.write("     \n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("       \n");
      out.write("        <div class=\"dropdown\">\n");
      out.write("  <a onclick=\"myFunction1()\" class=\"dropbtn\">Listas</a>\n");
      out.write("  <div id=\"myDropdown2\" class=\"dropdown-content\">\n");
      out.write("      <a href=\"ListarHardware.jsp\">Listas Hardware</a>\n");
      out.write("      <a href=\"ListarSoftware.jsp\">Listas Software</a>\n");
      out.write("      <a href=\"ListarCompras.jsp\">Listas Compra</a>\n");
      out.write("  </div>\n");
      out.write("      </li>\n");
      out.write("     \n");
      out.write("     \n");
      out.write("     \n");
      out.write("    </ul>\n");
      out.write("    <form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("      <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("      <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Buscar</button>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("<h1 class=\"text-center\">Listar Usuarios</h1><br>\n");
      out.write("<a class=\"add-proj brd-rd5\" href=\"RegistrarHardware.jsp\"  data-target=\".bs-example-modal-sm\" title=\"Add Project\">+ Agregar</a>\n");
      out.write("<form action=\"Usuario\" method=\"POST\">\n");
      out.write("    <table id=\"datatable-keytable\" class=\"table table-striped table-bordered\" style=\"width: 100%;\">\n");
      out.write("        <thead>\n");
      out.write("            <tr>\n");
      out.write("                <td style=\"border: 3px;border-bottom-color: #007bff;\" class=\"text-center\">IdUsuario</td>\n");
      out.write("                <td style=\"border: 3px;border-bottom-color: #007bff;\" class=\"text-center\">Nombre</td>\n");
      out.write("                <td style=\"border: 3px;border-bottom-color: #007bff;\" class=\"text-center\">RolFK</td>\n");
      out.write("                <td style=\"border: 3px;border-bottom-color: #007bff;\" class=\"text-center\">DepartamentoFK</td>\n");
      out.write("                \n");
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
      out.print( rs.getString("IdUsuario"));
      out.write("</td>\n");
      out.write("                <td class=\"text-center\">");
      out.print( rs.getString("Nombre"));
      out.write("</td>\n");
      out.write("                <td class=\"text-center\">");
      out.print( rs.getString("RolFK"));
      out.write("</td>\n");
      out.write("                <td class=\"text-center\">");
      out.print( rs.getString("DepartamentoFK"));
      out.write("</td>\n");
      out.write("              \n");
      out.write("                <td class=\"text-center\">\n");
      out.write("                    <a class=\"btn btn-warning btnEditarHard\" data-id=\"");
      out.print(rs.getString("IdUsuario"));
      out.write("\"><i class=\"fa fa-pencil\"></i> Editar</a>\n");
      out.write("                    <a class=\"btn btn-danger btnEliminarHard\" data-id=\"");
      out.print(rs.getString("IdUsuario"));
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
      out.write("function myFunction() {\n");
      out.write("  document.getElementById(\"myDropdown1\").classList.toggle(\"show\");\n");
      out.write("}\n");
      out.write("function myFunction1() {\n");
      out.write("  document.getElementById(\"myDropdown2\").classList.toggle(\"show\");\n");
      out.write("}\n");
      out.write("\n");
      out.write("// Close the dropdown if the user clicks outside of it\n");
      out.write("window.onclick = function(event) {\n");
      out.write("  if (!event.target.matches('.dropbtn')) {\n");
      out.write("    var dropdowns = document.getElementsByClassName(\"dropdown-content\");\n");
      out.write("    var i;\n");
      out.write("    for (i = 0; i < dropdowns.length; i++) {\n");
      out.write("      var openDropdown = dropdowns[i];\n");
      out.write("      if (openDropdown.classList.contains('show')) {\n");
      out.write("        openDropdown.classList.remove('show');\n");
      out.write("      }\n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("}\n");
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
