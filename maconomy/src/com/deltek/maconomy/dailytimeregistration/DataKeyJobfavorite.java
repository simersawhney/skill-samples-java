
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
    "rel",
    "template"
})
public class DataKeyJobfavorite {

    @JsonProperty("rel")
    private String rel;
    @JsonProperty("template")
    private String template;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public DataKeyJobfavorite() {
    }

    /**
     * 
     * @param template
     * @param rel
     */
    public DataKeyJobfavorite(String rel, String template) {
        this.rel = rel;
        this.template = template;
    }

    /**
     * 
     * @return
     *     The rel
     */
    @JsonProperty("rel")
    public String getRel() {
        return rel;
    }

    /**
     * 
     * @param rel
     *     The rel
     */
    @JsonProperty("rel")
    public void setRel(String rel) {
        this.rel = rel;
    }

    /**
     * 
     * @return
     *     The template
     */
    @JsonProperty("template")
    public String getTemplate() {
        return template;
    }

    /**
     * 
     * @param template
     *     The template
     */
    @JsonProperty("template")
    public void setTemplate(String template) {
        this.template = template;
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
        return new HashCodeBuilder().append(rel).append(template).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DataKeyJobfavorite) == false) {
            return false;
        }
        DataKeyJobfavorite rhs = ((DataKeyJobfavorite) other);
        return new EqualsBuilder().append(rel, rhs.rel).append(template, rhs.template).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
