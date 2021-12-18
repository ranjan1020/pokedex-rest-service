
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
    "entry_number",
    "pokedex"
})
@Generated("jsonschema2pojo")
public class PokedexNumber {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("entry_number")
    private Integer entryNumber;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pokedex")
    private NamedApiResource pokedex;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("entry_number")
    public Integer getEntryNumber() {
        return entryNumber;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("entry_number")
    public void setEntryNumber(Integer entryNumber) {
        this.entryNumber = entryNumber;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pokedex")
    public NamedApiResource getPokedex() {
        return pokedex;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pokedex")
    public void setPokedex(NamedApiResource pokedex) {
        this.pokedex = pokedex;
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
        sb.append(PokedexNumber.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("entryNumber");
        sb.append('=');
        sb.append(((this.entryNumber == null)?"<null>":this.entryNumber));
        sb.append(',');
        sb.append("pokedex");
        sb.append('=');
        sb.append(((this.pokedex == null)?"<null>":this.pokedex));
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
        result = ((result* 31)+((this.pokedex == null)? 0 :this.pokedex.hashCode()));
        result = ((result* 31)+((this.entryNumber == null)? 0 :this.entryNumber.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PokedexNumber) == false) {
            return false;
        }
        PokedexNumber rhs = ((PokedexNumber) other);
        return ((((this.pokedex == rhs.pokedex)||((this.pokedex!= null)&&this.pokedex.equals(rhs.pokedex)))&&((this.entryNumber == rhs.entryNumber)||((this.entryNumber!= null)&&this.entryNumber.equals(rhs.entryNumber))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
