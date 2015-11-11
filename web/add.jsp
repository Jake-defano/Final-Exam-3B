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
        <title>Add A New City</title>
    </head>
    <body>
        <h1>Add A New City</h1>
        
        <form name ="addForm" action="addCity" method="get">
            
            <label>City Name:</label>
            <input type="text" name="name" value="" />
            <br>
            <label>City Population:</label>
            <input type="text" name="population" value="" />
            <br>
            <label>City Location:</label>
            <input type="text" name="location" value="" />
             <br>
            <label>City Founded:</label>
            <input type="text" name="founded" value="" />
             <br>
             <input type ="submit" name="submit" value ="Submit"/>
        </form>
    </body>
</html>
