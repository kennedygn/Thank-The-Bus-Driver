package com.TTBD.TTBD_final.Admin;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/routes")
public class RouteController {

    @Autowired
    private RouteRepository routeRepository;

        @PostMapping("/add")
    public Route addRoute(@RequestBody Route route) {
        return processRoute(route, true);
    }

    @PostMapping("/remove")
    public Route removeRoute(@RequestBody Route route) {
        return processRoute(route, false);
    }

    private Route processRoute(Route route, boolean isActive) {
        List<Route> existingRoute = routeRepository.findByName(route.getName());

        if (!existingRoute.isEmpty()) {
            Route currentRoute = existingRoute.get(0);
            if (currentRoute.isActive() == isActive) {
                return currentRoute; // Return the existing route without making any changes
            } else {
                currentRoute.setActive(isActive);
                return routeRepository.save(currentRoute); // Update the existing route's isActive status
            }
        } else {
            route.setActive(isActive);
            return routeRepository.save(route); // Save the new route
        }
    }
}
  
