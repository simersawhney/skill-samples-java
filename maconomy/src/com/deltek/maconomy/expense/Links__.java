
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
    "data:key:jobnumber_jobheader",
    "data:key:companynumber_companyinformation",
    "data:key:secretaryemployee_employee",
    "data:key:headerapproval_approvalheader",
    "data:key:notenumber_noteheader",
    "data:key:tutoremployee_employee",
    "data:key:superioremployee_employee",
    "data:key:headerapproval_approvalline",
    "data:key:approvalgroupinstancekey_approvalgroup",
    "data:key:copyfromexpensesheetnumber_expensesheetheader",
    "data:key:expensesheetemployeenumber_employee",
    "data:key:documentarchivenumber_documentarchiveheader",
    "action:insert",
    "action:create",
    "action:update",
    "action:delete",
    "action:print",
    "action:exportdataset",
    "action:emailonaction",
    "action:copyexpensesheet",
    "action:duplicateexpensesheet",
    "action:actionsequence",
    "action:runreport",
    "action:attachdocument",
    "action:submitexpensesheet"
})
public class Links__ {

    @JsonProperty("data:key:jobnumber_jobheader")
    private DataKeyJobnumberJobheader_ dataKeyJobnumberJobheader;
    @JsonProperty("data:key:companynumber_companyinformation")
    private DataKeyCompanynumberCompanyinformation_ dataKeyCompanynumberCompanyinformation;
    @JsonProperty("data:key:secretaryemployee_employee")
    private DataKeySecretaryemployeeEmployee dataKeySecretaryemployeeEmployee;
    @JsonProperty("data:key:headerapproval_approvalheader")
    private DataKeyHeaderapprovalApprovalheader dataKeyHeaderapprovalApprovalheader;
    @JsonProperty("data:key:notenumber_noteheader")
    private DataKeyNotenumberNoteheader dataKeyNotenumberNoteheader;
    @JsonProperty("data:key:tutoremployee_employee")
    private DataKeyTutoremployeeEmployee dataKeyTutoremployeeEmployee;
    @JsonProperty("data:key:superioremployee_employee")
    private DataKeySuperioremployeeEmployee dataKeySuperioremployeeEmployee;
    @JsonProperty("data:key:headerapproval_approvalline")
    private DataKeyHeaderapprovalApprovalline dataKeyHeaderapprovalApprovalline;
    @JsonProperty("data:key:approvalgroupinstancekey_approvalgroup")
    private DataKeyApprovalgroupinstancekeyApprovalgroup dataKeyApprovalgroupinstancekeyApprovalgroup;
    @JsonProperty("data:key:copyfromexpensesheetnumber_expensesheetheader")
    private DataKeyCopyfromexpensesheetnumberExpensesheetheader dataKeyCopyfromexpensesheetnumberExpensesheetheader;
    @JsonProperty("data:key:expensesheetemployeenumber_employee")
    private DataKeyExpensesheetemployeenumberEmployee dataKeyExpensesheetemployeenumberEmployee;
    @JsonProperty("data:key:documentarchivenumber_documentarchiveheader")
    private DataKeyDocumentarchivenumberDocumentarchiveheader dataKeyDocumentarchivenumberDocumentarchiveheader;
    @JsonProperty("action:insert")
    private ActionInsert_ actionInsert;
    @JsonProperty("action:create")
    private ActionCreate__ actionCreate;
    @JsonProperty("action:update")
    private ActionUpdate_ actionUpdate;
    @JsonProperty("action:delete")
    private ActionDelete_ actionDelete;
    @JsonProperty("action:print")
    private ActionPrint_ actionPrint;
    @JsonProperty("action:exportdataset")
    private ActionExportdataset_ actionExportdataset;
    @JsonProperty("action:emailonaction")
    private ActionEmailonaction_ actionEmailonaction;
    @JsonProperty("action:copyexpensesheet")
    private ActionCopyexpensesheet actionCopyexpensesheet;
    @JsonProperty("action:duplicateexpensesheet")
    private ActionDuplicateexpensesheet actionDuplicateexpensesheet;
    @JsonProperty("action:actionsequence")
    private ActionActionsequence_ actionActionsequence;
    @JsonProperty("action:runreport")
    private ActionRunreport_ actionRunreport;
    @JsonProperty("action:attachdocument")
    private ActionAttachdocument actionAttachdocument;
    @JsonProperty("action:submitexpensesheet")
    private ActionSubmitexpensesheet actionSubmitexpensesheet;
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
     * @param actionCopyexpensesheet
     * @param actionEmailonaction
     * @param dataKeyHeaderapprovalApprovalline
     * @param actionSubmitexpensesheet
     * @param dataKeySecretaryemployeeEmployee
     * @param actionActionsequence
     * @param dataKeyCompanynumberCompanyinformation
     * @param actionPrint
     * @param actionCreate
     * @param dataKeySuperioremployeeEmployee
     * @param actionUpdate
     * @param dataKeyTutoremployeeEmployee
     * @param dataKeyNotenumberNoteheader
     * @param actionDuplicateexpensesheet
     * @param dataKeyApprovalgroupinstancekeyApprovalgroup
     * @param actionAttachdocument
     * @param actionRunreport
     * @param dataKeyCopyfromexpensesheetnumberExpensesheetheader
     * @param dataKeyDocumentarchivenumberDocumentarchiveheader
     * @param actionInsert
     * @param dataKeyJobnumberJobheader
     * @param dataKeyHeaderapprovalApprovalheader
     * @param actionExportdataset
     * @param actionDelete
     * @param dataKeyExpensesheetemployeenumberEmployee
     */
    public Links__(DataKeyJobnumberJobheader_ dataKeyJobnumberJobheader, DataKeyCompanynumberCompanyinformation_ dataKeyCompanynumberCompanyinformation, DataKeySecretaryemployeeEmployee dataKeySecretaryemployeeEmployee, DataKeyHeaderapprovalApprovalheader dataKeyHeaderapprovalApprovalheader, DataKeyNotenumberNoteheader dataKeyNotenumberNoteheader, DataKeyTutoremployeeEmployee dataKeyTutoremployeeEmployee, DataKeySuperioremployeeEmployee dataKeySuperioremployeeEmployee, DataKeyHeaderapprovalApprovalline dataKeyHeaderapprovalApprovalline, DataKeyApprovalgroupinstancekeyApprovalgroup dataKeyApprovalgroupinstancekeyApprovalgroup, DataKeyCopyfromexpensesheetnumberExpensesheetheader dataKeyCopyfromexpensesheetnumberExpensesheetheader, DataKeyExpensesheetemployeenumberEmployee dataKeyExpensesheetemployeenumberEmployee, DataKeyDocumentarchivenumberDocumentarchiveheader dataKeyDocumentarchivenumberDocumentarchiveheader, ActionInsert_ actionInsert, ActionCreate__ actionCreate, ActionUpdate_ actionUpdate, ActionDelete_ actionDelete, ActionPrint_ actionPrint, ActionExportdataset_ actionExportdataset, ActionEmailonaction_ actionEmailonaction, ActionCopyexpensesheet actionCopyexpensesheet, ActionDuplicateexpensesheet actionDuplicateexpensesheet, ActionActionsequence_ actionActionsequence, ActionRunreport_ actionRunreport, ActionAttachdocument actionAttachdocument, ActionSubmitexpensesheet actionSubmitexpensesheet) {
        super();
        this.dataKeyJobnumberJobheader = dataKeyJobnumberJobheader;
        this.dataKeyCompanynumberCompanyinformation = dataKeyCompanynumberCompanyinformation;
        this.dataKeySecretaryemployeeEmployee = dataKeySecretaryemployeeEmployee;
        this.dataKeyHeaderapprovalApprovalheader = dataKeyHeaderapprovalApprovalheader;
        this.dataKeyNotenumberNoteheader = dataKeyNotenumberNoteheader;
        this.dataKeyTutoremployeeEmployee = dataKeyTutoremployeeEmployee;
        this.dataKeySuperioremployeeEmployee = dataKeySuperioremployeeEmployee;
        this.dataKeyHeaderapprovalApprovalline = dataKeyHeaderapprovalApprovalline;
        this.dataKeyApprovalgroupinstancekeyApprovalgroup = dataKeyApprovalgroupinstancekeyApprovalgroup;
        this.dataKeyCopyfromexpensesheetnumberExpensesheetheader = dataKeyCopyfromexpensesheetnumberExpensesheetheader;
        this.dataKeyExpensesheetemployeenumberEmployee = dataKeyExpensesheetemployeenumberEmployee;
        this.dataKeyDocumentarchivenumberDocumentarchiveheader = dataKeyDocumentarchivenumberDocumentarchiveheader;
        this.actionInsert = actionInsert;
        this.actionCreate = actionCreate;
        this.actionUpdate = actionUpdate;
        this.actionDelete = actionDelete;
        this.actionPrint = actionPrint;
        this.actionExportdataset = actionExportdataset;
        this.actionEmailonaction = actionEmailonaction;
        this.actionCopyexpensesheet = actionCopyexpensesheet;
        this.actionDuplicateexpensesheet = actionDuplicateexpensesheet;
        this.actionActionsequence = actionActionsequence;
        this.actionRunreport = actionRunreport;
        this.actionAttachdocument = actionAttachdocument;
        this.actionSubmitexpensesheet = actionSubmitexpensesheet;
    }

