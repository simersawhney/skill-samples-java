
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
    "data:key:headerapproval_approvalheader",
    "data:key:documentarchivenumber_documentarchiveheader",
    "data:key:approvalgroupinstancekey_approvalgroup",
    "data:key:notenumber_noteheader",
    "data:key:instancekey_expensesheetline",
    "data:key:approveraccessinstancekey_approveraccessheader",
    "data:key:secretaryemployee_employee",
    "data:key:companynumber_companyinformation",
    "data:key:superioremployee_employee",
    "data:key:expensesheetemployeenumber_employee",
    "data:key:jobnumber_jobheader",
    "data:key:headerapproval_approvalline",
    "data:key:copyfromexpensesheetnumber_expensesheetheader",
    "data:key:tutoremployee_employee",
    "action:insert",
    "action:create",
    "action:print",
    "action:reopenexpensesheet",
    "action:duplicateexpensesheet",
    "action:actionsequence",
    "action:runreport",
    "action:emailonaction",
    "action:exportdataset"
})
public class Links {

    @JsonProperty("data:key:headerapproval_approvalheader")
    private DataKeyHeaderapprovalApprovalheader dataKeyHeaderapprovalApprovalheader;
    @JsonProperty("data:key:documentarchivenumber_documentarchiveheader")
    private DataKeyDocumentarchivenumberDocumentarchiveheader dataKeyDocumentarchivenumberDocumentarchiveheader;
    @JsonProperty("data:key:approvalgroupinstancekey_approvalgroup")
    private DataKeyApprovalgroupinstancekeyApprovalgroup dataKeyApprovalgroupinstancekeyApprovalgroup;
    @JsonProperty("data:key:notenumber_noteheader")
    private DataKeyNotenumberNoteheader dataKeyNotenumberNoteheader;
    @JsonProperty("data:key:instancekey_expensesheetline")
    private DataKeyInstancekeyExpensesheetline dataKeyInstancekeyExpensesheetline;
    @JsonProperty("data:key:approveraccessinstancekey_approveraccessheader")
    private DataKeyApproveraccessinstancekeyApproveraccessheader dataKeyApproveraccessinstancekeyApproveraccessheader;
    @JsonProperty("data:key:secretaryemployee_employee")
    private DataKeySecretaryemployeeEmployee dataKeySecretaryemployeeEmployee;
    @JsonProperty("data:key:companynumber_companyinformation")
    private DataKeyCompanynumberCompanyinformation dataKeyCompanynumberCompanyinformation;
    @JsonProperty("data:key:superioremployee_employee")
    private DataKeySuperioremployeeEmployee dataKeySuperioremployeeEmployee;
    @JsonProperty("data:key:expensesheetemployeenumber_employee")
    private DataKeyExpensesheetemployeenumberEmployee dataKeyExpensesheetemployeenumberEmployee;
    @JsonProperty("data:key:jobnumber_jobheader")
    private DataKeyJobnumberJobheader dataKeyJobnumberJobheader;
    @JsonProperty("data:key:headerapproval_approvalline")
    private DataKeyHeaderapprovalApprovalline dataKeyHeaderapprovalApprovalline;
    @JsonProperty("data:key:copyfromexpensesheetnumber_expensesheetheader")
    private DataKeyCopyfromexpensesheetnumberExpensesheetheader dataKeyCopyfromexpensesheetnumberExpensesheetheader;
    @JsonProperty("data:key:tutoremployee_employee")
    private DataKeyTutoremployeeEmployee dataKeyTutoremployeeEmployee;
    @JsonProperty("action:insert")
    private ActionInsert actionInsert;
    @JsonProperty("action:create")
    private ActionCreate actionCreate;
    @JsonProperty("action:print")
    private ActionPrint actionPrint;
    @JsonProperty("action:reopenexpensesheet")
    private ActionReopenexpensesheet actionReopenexpensesheet;
    @JsonProperty("action:duplicateexpensesheet")
    private ActionDuplicateexpensesheet actionDuplicateexpensesheet;
    @JsonProperty("action:actionsequence")
    private ActionActionsequence actionActionsequence;
    @JsonProperty("action:runreport")
    private ActionRunreport actionRunreport;
    @JsonProperty("action:emailonaction")
    private ActionEmailonaction actionEmailonaction;
    @JsonProperty("action:exportdataset")
    private ActionExportdataset actionExportdataset;
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
     * @param dataKeySecretaryemployeeEmployee
     * @param dataKeyTutoremployeeEmployee
     * @param actionRunreport
     * @param actionReopenexpensesheet
     * @param actionCreate
     * @param actionPrint
     * @param dataKeyExpensesheetemployeenumberEmployee
     * @param actionDuplicateexpensesheet
     * @param dataKeyApprovalgroupinstancekeyApprovalgroup
     * @param dataKeyCompanynumberCompanyinformation
     * @param dataKeyJobnumberJobheader
     * @param dataKeySuperioremployeeEmployee
     * @param actionInsert
     * @param dataKeyInstancekeyExpensesheetline
     * @param dataKeyDocumentarchivenumberDocumentarchiveheader
     * @param dataKeyNotenumberNoteheader
     * @param actionEmailonaction
     * @param dataKeyApproveraccessinstancekeyApproveraccessheader
     * @param actionActionsequence
     * @param actionExportdataset
     * @param dataKeyHeaderapprovalApprovalheader
     * @param dataKeyCopyfromexpensesheetnumberExpensesheetheader
     * @param dataKeyHeaderapprovalApprovalline
     */
    public Links(DataKeyHeaderapprovalApprovalheader dataKeyHeaderapprovalApprovalheader, DataKeyDocumentarchivenumberDocumentarchiveheader dataKeyDocumentarchivenumberDocumentarchiveheader, DataKeyApprovalgroupinstancekeyApprovalgroup dataKeyApprovalgroupinstancekeyApprovalgroup, DataKeyNotenumberNoteheader dataKeyNotenumberNoteheader, DataKeyInstancekeyExpensesheetline dataKeyInstancekeyExpensesheetline, DataKeyApproveraccessinstancekeyApproveraccessheader dataKeyApproveraccessinstancekeyApproveraccessheader, DataKeySecretaryemployeeEmployee dataKeySecretaryemployeeEmployee, DataKeyCompanynumberCompanyinformation dataKeyCompanynumberCompanyinformation, DataKeySuperioremployeeEmployee dataKeySuperioremployeeEmployee, DataKeyExpensesheetemployeenumberEmployee dataKeyExpensesheetemployeenumberEmployee, DataKeyJobnumberJobheader dataKeyJobnumberJobheader, DataKeyHeaderapprovalApprovalline dataKeyHeaderapprovalApprovalline, DataKeyCopyfromexpensesheetnumberExpensesheetheader dataKeyCopyfromexpensesheetnumberExpensesheetheader, DataKeyTutoremployeeEmployee dataKeyTutoremployeeEmployee, ActionInsert actionInsert, ActionCreate actionCreate, ActionPrint actionPrint, ActionReopenexpensesheet actionReopenexpensesheet, ActionDuplicateexpensesheet actionDuplicateexpensesheet, ActionActionsequence actionActionsequence, ActionRunreport actionRunreport, ActionEmailonaction actionEmailonaction, ActionExportdataset actionExportdataset) {
        this.dataKeyHeaderapprovalApprovalheader = dataKeyHeaderapprovalApprovalheader;
        this.dataKeyDocumentarchivenumberDocumentarchiveheader = dataKeyDocumentarchivenumberDocumentarchiveheader;
        this.dataKeyApprovalgroupinstancekeyApprovalgroup = dataKeyApprovalgroupinstancekeyApprovalgroup;
        this.dataKeyNotenumberNoteheader = dataKeyNotenumberNoteheader;
        this.dataKeyInstancekeyExpensesheetline = dataKeyInstancekeyExpensesheetline;
        this.dataKeyApproveraccessinstancekeyApproveraccessheader = dataKeyApproveraccessinstancekeyApproveraccessheader;
        this.dataKeySecretaryemployeeEmployee = dataKeySecretaryemployeeEmployee;
        this.dataKeyCompanynumberCompanyinformation = dataKeyCompanynumberCompanyinformation;
        this.dataKeySuperioremployeeEmployee = dataKeySuperioremployeeEmployee;
        this.dataKeyExpensesheetemployeenumberEmployee = dataKeyExpensesheetemployeenumberEmployee;
        this.dataKeyJobnumberJobheader = dataKeyJobnumberJobheader;
        this.dataKeyHeaderapprovalApprovalline = dataKeyHeaderapprovalApprovalline;
        this.dataKeyCopyfromexpensesheetnumberExpensesheetheader = dataKeyCopyfromexpensesheetnumberExpensesheetheader;
        this.dataKeyTutoremployeeEmployee = dataKeyTutoremployeeEmployee;
        this.actionInsert = actionInsert;
        this.actionCreate = actionCreate;
        this.actionPrint = actionPrint;
        this.actionReopenexpensesheet = actionReopenexpensesheet;
        this.actionDuplicateexpensesheet = actionDuplicateexpensesheet;
        this.actionActionsequence = actionActionsequence;
        this.actionRunreport = actionRunreport;
        this.actionEmailonaction = actionEmailonaction;
        this.actionExportdataset = actionExportdataset;
    }

