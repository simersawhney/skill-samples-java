
package com.deltek.maconomy.expense;

import java.util.HashMap;
import java.util.List;
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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "meta",
    "records",
    "links"
})
public class Card {

    @JsonProperty("meta")
    private Meta___ meta;
    @JsonProperty("records")
    private List<Record_> records = null;
    @JsonProperty("links")
    private Links___ links;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Card() {
    }

    /**
     * 
     * @param links
     * @param records
     * @param meta
     */
    public Card(Meta___ meta, List<Record_> records, Links___ links) {
        super();
        this.meta = meta;
        this.records = records;
        this.links = links;
    }

    @JsonProperty("meta")
    public Meta___ getMeta() {
        return meta;
    }

    @JsonProperty("meta")
    public void setMeta(Meta___ meta) {
        this.meta = meta;
    }

    @JsonProperty("records")
    public List<Record_> getRecords() {
        return records;
    }

    @JsonProperty("records")
    public void setRecords(List<Record_> records) {
        this.records = records;
    }

    @JsonProperty("links")
    public Links___ getLinks() {
        return links;
    }

    @JsonProperty("links")
    public void setLinks(Links___ links) {
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
        return new ToStringBuilder(this).append("meta", meta).append("records", records).append("links", links).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(links).append(records).append(meta).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Card) == false) {
            return false;
        }
        Card rhs = ((Card) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(links, rhs.links).append(records, rhs.records).append(meta, rhs.meta).isEquals();
    }

}
