/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TTBDJoe.JoeCodeDriver.Driver;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author josephcalcagno
 */
@Entity
@Table(name = "drivers")
@NoArgsConstructor
@Getter
@Setter
public class Driver {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private double pay;
    private String routeDriving;
    
    public Driver(String name, double pay, String routeDriving) {
        this.name = name;
        this.pay = pay;
        this.routeDriving = routeDriving;
             
        
    }
    
    
    
}
