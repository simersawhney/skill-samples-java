
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
    "data:key:specification3name_specification3",
    "data:key:specification2name_specification2",
    "data:key:entityname_entity",
    "data:key:financevatcode3_financevatcode",
    "data:key:specification1name_specification1",
    "data:key:locationname_location",
    "data:key:financevatcode2_financevatcode",
    "data:key:timesheetlineinstancekey_timesheetline",
    "data:key:lineapproval_approvalline",
    "data:key:jobnumber_jobheader",
    "data:key:purposename_purpose",
    "data:key:expensesheetnumber_expensesheetheader",
    "data:key:specification9name_specification9",
    "data:key:specification8name_specification8",
    "data:key:specification7name_specification7",
    "data:key:activitynumber_activity",
    "data:key:specification6name_specification6",
    "data:key:projectname_project",
    "data:key:specification5name_specification5",
    "data:key:specification4name_specification4",
    "data:key:activitynumber_expensemileageactivity",
    "data:key:specification10name_specification10",
    "data:key:financevatcode_financevatcode",
    "data:key:favorite_expensemileagejobfavorite",
    "data:key:favorite_jobfavorite",
    "data:key:companynumber_companyinformation",
    "data:key:instancekey_noteheader",
    "data:key:employeenumber_employee",
    "data:key:transferredvatspecificationentry_vatspecificationentry",
    "data:key:lineapproval_approvalheader",
    "data:key:purchaseorderline",
    "action:print",
    "action:copyexpensesheetline",
    "action:actionsequence",
    "action:runreport",
    "action:emailonaction",
    "action:exportdataset",
    "action:customattachdocumenttoline"
})
public class Links__ {

