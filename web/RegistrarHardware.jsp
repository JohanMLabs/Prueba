<%-- 
    Document   : RegistrarHardware
    Created on : 12/07/2019, 10:10:53 AM
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
        
    <from>
        <div class="from" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal-dialog">

        <div class="modal-content">
            <div class="modal-header">
                <h4 class="text-center"> Registrar Hardware</h4>
                <button type="button" class="close" data-dismiss="modal">&times;</button>
            </div>
            <div class="modal-body">
             
                <form action="Hardware" method="POST" class="text-center" id="formRegistrarHardware">
                    <input style="width: 49%;height: 34px;"name="IdHardware" id="IdHardware" class="required" placeholder=" IdHardware" type="number">
                    <input style="width: 49%;height: 34px;"name="Nombre" id="usuario" class="required" placeholder="Nombre" type="text"><br><br>
                    <input style="width: 49%;height: 34px;"name="Descripcion" id="clave" class="required" placeholder=" Descripcion" type="text">
                    <input style="width: 49%;height: 34px;" name="Observacion" id="nombres" class="required" placeholder=" Nombres" type="text"><br><br>
                    <label>PrestamoFK</label><br>
                    
                    <select name="EstadoFK" >

                        <option>Libre</option>

                        <option>Ocupado</option>
                        
                    </select>

                    <input style="width: 49%;height: 34px;" name="EstadoObjeto" id="EstadoObjeto" class="required" placeholder=" Estado del Objeto" type="text"><br><br>
                    <input style="width: 49%;height: 34px;"  name="Marca" id="Marca" class="required " placeholder=" Marca" type="text">
                    <input style="width: 49%;height: 34px;"  name="Referencia" id="Referencia" class="required " placeholder=" Referencia" type="text">
                    <input style="width: 49%;height: 34px;"  name="AsignacionFK" id="AsignacionFK" class="required " placeholder=" AsignacionFK" type="text">
                    <input style="width: 49%;height: 34px;"  name="FechaCreado" id="FechaCreado" class="required " placeholder=" Fecha de Creado" type="date">
                    <input style="width: 49%;height: 34px;"  name="FechaModifi" id="FechaModifi" class="required " placeholder=" Fecha de Modificacion" type="date">
                    <label>PrestamoFK</label><br>
                    
                    <select name="UsuarioFK" >

                        <option>Libre</option>

                        <option>Ocupado</option>
                        <
                    </select>
                    <input style="width: 49%;height: 34px;"  name="Marca" id="Marca" class="required " placeholder=" Marca" type="text">
                    <input style="width: 49%;height: 34px;"  name="Marca" id="Marca" class="required " placeholder=" Marca" type="text">
                    
                    <input id="btnRegistrar" class="btn btn-outline-primary" type="submit" name="opcion" value="1">
                </form>
            </div>
            <div class="modal-footer">
                <a class="btn btn-danger" type="button" href="ListarHardware.jsp" type="button" >Cerrar</>
            </div>
        </div>
    </div>
</div>
    </from>   


    </body>
</html>
