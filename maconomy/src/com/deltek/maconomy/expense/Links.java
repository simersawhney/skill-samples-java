
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
    "data:key:companynumber_companyinformation",
    "data:key:projectname_project",
    "data:key:expensesheetnumber_expensesheetheader",
    "data:key:financevatcode3_financevatcode",
    "data:key:specification1name_specification1",
    "data:key:employeenumber_employee",
    "data:key:favorite_jobfavorite",
    "data:key:financevatcode_financevatcode",
    "data:key:locationname_location",
    "data:key:transferredvatspecificationentry_vatspecificationentry",
    "data:key:timesheetlineinstancekey_timesheetline",
    "data:key:financevatcode2_financevatcode",
    "data:key:entityname_entity",
    "data:key:specification3name_specification3",
    "data:key:purposename_purpose",
    "data:key:favorite_expensemileagejobfavorite",
    "data:key:activitynumber_activity",
    "data:key:specification2name_specification2",
    "data:key:activitynumber_expensemileageactivity",
    "data:key:jobnumber_jobheader",
    "data:key:lineapproval_approvalline",
    "data:key:lineapproval_approvalheader",
    "data:key:instancekey_noteheader",
    "action:insert",
    "action:create",
    "action:update",
    "action:delete",
    "action:print",
    "action:exportdataset",
    "action:emailonaction",
    "action:createjobfavorite",
    "action:actionsequence",
    "action:runreport",
    "action:attachdocumenttoline"
})
public class Links {

