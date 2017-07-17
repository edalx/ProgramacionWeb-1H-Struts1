<%-- 
    Document   : JSPSuma2
    Created on : 06-abr-2017, 11:24:52
    Author     : edalx
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="idBean" class="practicas.beanOperaciones"/>
<jsp:setProperty name="idBean" property="*"/>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP utilizando una clase java</title>
    </head>
    <body>
        <form method="get">
            
            <p> Número 1: <input type="text" name="numero1" size="20" <p/>
            <p> Número 2: <input type="text" name="numero2" size="20" <p/>
            <input type="submit" value="Sumar" name="btnSumar" />
            
        </form>
        <p>La suma de <%= idBean.getnumero1() %> + <%= idBean.getnumero2() %> es: <%=idBean.suma() %> </p>
    </body>
</html>
