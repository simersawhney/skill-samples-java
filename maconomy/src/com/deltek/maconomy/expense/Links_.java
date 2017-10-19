
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
    "action:add",
    "action:create"
})
public class Links_ {

    @JsonProperty("action:add")
    private ActionAdd actionAdd;
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
     * @param actionAdd
     * @param actionCreate
     */
    public Links_(ActionAdd actionAdd, ActionCreate_ actionCreate) {
        super();
        this.actionAdd = actionAdd;
        this.actionCreate = actionCreate;
    }

    @JsonProperty("action:add")
    public ActionAdd getActionAdd() {
        return actionAdd;
    }

    @JsonProperty("action:add")
    public void setActionAdd(ActionAdd actionAdd) {
        this.actionAdd = actionAdd;
    }

    @JsonProperty("action:create")
    public ActionCreate_ getActionCreate() {
        return actionCreate;
    }

    @JsonProperty("action:create")
    public void setActionCreate(ActionCreate_ actionCreate) {
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
        return new ToStringBuilder(this).append("actionAdd", actionAdd).append("actionCreate", actionCreate).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(actionAdd).append(actionCreate).toHashCode();
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
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(actionAdd, rhs.actionAdd).append(actionCreate, rhs.actionCreate).isEquals();
    }

}