    @JsonProperty("data:key:companynumber_companyinformation")
    private DataKeyCompanynumberCompanyinformation dataKeyCompanynumberCompanyinformation;
    @JsonProperty("data:key:projectname_project")
    private DataKeyProjectnameProject dataKeyProjectnameProject;
    @JsonProperty("data:key:expensesheetnumber_expensesheetheader")
    private DataKeyExpensesheetnumberExpensesheetheader dataKeyExpensesheetnumberExpensesheetheader;
    @JsonProperty("data:key:financevatcode3_financevatcode")
    private DataKeyFinancevatcode3Financevatcode dataKeyFinancevatcode3Financevatcode;
    @JsonProperty("data:key:specification1name_specification1")
    private DataKeySpecification1nameSpecification1 dataKeySpecification1nameSpecification1;
    @JsonProperty("data:key:employeenumber_employee")
    private DataKeyEmployeenumberEmployee dataKeyEmployeenumberEmployee;
    @JsonProperty("data:key:favorite_jobfavorite")
    private DataKeyFavoriteJobfavorite dataKeyFavoriteJobfavorite;
    @JsonProperty("data:key:financevatcode_financevatcode")
    private DataKeyFinancevatcodeFinancevatcode dataKeyFinancevatcodeFinancevatcode;
    @JsonProperty("data:key:locationname_location")
    private DataKeyLocationnameLocation dataKeyLocationnameLocation;
    @JsonProperty("data:key:transferredvatspecificationentry_vatspecificationentry")
    private DataKeyTransferredvatspecificationentryVatspecificationentry dataKeyTransferredvatspecificationentryVatspecificationentry;
    @JsonProperty("data:key:timesheetlineinstancekey_timesheetline")
    private DataKeyTimesheetlineinstancekeyTimesheetline dataKeyTimesheetlineinstancekeyTimesheetline;
    @JsonProperty("data:key:financevatcode2_financevatcode")
    private DataKeyFinancevatcode2Financevatcode dataKeyFinancevatcode2Financevatcode;
    @JsonProperty("data:key:entityname_entity")
    private DataKeyEntitynameEntity dataKeyEntitynameEntity;
    @JsonProperty("data:key:specification3name_specification3")
    private DataKeySpecification3nameSpecification3 dataKeySpecification3nameSpecification3;
    @JsonProperty("data:key:purposename_purpose")
    private DataKeyPurposenamePurpose dataKeyPurposenamePurpose;
    @JsonProperty("data:key:favorite_expensemileagejobfavorite")
    private DataKeyFavoriteExpensemileagejobfavorite dataKeyFavoriteExpensemileagejobfavorite;
    @JsonProperty("data:key:activitynumber_activity")
    private DataKeyActivitynumberActivity dataKeyActivitynumberActivity;
    @JsonProperty("data:key:specification2name_specification2")
    private DataKeySpecification2nameSpecification2 dataKeySpecification2nameSpecification2;
    @JsonProperty("data:key:activitynumber_expensemileageactivity")
    private DataKeyActivitynumberExpensemileageactivity dataKeyActivitynumberExpensemileageactivity;
    @JsonProperty("data:key:jobnumber_jobheader")
    private DataKeyJobnumberJobheader dataKeyJobnumberJobheader;
    @JsonProperty("data:key:lineapproval_approvalline")
    private DataKeyLineapprovalApprovalline dataKeyLineapprovalApprovalline;
    @JsonProperty("data:key:lineapproval_approvalheader")
    private DataKeyLineapprovalApprovalheader dataKeyLineapprovalApprovalheader;
    @JsonProperty("data:key:instancekey_noteheader")
    private DataKeyInstancekeyNoteheader dataKeyInstancekeyNoteheader;
    @JsonProperty("action:insert")
    private ActionInsert actionInsert;
    @JsonProperty("action:create")
    private ActionCreate actionCreate;
    @JsonProperty("action:update")
    private ActionUpdate actionUpdate;
    @JsonProperty("action:delete")
    private ActionDelete actionDelete;
    @JsonProperty("action:print")
    private ActionPrint actionPrint;
    @JsonProperty("action:exportdataset")
    private ActionExportdataset actionExportdataset;
    @JsonProperty("action:emailonaction")
    private ActionEmailonaction actionEmailonaction;
    @JsonProperty("action:createjobfavorite")
    private ActionCreatejobfavorite actionCreatejobfavorite;
    @JsonProperty("action:actionsequence")
    private ActionActionsequence actionActionsequence;
    @JsonProperty("action:runreport")
    private ActionRunreport actionRunreport;
    @JsonProperty("action:attachdocumenttoline")
    private ActionAttachdocumenttoline actionAttachdocumenttoline;
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
     * @param actionEmailonaction
     * @param dataKeySpecification1nameSpecification1
     * @param actionActionsequence
     * @param dataKeyFinancevatcode2Financevatcode
     * @param dataKeyTimesheetlineinstancekeyTimesheetline
     * @param dataKeyFavoriteExpensemileagejobfavorite
     * @param actionCreatejobfavorite
     * @param dataKeyEmployeenumberEmployee
     * @param dataKeyEntitynameEntity
     * @param actionCreate
     * @param dataKeyTransferredvatspecificationentryVatspecificationentry
     * @param dataKeyActivitynumberActivity
     * @param dataKeyLocationnameLocation
     * @param actionRunreport
     * @param dataKeyLineapprovalApprovalheader
     * @param dataKeyActivitynumberExpensemileageactivity
     * @param dataKeyInstancekeyNoteheader
     * @param actionInsert
     * @param dataKeyPurposenamePurpose
     * @param dataKeyJobnumberJobheader
     * @param dataKeyFavoriteJobfavorite
     * @param dataKeyFinancevatcodeFinancevatcode
     * @param dataKeyExpensesheetnumberExpensesheetheader
     * @param dataKeyCompanynumberCompanyinformation
     * @param actionPrint
     * @param dataKeyFinancevatcode3Financevatcode
     * @param dataKeyLineapprovalApprovalline
     * @param actionUpdate
     * @param dataKeyProjectnameProject
     * @param dataKeySpecification2nameSpecification2
     * @param actionExportdataset
     * @param actionDelete
     * @param actionAttachdocumenttoline
     * @param dataKeySpecification3nameSpecification3
     */
    public Links(DataKeyCompanynumberCompanyinformation dataKeyCompanynumberCompanyinformation, DataKeyProjectnameProject dataKeyProjectnameProject, DataKeyExpensesheetnumberExpensesheetheader dataKeyExpensesheetnumberExpensesheetheader, DataKeyFinancevatcode3Financevatcode dataKeyFinancevatcode3Financevatcode, DataKeySpecification1nameSpecification1 dataKeySpecification1nameSpecification1, DataKeyEmployeenumberEmployee dataKeyEmployeenumberEmployee, DataKeyFavoriteJobfavorite dataKeyFavoriteJobfavorite, DataKeyFinancevatcodeFinancevatcode dataKeyFinancevatcodeFinancevatcode, DataKeyLocationnameLocation dataKeyLocationnameLocation, DataKeyTransferredvatspecificationentryVatspecificationentry dataKeyTransferredvatspecificationentryVatspecificationentry, DataKeyTimesheetlineinstancekeyTimesheetline dataKeyTimesheetlineinstancekeyTimesheetline, DataKeyFinancevatcode2Financevatcode dataKeyFinancevatcode2Financevatcode, DataKeyEntitynameEntity dataKeyEntitynameEntity, DataKeySpecification3nameSpecification3 dataKeySpecification3nameSpecification3, DataKeyPurposenamePurpose dataKeyPurposenamePurpose, DataKeyFavoriteExpensemileagejobfavorite dataKeyFavoriteExpensemileagejobfavorite, DataKeyActivitynumberActivity dataKeyActivitynumberActivity, DataKeySpecification2nameSpecification2 dataKeySpecification2nameSpecification2, DataKeyActivitynumberExpensemileageactivity dataKeyActivitynumberExpensemileageactivity, DataKeyJobnumberJobheader dataKeyJobnumberJobheader, DataKeyLineapprovalApprovalline dataKeyLineapprovalApprovalline, DataKeyLineapprovalApprovalheader dataKeyLineapprovalApprovalheader, DataKeyInstancekeyNoteheader dataKeyInstancekeyNoteheader, ActionInsert actionInsert, ActionCreate actionCreate, ActionUpdate actionUpdate, ActionDelete actionDelete, ActionPrint actionPrint, ActionExportdataset actionExportdataset, ActionEmailonaction actionEmailonaction, ActionCreatejobfavorite actionCreatejobfavorite, ActionActionsequence actionActionsequence, ActionRunreport actionRunreport, ActionAttachdocumenttoline actionAttachdocumenttoline) {
        super();
        this.dataKeyCompanynumberCompanyinformation = dataKeyCompanynumberCompanyinformation;
        this.dataKeyProjectnameProject = dataKeyProjectnameProject;
        this.dataKeyExpensesheetnumberExpensesheetheader = dataKeyExpensesheetnumberExpensesheetheader;
        this.dataKeyFinancevatcode3Financevatcode = dataKeyFinancevatcode3Financevatcode;
        this.dataKeySpecification1nameSpecification1 = dataKeySpecification1nameSpecification1;
        this.dataKeyEmployeenumberEmployee = dataKeyEmployeenumberEmployee;
        this.dataKeyFavoriteJobfavorite = dataKeyFavoriteJobfavorite;
        this.dataKeyFinancevatcodeFinancevatcode = dataKeyFinancevatcodeFinancevatcode;
        this.dataKeyLocationnameLocation = dataKeyLocationnameLocation;
        this.dataKeyTransferredvatspecificationentryVatspecificationentry = dataKeyTransferredvatspecificationentryVatspecificationentry;
        this.dataKeyTimesheetlineinstancekeyTimesheetline = dataKeyTimesheetlineinstancekeyTimesheetline;
        this.dataKeyFinancevatcode2Financevatcode = dataKeyFinancevatcode2Financevatcode;
        this.dataKeyEntitynameEntity = dataKeyEntitynameEntity;
        this.dataKeySpecification3nameSpecification3 = dataKeySpecification3nameSpecification3;
        this.dataKeyPurposenamePurpose = dataKeyPurposenamePurpose;
        this.dataKeyFavoriteExpensemileagejobfavorite = dataKeyFavoriteExpensemileagejobfavorite;
        this.dataKeyActivitynumberActivity = dataKeyActivitynumberActivity;
        this.dataKeySpecification2nameSpecification2 = dataKeySpecification2nameSpecification2;
        this.dataKeyActivitynumberExpensemileageactivity = dataKeyActivitynumberExpensemileageactivity;
        this.dataKeyJobnumberJobheader = dataKeyJobnumberJobheader;
        this.dataKeyLineapprovalApprovalline = dataKeyLineapprovalApprovalline;
        this.dataKeyLineapprovalApprovalheader = dataKeyLineapprovalApprovalheader;
        this.dataKeyInstancekeyNoteheader = dataKeyInstancekeyNoteheader;
        this.actionInsert = actionInsert;
        this.actionCreate = actionCreate;
        this.actionUpdate = actionUpdate;
        this.actionDelete = actionDelete;
        this.actionPrint = actionPrint;
        this.actionExportdataset = actionExportdataset;
        this.actionEmailonaction = actionEmailonaction;
        this.actionCreatejobfavorite = actionCreatejobfavorite;
        this.actionActionsequence = actionActionsequence;
        this.actionRunreport = actionRunreport;
        this.actionAttachdocumenttoline = actionAttachdocumenttoline;
    }

