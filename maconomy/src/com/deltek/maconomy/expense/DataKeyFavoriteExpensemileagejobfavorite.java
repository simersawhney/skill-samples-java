
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
    "template",
    "rel"
})
public class DataKeyFavoriteExpensemileagejobfavorite {

    @JsonProperty("template")
    private String template;
    @JsonProperty("rel")
    private String rel;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public DataKeyFavoriteExpensemileagejobfavorite() {
    }

    /**
     * 
     * @param template
     * @param rel
     */
    public DataKeyFavoriteExpensemileagejobfavorite(String template, String rel) {
        super();
        this.template = template;
        this.rel = rel;
    }

    @JsonProperty("template")
    public String getTemplate() {
        return template;
    }

    @JsonProperty("template")
    public void setTemplate(String template) {
        this.template = template;
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
        return new ToStringBuilder(this).append("template", template).append("rel", rel).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(template).append(additionalProperties).append(rel).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DataKeyFavoriteExpensemileagejobfavorite) == false) {
            return false;
        }
        DataKeyFavoriteExpensemileagejobfavorite rhs = ((DataKeyFavoriteExpensemileagejobfavorite) other);
        return new EqualsBuilder().append(template, rhs.template).append(additionalProperties, rhs.additionalProperties).append(rel, rhs.rel).isEquals();
    }

}