    /**
     * 
     * @return
     *     The dataKeyHeaderapprovalApprovalheader
     */
    @JsonProperty("data:key:headerapproval_approvalheader")
    public DataKeyHeaderapprovalApprovalheader getDataKeyHeaderapprovalApprovalheader() {
        return dataKeyHeaderapprovalApprovalheader;
    }

    /**
     * 
     * @param dataKeyHeaderapprovalApprovalheader
     *     The data:key:headerapproval_approvalheader
     */
    @JsonProperty("data:key:headerapproval_approvalheader")
    public void setDataKeyHeaderapprovalApprovalheader(DataKeyHeaderapprovalApprovalheader dataKeyHeaderapprovalApprovalheader) {
        this.dataKeyHeaderapprovalApprovalheader = dataKeyHeaderapprovalApprovalheader;
    }

    /**
     * 
     * @return
     *     The dataKeyDocumentarchivenumberDocumentarchiveheader
     */
    @JsonProperty("data:key:documentarchivenumber_documentarchiveheader")
    public DataKeyDocumentarchivenumberDocumentarchiveheader getDataKeyDocumentarchivenumberDocumentarchiveheader() {
        return dataKeyDocumentarchivenumberDocumentarchiveheader;
    }

    /**
     * 
     * @param dataKeyDocumentarchivenumberDocumentarchiveheader
     *     The data:key:documentarchivenumber_documentarchiveheader
     */
    @JsonProperty("data:key:documentarchivenumber_documentarchiveheader")
    public void setDataKeyDocumentarchivenumberDocumentarchiveheader(DataKeyDocumentarchivenumberDocumentarchiveheader dataKeyDocumentarchivenumberDocumentarchiveheader) {
        this.dataKeyDocumentarchivenumberDocumentarchiveheader = dataKeyDocumentarchivenumberDocumentarchiveheader;
    }

