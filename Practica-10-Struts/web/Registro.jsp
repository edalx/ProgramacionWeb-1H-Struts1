<%-- 
    Document   : Registro
    Created on : 14/06/2017, 10:03:23
    Author     : fing.labcom
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <html:form action="/registrar" method="post">
            <table>
                <tr>
                    <td>Nombre: </td>
                    <td><html:text property="nombre"/> </td>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td>Apellido: </td>
                    <td><html:text property="apellido"/> </td>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td>Usuario: </td>
                    <td><html:text property="usuario"/> </td>
                    <td>&<html:errors property="usuario"/></td>
                </tr>
                  <tr>
                    <td>Password: </td>
                    <td><html:text property="password"/> </td>
                    <td>&<html:errors property="password"/></td>
                </tr>
                
                 <tr>
                    <td>Password: </td>
                    <td><html:text property="passwordrep"/> </td>
                    <td>&<html:errors property="passwordrep"/></td>
                </tr>
                 <tr>
                    <td>Email: </td>
                    <td><html:text property="email"/> </td>
                    <td>&<html:errors property="email"/></td>
                </tr>
                <tr>
                    <td colspan="3">
                        <br/>
                        <html:submit property="sumbit" value="Registrar"/>
                        &nbsp;&nbsp;
                        <html:reset value="Limpiar"/>
                    </td>
                </tr>
            </table>
                    
                        <% if (request.getAttribute("message")!=null){
                            String s=(String)request.getAttribute("mensaje");%>
                            <p> <%=s%>
                        <%}%>
                            
                            </html:form>
           
    </body>
</html>
