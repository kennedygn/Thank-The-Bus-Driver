/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TTBD.TTBD_final.Driver;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author kenne
 */
@Repository
public interface DriverRepository extends JpaRepository<Driver, String>{
    Driver findByDriverEmail(String driverEmail);
}
