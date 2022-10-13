package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class Demo1Controller {
    @GetMapping("/")
    public String showForm(){

        System.out.println("Startup success");

        return "frontPage";
    }

    @PostMapping("/calculate")
    public String resultRedirect(@RequestParam("weight") double weight, @RequestParam("height") double height
            , RedirectAttributes redirectAttributes){

        double bmi = weight / Math.pow(height, 2);

        System.out.println("Redirecting..");

        redirectAttributes.addAttribute("weight", weight);
        redirectAttributes.addAttribute("height", height);
        redirectAttributes.addAttribute("bmi", bmi);

        return "redirect:/showresult";
    }


    @GetMapping("/showresult")


    public String showResult(@RequestParam double weight, @RequestParam double height, @RequestParam double bmi
            , Model model){

        System.out.println("Redirect success");

        model.addAttribute("weight", weight);
        model.addAttribute("height", height);
        model.addAttribute("bmi", bmi);



        return "showResult";
    }
}
