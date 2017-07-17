/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import servlets_form.Numeros;

/**
 *
 * @author edalx
 */
public class OperacionesBasicas2 {
   public int suma(Numeros n){
       return(n.getNumero1()+n.getNumero2());
   }
   
   public int resta(Numeros n){
       return(n.getNumero1()-n.getNumero2());
   }
   
   public int multiplicacion(Numeros n){
       return(n.getNumero1()*n.getNumero2());
   }
   
   public int division (Numeros n){
       return(n.getNumero1()/n.getNumero2());
   }
   
}
