
package com.deltek.maconomy.expense;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.ws.rs.ext.Provider;

@Provider
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "meta",
    "panes",
    "links"
})
public class ExpenseSheets {

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
    public ExpenseSheets() {
    }

    /**
     * 
     * @param links
     * @param meta
     * @param panes
     */
    public ExpenseSheets(Meta meta, Panes panes, Links____ links) {
        super();
        this.meta = meta;
        this.panes = panes;
        this.links = links;
    }

    @JsonProperty("meta")
    public Meta getMeta() {
        return meta;
    }

    @JsonProperty("meta")
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    @JsonProperty("panes")
    public Panes getPanes() {
        return panes;
    }

    @JsonProperty("panes")
    public void setPanes(Panes panes) {
        this.panes = panes;
    }

    @JsonProperty("links")
    public Links____ getLinks() {
        return links;
    }

    @JsonProperty("links")
    public void setLinks(Links____ links) {
        this.links = links;
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
        return new ToStringBuilder(this).append("meta", meta).append("panes", panes).append("links", links).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(links).append(meta).append(panes).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExpenseSheets) == false) {
            return false;
        }
        ExpenseSheets rhs = ((ExpenseSheets) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(links, rhs.links).append(meta, rhs.meta).append(panes, rhs.panes).isEquals();
    }

}