    @JsonProperty("data:key:specification3name_specification3")
    private DataKeySpecification3nameSpecification3 dataKeySpecification3nameSpecification3;
    @JsonProperty("data:key:specification2name_specification2")
    private DataKeySpecification2nameSpecification2 dataKeySpecification2nameSpecification2;
    @JsonProperty("data:key:entityname_entity")
    private DataKeyEntitynameEntity dataKeyEntitynameEntity;
    @JsonProperty("data:key:financevatcode3_financevatcode")
    private DataKeyFinancevatcode3Financevatcode dataKeyFinancevatcode3Financevatcode;
    @JsonProperty("data:key:specification1name_specification1")
    private DataKeySpecification1nameSpecification1 dataKeySpecification1nameSpecification1;
    @JsonProperty("data:key:locationname_location")
    private DataKeyLocationnameLocation dataKeyLocationnameLocation;
    @JsonProperty("data:key:financevatcode2_financevatcode")
    private DataKeyFinancevatcode2Financevatcode dataKeyFinancevatcode2Financevatcode;
    @JsonProperty("data:key:timesheetlineinstancekey_timesheetline")
    private DataKeyTimesheetlineinstancekeyTimesheetline dataKeyTimesheetlineinstancekeyTimesheetline;
    @JsonProperty("data:key:lineapproval_approvalline")
    private DataKeyLineapprovalApprovalline dataKeyLineapprovalApprovalline;
    @JsonProperty("data:key:jobnumber_jobheader")
    private DataKeyJobnumberJobheader_ dataKeyJobnumberJobheader;
    @JsonProperty("data:key:purposename_purpose")
    private DataKeyPurposenamePurpose dataKeyPurposenamePurpose;
    @JsonProperty("data:key:expensesheetnumber_expensesheetheader")
    private DataKeyExpensesheetnumberExpensesheetheader dataKeyExpensesheetnumberExpensesheetheader;
    @JsonProperty("data:key:specification9name_specification9")
    private DataKeySpecification9nameSpecification9 dataKeySpecification9nameSpecification9;
    @JsonProperty("data:key:specification8name_specification8")
    private DataKeySpecification8nameSpecification8 dataKeySpecification8nameSpecification8;
    @JsonProperty("data:key:specification7name_specification7")
    private DataKeySpecification7nameSpecification7 dataKeySpecification7nameSpecification7;
    @JsonProperty("data:key:activitynumber_activity")
    private DataKeyActivitynumberActivity dataKeyActivitynumberActivity;
    @JsonProperty("data:key:specification6name_specification6")
    private DataKeySpecification6nameSpecification6 dataKeySpecification6nameSpecification6;
    @JsonProperty("data:key:projectname_project")
    private DataKeyProjectnameProject dataKeyProjectnameProject;
    @JsonProperty("data:key:specification5name_specification5")
    private DataKeySpecification5nameSpecification5 dataKeySpecification5nameSpecification5;
    @JsonProperty("data:key:specification4name_specification4")
    private DataKeySpecification4nameSpecification4 dataKeySpecification4nameSpecification4;
    @JsonProperty("data:key:activitynumber_expensemileageactivity")
    private DataKeyActivitynumberExpensemileageactivity dataKeyActivitynumberExpensemileageactivity;
    @JsonProperty("data:key:specification10name_specification10")
    private DataKeySpecification10nameSpecification10 dataKeySpecification10nameSpecification10;
    @JsonProperty("data:key:financevatcode_financevatcode")
    private DataKeyFinancevatcodeFinancevatcode dataKeyFinancevatcodeFinancevatcode;
    @JsonProperty("data:key:favorite_expensemileagejobfavorite")
    private DataKeyFavoriteExpensemileagejobfavorite dataKeyFavoriteExpensemileagejobfavorite;
    @JsonProperty("data:key:favorite_jobfavorite")
    private DataKeyFavoriteJobfavorite dataKeyFavoriteJobfavorite;
    @JsonProperty("data:key:companynumber_companyinformation")
    private DataKeyCompanynumberCompanyinformation_ dataKeyCompanynumberCompanyinformation;
    @JsonProperty("data:key:instancekey_noteheader")
    private DataKeyInstancekeyNoteheader dataKeyInstancekeyNoteheader;
    @JsonProperty("data:key:employeenumber_employee")
    private DataKeyEmployeenumberEmployee dataKeyEmployeenumberEmployee;
    @JsonProperty("data:key:transferredvatspecificationentry_vatspecificationentry")
    private DataKeyTransferredvatspecificationentryVatspecificationentry dataKeyTransferredvatspecificationentryVatspecificationentry;
    @JsonProperty("data:key:lineapproval_approvalheader")
    private DataKeyLineapprovalApprovalheader dataKeyLineapprovalApprovalheader;
    @JsonProperty("data:key:purchaseorderline")
    private DataKeyPurchaseorderline dataKeyPurchaseorderline;
    @JsonProperty("action:print")
    private ActionPrint_ actionPrint;
    @JsonProperty("action:copyexpensesheetline")
    private ActionCopyexpensesheetline actionCopyexpensesheetline;
    @JsonProperty("action:actionsequence")
    private ActionActionsequence_ actionActionsequence;
    @JsonProperty("action:runreport")
    private ActionRunreport_ actionRunreport;
    @JsonProperty("action:emailonaction")
    private ActionEmailonaction_ actionEmailonaction;
    @JsonProperty("action:exportdataset")
    private ActionExportdataset_ actionExportdataset;
    @JsonProperty("action:customattachdocumenttoline")
    private ActionCustomattachdocumenttoline actionCustomattachdocumenttoline;
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
     * @param dataKeySpecification7nameSpecification7
     * @param dataKeyFavoriteJobfavorite
     * @param dataKeyLineapprovalApprovalheader
     * @param actionRunreport
     * @param actionCustomattachdocumenttoline
     * @param dataKeyFavoriteExpensemileagejobfavorite
     * @param actionPrint
     * @param dataKeyActivitynumberActivity
     * @param dataKeyActivitynumberExpensemileageactivity
     * @param dataKeySpecification2nameSpecification2
     * @param dataKeyLocationnameLocation
     * @param dataKeySpecification4nameSpecification4
     * @param dataKeyCompanynumberCompanyinformation
     * @param actionCopyexpensesheetline
     * @param dataKeyJobnumberJobheader
     * @param dataKeyFinancevatcodeFinancevatcode
     * @param dataKeySpecification9nameSpecification9
     * @param actionEmailonaction
     * @param dataKeyPurposenamePurpose
     * @param dataKeyInstancekeyNoteheader
     * @param actionExportdataset
     * @param dataKeySpecification6nameSpecification6
     * @param dataKeySpecification10nameSpecification10
     * @param dataKeySpecification3nameSpecification3
     * @param dataKeyFinancevatcode3Financevatcode
     * @param dataKeyTransferredvatspecificationentryVatspecificationentry
     * @param dataKeyLineapprovalApprovalline
     * @param dataKeyProjectnameProject
     * @param dataKeyExpensesheetnumberExpensesheetheader
     * @param dataKeyTimesheetlineinstancekeyTimesheetline
     * @param dataKeyPurchaseorderline
     * @param dataKeySpecification1nameSpecification1
     * @param actionActionsequence
     * @param dataKeyEntitynameEntity
     * @param dataKeySpecification5nameSpecification5
     * @param dataKeySpecification8nameSpecification8
     * @param dataKeyFinancevatcode2Financevatcode
     * @param dataKeyEmployeenumberEmployee
     */
    public Links__(DataKeySpecification3nameSpecification3 dataKeySpecification3nameSpecification3, DataKeySpecification2nameSpecification2 dataKeySpecification2nameSpecification2, DataKeyEntitynameEntity dataKeyEntitynameEntity, DataKeyFinancevatcode3Financevatcode dataKeyFinancevatcode3Financevatcode, DataKeySpecification1nameSpecification1 dataKeySpecification1nameSpecification1, DataKeyLocationnameLocation dataKeyLocationnameLocation, DataKeyFinancevatcode2Financevatcode dataKeyFinancevatcode2Financevatcode, DataKeyTimesheetlineinstancekeyTimesheetline dataKeyTimesheetlineinstancekeyTimesheetline, DataKeyLineapprovalApprovalline dataKeyLineapprovalApprovalline, DataKeyJobnumberJobheader_ dataKeyJobnumberJobheader, DataKeyPurposenamePurpose dataKeyPurposenamePurpose, DataKeyExpensesheetnumberExpensesheetheader dataKeyExpensesheetnumberExpensesheetheader, DataKeySpecification9nameSpecification9 dataKeySpecification9nameSpecification9, DataKeySpecification8nameSpecification8 dataKeySpecification8nameSpecification8, DataKeySpecification7nameSpecification7 dataKeySpecification7nameSpecification7, DataKeyActivitynumberActivity dataKeyActivitynumberActivity, DataKeySpecification6nameSpecification6 dataKeySpecification6nameSpecification6, DataKeyProjectnameProject dataKeyProjectnameProject, DataKeySpecification5nameSpecification5 dataKeySpecification5nameSpecification5, DataKeySpecification4nameSpecification4 dataKeySpecification4nameSpecification4, DataKeyActivitynumberExpensemileageactivity dataKeyActivitynumberExpensemileageactivity, DataKeySpecification10nameSpecification10 dataKeySpecification10nameSpecification10, DataKeyFinancevatcodeFinancevatcode dataKeyFinancevatcodeFinancevatcode, DataKeyFavoriteExpensemileagejobfavorite dataKeyFavoriteExpensemileagejobfavorite, DataKeyFavoriteJobfavorite dataKeyFavoriteJobfavorite, DataKeyCompanynumberCompanyinformation_ dataKeyCompanynumberCompanyinformation, DataKeyInstancekeyNoteheader dataKeyInstancekeyNoteheader, DataKeyEmployeenumberEmployee dataKeyEmployeenumberEmployee, DataKeyTransferredvatspecificationentryVatspecificationentry dataKeyTransferredvatspecificationentryVatspecificationentry, DataKeyLineapprovalApprovalheader dataKeyLineapprovalApprovalheader, DataKeyPurchaseorderline dataKeyPurchaseorderline, ActionPrint_ actionPrint, ActionCopyexpensesheetline actionCopyexpensesheetline, ActionActionsequence_ actionActionsequence, ActionRunreport_ actionRunreport, ActionEmailonaction_ actionEmailonaction, ActionExportdataset_ actionExportdataset, ActionCustomattachdocumenttoline actionCustomattachdocumenttoline) {
        this.dataKeySpecification3nameSpecification3 = dataKeySpecification3nameSpecification3;
        this.dataKeySpecification2nameSpecification2 = dataKeySpecification2nameSpecification2;
        this.dataKeyEntitynameEntity = dataKeyEntitynameEntity;
        this.dataKeyFinancevatcode3Financevatcode = dataKeyFinancevatcode3Financevatcode;
        this.dataKeySpecification1nameSpecification1 = dataKeySpecification1nameSpecification1;
        this.dataKeyLocationnameLocation = dataKeyLocationnameLocation;
        this.dataKeyFinancevatcode2Financevatcode = dataKeyFinancevatcode2Financevatcode;
        this.dataKeyTimesheetlineinstancekeyTimesheetline = dataKeyTimesheetlineinstancekeyTimesheetline;
        this.dataKeyLineapprovalApprovalline = dataKeyLineapprovalApprovalline;
        this.dataKeyJobnumberJobheader = dataKeyJobnumberJobheader;
        this.dataKeyPurposenamePurpose = dataKeyPurposenamePurpose;
        this.dataKeyExpensesheetnumberExpensesheetheader = dataKeyExpensesheetnumberExpensesheetheader;
        this.dataKeySpecification9nameSpecification9 = dataKeySpecification9nameSpecification9;
        this.dataKeySpecification8nameSpecification8 = dataKeySpecification8nameSpecification8;
        this.dataKeySpecification7nameSpecification7 = dataKeySpecification7nameSpecification7;
        this.dataKeyActivitynumberActivity = dataKeyActivitynumberActivity;
        this.dataKeySpecification6nameSpecification6 = dataKeySpecification6nameSpecification6;
        this.dataKeyProjectnameProject = dataKeyProjectnameProject;
        this.dataKeySpecification5nameSpecification5 = dataKeySpecification5nameSpecification5;
        this.dataKeySpecification4nameSpecification4 = dataKeySpecification4nameSpecification4;
        this.dataKeyActivitynumberExpensemileageactivity = dataKeyActivitynumberExpensemileageactivity;
        this.dataKeySpecification10nameSpecification10 = dataKeySpecification10nameSpecification10;
        this.dataKeyFinancevatcodeFinancevatcode = dataKeyFinancevatcodeFinancevatcode;
        this.dataKeyFavoriteExpensemileagejobfavorite = dataKeyFavoriteExpensemileagejobfavorite;
        this.dataKeyFavoriteJobfavorite = dataKeyFavoriteJobfavorite;
        this.dataKeyCompanynumberCompanyinformation = dataKeyCompanynumberCompanyinformation;
        this.dataKeyInstancekeyNoteheader = dataKeyInstancekeyNoteheader;
        this.dataKeyEmployeenumberEmployee = dataKeyEmployeenumberEmployee;
        this.dataKeyTransferredvatspecificationentryVatspecificationentry = dataKeyTransferredvatspecificationentryVatspecificationentry;
        this.dataKeyLineapprovalApprovalheader = dataKeyLineapprovalApprovalheader;
        this.dataKeyPurchaseorderline = dataKeyPurchaseorderline;
        this.actionPrint = actionPrint;
        this.actionCopyexpensesheetline = actionCopyexpensesheetline;
        this.actionActionsequence = actionActionsequence;
        this.actionRunreport = actionRunreport;
        this.actionEmailonaction = actionEmailonaction;
        this.actionExportdataset = actionExportdataset;
        this.actionCustomattachdocumenttoline = actionCustomattachdocumenttoline;
    }