    /**
     * 
     * @return
     *     The dataKeyApprovalgroupinstancekeyApprovalgroup
     */
    @JsonProperty("data:key:approvalgroupinstancekey_approvalgroup")
    public DataKeyApprovalgroupinstancekeyApprovalgroup getDataKeyApprovalgroupinstancekeyApprovalgroup() {
        return dataKeyApprovalgroupinstancekeyApprovalgroup;
    }

    /**
     * 
     * @param dataKeyApprovalgroupinstancekeyApprovalgroup
     *     The data:key:approvalgroupinstancekey_approvalgroup
     */
    @JsonProperty("data:key:approvalgroupinstancekey_approvalgroup")
    public void setDataKeyApprovalgroupinstancekeyApprovalgroup(DataKeyApprovalgroupinstancekeyApprovalgroup dataKeyApprovalgroupinstancekeyApprovalgroup) {
        this.dataKeyApprovalgroupinstancekeyApprovalgroup = dataKeyApprovalgroupinstancekeyApprovalgroup;
    }

    /**
     * 
     * @return
     *     The dataKeyNotenumberNoteheader
     */
    @JsonProperty("data:key:notenumber_noteheader")
    public DataKeyNotenumberNoteheader getDataKeyNotenumberNoteheader() {
        return dataKeyNotenumberNoteheader;
    }

