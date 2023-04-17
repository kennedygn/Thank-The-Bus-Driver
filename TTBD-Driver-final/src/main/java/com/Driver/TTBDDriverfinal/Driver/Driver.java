
package com.Driver.TTBDDriverfinal.Driver;

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
@AllArgsConstructor
@Entity
@Table(name = "driver")
@NoArgsConstructor
@Getter
@Setter
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private int salary; 
    private String routeDriving;
    private long timeWorked;
    
    
public Driver(String name, String routeDriving) {
    this.name = name;
    this.routeDriving = routeDriving;
   }
}
