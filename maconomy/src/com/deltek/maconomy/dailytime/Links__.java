
package com.deltek.maconomy.dailytime;

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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "data:key:card_employeenumber_employee",
    "data:key:card_defaultjobheader",
    "data:key:card_dailytimesheetheader",
    "data:key:card_jobfavorite",
    "data:key:employeenumber_employee",
    "action:update",
    "action:exportdataset",
    "action:actionsequence",
    "action:copytimesheet",
    "action:emailonaction",
    "action:submittimesheettemporarily",
    "action:runreport",
    "action:submittimesheet",
    "action:printtimesheet"
})
public class Links__ {

    @JsonProperty("data:key:card_employeenumber_employee")
    private DataKeyCardEmployeenumberEmployee dataKeyCardEmployeenumberEmployee;
    @JsonProperty("data:key:card_defaultjobheader")
    private DataKeyCardDefaultjobheader dataKeyCardDefaultjobheader;
    @JsonProperty("data:key:card_dailytimesheetheader")
    private DataKeyCardDailytimesheetheader dataKeyCardDailytimesheetheader;
    @JsonProperty("data:key:card_jobfavorite")
    private DataKeyCardJobfavorite dataKeyCardJobfavorite;
    @JsonProperty("data:key:employeenumber_employee")
    private DataKeyEmployeenumberEmployee_ dataKeyEmployeenumberEmployee;
    @JsonProperty("action:update")
    private ActionUpdate_ actionUpdate;
    @JsonProperty("action:exportdataset")
    private ActionExportdataset_ actionExportdataset;
    @JsonProperty("action:actionsequence")
    private ActionActionsequence_ actionActionsequence;
    @JsonProperty("action:copytimesheet")
    private ActionCopytimesheet actionCopytimesheet;
    @JsonProperty("action:emailonaction")
    private ActionEmailonaction_ actionEmailonaction;
    @JsonProperty("action:submittimesheettemporarily")
    private ActionSubmittimesheettemporarily actionSubmittimesheettemporarily;
    @JsonProperty("action:runreport")
    private ActionRunreport_ actionRunreport;
    @JsonProperty("action:submittimesheet")
    private ActionSubmittimesheet actionSubmittimesheet;
    @JsonProperty("action:printtimesheet")
    private ActionPrinttimesheet actionPrinttimesheet;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Links__() {
    }

    /**
     * 
     * @param actionUpdate
     * @param actionEmailonaction
     * @param actionCopytimesheet
     * @param actionSubmittimesheet
     * @param dataKeyCardDailytimesheetheader
     * @param actionRunreport
     * @param actionSubmittimesheettemporarily
     * @param actionActionsequence
     * @param dataKeyCardJobfavorite
     * @param dataKeyCardDefaultjobheader
     * @param dataKeyEmployeenumberEmployee
     * @param actionExportdataset
     * @param actionPrinttimesheet
     * @param dataKeyCardEmployeenumberEmployee
     */
    public Links__(DataKeyCardEmployeenumberEmployee dataKeyCardEmployeenumberEmployee, DataKeyCardDefaultjobheader dataKeyCardDefaultjobheader, DataKeyCardDailytimesheetheader dataKeyCardDailytimesheetheader, DataKeyCardJobfavorite dataKeyCardJobfavorite, DataKeyEmployeenumberEmployee_ dataKeyEmployeenumberEmployee, ActionUpdate_ actionUpdate, ActionExportdataset_ actionExportdataset, ActionActionsequence_ actionActionsequence, ActionCopytimesheet actionCopytimesheet, ActionEmailonaction_ actionEmailonaction, ActionSubmittimesheettemporarily actionSubmittimesheettemporarily, ActionRunreport_ actionRunreport, ActionSubmittimesheet actionSubmittimesheet, ActionPrinttimesheet actionPrinttimesheet) {
        super();
        this.dataKeyCardEmployeenumberEmployee = dataKeyCardEmployeenumberEmployee;
        this.dataKeyCardDefaultjobheader = dataKeyCardDefaultjobheader;
        this.dataKeyCardDailytimesheetheader = dataKeyCardDailytimesheetheader;
        this.dataKeyCardJobfavorite = dataKeyCardJobfavorite;
        this.dataKeyEmployeenumberEmployee = dataKeyEmployeenumberEmployee;
        this.actionUpdate = actionUpdate;
        this.actionExportdataset = actionExportdataset;
        this.actionActionsequence = actionActionsequence;
        this.actionCopytimesheet = actionCopytimesheet;
        this.actionEmailonaction = actionEmailonaction;
        this.actionSubmittimesheettemporarily = actionSubmittimesheettemporarily;
        this.actionRunreport = actionRunreport;
        this.actionSubmittimesheet = actionSubmittimesheet;
        this.actionPrinttimesheet = actionPrinttimesheet;
    }

