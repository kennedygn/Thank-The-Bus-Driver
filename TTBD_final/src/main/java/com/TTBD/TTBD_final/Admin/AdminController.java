package com.TTBD.TTBD_final.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {
    @Autowired
    private AdminRepository adminRepository;
    
    @GetMapping("/adminLogin")
    public String showLoginForm() {
        return "adminLogin";
    }
    @PostMapping("/adminAuth")
    public String login(@RequestParam("admin_email") String adminEmail,
                        @RequestParam("admin_password") String adminPassword) {
        Admin admin = adminRepository.findByEmail(adminEmail);
        if (admin != null && adminPassword.equals(admin.getAdminPassword())) {
            return "/success";
        } 
        else {
            return "/AdminLogin";
        }
    }
}
