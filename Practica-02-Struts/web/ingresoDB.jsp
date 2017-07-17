<%-- 
    Document   : ingresoDB
    Created on : 13-abr-2017, 11:48:43
    Author     : edalx
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP, Beans y Operaciones</title>
    </head>
    <body>
        <form method="GET">
            <p>Cédula: <input type="text" name="txt_cedula" size="20"/>
            <p>Nombre: <input type="text" name="txt_nombre" size="20"/>
            <p>Apellido: <input type="text" name="txt_apellido" size="20"/>
            <p>Sexo: <select name="sl_sexo">
                    <option value="M">M</option>
                    <option value="F">F</option>
                </select>
                
                <input type="submit" value="Ingresar datos" name="btn_ingresar"/>
        </form>
        <%
            
            if(request.getParameter("txt_cedula")!=null && request.getParameter("txt_cedula")!=""&&
               request.getParameter("txt_nombre")!=null && request.getParameter("txt_nombre")!=""&&
               request.getParameter("txt_apellido")!=null && request.getParameter("txt_apellido")!=""&&
               request.getParameter("sl_sexo")!=null && request.getParameter("sl_sexo")!="")
            {
                String[] datos=new String[4];
                datos[0]=request.getParameter("txt_cedula");
                datos[1]=request.getParameter("txt_nombre");
                datos[2]=request.getParameter("txt_apellido");
                datos[3]=request.getParameter("sl_sexo");

            
            %>
            
            <jsp:useBean id="id_objeto" class="paquete_clases.Clase_Persona1"/>
            <jsp:setProperty name="id_objeto" property="arreglo" value="<%=datos %>"/>
            
            <%
                id_objeto.procedimiento_conexion();
                id_objeto.proecdimiento_ingreso();
                }
            %>
        <h1>Hello World!</h1>
    </body>
</html>
