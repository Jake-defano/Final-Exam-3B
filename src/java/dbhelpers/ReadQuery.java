
package dbhelpers;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Customers;



public class ReadQuery {
    
    private Connection conn;
    private ResultSet results;
    
    public ReadQuery (){
        
        try {
            Properties props = new Properties();
            InputStream instr = getClass().getResourceAsStream("dbConn.properties");
            try {
                props.load(instr);
            } catch (IOException ex) {
                Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
            }
            String driver = props.getProperty("driver.name");
            String url = props.getProperty("server.name");
            String username = props.getProperty("user.name");
            String passwd = props.getProperty("user.password");
            Class.forName(driver);
            try {
                conn = DriverManager.getConnection(url,username,passwd);
            } catch (SQLException ex) {
                Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
               
    }
    
    public void doRead(){
        
        try {
                String query = "Select * from Customer";
                
                PreparedStatement ps = conn.prepareStatement(query);
                this.results = ps.executeQuery();
        }       catch (SQLException ex) {
                Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE,null,ex);
        }
                
        }
    

    
    
    public String getHTMLTable(){
        
    
        String table ="";
        
        table += "<table>";
        
        try {
            while(this.results.next()){
                
                Customers customer = new Customers();
                customer.setCustomerID(this.results.getInt("customerID"));
                customer.setCustomerName(this.results.getString("customerName"));
                customer.setCustomerEmail(this.results.getString("customerEmail"));
                customer.setCustomerZip(this.results.getString("customerZip"));
                customer.setCustomerCity(this.results.getString("customerCity"));
                customer.setCustomerState(this.results.getString("customerState"));
                
                table += "<tr>";
           table += "<th>ID</th>";
           table += "<th>Customer Name</th>";
           table += "<th>Email</th>";
           table += "<th>Zip Code</th>";
           table += "<th>City</th>";
           table += "<th>State</th>";
           table += "</tr>";
         
              
                table += "<tr>";
                
                table += "<td>";
                
                table += customer.getCustomerID();
                
                table += "</td>";
                
                table += "<td>";
                 
                table += customer.getCustomerName();
                
                table += "</td>";
                
                table += "<td>";
                table += customer.getCustomerEmail();
                
                table += "</td>";
                
                table += "<td>";
                table += customer.getCustomerZip();
                
                table += "</td>";
                table += "<td>";
                table += customer.getCustomerCity();
                
                table += "</td>";
                table += "<td>";
                table += customer.getCustomerState();
                
                table += "</td>";
                
                table += "<td>";
                table +="<a href=update?customerID=" +customer.getCustomerID() + "> Update </a>" + "<a href = delete?customerID=" +customer.getCustomerID() + "> Delete </a>";
                table += "</td>";
                
                table += "</tr>";
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        table += "</table>";
        
        
                  return table;
         
        
    }
    
    
}
