package com.TTBD.TTBD_final.Admin;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RouteRepository extends JpaRepository<Route, Integer> {
    List<Route> findByName(String name);
}