    @JsonProperty("data:key:companynumber_companyinformation")
    public DataKeyCompanynumberCompanyinformation getDataKeyCompanynumberCompanyinformation() {
        return dataKeyCompanynumberCompanyinformation;
    }

    @JsonProperty("data:key:companynumber_companyinformation")
    public void setDataKeyCompanynumberCompanyinformation(DataKeyCompanynumberCompanyinformation dataKeyCompanynumberCompanyinformation) {
        this.dataKeyCompanynumberCompanyinformation = dataKeyCompanynumberCompanyinformation;
    }

    @JsonProperty("data:key:projectname_project")
    public DataKeyProjectnameProject getDataKeyProjectnameProject() {
        return dataKeyProjectnameProject;
    }

    @JsonProperty("data:key:projectname_project")
    public void setDataKeyProjectnameProject(DataKeyProjectnameProject dataKeyProjectnameProject) {
        this.dataKeyProjectnameProject = dataKeyProjectnameProject;
    }

    @JsonProperty("data:key:expensesheetnumber_expensesheetheader")
    public DataKeyExpensesheetnumberExpensesheetheader getDataKeyExpensesheetnumberExpensesheetheader() {
        return dataKeyExpensesheetnumberExpensesheetheader;
    }

    @JsonProperty("data:key:expensesheetnumber_expensesheetheader")
    public void setDataKeyExpensesheetnumberExpensesheetheader(DataKeyExpensesheetnumberExpensesheetheader dataKeyExpensesheetnumberExpensesheetheader) {
        this.dataKeyExpensesheetnumberExpensesheetheader = dataKeyExpensesheetnumberExpensesheetheader;
    }

