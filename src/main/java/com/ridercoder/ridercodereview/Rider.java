package com.ridercoder.ridercodereview;

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
@Table(name = "riderInfo")
@NoArgsConstructor
@Getter
@Setter
public class Rider {
    @Id
    /*@GeneratedValue(strategy = GenerationType.IDENTITY)*/
    private long id;
    private double fare;
    
    public Rider(double fare, long id) {
        this.fare = fare;
        this.id = id;
    }
}
