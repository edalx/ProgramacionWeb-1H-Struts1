/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores.action;

import controladores.form.SeleccionForm;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import modelo.*;

/**
 *
 * @author edalx
 */
public class productoAction extends Action {
    
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws  Exception{
        String driver=this.getServlet().getServletContext().getInitParameter("driver");
        String cadena_conexion=this.getServlet().getServletContext().getInitParameter("cadena_conexion");
        
        SeleccionForm pb=(SeleccionForm)form;
        GestionProducto gp=new GestionProducto(driver, cadena_conexion);
        request.setAttribute("productos", gp.consulta_producto(pb.getCodigo_cat()));
        return mapping.findForward("productojsp");
    }
}
