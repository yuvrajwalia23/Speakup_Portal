package com.example.complaintportal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        // This will look for index.html inside src/main/resources/static
        return "forward:/index.html";
    }
}

