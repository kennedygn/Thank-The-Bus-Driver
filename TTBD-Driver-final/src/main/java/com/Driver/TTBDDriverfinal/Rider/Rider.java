/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Driver.TTBDDriverfinal.Rider;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author kenne
 */
@AllArgsConstructor
@Entity
@Table(name = "riderInfo")
@NoArgsConstructor
@Getter
@Setter
public class Rider {
    @Id
    /*@GeneratedValue(strategy = GenerationType.IDENTITY)*/
    private long id;
    private double fare;
    private String role;
    
    public Rider(double fare, long id, String role) {
        this.fare = fare;
        this.id = id;
        this.role = role;
    }

    /*double getFare() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setFare(double updatedFare) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/
    
}

