<%-- 
    Document   : Prueba
    Created on : 07-oct-2018, 1:29:09
    Author     : - kisma kante - 1Dawnm161711@gtmail.com
--%>

<%@page import="Entiti.Cliente"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%List filaProp = (List<Cliente>) request.getAttribute("listadoProp");

            Cliente cliente = new Cliente();

            for (int i = 0; i < filaProp.size(); i++) {

                cliente = (Cliente) filaProp.get(i);


        %>

        <%if (cliente.getNombre_apellidos() != null) {%>

        <p><%="Usuario: " + cliente.getNombre_apellidos()%></p>
        <p><%="Usuario encontrado "%></p>
        <%--<jsp:forward page= "mostrar.jsp"/>--%>
        <%} else if(cliente == null) {%>
      
        <!--<p>Usuario no encontrado</p>-->
        <p><%="Usuario no encontrado"%></p>
        <h2>Hello World!</h2>
        <%}%>

        <%}%>
        <h1>Hello World!</h1>
    </body>
</html>
