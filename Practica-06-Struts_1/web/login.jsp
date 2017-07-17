<%-- 
    Document   : login
    Created on : 31/05/2017, 10:02:14
    Author     : fing.labcom
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html>

<html:html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario de Autenticacion</title>
    </head>
    
    <body>
    <center>
        <h1>Formulario de autenticacion</h1> 
        <html:form  action="/validar" method="POST">
            <table>
                <tr>
                    <td>Usuario :</td>
                    <td> <html:text property="usuario"></html:text> </td>

                </tr>
                <tr>
                    <td>Password :</td>
                    <td> <html:text property="password" ></html:text> </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <br/>
                        <html:submit property="submit" value="Validar" ></html:submit>
                        <html:reset value="Limpiar"/>
                     </td>
                        
                </tr>
                
            </table>
            
        </html:form>
        <br/>
        <html:link forward="pararegistro">Registro</html:link>
    </center>
    </body>
</html:html>