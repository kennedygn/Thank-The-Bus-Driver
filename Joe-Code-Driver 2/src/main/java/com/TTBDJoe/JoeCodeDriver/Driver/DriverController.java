/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TTBDJoe.JoeCodeDriver.Driver;

import com.TTBDJoe.JoeCodeDriver.Route.Route;
import com.TTBDJoe.JoeCodeDriver.Route.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**;
 *
 * @author josephcalcagno
 */
@Controller
@RequestMapping("/driver")
public class DriverController {

    @Autowired
    DriverService driverService;

    @Autowired
    RouteService routeService;

    @GetMapping("/all")
    public String getDrivers(Model model) {
        model.addAttribute("driverList", driverService.getAllDrivers());
        return "driver/list-drivers";

    }
    
    @GetMapping("/home")
    public String homePage() {
        
        
        return "driver/driver-home";
    }

    @GetMapping("/routes")
    public String viewRoutes(Model model) {
        model.addAttribute("routeList", routeService.getAllRoutes());

        return "driver/view-routes";

    }

    @GetMapping("/id={driverId}")
    public String getDriver(@PathVariable long driverId, Model model) {
        model.addAttribute("driver", driverService.getDriver(driverId));
        return "driver/driver-detail";
    }

    @GetMapping("/delete/id={driverId}")
    public String deleteDriver(@PathVariable long driverId, Model model) {
        driverService.deleteDriver(driverId);
        return "redirect:/driver/all";
    }

   @GetMapping("/new-driver")
    public String newDriverForm(Model model) {
        return "driver/new-driver";
    }

    @PostMapping("/create")
    public String createDriver(Driver driver) {

        driverService.saveDriver(driver);
        return "redirect:/driver/all";
    }
    
    @GetMapping("/sign-up")
    public String signUp(Model model){
        return "driver/sign-up";
        
    }
    
    @PostMapping("/create-sign-up")
    public String createSignUp(Route route) {
        routeService.saveRoute(route);
        return "redirect:/driver/view-routes";
        
    }
    
    @GetMapping("/clock")
    public String timeClock() {
        
        return "driver/time-clock";
    }
    
    

}
