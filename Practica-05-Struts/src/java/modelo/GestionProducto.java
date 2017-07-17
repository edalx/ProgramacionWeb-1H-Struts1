/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controladores.form.productosBean;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author edalx
 */
public class GestionProducto {

    modelo.conexionDB con;

    public GestionProducto(String driver, String cadena_conexion) {
        con=new conexionDB(driver,cadena_conexion);
    }

    public ArrayList<String> consulta_categoria() {
        ArrayList<String> conjunto_categoria = new ArrayList<String>();

        try {
            Connection cn = con.getConexion();
            Statement st = cn.createStatement();
            String cadenaSQL = "Select Categoria_Id from Categoria";
            ResultSet rs = st.executeQuery(cadenaSQL);
            while (rs.next()) {
                conjunto_categoria.add(rs.getString("categoria_id"));
            }
            con.cierraConexion(cn);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conjunto_categoria;

    }
    
    public ArrayList<productosBean> consulta_producto(String categoria_codigo){
        ArrayList<productosBean> conjunto_productos=new ArrayList<productosBean>();
        try{
            Connection cn=con.getConexion();
            Statement st=cn.createStatement();
            String cadenaSQL="select * from Producto a, Categoria b where a.Categoria_Id='"+categoria_codigo + "' and a.Categoria_Id= b.Categoria_Id";
            ResultSet rs=st.executeQuery(cadenaSQL);
            while (rs.next()) {
                productosBean prod=new productosBean();
                prod.setId_categoria(rs.getString("Categoria_Id"));
                prod.setNombre_categoria(rs.getString("Categoria_Nombre"));
                prod.setId_producto(rs.getString("Producto_Id"));
                prod.setNombre_producto(rs.getString("Producto_Nombre"));
                prod.setPrecio_producto(rs.getInt("Producto_Precio"));
                prod.setStock_producto(rs.getInt("Producto_Stock"));
                
                conjunto_productos.add(prod);
                
            }
            con.cierraConexion(cn);
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return conjunto_productos;
    }
    
    public ArrayList<String> consulta_producto_nom(String categoria_codigo){
        ArrayList<String> conjunto_productos=new ArrayList<String>();
        try{
            Connection cn=con.getConexion();
            Statement st=cn.createStatement();
            String cadenaSQL="select Producto_Nombre from Producto a where a.Categoria_Id='"+categoria_codigo + "' ";
            ResultSet rs=st.executeQuery(cadenaSQL);
            while (rs.next()) {
                conjunto_productos.add(rs.getString("Producto_Nombre"));
            }
            con.cierraConexion(cn);
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return conjunto_productos;
    }

}
