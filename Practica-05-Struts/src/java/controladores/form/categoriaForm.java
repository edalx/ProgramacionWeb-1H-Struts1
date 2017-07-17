/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores.form;

import java.util.ArrayList;
import org.apache.struts.action.ActionForm;

/**
 *
 * @author edalx
 */
public class categoriaForm extends ActionForm{
    private String bandera;
    private ArrayList<String> codigocategoria;

    public String getBandera() {
        return bandera;
    }

    public void setBandera(String bandera) {
        this.bandera = bandera;
    }

    public ArrayList<String> getCodigocategoria() {
        return codigocategoria;
    }

    public void setCodigocategoria(ArrayList<String> codigocategoria) {
        this.codigocategoria = codigocategoria;
    }
   
    
    
}