/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TTBD.TTBD_final.Rider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author kenne
 */
@Controller
@RequestMapping("/rider")
public class RiderController {
    @Autowired
    RiderService riderService;

    @GetMapping("/all")
    public String getAmount(Model model) {
        model.addAttribute("riderList", riderService.getBusFare());
        return "rider/rider-busfare";

    }

    @GetMapping("/home")
    public String homePage(Rider amount, Model model) {
        model.addAttribute("riderList", riderService.getBusFare());
        riderService.save(amount);
        return "rider/rider-homepage";
    }

    /*@GetMapping("/routes")
    public String viewRoutes(Model model) {
        model.addAttribute("routeList", riderService.getRoutes());

        return "rider/rider-routes";

    }*/
        
    @PostMapping("/save")
    public String saveFare(long id, double fare) {
        Rider rider = riderService.getFareById(id);
        double updatedFare = rider.getFare() + fare;
        rider.setFare(updatedFare);
        riderService.save(rider);
        return "redirect:/rider/home";
    }

}
