package com.ranjan.homechallenge.pokedex.models;


import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class PokedexResponse {

    String name;
    String description;
    String habitat;
    Boolean isLegendary;
    String generation;

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public Boolean getIsLegendary() {
        return isLegendary;
    }

    public void setIsLegendary(Boolean isLegendary) {
        this.isLegendary = isLegendary;
    }
}
