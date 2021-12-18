package com.ranjan.homechallenge.pokedex.controllers;


import com.ranjan.homechallenge.pokedex.models.PokedexResponse;
import com.ranjan.homechallenge.pokedex.services.ApiCallerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotBlank;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

@Validated
@RestController
@RequestMapping("/pokemon")
public class WebController {


    private ApiCallerService apiCallerService;

    @Autowired
    public WebController(ApiCallerService apiCallerService) { this.apiCallerService = apiCallerService; }

    /**
     * Method to receive call if no pokemon name is passed in API call
     * @return Response as Pokemon name not received
     */
    @GetMapping
    @RequestMapping("/")
    public Map NoPokeName() {
        Map map = new HashMap<String, String>();
        map.put("Pokedex response:", "Pokemon name not received!!!!!");
        return map;
    }

    /**
     * Method to receive request if API call is made to get standard description of
     * pokemon
     * @param pokename
     * @return pokemon description and other attributes
     * @throws URISyntaxException
     */
    @GetMapping
    @RequestMapping(value = "/{pokename}")
    public PokedexResponse ApiCall(@PathVariable @NotBlank String pokename) throws URISyntaxException {

        return apiCallerService.GetSpeciesDescription(pokename);
    }

    /**
     * Method to receive request if API call is made to receive translated description
     * of pokemon
     * @param pokename
     * @return translated pokemon description with other attributes
     * @throws URISyntaxException
     */
    @GetMapping
    @RequestMapping(value = "/translated/{pokename}")
    public PokedexResponse TranslatedCall(@PathVariable @NotBlank String pokename) throws URISyntaxException {
        return  apiCallerService.GetTranslatedSpeciesDescription(pokename);
    }



}
