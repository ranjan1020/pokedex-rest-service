package com.ranjan.homechallenge.pokedex.services;

import com.ranjan.homechallenge.pokedex.types.v2.pokemon_species.$id.FlavorTextEntry;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
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

    @Override
    public PokedexResponse GetSpeciesDescription(String pokemonName) throws URISyntaxException {

        final String baseUrl = pokespeciesUrl+pokemonName;
        System.out.println(baseUrl);
        URI uri = new URI(baseUrl);
        final String[] description = {null};

        Index response = restTemplate.getForObject(uri, Index.class);
        List<FlavorTextEntry> flavorText = response.getFlavorTextEntries();
        flavorText.forEach(n ->{
            if(n.getLanguage().getName().equals("en")){
                description[0] = n.getFlavorText();
                return;
            }
        } );

        PokedexResponse pokedexResponse = new PokedexResponse();
        pokedexResponse.setName(pokemonName);
        pokedexResponse.setDescription(description[0].replaceAll("[\\n\\f\\r\\t]", " "));
        pokedexResponse.setHabitat(response.getHabitat().getName());
        pokedexResponse.setIsLegendary(response.getIsLegendary());
        pokedexResponse.setGeneration(response.getGeneration().getName());

        return pokedexResponse;
    }

    @Override
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
