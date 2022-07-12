package com.example.springdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {


    @GetMapping("/index.html")
    public String home( Model model) {
        model.addAttribute("title", "Главная страница");
        return "index";
    }
    @GetMapping("/minor.html")
    public String home2( Model model) {
        return "minor";
    }

    @GetMapping("/profiles.html")
    public String profile( Model model) {
        return "profiles";
    }

    @GetMapping("/login.html")
    public String login( Model model) {
        return "login";
    }

    @GetMapping("/")
    public String login2( Model model) {
        return "login";
    }

    @GetMapping("/register.html")
    public String register( Model model) {
        return "register";
    }

}
