package com.TTBD.TTBD_final.User;

import com.TTBD.TTBD_final.Rider.Rider;
import com.TTBD.TTBD_final.Rider.RiderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author kenne
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;
    @Autowired
    RiderService riderService;

    @GetMapping("/greeting")
    public String welcomePage() {
        return "user/template";
    }

    /*In the template HTML, I tried to just simply map it to the Rider login page when the user selects 'Rider' but I think 
    it's more complicated than that. I tried -_-    -   Kennedy*/
    @PostMapping("/role")
    public String choice(String role) {
        User user = userService.getRoleById(role);
        String userChoice = user.getRole();
        if ("rider".equals(userChoice)) {
            return "rider/login";
        }
        else return "user/template";
    }
}
