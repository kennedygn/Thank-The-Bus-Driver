/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TTBD.TTBD_final.Driver;

import jakarta.persistence.*;

/**
 *
 * @author kenne
 */
@Entity
@Table(name = "driver")
public class Driver {

    @Id
    @Column(name = "driver_email")
    private String driverEmail;

    @Column(name = "driver_password")
    private String driverPassword;

    @Column(name = "amount_paid_total")
    private Double amountPaidTotal;

    public String getDriverEmail() {
        return driverEmail;
    }

    public void setDriverEmail(String driverEmail) {
        this.driverEmail = driverEmail;
    }

    public String getDriverPassword() {
        return driverPassword;
    }

    public void setDriverPassword(String driverPassword) {
        this.driverPassword = driverPassword;
    }

    public Double getAmountPaidTotal() {
        return amountPaidTotal;
    }

    public void setAmountPaidTotal(Double amountPaidTotal) {
        this.amountPaidTotal = amountPaidTotal;
    }
}
