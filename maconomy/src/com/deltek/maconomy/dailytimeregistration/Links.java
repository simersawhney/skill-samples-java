
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
    "data:key:employeenumber_employee",
    "data:key:card_defaultjobheader",
    "data:key:card_employeenumber_employee",
    "data:key:card_dailytimesheetheader",
    "data:key:card_dailycheckinheader",
    "data:key:card_jobfavorite",
    "action:update",
    "action:copytimesheet",
    "action:actionsequence",
    "action:runreport",
    "action:emailonaction",
    "action:submittimesheet",
    "action:exportdataset",
    "action:printtimesheet",
    "action:submittimesheettemporarily"
})
public class Links {

    @JsonProperty("data:key:employeenumber_employee")
    private DataKeyEmployeenumberEmployee dataKeyEmployeenumberEmployee;
    @JsonProperty("data:key:card_defaultjobheader")
    private DataKeyCardDefaultjobheader dataKeyCardDefaultjobheader;
    @JsonProperty("data:key:card_employeenumber_employee")
    private DataKeyCardEmployeenumberEmployee dataKeyCardEmployeenumberEmployee;
    @JsonProperty("data:key:card_dailytimesheetheader")
    private DataKeyCardDailytimesheetheader dataKeyCardDailytimesheetheader;
    @JsonProperty("data:key:card_dailycheckinheader")
    private DataKeyCardDailycheckinheader dataKeyCardDailycheckinheader;
    @JsonProperty("data:key:card_jobfavorite")
    private DataKeyCardJobfavorite dataKeyCardJobfavorite;
    @JsonProperty("action:update")
    private ActionUpdate actionUpdate;
    @JsonProperty("action:copytimesheet")
    private ActionCopytimesheet actionCopytimesheet;
    @JsonProperty("action:actionsequence")
    private ActionActionsequence actionActionsequence;
    @JsonProperty("action:runreport")
    private ActionRunreport actionRunreport;
    @JsonProperty("action:emailonaction")
    private ActionEmailonaction actionEmailonaction;
    @JsonProperty("action:submittimesheet")
    private ActionSubmittimesheet actionSubmittimesheet;
    @JsonProperty("action:exportdataset")
    private ActionExportdataset actionExportdataset;
    @JsonProperty("action:printtimesheet")
    private ActionPrinttimesheet actionPrinttimesheet;
    @JsonProperty("action:submittimesheettemporarily")
    private ActionSubmittimesheettemporarily actionSubmittimesheettemporarily;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Links() {
    }

    /**
     * 
     * @param actionRunreport
     * @param actionSubmittimesheettemporarily
     * @param dataKeyCardDefaultjobheader
     * @param actionCopytimesheet
     * @param actionSubmittimesheet
     * @param dataKeyCardDailycheckinheader
     * @param actionPrinttimesheet
     * @param dataKeyCardDailytimesheetheader
     * @param dataKeyCardJobfavorite
     * @param actionUpdate
     * @param actionEmailonaction
     * @param actionActionsequence
     * @param actionExportdataset
     * @param dataKeyCardEmployeenumberEmployee
     * @param dataKeyEmployeenumberEmployee
     */
    public Links(DataKeyEmployeenumberEmployee dataKeyEmployeenumberEmployee, DataKeyCardDefaultjobheader dataKeyCardDefaultjobheader, DataKeyCardEmployeenumberEmployee dataKeyCardEmployeenumberEmployee, DataKeyCardDailytimesheetheader dataKeyCardDailytimesheetheader, DataKeyCardDailycheckinheader dataKeyCardDailycheckinheader, DataKeyCardJobfavorite dataKeyCardJobfavorite, ActionUpdate actionUpdate, ActionCopytimesheet actionCopytimesheet, ActionActionsequence actionActionsequence, ActionRunreport actionRunreport, ActionEmailonaction actionEmailonaction, ActionSubmittimesheet actionSubmittimesheet, ActionExportdataset actionExportdataset, ActionPrinttimesheet actionPrinttimesheet, ActionSubmittimesheettemporarily actionSubmittimesheettemporarily) {
        this.dataKeyEmployeenumberEmployee = dataKeyEmployeenumberEmployee;
        this.dataKeyCardDefaultjobheader = dataKeyCardDefaultjobheader;
        this.dataKeyCardEmployeenumberEmployee = dataKeyCardEmployeenumberEmployee;
        this.dataKeyCardDailytimesheetheader = dataKeyCardDailytimesheetheader;
        this.dataKeyCardDailycheckinheader = dataKeyCardDailycheckinheader;
        this.dataKeyCardJobfavorite = dataKeyCardJobfavorite;
        this.actionUpdate = actionUpdate;
        this.actionCopytimesheet = actionCopytimesheet;
        this.actionActionsequence = actionActionsequence;
        this.actionRunreport = actionRunreport;
        this.actionEmailonaction = actionEmailonaction;
        this.actionSubmittimesheet = actionSubmittimesheet;
        this.actionExportdataset = actionExportdataset;
        this.actionPrinttimesheet = actionPrinttimesheet;
        this.actionSubmittimesheettemporarily = actionSubmittimesheettemporarily;
    }

