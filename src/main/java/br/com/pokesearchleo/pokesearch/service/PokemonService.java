package br.com.pokesearchleo.pokesearch.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PokemonService {

    private final RestTemplate restTemplate;

    public PokemonService() {
        this.restTemplate = new RestTemplate();
    }

    public String getPokemon(String name){
        String url = "https://pokeapi.co/api/v2/pokemon/" + name;
        return restTemplate.getForObject(url, String.class);
    }

}
