<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <link rel=StyleSheet href="style.css" type = "text/css">
        
       
        <%@ include file="WEB-INF/menu.jsp"%>
        <%@ include file="WEB-INF/header.jsp"%>
    </head>
    
    <% String table = (String) request.getAttribute("table"); %>
    
    
    <body>
      
        <%= table %>
        
    
    
        <a href = "add">add a new customer</a>
        
        <%@ include file="WEB-INF/footer.jsp"%>
    </body>
</html>
