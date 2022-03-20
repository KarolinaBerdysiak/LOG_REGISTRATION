package com.example.log_registration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/login")
    String login(){
        return "login";
    }
    @GetMapping("/")
    String home(){
        return "index";
    }
}
