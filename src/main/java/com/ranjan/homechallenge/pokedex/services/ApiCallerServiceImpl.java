package com.ranjan.homechallenge.pokedex.services;

import com.ranjan.homechallenge.pokedex.types.v2.pokemon_species.$id.FlavorTextEntry;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.ranjan.homechallenge.pokedex.models.PokedexResponse;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;
import com.ranjan.homechallenge.pokedex.types.v2.pokemon_species.$id.Index;

@Service
public class ApiCallerServiceImpl implements ApiCallerService{

    @Value("${pokespecies.api.url}")
    private String pokespeciesUrl;

    @Value("${yoda.translation.url}")
    private String yodaTranslationUrl;

    @Value("${shakespeare.translation.url}")
    private String shakespeareTranslationUrl;

    @Autowired
    private RestTemplate restTemplate;

    /**
     * Makes a Get request to "https://pokeapi.co/api/v2/pokemon-species/" with pokemon name as
     * received in request. Response body is parsed using models generated from json schema of
     * pokemon-species API.
     * @param pokemonName - name of the pokemon to retrieve information about
     * @return name, description, habitat, isLegendary and generation
     * @throws URISyntaxException
     */
    @Override
    @Cacheable("PokedexResponse")
    public PokedexResponse GetSpeciesDescription(String pokemonName) throws URISyntaxException {

        final String baseUrl = pokespeciesUrl+pokemonName;
        System.out.println(baseUrl);
        URI uri = new URI(baseUrl);
        final String[] description = {null};


        // Index response = restTemplate.getForObject(uri, Index.class);
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<Object> entity = new HttpEntity<Object>(headers);
        ResponseEntity<Index> pokeApiResp = restTemplate.exchange(uri, HttpMethod.GET, entity, Index.class);

        Index response = pokeApiResp.getBody();

        //Create list of FlavourTextNode child nodes
        List<FlavorTextEntry> flavorText = response.getFlavorTextEntries();

        //Loop through each node and check if language of flavorText is english
        //If English 'en' then get the description and come out
        flavorText.forEach(n ->{
            if(n.getLanguage().getName().equals("en")){
                description[0] = n.getFlavorText();
                return;
            }
        } );

        //Create response by getting and setting all the values in PokedexResponse class
        PokedexResponse pokedexResponse = new PokedexResponse();
        pokedexResponse.setName(pokemonName);

        //Replace unwanted characters from description to make it pretty
        pokedexResponse.setDescription(description[0].replaceAll("[\\n\\f\\r\\t]", " "));
        pokedexResponse.setHabitat(response.getHabitat().getName());
        pokedexResponse.setIsLegendary(response.getIsLegendary());
        pokedexResponse.setGeneration(response.getGeneration().getName());

        return pokedexResponse;
    }

    /**
     * Makes a call to GetSpeciesDescription() method to get details
     * from "https://pokeapi.co/api/v2/pokemon-species/". Given a pokemon name it
     * translates description using following rules:
     * 1. If the pokemon's habitat is cave or it's a legendary pokemon then apply
     *    yoda translation.
     * 2. For all other pokemon, apply the Shakespeare translation
     * 3. If it cannot be translated then use standard translation
     *
     * @param pokemonName - name of the pokemon to retrieve information about
     * @return name, description, habitat, isLegendary and generation
     * @throws URISyntaxException
     */

    @Override
    @Cacheable("PokedexResponse")
    public PokedexResponse GetTranslatedSpeciesDescription(String pokemonName) throws URISyntaxException {

        PokedexResponse pokeTranlatedResp = GetSpeciesDescription(pokemonName);
        final String baseUrl;
        if(pokeTranlatedResp.getIsLegendary().equals(true) || pokeTranlatedResp.getHabitat().equals("cave"))
            baseUrl = yodaTranslationUrl+"?text="+ URLEncoder.encode(pokeTranlatedResp.getDescription(), StandardCharsets.UTF_8);
        else
            baseUrl = shakespeareTranslationUrl+"?text="+ URLEncoder.encode(pokeTranlatedResp.getDescription(), StandardCharsets.UTF_8);
        URI uri = new URI(baseUrl);
        ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
        JSONObject jsonObject = new JSONObject(result.getBody());
        String description = ((JSONObject) jsonObject.get("contents")).get("translated").toString();
        pokeTranlatedResp.setDescription(description);
        return  pokeTranlatedResp;
    }

}
