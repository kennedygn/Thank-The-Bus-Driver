package com.TTBD.TTBD_final.Admin;

import jakarta.persistence.*;

@Entity
@Table(name = "altered_routes")
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "altered_route_id")
    private int routeId;

    @Column(name = "route")
    private String name;

    @Column(name = "is_active")
    private boolean isActive;

    public Route() {
    }

    public Route(String name, boolean isActive) {
        this.name = name;
        this.isActive = isActive;
    }

    public int getRouteId() {
        return routeId;
    }

    public void setRouteId(int routeId) {
        this.routeId = routeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
}
