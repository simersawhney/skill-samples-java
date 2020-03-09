
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
    "meta",
    "panes",
    "links"
})
public class Showcustomerreconciliations {

    @JsonProperty("meta")
    private Meta meta;
    @JsonProperty("panes")
    private Panes panes;
    @JsonProperty("links")
    private Links__ links;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Showcustomerreconciliations() {
    }

    /**
     * 
     * @param panes
     * @param meta
     * @param links
     */
    public Showcustomerreconciliations(Meta meta, Panes panes, Links__ links) {
        this.meta = meta;
        this.panes = panes;
        this.links = links;
    }

    /**
     * 
     * @return
     *     The meta
     */
    @JsonProperty("meta")
    public Meta getMeta() {
        return meta;
    }

    /**
     * 
     * @param meta
     *     The meta
     */
    @JsonProperty("meta")
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    /**
     * 
     * @return
     *     The panes
     */
    @JsonProperty("panes")
    public Panes getPanes() {
        return panes;
    }

    /**
     * 
     * @param panes
     *     The panes
     */
    @JsonProperty("panes")
    public void setPanes(Panes panes) {
        this.panes = panes;
    }

    /**
     * 
     * @return
     *     The links
     */
    @JsonProperty("links")
    public Links__ getLinks() {
        return links;
    }

    /**
     * 
     * @param links
     *     The links
     */
    @JsonProperty("links")
    public void setLinks(Links__ links) {
        this.links = links;
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
        return new HashCodeBuilder().append(meta).append(panes).append(links).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Showcustomerreconciliations) == false) {
            return false;
        }
        Showcustomerreconciliations rhs = ((Showcustomerreconciliations) other);
        return new EqualsBuilder().append(meta, rhs.meta).append(panes, rhs.panes).append(links, rhs.links).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