    @JsonProperty("data:key:financevatcode3_financevatcode")
    public DataKeyFinancevatcode3Financevatcode getDataKeyFinancevatcode3Financevatcode() {
        return dataKeyFinancevatcode3Financevatcode;
    }

    @JsonProperty("data:key:financevatcode3_financevatcode")
    public void setDataKeyFinancevatcode3Financevatcode(DataKeyFinancevatcode3Financevatcode dataKeyFinancevatcode3Financevatcode) {
        this.dataKeyFinancevatcode3Financevatcode = dataKeyFinancevatcode3Financevatcode;
    }

    @JsonProperty("data:key:specification1name_specification1")
    public DataKeySpecification1nameSpecification1 getDataKeySpecification1nameSpecification1() {
        return dataKeySpecification1nameSpecification1;
    }

    @JsonProperty("data:key:specification1name_specification1")
    public void setDataKeySpecification1nameSpecification1(DataKeySpecification1nameSpecification1 dataKeySpecification1nameSpecification1) {
        this.dataKeySpecification1nameSpecification1 = dataKeySpecification1nameSpecification1;
    }

    @JsonProperty("data:key:employeenumber_employee")
    public DataKeyEmployeenumberEmployee getDataKeyEmployeenumberEmployee() {
        return dataKeyEmployeenumberEmployee;
    }

    @JsonProperty("data:key:employeenumber_employee")
    public void setDataKeyEmployeenumberEmployee(DataKeyEmployeenumberEmployee dataKeyEmployeenumberEmployee) {
        this.dataKeyEmployeenumberEmployee = dataKeyEmployeenumberEmployee;
    }

    @JsonProperty("data:key:favorite_jobfavorite")
    public DataKeyFavoriteJobfavorite getDataKeyFavoriteJobfavorite() {
        return dataKeyFavoriteJobfavorite;
    }

    @JsonProperty("data:key:favorite_jobfavorite")
    public void setDataKeyFavoriteJobfavorite(DataKeyFavoriteJobfavorite dataKeyFavoriteJobfavorite) {
        this.dataKeyFavoriteJobfavorite = dataKeyFavoriteJobfavorite;
    }

    @JsonProperty("data:key:financevatcode_financevatcode")
    public DataKeyFinancevatcodeFinancevatcode getDataKeyFinancevatcodeFinancevatcode() {
        return dataKeyFinancevatcodeFinancevatcode;
    }

    @JsonProperty("data:key:financevatcode_financevatcode")
    public void setDataKeyFinancevatcodeFinancevatcode(DataKeyFinancevatcodeFinancevatcode dataKeyFinancevatcodeFinancevatcode) {
        this.dataKeyFinancevatcodeFinancevatcode = dataKeyFinancevatcodeFinancevatcode;
    }

    @JsonProperty("data:key:locationname_location")
    public DataKeyLocationnameLocation getDataKeyLocationnameLocation() {
        return dataKeyLocationnameLocation;
    }

    @JsonProperty("data:key:locationname_location")
    public void setDataKeyLocationnameLocation(DataKeyLocationnameLocation dataKeyLocationnameLocation) {
        this.dataKeyLocationnameLocation = dataKeyLocationnameLocation;
    }

    @JsonProperty("data:key:transferredvatspecificationentry_vatspecificationentry")
    public DataKeyTransferredvatspecificationentryVatspecificationentry getDataKeyTransferredvatspecificationentryVatspecificationentry() {
        return dataKeyTransferredvatspecificationentryVatspecificationentry;
    }