    /**
     * 
     * @param dataKeyNotenumberNoteheader
     *     The data:key:notenumber_noteheader
     */
    @JsonProperty("data:key:notenumber_noteheader")
    public void setDataKeyNotenumberNoteheader(DataKeyNotenumberNoteheader dataKeyNotenumberNoteheader) {
        this.dataKeyNotenumberNoteheader = dataKeyNotenumberNoteheader;
    }

    /**
     * 
     * @return
     *     The dataKeyInstancekeyExpensesheetline
     */
    @JsonProperty("data:key:instancekey_expensesheetline")
    public DataKeyInstancekeyExpensesheetline getDataKeyInstancekeyExpensesheetline() {
        return dataKeyInstancekeyExpensesheetline;
    }

    /**
     * 
     * @param dataKeyInstancekeyExpensesheetline
     *     The data:key:instancekey_expensesheetline
     */
    @JsonProperty("data:key:instancekey_expensesheetline")
    public void setDataKeyInstancekeyExpensesheetline(DataKeyInstancekeyExpensesheetline dataKeyInstancekeyExpensesheetline) {
        this.dataKeyInstancekeyExpensesheetline = dataKeyInstancekeyExpensesheetline;
    }

    /**
     * 
     * @return
     *     The dataKeyApproveraccessinstancekeyApproveraccessheader
     */
    @JsonProperty("data:key:approveraccessinstancekey_approveraccessheader")
    public DataKeyApproveraccessinstancekeyApproveraccessheader getDataKeyApproveraccessinstancekeyApproveraccessheader() {
        return dataKeyApproveraccessinstancekeyApproveraccessheader;
    }

    /**
     * 
     * @param dataKeyApproveraccessinstancekeyApproveraccessheader
     *     The data:key:approveraccessinstancekey_approveraccessheader
     */
    @JsonProperty("data:key:approveraccessinstancekey_approveraccessheader")
    public void setDataKeyApproveraccessinstancekeyApproveraccessheader(DataKeyApproveraccessinstancekeyApproveraccessheader dataKeyApproveraccessinstancekeyApproveraccessheader) {
        this.dataKeyApproveraccessinstancekeyApproveraccessheader = dataKeyApproveraccessinstancekeyApproveraccessheader;
    }

    /**
     * 
     * @return
     *     The dataKeySecretaryemployeeEmployee
     */
    @JsonProperty("data:key:secretaryemployee_employee")
    public DataKeySecretaryemployeeEmployee getDataKeySecretaryemployeeEmployee() {
        return dataKeySecretaryemployeeEmployee;
    }

    /**
     * 
     * @param dataKeySecretaryemployeeEmployee
     *     The data:key:secretaryemployee_employee
     */
    @JsonProperty("data:key:secretaryemployee_employee")
    public void setDataKeySecretaryemployeeEmployee(DataKeySecretaryemployeeEmployee dataKeySecretaryemployeeEmployee) {
        this.dataKeySecretaryemployeeEmployee = dataKeySecretaryemployeeEmployee;
    }