    /**
     * 
     * @return
     *     The dataKeySpecification3nameSpecification3
     */
    @JsonProperty("data:key:specification3name_specification3")
    public DataKeySpecification3nameSpecification3 getDataKeySpecification3nameSpecification3() {
        return dataKeySpecification3nameSpecification3;
    }

    /**
     * 
     * @param dataKeySpecification3nameSpecification3
     *     The data:key:specification3name_specification3
     */
    @JsonProperty("data:key:specification3name_specification3")
    public void setDataKeySpecification3nameSpecification3(DataKeySpecification3nameSpecification3 dataKeySpecification3nameSpecification3) {
        this.dataKeySpecification3nameSpecification3 = dataKeySpecification3nameSpecification3;
    }

    /**
     * 
     * @return
     *     The dataKeySpecification2nameSpecification2
     */
    @JsonProperty("data:key:specification2name_specification2")
    public DataKeySpecification2nameSpecification2 getDataKeySpecification2nameSpecification2() {
        return dataKeySpecification2nameSpecification2;
    }

    /**
     * 
     * @param dataKeySpecification2nameSpecification2
     *     The data:key:specification2name_specification2
     */
    @JsonProperty("data:key:specification2name_specification2")
    public void setDataKeySpecification2nameSpecification2(DataKeySpecification2nameSpecification2 dataKeySpecification2nameSpecification2) {
        this.dataKeySpecification2nameSpecification2 = dataKeySpecification2nameSpecification2;
    }

    /**
     * 
     * @return
     *     The dataKeyEntitynameEntity
     */
    @JsonProperty("data:key:entityname_entity")
    public DataKeyEntitynameEntity getDataKeyEntitynameEntity() {
        return dataKeyEntitynameEntity;
    }

    /**
     * 
     * @param dataKeyEntitynameEntity
     *     The data:key:entityname_entity
     */
    @JsonProperty("data:key:entityname_entity")
    public void setDataKeyEntitynameEntity(DataKeyEntitynameEntity dataKeyEntitynameEntity) {
        this.dataKeyEntitynameEntity = dataKeyEntitynameEntity;
    }

