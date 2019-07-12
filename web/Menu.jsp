<%-- 
    Document   : Menu
    Created on : 11/07/2019, 10:51:55 AM
    Author     : blanclabs
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
              crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <title>Menu</title>
    </head>
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
    </style>
    <body>
        
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Prueba</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
         <li class="nav-item active">
        <div class="dropdown">
          
        <a class="nav-link" href="#"class="dropbtn">Home <span class="sr-only">(current)</span></a>
     
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
      <a class="btn btn-outline-success my-2 my-sm-0" href="index.jsp" type="submit">Salir</a>
    </form>
  </div>
</nav>
    </body>
    <script>
/* When the user clicks on the button, 
toggle between hiding and showing the dropdown content */
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
</html>
