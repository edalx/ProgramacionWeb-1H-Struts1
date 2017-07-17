<%-- 
    Document   : categoria
    Created on : 03-may-2017, 20:04:26
    Author     : edalx
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="bean" %>
<%@page import="java.util.*, controladores.form.*" %>
<!DOCTYPE html>
<html:html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Listado de los codigos de categoria</h1>
        <html:form action="/listado" method="post">
            <html:select property="codigo_cat">
                <html:options name="categoriaForms" property="codigocategoria"/>
            </html:select>
            <html:submit value="Mostrar Listado de productos"/>
        </html:form>

    </body>
</html:html>