    @JsonProperty("data:key:transferredvatspecificationentry_vatspecificationentry")
    public void setDataKeyTransferredvatspecificationentryVatspecificationentry(DataKeyTransferredvatspecificationentryVatspecificationentry dataKeyTransferredvatspecificationentryVatspecificationentry) {
        this.dataKeyTransferredvatspecificationentryVatspecificationentry = dataKeyTransferredvatspecificationentryVatspecificationentry;
    }

    @JsonProperty("data:key:timesheetlineinstancekey_timesheetline")
    public DataKeyTimesheetlineinstancekeyTimesheetline getDataKeyTimesheetlineinstancekeyTimesheetline() {
        return dataKeyTimesheetlineinstancekeyTimesheetline;
    }

    @JsonProperty("data:key:timesheetlineinstancekey_timesheetline")
    public void setDataKeyTimesheetlineinstancekeyTimesheetline(DataKeyTimesheetlineinstancekeyTimesheetline dataKeyTimesheetlineinstancekeyTimesheetline) {
        this.dataKeyTimesheetlineinstancekeyTimesheetline = dataKeyTimesheetlineinstancekeyTimesheetline;
    }

    @JsonProperty("data:key:financevatcode2_financevatcode")
    public DataKeyFinancevatcode2Financevatcode getDataKeyFinancevatcode2Financevatcode() {
        return dataKeyFinancevatcode2Financevatcode;
    }

    @JsonProperty("data:key:financevatcode2_financevatcode")
    public void setDataKeyFinancevatcode2Financevatcode(DataKeyFinancevatcode2Financevatcode dataKeyFinancevatcode2Financevatcode) {
        this.dataKeyFinancevatcode2Financevatcode = dataKeyFinancevatcode2Financevatcode;
    }

    @JsonProperty("data:key:entityname_entity")
    public DataKeyEntitynameEntity getDataKeyEntitynameEntity() {
        return dataKeyEntitynameEntity;
    }

    @JsonProperty("data:key:entityname_entity")
    public void setDataKeyEntitynameEntity(DataKeyEntitynameEntity dataKeyEntitynameEntity) {
        this.dataKeyEntitynameEntity = dataKeyEntitynameEntity;
    }

    @JsonProperty("data:key:specification3name_specification3")
    public DataKeySpecification3nameSpecification3 getDataKeySpecification3nameSpecification3() {
        return dataKeySpecification3nameSpecification3;
    }

    @JsonProperty("data:key:specification3name_specification3")
    public void setDataKeySpecification3nameSpecification3(DataKeySpecification3nameSpecification3 dataKeySpecification3nameSpecification3) {
        this.dataKeySpecification3nameSpecification3 = dataKeySpecification3nameSpecification3;
    }

    @JsonProperty("data:key:purposename_purpose")
    public DataKeyPurposenamePurpose getDataKeyPurposenamePurpose() {
        return dataKeyPurposenamePurpose;
    }

    @JsonProperty("data:key:purposename_purpose")
    public void setDataKeyPurposenamePurpose(DataKeyPurposenamePurpose dataKeyPurposenamePurpose) {
        this.dataKeyPurposenamePurpose = dataKeyPurposenamePurpose;
    }

    @JsonProperty("data:key:favorite_expensemileagejobfavorite")
    public DataKeyFavoriteExpensemileagejobfavorite getDataKeyFavoriteExpensemileagejobfavorite() {
        return dataKeyFavoriteExpensemileagejobfavorite;
    }

    @JsonProperty("data:key:favorite_expensemileagejobfavorite")
    public void setDataKeyFavoriteExpensemileagejobfavorite(DataKeyFavoriteExpensemileagejobfavorite dataKeyFavoriteExpensemileagejobfavorite) {
        this.dataKeyFavoriteExpensemileagejobfavorite = dataKeyFavoriteExpensemileagejobfavorite;
    }

    @JsonProperty("data:key:activitynumber_activity")
    public DataKeyActivitynumberActivity getDataKeyActivitynumberActivity() {
        return dataKeyActivitynumberActivity;
    }

    @JsonProperty("data:key:activitynumber_activity")
    public void setDataKeyActivitynumberActivity(DataKeyActivitynumberActivity dataKeyActivitynumberActivity) {
        this.dataKeyActivitynumberActivity = dataKeyActivitynumberActivity;
    }

    @JsonProperty("data:key:specification2name_specification2")
    public DataKeySpecification2nameSpecification2 getDataKeySpecification2nameSpecification2() {
        return dataKeySpecification2nameSpecification2;
    }

