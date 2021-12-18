
package com.ranjan.homechallenge.pokedex.types.v2.pokemon_species.$id;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.ranjan.homechallenge.pokedex.types.v2.NamedApiResource;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "genus",
    "language"
})
@Generated("jsonschema2pojo")
public class Genera {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("genus")
    private String genus;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("language")
    private NamedApiResource language;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("genus")
    public String getGenus() {
        return genus;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("genus")
    public void setGenus(String genus) {
        this.genus = genus;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("language")
    public NamedApiResource getLanguage() {
        return language;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("language")
    public void setLanguage(NamedApiResource language) {
        this.language = language;
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
        sb.append(Genera.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("genus");
        sb.append('=');
        sb.append(((this.genus == null)?"<null>":this.genus));
        sb.append(',');
        sb.append("language");
        sb.append('=');
        sb.append(((this.language == null)?"<null>":this.language));
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
        result = ((result* 31)+((this.language == null)? 0 :this.language.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.genus == null)? 0 :this.genus.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Genera) == false) {
            return false;
        }
        Genera rhs = ((Genera) other);
        return ((((this.language == rhs.language)||((this.language!= null)&&this.language.equals(rhs.language)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.genus == rhs.genus)||((this.genus!= null)&&this.genus.equals(rhs.genus))));
    }

}