    /**
     * 
     * @return
     *     The dataKeyCompanynumberCompanyinformation
     */
    @JsonProperty("data:key:companynumber_companyinformation")
    public DataKeyCompanynumberCompanyinformation getDataKeyCompanynumberCompanyinformation() {
        return dataKeyCompanynumberCompanyinformation;
    }

    /**
     * 
     * @param dataKeyCompanynumberCompanyinformation
     *     The data:key:companynumber_companyinformation
     */
    @JsonProperty("data:key:companynumber_companyinformation")
    public void setDataKeyCompanynumberCompanyinformation(DataKeyCompanynumberCompanyinformation dataKeyCompanynumberCompanyinformation) {
        this.dataKeyCompanynumberCompanyinformation = dataKeyCompanynumberCompanyinformation;
    }

    /**
     * 
     * @return
     *     The dataKeySuperioremployeeEmployee
     */
    @JsonProperty("data:key:superioremployee_employee")
    public DataKeySuperioremployeeEmployee getDataKeySuperioremployeeEmployee() {
        return dataKeySuperioremployeeEmployee;
    }

    /**
     * 
     * @param dataKeySuperioremployeeEmployee
     *     The data:key:superioremployee_employee
     */
    @JsonProperty("data:key:superioremployee_employee")
    public void setDataKeySuperioremployeeEmployee(DataKeySuperioremployeeEmployee dataKeySuperioremployeeEmployee) {
        this.dataKeySuperioremployeeEmployee = dataKeySuperioremployeeEmployee;
    }

    /**
     * 
     * @return
     *     The dataKeyExpensesheetemployeenumberEmployee
     */
    @JsonProperty("data:key:expensesheetemployeenumber_employee")
    public DataKeyExpensesheetemployeenumberEmployee getDataKeyExpensesheetemployeenumberEmployee() {
        return dataKeyExpensesheetemployeenumberEmployee;
    }

    /**
     * 
     * @param dataKeyExpensesheetemployeenumberEmployee
     *     The data:key:expensesheetemployeenumber_employee
     */
    @JsonProperty("data:key:expensesheetemployeenumber_employee")
    public void setDataKeyExpensesheetemployeenumberEmployee(DataKeyExpensesheetemployeenumberEmployee dataKeyExpensesheetemployeenumberEmployee) {
        this.dataKeyExpensesheetemployeenumberEmployee = dataKeyExpensesheetemployeenumberEmployee;
    }

    /**
     * 
     * @return
     *     The dataKeyJobnumberJobheader
     */
    @JsonProperty("data:key:jobnumber_jobheader")
    public DataKeyJobnumberJobheader getDataKeyJobnumberJobheader() {
        return dataKeyJobnumberJobheader;
    }

    /**
     * 
     * @param dataKeyJobnumberJobheader
     *     The data:key:jobnumber_jobheader
     */
    @JsonProperty("data:key:jobnumber_jobheader")
    public void setDataKeyJobnumberJobheader(DataKeyJobnumberJobheader dataKeyJobnumberJobheader) {
        this.dataKeyJobnumberJobheader = dataKeyJobnumberJobheader;
    }

    /**
     * 
     * @return
     *     The dataKeyHeaderapprovalApprovalline
     */
    @JsonProperty("data:key:headerapproval_approvalline")
    public DataKeyHeaderapprovalApprovalline getDataKeyHeaderapprovalApprovalline() {
        return dataKeyHeaderapprovalApprovalline;
    }

    /**
     * 
     * @param dataKeyHeaderapprovalApprovalline
     *     The data:key:headerapproval_approvalline
     */
    @JsonProperty("data:key:headerapproval_approvalline")
    public void setDataKeyHeaderapprovalApprovalline(DataKeyHeaderapprovalApprovalline dataKeyHeaderapprovalApprovalline) {
        this.dataKeyHeaderapprovalApprovalline = dataKeyHeaderapprovalApprovalline;
    }