    /**
     * 
     * @return
     *     The dataKeyFinancevatcode3Financevatcode
     */
    @JsonProperty("data:key:financevatcode3_financevatcode")
    public DataKeyFinancevatcode3Financevatcode getDataKeyFinancevatcode3Financevatcode() {
        return dataKeyFinancevatcode3Financevatcode;
    }

    /**
     * 
     * @param dataKeyFinancevatcode3Financevatcode
     *     The data:key:financevatcode3_financevatcode
     */
    @JsonProperty("data:key:financevatcode3_financevatcode")
    public void setDataKeyFinancevatcode3Financevatcode(DataKeyFinancevatcode3Financevatcode dataKeyFinancevatcode3Financevatcode) {
        this.dataKeyFinancevatcode3Financevatcode = dataKeyFinancevatcode3Financevatcode;
    }

    /**
     * 
     * @return
     *     The dataKeySpecification1nameSpecification1
     */
    @JsonProperty("data:key:specification1name_specification1")
    public DataKeySpecification1nameSpecification1 getDataKeySpecification1nameSpecification1() {
        return dataKeySpecification1nameSpecification1;
    }

    /**
     * 
     * @param dataKeySpecification1nameSpecification1
     *     The data:key:specification1name_specification1
     */
    @JsonProperty("data:key:specification1name_specification1")
    public void setDataKeySpecification1nameSpecification1(DataKeySpecification1nameSpecification1 dataKeySpecification1nameSpecification1) {
        this.dataKeySpecification1nameSpecification1 = dataKeySpecification1nameSpecification1;
    }

    /**
     * 
     * @return
     *     The dataKeyLocationnameLocation
     */
    @JsonProperty("data:key:locationname_location")
    public DataKeyLocationnameLocation getDataKeyLocationnameLocation() {
        return dataKeyLocationnameLocation;
    }

    /**
     * 
     * @param dataKeyLocationnameLocation
     *     The data:key:locationname_location
     */
    @JsonProperty("data:key:locationname_location")
    public void setDataKeyLocationnameLocation(DataKeyLocationnameLocation dataKeyLocationnameLocation) {
        this.dataKeyLocationnameLocation = dataKeyLocationnameLocation;
    }

    /**
     * 
     * @return
     *     The dataKeyFinancevatcode2Financevatcode
     */
    @JsonProperty("data:key:financevatcode2_financevatcode")
    public DataKeyFinancevatcode2Financevatcode getDataKeyFinancevatcode2Financevatcode() {
        return dataKeyFinancevatcode2Financevatcode;
    }

    /**
     * 
     * @param dataKeyFinancevatcode2Financevatcode
     *     The data:key:financevatcode2_financevatcode
     */
    @JsonProperty("data:key:financevatcode2_financevatcode")
    public void setDataKeyFinancevatcode2Financevatcode(DataKeyFinancevatcode2Financevatcode dataKeyFinancevatcode2Financevatcode) {
        this.dataKeyFinancevatcode2Financevatcode = dataKeyFinancevatcode2Financevatcode;
    }

    /**
     * 
     * @return
     *     The dataKeyTimesheetlineinstancekeyTimesheetline
     */
    @JsonProperty("data:key:timesheetlineinstancekey_timesheetline")
    public DataKeyTimesheetlineinstancekeyTimesheetline getDataKeyTimesheetlineinstancekeyTimesheetline() {
        return dataKeyTimesheetlineinstancekeyTimesheetline;
    }

    /**
     * 
     * @param dataKeyTimesheetlineinstancekeyTimesheetline
     *     The data:key:timesheetlineinstancekey_timesheetline
     */
    @JsonProperty("data:key:timesheetlineinstancekey_timesheetline")
    public void setDataKeyTimesheetlineinstancekeyTimesheetline(DataKeyTimesheetlineinstancekeyTimesheetline dataKeyTimesheetlineinstancekeyTimesheetline) {
        this.dataKeyTimesheetlineinstancekeyTimesheetline = dataKeyTimesheetlineinstancekeyTimesheetline;
    }

    /**
     * 
     * @return
     *     The dataKeyLineapprovalApprovalline
     */
    @JsonProperty("data:key:lineapproval_approvalline")
    public DataKeyLineapprovalApprovalline getDataKeyLineapprovalApprovalline() {
        return dataKeyLineapprovalApprovalline;
    }

    /**
     * 
     * @param dataKeyLineapprovalApprovalline
     *     The data:key:lineapproval_approvalline
     */
    @JsonProperty("data:key:lineapproval_approvalline")
    public void setDataKeyLineapprovalApprovalline(DataKeyLineapprovalApprovalline dataKeyLineapprovalApprovalline) {
        this.dataKeyLineapprovalApprovalline = dataKeyLineapprovalApprovalline;
    }

    /**
     * 
     * @return
     *     The dataKeyJobnumberJobheader
     */
    @JsonProperty("data:key:jobnumber_jobheader")
    public DataKeyJobnumberJobheader_ getDataKeyJobnumberJobheader() {
        return dataKeyJobnumberJobheader;
    }

    /**
     * 
     * @param dataKeyJobnumberJobheader
     *     The data:key:jobnumber_jobheader
     */
    @JsonProperty("data:key:jobnumber_jobheader")
    public void setDataKeyJobnumberJobheader(DataKeyJobnumberJobheader_ dataKeyJobnumberJobheader) {
        this.dataKeyJobnumberJobheader = dataKeyJobnumberJobheader;
    }

    /**
     * 
     * @return
     *     The dataKeyPurposenamePurpose
     */
    @JsonProperty("data:key:purposename_purpose")
    public DataKeyPurposenamePurpose getDataKeyPurposenamePurpose() {
        return dataKeyPurposenamePurpose;
    }

    /**
     * 
     * @param dataKeyPurposenamePurpose
     *     The data:key:purposename_purpose
     */
    @JsonProperty("data:key:purposename_purpose")
    public void setDataKeyPurposenamePurpose(DataKeyPurposenamePurpose dataKeyPurposenamePurpose) {
        this.dataKeyPurposenamePurpose = dataKeyPurposenamePurpose;
    }

