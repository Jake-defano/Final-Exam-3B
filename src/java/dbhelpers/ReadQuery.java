
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
import model.Cities;


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
                String query = "Select * from Cities";
                
                PreparedStatement ps = conn.prepareStatement(query);
                this.results = ps.executeQuery();
        }       catch (SQLException ex) {
                Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE,null,ex);
        }
                
        }
    

    
    
    public String getHTMLTable(){
        
    
        String table ="";
        
        table += "<table border=1>";
        
        try {
            while(this.results.next()){
                
                Cities city = new Cities();
                city.setCityID(this.results.getInt("cityID"));
                city.setCityPopulation(this.results.getInt("cityPopulation"));
                city.setCityLocation(this.results.getString("cityLocation"));
                city.setCityFounded(this.results.getInt("cityFounded"));
                city.setCityName(this.results.getString("cityName"));
                
                table += "<tr>";
                
                table += "<td>";
                table += city.getCityID();
                
                table += "</td>";
                
                table += "<td>";
                table += city.getCityPopulation();
                
                table += "</td>";
                
                table += "<td>";
                table += city.getCityLocation();
                
                table += "</td>";
                
                table += "<td>";
                table += city.getCityFounded();
                
                table += "</td>";
                table += "<td>";
                table += city.getCityName();
                
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
