/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores.action;

import controladores.form.categoriaForm;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.GestionProducto;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author edalx
 */
public class categoriaAction extends Action {
    
    public ActionForward execute (ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception{
        String driver=this.getServlet().getServletContext().getInitParameter("driver");
        String cadena_conexion=this.getServlet().getServletContext().getInitParameter("cadena_conexion");
        
        categoriaForm cb=(categoriaForm) form;
        GestionProducto gp =new GestionProducto(driver, cadena_conexion);
        cb.setCodigocategoria(gp.consulta_categoria());
        
        return mapping.findForward("categoriajsp");
    }
    
   
}
