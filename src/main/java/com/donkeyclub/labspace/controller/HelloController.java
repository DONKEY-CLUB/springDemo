package com.donkeyclub.labspace.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class HelloController {

    @GetMapping("/index.html")
    public String helloWorld(Model model) {
        model.addAttribute("title", "Главная страница");
        return "index";
    }

    @GetMapping("/minor.html")
    public String minor(Model model) {
        model.addAttribute("title", "Главная страница");
        return "minor";
    }
}
