/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_clases;
import java.sql.*;
import java.util.ArrayList;
import com.mysql.jdbc.Driver;


/**
 *
 * @author edalx
 */
public class Clase_Persona1 extends Object {
    private String[] arreglo;
    private Connection var_conexion;
    private Statement var_stmt;
    
    public synchronized void setarreglo(String [] nuevo_arreglo){
        arreglo=new String[nuevo_arreglo.length];
        System.arraycopy(nuevo_arreglo, 0, arreglo, 0,nuevo_arreglo.length);
     
    }
    
    public void procedimiento_conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            var_conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/Personas","root","pa$word007");
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    
   public void  proecdimiento_ingreso(){
       try{
           var_stmt=var_conexion.createStatement();
           String query="insert into Datos values ('"+arreglo[0]+"','"+arreglo[1]+"','"+arreglo[2]+"','"+arreglo[3]+"')";
           var_stmt.executeUpdate(query);
           var_stmt.close();
           var_conexion.close();
       }catch(Exception e ){
           System.out.println("e");
       }
     
   }
     public Clase_Persona1(){
           
       }
     
}
