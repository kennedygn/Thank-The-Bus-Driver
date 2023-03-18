/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ThankTheBusDriverDriver.Driver.DriverClass;

/**
 *
 * @author josephcalcagno
 */
public class Driver extends User{
    
    private int pay;
    private String routes;

    public Driver(String name, String userName, String passWord, String role) {
        super(name, userName, passWord, role);
    }

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    public String getRoutes() {
        return routes;
    }

    public void setRoutes(String routes) {  
        this.routes = routes;
    }
    
    public int clockIn() {
        int timeIn = 0;
        
        return timeIn;
    }
    
    public int clockOut() {
        int timeOut = 0;
        return timeOut;
    }
    
  
    
}
