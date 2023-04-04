/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TTBDJoe.JoeCodeDriver.Driver;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author josephcalcagno
 */
@Service
public class DriverService {
    
    @Autowired
    private DriverRepository repo;
    
        public List<Driver> getAllDrivers() {
        return repo.findAll();
    }

    public Driver getDriver(long driverId) {
        return repo.getReferenceById(driverId);
    }

    public void deleteDriver(long driverId) {
        repo.deleteById(driverId);
     
    }

    void saveDriver(Driver driver) {

        repo.save(driver);
    }
    
    
    
    
}
