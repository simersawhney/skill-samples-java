
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
    "card",
    "table"
})
public class Panes {

    @JsonProperty("card")
    private Card card;
    @JsonProperty("table")
    private Table table;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Panes() {
    }

    /**
     * 
     * @param card
     * @param table
     */
    public Panes(Card card, Table table) {
        this.card = card;
        this.table = table;
    }

    /**
     * 
     * @return
     *     The card
     */
    @JsonProperty("card")
    public Card getCard() {
        return card;
    }

    /**
     * 
     * @param card
     *     The card
     */
    @JsonProperty("card")
    public void setCard(Card card) {
        this.card = card;
    }

    /**
     * 
     * @return
     *     The table
     */
    @JsonProperty("table")
    public Table getTable() {
        return table;
    }

    /**
     * 
     * @param table
     *     The table
     */
    @JsonProperty("table")
    public void setTable(Table table) {
        this.table = table;
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
        return new HashCodeBuilder().append(card).append(table).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Panes) == false) {
            return false;
        }
        Panes rhs = ((Panes) other);
        return new EqualsBuilder().append(card, rhs.card).append(table, rhs.table).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
