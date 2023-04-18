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
}