    /**
     * 
     * @return
     *     The dataKeyExpensesheetnumberExpensesheetheader
     */
    @JsonProperty("data:key:expensesheetnumber_expensesheetheader")
    public DataKeyExpensesheetnumberExpensesheetheader getDataKeyExpensesheetnumberExpensesheetheader() {
        return dataKeyExpensesheetnumberExpensesheetheader;
    }

    /**
     * 
     * @param dataKeyExpensesheetnumberExpensesheetheader
     *     The data:key:expensesheetnumber_expensesheetheader
     */
    @JsonProperty("data:key:expensesheetnumber_expensesheetheader")
    public void setDataKeyExpensesheetnumberExpensesheetheader(DataKeyExpensesheetnumberExpensesheetheader dataKeyExpensesheetnumberExpensesheetheader) {
        this.dataKeyExpensesheetnumberExpensesheetheader = dataKeyExpensesheetnumberExpensesheetheader;
    }

    /**
     * 
     * @return
     *     The dataKeySpecification9nameSpecification9
     */
    @JsonProperty("data:key:specification9name_specification9")
    public DataKeySpecification9nameSpecification9 getDataKeySpecification9nameSpecification9() {
        return dataKeySpecification9nameSpecification9;
    }

    /**
     * 
     * @param dataKeySpecification9nameSpecification9
     *     The data:key:specification9name_specification9
     */
    @JsonProperty("data:key:specification9name_specification9")
    public void setDataKeySpecification9nameSpecification9(DataKeySpecification9nameSpecification9 dataKeySpecification9nameSpecification9) {
        this.dataKeySpecification9nameSpecification9 = dataKeySpecification9nameSpecification9;
    }

    /**
     * 
     * @return
     *     The dataKeySpecification8nameSpecification8
     */
    @JsonProperty("data:key:specification8name_specification8")
    public DataKeySpecification8nameSpecification8 getDataKeySpecification8nameSpecification8() {
        return dataKeySpecification8nameSpecification8;
    }

    /**
     * 
     * @param dataKeySpecification8nameSpecification8
     *     The data:key:specification8name_specification8
     */
    @JsonProperty("data:key:specification8name_specification8")
    public void setDataKeySpecification8nameSpecification8(DataKeySpecification8nameSpecification8 dataKeySpecification8nameSpecification8) {
        this.dataKeySpecification8nameSpecification8 = dataKeySpecification8nameSpecification8;
    }

    /**
     * 
     * @return
     *     The dataKeySpecification7nameSpecification7
     */
    @JsonProperty("data:key:specification7name_specification7")
    public DataKeySpecification7nameSpecification7 getDataKeySpecification7nameSpecification7() {
        return dataKeySpecification7nameSpecification7;
    }

    /**
     * 
     * @param dataKeySpecification7nameSpecification7
     *     The data:key:specification7name_specification7
     */
    @JsonProperty("data:key:specification7name_specification7")
    public void setDataKeySpecification7nameSpecification7(DataKeySpecification7nameSpecification7 dataKeySpecification7nameSpecification7) {
        this.dataKeySpecification7nameSpecification7 = dataKeySpecification7nameSpecification7;
    }

    /**
     * 
     * @return
     *     The dataKeyActivitynumberActivity
     */
    @JsonProperty("data:key:activitynumber_activity")
    public DataKeyActivitynumberActivity getDataKeyActivitynumberActivity() {
        return dataKeyActivitynumberActivity;
    }

    /**
     * 
     * @param dataKeyActivitynumberActivity
     *     The data:key:activitynumber_activity
     */
    @JsonProperty("data:key:activitynumber_activity")
    public void setDataKeyActivitynumberActivity(DataKeyActivitynumberActivity dataKeyActivitynumberActivity) {
        this.dataKeyActivitynumberActivity = dataKeyActivitynumberActivity;
    }

    /**
     * 
     * @return
     *     The dataKeySpecification6nameSpecification6
     */
    @JsonProperty("data:key:specification6name_specification6")
    public DataKeySpecification6nameSpecification6 getDataKeySpecification6nameSpecification6() {
        return dataKeySpecification6nameSpecification6;
    }

    /**
     * 
     * @param dataKeySpecification6nameSpecification6
     *     The data:key:specification6name_specification6
     */
    @JsonProperty("data:key:specification6name_specification6")
    public void setDataKeySpecification6nameSpecification6(DataKeySpecification6nameSpecification6 dataKeySpecification6nameSpecification6) {
        this.dataKeySpecification6nameSpecification6 = dataKeySpecification6nameSpecification6;
    }

    /**
     * 
     * @return
     *     The dataKeyProjectnameProject
     */
    @JsonProperty("data:key:projectname_project")
    public DataKeyProjectnameProject getDataKeyProjectnameProject() {
        return dataKeyProjectnameProject;
    }

    /**
     * 
     * @param dataKeyProjectnameProject
     *     The data:key:projectname_project
     */
    @JsonProperty("data:key:projectname_project")
    public void setDataKeyProjectnameProject(DataKeyProjectnameProject dataKeyProjectnameProject) {
        this.dataKeyProjectnameProject = dataKeyProjectnameProject;
    }

    /**
     * 
     * @return
     *     The dataKeySpecification5nameSpecification5
     */
    @JsonProperty("data:key:specification5name_specification5")
    public DataKeySpecification5nameSpecification5 getDataKeySpecification5nameSpecification5() {
        return dataKeySpecification5nameSpecification5;
    }

    /**
     * 
     * @param dataKeySpecification5nameSpecification5
     *     The data:key:specification5name_specification5
     */
    @JsonProperty("data:key:specification5name_specification5")
    public void setDataKeySpecification5nameSpecification5(DataKeySpecification5nameSpecification5 dataKeySpecification5nameSpecification5) {
        this.dataKeySpecification5nameSpecification5 = dataKeySpecification5nameSpecification5;
    }

