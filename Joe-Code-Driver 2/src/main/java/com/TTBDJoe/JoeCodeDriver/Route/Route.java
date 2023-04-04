/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TTBDJoe.JoeCodeDriver.Route;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



/**
 *
 * @author josephcalcagno
 */

@Entity
@Table(name = "routes")
@NoArgsConstructor
@Getter
@Setter
public class Route {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;
    private String personDriving;
    
    public Route(String name, String personDriving) {
        
        this.name = name;
        this.personDriving = personDriving;
        
    }
    
}
