package com.example.pokedexpogchamp.controller;

import com.example.pokedexpogchamp.repository.PokedexRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PokedexController {
    PokedexRepository pokedexRepository;

    public PokedexController(PokedexRepository p){
        pokedexRepository = p;
    }

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("pokemon", pokedexRepository.getAll());
        return "index";
    }
}
