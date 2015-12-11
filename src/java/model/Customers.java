/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author jdefano
 */
public class Customers {
    
    private int customerID;
    private String customerName;
    private String customerEmail;
    private String customerCity;
    private String customerZip;
    private String customerState;

     public Customers() {
        this.customerID = 0;
        this.customerName = "";
        this.customerEmail = "";
        this.customerCity = "";
        this.customerZip = "";
        this.customerState = "";
    }
    
    
    
    
    public Customers(int customerID, String customerName, String customerEmail, String customerCity, String customerZip, String customerState) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerCity = customerCity;
        this.customerZip = customerZip;
        this.customerState = customerState;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    public String getCustomerZip() {
        return customerZip;
    }

    public void setCustomerZip(String customerZip) {
        this.customerZip = customerZip;
    }

    public String getCustomerState() {
        return customerState;
    }

    public void setCustomerState(String customerState) {
        this.customerState = customerState;
    }

    @Override
    public String toString() {
        return "Customers{" + "customerID=" + customerID + ", customerName=" + customerName + ", customerEmail=" + customerEmail + ", customerCity=" + customerCity + ", customerZip=" + customerZip + ", customerState=" + customerState + '}';
    }

    
    
}