    @JsonProperty("data:key:specification2name_specification2")
    public void setDataKeySpecification2nameSpecification2(DataKeySpecification2nameSpecification2 dataKeySpecification2nameSpecification2) {
        this.dataKeySpecification2nameSpecification2 = dataKeySpecification2nameSpecification2;
    }

    @JsonProperty("data:key:activitynumber_expensemileageactivity")
    public DataKeyActivitynumberExpensemileageactivity getDataKeyActivitynumberExpensemileageactivity() {
        return dataKeyActivitynumberExpensemileageactivity;
    }

    @JsonProperty("data:key:activitynumber_expensemileageactivity")
    public void setDataKeyActivitynumberExpensemileageactivity(DataKeyActivitynumberExpensemileageactivity dataKeyActivitynumberExpensemileageactivity) {
        this.dataKeyActivitynumberExpensemileageactivity = dataKeyActivitynumberExpensemileageactivity;
    }

    @JsonProperty("data:key:jobnumber_jobheader")
    public DataKeyJobnumberJobheader getDataKeyJobnumberJobheader() {
        return dataKeyJobnumberJobheader;
    }

    @JsonProperty("data:key:jobnumber_jobheader")
    public void setDataKeyJobnumberJobheader(DataKeyJobnumberJobheader dataKeyJobnumberJobheader) {
        this.dataKeyJobnumberJobheader = dataKeyJobnumberJobheader;
    }

    @JsonProperty("data:key:lineapproval_approvalline")
    public DataKeyLineapprovalApprovalline getDataKeyLineapprovalApprovalline() {
        return dataKeyLineapprovalApprovalline;
    }

    @JsonProperty("data:key:lineapproval_approvalline")
    public void setDataKeyLineapprovalApprovalline(DataKeyLineapprovalApprovalline dataKeyLineapprovalApprovalline) {
        this.dataKeyLineapprovalApprovalline = dataKeyLineapprovalApprovalline;
    }

    @JsonProperty("data:key:lineapproval_approvalheader")
    public DataKeyLineapprovalApprovalheader getDataKeyLineapprovalApprovalheader() {
        return dataKeyLineapprovalApprovalheader;
    }

    @JsonProperty("data:key:lineapproval_approvalheader")
    public void setDataKeyLineapprovalApprovalheader(DataKeyLineapprovalApprovalheader dataKeyLineapprovalApprovalheader) {
        this.dataKeyLineapprovalApprovalheader = dataKeyLineapprovalApprovalheader;
    }

    @JsonProperty("data:key:instancekey_noteheader")
    public DataKeyInstancekeyNoteheader getDataKeyInstancekeyNoteheader() {
        return dataKeyInstancekeyNoteheader;
    }

    @JsonProperty("data:key:instancekey_noteheader")
    public void setDataKeyInstancekeyNoteheader(DataKeyInstancekeyNoteheader dataKeyInstancekeyNoteheader) {
        this.dataKeyInstancekeyNoteheader = dataKeyInstancekeyNoteheader;
    }

    @JsonProperty("action:insert")
    public ActionInsert getActionInsert() {
        return actionInsert;
    }

    @JsonProperty("action:insert")
    public void setActionInsert(ActionInsert actionInsert) {
        this.actionInsert = actionInsert;
    }

    @JsonProperty("action:create")
    public ActionCreate getActionCreate() {
        return actionCreate;
    }

    @JsonProperty("action:create")
    public void setActionCreate(ActionCreate actionCreate) {
        this.actionCreate = actionCreate;
    }

    @JsonProperty("action:update")
    public ActionUpdate getActionUpdate() {
        return actionUpdate;
    }

    @JsonProperty("action:update")
    public void setActionUpdate(ActionUpdate actionUpdate) {
        this.actionUpdate = actionUpdate;
    }

    @JsonProperty("action:delete")
    public ActionDelete getActionDelete() {
        return actionDelete;
    }

    @JsonProperty("action:delete")
    public void setActionDelete(ActionDelete actionDelete) {
        this.actionDelete = actionDelete;
    }

    @JsonProperty("action:print")
    public ActionPrint getActionPrint() {
        return actionPrint;
    }

    @JsonProperty("action:print")
    public void setActionPrint(ActionPrint actionPrint) {
        this.actionPrint = actionPrint;
    }

    @JsonProperty("action:exportdataset")
    public ActionExportdataset getActionExportdataset() {
        return actionExportdataset;
    }

    @JsonProperty("action:exportdataset")
    public void setActionExportdataset(ActionExportdataset actionExportdataset) {
        this.actionExportdataset = actionExportdataset;
    }

