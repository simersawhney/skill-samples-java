
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
    "paneName",
    "concurrencyControl",
    "rowCount",
    "rowOffset"
})
public class Meta_ {

    @JsonProperty("paneName")
    private String paneName;
    @JsonProperty("concurrencyControl")
    private String concurrencyControl;
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
     * @param concurrencyControl
     * @param paneName
     * @param rowCount
     */
    public Meta_(String paneName, String concurrencyControl, Integer rowCount, Integer rowOffset) {
        this.paneName = paneName;
        this.concurrencyControl = concurrencyControl;
        this.rowCount = rowCount;
        this.rowOffset = rowOffset;
    }

    /**
     * 
     * @return
     *     The paneName
     */
    @JsonProperty("paneName")
    public String getPaneName() {
        return paneName;
    }

    /**
     * 
     * @param paneName
     *     The paneName
     */
    @JsonProperty("paneName")
    public void setPaneName(String paneName) {
        this.paneName = paneName;
    }

    /**
     * 
     * @return
     *     The concurrencyControl
     */
    @JsonProperty("concurrencyControl")
    public String getConcurrencyControl() {
        return concurrencyControl;
    }

    /**
     * 
     * @param concurrencyControl
     *     The concurrencyControl
     */
    @JsonProperty("concurrencyControl")
    public void setConcurrencyControl(String concurrencyControl) {
        this.concurrencyControl = concurrencyControl;
    }

    /**
     * 
     * @return
     *     The rowCount
     */
    @JsonProperty("rowCount")
    public Integer getRowCount() {
        return rowCount;
    }

    /**
     * 
     * @param rowCount
     *     The rowCount
     */
    @JsonProperty("rowCount")
    public void setRowCount(Integer rowCount) {
        this.rowCount = rowCount;
    }

    /**
     * 
     * @return
     *     The rowOffset
     */
    @JsonProperty("rowOffset")
    public Integer getRowOffset() {
        return rowOffset;
    }

    /**
     * 
     * @param rowOffset
     *     The rowOffset
     */
    @JsonProperty("rowOffset")
    public void setRowOffset(Integer rowOffset) {
        this.rowOffset = rowOffset;
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
        return new HashCodeBuilder().append(paneName).append(concurrencyControl).append(rowCount).append(rowOffset).append(additionalProperties).toHashCode();
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
        return new EqualsBuilder().append(paneName, rhs.paneName).append(concurrencyControl, rhs.concurrencyControl).append(rowCount, rhs.rowCount).append(rowOffset, rhs.rowOffset).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
