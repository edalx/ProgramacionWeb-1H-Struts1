/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores.action;

import controladores.form.RegistroForm;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.GestionClientes;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author edalx
 */
public class RegistrarAction extends Action{

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        String driver=this.getServlet().getServletContext().getInitParameter("driver");
        String cadenacon=this.getServlet().getServletContext().getInitParameter("cadenacon");
        
        GestionClientes gc=new GestionClientes(driver, cadenacon);
        RegistroForm rf=(RegistroForm) form;
        
        gc.registrar(rf);
        return mapping.findForward("login");
    }
    
    
}
