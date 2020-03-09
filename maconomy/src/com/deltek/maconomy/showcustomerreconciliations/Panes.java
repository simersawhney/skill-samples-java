
package com.deltek.maconomy.showcustomerreconciliations;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "filter"
})
public class Panes {

    @JsonProperty("filter")
    private Filter filter;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Panes() {
    }

    /**
     * 
     * @param filter
     */
    public Panes(Filter filter) {
        this.filter = filter;
    }

    /**
     * 
     * @return
     *     The filter
     */
    @JsonProperty("filter")
    public Filter getFilter() {
        return filter;
    }

    /**
     * 
     * @param filter
     *     The filter
     */
    @JsonProperty("filter")
    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
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
    public int hashCode() {
        return new HashCodeBuilder().append(filter).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Panes) == false) {
            return false;
        }
        Panes rhs = ((Panes) other);
        return new EqualsBuilder().append(filter, rhs.filter).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
