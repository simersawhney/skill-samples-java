
package com.deltek.maconomy.expensesheets;

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
    "action:insert",
    "action:create"
})
public class Links_ {

    @JsonProperty("action:insert")
    private ActionInsert_ actionInsert;
    @JsonProperty("action:create")
    private ActionCreate_ actionCreate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Links_() {
    }

    /**
     * 
     * @param actionInsert
     * @param actionCreate
     */
    public Links_(ActionInsert_ actionInsert, ActionCreate_ actionCreate) {
        this.actionInsert = actionInsert;
        this.actionCreate = actionCreate;
    }

    /**
     * 
     * @return
     *     The actionInsert
     */
    @JsonProperty("action:insert")
    public ActionInsert_ getActionInsert() {
        return actionInsert;
    }

    /**
     * 
     * @param actionInsert
     *     The action:insert
     */
    @JsonProperty("action:insert")
    public void setActionInsert(ActionInsert_ actionInsert) {
        this.actionInsert = actionInsert;
    }

    /**
     * 
     * @return
     *     The actionCreate
     */
    @JsonProperty("action:create")
    public ActionCreate_ getActionCreate() {
        return actionCreate;
    }

    /**
     * 
     * @param actionCreate
     *     The action:create
     */
    @JsonProperty("action:create")
    public void setActionCreate(ActionCreate_ actionCreate) {
        this.actionCreate = actionCreate;
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
        return new HashCodeBuilder().append(actionInsert).append(actionCreate).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Links_) == false) {
            return false;
        }
        Links_ rhs = ((Links_) other);
        return new EqualsBuilder().append(actionInsert, rhs.actionInsert).append(actionCreate, rhs.actionCreate).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
