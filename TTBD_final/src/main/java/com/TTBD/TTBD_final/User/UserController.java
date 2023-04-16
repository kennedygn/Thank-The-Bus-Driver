package com.TTBD.TTBD_final.User;

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
    @GetMapping("/greeting")
    public String welcomePage(){
        return "user/template";
    }
    
    /*In the template HTML, I tried to just simply map it to the Rider login page when the user selects 'Rider' but I think 
    it's more complicated than that. I tried -_-    -   Kennedy*/
    /*@PostMapping("/choice")
    public String choice(String choice) {
        User user = userService.getChoiceById(choice);
        String uChoice = userService.toString(choice);
        String userChoice = user.getChoice();
        if (user != "rider") {
            return "/success";
            
        } 
        else if(user == null){
            return "/login";
        }
        else {
            return "/failure";
        }*/
}
