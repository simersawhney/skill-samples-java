
package com.deltek.maconomy.dailytimeregistration;

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
     * @param meta
     * @param links
     */
    public Record_(Meta____ meta, Data_ data, Links__ links) {
        this.meta = meta;
        this.data = data;
        this.links = links;
    }

    /**
     * 
     * @return
     *     The meta
     */
    @JsonProperty("meta")
    public Meta____ getMeta() {
        return meta;
    }

    /**
     * 
     * @param meta
     *     The meta
     */
    @JsonProperty("meta")
    public void setMeta(Meta____ meta) {
        this.meta = meta;
    }

    /**
     * 
     * @return
     *     The data
     */
    @JsonProperty("data")
    public Data_ getData() {
        return data;
    }

    /**
     * 
     * @param data
     *     The data
     */
    @JsonProperty("data")
    public void setData(Data_ data) {
        this.data = data;
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
        return new HashCodeBuilder().append(meta).append(data).append(links).append(additionalProperties).toHashCode();
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
        return new EqualsBuilder().append(meta, rhs.meta).append(data, rhs.data).append(links, rhs.links).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
