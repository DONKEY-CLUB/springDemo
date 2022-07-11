package com.example.springdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StyleController {

    @GetMapping("/static/styles/css/style.css")
    public String homeStyle1(Model model){
        return "../static/styles/css/style.css";
    }

    @GetMapping("/static/styles/css/animate.css")
    public String homeStyle2(Model model){
        return "../static/styles/css/animate.css";
    }

    @GetMapping("/static/styles/font-awesome/css/font-awesome.css")
    public String homeStyle3(Model model){
        return "../static/styles/font-awesome/css/font-awesome.css";
    }

    @GetMapping("/static/styles/css/bootstrap.min.css")
    public String homeStyle4(Model model){
        return "../static/styles/css/bootstrap.min.css";
    }

}