    @JsonProperty("data:key:jobnumber_jobheader")
    public DataKeyJobnumberJobheader_ getDataKeyJobnumberJobheader() {
        return dataKeyJobnumberJobheader;
    }

    @JsonProperty("data:key:jobnumber_jobheader")
    public void setDataKeyJobnumberJobheader(DataKeyJobnumberJobheader_ dataKeyJobnumberJobheader) {
        this.dataKeyJobnumberJobheader = dataKeyJobnumberJobheader;
    }

    @JsonProperty("data:key:companynumber_companyinformation")
    public DataKeyCompanynumberCompanyinformation_ getDataKeyCompanynumberCompanyinformation() {
        return dataKeyCompanynumberCompanyinformation;
    }

    @JsonProperty("data:key:companynumber_companyinformation")
    public void setDataKeyCompanynumberCompanyinformation(DataKeyCompanynumberCompanyinformation_ dataKeyCompanynumberCompanyinformation) {
        this.dataKeyCompanynumberCompanyinformation = dataKeyCompanynumberCompanyinformation;
    }

    @JsonProperty("data:key:secretaryemployee_employee")
    public DataKeySecretaryemployeeEmployee getDataKeySecretaryemployeeEmployee() {
        return dataKeySecretaryemployeeEmployee;
    }

