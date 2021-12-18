package com.ranjan.homechallenge.pokedex.controllers;


import com.ranjan.homechallenge.pokedex.models.PokedexResponse;
import com.ranjan.homechallenge.pokedex.services.ApiCallerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/pokemon")
public class WebController {


    private ApiCallerService apiCallerService;

    @Autowired
    public WebController(ApiCallerService apiCallerService) { this.apiCallerService = apiCallerService; }

    @GetMapping
    @RequestMapping("/")
    public Map NoPokeName() {
        Map map = new HashMap<String, String>();
        map.put("Pokedex response:", "Pokemon name not received!!!!!");
        return map;
    }

    @GetMapping
    @RequestMapping(value = "/{pokename}")
    public PokedexResponse ApiCall(@PathVariable String pokename) throws URISyntaxException {
        return apiCallerService.GetSpeciesDescription(pokename);
    }

    @GetMapping
    @RequestMapping(value = "/translated/{pokename}")
    public PokedexResponse TranslatedCall(@PathVariable String pokename) throws URISyntaxException {
        return  apiCallerService.GetTranslatedSpeciesDescription(pokename);
    }


}
