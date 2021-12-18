
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
    "flavor_text",
    "language",
    "version"
})
@Generated("jsonschema2pojo")
public class FlavorTextEntry {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("flavor_text")
    private String flavorText;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("language")
    private NamedApiResource language;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("version")
    private NamedApiResource version;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("flavor_text")
    public String getFlavorText() {
        return flavorText;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("flavor_text")
    public void setFlavorText(String flavorText) {
        this.flavorText = flavorText;
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

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("version")
    public NamedApiResource getVersion() {
        return version;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("version")
    public void setVersion(NamedApiResource version) {
        this.version = version;
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
        sb.append(FlavorTextEntry.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("flavorText");
        sb.append('=');
        sb.append(((this.flavorText == null)?"<null>":this.flavorText));
        sb.append(',');
        sb.append("language");
        sb.append('=');
        sb.append(((this.language == null)?"<null>":this.language));
        sb.append(',');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
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
        result = ((result* 31)+((this.flavorText == null)? 0 :this.flavorText.hashCode()));
        result = ((result* 31)+((this.language == null)? 0 :this.language.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FlavorTextEntry) == false) {
            return false;
        }
        FlavorTextEntry rhs = ((FlavorTextEntry) other);
        return (((((this.flavorText == rhs.flavorText)||((this.flavorText!= null)&&this.flavorText.equals(rhs.flavorText)))&&((this.language == rhs.language)||((this.language!= null)&&this.language.equals(rhs.language))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))));
    }

}
