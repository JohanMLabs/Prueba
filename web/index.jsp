<%-- 
    Document   : index
    Created on : 11/07/2019, 08:37:03 AM
    Author     : blanclabs
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
               <div>
            <a class="hiddenanchor" id="signup"></a>
            <a class="hiddenanchor" id="signin"></a>

            <div class="login_wrapper">
                <div class="animate form login_form">
                    <section class="login_content">                       
                        <form  method="post" class="InicioForm" action="Menu.jsp">
                            <h1>Iniciar Sesion</h1>
                            <div>
                                <input type="text" name="IdUsuario" class="form-control" placeholder="Ingrese Pin" value=""  />
                            </div>
                            <div>
                                <input type="text" name="Nombre" class="form-control" value="" placeholder="Nombre Usuario"  />
                            </div>
                            <div>
                                <input class="btn btn-default submit btnIngresar text-center" class="button_text" type="submit" name="submit" value="Ingresar">
                                <a class="reset_pass" href="recuperarContraseña.jsp">Olvidaste tu contraseña?</a>
                            </div>

                            <div class="clearfix"></div>

                            <div class="separator">
                                <p class="change_link">New to site?
                                    <a href="#signup" class="to_register"> Crear Cuenta </a>
                                </p>

                                <div class="clearfix"></div>
                                <br/>
                                <div>
                                    <h1><i class="fa fa-paw"></i> Prueba!</h1>
                                    <p>©2019 All Rights Reserved. Prueba! </p>
                                </div>
                            </div>
                        </form>
                    </section>
                </div>
                <script>
                String IdUsuario = request.getParameter("IdUsuario");    
    String Nombre = request.getParameter("Nombre");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba",
            "root", "root");
    Statement st = con.createStatement();
    ResultSet rs;
           session.setAttribute(" rs = st.executeQuery("select * from usuario where IdUsuario='" + IdUsuario + "' and Nombre='" + Nombre + "'");"

    if (rs.next()) {
        alert(111);
       // session.setAttribute("IdUsuario", IdUsuario);
         response.sendRedirect("Menu.jsp");
    } else {
        alert(11);
       response.sendRedirect("errorLogin.jsp");
    }
    </script>
    </body>
    
    
</html>
