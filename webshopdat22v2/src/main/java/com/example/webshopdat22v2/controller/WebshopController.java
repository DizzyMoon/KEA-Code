package com.example.webshopdat22v2.controller;


import com.example.webshopdat22v2.repository.ProductRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class WebshopController {
    ProductRepository productRepository;

    public WebshopController(ProductRepository p) {
        productRepository = p;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("products", productRepository.getAll());
        return "index";
    }

    @GetMapping("/cookieget")
    public String getCookie(HttpSession session) {

        if (session.getAttribute("username") != null) {
            System.out.println(session.getAttribute("username"));
        } else {
            System.out.println("No username exists");
        }
        return "CookieDemo";
    }

    @GetMapping("/cookieset")
    public String setCookie(HttpSession session) {
        session.setAttribute("username", "yumyum");
        return "CookieDemo";
    }

    @GetMapping("/cookieinvalidate")
        public String invalidateCookies(HttpSession session){
        session.invalidate();
        return "CookieDemo";
    }

}