    @JsonProperty("data:key:secretaryemployee_employee")
    public void setDataKeySecretaryemployeeEmployee(DataKeySecretaryemployeeEmployee dataKeySecretaryemployeeEmployee) {
        this.dataKeySecretaryemployeeEmployee = dataKeySecretaryemployeeEmployee;
    }

    @JsonProperty("data:key:headerapproval_approvalheader")
    public DataKeyHeaderapprovalApprovalheader getDataKeyHeaderapprovalApprovalheader() {
        return dataKeyHeaderapprovalApprovalheader;
    }

    @JsonProperty("data:key:headerapproval_approvalheader")
    public void setDataKeyHeaderapprovalApprovalheader(DataKeyHeaderapprovalApprovalheader dataKeyHeaderapprovalApprovalheader) {
        this.dataKeyHeaderapprovalApprovalheader = dataKeyHeaderapprovalApprovalheader;
    }

    @JsonProperty("data:key:notenumber_noteheader")
    public DataKeyNotenumberNoteheader getDataKeyNotenumberNoteheader() {
        return dataKeyNotenumberNoteheader;
    }

    @JsonProperty("data:key:notenumber_noteheader")
    public void setDataKeyNotenumberNoteheader(DataKeyNotenumberNoteheader dataKeyNotenumberNoteheader) {
        this.dataKeyNotenumberNoteheader = dataKeyNotenumberNoteheader;
    }

    @JsonProperty("data:key:tutoremployee_employee")
    public DataKeyTutoremployeeEmployee getDataKeyTutoremployeeEmployee() {
        return dataKeyTutoremployeeEmployee;
    }

    @JsonProperty("data:key:tutoremployee_employee")
    public void setDataKeyTutoremployeeEmployee(DataKeyTutoremployeeEmployee dataKeyTutoremployeeEmployee) {
        this.dataKeyTutoremployeeEmployee = dataKeyTutoremployeeEmployee;
    }

    @JsonProperty("data:key:superioremployee_employee")
    public DataKeySuperioremployeeEmployee getDataKeySuperioremployeeEmployee() {
        return dataKeySuperioremployeeEmployee;
    }

    @JsonProperty("data:key:superioremployee_employee")
    public void setDataKeySuperioremployeeEmployee(DataKeySuperioremployeeEmployee dataKeySuperioremployeeEmployee) {
        this.dataKeySuperioremployeeEmployee = dataKeySuperioremployeeEmployee;
    }

