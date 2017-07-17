/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladore_action;

import controladores_form.ValidacionForm;
import javax.servlet.http.*;
import modelo.OperacionesBasicas;
import org.apache.struts.action.*;
import org.apache.struts.actions.*;

/**
 *
 * @author edalx
 */
public class OperacionAction extends Action{
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)throws Exception{
        OperacionesBasicas op=new OperacionesBasicas();
        ValidacionForm vf=(ValidacionForm)form;
        request.setAttribute("respuesta", op.suma(vf));
        return mapping.findForward("resultado");
        
    }
    
}
