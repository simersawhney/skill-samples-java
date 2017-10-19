
package com.deltek.maconomy.customerentry;

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
    "paneName",
    "rowCount",
    "rowOffset"
})
public class Meta_ {

    @JsonProperty("paneName")
    private String paneName;
    @JsonProperty("rowCount")
    private Integer rowCount;
    @JsonProperty("rowOffset")
    private Integer rowOffset;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Meta_() {
    }

    /**
     * 
     * @param rowOffset
     * @param rowCount
     * @param paneName
     */
    public Meta_(String paneName, Integer rowCount, Integer rowOffset) {
        super();
        this.paneName = paneName;
        this.rowCount = rowCount;
        this.rowOffset = rowOffset;
    }

    @JsonProperty("paneName")
    public String getPaneName() {
        return paneName;
    }

    @JsonProperty("paneName")
    public void setPaneName(String paneName) {
        this.paneName = paneName;
    }

    @JsonProperty("rowCount")
    public Integer getRowCount() {
        return rowCount;
    }

    @JsonProperty("rowCount")
    public void setRowCount(Integer rowCount) {
        this.rowCount = rowCount;
    }

    @JsonProperty("rowOffset")
    public Integer getRowOffset() {
        return rowOffset;
    }

    @JsonProperty("rowOffset")
    public void setRowOffset(Integer rowOffset) {
        this.rowOffset = rowOffset;
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
        return new ToStringBuilder(this).append("paneName", paneName).append("rowCount", rowCount).append("rowOffset", rowOffset).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(rowOffset).append(rowCount).append(paneName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Meta_) == false) {
            return false;
        }
        Meta_ rhs = ((Meta_) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(rowOffset, rhs.rowOffset).append(rowCount, rhs.rowCount).append(paneName, rhs.paneName).isEquals();
    }

}
