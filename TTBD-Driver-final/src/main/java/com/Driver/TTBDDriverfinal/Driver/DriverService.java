
package com.Driver.TTBDDriverfinal.Driver;

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
    private DriverRepository driverRepo;
    
    public List<Driver> getAllDrivers() {
        
        return driverRepo.findAll();
    }
    
    public Driver getDriver(Long driverId) {
        return driverRepo.getReferenceById(driverId);
        
    }
    
    public Driver saveDriver(Driver driver) {
        return driverRepo.save(driver);
        
    }
    
    public void deleteDriver(long driverId) {
        
        driverRepo.deleteById(driverId);
    }
    
    
    
    
}