    @JsonProperty("data:key:card_employeenumber_employee")
    public DataKeyCardEmployeenumberEmployee getDataKeyCardEmployeenumberEmployee() {
        return dataKeyCardEmployeenumberEmployee;
    }

    @JsonProperty("data:key:card_employeenumber_employee")
    public void setDataKeyCardEmployeenumberEmployee(DataKeyCardEmployeenumberEmployee dataKeyCardEmployeenumberEmployee) {
        this.dataKeyCardEmployeenumberEmployee = dataKeyCardEmployeenumberEmployee;
    }

    @JsonProperty("data:key:card_defaultjobheader")
    public DataKeyCardDefaultjobheader getDataKeyCardDefaultjobheader() {
        return dataKeyCardDefaultjobheader;
    }

    @JsonProperty("data:key:card_defaultjobheader")
    public void setDataKeyCardDefaultjobheader(DataKeyCardDefaultjobheader dataKeyCardDefaultjobheader) {
        this.dataKeyCardDefaultjobheader = dataKeyCardDefaultjobheader;
    }

    @JsonProperty("data:key:card_dailytimesheetheader")
    public DataKeyCardDailytimesheetheader getDataKeyCardDailytimesheetheader() {
        return dataKeyCardDailytimesheetheader;
    }

    @JsonProperty("data:key:card_dailytimesheetheader")
    public void setDataKeyCardDailytimesheetheader(DataKeyCardDailytimesheetheader dataKeyCardDailytimesheetheader) {
        this.dataKeyCardDailytimesheetheader = dataKeyCardDailytimesheetheader;
    }

    @JsonProperty("data:key:card_jobfavorite")
    public DataKeyCardJobfavorite getDataKeyCardJobfavorite() {
        return dataKeyCardJobfavorite;
    }

    @JsonProperty("data:key:card_jobfavorite")
    public void setDataKeyCardJobfavorite(DataKeyCardJobfavorite dataKeyCardJobfavorite) {
        this.dataKeyCardJobfavorite = dataKeyCardJobfavorite;
    }

    @JsonProperty("data:key:employeenumber_employee")
    public DataKeyEmployeenumberEmployee_ getDataKeyEmployeenumberEmployee() {
        return dataKeyEmployeenumberEmployee;
    }

    @JsonProperty("data:key:employeenumber_employee")
    public void setDataKeyEmployeenumberEmployee(DataKeyEmployeenumberEmployee_ dataKeyEmployeenumberEmployee) {
        this.dataKeyEmployeenumberEmployee = dataKeyEmployeenumberEmployee;
    }

    @JsonProperty("action:update")
    public ActionUpdate_ getActionUpdate() {
        return actionUpdate;
    }

    @JsonProperty("action:update")
    public void setActionUpdate(ActionUpdate_ actionUpdate) {
        this.actionUpdate = actionUpdate;
    }

    @JsonProperty("action:exportdataset")
    public ActionExportdataset_ getActionExportdataset() {
        return actionExportdataset;
    }

    @JsonProperty("action:exportdataset")
    public void setActionExportdataset(ActionExportdataset_ actionExportdataset) {
        this.actionExportdataset = actionExportdataset;
    }

    @JsonProperty("action:actionsequence")
    public ActionActionsequence_ getActionActionsequence() {
        return actionActionsequence;
    }

    @JsonProperty("action:actionsequence")
    public void setActionActionsequence(ActionActionsequence_ actionActionsequence) {
        this.actionActionsequence = actionActionsequence;
    }

