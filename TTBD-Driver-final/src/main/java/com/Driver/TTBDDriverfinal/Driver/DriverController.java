
package com.Driver.TTBDDriverfinal.Driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author josephcalcagno
 */
@Controller
@RequestMapping("/driver")
public class DriverController {

    @Autowired
    DriverService driverService;

    @GetMapping("/list-drivers")
    public String showDriver(Model model) {
        model.addAttribute("driverList", driverService.getAllDrivers());

        return "driver/list-drivers";

    }
      @PostMapping("/save-route")
    public String saveRoute(@ModelAttribute("driver") Driver driver, @RequestParam String routeDriving) {
        driver.setRouteDriving(routeDriving); // set the routeDriving property of the driver object
        driverService.saveDriver(driver); // save the updated driver object
        return "redirect:/driver/list-drivers"; // redirect back to the driver list page
    }
    
    @GetMapping("/driver-login")
    public String driverLogin(){
        
        
        return "/driver/driver-login";
    }
    
    
    
    @PostMapping("/sign-up")
public String signUp(@RequestParam String name, @RequestParam String routeDriving) {
    Driver driver = new Driver(name, routeDriving);
    driver.setRouteDriving(routeDriving);
    driverService.saveDriver(driver);

    return "redirect:/driver/list-drivers";
}

@GetMapping("/time-clock")
public String timeClock(Model model) {
    
    return "driver/time-clock";
}
    

    

}