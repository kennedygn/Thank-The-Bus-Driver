/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Driver.TTBDDriverfinal.Rider;

import com.Driver.TTBDDriverfinal.Route.Route;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author kenne
 */
@Controller
@RequestMapping("/rider")
public class RiderController {

    @Autowired
    RiderService riderService;

    @GetMapping("/all")
    public String getAmount(Model model) {
        model.addAttribute("riderList", riderService.getBusFare());
        return "rider/rider-busfare";

    }

    @GetMapping("/home")
    public String homePage(Rider amount, Model model) {
        model.addAttribute("riderList", riderService.getBusFare());
        riderService.save(amount);
        return "rider/rider-homepage";
    }

    /*@GetMapping("/routes")
    public String viewRoutes(Model model) {
        model.addAttribute("routeList", riderService.getRoutes());

        return "rider/rider-routes";

    }*/
    @PostMapping("/save")
    public String saveFare(long id, double fare) {
        Rider rider = riderService.getFareById(id);
        double updatedFare = rider.getFare() + fare;
        rider.setFare(updatedFare);
        riderService.save(rider);
        return "redirect:/rider/home";
    }

    @GetMapping("/view-routes")
    public String showRoutes(Model model) throws IOException {
        String url = "https://transloc-api-1-2.p.rapidapi.com/agencies.json";
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .get()
                .addHeader("x-rapidapi-host", "transloc-api-1-2.p.rapidapi.com")
                .addHeader("x-rapidapi-key", "d513577cadmsh1c2a1b98ad9f8aap17e90ajsn4b7faf1a3783")
                .build();

        Response response = client.newCall(request).execute();

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(response.body().string());

        List<Route> routeList = new ArrayList<>();

        JsonNode data = root.get("data");
        for (JsonNode agencyNode : data) {
            String shortName = agencyNode.get("short_name").asText();
            Route route = new Route(shortName);
            routeList.add(route);
        }

        model.addAttribute("routeList", routeList);
        return "rider/rider-view-routes";
    }

}
