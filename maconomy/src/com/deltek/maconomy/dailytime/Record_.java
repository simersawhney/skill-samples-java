
package com.deltek.maconomy.dailytime;

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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "meta",
    "data",
    "links"
})
public class Record_ {

    @JsonProperty("meta")
    private Meta____ meta;
    @JsonProperty("data")
    private Data_ data;
    @JsonProperty("links")
    private Links__ links;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Record_() {
    }

    /**
     * 
     * @param data
     * @param links
     * @param meta
     */
    public Record_(Meta____ meta, Data_ data, Links__ links) {
        super();
        this.meta = meta;
        this.data = data;
        this.links = links;
    }

    @JsonProperty("meta")
    public Meta____ getMeta() {
        return meta;
    }

    @JsonProperty("meta")
    public void setMeta(Meta____ meta) {
        this.meta = meta;
    }

    @JsonProperty("data")
    public Data_ getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(Data_ data) {
        this.data = data;
    }

    @JsonProperty("links")
    public Links__ getLinks() {
        return links;
    }

    @JsonProperty("links")
    public void setLinks(Links__ links) {
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
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(data).append(links).append(meta).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Record_) == false) {
            return false;
        }
        Record_ rhs = ((Record_) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(data, rhs.data).append(links, rhs.links).append(meta, rhs.meta).isEquals();
    }

}
