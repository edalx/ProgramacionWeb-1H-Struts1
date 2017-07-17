/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores_form;

import org.apache.struts.action.ActionForm;

/**
 *
 * @author edalx
 */
public class ValidacionForm extends ActionForm{
    private String numero1;
    private String numero2;

    public String getNumero1() {
        return numero1;
    }

    public void setNumero1(String numero1) {
        this.numero1 = numero1;
    }

    public String getNumero2() {
        return numero2;
    }

    public void setNumero2(String numero2) {
        this.numero2 = numero2;
    }
    
   
}