    /**
     * 
     * @return
     *     The dataKeySpecification4nameSpecification4
     */
    @JsonProperty("data:key:specification4name_specification4")
    public DataKeySpecification4nameSpecification4 getDataKeySpecification4nameSpecification4() {
        return dataKeySpecification4nameSpecification4;
    }

    /**
     * 
     * @param dataKeySpecification4nameSpecification4
     *     The data:key:specification4name_specification4
     */
    @JsonProperty("data:key:specification4name_specification4")
    public void setDataKeySpecification4nameSpecification4(DataKeySpecification4nameSpecification4 dataKeySpecification4nameSpecification4) {
        this.dataKeySpecification4nameSpecification4 = dataKeySpecification4nameSpecification4;
    }

    /**
     * 
     * @return
     *     The dataKeyActivitynumberExpensemileageactivity
     */
    @JsonProperty("data:key:activitynumber_expensemileageactivity")
    public DataKeyActivitynumberExpensemileageactivity getDataKeyActivitynumberExpensemileageactivity() {
        return dataKeyActivitynumberExpensemileageactivity;
    }

    /**
     * 
     * @param dataKeyActivitynumberExpensemileageactivity
     *     The data:key:activitynumber_expensemileageactivity
     */
    @JsonProperty("data:key:activitynumber_expensemileageactivity")
    public void setDataKeyActivitynumberExpensemileageactivity(DataKeyActivitynumberExpensemileageactivity dataKeyActivitynumberExpensemileageactivity) {
        this.dataKeyActivitynumberExpensemileageactivity = dataKeyActivitynumberExpensemileageactivity;
    }

    /**
     * 
     * @return
     *     The dataKeySpecification10nameSpecification10
     */
    @JsonProperty("data:key:specification10name_specification10")
    public DataKeySpecification10nameSpecification10 getDataKeySpecification10nameSpecification10() {
        return dataKeySpecification10nameSpecification10;
    }

    /**
     * 
     * @param dataKeySpecification10nameSpecification10
     *     The data:key:specification10name_specification10
     */
    @JsonProperty("data:key:specification10name_specification10")
    public void setDataKeySpecification10nameSpecification10(DataKeySpecification10nameSpecification10 dataKeySpecification10nameSpecification10) {
        this.dataKeySpecification10nameSpecification10 = dataKeySpecification10nameSpecification10;
    }

    /**
     * 
     * @return
     *     The dataKeyFinancevatcodeFinancevatcode
     */
    @JsonProperty("data:key:financevatcode_financevatcode")
    public DataKeyFinancevatcodeFinancevatcode getDataKeyFinancevatcodeFinancevatcode() {
        return dataKeyFinancevatcodeFinancevatcode;
    }

    /**
     * 
     * @param dataKeyFinancevatcodeFinancevatcode
     *     The data:key:financevatcode_financevatcode
     */
    @JsonProperty("data:key:financevatcode_financevatcode")
    public void setDataKeyFinancevatcodeFinancevatcode(DataKeyFinancevatcodeFinancevatcode dataKeyFinancevatcodeFinancevatcode) {
        this.dataKeyFinancevatcodeFinancevatcode = dataKeyFinancevatcodeFinancevatcode;
    }

    /**
     * 
     * @return
     *     The dataKeyFavoriteExpensemileagejobfavorite
     */
    @JsonProperty("data:key:favorite_expensemileagejobfavorite")
    public DataKeyFavoriteExpensemileagejobfavorite getDataKeyFavoriteExpensemileagejobfavorite() {
        return dataKeyFavoriteExpensemileagejobfavorite;
    }

    /**
     * 
     * @param dataKeyFavoriteExpensemileagejobfavorite
     *     The data:key:favorite_expensemileagejobfavorite
     */
    @JsonProperty("data:key:favorite_expensemileagejobfavorite")
    public void setDataKeyFavoriteExpensemileagejobfavorite(DataKeyFavoriteExpensemileagejobfavorite dataKeyFavoriteExpensemileagejobfavorite) {
        this.dataKeyFavoriteExpensemileagejobfavorite = dataKeyFavoriteExpensemileagejobfavorite;
    }

    /**
     * 
     * @return
     *     The dataKeyFavoriteJobfavorite
     */
    @JsonProperty("data:key:favorite_jobfavorite")
    public DataKeyFavoriteJobfavorite getDataKeyFavoriteJobfavorite() {
        return dataKeyFavoriteJobfavorite;
    }

    /**
     * 
     * @param dataKeyFavoriteJobfavorite
     *     The data:key:favorite_jobfavorite
     */
    @JsonProperty("data:key:favorite_jobfavorite")
    public void setDataKeyFavoriteJobfavorite(DataKeyFavoriteJobfavorite dataKeyFavoriteJobfavorite) {
        this.dataKeyFavoriteJobfavorite = dataKeyFavoriteJobfavorite;
    }

    /**
     * 
     * @return
     *     The dataKeyCompanynumberCompanyinformation
     */
    @JsonProperty("data:key:companynumber_companyinformation")
    public DataKeyCompanynumberCompanyinformation_ getDataKeyCompanynumberCompanyinformation() {
        return dataKeyCompanynumberCompanyinformation;
    }

    /**
     * 
     * @param dataKeyCompanynumberCompanyinformation
     *     The data:key:companynumber_companyinformation
     */
    @JsonProperty("data:key:companynumber_companyinformation")
    public void setDataKeyCompanynumberCompanyinformation(DataKeyCompanynumberCompanyinformation_ dataKeyCompanynumberCompanyinformation) {
        this.dataKeyCompanynumberCompanyinformation = dataKeyCompanynumberCompanyinformation;
    }

    /**
     * 
     * @return
     *     The dataKeyInstancekeyNoteheader
     */
    @JsonProperty("data:key:instancekey_noteheader")
    public DataKeyInstancekeyNoteheader getDataKeyInstancekeyNoteheader() {
        return dataKeyInstancekeyNoteheader;
    }