    /**
     * 
     * @return
     *     The dataKeyCopyfromexpensesheetnumberExpensesheetheader
     */
    @JsonProperty("data:key:copyfromexpensesheetnumber_expensesheetheader")
    public DataKeyCopyfromexpensesheetnumberExpensesheetheader getDataKeyCopyfromexpensesheetnumberExpensesheetheader() {
        return dataKeyCopyfromexpensesheetnumberExpensesheetheader;
    }

    /**
     * 
     * @param dataKeyCopyfromexpensesheetnumberExpensesheetheader
     *     The data:key:copyfromexpensesheetnumber_expensesheetheader
     */
    @JsonProperty("data:key:copyfromexpensesheetnumber_expensesheetheader")
    public void setDataKeyCopyfromexpensesheetnumberExpensesheetheader(DataKeyCopyfromexpensesheetnumberExpensesheetheader dataKeyCopyfromexpensesheetnumberExpensesheetheader) {
        this.dataKeyCopyfromexpensesheetnumberExpensesheetheader = dataKeyCopyfromexpensesheetnumberExpensesheetheader;
    }

    /**
     * 
     * @return
     *     The dataKeyTutoremployeeEmployee
     */
    @JsonProperty("data:key:tutoremployee_employee")
    public DataKeyTutoremployeeEmployee getDataKeyTutoremployeeEmployee() {
        return dataKeyTutoremployeeEmployee;
    }

    /**
     * 
     * @param dataKeyTutoremployeeEmployee
     *     The data:key:tutoremployee_employee
     */
    @JsonProperty("data:key:tutoremployee_employee")
    public void setDataKeyTutoremployeeEmployee(DataKeyTutoremployeeEmployee dataKeyTutoremployeeEmployee) {
        this.dataKeyTutoremployeeEmployee = dataKeyTutoremployeeEmployee;
    }

    /**
     * 
     * @return
     *     The actionInsert
     */
    @JsonProperty("action:insert")
    public ActionInsert getActionInsert() {
        return actionInsert;
    }

    /**
     * 
     * @param actionInsert
     *     The action:insert
     */
    @JsonProperty("action:insert")
    public void setActionInsert(ActionInsert actionInsert) {
        this.actionInsert = actionInsert;
    }

    /**
     * 
     * @return
     *     The actionCreate
     */
    @JsonProperty("action:create")
    public ActionCreate getActionCreate() {
        return actionCreate;
    }

    /**
     * 
     * @param actionCreate
     *     The action:create
     */
    @JsonProperty("action:create")
    public void setActionCreate(ActionCreate actionCreate) {
        this.actionCreate = actionCreate;
    }

    /**
     * 
     * @return
     *     The actionPrint
     */
    @JsonProperty("action:print")
    public ActionPrint getActionPrint() {
        return actionPrint;
    }

    /**
     * 
     * @param actionPrint
     *     The action:print
     */
    @JsonProperty("action:print")
    public void setActionPrint(ActionPrint actionPrint) {
        this.actionPrint = actionPrint;
    }

    /**
     * 
     * @return
     *     The actionReopenexpensesheet
     */
    @JsonProperty("action:reopenexpensesheet")
    public ActionReopenexpensesheet getActionReopenexpensesheet() {
        return actionReopenexpensesheet;
    }

    /**
     * 
     * @param actionReopenexpensesheet
     *     The action:reopenexpensesheet
     */
    @JsonProperty("action:reopenexpensesheet")
    public void setActionReopenexpensesheet(ActionReopenexpensesheet actionReopenexpensesheet) {
        this.actionReopenexpensesheet = actionReopenexpensesheet;
    }

