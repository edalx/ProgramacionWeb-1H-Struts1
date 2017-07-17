<%-- 
    Document   : consultaDB
    Created on : 19-abr-2017, 10:03:54
    Author     : edalx
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP, Servlets y Operaciones SQL</title>
    </head>
    <body>
        <form method="get">
            <p>Cédula: <input type="text" name="numCedula" size="20"/></p>
            <p><input type="submit" value="Consultar" name="btnIngresar"/>
        </form>

        <%if (request.getParameter("numCedula") != null && request.getParameter("numCedula") != "") 
                {%>
        <jsp:useBean id="obj" class="paquete_clases.Clase_Persona2"/>
        <jsp:setProperty name="obj" property="*"/>
        <%
            obj.procedimiento_conexion();
            obj.procedimiento_consultar();
        %>
        <%=obj.procedimiento_mostrar_consulta()%>
        <%}%>

    </body>
</html>
