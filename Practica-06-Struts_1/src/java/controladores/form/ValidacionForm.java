/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores.form;

import org.apache.struts.action.ActionForm;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author fing.labcom
 */
public class ValidacionForm  extends ActionForm{
    //datos del miembro
    
    private String usuario;
    private String password;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
