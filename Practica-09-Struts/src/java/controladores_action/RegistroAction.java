/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores_action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.*;

/**
 *
 * @author Alexis
 */
public class RegistroAction  extends Action{
    
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

        String mensaje="Datos Validados en la clase registroForm, antes de ser enviados al modelo,....";
        request.setAttribute("mensaje", mensaje);
        
        return mapping.findForward("Registro");
    }
    
}
