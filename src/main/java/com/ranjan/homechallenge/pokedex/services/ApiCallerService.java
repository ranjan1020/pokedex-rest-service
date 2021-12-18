package com.ranjan.homechallenge.pokedex.services;

import com.ranjan.homechallenge.pokedex.models.PokedexResponse;

import java.net.URISyntaxException;


public interface ApiCallerService {

    PokedexResponse GetSpeciesDescription(String pokemonName) throws URISyntaxException;
    PokedexResponse GetTranslatedSpeciesDescription(String pokemonName) throws URISyntaxException;


}
