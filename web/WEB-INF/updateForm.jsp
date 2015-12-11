<%-- 
    Document   : updateForm
    Created on : Dec 10, 2015, 9:03:26 PM
    Author     : jdefano
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Customers"%>
<% Customers customer = (Customers) request.getAttribute("customer");%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel=StyleSheet href="style.css" type = "text/css">
        <title>Update a Customer</title>
    </head>
    <body>
        <h1>Update Customer</h1>
         <%@ include file="menu.jsp"%>
        
        <form name ="updateForm" action="updateCustomer" method="get">
            
           <table class ="update"> 
               
               <tr>
               <td class ="right"> Customer ID:</td>
               <td> <input type="text" name="id" value="<%=customer.getCustomerID() %>" /></td>
               </tr>
               
               <tr>
               <td class ="right"> Customer Name:</td>
               <td> <input type="text" name="name" value="<%=customer.getCustomerName() %>" /></td>
               </tr>
                <tr>
               <td class ="right"> Email:</td>
               <td> <input type="text" name="email" value="<%=customer.getCustomerEmail() %>" /></td>
               </tr>
                <tr>
               <td class ="right"> Customer City:</td>
               <td> <input type="text" name="city" value="<%=customer.getCustomerCity() %>" /></td>
               </tr>
                <tr>
               <td class ="right"> Zip Code:</td>
               <td> <input type="text" name="zip" value="<%=customer.getCustomerZip() %>" /></td>
               </tr>
                <tr>
               <td class ="right"> State:</td>
               <td> <input type="text" name="state" value="<%=customer.getCustomerState() %>" /></td>
               </tr>
           </table>
                <input type="reset" name ="reset" value ="Clear"/>
             <input type ="submit" name="submit" value ="Update"/>
          
        </form>
         
        <%@ include file="footer.jsp"%>
    </body>
</html>
