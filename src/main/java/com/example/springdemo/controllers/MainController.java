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

    //ADD STYLES
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

    //ADD SCRIPTS
    @GetMapping("/js/jquery-2.1.1.js")
    public String homeScript1( Model model) {
        return "/js/jquery-2.1.1.js";
    }
    @GetMapping("/js/bootstrap.min.js")
    public String homeScript2( Model model) {
        return "/js/bootstrap.min.js";
    }
    @GetMapping("/js/plugins/metisMenu/jquery.metisMenu.js")
    public String homeScript3( Model model) {
        return "/js/plugins/metisMenu/jquery.metisMenu.js";
    }
    @GetMapping("/js/plugins/slimscroll/jquery.slimscroll.min.js")
    public String homeScript4( Model model) {
        return "/js/plugins/slimscroll/jquery.slimscroll.min.js";
    }
    @GetMapping("/js/inspinia.js")
    public String homeScript5( Model model) {
        return "/js/inspinia.js";
    }
    @GetMapping("/js/plugins/pace/pace.min.js")
    public String homeScript6( Model model) {
        return "/js/plugins/pace/pace.min.js";
    }
}
