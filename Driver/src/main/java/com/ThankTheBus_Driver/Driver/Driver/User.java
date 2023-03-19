/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ThankTheBus_Driver.Driver.Driver;

/**
 *
 * @author josephcalcagno
 */
public class User {
    
    private String name;
    private String userName;
    private String passWord; 
    private String role;
    
    public User(String name, String userName, String passWord, String role) {
        this.name = name;
        this.userName = userName;
        this.passWord = passWord;
        this.role = role;
         
       
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    public void lookAtRoutes() {
        
    }
    
    public void lookAtStops() {
        
    }
    
    
}
