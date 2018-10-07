<%-- 
    Document   : mostrar
    Created on : 07-oct-2018, 22:09:18
    Author     : - kisma kante - 1Dawnm161711@gtmail.com
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <header>
                <h1>Camping l´alqueria</h1>                
               
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
                    
                    <button></button>
                </section>            
            </div>    
            <footer></footer>
        </div>
    </body>
</html>
