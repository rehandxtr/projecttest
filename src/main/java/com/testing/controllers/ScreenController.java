package com.testing.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ScreenController {

    @GetMapping("/")
    public String open(){
        return "screen.html";
    }
    @GetMapping("/hello")
    public String openAgain(){
        return "new.html";
    }
}
