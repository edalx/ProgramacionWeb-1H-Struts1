/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_clases;

/**
 *
 * @author edalx
 */
import com.mysql.jdbc.Driver;
import java.sql.*;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionBindingEvent;
public class Clase_Persona2 implements HttpSessionBindingListener{
    private String numCedula;
    private Connection var_conexion=null;
    private Statement stmt=null;
    private ResultSet rset=null;
    private StringBuilder tabla_resultados;

    public  Clase_Persona2() {
    }
    
    public void valueBound(HttpSessionBindingEvent event){
        
    }
    
    public synchronized void valueUnbound(HttpSessionBindingEvent event){
        try{
            if (var_conexion!=null) {
                var_conexion=null;
            }
        }catch(Exception e){
                    System.out.println(e);
                    }
        
        
    }
    public String getnumCedula(){
        return numCedula;
    }
    
    public synchronized void setnumCedula(String Cedula){
        numCedula=Cedula;
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
    
    public void procedimiento_consultar(){
        try{
            stmt=var_conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            String query="call consultaPersona('"+numCedula+"%')";
            rset=stmt.executeQuery(query);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public String procedimiento_mostrar_consulta(){
        StringBuffer tabla_resultados=new StringBuffer();
        try{
            tabla_resultados.append("<table border=1 cellPadding=1 cellSpacing=1 width=75>");
            tabla_resultados.append("<tr> <td> Cédula   </td>");
            tabla_resultados.append("   <td> Nombre     </td>");
            tabla_resultados.append("   <td> Apellido   </td>");
            tabla_resultados.append("   <td> Sexo       </td>");
            tabla_resultados.append("</tr>");
            
            while(rset.next()){
                tabla_resultados.append("<tr>");
                tabla_resultados.append("<td>"+rset.getString(1)    +"</td>");
                tabla_resultados.append("<td>"+rset.getString(2)    +"</td>");
                tabla_resultados.append("<td>"+rset.getString(3)    +"</td>");
                tabla_resultados.append("<td>"+rset.getString(4)    +"</td>");
                tabla_resultados.append("</tr>");
                
            }
            tabla_resultados.append("</table");
        }catch(Exception e){
            System.out.println(e);
        }
        return tabla_resultados.toString();
    }
}
