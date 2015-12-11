<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <link rel=StyleSheet href="style.css" type = "text/css">
        
       
        <%@ include file="WEB-INF/menu.jsp"%>
        
    </head>
    
    <% String table = (String) request.getAttribute("table"); %>
    
    
    <body>
        <h1>Customers</h1>
        <th1> ID </th1>
        <th2> Population </th2>
        <th3> Founded</th3>
        <th4> City Name</th4>
        <%= table %>
        
    
    
        <a href = "add">add a new customer</a>
        
        <%@ include file="WEB-INF/footer.jsp"%>
    </body>
</html>