    /**
     * 
     * @return
     *     The dataKeyEmployeenumberEmployee
     */
    @JsonProperty("data:key:employeenumber_employee")
    public DataKeyEmployeenumberEmployee getDataKeyEmployeenumberEmployee() {
        return dataKeyEmployeenumberEmployee;
    }

    /**
     * 
     * @param dataKeyEmployeenumberEmployee
     *     The data:key:employeenumber_employee
     */
    @JsonProperty("data:key:employeenumber_employee")
    public void setDataKeyEmployeenumberEmployee(DataKeyEmployeenumberEmployee dataKeyEmployeenumberEmployee) {
        this.dataKeyEmployeenumberEmployee = dataKeyEmployeenumberEmployee;
    }

    /**
     * 
     * @return
     *     The dataKeyCardDefaultjobheader
     */
    @JsonProperty("data:key:card_defaultjobheader")
    public DataKeyCardDefaultjobheader getDataKeyCardDefaultjobheader() {
        return dataKeyCardDefaultjobheader;
    }

    /**
     * 
     * @param dataKeyCardDefaultjobheader
     *     The data:key:card_defaultjobheader
     */
    @JsonProperty("data:key:card_defaultjobheader")
    public void setDataKeyCardDefaultjobheader(DataKeyCardDefaultjobheader dataKeyCardDefaultjobheader) {
        this.dataKeyCardDefaultjobheader = dataKeyCardDefaultjobheader;
    }

    /**
     * 
     * @return
     *     The dataKeyCardEmployeenumberEmployee
     */
    @JsonProperty("data:key:card_employeenumber_employee")
    public DataKeyCardEmployeenumberEmployee getDataKeyCardEmployeenumberEmployee() {
        return dataKeyCardEmployeenumberEmployee;
    }

    /**
     * 
     * @param dataKeyCardEmployeenumberEmployee
     *     The data:key:card_employeenumber_employee
     */
    @JsonProperty("data:key:card_employeenumber_employee")
    public void setDataKeyCardEmployeenumberEmployee(DataKeyCardEmployeenumberEmployee dataKeyCardEmployeenumberEmployee) {
        this.dataKeyCardEmployeenumberEmployee = dataKeyCardEmployeenumberEmployee;
    }

    /**
     * 
     * @return
     *     The dataKeyCardDailytimesheetheader
     */
    @JsonProperty("data:key:card_dailytimesheetheader")
    public DataKeyCardDailytimesheetheader getDataKeyCardDailytimesheetheader() {
        return dataKeyCardDailytimesheetheader;
    }

    /**
     * 
     * @param dataKeyCardDailytimesheetheader
     *     The data:key:card_dailytimesheetheader
     */
    @JsonProperty("data:key:card_dailytimesheetheader")
    public void setDataKeyCardDailytimesheetheader(DataKeyCardDailytimesheetheader dataKeyCardDailytimesheetheader) {
        this.dataKeyCardDailytimesheetheader = dataKeyCardDailytimesheetheader;
    }

