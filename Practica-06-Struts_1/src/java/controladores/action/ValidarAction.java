/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores.action;

import controladores.form.ValidacionForm;
import javax.servlet.http.*;
import modelo.GestionClientes;
import org.apache.struts.action.*;

/**
 *
 * @author edalx
 */
public class ValidarAction extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        String driver = this.getServlet().getServletContext().getInitParameter("driver");
        String cadenacon = this.getServlet().getServletContext().getInitParameter("cadenacon");
        GestionClientes gc = new GestionClientes(driver, cadenacon);

        ValidacionForm vf = (ValidacionForm) form;
        if (gc.validar(vf)) {
            return mapping.findForward("bienvenida");
        } else {
            return mapping.findForward("error");
        }
    }

}
