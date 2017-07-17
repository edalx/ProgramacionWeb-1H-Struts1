<%-- 
    Document   : webIngreso
    Created on : 26-abr-2017, 9:28:13
    Author     : edalx
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.*" %>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario de ingreso de datos</title>
    </head>
    <body>
        <html:form action="/validar" method="POST">
            <p> Número 1: <html:text property="numero1" value=""></html:text></p>
            <p> Número 2: <html:text property="numero2" value=""></html:text></p>
            <html:submit property="submit" value="Sumar"> </html:submit>
        </html:form>
    </body>
</html>