    /**
     * 
     * @return
     *     The actionDuplicateexpensesheet
     */
    @JsonProperty("action:duplicateexpensesheet")
    public ActionDuplicateexpensesheet getActionDuplicateexpensesheet() {
        return actionDuplicateexpensesheet;
    }

    /**
     * 
     * @param actionDuplicateexpensesheet
     *     The action:duplicateexpensesheet
     */
    @JsonProperty("action:duplicateexpensesheet")
    public void setActionDuplicateexpensesheet(ActionDuplicateexpensesheet actionDuplicateexpensesheet) {
        this.actionDuplicateexpensesheet = actionDuplicateexpensesheet;
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
        return new HashCodeBuilder().append(dataKeyHeaderapprovalApprovalheader).append(dataKeyDocumentarchivenumberDocumentarchiveheader).append(dataKeyApprovalgroupinstancekeyApprovalgroup).append(dataKeyNotenumberNoteheader).append(dataKeyInstancekeyExpensesheetline).append(dataKeyApproveraccessinstancekeyApproveraccessheader).append(dataKeySecretaryemployeeEmployee).append(dataKeyCompanynumberCompanyinformation).append(dataKeySuperioremployeeEmployee).append(dataKeyExpensesheetemployeenumberEmployee).append(dataKeyJobnumberJobheader).append(dataKeyHeaderapprovalApprovalline).append(dataKeyCopyfromexpensesheetnumberExpensesheetheader).append(dataKeyTutoremployeeEmployee).append(actionInsert).append(actionCreate).append(actionPrint).append(actionReopenexpensesheet).append(actionDuplicateexpensesheet).append(actionActionsequence).append(actionRunreport).append(actionEmailonaction).append(actionExportdataset).append(additionalProperties).toHashCode();
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
        return new EqualsBuilder().append(dataKeyHeaderapprovalApprovalheader, rhs.dataKeyHeaderapprovalApprovalheader).append(dataKeyDocumentarchivenumberDocumentarchiveheader, rhs.dataKeyDocumentarchivenumberDocumentarchiveheader).append(dataKeyApprovalgroupinstancekeyApprovalgroup, rhs.dataKeyApprovalgroupinstancekeyApprovalgroup).append(dataKeyNotenumberNoteheader, rhs.dataKeyNotenumberNoteheader).append(dataKeyInstancekeyExpensesheetline, rhs.dataKeyInstancekeyExpensesheetline).append(dataKeyApproveraccessinstancekeyApproveraccessheader, rhs.dataKeyApproveraccessinstancekeyApproveraccessheader).append(dataKeySecretaryemployeeEmployee, rhs.dataKeySecretaryemployeeEmployee).append(dataKeyCompanynumberCompanyinformation, rhs.dataKeyCompanynumberCompanyinformation).append(dataKeySuperioremployeeEmployee, rhs.dataKeySuperioremployeeEmployee).append(dataKeyExpensesheetemployeenumberEmployee, rhs.dataKeyExpensesheetemployeenumberEmployee).append(dataKeyJobnumberJobheader, rhs.dataKeyJobnumberJobheader).append(dataKeyHeaderapprovalApprovalline, rhs.dataKeyHeaderapprovalApprovalline).append(dataKeyCopyfromexpensesheetnumberExpensesheetheader, rhs.dataKeyCopyfromexpensesheetnumberExpensesheetheader).append(dataKeyTutoremployeeEmployee, rhs.dataKeyTutoremployeeEmployee).append(actionInsert, rhs.actionInsert).append(actionCreate, rhs.actionCreate).append(actionPrint, rhs.actionPrint).append(actionReopenexpensesheet, rhs.actionReopenexpensesheet).append(actionDuplicateexpensesheet, rhs.actionDuplicateexpensesheet).append(actionActionsequence, rhs.actionActionsequence).append(actionRunreport, rhs.actionRunreport).append(actionEmailonaction, rhs.actionEmailonaction).append(actionExportdataset, rhs.actionExportdataset).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
