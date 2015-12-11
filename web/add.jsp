<%-- 
    Document   : newjspadd
    Created on : Nov 11, 2015, 3:26:05 PM
    Author     : jdefano
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Customer</title>
        
         <link rel=StyleSheet href="style.css" type = "text/css">
         
    </head>
    <body>
        <h1>Add A New Customer</h1>
         <%@ include file="WEB-INF/menu.jsp"%>
        
        <form name ="addForm" action="addCustomer" method="get">
            
            <label>Customer Name:</label>
            <input type="text" name="name" value="" />
            <br>
            <label>Email:</label>
            <input type="text" name="email" value="" />
            <br>
            <label>City:</label>
            <input type="text" name="city" value="" />
             <br>
            <label>Zip Code:</label>
            <input type="text" name="zip" value="" />
             <br>
             <label>State:</label>
            <input type="text" name="state" value="" />
            <br>
             <input type ="submit" name="submit" value ="Submit"/>
        </form>
        <%@ include file="WEB-INF/footer.jsp"%>
    </body>
</html>
