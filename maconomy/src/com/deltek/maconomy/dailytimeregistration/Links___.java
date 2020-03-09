
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
    "action:add",
    "action:create"
})
public class Links___ {

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
    public Links___() {
    }

    /**
     * 
     * @param actionCreate
     * @param actionAdd
     */
    public Links___(ActionAdd actionAdd, ActionCreate_ actionCreate) {
        this.actionAdd = actionAdd;
        this.actionCreate = actionCreate;
    }

    /**
     * 
     * @return
     *     The actionAdd
     */
    @JsonProperty("action:add")
    public ActionAdd getActionAdd() {
        return actionAdd;
    }

    /**
     * 
     * @param actionAdd
     *     The action:add
     */
    @JsonProperty("action:add")
    public void setActionAdd(ActionAdd actionAdd) {
        this.actionAdd = actionAdd;
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
        return new HashCodeBuilder().append(actionAdd).append(actionCreate).append(additionalProperties).toHashCode();
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
        return new EqualsBuilder().append(actionAdd, rhs.actionAdd).append(actionCreate, rhs.actionCreate).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
