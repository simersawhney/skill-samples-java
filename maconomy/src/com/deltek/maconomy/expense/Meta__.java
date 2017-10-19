
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
    "rowNumber",
    "concurrencyControl"
})
public class Meta__ {

    @JsonProperty("rowNumber")
    private Integer rowNumber;
    @JsonProperty("concurrencyControl")
    private String concurrencyControl;
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
     * @param concurrencyControl
     * @param rowNumber
     */
    public Meta__(Integer rowNumber, String concurrencyControl) {
        super();
        this.rowNumber = rowNumber;
        this.concurrencyControl = concurrencyControl;
    }

    @JsonProperty("rowNumber")
    public Integer getRowNumber() {
        return rowNumber;
    }

    @JsonProperty("rowNumber")
    public void setRowNumber(Integer rowNumber) {
        this.rowNumber = rowNumber;
    }

    @JsonProperty("concurrencyControl")
    public String getConcurrencyControl() {
        return concurrencyControl;
    }

    @JsonProperty("concurrencyControl")
    public void setConcurrencyControl(String concurrencyControl) {
        this.concurrencyControl = concurrencyControl;
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
        return new ToStringBuilder(this).append("rowNumber", rowNumber).append("concurrencyControl", concurrencyControl).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(concurrencyControl).append(additionalProperties).append(rowNumber).toHashCode();
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
        return new EqualsBuilder().append(concurrencyControl, rhs.concurrencyControl).append(additionalProperties, rhs.additionalProperties).append(rowNumber, rhs.rowNumber).isEquals();
    }

}
