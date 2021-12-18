
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
    "area",
    "base_score",
    "rate"
})
@Generated("jsonschema2pojo")
public class PalParkEncounter {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("area")
    private NamedApiResource area;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("base_score")
    private Integer baseScore;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("rate")
    private Integer rate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("area")
    public NamedApiResource getArea() {
        return area;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("area")
    public void setArea(NamedApiResource area) {
        this.area = area;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("base_score")
    public Integer getBaseScore() {
        return baseScore;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("base_score")
    public void setBaseScore(Integer baseScore) {
        this.baseScore = baseScore;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("rate")
    public Integer getRate() {
        return rate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("rate")
    public void setRate(Integer rate) {
        this.rate = rate;
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
        sb.append(PalParkEncounter.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("area");
        sb.append('=');
        sb.append(((this.area == null)?"<null>":this.area));
        sb.append(',');
        sb.append("baseScore");
        sb.append('=');
        sb.append(((this.baseScore == null)?"<null>":this.baseScore));
        sb.append(',');
        sb.append("rate");
        sb.append('=');
        sb.append(((this.rate == null)?"<null>":this.rate));
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
        result = ((result* 31)+((this.area == null)? 0 :this.area.hashCode()));
        result = ((result* 31)+((this.baseScore == null)? 0 :this.baseScore.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.rate == null)? 0 :this.rate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PalParkEncounter) == false) {
            return false;
        }
        PalParkEncounter rhs = ((PalParkEncounter) other);
        return (((((this.area == rhs.area)||((this.area!= null)&&this.area.equals(rhs.area)))&&((this.baseScore == rhs.baseScore)||((this.baseScore!= null)&&this.baseScore.equals(rhs.baseScore))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.rate == rhs.rate)||((this.rate!= null)&&this.rate.equals(rhs.rate))));
    }

}
