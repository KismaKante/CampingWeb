<%-- 
    Document   : inicio
    Created on : 04-oct-2018, 20:03:22
    Author     : - kisma kante - 1Dawnm161711@gtmail.com
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>

    </head>
    <body>
        <div>
            <header>
                <h1>Camping l´alqueria</h1>
                <jsp:include page="/menu.jsp"/>
               
            </header>
            <div>
                <aside></aside>
                <section>
                    
                    
                    <%
                    String siguientePag = (String) request.getAttribute("siguienteVista");

                    if (siguientePag != null) {%>

                    <jsp:include page="<%=siguientePag%>"/>

                    <%
                        }
                    %>
                </section>            
            </div>    
            <footer></footer>
        </div>

    </body>
</html>

