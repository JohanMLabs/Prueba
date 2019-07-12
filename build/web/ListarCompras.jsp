<%-- 
    Document   : ListarCompras
    Created on : 12/07/2019, 11:10:54 AM
    Author     : blanclabs
--%>


<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="Config.Conexion"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="DAO.HardwareDAO"%>
<%@page import="VO.HardwareVO"%>

<script src="js/datatables.js" type="text/javascript"></script>
<script src="js/jquery.validate.js" ></script>
<script src="js/messages_es.js.js"></script>

      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
              crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>


<br>
<br>
<style>
            /* Dropdown Button */
.dropbtn {
 
  color: white;
  padding: 16px;
  font-size: 16px;
  border: none;
  cursor: pointer;
}

.dropdown {
  position: relative;
  display: inline-block;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f9f9f9;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
}

.dropdown-content a:hover {background-color: #f1f1f1}

.dropdown:hover .dropdown-content {
  display: block;
}

.dropdown:hover .dropbtn {
  background-color: activecaption;
}
    label.error{
        position:absolute;
        display: block;
        color: red;
    }
    label.valid{
        padding:10px;
        margin-left:10px;
        display: inline;

    }

</style>
<%
    Conexion conexion = new Conexion();
    Statement puente;
    ResultSet rs;
    puente = conexion.obtenerConexion().createStatement();
    // rs = puente.executeQuery("select idUsuario,Usuario,Nombres,Apellidos,Telefono,Correo,Rol from usuarios where Rol = 'cliente' and Estado=1;");
    rs = puente.executeQuery(" SELECT `IdCompra`, `Nombre`, `Descripcion`, `FechaCompra` FROM `compras`;");
%>

    <nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Prueba</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
         <li class="nav-item active">
        <div class="dropdown">
          
            <a class="nav-link" href="Menu.jsp"class="dropbtn">Home <span class="sr-only">(current)</span></a>
     
        </div>
         </li> 
           <li class="nav-item">
      <div class="dropdown">
    
        <a class="nav-link" href="#"class="dropbtn">Link</a>   
      
      </div>
      </li> 
      <li class="nav-item">
 
          <div class="dropdown">
  <a onclick="myFunction()" class="dropbtn">Registros</a>
  <div id="myDropdown1" class="dropdown-content">
    <a href="RegistrarHardware.jsp">Registro Hardware</a>
    <a href="#">Registro Software</a>
    <a href="#">Registro Compra</a>
  </div>
</div>
     
      </li>
     
      <li class="nav-item">
       
        <div class="dropdown">
  <a onclick="myFunction1()" class="dropbtn">Listas</a>
  <div id="myDropdown2" class="dropdown-content">
      <a href="ListarHardware.jsp">Listas Hardware</a>
      <a href="ListarSoftware.jsp">Listas Software</a>
      <a href="ListarCompras.jsp">Listas Compra</a>
      <a href="ListarUsuario.jsp">Listar Usuario</a>
  </div>
      </li>
     
     
     
    </ul>
    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Buscar</button>
    </form>
  </div>
</nav>
<h1 class="text-center">Listar Compras</h1><br>
<a class="add-proj brd-rd5" href="RegistrarHardware.jsp"  data-target=".bs-example-modal-sm" title="Add Project">+ Agregar</a>
<form action="Compras" method="POST">
    <table id="datatable-keytable" class="table table-striped table-bordered" style="width: 100%;">
        <thead>
            <tr>
                <td style="border: 3px;border-bottom-color: #007bff;" class="text-center">IdCompra</td>
                <td style="border: 3px;border-bottom-color: #007bff;" class="text-center">Nombre</td>
                <td style="border: 3px;border-bottom-color: #007bff;" class="text-center">Descripción</td>
                <td style="border: 3px;border-bottom-color: #007bff;" class="text-center">FechaCompra</td>
                

            </tr>                    
        </thead>
        <tbody>

            <%
                while (rs.next()) {
            %>

            <tr>
                <td class="text-center"><%= rs.getString("IdCompra")%></td>
                <td class="text-center"><%= rs.getString("Nombre")%></td>
                <td class="text-center"><%= rs.getString("Descripcion")%></td>
                <td class="text-center"><%= rs.getString("FechaCompra")%></td>
              
                <td class="text-center">
                    <a class="btn btn-warning btnEditarHard" data-id="<%=rs.getString("IdCompra")%>"><i class="fa fa-pencil"></i> Editar</a>
                    <a class="btn btn-danger btnEliminarHard" data-id="<%=rs.getString("IdCompra")%>"><i class="fa fa-trash-o"></i> Eliminar</a>

                </td>
            </tr>
            <%
                }
            %>
        </tbody>
    </table>
</form>

<script>

    $('#datatable-keytable').DataTable({
        language: {
            "decimal": "",
            "emptyTable": "No hay información",
            "info": "Mostrando _START_ a _END_ de _TOTAL_ Entradas",
            "infoEmpty": "Mostrando 0 to 0 of 0 Entradas",
            "infoFiltered": "(Filtrado de _MAX_ total entradas)",
            "infoPostFix": "",
            "thousands": ",",
            "lengthMenu": "Mostrar _MENU_ Entradas",
            "loadingRecords": "Cargando...",
            "processing": "Procesando...",
            "search": "Buscar:",
            "zeroRecords": "Sin resultados encontrados",
            "paginate": {
                "first": "Primero",
                "last": "Ultimo",
                "next": "Siguiente",
                "previous": "Anterior"
            }
        },
    });

    $(document).ready(function () {

        $("#formRegistrarHardware").validate({
            rules: {
                IdHardware: {
                    required: true,
                    number: true,

                },
                usuario: {
                    required: true,
                },
                clave: {
                    required: true,
                    number: true,
                },
                nombre: {
                    required: true,
                },
                apellidos: {
                    required: true,
                },
                telefono: {
                    required: true,
                    number: true,
                    rangelength: [7, 10],
                },
                correo: {
                    required: true,
                    email: true,
                },
            },
            messages: {
                cedula:
                        {
                            required: "Campo obligatorio",
                            number: "Campo númerico",
                            rangelength: "Debe estar entre 1 a 10 dígitos",
                        },
                telefono:
                        {
                            required: "Campo obligatorio",
                            number: "Campo númerico",
                            rangelength: "Debe estar entre 7 a 10 números",
                        },
            },

        })
    })

function myFunction() {
  document.getElementById("myDropdown1").classList.toggle("show");
}
function myFunction1() {
  document.getElementById("myDropdown2").classList.toggle("show");
}

// Close the dropdown if the user clicks outside of it
window.onclick = function(event) {
  if (!event.target.matches('.dropbtn')) {
    var dropdowns = document.getElementsByClassName("dropdown-content");
    var i;
    for (i = 0; i < dropdowns.length; i++) {
      var openDropdown = dropdowns[i];
      if (openDropdown.classList.contains('show')) {
        openDropdown.classList.remove('show');
      }
    }
  }
}

</script>


<%if (request.getAttribute("error") != null) {%>
${error}
<%} else {%>
${exito}
<%}%> 
