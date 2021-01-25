<%-- 
    Document   : muestraDatos
    Created on : 25-ene-2021, 19:50:30
    Author     : DAW2-PROFESOR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Modelo.Calcula" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Resultado</h1>
        <% Calcula calc = ( Calcula ) request.getAttribute("calcula"); %>
        Op1: <%= calc.getOp1() %> <br>
        Op2: <%= calc.getOp2() %> <br>
        Operación: <%= calc.getOperacion() %> <br>
        Resultado: <%= calc.getResultado() %>
    </body>
</html>
