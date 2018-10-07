<%-- 
    Document   : menu
    Created on : 05-mar-2018, 8:35:24
    Author     : ciclom
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <link href="css/style2.css" rel="stylesheet" type="text/css"/>

</head>
<div class="inicio">
    <!--        <p>Menu principal</p>
            
            <a href="Centre?opID=BuscarTots">Mostrar todos los propietario</a><br><br>-->

    <form action="Controlador?opID=InicioSesion" method="POST">
        Dni:
        <input type="text" name="dni"/>
        <br>
        <input type="text" name="pass"/>
        <br>

        <br><br>
        <input type="submit" value="enviar"/>
    </form>
</div>

