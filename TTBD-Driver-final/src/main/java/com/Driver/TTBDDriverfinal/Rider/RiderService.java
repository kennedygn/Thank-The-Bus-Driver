/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Driver.TTBDDriverfinal.Rider;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author kenne
 */
@Service
public class RiderService {
    @Autowired
    private RiderRepository repo;
    
        public List<Rider> getBusFare() {
            return repo.findAll();
        }
        
        public Rider getFareById(long fareId){
            return repo.getReferenceById(fareId);
        }
        
        public List<Rider> getRoutes() {
        return repo.findAll();
    }
        
    public void save(Rider rider) {
        repo.save(rider);
    }
    
}