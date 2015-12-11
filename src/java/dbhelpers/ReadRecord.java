
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

public class ReadRecord{
    
    private Connection conn;
    private ResultSet results;
    
    private Customers customer = new Customers();
    private int customerID;
    
    public ReadRecord(int customerID)
            {
                
                try {
            Properties props = new Properties();
            InputStream instr = getClass().getResourceAsStream("dbConn.properties");
            try {
                props.load(instr);
            } catch (IOException ex) {
                Logger.getLogger(dbhelpers.ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
            }
            String driver = props.getProperty("driver.name");
            String url = props.getProperty("server.name");
            String username = props.getProperty("user.name");
            String passwd = props.getProperty("user.password");
            
            
        
            
            this.customerID = customerID;
            
            Class.forName(driver);
            try {
                conn = DriverManager.getConnection(url,username,passwd);
            } catch (SQLException ex) {
                Logger.getLogger(dbhelpers.ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(dbhelpers.ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
    public void doRead(){
        
        try {
            String query = "SELECT * FROM Customer WHERE customerID = ?";
            
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setInt(1, customerID);
            
            this.results = ps.executeQuery();
            
            this.results.next();
            
            customer.setCustomerID(this.results.getInt("customerID"));
            customer.setCustomerName(this.results.getString("customerName"));
            customer.setCustomerEmail(this.results.getString("customerEmail"));
            customer.setCustomerCity(this.results.getString("customerCity"));
            customer.setCustomerZip(this.results.getString("customerZip"));
            customer.setCustomerState(this.results.getString("customerState"));
        } catch (SQLException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Customers getCustomer()
    {
    return this.customer;
    }
    
}