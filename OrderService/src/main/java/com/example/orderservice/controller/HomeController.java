package com.example.orderservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/OrderService")
    public String home() {
        System.out.println("Accessed /OrderService");
        return "forward:/index.html";
    }
}
