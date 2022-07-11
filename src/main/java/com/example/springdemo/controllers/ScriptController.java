package com.example.springdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ScriptController {

    @GetMapping("/static/scripts/js/jquery-2.1.1.js")
    public String homeScript1( Model model) {
        return "../static/scripts/js/jquery-2.1.1.js";
    }
    @GetMapping("/static/scripts/js/bootstrap.min.js")
    public String homeScript2( Model model) {
        return "../static/scripts/js/bootstrap.min.js";
    }
    @GetMapping("/static/scripts/js/plugins/metisMenu/jquery.metisMenu.js")
    public String homeScript3( Model model) {
        return "../static/scripts/js/plugins/metisMenu/jquery.metisMenu.js";
    }
    @GetMapping("/static/scripts/js/plugins/slimscroll/jquery.slimscroll.min.js")
    public String homeScript4( Model model) {
        return "../static/scripts/js/plugins/slimscroll/jquery.slimscroll.min.js";
    }
    @GetMapping("/static/scripts/js/inspinia.js")
    public String homeScript5( Model model) {
        return "../static/scripts/js/inspinia.js";
    }
    @GetMapping("/static/scripts/js/plugins/pace/pace.min.js")
    public String homeScript6( Model model) {
        return "../static/scripts/js/plugins/pace/pace.min.js";
    }

}
