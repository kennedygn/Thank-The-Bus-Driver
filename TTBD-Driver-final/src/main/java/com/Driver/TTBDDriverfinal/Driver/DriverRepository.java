
package com.Driver.TTBDDriverfinal.Driver;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author josephcalcagno
 */
public interface DriverRepository extends JpaRepository<Driver, Long>{
    
   // Driver findByDriverEmail(String driverEmail);
    
    
}
