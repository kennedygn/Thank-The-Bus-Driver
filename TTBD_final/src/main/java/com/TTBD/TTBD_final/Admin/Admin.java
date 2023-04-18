package com.TTBD.TTBD_final.Admin;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Admin")
public class Admin {
    @Id
    @Column(name = "admin_email", unique = true, nullable = false)
    private String adminEmail;
    
    @Column(name = "admin_password", nullable = true)
    private String adminPassword;
    
    @Column(name = "working_capital", nullable = true)
    private double workingCapital;

    public Admin(){}
    public Admin(String adminEmail, String adminPassword, double workingCapital) {
        this.adminEmail = adminEmail;
        this.adminPassword = adminPassword;
        this.workingCapital = workingCapital;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public double getWorkingCapital() {
        return workingCapital;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public void setWorkingCapital(double workingCapital) {
        this.workingCapital = workingCapital;
    }
    
    
}
