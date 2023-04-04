package com.rider1.rider1;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author kenne
 */
@AllArgsConstructor
@Entity
@Table(name = "Rider")
@NoArgsConstructor
@Getter
@Setter
public class Rider1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    public double fare;

    /*public Rider (String email, String password, String location, double busFareAmount) {
        this.email = email;
        this.password = password;
        this.location = location;
        this.route = route;
        this.busFareAmount = busFareAmount;
    }*/

    Rider1(String string) {
        this.fare = fare;
        }

    
}
