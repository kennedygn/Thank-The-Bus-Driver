
package com.Driver.TTBDDriverfinal.Route;

import com.Driver.TTBDDriverfinal.Driver.DriverService;
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
import org.springframework.web.bind.annotation.RequestMapping;



/**
 *
 * @author josephcalcagno
 */

@Controller
@RequestMapping("/route")
public class RouteController {
    
   @Autowired
    RouteService routeService;

   @GetMapping("/list-routes")
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
    return "driver/list-routes";
}

    
    

    
    
}
