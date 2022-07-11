package com.example.springdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StyleController {

    @GetMapping("/css/style.css")
    public String homeStyle1(Model model){
        return "/css/style.css";
    }

    @GetMapping("/css/animate.css")
    public String homeStyle2(Model model){
        return "/css/animate.css";
    }

    @GetMapping("/font-awesome/css/font-awesome.css")
    public String homeStyle3(Model model){
        return "/font-awesome/css/font-awesome.css";
    }

    @GetMapping("/css/bootstrap.min.css")
    public String homeStyle4(Model model){
        return "/css/bootstrap.min.css";
    }

}
