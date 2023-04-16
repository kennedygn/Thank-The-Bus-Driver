/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TTBD.TTBD_final.User;

import jakarta.persistence.Id;

/**
 *
 * @author kenne
 */
public class User {
    @Id
    /*@GeneratedValue(strategy = GenerationType.IDENTITY)*/
    private String role;
    
    public User(String role) {
        this.role = role;
    }

    String getRole() {
        return role;
    }
}
