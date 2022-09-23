package com.example.parralax_scrolling.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ParralaxScrollingController {

    @GetMapping("/")
    public String frontPage(){
        return "index.html";
    }
}
