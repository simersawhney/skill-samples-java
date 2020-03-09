
package com.deltek.maconomy.expensesheets;

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
public class Expensesheets {

    @JsonProperty("meta")
    private Meta meta;
    @JsonProperty("panes")
    private Panes panes;
    @JsonProperty("links")
    private Links____ links;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Expensesheets() {
    }

    /**
     * 
     * @param panes
     * @param meta
     * @param links
     */
    public Expensesheets(Meta meta, Panes panes, Links____ links) {
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
    public Links____ getLinks() {
        return links;
    }

    /**
     * 
     * @param links
     *     The links
     */
    @JsonProperty("links")
    public void setLinks(Links____ links) {
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
        if ((other instanceof Expensesheets) == false) {
            return false;
        }
        Expensesheets rhs = ((Expensesheets) other);
        return new EqualsBuilder().append(meta, rhs.meta).append(panes, rhs.panes).append(links, rhs.links).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