    /**
     * 
     * @return
     *     The dataKeyCardDailycheckinheader
     */
    @JsonProperty("data:key:card_dailycheckinheader")
    public DataKeyCardDailycheckinheader getDataKeyCardDailycheckinheader() {
        return dataKeyCardDailycheckinheader;
    }

    /**
     * 
     * @param dataKeyCardDailycheckinheader
     *     The data:key:card_dailycheckinheader
     */
    @JsonProperty("data:key:card_dailycheckinheader")
    public void setDataKeyCardDailycheckinheader(DataKeyCardDailycheckinheader dataKeyCardDailycheckinheader) {
        this.dataKeyCardDailycheckinheader = dataKeyCardDailycheckinheader;
    }

    /**
     * 
     * @return
     *     The dataKeyCardJobfavorite
     */
    @JsonProperty("data:key:card_jobfavorite")
    public DataKeyCardJobfavorite getDataKeyCardJobfavorite() {
        return dataKeyCardJobfavorite;
    }

    /**
     * 
     * @param dataKeyCardJobfavorite
     *     The data:key:card_jobfavorite
     */
    @JsonProperty("data:key:card_jobfavorite")
    public void setDataKeyCardJobfavorite(DataKeyCardJobfavorite dataKeyCardJobfavorite) {
        this.dataKeyCardJobfavorite = dataKeyCardJobfavorite;
    }

    /**
     * 
     * @return
     *     The actionUpdate
     */
    @JsonProperty("action:update")
    public ActionUpdate getActionUpdate() {
        return actionUpdate;
    }

    /**
     * 
     * @param actionUpdate
     *     The action:update
     */
    @JsonProperty("action:update")
    public void setActionUpdate(ActionUpdate actionUpdate) {
        this.actionUpdate = actionUpdate;
    }

    /**
     * 
     * @return
     *     The actionCopytimesheet
     */
    @JsonProperty("action:copytimesheet")
    public ActionCopytimesheet getActionCopytimesheet() {
        return actionCopytimesheet;
    }

    /**
     * 
     * @param actionCopytimesheet
     *     The action:copytimesheet
     */
    @JsonProperty("action:copytimesheet")
    public void setActionCopytimesheet(ActionCopytimesheet actionCopytimesheet) {
        this.actionCopytimesheet = actionCopytimesheet;
    }

    /**
     * 
     * @return
     *     The actionActionsequence
     */
    @JsonProperty("action:actionsequence")
    public ActionActionsequence getActionActionsequence() {
        return actionActionsequence;
    }

    /**
     * 
     * @param actionActionsequence
     *     The action:actionsequence
     */
    @JsonProperty("action:actionsequence")
    public void setActionActionsequence(ActionActionsequence actionActionsequence) {
        this.actionActionsequence = actionActionsequence;
    }

    /**
     * 
     * @return
     *     The actionRunreport
     */
    @JsonProperty("action:runreport")
    public ActionRunreport getActionRunreport() {
        return actionRunreport;
    }

    /**
     * 
     * @param actionRunreport
     *     The action:runreport
     */
    @JsonProperty("action:runreport")
    public void setActionRunreport(ActionRunreport actionRunreport) {
        this.actionRunreport = actionRunreport;
    }

    /**
     * 
     * @return
     *     The actionEmailonaction
     */
    @JsonProperty("action:emailonaction")
    public ActionEmailonaction getActionEmailonaction() {
        return actionEmailonaction;
    }

    /**
     * 
     * @param actionEmailonaction
     *     The action:emailonaction
     */
    @JsonProperty("action:emailonaction")
    public void setActionEmailonaction(ActionEmailonaction actionEmailonaction) {
        this.actionEmailonaction = actionEmailonaction;
    }

