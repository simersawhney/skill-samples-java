
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
    "action:insert",
    "action:create"
})
public class Links___ {

    @JsonProperty("action:insert")
    private ActionInsert__ actionInsert;
    @JsonProperty("action:create")
    private ActionCreate___ actionCreate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Links___() {
    }

    /**
     * 
     * @param actionInsert
     * @param actionCreate
     */
    public Links___(ActionInsert__ actionInsert, ActionCreate___ actionCreate) {
        super();
        this.actionInsert = actionInsert;
        this.actionCreate = actionCreate;
    }

    @JsonProperty("action:insert")
    public ActionInsert__ getActionInsert() {
        return actionInsert;
    }

    @JsonProperty("action:insert")
    public void setActionInsert(ActionInsert__ actionInsert) {
        this.actionInsert = actionInsert;
    }

    @JsonProperty("action:create")
    public ActionCreate___ getActionCreate() {
        return actionCreate;
    }

    @JsonProperty("action:create")
    public void setActionCreate(ActionCreate___ actionCreate) {
        this.actionCreate = actionCreate;
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
        return new ToStringBuilder(this).append("actionInsert", actionInsert).append("actionCreate", actionCreate).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(actionInsert).append(actionCreate).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Links___) == false) {
            return false;
        }
        Links___ rhs = ((Links___) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(actionInsert, rhs.actionInsert).append(actionCreate, rhs.actionCreate).isEquals();
    }

}
