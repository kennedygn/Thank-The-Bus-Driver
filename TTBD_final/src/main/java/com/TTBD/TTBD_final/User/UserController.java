package com.TTBD.TTBD_final.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author kenne
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping("/greeting")
    public String welcomePage(){
        return "user/loginorcreateaccount";
    }
}
