/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets_form;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author fing.labcom
 */
public class RegistroForm extends ActionForm{
    private String nombre;
    private String apellido;
    private String usuario;
    private String password;
    private String passwordrep;
    private String email;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

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

    public String getPasswordrep() {
        return passwordrep;
    }

    public void setPasswordrep(String passwordrep) {
        this.passwordrep = passwordrep;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors=new ActionErrors();
        if (usuario==null||usuario.equals("")) {
            errors.add("usuario",new ActionMessage("error.usuario"));
        }
        
        if (password==null||password.equals("")) {
            errors.add("password",new ActionMessage("error.password"));
        }
        
        if (!password.equals(passwordrep)) {
            errors.add("passwordrep",new ActionMessage("error.password.rep"));
        }
        
        if (email.indexOf("@")==-1) {
            errors.add("email",new ActionMessage("error.email"));
        }
        return errors;
    }
    
    
}
