
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
    "is_default",
    "pokemon"
})
@Generated("jsonschema2pojo")
public class Variety {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("is_default")
    private Boolean isDefault;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pokemon")
    private NamedApiResource pokemon;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("is_default")
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("is_default")
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pokemon")
    public NamedApiResource getPokemon() {
        return pokemon;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pokemon")
    public void setPokemon(NamedApiResource pokemon) {
        this.pokemon = pokemon;
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
        sb.append(Variety.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("isDefault");
        sb.append('=');
        sb.append(((this.isDefault == null)?"<null>":this.isDefault));
        sb.append(',');
        sb.append("pokemon");
        sb.append('=');
        sb.append(((this.pokemon == null)?"<null>":this.pokemon));
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
        result = ((result* 31)+((this.isDefault == null)? 0 :this.isDefault.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.pokemon == null)? 0 :this.pokemon.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Variety) == false) {
            return false;
        }
        Variety rhs = ((Variety) other);
        return ((((this.isDefault == rhs.isDefault)||((this.isDefault!= null)&&this.isDefault.equals(rhs.isDefault)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.pokemon == rhs.pokemon)||((this.pokemon!= null)&&this.pokemon.equals(rhs.pokemon))));
    }

}