    @JsonProperty("data:key:headerapproval_approvalline")
    public DataKeyHeaderapprovalApprovalline getDataKeyHeaderapprovalApprovalline() {
        return dataKeyHeaderapprovalApprovalline;
    }

    @JsonProperty("data:key:headerapproval_approvalline")
    public void setDataKeyHeaderapprovalApprovalline(DataKeyHeaderapprovalApprovalline dataKeyHeaderapprovalApprovalline) {
        this.dataKeyHeaderapprovalApprovalline = dataKeyHeaderapprovalApprovalline;
    }

    @JsonProperty("data:key:approvalgroupinstancekey_approvalgroup")
    public DataKeyApprovalgroupinstancekeyApprovalgroup getDataKeyApprovalgroupinstancekeyApprovalgroup() {
        return dataKeyApprovalgroupinstancekeyApprovalgroup;
    }

    @JsonProperty("data:key:approvalgroupinstancekey_approvalgroup")
    public void setDataKeyApprovalgroupinstancekeyApprovalgroup(DataKeyApprovalgroupinstancekeyApprovalgroup dataKeyApprovalgroupinstancekeyApprovalgroup) {
        this.dataKeyApprovalgroupinstancekeyApprovalgroup = dataKeyApprovalgroupinstancekeyApprovalgroup;
    }

    @JsonProperty("data:key:copyfromexpensesheetnumber_expensesheetheader")
    public DataKeyCopyfromexpensesheetnumberExpensesheetheader getDataKeyCopyfromexpensesheetnumberExpensesheetheader() {
        return dataKeyCopyfromexpensesheetnumberExpensesheetheader;
    }

    @JsonProperty("data:key:copyfromexpensesheetnumber_expensesheetheader")
    public void setDataKeyCopyfromexpensesheetnumberExpensesheetheader(DataKeyCopyfromexpensesheetnumberExpensesheetheader dataKeyCopyfromexpensesheetnumberExpensesheetheader) {
        this.dataKeyCopyfromexpensesheetnumberExpensesheetheader = dataKeyCopyfromexpensesheetnumberExpensesheetheader;
    }

    @JsonProperty("data:key:expensesheetemployeenumber_employee")
    public DataKeyExpensesheetemployeenumberEmployee getDataKeyExpensesheetemployeenumberEmployee() {
        return dataKeyExpensesheetemployeenumberEmployee;
    }

    @JsonProperty("data:key:expensesheetemployeenumber_employee")
    public void setDataKeyExpensesheetemployeenumberEmployee(DataKeyExpensesheetemployeenumberEmployee dataKeyExpensesheetemployeenumberEmployee) {
        this.dataKeyExpensesheetemployeenumberEmployee = dataKeyExpensesheetemployeenumberEmployee;
    }

    @JsonProperty("data:key:documentarchivenumber_documentarchiveheader")
    public DataKeyDocumentarchivenumberDocumentarchiveheader getDataKeyDocumentarchivenumberDocumentarchiveheader() {
        return dataKeyDocumentarchivenumberDocumentarchiveheader;
    }

    @JsonProperty("data:key:documentarchivenumber_documentarchiveheader")
    public void setDataKeyDocumentarchivenumberDocumentarchiveheader(DataKeyDocumentarchivenumberDocumentarchiveheader dataKeyDocumentarchivenumberDocumentarchiveheader) {
        this.dataKeyDocumentarchivenumberDocumentarchiveheader = dataKeyDocumentarchivenumberDocumentarchiveheader;
    }

    @JsonProperty("action:insert")
    public ActionInsert_ getActionInsert() {
        return actionInsert;
    }

    @JsonProperty("action:insert")
    public void setActionInsert(ActionInsert_ actionInsert) {
        this.actionInsert = actionInsert;
    }

    @JsonProperty("action:create")
    public ActionCreate__ getActionCreate() {
        return actionCreate;
    }

    @JsonProperty("action:create")
    public void setActionCreate(ActionCreate__ actionCreate) {
        this.actionCreate = actionCreate;
    }

    @JsonProperty("action:update")
    public ActionUpdate_ getActionUpdate() {
        return actionUpdate;
    }

    @JsonProperty("action:update")
    public void setActionUpdate(ActionUpdate_ actionUpdate) {
        this.actionUpdate = actionUpdate;
    }

