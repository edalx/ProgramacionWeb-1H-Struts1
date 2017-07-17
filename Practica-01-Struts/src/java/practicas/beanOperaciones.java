/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas;

/**
 *
 * @author edalx
 */
public class beanOperaciones extends Object{
    private int numero1;
    private int numero2;

    public int getnumero1() {
        return numero1;
    }

    public synchronized void setnumero1(int valor1) {
        numero1 = valor1;
    }

    public int getnumero2() {
        return numero2;
    }

    public synchronized void setnumero2(int valor2) {
        numero2 = valor2;
    }
    
    public int suma(){
        return (numero1+numero2);
    }

    public beanOperaciones() {
    }
      
}
