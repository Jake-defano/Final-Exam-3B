<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <link rel=StyleSheet href="style.css" type = "text/css">
        
    </head>
    
    <% String table = (String) request.getAttribute("table"); %>
    
    
    <body>
        <h1>Cities and Information</h1>
        <th1> ID </th1>
        <th2> Population </th2>
        <th3> Founded</th3>
        <th4> City Name</th4>
        <%= table %>
        
    
    
        <a href = "add">Add a new city</a>
        
    </body>
</html>