    /**
     * 
     * @return
     *     The actionSubmittimesheet
     */
    @JsonProperty("action:submittimesheet")
    public ActionSubmittimesheet getActionSubmittimesheet() {
        return actionSubmittimesheet;
    }

    /**
     * 
     * @param actionSubmittimesheet
     *     The action:submittimesheet
     */
    @JsonProperty("action:submittimesheet")
    public void setActionSubmittimesheet(ActionSubmittimesheet actionSubmittimesheet) {
        this.actionSubmittimesheet = actionSubmittimesheet;
    }

    /**
     * 
     * @return
     *     The actionExportdataset
     */
    @JsonProperty("action:exportdataset")
    public ActionExportdataset getActionExportdataset() {
        return actionExportdataset;
    }

    /**
     * 
     * @param actionExportdataset
     *     The action:exportdataset
     */
    @JsonProperty("action:exportdataset")
    public void setActionExportdataset(ActionExportdataset actionExportdataset) {
        this.actionExportdataset = actionExportdataset;
    }

    /**
     * 
     * @return
     *     The actionPrinttimesheet
     */
    @JsonProperty("action:printtimesheet")
    public ActionPrinttimesheet getActionPrinttimesheet() {
        return actionPrinttimesheet;
    }

    /**
     * 
     * @param actionPrinttimesheet
     *     The action:printtimesheet
     */
    @JsonProperty("action:printtimesheet")
    public void setActionPrinttimesheet(ActionPrinttimesheet actionPrinttimesheet) {
        this.actionPrinttimesheet = actionPrinttimesheet;
    }

    /**
     * 
     * @return
     *     The actionSubmittimesheettemporarily
     */
    @JsonProperty("action:submittimesheettemporarily")
    public ActionSubmittimesheettemporarily getActionSubmittimesheettemporarily() {
        return actionSubmittimesheettemporarily;
    }

    /**
     * 
     * @param actionSubmittimesheettemporarily
     *     The action:submittimesheettemporarily
     */
    @JsonProperty("action:submittimesheettemporarily")
    public void setActionSubmittimesheettemporarily(ActionSubmittimesheettemporarily actionSubmittimesheettemporarily) {
        this.actionSubmittimesheettemporarily = actionSubmittimesheettemporarily;
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
        return new HashCodeBuilder().append(dataKeyEmployeenumberEmployee).append(dataKeyCardDefaultjobheader).append(dataKeyCardEmployeenumberEmployee).append(dataKeyCardDailytimesheetheader).append(dataKeyCardDailycheckinheader).append(dataKeyCardJobfavorite).append(actionUpdate).append(actionCopytimesheet).append(actionActionsequence).append(actionRunreport).append(actionEmailonaction).append(actionSubmittimesheet).append(actionExportdataset).append(actionPrinttimesheet).append(actionSubmittimesheettemporarily).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Links) == false) {
            return false;
        }
        Links rhs = ((Links) other);
        return new EqualsBuilder().append(dataKeyEmployeenumberEmployee, rhs.dataKeyEmployeenumberEmployee).append(dataKeyCardDefaultjobheader, rhs.dataKeyCardDefaultjobheader).append(dataKeyCardEmployeenumberEmployee, rhs.dataKeyCardEmployeenumberEmployee).append(dataKeyCardDailytimesheetheader, rhs.dataKeyCardDailytimesheetheader).append(dataKeyCardDailycheckinheader, rhs.dataKeyCardDailycheckinheader).append(dataKeyCardJobfavorite, rhs.dataKeyCardJobfavorite).append(actionUpdate, rhs.actionUpdate).append(actionCopytimesheet, rhs.actionCopytimesheet).append(actionActionsequence, rhs.actionActionsequence).append(actionRunreport, rhs.actionRunreport).append(actionEmailonaction, rhs.actionEmailonaction).append(actionSubmittimesheet, rhs.actionSubmittimesheet).append(actionExportdataset, rhs.actionExportdataset).append(actionPrinttimesheet, rhs.actionPrinttimesheet).append(actionSubmittimesheettemporarily, rhs.actionSubmittimesheettemporarily).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
