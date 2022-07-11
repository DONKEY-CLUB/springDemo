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
        model.addAttribute("title", "Главная страница");
        return "minor";
    }

    @GetMapping("/profiles.html")
    public String home3( Model model) {
        model.addAttribute("title", "Главная страница");
        return "profiles";
    }
}
