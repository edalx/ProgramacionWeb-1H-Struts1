<%-- 
    Document   : ingreso
    Created on : 03-may-2017, 19:58:36
    Author     : edalx
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html>
<html:html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario de bienvenida</title>
    </head>
    <body>
    <center>
        <html:form action="/ingresar" method="POST">
            <html:text property="bandera" value="Bienvenidos al sistema de consultas" size="35"></html:text>
            <p></p>
            <html:submit property="submit" value="Ingresar al sistema"> </html:submit>
        </html:form>
    </center>
      
    </body>
</html:html>
