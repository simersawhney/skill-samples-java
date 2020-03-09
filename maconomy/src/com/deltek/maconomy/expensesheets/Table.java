
package com.deltek.maconomy.expensesheets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "records",
    "links"
})
public class Table {

    @JsonProperty("meta")
    private Meta___ meta;
    @JsonProperty("records")
    private List<Record_> records = new ArrayList<Record_>();
    @JsonProperty("links")
    private Links___ links;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Table() {
    }

    /**
     * 
     * @param records
     * @param meta
     * @param links
     */
    public Table(Meta___ meta, List<Record_> records, Links___ links) {
        this.meta = meta;
        this.records = records;
        this.links = links;
    }

    /**
     * 
     * @return
     *     The meta
     */
    @JsonProperty("meta")
    public Meta___ getMeta() {
        return meta;
    }

    /**
     * 
     * @param meta
     *     The meta
     */
    @JsonProperty("meta")
    public void setMeta(Meta___ meta) {
        this.meta = meta;
    }

    /**
     * 
     * @return
     *     The records
     */
    @JsonProperty("records")
    public List<Record_> getRecords() {
        return records;
    }

    /**
     * 
     * @param records
     *     The records
     */
    @JsonProperty("records")
    public void setRecords(List<Record_> records) {
        this.records = records;
    }

    /**
     * 
     * @return
     *     The links
     */
    @JsonProperty("links")
    public Links___ getLinks() {
        return links;
    }

    /**
     * 
     * @param links
     *     The links
     */
    @JsonProperty("links")
    public void setLinks(Links___ links) {
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
        return new HashCodeBuilder().append(meta).append(records).append(links).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Table) == false) {
            return false;
        }
        Table rhs = ((Table) other);
        return new EqualsBuilder().append(meta, rhs.meta).append(records, rhs.records).append(links, rhs.links).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
