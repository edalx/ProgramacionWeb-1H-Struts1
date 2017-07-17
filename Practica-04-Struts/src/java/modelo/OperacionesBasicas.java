/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controladores_form.ValidacionForm;

/**
 *
 * @author edalx
 */
public class OperacionesBasicas {
    public int suma(ValidacionForm vf){
        return(Integer.parseInt(vf.getNumero1())+Integer.parseInt(vf.getNumero2()));
    }
}
