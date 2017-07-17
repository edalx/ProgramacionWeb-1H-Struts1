<%-- 
    Document   : resultado
    Created on : 26-abr-2017, 9:28:29
    Author     : edalx
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.*" %>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina de resultados</title>
    </head>
    <body>
        <% int i=(Integer)request.getAttribute("respuesta");%>
        La suma es: <%= i%>
        
    </body>
</html>
