/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Driver.TTBDDriverfinal.Route;

import com.Driver.TTBDDriverfinal.Driver.Driver;
import com.Driver.TTBDDriverfinal.Driver.DriverRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author josephcalcagno
 */
@Service
public class RouteService {
    
    @Autowired
    private RouteRepository routeRepo;
    
    public List<Route> getAllRoutes() {
        
        return routeRepo.findAll();
    }
    
    public Route getRoute(Long routeId) {
        return routeRepo.getReferenceById(routeId);
        
    }
    
     public Route saveRoute(Route route) {
        return routeRepo.save(route);
        
    }
    
    public void deleteRoute(long routeId) {
        
        routeRepo.deleteById(routeId);
    }
    
    
    
    
}
