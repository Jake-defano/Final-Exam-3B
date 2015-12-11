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
        
        <form name ="addForm" action="addCustomer" method="get">
            
            <label>Customer Name:</label>
            <input type="text" name="name" value="" />
            <br>
            <label>Email:</label>
            <input type="text" name="population" value="" />
            <br>
            <label>City:</label>
            <input type="text" name="location" value="" />
             <br>
            <label>Zip Code:</label>
            <input type="text" name="founded" value="" />
             <br>
             <label>State:</label>
            <input type="text" name="name" value="" />
            <br>
             <input type ="submit" name="submit" value ="Submit"/>
        </form>
    </body>
</html>
