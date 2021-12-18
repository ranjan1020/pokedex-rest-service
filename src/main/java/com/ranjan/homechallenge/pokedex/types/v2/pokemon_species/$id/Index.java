
package com.ranjan.homechallenge.pokedex.types.v2.pokemon_species.$id;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.ranjan.homechallenge.pokedex.types.v2.ApiResource;
import com.ranjan.homechallenge.pokedex.types.v2.NamedApiResource;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "base_happiness",
    "capture_rate",
    "color",
    "egg_groups",
    "evolution_chain",
    "evolves_from_species",
    "flavor_text_entries",
    "form_descriptions",
    "forms_switchable",
    "gender_rate",
    "genera",
    "generation",
    "growth_rate",
    "habitat",
    "has_gender_differences",
    "hatch_counter",
    "id",
    "is_baby",
    "is_legendary",
    "is_mythical",
    "name",
    "names",
    "order",
    "pal_park_encounters",
    "pokedex_numbers",
    "shape",
    "varieties"
})
@Generated("jsonschema2pojo")
public class Index {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("base_happiness")
    private Integer baseHappiness;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("capture_rate")
    private Integer captureRate;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("color")
    private NamedApiResource color;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("egg_groups")
    private List<NamedApiResource> eggGroups = new ArrayList<NamedApiResource>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("evolution_chain")
    private ApiResource evolutionChain;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("evolves_from_species")
    private Object evolvesFromSpecies;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("flavor_text_entries")
    private List<FlavorTextEntry> flavorTextEntries = new ArrayList<FlavorTextEntry>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("form_descriptions")
    private List<FormDescription> formDescriptions = new ArrayList<FormDescription>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("forms_switchable")
    private Boolean formsSwitchable;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("gender_rate")
    private Integer genderRate;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("genera")
    private List<Genera> genera = new ArrayList<Genera>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("generation")
    private NamedApiResource generation;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("growth_rate")
    private NamedApiResource growthRate;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("habitat")
    private NamedApiResource habitat;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("has_gender_differences")
    private Boolean hasGenderDifferences;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("hatch_counter")
    private Integer hatchCounter;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private Integer id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("is_baby")
    private Boolean isBaby;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("is_legendary")
    private Boolean isLegendary;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("is_mythical")
    private Boolean isMythical;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    private String name;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("names")
    private List<Name> names = new ArrayList<Name>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("order")
    private Integer order;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pal_park_encounters")
    private List<PalParkEncounter> palParkEncounters = new ArrayList<PalParkEncounter>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pokedex_numbers")
    private List<PokedexNumber> pokedexNumbers = new ArrayList<PokedexNumber>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("shape")
    private NamedApiResource shape;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("varieties")
    private List<Variety> varieties = new ArrayList<Variety>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("base_happiness")
    public Integer getBaseHappiness() {
        return baseHappiness;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("base_happiness")
    public void setBaseHappiness(Integer baseHappiness) {
        this.baseHappiness = baseHappiness;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("capture_rate")
    public Integer getCaptureRate() {
        return captureRate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("capture_rate")
    public void setCaptureRate(Integer captureRate) {
        this.captureRate = captureRate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("color")
    public NamedApiResource getColor() {
        return color;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("color")
    public void setColor(NamedApiResource color) {
        this.color = color;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("egg_groups")
    public List<NamedApiResource> getEggGroups() {
        return eggGroups;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("egg_groups")
    public void setEggGroups(List<NamedApiResource> eggGroups) {
        this.eggGroups = eggGroups;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("evolution_chain")
    public ApiResource getEvolutionChain() {
        return evolutionChain;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("evolution_chain")
    public void setEvolutionChain(ApiResource evolutionChain) {
        this.evolutionChain = evolutionChain;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("evolves_from_species")
    public Object getEvolvesFromSpecies() {
        return evolvesFromSpecies;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("evolves_from_species")
    public void setEvolvesFromSpecies(Object evolvesFromSpecies) {
        this.evolvesFromSpecies = evolvesFromSpecies;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("flavor_text_entries")
    public List<FlavorTextEntry> getFlavorTextEntries() {
        return flavorTextEntries;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("flavor_text_entries")
    public void setFlavorTextEntries(List<FlavorTextEntry> flavorTextEntries) {
        this.flavorTextEntries = flavorTextEntries;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("form_descriptions")
    public List<FormDescription> getFormDescriptions() {
        return formDescriptions;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("form_descriptions")
    public void setFormDescriptions(List<FormDescription> formDescriptions) {
        this.formDescriptions = formDescriptions;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("forms_switchable")
    public Boolean getFormsSwitchable() {
        return formsSwitchable;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("forms_switchable")
    public void setFormsSwitchable(Boolean formsSwitchable) {
        this.formsSwitchable = formsSwitchable;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("gender_rate")
    public Integer getGenderRate() {
        return genderRate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("gender_rate")
    public void setGenderRate(Integer genderRate) {
        this.genderRate = genderRate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("genera")
    public List<Genera> getGenera() {
        return genera;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("genera")
    public void setGenera(List<Genera> genera) {
        this.genera = genera;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("generation")
    public NamedApiResource getGeneration() {
        return generation;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("generation")
    public void setGeneration(NamedApiResource generation) {
        this.generation = generation;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("growth_rate")
    public NamedApiResource getGrowthRate() {
        return growthRate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("growth_rate")
    public void setGrowthRate(NamedApiResource growthRate) {
        this.growthRate = growthRate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("habitat")
    public NamedApiResource getHabitat() {
        return habitat;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("habitat")
    public void setHabitat(NamedApiResource habitat) {
        this.habitat = habitat;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("has_gender_differences")
    public Boolean getHasGenderDifferences() {
        return hasGenderDifferences;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("has_gender_differences")
    public void setHasGenderDifferences(Boolean hasGenderDifferences) {
        this.hasGenderDifferences = hasGenderDifferences;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("hatch_counter")
    public Integer getHatchCounter() {
        return hatchCounter;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("hatch_counter")
    public void setHatchCounter(Integer hatchCounter) {
        this.hatchCounter = hatchCounter;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("is_baby")
    public Boolean getIsBaby() {
        return isBaby;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("is_baby")
    public void setIsBaby(Boolean isBaby) {
        this.isBaby = isBaby;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("is_legendary")
    public Boolean getIsLegendary() {
        return isLegendary;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("is_legendary")
    public void setIsLegendary(Boolean isLegendary) {
        this.isLegendary = isLegendary;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("is_mythical")
    public Boolean getIsMythical() {
        return isMythical;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("is_mythical")
    public void setIsMythical(Boolean isMythical) {
        this.isMythical = isMythical;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("names")
    public List<Name> getNames() {
        return names;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("names")
    public void setNames(List<Name> names) {
        this.names = names;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("order")
    public Integer getOrder() {
        return order;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("order")
    public void setOrder(Integer order) {
        this.order = order;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pal_park_encounters")
    public List<PalParkEncounter> getPalParkEncounters() {
        return palParkEncounters;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pal_park_encounters")
    public void setPalParkEncounters(List<PalParkEncounter> palParkEncounters) {
        this.palParkEncounters = palParkEncounters;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pokedex_numbers")
    public List<PokedexNumber> getPokedexNumbers() {
        return pokedexNumbers;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pokedex_numbers")
    public void setPokedexNumbers(List<PokedexNumber> pokedexNumbers) {
        this.pokedexNumbers = pokedexNumbers;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("shape")
    public NamedApiResource getShape() {
        return shape;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("shape")
    public void setShape(NamedApiResource shape) {
        this.shape = shape;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("varieties")
    public List<Variety> getVarieties() {
        return varieties;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("varieties")
    public void setVarieties(List<Variety> varieties) {
        this.varieties = varieties;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Index.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("baseHappiness");
        sb.append('=');
        sb.append(((this.baseHappiness == null)?"<null>":this.baseHappiness));
        sb.append(',');
        sb.append("captureRate");
        sb.append('=');
        sb.append(((this.captureRate == null)?"<null>":this.captureRate));
        sb.append(',');
        sb.append("color");
        sb.append('=');
        sb.append(((this.color == null)?"<null>":this.color));
        sb.append(',');
        sb.append("eggGroups");
        sb.append('=');
        sb.append(((this.eggGroups == null)?"<null>":this.eggGroups));
        sb.append(',');
        sb.append("evolutionChain");
        sb.append('=');
        sb.append(((this.evolutionChain == null)?"<null>":this.evolutionChain));
        sb.append(',');
        sb.append("evolvesFromSpecies");
        sb.append('=');
        sb.append(((this.evolvesFromSpecies == null)?"<null>":this.evolvesFromSpecies));
        sb.append(',');
        sb.append("flavorTextEntries");
        sb.append('=');
        sb.append(((this.flavorTextEntries == null)?"<null>":this.flavorTextEntries));
        sb.append(',');
        sb.append("formDescriptions");
        sb.append('=');
        sb.append(((this.formDescriptions == null)?"<null>":this.formDescriptions));
        sb.append(',');
        sb.append("formsSwitchable");
        sb.append('=');
        sb.append(((this.formsSwitchable == null)?"<null>":this.formsSwitchable));
        sb.append(',');
        sb.append("genderRate");
        sb.append('=');
        sb.append(((this.genderRate == null)?"<null>":this.genderRate));
        sb.append(',');
        sb.append("genera");
        sb.append('=');
        sb.append(((this.genera == null)?"<null>":this.genera));
        sb.append(',');
        sb.append("generation");
        sb.append('=');
        sb.append(((this.generation == null)?"<null>":this.generation));
        sb.append(',');
        sb.append("growthRate");
        sb.append('=');
        sb.append(((this.growthRate == null)?"<null>":this.growthRate));
        sb.append(',');
        sb.append("habitat");
        sb.append('=');
        sb.append(((this.habitat == null)?"<null>":this.habitat));
        sb.append(',');
        sb.append("hasGenderDifferences");
        sb.append('=');
        sb.append(((this.hasGenderDifferences == null)?"<null>":this.hasGenderDifferences));
        sb.append(',');
        sb.append("hatchCounter");
        sb.append('=');
        sb.append(((this.hatchCounter == null)?"<null>":this.hatchCounter));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("isBaby");
        sb.append('=');
        sb.append(((this.isBaby == null)?"<null>":this.isBaby));
        sb.append(',');
        sb.append("isLegendary");
        sb.append('=');
        sb.append(((this.isLegendary == null)?"<null>":this.isLegendary));
        sb.append(',');
        sb.append("isMythical");
        sb.append('=');
        sb.append(((this.isMythical == null)?"<null>":this.isMythical));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("names");
        sb.append('=');
        sb.append(((this.names == null)?"<null>":this.names));
        sb.append(',');
        sb.append("order");
        sb.append('=');
        sb.append(((this.order == null)?"<null>":this.order));
        sb.append(',');
        sb.append("palParkEncounters");
        sb.append('=');
        sb.append(((this.palParkEncounters == null)?"<null>":this.palParkEncounters));
        sb.append(',');
        sb.append("pokedexNumbers");
        sb.append('=');
        sb.append(((this.pokedexNumbers == null)?"<null>":this.pokedexNumbers));
        sb.append(',');
        sb.append("shape");
        sb.append('=');
        sb.append(((this.shape == null)?"<null>":this.shape));
        sb.append(',');
        sb.append("varieties");
        sb.append('=');
        sb.append(((this.varieties == null)?"<null>":this.varieties));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.isBaby == null)? 0 :this.isBaby.hashCode()));
        result = ((result* 31)+((this.genera == null)? 0 :this.genera.hashCode()));
        result = ((result* 31)+((this.genderRate == null)? 0 :this.genderRate.hashCode()));
        result = ((result* 31)+((this.habitat == null)? 0 :this.habitat.hashCode()));
        result = ((result* 31)+((this.color == null)? 0 :this.color.hashCode()));
        result = ((result* 31)+((this.baseHappiness == null)? 0 :this.baseHappiness.hashCode()));
        result = ((result* 31)+((this.pokedexNumbers == null)? 0 :this.pokedexNumbers.hashCode()));
        result = ((result* 31)+((this.growthRate == null)? 0 :this.growthRate.hashCode()));
        result = ((result* 31)+((this.hatchCounter == null)? 0 :this.hatchCounter.hashCode()));
        result = ((result* 31)+((this.formDescriptions == null)? 0 :this.formDescriptions.hashCode()));
        result = ((result* 31)+((this.evolvesFromSpecies == null)? 0 :this.evolvesFromSpecies.hashCode()));
        result = ((result* 31)+((this.flavorTextEntries == null)? 0 :this.flavorTextEntries.hashCode()));
        result = ((result* 31)+((this.isLegendary == null)? 0 :this.isLegendary.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.order == null)? 0 :this.order.hashCode()));
        result = ((result* 31)+((this.generation == null)? 0 :this.generation.hashCode()));
        result = ((result* 31)+((this.eggGroups == null)? 0 :this.eggGroups.hashCode()));
        result = ((result* 31)+((this.shape == null)? 0 :this.shape.hashCode()));
        result = ((result* 31)+((this.hasGenderDifferences == null)? 0 :this.hasGenderDifferences.hashCode()));
        result = ((result* 31)+((this.isMythical == null)? 0 :this.isMythical.hashCode()));
        result = ((result* 31)+((this.formsSwitchable == null)? 0 :this.formsSwitchable.hashCode()));
        result = ((result* 31)+((this.palParkEncounters == null)? 0 :this.palParkEncounters.hashCode()));
        result = ((result* 31)+((this.captureRate == null)? 0 :this.captureRate.hashCode()));
        result = ((result* 31)+((this.names == null)? 0 :this.names.hashCode()));
        result = ((result* 31)+((this.varieties == null)? 0 :this.varieties.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.evolutionChain == null)? 0 :this.evolutionChain.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Index) == false) {
            return false;
        }
        Index rhs = ((Index) other);
        return (((((((((((((((((((((((((((((this.isBaby == rhs.isBaby)||((this.isBaby!= null)&&this.isBaby.equals(rhs.isBaby)))&&((this.genera == rhs.genera)||((this.genera!= null)&&this.genera.equals(rhs.genera))))&&((this.genderRate == rhs.genderRate)||((this.genderRate!= null)&&this.genderRate.equals(rhs.genderRate))))&&((this.habitat == rhs.habitat)||((this.habitat!= null)&&this.habitat.equals(rhs.habitat))))&&((this.color == rhs.color)||((this.color!= null)&&this.color.equals(rhs.color))))&&((this.baseHappiness == rhs.baseHappiness)||((this.baseHappiness!= null)&&this.baseHappiness.equals(rhs.baseHappiness))))&&((this.pokedexNumbers == rhs.pokedexNumbers)||((this.pokedexNumbers!= null)&&this.pokedexNumbers.equals(rhs.pokedexNumbers))))&&((this.growthRate == rhs.growthRate)||((this.growthRate!= null)&&this.growthRate.equals(rhs.growthRate))))&&((this.hatchCounter == rhs.hatchCounter)||((this.hatchCounter!= null)&&this.hatchCounter.equals(rhs.hatchCounter))))&&((this.formDescriptions == rhs.formDescriptions)||((this.formDescriptions!= null)&&this.formDescriptions.equals(rhs.formDescriptions))))&&((this.evolvesFromSpecies == rhs.evolvesFromSpecies)||((this.evolvesFromSpecies!= null)&&this.evolvesFromSpecies.equals(rhs.evolvesFromSpecies))))&&((this.flavorTextEntries == rhs.flavorTextEntries)||((this.flavorTextEntries!= null)&&this.flavorTextEntries.equals(rhs.flavorTextEntries))))&&((this.isLegendary == rhs.isLegendary)||((this.isLegendary!= null)&&this.isLegendary.equals(rhs.isLegendary))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.order == rhs.order)||((this.order!= null)&&this.order.equals(rhs.order))))&&((this.generation == rhs.generation)||((this.generation!= null)&&this.generation.equals(rhs.generation))))&&((this.eggGroups == rhs.eggGroups)||((this.eggGroups!= null)&&this.eggGroups.equals(rhs.eggGroups))))&&((this.shape == rhs.shape)||((this.shape!= null)&&this.shape.equals(rhs.shape))))&&((this.hasGenderDifferences == rhs.hasGenderDifferences)||((this.hasGenderDifferences!= null)&&this.hasGenderDifferences.equals(rhs.hasGenderDifferences))))&&((this.isMythical == rhs.isMythical)||((this.isMythical!= null)&&this.isMythical.equals(rhs.isMythical))))&&((this.formsSwitchable == rhs.formsSwitchable)||((this.formsSwitchable!= null)&&this.formsSwitchable.equals(rhs.formsSwitchable))))&&((this.palParkEncounters == rhs.palParkEncounters)||((this.palParkEncounters!= null)&&this.palParkEncounters.equals(rhs.palParkEncounters))))&&((this.captureRate == rhs.captureRate)||((this.captureRate!= null)&&this.captureRate.equals(rhs.captureRate))))&&((this.names == rhs.names)||((this.names!= null)&&this.names.equals(rhs.names))))&&((this.varieties == rhs.varieties)||((this.varieties!= null)&&this.varieties.equals(rhs.varieties))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.evolutionChain == rhs.evolutionChain)||((this.evolutionChain!= null)&&this.evolutionChain.equals(rhs.evolutionChain))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
