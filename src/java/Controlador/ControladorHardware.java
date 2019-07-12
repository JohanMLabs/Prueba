/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.HardwareDAO;
import VO.HardwareVO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author blanclabs
 */
@WebServlet(name = "ControladorHardware", urlPatterns = {"/Hardware"})
public class ControladorHardware extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
         int opcion = Integer.parseInt(request.getParameter("opcion"));
        String IdHardware = request.getParameter("IdHardware");
        String Nombre = request.getParameter("Nombre");
        String Descripcion = request.getParameter("Descripcion");
        String Observacion = request.getParameter("Observacion");
        String PrestamoFK = request.getParameter("PrestamoFK");
        String EstadoFK = request.getParameter("EstadoFK");
        String EstadoObjeto = request.getParameter("EstadoObjeto");
        String Marca = request.getParameter("Marca");
        String Referencia = request.getParameter("Referencia");
        String AsignacionFK = request.getParameter("AsignacionFK");
        String FechaCreado = request.getParameter("FechaCreado");
        String FechaModifi = request.getParameter("FechaModifi");
        String UsuarioFK = request.getParameter("UsuarioFK");
        String BodegaFK = request.getParameter("BodegaFK");

        HardwareVO hardVO = new HardwareVO(IdHardware, Nombre,Descripcion,Observacion,PrestamoFK,EstadoFK,EstadoObjeto,Marca,Referencia,AsignacionFK,FechaCreado,FechaModifi,UsuarioFK,BodegaFK);
        HardwareDAO hardDAO = new HardwareDAO(hardVO);
        
          switch (opcion){
            case 1:// agregar Contacto
                if(hardDAO.AgregarRegistro(hardVO))
                {
                    request.setAttribute("exito","<script>alert('El Hardware fue registrado correctamente')</script>");
                }
                else
                {
                    request.setAttribute("error","<script>alert('El Hardware no pudo ser registrado')</script>");
                        
                }
            
                break;
                
            case 2:// actualizar contacto
                
                if (hardDAO.ActualizarRegistro(hardVO)){
                    request.setAttribute("exito", "<script>alert('¡el Hardware fue actualizado correctamente!')</script>");
                                                                                
                } else{
                    request.setAttribute("error", "<script>alert('¡el Hardware no se pudo actualizar!')</script>");
                }
                request.getRequestDispatcher("ConsultarContacto.jsp").forward(request, response);
                break;
                
           
            case 3: //Eliminar COntacto 
                if(hardDAO.EliminarRegistro(opcion)){
                    
                    request.setAttribute("exito", "<script>alert('¡el Hardware fue Eliminado correctamente!')</script>");
                    
                }else{
                    request.setAttribute("exito", "<script>alert('¡el Hardware No Eliminado correctamente!')</script>");
                    
                }
                request.getRequestDispatcher("EliminarContacto.jsp").forward(request, response);
                 break;
                
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