    @JsonProperty("action:delete")
    public ActionDelete_ getActionDelete() {
        return actionDelete;
    }

    @JsonProperty("action:delete")
    public void setActionDelete(ActionDelete_ actionDelete) {
        this.actionDelete = actionDelete;
    }

    @JsonProperty("action:print")
    public ActionPrint_ getActionPrint() {
        return actionPrint;
    }

    @JsonProperty("action:print")
    public void setActionPrint(ActionPrint_ actionPrint) {
        this.actionPrint = actionPrint;
    }

    @JsonProperty("action:exportdataset")
    public ActionExportdataset_ getActionExportdataset() {
        return actionExportdataset;
    }

    @JsonProperty("action:exportdataset")
    public void setActionExportdataset(ActionExportdataset_ actionExportdataset) {
        this.actionExportdataset = actionExportdataset;
    }

    @JsonProperty("action:emailonaction")
    public ActionEmailonaction_ getActionEmailonaction() {
        return actionEmailonaction;
    }

    @JsonProperty("action:emailonaction")
    public void setActionEmailonaction(ActionEmailonaction_ actionEmailonaction) {
        this.actionEmailonaction = actionEmailonaction;
    }

    @JsonProperty("action:copyexpensesheet")
    public ActionCopyexpensesheet getActionCopyexpensesheet() {
        return actionCopyexpensesheet;
    }

    @JsonProperty("action:copyexpensesheet")
    public void setActionCopyexpensesheet(ActionCopyexpensesheet actionCopyexpensesheet) {
        this.actionCopyexpensesheet = actionCopyexpensesheet;
    }

    @JsonProperty("action:duplicateexpensesheet")
    public ActionDuplicateexpensesheet getActionDuplicateexpensesheet() {
        return actionDuplicateexpensesheet;
    }

    @JsonProperty("action:duplicateexpensesheet")
    public void setActionDuplicateexpensesheet(ActionDuplicateexpensesheet actionDuplicateexpensesheet) {
        this.actionDuplicateexpensesheet = actionDuplicateexpensesheet;
    }

    @JsonProperty("action:actionsequence")
    public ActionActionsequence_ getActionActionsequence() {
        return actionActionsequence;
    }

    @JsonProperty("action:actionsequence")
    public void setActionActionsequence(ActionActionsequence_ actionActionsequence) {
        this.actionActionsequence = actionActionsequence;
    }

    @JsonProperty("action:runreport")
    public ActionRunreport_ getActionRunreport() {
        return actionRunreport;
    }

    @JsonProperty("action:runreport")
    public void setActionRunreport(ActionRunreport_ actionRunreport) {
        this.actionRunreport = actionRunreport;
    }

    @JsonProperty("action:attachdocument")
    public ActionAttachdocument getActionAttachdocument() {
        return actionAttachdocument;
    }

    @JsonProperty("action:attachdocument")
    public void setActionAttachdocument(ActionAttachdocument actionAttachdocument) {
        this.actionAttachdocument = actionAttachdocument;
    }

    @JsonProperty("action:submitexpensesheet")
    public ActionSubmitexpensesheet getActionSubmitexpensesheet() {
        return actionSubmitexpensesheet;
    }

