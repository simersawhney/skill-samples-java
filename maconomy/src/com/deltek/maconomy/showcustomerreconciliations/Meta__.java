
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
    "rowNumber"
})
public class Meta__ {

    @JsonProperty("rowNumber")
    private Integer rowNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Meta__() {
    }

    /**
     * 
     * @param rowNumber
     */
    public Meta__(Integer rowNumber) {
        this.rowNumber = rowNumber;
    }

    /**
     * 
     * @return
     *     The rowNumber
     */
    @JsonProperty("rowNumber")
    public Integer getRowNumber() {
        return rowNumber;
    }

    /**
     * 
     * @param rowNumber
     *     The rowNumber
     */
    @JsonProperty("rowNumber")
    public void setRowNumber(Integer rowNumber) {
        this.rowNumber = rowNumber;
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
        return new HashCodeBuilder().append(rowNumber).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Meta__) == false) {
            return false;
        }
        Meta__ rhs = ((Meta__) other);
        return new EqualsBuilder().append(rowNumber, rhs.rowNumber).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
