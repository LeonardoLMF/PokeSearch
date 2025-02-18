package br.com.pokesearchleo.pokesearch.controller;

import br.com.pokesearchleo.pokesearch.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PokemonController {

    @Autowired
    private PokemonService pokemonService;

    @GetMapping("/")
    public String home(){
     return "index";
    }

    @GetMapping("/pokemon")
    public String getPokemon(@RequestParam String name, Model model){
        String pokemonData = pokemonService.getPokemon(name);
        model.addAttribute("pokemon", pokemonData);
        return "pokemon";

    }
}