    @JsonProperty("action:emailonaction")
    public ActionEmailonaction getActionEmailonaction() {
        return actionEmailonaction;
    }

    @JsonProperty("action:emailonaction")
    public void setActionEmailonaction(ActionEmailonaction actionEmailonaction) {
        this.actionEmailonaction = actionEmailonaction;
    }

    @JsonProperty("action:createjobfavorite")
    public ActionCreatejobfavorite getActionCreatejobfavorite() {
        return actionCreatejobfavorite;
    }

    @JsonProperty("action:createjobfavorite")
    public void setActionCreatejobfavorite(ActionCreatejobfavorite actionCreatejobfavorite) {
        this.actionCreatejobfavorite = actionCreatejobfavorite;
    }

    @JsonProperty("action:actionsequence")
    public ActionActionsequence getActionActionsequence() {
        return actionActionsequence;
    }

    @JsonProperty("action:actionsequence")
    public void setActionActionsequence(ActionActionsequence actionActionsequence) {
        this.actionActionsequence = actionActionsequence;
    }

    @JsonProperty("action:runreport")
    public ActionRunreport getActionRunreport() {
        return actionRunreport;
    }

    @JsonProperty("action:runreport")
    public void setActionRunreport(ActionRunreport actionRunreport) {
        this.actionRunreport = actionRunreport;
    }

    @JsonProperty("action:attachdocumenttoline")
    public ActionAttachdocumenttoline getActionAttachdocumenttoline() {
        return actionAttachdocumenttoline;
    }

