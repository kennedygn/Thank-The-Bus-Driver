package com.TTBD.TTBD_final.Admin;

import com.TTBD.TTBD_final.Driver.Driver;
import com.TTBD.TTBD_final.Driver.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {
    @Autowired
    private AdminRepository adminRepository;
    @Autowired
    private DriverRepository driverRepository;
    
    @GetMapping("/AdminLogin")
    public String showLoginForm() {
        return "admin/AdminLogin";
    }
    @GetMapping("/successAdmin")
    public String showMainForm(){
        return "admin/AdminMain";
    }
    @PostMapping("/adminAuth")
    public String login(@RequestParam("admin_email") String adminEmail,
                        @RequestParam("admin_password") String adminPassword) {
        Admin admin = adminRepository.findByAdminEmail(adminEmail);
        if (admin != null && adminPassword.equals(admin.getAdminPassword())) {
            return "redirect:/successAdmin";
        } 
        else {
            return "redirect:/AdminLogin";
        }
    }

// Method for creating a new driver
@PostMapping("/createDriver")
public String createDriver(@RequestParam("driver_email") String driverEmail,
                            @RequestParam("driver_password") String driverPassword) {
    if (driverRepository.findByDriverEmail(driverEmail) == null) {
        Driver driver = new Driver();
        driver.setDriverEmail(driverEmail);
        driver.setDriverPassword(driverPassword);
        driver.setAmountPaidTotal(0.0);
        driverRepository.save(driver);

    } 
    return "redirect:/successAdmin";
}

// Method for removing a driver
@PostMapping("/removeDriver")
public String removeDriver(@RequestParam("driver_email") String driverEmail) {
    Driver driver = driverRepository.findByDriverEmail(driverEmail);
    if (driver != null) {
        driverRepository.delete(driver);
        
    }
    return "redirect:/successAdmin";
}

// Method for paying a driver
@PostMapping("/payDriver")
public String payDriver(@RequestParam("driver_email") String driverEmail,
                        @RequestParam("amount") Double amount) {
    Driver driver = driverRepository.findByDriverEmail(driverEmail);
    if (driver != null) {
        double newAmountPaidTotal = driver.getAmountPaidTotal() + amount;
        driver.setAmountPaidTotal(newAmountPaidTotal);
        driverRepository.save(driver);
        Admin admin = adminRepository.findAll().get(0);
        if (admin != null) {
            double newWorkingCapital = admin.getWorkingCapital() - amount;
            admin.setWorkingCapital(newWorkingCapital);
            adminRepository.save(admin);
        }
    }
    return "redirect:/successAdmin";
}
@PostMapping("/driverAction")
public String driverAction(
                            @RequestParam("driver_email") String driverEmail,
                            @RequestParam("driver_password") String driverPassword,
                            @RequestParam("driver_action") String driverAction) {
        return switch (driverAction) {
            case "register" -> createDriver(driverEmail, driverPassword);
            case "remove" -> removeDriver(driverEmail);
            default -> "redirect:/successAdmin";
        };
}
}
