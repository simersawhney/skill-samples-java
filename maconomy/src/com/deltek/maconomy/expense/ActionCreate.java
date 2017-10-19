
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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "href",
    "rel"
})
public class ActionCreate {

    @JsonProperty("href")
    private String href;
    @JsonProperty("rel")
    private String rel;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ActionCreate() {
    }

    /**
     * 
     * @param rel
     * @param href
     */
    public ActionCreate(String href, String rel) {
        super();
        this.href = href;
        this.rel = rel;
    }

    @JsonProperty("href")
    public String getHref() {
        return href;
    }

    @JsonProperty("href")
    public void setHref(String href) {
        this.href = href;
    }

    @JsonProperty("rel")
    public String getRel() {
        return rel;
    }

    @JsonProperty("rel")
    public void setRel(String rel) {
        this.rel = rel;
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
        return new ToStringBuilder(this).append("href", href).append("rel", rel).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(rel).append(href).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ActionCreate) == false) {
            return false;
        }
        ActionCreate rhs = ((ActionCreate) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(rel, rhs.rel).append(href, rhs.href).isEquals();
    }

}