    @JsonProperty("action:attachdocumenttoline")
    public void setActionAttachdocumenttoline(ActionAttachdocumenttoline actionAttachdocumenttoline) {
        this.actionAttachdocumenttoline = actionAttachdocumenttoline;
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
        return new ToStringBuilder(this).append("dataKeyCompanynumberCompanyinformation", dataKeyCompanynumberCompanyinformation).append("dataKeyProjectnameProject", dataKeyProjectnameProject).append("dataKeyExpensesheetnumberExpensesheetheader", dataKeyExpensesheetnumberExpensesheetheader).append("dataKeyFinancevatcode3Financevatcode", dataKeyFinancevatcode3Financevatcode).append("dataKeySpecification1nameSpecification1", dataKeySpecification1nameSpecification1).append("dataKeyEmployeenumberEmployee", dataKeyEmployeenumberEmployee).append("dataKeyFavoriteJobfavorite", dataKeyFavoriteJobfavorite).append("dataKeyFinancevatcodeFinancevatcode", dataKeyFinancevatcodeFinancevatcode).append("dataKeyLocationnameLocation", dataKeyLocationnameLocation).append("dataKeyTransferredvatspecificationentryVatspecificationentry", dataKeyTransferredvatspecificationentryVatspecificationentry).append("dataKeyTimesheetlineinstancekeyTimesheetline", dataKeyTimesheetlineinstancekeyTimesheetline).append("dataKeyFinancevatcode2Financevatcode", dataKeyFinancevatcode2Financevatcode).append("dataKeyEntitynameEntity", dataKeyEntitynameEntity).append("dataKeySpecification3nameSpecification3", dataKeySpecification3nameSpecification3).append("dataKeyPurposenamePurpose", dataKeyPurposenamePurpose).append("dataKeyFavoriteExpensemileagejobfavorite", dataKeyFavoriteExpensemileagejobfavorite).append("dataKeyActivitynumberActivity", dataKeyActivitynumberActivity).append("dataKeySpecification2nameSpecification2", dataKeySpecification2nameSpecification2).append("dataKeyActivitynumberExpensemileageactivity", dataKeyActivitynumberExpensemileageactivity).append("dataKeyJobnumberJobheader", dataKeyJobnumberJobheader).append("dataKeyLineapprovalApprovalline", dataKeyLineapprovalApprovalline).append("dataKeyLineapprovalApprovalheader", dataKeyLineapprovalApprovalheader).append("dataKeyInstancekeyNoteheader", dataKeyInstancekeyNoteheader).append("actionInsert", actionInsert).append("actionCreate", actionCreate).append("actionUpdate", actionUpdate).append("actionDelete", actionDelete).append("actionPrint", actionPrint).append("actionExportdataset", actionExportdataset).append("actionEmailonaction", actionEmailonaction).append("actionCreatejobfavorite", actionCreatejobfavorite).append("actionActionsequence", actionActionsequence).append("actionRunreport", actionRunreport).append("actionAttachdocumenttoline", actionAttachdocumenttoline).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(actionEmailonaction).append(dataKeySpecification1nameSpecification1).append(actionActionsequence).append(dataKeyFinancevatcode2Financevatcode).append(dataKeyTimesheetlineinstancekeyTimesheetline).append(dataKeyFavoriteExpensemileagejobfavorite).append(actionCreatejobfavorite).append(dataKeyEmployeenumberEmployee).append(dataKeyEntitynameEntity).append(actionCreate).append(dataKeyTransferredvatspecificationentryVatspecificationentry).append(dataKeyActivitynumberActivity).append(dataKeyLocationnameLocation).append(actionRunreport).append(dataKeyLineapprovalApprovalheader).append(actionInsert).append(dataKeyInstancekeyNoteheader).append(dataKeyActivitynumberExpensemileageactivity).append(dataKeyJobnumberJobheader).append(dataKeyPurposenamePurpose).append(dataKeyFavoriteJobfavorite).append(dataKeyFinancevatcodeFinancevatcode).append(dataKeyExpensesheetnumberExpensesheetheader).append(dataKeyCompanynumberCompanyinformation).append(actionPrint).append(dataKeyLineapprovalApprovalline).append(dataKeyFinancevatcode3Financevatcode).append(actionUpdate).append(dataKeyProjectnameProject).append(additionalProperties).append(dataKeySpecification2nameSpecification2).append(actionExportdataset).append(actionDelete).append(actionAttachdocumenttoline).append(dataKeySpecification3nameSpecification3).toHashCode();
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
        return new EqualsBuilder().append(actionEmailonaction, rhs.actionEmailonaction).append(dataKeySpecification1nameSpecification1, rhs.dataKeySpecification1nameSpecification1).append(actionActionsequence, rhs.actionActionsequence).append(dataKeyFinancevatcode2Financevatcode, rhs.dataKeyFinancevatcode2Financevatcode).append(dataKeyTimesheetlineinstancekeyTimesheetline, rhs.dataKeyTimesheetlineinstancekeyTimesheetline).append(dataKeyFavoriteExpensemileagejobfavorite, rhs.dataKeyFavoriteExpensemileagejobfavorite).append(actionCreatejobfavorite, rhs.actionCreatejobfavorite).append(dataKeyEmployeenumberEmployee, rhs.dataKeyEmployeenumberEmployee).append(dataKeyEntitynameEntity, rhs.dataKeyEntitynameEntity).append(actionCreate, rhs.actionCreate).append(dataKeyTransferredvatspecificationentryVatspecificationentry, rhs.dataKeyTransferredvatspecificationentryVatspecificationentry).append(dataKeyActivitynumberActivity, rhs.dataKeyActivitynumberActivity).append(dataKeyLocationnameLocation, rhs.dataKeyLocationnameLocation).append(actionRunreport, rhs.actionRunreport).append(dataKeyLineapprovalApprovalheader, rhs.dataKeyLineapprovalApprovalheader).append(actionInsert, rhs.actionInsert).append(dataKeyInstancekeyNoteheader, rhs.dataKeyInstancekeyNoteheader).append(dataKeyActivitynumberExpensemileageactivity, rhs.dataKeyActivitynumberExpensemileageactivity).append(dataKeyJobnumberJobheader, rhs.dataKeyJobnumberJobheader).append(dataKeyPurposenamePurpose, rhs.dataKeyPurposenamePurpose).append(dataKeyFavoriteJobfavorite, rhs.dataKeyFavoriteJobfavorite).append(dataKeyFinancevatcodeFinancevatcode, rhs.dataKeyFinancevatcodeFinancevatcode).append(dataKeyExpensesheetnumberExpensesheetheader, rhs.dataKeyExpensesheetnumberExpensesheetheader).append(dataKeyCompanynumberCompanyinformation, rhs.dataKeyCompanynumberCompanyinformation).append(actionPrint, rhs.actionPrint).append(dataKeyLineapprovalApprovalline, rhs.dataKeyLineapprovalApprovalline).append(dataKeyFinancevatcode3Financevatcode, rhs.dataKeyFinancevatcode3Financevatcode).append(actionUpdate, rhs.actionUpdate).append(dataKeyProjectnameProject, rhs.dataKeyProjectnameProject).append(additionalProperties, rhs.additionalProperties).append(dataKeySpecification2nameSpecification2, rhs.dataKeySpecification2nameSpecification2).append(actionExportdataset, rhs.actionExportdataset).append(actionDelete, rhs.actionDelete).append(actionAttachdocumenttoline, rhs.actionAttachdocumenttoline).append(dataKeySpecification3nameSpecification3, rhs.dataKeySpecification3nameSpecification3).isEquals();
    }

}
