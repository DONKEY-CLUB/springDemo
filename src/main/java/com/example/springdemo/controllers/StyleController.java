package com.example.springdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StyleController {

    @GetMapping("/static/css/style.css")
    public String homeStyle1(Model model){
        return "../static/css/style.css";
    }

    @GetMapping("/static/css/animate.css")
    public String homeStyle2(Model model){
        return "../static/css/animate.css";
    }

    @GetMapping("/static/font-awesome/css/font-awesome.css")
    public String homeStyle3(Model model){
        return "../static/font-awesome/css/font-awesome.css";
    }

    @GetMapping("/static/css/bootstrap.min.css")
    public String homeStyle4(Model model){
        return "../static/css/bootstrap.min.css";
    }

}