    @JsonProperty("action:copytimesheet")
    public ActionCopytimesheet getActionCopytimesheet() {
        return actionCopytimesheet;
    }

    @JsonProperty("action:copytimesheet")
    public void setActionCopytimesheet(ActionCopytimesheet actionCopytimesheet) {
        this.actionCopytimesheet = actionCopytimesheet;
    }

    @JsonProperty("action:emailonaction")
    public ActionEmailonaction_ getActionEmailonaction() {
        return actionEmailonaction;
    }

    @JsonProperty("action:emailonaction")
    public void setActionEmailonaction(ActionEmailonaction_ actionEmailonaction) {
        this.actionEmailonaction = actionEmailonaction;
    }

    @JsonProperty("action:submittimesheettemporarily")
    public ActionSubmittimesheettemporarily getActionSubmittimesheettemporarily() {
        return actionSubmittimesheettemporarily;
    }

    @JsonProperty("action:submittimesheettemporarily")
    public void setActionSubmittimesheettemporarily(ActionSubmittimesheettemporarily actionSubmittimesheettemporarily) {
        this.actionSubmittimesheettemporarily = actionSubmittimesheettemporarily;
    }

    @JsonProperty("action:runreport")
    public ActionRunreport_ getActionRunreport() {
        return actionRunreport;
    }

    @JsonProperty("action:runreport")
    public void setActionRunreport(ActionRunreport_ actionRunreport) {
        this.actionRunreport = actionRunreport;
    }

    @JsonProperty("action:submittimesheet")
    public ActionSubmittimesheet getActionSubmittimesheet() {
        return actionSubmittimesheet;
    }

    @JsonProperty("action:submittimesheet")
    public void setActionSubmittimesheet(ActionSubmittimesheet actionSubmittimesheet) {
        this.actionSubmittimesheet = actionSubmittimesheet;
    }

    @JsonProperty("action:printtimesheet")
    public ActionPrinttimesheet getActionPrinttimesheet() {
        return actionPrinttimesheet;
    }

    @JsonProperty("action:printtimesheet")
    public void setActionPrinttimesheet(ActionPrinttimesheet actionPrinttimesheet) {
        this.actionPrinttimesheet = actionPrinttimesheet;
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
        return new HashCodeBuilder().append(actionEmailonaction).append(actionSubmittimesheet).append(actionSubmittimesheettemporarily).append(actionActionsequence).append(dataKeyCardJobfavorite).append(dataKeyCardDefaultjobheader).append(dataKeyEmployeenumberEmployee).append(actionPrinttimesheet).append(actionUpdate).append(actionCopytimesheet).append(additionalProperties).append(dataKeyCardDailytimesheetheader).append(actionRunreport).append(actionExportdataset).append(dataKeyCardEmployeenumberEmployee).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Links__) == false) {
            return false;
        }
        Links__ rhs = ((Links__) other);
        return new EqualsBuilder().append(actionEmailonaction, rhs.actionEmailonaction).append(actionSubmittimesheet, rhs.actionSubmittimesheet).append(actionSubmittimesheettemporarily, rhs.actionSubmittimesheettemporarily).append(actionActionsequence, rhs.actionActionsequence).append(dataKeyCardJobfavorite, rhs.dataKeyCardJobfavorite).append(dataKeyCardDefaultjobheader, rhs.dataKeyCardDefaultjobheader).append(dataKeyEmployeenumberEmployee, rhs.dataKeyEmployeenumberEmployee).append(actionPrinttimesheet, rhs.actionPrinttimesheet).append(actionUpdate, rhs.actionUpdate).append(actionCopytimesheet, rhs.actionCopytimesheet).append(additionalProperties, rhs.additionalProperties).append(dataKeyCardDailytimesheetheader, rhs.dataKeyCardDailytimesheetheader).append(actionRunreport, rhs.actionRunreport).append(actionExportdataset, rhs.actionExportdataset).append(dataKeyCardEmployeenumberEmployee, rhs.dataKeyCardEmployeenumberEmployee).isEquals();
    }

}
