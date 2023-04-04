/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TTBDJoe.JoeCodeDriver.Route;

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
    private RouteRepository repo;

    public List<Route> getAllRoutes() {
        return repo.findAll();
    }

    public Route getRoute(long routeId) {
        return repo.getReferenceById(routeId);
    }

    public void deleteRoute(long routeId) {
        repo.deleteById(routeId);

    }

    public void saveRoute(Route route) {

        repo.save(route);
    }
    

}
