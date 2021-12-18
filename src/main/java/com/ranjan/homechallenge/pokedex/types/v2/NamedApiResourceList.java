
package com.ranjan.homechallenge.pokedex.types.v2;

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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "count",
    "next",
    "previous",
    "results"
})
@Generated("jsonschema2pojo")
public class NamedApiResourceList {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("count")
    private Integer count;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("next")
    private String next;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("previous")
    private String previous;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("results")
    private List<NamedApiResource> results = new ArrayList<NamedApiResource>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("count")
    public Integer getCount() {
        return count;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("count")
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("next")
    public String getNext() {
        return next;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("next")
    public void setNext(String next) {
        this.next = next;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("previous")
    public String getPrevious() {
        return previous;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("previous")
    public void setPrevious(String previous) {
        this.previous = previous;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("results")
    public List<NamedApiResource> getResults() {
        return results;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("results")
    public void setResults(List<NamedApiResource> results) {
        this.results = results;
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
        sb.append(NamedApiResourceList.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("count");
        sb.append('=');
        sb.append(((this.count == null)?"<null>":this.count));
        sb.append(',');
        sb.append("next");
        sb.append('=');
        sb.append(((this.next == null)?"<null>":this.next));
        sb.append(',');
        sb.append("previous");
        sb.append('=');
        sb.append(((this.previous == null)?"<null>":this.previous));
        sb.append(',');
        sb.append("results");
        sb.append('=');
        sb.append(((this.results == null)?"<null>":this.results));
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
        result = ((result* 31)+((this.count == null)? 0 :this.count.hashCode()));
        result = ((result* 31)+((this.next == null)? 0 :this.next.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.previous == null)? 0 :this.previous.hashCode()));
        result = ((result* 31)+((this.results == null)? 0 :this.results.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NamedApiResourceList) == false) {
            return false;
        }
        NamedApiResourceList rhs = ((NamedApiResourceList) other);
        return ((((((this.count == rhs.count)||((this.count!= null)&&this.count.equals(rhs.count)))&&((this.next == rhs.next)||((this.next!= null)&&this.next.equals(rhs.next))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.previous == rhs.previous)||((this.previous!= null)&&this.previous.equals(rhs.previous))))&&((this.results == rhs.results)||((this.results!= null)&&this.results.equals(rhs.results))));
    }

}