    @JsonProperty("action:submitexpensesheet")
    public void setActionSubmitexpensesheet(ActionSubmitexpensesheet actionSubmitexpensesheet) {
        this.actionSubmitexpensesheet = actionSubmitexpensesheet;
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
        return new ToStringBuilder(this).append("dataKeyJobnumberJobheader", dataKeyJobnumberJobheader).append("dataKeyCompanynumberCompanyinformation", dataKeyCompanynumberCompanyinformation).append("dataKeySecretaryemployeeEmployee", dataKeySecretaryemployeeEmployee).append("dataKeyHeaderapprovalApprovalheader", dataKeyHeaderapprovalApprovalheader).append("dataKeyNotenumberNoteheader", dataKeyNotenumberNoteheader).append("dataKeyTutoremployeeEmployee", dataKeyTutoremployeeEmployee).append("dataKeySuperioremployeeEmployee", dataKeySuperioremployeeEmployee).append("dataKeyHeaderapprovalApprovalline", dataKeyHeaderapprovalApprovalline).append("dataKeyApprovalgroupinstancekeyApprovalgroup", dataKeyApprovalgroupinstancekeyApprovalgroup).append("dataKeyCopyfromexpensesheetnumberExpensesheetheader", dataKeyCopyfromexpensesheetnumberExpensesheetheader).append("dataKeyExpensesheetemployeenumberEmployee", dataKeyExpensesheetemployeenumberEmployee).append("dataKeyDocumentarchivenumberDocumentarchiveheader", dataKeyDocumentarchivenumberDocumentarchiveheader).append("actionInsert", actionInsert).append("actionCreate", actionCreate).append("actionUpdate", actionUpdate).append("actionDelete", actionDelete).append("actionPrint", actionPrint).append("actionExportdataset", actionExportdataset).append("actionEmailonaction", actionEmailonaction).append("actionCopyexpensesheet", actionCopyexpensesheet).append("actionDuplicateexpensesheet", actionDuplicateexpensesheet).append("actionActionsequence", actionActionsequence).append("actionRunreport", actionRunreport).append("actionAttachdocument", actionAttachdocument).append("actionSubmitexpensesheet", actionSubmitexpensesheet).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(actionCopyexpensesheet).append(actionEmailonaction).append(dataKeyHeaderapprovalApprovalline).append(actionSubmitexpensesheet).append(actionActionsequence).append(actionCreate).append(dataKeySuperioremployeeEmployee).append(dataKeyApprovalgroupinstancekeyApprovalgroup).append(actionRunreport).append(dataKeyDocumentarchivenumberDocumentarchiveheader).append(actionInsert).append(dataKeyJobnumberJobheader).append(dataKeySecretaryemployeeEmployee).append(dataKeyCompanynumberCompanyinformation).append(actionPrint).append(actionUpdate).append(dataKeyTutoremployeeEmployee).append(dataKeyNotenumberNoteheader).append(actionDuplicateexpensesheet).append(additionalProperties).append(actionAttachdocument).append(dataKeyCopyfromexpensesheetnumberExpensesheetheader).append(dataKeyHeaderapprovalApprovalheader).append(actionExportdataset).append(actionDelete).append(dataKeyExpensesheetemployeenumberEmployee).toHashCode();
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
        return new EqualsBuilder().append(actionCopyexpensesheet, rhs.actionCopyexpensesheet).append(actionEmailonaction, rhs.actionEmailonaction).append(dataKeyHeaderapprovalApprovalline, rhs.dataKeyHeaderapprovalApprovalline).append(actionSubmitexpensesheet, rhs.actionSubmitexpensesheet).append(actionActionsequence, rhs.actionActionsequence).append(actionCreate, rhs.actionCreate).append(dataKeySuperioremployeeEmployee, rhs.dataKeySuperioremployeeEmployee).append(dataKeyApprovalgroupinstancekeyApprovalgroup, rhs.dataKeyApprovalgroupinstancekeyApprovalgroup).append(actionRunreport, rhs.actionRunreport).append(dataKeyDocumentarchivenumberDocumentarchiveheader, rhs.dataKeyDocumentarchivenumberDocumentarchiveheader).append(actionInsert, rhs.actionInsert).append(dataKeyJobnumberJobheader, rhs.dataKeyJobnumberJobheader).append(dataKeySecretaryemployeeEmployee, rhs.dataKeySecretaryemployeeEmployee).append(dataKeyCompanynumberCompanyinformation, rhs.dataKeyCompanynumberCompanyinformation).append(actionPrint, rhs.actionPrint).append(actionUpdate, rhs.actionUpdate).append(dataKeyTutoremployeeEmployee, rhs.dataKeyTutoremployeeEmployee).append(dataKeyNotenumberNoteheader, rhs.dataKeyNotenumberNoteheader).append(actionDuplicateexpensesheet, rhs.actionDuplicateexpensesheet).append(additionalProperties, rhs.additionalProperties).append(actionAttachdocument, rhs.actionAttachdocument).append(dataKeyCopyfromexpensesheetnumberExpensesheetheader, rhs.dataKeyCopyfromexpensesheetnumberExpensesheetheader).append(dataKeyHeaderapprovalApprovalheader, rhs.dataKeyHeaderapprovalApprovalheader).append(actionExportdataset, rhs.actionExportdataset).append(actionDelete, rhs.actionDelete).append(dataKeyExpensesheetemployeenumberEmployee, rhs.dataKeyExpensesheetemployeenumberEmployee).isEquals();
    }

}
