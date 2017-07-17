<%-- 
    Document   : Basica
    Created on : 06-jun-2017, 18:24:23
    Author     : edalx
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="modelo.*" %>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <html:form action="/seleccionar" method="get">
            <p>Numero 1: <html:text property="numero1"></html:text></p>
            <p>Numero 2: <html:text property="numero2"></html:text></p>

                <p>Operacion: <html:select property="operacion">
                    <html:option value="sumar_numeros">+</html:option>
                    <html:option value="restar_numeros">-</html:option>
                    <html:option value="multiplicar_numeros">*</html:option>
                    <html:option value="dividir_numeros">/</html:option>
                </html:select></p>

            <html:submit property="submit" value="Calcular resultado"/>

        </html:form>

        <%if (request.getAttribute("resultado") != null) {
                        int i = (Integer) request.getAttribute("resultado");%>

        Respuesta: <%= i%>
        <%}%>

        <html:errors/>


    </body>
</html>
