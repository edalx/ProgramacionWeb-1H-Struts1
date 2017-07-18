<%-- 
    Document   : autenticacion
    Created on : 07/06/2017, 9:50:55
    Author     : fing.labcom
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Formulario de autenticación</h1>
        <html:javascript formName="ValidacionForm"/>
    <html:form action="/validar" method="post" onsubmit="return validateValidacionForm(this);">
        <table>
            <tr>
            <td>    Usuario: </td>
            <td>    <html:text property="usuario"/></td>
            </tr>
            <tr>
            <td>    Password: </td>
            <td>    <html:text property="password"/></td>
            </tr>
            <tr>
                <td>    <html:submit property="submit" value="Validar"/>
                    <html:reset value="Limpiar"/>
                </td>
            </tr>
        </table>
    </html:form>
    </body>
</html>
