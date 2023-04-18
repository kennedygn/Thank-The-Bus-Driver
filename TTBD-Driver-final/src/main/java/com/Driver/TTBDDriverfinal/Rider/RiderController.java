/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Driver.TTBDDriverfinal.Rider;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author kenne
 */
@Controller
@RequestMapping("/rider")
public class RiderController {

    @Autowired
    RiderService riderService;

    @GetMapping("/home")
    public String showHomePage() {
        return "rider/rider-homepage";
    }

    @GetMapping("/all")
    public String getAmount(Model model) {
        model.addAttribute("riderList", riderService.getBusFare());
        return "rider/rider-busfare";

    }

    @GetMapping("/balance")
    public String homePage(Model model) {
        double balance = riderService.getFareById(1).getFare();
        model.addAttribute("fare", balance);
        return "rider/rider-balance";
    }

    /*@PostMapping("/save")
    public String saveFare(@RequestParam("fare") double fare) {
        Rider rider = riderService.getFareById(1);
        rider.setFare(rider.getFare() + fare);
        riderService.save(rider);
        return "redirect:/rider/balance";
    }*/

/*
    @GetMapping("/routes")
    public String viewRoutes(Model model) {
       // model.addAttribute("routeList", riderService.getRoutes());
        return "rider/rider-routes";
    }
    */
    
    
    
 @PostMapping("/save")
public String saveFare(@RequestParam("id") long id, @RequestParam("fare") double fare, Model model) {
    Rider rider = riderService.getFareById(id);
    double updatedFare = rider.getFare() + fare;
    rider.setFare(updatedFare);
    riderService.save(rider);
    model.addAttribute("fare", updatedFare); // Add updated balance to model
    return "rider/rider-balance";
}


}