    /**
     * 
     * @param dataKeyInstancekeyNoteheader
     *     The data:key:instancekey_noteheader
     */
    @JsonProperty("data:key:instancekey_noteheader")
    public void setDataKeyInstancekeyNoteheader(DataKeyInstancekeyNoteheader dataKeyInstancekeyNoteheader) {
        this.dataKeyInstancekeyNoteheader = dataKeyInstancekeyNoteheader;
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
     *     The dataKeyTransferredvatspecificationentryVatspecificationentry
     */
    @JsonProperty("data:key:transferredvatspecificationentry_vatspecificationentry")
    public DataKeyTransferredvatspecificationentryVatspecificationentry getDataKeyTransferredvatspecificationentryVatspecificationentry() {
        return dataKeyTransferredvatspecificationentryVatspecificationentry;
    }

    /**
     * 
     * @param dataKeyTransferredvatspecificationentryVatspecificationentry
     *     The data:key:transferredvatspecificationentry_vatspecificationentry
     */
    @JsonProperty("data:key:transferredvatspecificationentry_vatspecificationentry")
    public void setDataKeyTransferredvatspecificationentryVatspecificationentry(DataKeyTransferredvatspecificationentryVatspecificationentry dataKeyTransferredvatspecificationentryVatspecificationentry) {
        this.dataKeyTransferredvatspecificationentryVatspecificationentry = dataKeyTransferredvatspecificationentryVatspecificationentry;
    }

    /**
     * 
     * @return
     *     The dataKeyLineapprovalApprovalheader
     */
    @JsonProperty("data:key:lineapproval_approvalheader")
    public DataKeyLineapprovalApprovalheader getDataKeyLineapprovalApprovalheader() {
        return dataKeyLineapprovalApprovalheader;
    }

    /**
     * 
     * @param dataKeyLineapprovalApprovalheader
     *     The data:key:lineapproval_approvalheader
     */
    @JsonProperty("data:key:lineapproval_approvalheader")
    public void setDataKeyLineapprovalApprovalheader(DataKeyLineapprovalApprovalheader dataKeyLineapprovalApprovalheader) {
        this.dataKeyLineapprovalApprovalheader = dataKeyLineapprovalApprovalheader;
    }

    /**
     * 
     * @return
     *     The dataKeyPurchaseorderline
     */
    @JsonProperty("data:key:purchaseorderline")
    public DataKeyPurchaseorderline getDataKeyPurchaseorderline() {
        return dataKeyPurchaseorderline;
    }

    /**
     * 
     * @param dataKeyPurchaseorderline
     *     The data:key:purchaseorderline
     */
    @JsonProperty("data:key:purchaseorderline")
    public void setDataKeyPurchaseorderline(DataKeyPurchaseorderline dataKeyPurchaseorderline) {
        this.dataKeyPurchaseorderline = dataKeyPurchaseorderline;
    }

    /**
     * 
     * @return
     *     The actionPrint
     */
    @JsonProperty("action:print")
    public ActionPrint_ getActionPrint() {
        return actionPrint;
    }

    /**
     * 
     * @param actionPrint
     *     The action:print
     */
    @JsonProperty("action:print")
    public void setActionPrint(ActionPrint_ actionPrint) {
        this.actionPrint = actionPrint;
    }

    /**
     * 
     * @return
     *     The actionCopyexpensesheetline
     */
    @JsonProperty("action:copyexpensesheetline")
    public ActionCopyexpensesheetline getActionCopyexpensesheetline() {
        return actionCopyexpensesheetline;
    }

    /**
     * 
     * @param actionCopyexpensesheetline
     *     The action:copyexpensesheetline
     */
    @JsonProperty("action:copyexpensesheetline")
    public void setActionCopyexpensesheetline(ActionCopyexpensesheetline actionCopyexpensesheetline) {
        this.actionCopyexpensesheetline = actionCopyexpensesheetline;
    }

    /**
     * 
     * @return
     *     The actionActionsequence
     */
    @JsonProperty("action:actionsequence")
    public ActionActionsequence_ getActionActionsequence() {
        return actionActionsequence;
    }

    /**
     * 
     * @param actionActionsequence
     *     The action:actionsequence
     */
    @JsonProperty("action:actionsequence")
    public void setActionActionsequence(ActionActionsequence_ actionActionsequence) {
        this.actionActionsequence = actionActionsequence;
    }

    /**
     * 
     * @return
     *     The actionRunreport
     */
    @JsonProperty("action:runreport")
    public ActionRunreport_ getActionRunreport() {
        return actionRunreport;
    }

    /**
     * 
     * @param actionRunreport
     *     The action:runreport
     */
    @JsonProperty("action:runreport")
    public void setActionRunreport(ActionRunreport_ actionRunreport) {
        this.actionRunreport = actionRunreport;
    }

    /**
     * 
     * @return
     *     The actionEmailonaction
     */
    @JsonProperty("action:emailonaction")
    public ActionEmailonaction_ getActionEmailonaction() {
        return actionEmailonaction;
    }

    /**
     * 
     * @param actionEmailonaction
     *     The action:emailonaction
     */
    @JsonProperty("action:emailonaction")
    public void setActionEmailonaction(ActionEmailonaction_ actionEmailonaction) {
        this.actionEmailonaction = actionEmailonaction;
    }

    /**
     * 
     * @return
     *     The actionExportdataset
     */
    @JsonProperty("action:exportdataset")
    public ActionExportdataset_ getActionExportdataset() {
        return actionExportdataset;
    }

    /**
     * 
     * @param actionExportdataset
     *     The action:exportdataset
     */
    @JsonProperty("action:exportdataset")
    public void setActionExportdataset(ActionExportdataset_ actionExportdataset) {
        this.actionExportdataset = actionExportdataset;
    }

    /**
     * 
     * @return
     *     The actionCustomattachdocumenttoline
     */
    @JsonProperty("action:customattachdocumenttoline")
    public ActionCustomattachdocumenttoline getActionCustomattachdocumenttoline() {
        return actionCustomattachdocumenttoline;
    }

    /**
     * 
     * @param actionCustomattachdocumenttoline
     *     The action:customattachdocumenttoline
     */
    @JsonProperty("action:customattachdocumenttoline")
    public void setActionCustomattachdocumenttoline(ActionCustomattachdocumenttoline actionCustomattachdocumenttoline) {
        this.actionCustomattachdocumenttoline = actionCustomattachdocumenttoline;
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
        return new HashCodeBuilder().append(dataKeySpecification3nameSpecification3).append(dataKeySpecification2nameSpecification2).append(dataKeyEntitynameEntity).append(dataKeyFinancevatcode3Financevatcode).append(dataKeySpecification1nameSpecification1).append(dataKeyLocationnameLocation).append(dataKeyFinancevatcode2Financevatcode).append(dataKeyTimesheetlineinstancekeyTimesheetline).append(dataKeyLineapprovalApprovalline).append(dataKeyJobnumberJobheader).append(dataKeyPurposenamePurpose).append(dataKeyExpensesheetnumberExpensesheetheader).append(dataKeySpecification9nameSpecification9).append(dataKeySpecification8nameSpecification8).append(dataKeySpecification7nameSpecification7).append(dataKeyActivitynumberActivity).append(dataKeySpecification6nameSpecification6).append(dataKeyProjectnameProject).append(dataKeySpecification5nameSpecification5).append(dataKeySpecification4nameSpecification4).append(dataKeyActivitynumberExpensemileageactivity).append(dataKeySpecification10nameSpecification10).append(dataKeyFinancevatcodeFinancevatcode).append(dataKeyFavoriteExpensemileagejobfavorite).append(dataKeyFavoriteJobfavorite).append(dataKeyCompanynumberCompanyinformation).append(dataKeyInstancekeyNoteheader).append(dataKeyEmployeenumberEmployee).append(dataKeyTransferredvatspecificationentryVatspecificationentry).append(dataKeyLineapprovalApprovalheader).append(dataKeyPurchaseorderline).append(actionPrint).append(actionCopyexpensesheetline).append(actionActionsequence).append(actionRunreport).append(actionEmailonaction).append(actionExportdataset).append(actionCustomattachdocumenttoline).append(additionalProperties).toHashCode();
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
        return new EqualsBuilder().append(dataKeySpecification3nameSpecification3, rhs.dataKeySpecification3nameSpecification3).append(dataKeySpecification2nameSpecification2, rhs.dataKeySpecification2nameSpecification2).append(dataKeyEntitynameEntity, rhs.dataKeyEntitynameEntity).append(dataKeyFinancevatcode3Financevatcode, rhs.dataKeyFinancevatcode3Financevatcode).append(dataKeySpecification1nameSpecification1, rhs.dataKeySpecification1nameSpecification1).append(dataKeyLocationnameLocation, rhs.dataKeyLocationnameLocation).append(dataKeyFinancevatcode2Financevatcode, rhs.dataKeyFinancevatcode2Financevatcode).append(dataKeyTimesheetlineinstancekeyTimesheetline, rhs.dataKeyTimesheetlineinstancekeyTimesheetline).append(dataKeyLineapprovalApprovalline, rhs.dataKeyLineapprovalApprovalline).append(dataKeyJobnumberJobheader, rhs.dataKeyJobnumberJobheader).append(dataKeyPurposenamePurpose, rhs.dataKeyPurposenamePurpose).append(dataKeyExpensesheetnumberExpensesheetheader, rhs.dataKeyExpensesheetnumberExpensesheetheader).append(dataKeySpecification9nameSpecification9, rhs.dataKeySpecification9nameSpecification9).append(dataKeySpecification8nameSpecification8, rhs.dataKeySpecification8nameSpecification8).append(dataKeySpecification7nameSpecification7, rhs.dataKeySpecification7nameSpecification7).append(dataKeyActivitynumberActivity, rhs.dataKeyActivitynumberActivity).append(dataKeySpecification6nameSpecification6, rhs.dataKeySpecification6nameSpecification6).append(dataKeyProjectnameProject, rhs.dataKeyProjectnameProject).append(dataKeySpecification5nameSpecification5, rhs.dataKeySpecification5nameSpecification5).append(dataKeySpecification4nameSpecification4, rhs.dataKeySpecification4nameSpecification4).append(dataKeyActivitynumberExpensemileageactivity, rhs.dataKeyActivitynumberExpensemileageactivity).append(dataKeySpecification10nameSpecification10, rhs.dataKeySpecification10nameSpecification10).append(dataKeyFinancevatcodeFinancevatcode, rhs.dataKeyFinancevatcodeFinancevatcode).append(dataKeyFavoriteExpensemileagejobfavorite, rhs.dataKeyFavoriteExpensemileagejobfavorite).append(dataKeyFavoriteJobfavorite, rhs.dataKeyFavoriteJobfavorite).append(dataKeyCompanynumberCompanyinformation, rhs.dataKeyCompanynumberCompanyinformation).append(dataKeyInstancekeyNoteheader, rhs.dataKeyInstancekeyNoteheader).append(dataKeyEmployeenumberEmployee, rhs.dataKeyEmployeenumberEmployee).append(dataKeyTransferredvatspecificationentryVatspecificationentry, rhs.dataKeyTransferredvatspecificationentryVatspecificationentry).append(dataKeyLineapprovalApprovalheader, rhs.dataKeyLineapprovalApprovalheader).append(dataKeyPurchaseorderline, rhs.dataKeyPurchaseorderline).append(actionPrint, rhs.actionPrint).append(actionCopyexpensesheetline, rhs.actionCopyexpensesheetline).append(actionActionsequence, rhs.actionActionsequence).append(actionRunreport, rhs.actionRunreport).append(actionEmailonaction, rhs.actionEmailonaction).append(actionExportdataset, rhs.actionExportdataset).append(actionCustomattachdocumenttoline, rhs.actionCustomattachdocumenttoline).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
