/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador_action;

import excepciones.DivisionCeroException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.OperacionesBasicas2;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import servlets_form.Numeros;

/**
 *
 * @author edalx
 */
public class OperacionesAction extends DispatchAction {
    
    public ActionForward sumar_numeros(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response){
        Numeros n=(Numeros) form;
        OperacionesBasicas2 op=new OperacionesBasicas2();
        
        request.setAttribute("resultado", op.suma(n));
        return mapping.findForward("Basica");
        
    }
    
    public ActionForward restar_numeros(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response){
        Numeros n=(Numeros) form;
        OperacionesBasicas2 op=new OperacionesBasicas2();
        
        request.setAttribute("resultado", op.resta(n));
        return mapping.findForward("Basica");
        
    }
    
    public ActionForward multiplicar_numeros(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response){
        Numeros n=(Numeros) form;
        OperacionesBasicas2 op=new OperacionesBasicas2();
        
        request.setAttribute("resultado", op.multiplicacion(n));
        return mapping.findForward("Basica");
        
    }
    
    public ActionForward dividir_numeros(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws DivisionCeroException{
        Numeros n=(Numeros) form;
        OperacionesBasicas2 op=new OperacionesBasicas2();
        
      try{
          int valor=op.division(n);
          request.setAttribute("resultado", valor);
      }catch(Exception e){
          throw new DivisionCeroException();
      }
       return mapping.findForward("Basica");
    }
}
