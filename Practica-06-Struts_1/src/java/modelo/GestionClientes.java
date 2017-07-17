/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controladores.form.RegistroForm;
import controladores.form.ValidacionForm;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author edalx
 */
public class GestionClientes {

    modelo.conexionDB1 con;

    public GestionClientes(String driver, String cadena_conexion) {
        con=new conexionDB1(driver,cadena_conexion);
    }
    
    public boolean validar (ValidacionForm vf){
        boolean estado=false;
        try{
            Connection cn=con.getConexion();
            String query="Select * from Registro ";
            query+="where password= '"+vf.getPassword();
            query+="' and usuario='"+vf.getUsuario()+"'";
            
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(query);
            estado=rs.next();
            con.cierraConexion(cn);
        }catch(Exception e){
            e.printStackTrace();
            
        }finally{
            return estado;
        }
    }
    
    public void registrar(RegistroForm rf){
        String query="insert into Registro ";
        query+="values('" +rf.getNombre()+"','"+rf.getApellidos()+"','"+rf.getUsuario()+"','"+rf.getPassword()+"','"+rf.getEmail()+"')";
        System.out.println(query);
        try{
            int i;
            Connection cn=con.getConexion();
            Statement st=cn.createStatement();
            i=st.executeUpdate(query);
            st.close();
            con.cierraConexion(cn);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    

}
