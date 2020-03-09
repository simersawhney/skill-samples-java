
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
    "data:key:specification3name_specification3",
    "data:key:specification2name_specification2",
    "data:key:entityname_entity",
    "data:key:optionlistnumber1_optionlist",
    "data:key:optionlistnumber4_optionlist",
    "data:key:specification1name_specification1",
    "data:key:absencetype_absencetype",
    "data:key:jobfavorite",
    "data:key:locationname_location",
    "data:key:employeecategorynumber_employeecategorymember",
    "data:key:theoption_1",
    "data:key:jobnumber_jobheader",
    "data:key:purposename_purpose",
    "data:key:theoption_3",
    "data:key:theoption_2",
    "data:key:specification9name_specification9",
    "data:key:optionlistnumber3_optionlist",
    "data:key:theoption_5",
    "data:key:theoption_4",
    "data:key:specification8name_specification8",
    "data:key:specification7name_specification7",
    "data:key:activitynumber_activity",
    "data:key:specification6name_specification6",
    "data:key:projectname_project",
    "data:key:specification5name_specification5",
    "data:key:specification4name_specification4",
    "data:key:conversationinstancekey_conversation",
    "data:key:specification10name_specification10",
    "data:key:dailytimesheetheader",
    "data:key:companynumber_companyinformation",
    "data:key:employeenumber_employee",
    "data:key:purchaseorderline",
    "data:key:optionlistnumber5_optionlist",
    "data:key:optionlistnumber2_optionlist",
    "action:insert",
    "action:create",
    "action:update",
    "action:delete",
    "action:starttimer",
    "action:actionsequence",
    "action:runreport",
    "action:createjobfavorite",
    "action:stoptimer",
    "action:emailonaction",
    "action:createconversation",
    "action:transfertime",
    "action:exportdataset"
})
public class Links__ {

    @JsonProperty("data:key:specification3name_specification3")
    private DataKeySpecification3nameSpecification3 dataKeySpecification3nameSpecification3;
    @JsonProperty("data:key:specification2name_specification2")
    private DataKeySpecification2nameSpecification2 dataKeySpecification2nameSpecification2;
    @JsonProperty("data:key:entityname_entity")
    private DataKeyEntitynameEntity dataKeyEntitynameEntity;
    @JsonProperty("data:key:optionlistnumber1_optionlist")
    private DataKeyOptionlistnumber1Optionlist dataKeyOptionlistnumber1Optionlist;
    @JsonProperty("data:key:optionlistnumber4_optionlist")
    private DataKeyOptionlistnumber4Optionlist dataKeyOptionlistnumber4Optionlist;
    @JsonProperty("data:key:specification1name_specification1")
    private DataKeySpecification1nameSpecification1 dataKeySpecification1nameSpecification1;
    @JsonProperty("data:key:absencetype_absencetype")
    private DataKeyAbsencetypeAbsencetype dataKeyAbsencetypeAbsencetype;
    @JsonProperty("data:key:jobfavorite")
    private DataKeyJobfavorite dataKeyJobfavorite;
    @JsonProperty("data:key:locationname_location")
    private DataKeyLocationnameLocation dataKeyLocationnameLocation;
    @JsonProperty("data:key:employeecategorynumber_employeecategorymember")
    private DataKeyEmployeecategorynumberEmployeecategorymember dataKeyEmployeecategorynumberEmployeecategorymember;
    @JsonProperty("data:key:theoption_1")
    private DataKeyTheoption1 dataKeyTheoption1;
    @JsonProperty("data:key:jobnumber_jobheader")
    private DataKeyJobnumberJobheader dataKeyJobnumberJobheader;
    @JsonProperty("data:key:purposename_purpose")
    private DataKeyPurposenamePurpose dataKeyPurposenamePurpose;
    @JsonProperty("data:key:theoption_3")
    private DataKeyTheoption3 dataKeyTheoption3;
    @JsonProperty("data:key:theoption_2")
    private DataKeyTheoption2 dataKeyTheoption2;
    @JsonProperty("data:key:specification9name_specification9")
    private DataKeySpecification9nameSpecification9 dataKeySpecification9nameSpecification9;
    @JsonProperty("data:key:optionlistnumber3_optionlist")
    private DataKeyOptionlistnumber3Optionlist dataKeyOptionlistnumber3Optionlist;
    @JsonProperty("data:key:theoption_5")
    private DataKeyTheoption5 dataKeyTheoption5;
    @JsonProperty("data:key:theoption_4")
    private DataKeyTheoption4 dataKeyTheoption4;
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
    @JsonProperty("data:key:conversationinstancekey_conversation")
    private DataKeyConversationinstancekeyConversation dataKeyConversationinstancekeyConversation;
    @JsonProperty("data:key:specification10name_specification10")
    private DataKeySpecification10nameSpecification10 dataKeySpecification10nameSpecification10;
    @JsonProperty("data:key:dailytimesheetheader")
    private DataKeyDailytimesheetheader dataKeyDailytimesheetheader;
    @JsonProperty("data:key:companynumber_companyinformation")
    private DataKeyCompanynumberCompanyinformation dataKeyCompanynumberCompanyinformation;
    @JsonProperty("data:key:employeenumber_employee")
    private DataKeyEmployeenumberEmployee_ dataKeyEmployeenumberEmployee;
    @JsonProperty("data:key:purchaseorderline")
    private DataKeyPurchaseorderline dataKeyPurchaseorderline;
    @JsonProperty("data:key:optionlistnumber5_optionlist")
    private DataKeyOptionlistnumber5Optionlist dataKeyOptionlistnumber5Optionlist;
    @JsonProperty("data:key:optionlistnumber2_optionlist")
    private DataKeyOptionlistnumber2Optionlist dataKeyOptionlistnumber2Optionlist;
    @JsonProperty("action:insert")
    private ActionInsert actionInsert;
    @JsonProperty("action:create")
    private ActionCreate actionCreate;
    @JsonProperty("action:update")
    private ActionUpdate_ actionUpdate;
    @JsonProperty("action:delete")
    private ActionDelete actionDelete;
    @JsonProperty("action:starttimer")
    private ActionStarttimer actionStarttimer;
    @JsonProperty("action:actionsequence")
    private ActionActionsequence_ actionActionsequence;
    @JsonProperty("action:runreport")
    private ActionRunreport_ actionRunreport;
    @JsonProperty("action:createjobfavorite")
    private ActionCreatejobfavorite actionCreatejobfavorite;
    @JsonProperty("action:stoptimer")
    private ActionStoptimer actionStoptimer;
    @JsonProperty("action:emailonaction")
    private ActionEmailonaction_ actionEmailonaction;
    @JsonProperty("action:createconversation")
    private ActionCreateconversation actionCreateconversation;
    @JsonProperty("action:transfertime")
    private ActionTransfertime actionTransfertime;
    @JsonProperty("action:exportdataset")
    private ActionExportdataset_ actionExportdataset;
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
     * @param dataKeyConversationinstancekeyConversation
     * @param actionRunreport
     * @param dataKeyJobfavorite
     * @param dataKeyOptionlistnumber2Optionlist
     * @param dataKeyActivitynumberActivity
     * @param dataKeySpecification2nameSpecification2
     * @param dataKeyLocationnameLocation
     * @param dataKeySpecification4nameSpecification4
     * @param dataKeyOptionlistnumber4Optionlist
     * @param dataKeyCompanynumberCompanyinformation
     * @param dataKeyJobnumberJobheader
     * @param dataKeySpecification9nameSpecification9
     * @param actionUpdate
     * @param actionTransfertime
     * @param dataKeyEmployeecategorynumberEmployeecategorymember
     * @param actionEmailonaction
     * @param dataKeyPurposenamePurpose
     * @param dataKeyOptionlistnumber5Optionlist
     * @param actionExportdataset
     * @param dataKeySpecification6nameSpecification6
     * @param dataKeySpecification10nameSpecification10
     * @param actionCreateconversation
     * @param actionCreatejobfavorite
     * @param dataKeySpecification3nameSpecification3
     * @param actionStarttimer
     * @param dataKeyOptionlistnumber3Optionlist
     * @param actionCreate
     * @param dataKeyAbsencetypeAbsencetype
     * @param dataKeyTheoption3
     * @param dataKeyTheoption4
     * @param dataKeyTheoption1
     * @param dataKeyTheoption2
     * @param dataKeyProjectnameProject
     * @param dataKeyTheoption5
     * @param actionInsert
     * @param dataKeyPurchaseorderline
     * @param actionDelete
     * @param dataKeySpecification1nameSpecification1
     * @param actionActionsequence
     * @param dataKeyEntitynameEntity
     * @param dataKeySpecification5nameSpecification5
     * @param actionStoptimer
     * @param dataKeySpecification8nameSpecification8
     * @param dataKeyOptionlistnumber1Optionlist
     * @param dataKeyDailytimesheetheader
     * @param dataKeyEmployeenumberEmployee
     */
    public Links__(DataKeySpecification3nameSpecification3 dataKeySpecification3nameSpecification3, DataKeySpecification2nameSpecification2 dataKeySpecification2nameSpecification2, DataKeyEntitynameEntity dataKeyEntitynameEntity, DataKeyOptionlistnumber1Optionlist dataKeyOptionlistnumber1Optionlist, DataKeyOptionlistnumber4Optionlist dataKeyOptionlistnumber4Optionlist, DataKeySpecification1nameSpecification1 dataKeySpecification1nameSpecification1, DataKeyAbsencetypeAbsencetype dataKeyAbsencetypeAbsencetype, DataKeyJobfavorite dataKeyJobfavorite, DataKeyLocationnameLocation dataKeyLocationnameLocation, DataKeyEmployeecategorynumberEmployeecategorymember dataKeyEmployeecategorynumberEmployeecategorymember, DataKeyTheoption1 dataKeyTheoption1, DataKeyJobnumberJobheader dataKeyJobnumberJobheader, DataKeyPurposenamePurpose dataKeyPurposenamePurpose, DataKeyTheoption3 dataKeyTheoption3, DataKeyTheoption2 dataKeyTheoption2, DataKeySpecification9nameSpecification9 dataKeySpecification9nameSpecification9, DataKeyOptionlistnumber3Optionlist dataKeyOptionlistnumber3Optionlist, DataKeyTheoption5 dataKeyTheoption5, DataKeyTheoption4 dataKeyTheoption4, DataKeySpecification8nameSpecification8 dataKeySpecification8nameSpecification8, DataKeySpecification7nameSpecification7 dataKeySpecification7nameSpecification7, DataKeyActivitynumberActivity dataKeyActivitynumberActivity, DataKeySpecification6nameSpecification6 dataKeySpecification6nameSpecification6, DataKeyProjectnameProject dataKeyProjectnameProject, DataKeySpecification5nameSpecification5 dataKeySpecification5nameSpecification5, DataKeySpecification4nameSpecification4 dataKeySpecification4nameSpecification4, DataKeyConversationinstancekeyConversation dataKeyConversationinstancekeyConversation, DataKeySpecification10nameSpecification10 dataKeySpecification10nameSpecification10, DataKeyDailytimesheetheader dataKeyDailytimesheetheader, DataKeyCompanynumberCompanyinformation dataKeyCompanynumberCompanyinformation, DataKeyEmployeenumberEmployee_ dataKeyEmployeenumberEmployee, DataKeyPurchaseorderline dataKeyPurchaseorderline, DataKeyOptionlistnumber5Optionlist dataKeyOptionlistnumber5Optionlist, DataKeyOptionlistnumber2Optionlist dataKeyOptionlistnumber2Optionlist, ActionInsert actionInsert, ActionCreate actionCreate, ActionUpdate_ actionUpdate, ActionDelete actionDelete, ActionStarttimer actionStarttimer, ActionActionsequence_ actionActionsequence, ActionRunreport_ actionRunreport, ActionCreatejobfavorite actionCreatejobfavorite, ActionStoptimer actionStoptimer, ActionEmailonaction_ actionEmailonaction, ActionCreateconversation actionCreateconversation, ActionTransfertime actionTransfertime, ActionExportdataset_ actionExportdataset) {
        this.dataKeySpecification3nameSpecification3 = dataKeySpecification3nameSpecification3;
        this.dataKeySpecification2nameSpecification2 = dataKeySpecification2nameSpecification2;
        this.dataKeyEntitynameEntity = dataKeyEntitynameEntity;
        this.dataKeyOptionlistnumber1Optionlist = dataKeyOptionlistnumber1Optionlist;
        this.dataKeyOptionlistnumber4Optionlist = dataKeyOptionlistnumber4Optionlist;
        this.dataKeySpecification1nameSpecification1 = dataKeySpecification1nameSpecification1;
        this.dataKeyAbsencetypeAbsencetype = dataKeyAbsencetypeAbsencetype;
        this.dataKeyJobfavorite = dataKeyJobfavorite;
        this.dataKeyLocationnameLocation = dataKeyLocationnameLocation;
        this.dataKeyEmployeecategorynumberEmployeecategorymember = dataKeyEmployeecategorynumberEmployeecategorymember;
        this.dataKeyTheoption1 = dataKeyTheoption1;
        this.dataKeyJobnumberJobheader = dataKeyJobnumberJobheader;
        this.dataKeyPurposenamePurpose = dataKeyPurposenamePurpose;
        this.dataKeyTheoption3 = dataKeyTheoption3;
        this.dataKeyTheoption2 = dataKeyTheoption2;
        this.dataKeySpecification9nameSpecification9 = dataKeySpecification9nameSpecification9;
        this.dataKeyOptionlistnumber3Optionlist = dataKeyOptionlistnumber3Optionlist;
        this.dataKeyTheoption5 = dataKeyTheoption5;
        this.dataKeyTheoption4 = dataKeyTheoption4;
        this.dataKeySpecification8nameSpecification8 = dataKeySpecification8nameSpecification8;
        this.dataKeySpecification7nameSpecification7 = dataKeySpecification7nameSpecification7;
        this.dataKeyActivitynumberActivity = dataKeyActivitynumberActivity;
        this.dataKeySpecification6nameSpecification6 = dataKeySpecification6nameSpecification6;
        this.dataKeyProjectnameProject = dataKeyProjectnameProject;
        this.dataKeySpecification5nameSpecification5 = dataKeySpecification5nameSpecification5;
        this.dataKeySpecification4nameSpecification4 = dataKeySpecification4nameSpecification4;
        this.dataKeyConversationinstancekeyConversation = dataKeyConversationinstancekeyConversation;
        this.dataKeySpecification10nameSpecification10 = dataKeySpecification10nameSpecification10;
        this.dataKeyDailytimesheetheader = dataKeyDailytimesheetheader;
        this.dataKeyCompanynumberCompanyinformation = dataKeyCompanynumberCompanyinformation;
        this.dataKeyEmployeenumberEmployee = dataKeyEmployeenumberEmployee;
        this.dataKeyPurchaseorderline = dataKeyPurchaseorderline;
        this.dataKeyOptionlistnumber5Optionlist = dataKeyOptionlistnumber5Optionlist;
        this.dataKeyOptionlistnumber2Optionlist = dataKeyOptionlistnumber2Optionlist;
        this.actionInsert = actionInsert;
        this.actionCreate = actionCreate;
        this.actionUpdate = actionUpdate;
        this.actionDelete = actionDelete;
        this.actionStarttimer = actionStarttimer;
        this.actionActionsequence = actionActionsequence;
        this.actionRunreport = actionRunreport;
        this.actionCreatejobfavorite = actionCreatejobfavorite;
        this.actionStoptimer = actionStoptimer;
        this.actionEmailonaction = actionEmailonaction;
        this.actionCreateconversation = actionCreateconversation;
        this.actionTransfertime = actionTransfertime;
        this.actionExportdataset = actionExportdataset;
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
     *     The dataKeyOptionlistnumber1Optionlist
     */
    @JsonProperty("data:key:optionlistnumber1_optionlist")
    public DataKeyOptionlistnumber1Optionlist getDataKeyOptionlistnumber1Optionlist() {
        return dataKeyOptionlistnumber1Optionlist;
    }

    /**
     * 
     * @param dataKeyOptionlistnumber1Optionlist
     *     The data:key:optionlistnumber1_optionlist
     */
    @JsonProperty("data:key:optionlistnumber1_optionlist")
    public void setDataKeyOptionlistnumber1Optionlist(DataKeyOptionlistnumber1Optionlist dataKeyOptionlistnumber1Optionlist) {
        this.dataKeyOptionlistnumber1Optionlist = dataKeyOptionlistnumber1Optionlist;
    }

    /**
     * 
     * @return
     *     The dataKeyOptionlistnumber4Optionlist
     */
    @JsonProperty("data:key:optionlistnumber4_optionlist")
    public DataKeyOptionlistnumber4Optionlist getDataKeyOptionlistnumber4Optionlist() {
        return dataKeyOptionlistnumber4Optionlist;
    }

    /**
     * 
     * @param dataKeyOptionlistnumber4Optionlist
     *     The data:key:optionlistnumber4_optionlist
     */
    @JsonProperty("data:key:optionlistnumber4_optionlist")
    public void setDataKeyOptionlistnumber4Optionlist(DataKeyOptionlistnumber4Optionlist dataKeyOptionlistnumber4Optionlist) {
        this.dataKeyOptionlistnumber4Optionlist = dataKeyOptionlistnumber4Optionlist;
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
     *     The dataKeyAbsencetypeAbsencetype
     */
    @JsonProperty("data:key:absencetype_absencetype")
    public DataKeyAbsencetypeAbsencetype getDataKeyAbsencetypeAbsencetype() {
        return dataKeyAbsencetypeAbsencetype;
    }

    /**
     * 
     * @param dataKeyAbsencetypeAbsencetype
     *     The data:key:absencetype_absencetype
     */
    @JsonProperty("data:key:absencetype_absencetype")
    public void setDataKeyAbsencetypeAbsencetype(DataKeyAbsencetypeAbsencetype dataKeyAbsencetypeAbsencetype) {
        this.dataKeyAbsencetypeAbsencetype = dataKeyAbsencetypeAbsencetype;
    }

    /**
     * 
     * @return
     *     The dataKeyJobfavorite
     */
    @JsonProperty("data:key:jobfavorite")
    public DataKeyJobfavorite getDataKeyJobfavorite() {
        return dataKeyJobfavorite;
    }

    /**
     * 
     * @param dataKeyJobfavorite
     *     The data:key:jobfavorite
     */
    @JsonProperty("data:key:jobfavorite")
    public void setDataKeyJobfavorite(DataKeyJobfavorite dataKeyJobfavorite) {
        this.dataKeyJobfavorite = dataKeyJobfavorite;
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
     *     The dataKeyEmployeecategorynumberEmployeecategorymember
     */
    @JsonProperty("data:key:employeecategorynumber_employeecategorymember")
    public DataKeyEmployeecategorynumberEmployeecategorymember getDataKeyEmployeecategorynumberEmployeecategorymember() {
        return dataKeyEmployeecategorynumberEmployeecategorymember;
    }

    /**
     * 
     * @param dataKeyEmployeecategorynumberEmployeecategorymember
     *     The data:key:employeecategorynumber_employeecategorymember
     */
    @JsonProperty("data:key:employeecategorynumber_employeecategorymember")
    public void setDataKeyEmployeecategorynumberEmployeecategorymember(DataKeyEmployeecategorynumberEmployeecategorymember dataKeyEmployeecategorynumberEmployeecategorymember) {
        this.dataKeyEmployeecategorynumberEmployeecategorymember = dataKeyEmployeecategorynumberEmployeecategorymember;
    }

    /**
     * 
     * @return
     *     The dataKeyTheoption1
     */
    @JsonProperty("data:key:theoption_1")
    public DataKeyTheoption1 getDataKeyTheoption1() {
        return dataKeyTheoption1;
    }

    /**
     * 
     * @param dataKeyTheoption1
     *     The data:key:theoption_1
     */
    @JsonProperty("data:key:theoption_1")
    public void setDataKeyTheoption1(DataKeyTheoption1 dataKeyTheoption1) {
        this.dataKeyTheoption1 = dataKeyTheoption1;
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
     *     The dataKeyTheoption3
     */
    @JsonProperty("data:key:theoption_3")
    public DataKeyTheoption3 getDataKeyTheoption3() {
        return dataKeyTheoption3;
    }

    /**
     * 
     * @param dataKeyTheoption3
     *     The data:key:theoption_3
     */
    @JsonProperty("data:key:theoption_3")
    public void setDataKeyTheoption3(DataKeyTheoption3 dataKeyTheoption3) {
        this.dataKeyTheoption3 = dataKeyTheoption3;
    }

    /**
     * 
     * @return
     *     The dataKeyTheoption2
     */
    @JsonProperty("data:key:theoption_2")
    public DataKeyTheoption2 getDataKeyTheoption2() {
        return dataKeyTheoption2;
    }

    /**
     * 
     * @param dataKeyTheoption2
     *     The data:key:theoption_2
     */
    @JsonProperty("data:key:theoption_2")
    public void setDataKeyTheoption2(DataKeyTheoption2 dataKeyTheoption2) {
        this.dataKeyTheoption2 = dataKeyTheoption2;
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
     *     The dataKeyOptionlistnumber3Optionlist
     */
    @JsonProperty("data:key:optionlistnumber3_optionlist")
    public DataKeyOptionlistnumber3Optionlist getDataKeyOptionlistnumber3Optionlist() {
        return dataKeyOptionlistnumber3Optionlist;
    }

    /**
     * 
     * @param dataKeyOptionlistnumber3Optionlist
     *     The data:key:optionlistnumber3_optionlist
     */
    @JsonProperty("data:key:optionlistnumber3_optionlist")
    public void setDataKeyOptionlistnumber3Optionlist(DataKeyOptionlistnumber3Optionlist dataKeyOptionlistnumber3Optionlist) {
        this.dataKeyOptionlistnumber3Optionlist = dataKeyOptionlistnumber3Optionlist;
    }

    /**
     * 
     * @return
     *     The dataKeyTheoption5
     */
    @JsonProperty("data:key:theoption_5")
    public DataKeyTheoption5 getDataKeyTheoption5() {
        return dataKeyTheoption5;
    }

    /**
     * 
     * @param dataKeyTheoption5
     *     The data:key:theoption_5
     */
    @JsonProperty("data:key:theoption_5")
    public void setDataKeyTheoption5(DataKeyTheoption5 dataKeyTheoption5) {
        this.dataKeyTheoption5 = dataKeyTheoption5;
    }

    /**
     * 
     * @return
     *     The dataKeyTheoption4
     */
    @JsonProperty("data:key:theoption_4")
    public DataKeyTheoption4 getDataKeyTheoption4() {
        return dataKeyTheoption4;
    }

    /**
     * 
     * @param dataKeyTheoption4
     *     The data:key:theoption_4
     */
    @JsonProperty("data:key:theoption_4")
    public void setDataKeyTheoption4(DataKeyTheoption4 dataKeyTheoption4) {
        this.dataKeyTheoption4 = dataKeyTheoption4;
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
     *     The dataKeyConversationinstancekeyConversation
     */
    @JsonProperty("data:key:conversationinstancekey_conversation")
    public DataKeyConversationinstancekeyConversation getDataKeyConversationinstancekeyConversation() {
        return dataKeyConversationinstancekeyConversation;
    }

    /**
     * 
     * @param dataKeyConversationinstancekeyConversation
     *     The data:key:conversationinstancekey_conversation
     */
    @JsonProperty("data:key:conversationinstancekey_conversation")
    public void setDataKeyConversationinstancekeyConversation(DataKeyConversationinstancekeyConversation dataKeyConversationinstancekeyConversation) {
        this.dataKeyConversationinstancekeyConversation = dataKeyConversationinstancekeyConversation;
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
     *     The dataKeyDailytimesheetheader
     */
    @JsonProperty("data:key:dailytimesheetheader")
    public DataKeyDailytimesheetheader getDataKeyDailytimesheetheader() {
        return dataKeyDailytimesheetheader;
    }

    /**
     * 
     * @param dataKeyDailytimesheetheader
     *     The data:key:dailytimesheetheader
     */
    @JsonProperty("data:key:dailytimesheetheader")
    public void setDataKeyDailytimesheetheader(DataKeyDailytimesheetheader dataKeyDailytimesheetheader) {
        this.dataKeyDailytimesheetheader = dataKeyDailytimesheetheader;
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
     *     The dataKeyEmployeenumberEmployee
     */
    @JsonProperty("data:key:employeenumber_employee")
    public DataKeyEmployeenumberEmployee_ getDataKeyEmployeenumberEmployee() {
        return dataKeyEmployeenumberEmployee;
    }

    /**
     * 
     * @param dataKeyEmployeenumberEmployee
     *     The data:key:employeenumber_employee
     */
    @JsonProperty("data:key:employeenumber_employee")
    public void setDataKeyEmployeenumberEmployee(DataKeyEmployeenumberEmployee_ dataKeyEmployeenumberEmployee) {
        this.dataKeyEmployeenumberEmployee = dataKeyEmployeenumberEmployee;
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
     *     The dataKeyOptionlistnumber5Optionlist
     */
    @JsonProperty("data:key:optionlistnumber5_optionlist")
    public DataKeyOptionlistnumber5Optionlist getDataKeyOptionlistnumber5Optionlist() {
        return dataKeyOptionlistnumber5Optionlist;
    }

    /**
     * 
     * @param dataKeyOptionlistnumber5Optionlist
     *     The data:key:optionlistnumber5_optionlist
     */
    @JsonProperty("data:key:optionlistnumber5_optionlist")
    public void setDataKeyOptionlistnumber5Optionlist(DataKeyOptionlistnumber5Optionlist dataKeyOptionlistnumber5Optionlist) {
        this.dataKeyOptionlistnumber5Optionlist = dataKeyOptionlistnumber5Optionlist;
    }

    /**
     * 
     * @return
     *     The dataKeyOptionlistnumber2Optionlist
     */
    @JsonProperty("data:key:optionlistnumber2_optionlist")
    public DataKeyOptionlistnumber2Optionlist getDataKeyOptionlistnumber2Optionlist() {
        return dataKeyOptionlistnumber2Optionlist;
    }

    /**
     * 
     * @param dataKeyOptionlistnumber2Optionlist
     *     The data:key:optionlistnumber2_optionlist
     */
    @JsonProperty("data:key:optionlistnumber2_optionlist")
    public void setDataKeyOptionlistnumber2Optionlist(DataKeyOptionlistnumber2Optionlist dataKeyOptionlistnumber2Optionlist) {
        this.dataKeyOptionlistnumber2Optionlist = dataKeyOptionlistnumber2Optionlist;
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
     *     The actionUpdate
     */
    @JsonProperty("action:update")
    public ActionUpdate_ getActionUpdate() {
        return actionUpdate;
    }

    /**
     * 
     * @param actionUpdate
     *     The action:update
     */
    @JsonProperty("action:update")
    public void setActionUpdate(ActionUpdate_ actionUpdate) {
        this.actionUpdate = actionUpdate;
    }

    /**
     * 
     * @return
     *     The actionDelete
     */
    @JsonProperty("action:delete")
    public ActionDelete getActionDelete() {
        return actionDelete;
    }

    /**
     * 
     * @param actionDelete
     *     The action:delete
     */
    @JsonProperty("action:delete")
    public void setActionDelete(ActionDelete actionDelete) {
        this.actionDelete = actionDelete;
    }

    /**
     * 
     * @return
     *     The actionStarttimer
     */
    @JsonProperty("action:starttimer")
    public ActionStarttimer getActionStarttimer() {
        return actionStarttimer;
    }

    /**
     * 
     * @param actionStarttimer
     *     The action:starttimer
     */
    @JsonProperty("action:starttimer")
    public void setActionStarttimer(ActionStarttimer actionStarttimer) {
        this.actionStarttimer = actionStarttimer;
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
     *     The actionCreatejobfavorite
     */
    @JsonProperty("action:createjobfavorite")
    public ActionCreatejobfavorite getActionCreatejobfavorite() {
        return actionCreatejobfavorite;
    }

    /**
     * 
     * @param actionCreatejobfavorite
     *     The action:createjobfavorite
     */
    @JsonProperty("action:createjobfavorite")
    public void setActionCreatejobfavorite(ActionCreatejobfavorite actionCreatejobfavorite) {
        this.actionCreatejobfavorite = actionCreatejobfavorite;
    }

    /**
     * 
     * @return
     *     The actionStoptimer
     */
    @JsonProperty("action:stoptimer")
    public ActionStoptimer getActionStoptimer() {
        return actionStoptimer;
    }

    /**
     * 
     * @param actionStoptimer
     *     The action:stoptimer
     */
    @JsonProperty("action:stoptimer")
    public void setActionStoptimer(ActionStoptimer actionStoptimer) {
        this.actionStoptimer = actionStoptimer;
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
     *     The actionCreateconversation
     */
    @JsonProperty("action:createconversation")
    public ActionCreateconversation getActionCreateconversation() {
        return actionCreateconversation;
    }

    /**
     * 
     * @param actionCreateconversation
     *     The action:createconversation
     */
    @JsonProperty("action:createconversation")
    public void setActionCreateconversation(ActionCreateconversation actionCreateconversation) {
        this.actionCreateconversation = actionCreateconversation;
    }

    /**
     * 
     * @return
     *     The actionTransfertime
     */
    @JsonProperty("action:transfertime")
    public ActionTransfertime getActionTransfertime() {
        return actionTransfertime;
    }

    /**
     * 
     * @param actionTransfertime
     *     The action:transfertime
     */
    @JsonProperty("action:transfertime")
    public void setActionTransfertime(ActionTransfertime actionTransfertime) {
        this.actionTransfertime = actionTransfertime;
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
        return new HashCodeBuilder().append(dataKeySpecification3nameSpecification3).append(dataKeySpecification2nameSpecification2).append(dataKeyEntitynameEntity).append(dataKeyOptionlistnumber1Optionlist).append(dataKeyOptionlistnumber4Optionlist).append(dataKeySpecification1nameSpecification1).append(dataKeyAbsencetypeAbsencetype).append(dataKeyJobfavorite).append(dataKeyLocationnameLocation).append(dataKeyEmployeecategorynumberEmployeecategorymember).append(dataKeyTheoption1).append(dataKeyJobnumberJobheader).append(dataKeyPurposenamePurpose).append(dataKeyTheoption3).append(dataKeyTheoption2).append(dataKeySpecification9nameSpecification9).append(dataKeyOptionlistnumber3Optionlist).append(dataKeyTheoption5).append(dataKeyTheoption4).append(dataKeySpecification8nameSpecification8).append(dataKeySpecification7nameSpecification7).append(dataKeyActivitynumberActivity).append(dataKeySpecification6nameSpecification6).append(dataKeyProjectnameProject).append(dataKeySpecification5nameSpecification5).append(dataKeySpecification4nameSpecification4).append(dataKeyConversationinstancekeyConversation).append(dataKeySpecification10nameSpecification10).append(dataKeyDailytimesheetheader).append(dataKeyCompanynumberCompanyinformation).append(dataKeyEmployeenumberEmployee).append(dataKeyPurchaseorderline).append(dataKeyOptionlistnumber5Optionlist).append(dataKeyOptionlistnumber2Optionlist).append(actionInsert).append(actionCreate).append(actionUpdate).append(actionDelete).append(actionStarttimer).append(actionActionsequence).append(actionRunreport).append(actionCreatejobfavorite).append(actionStoptimer).append(actionEmailonaction).append(actionCreateconversation).append(actionTransfertime).append(actionExportdataset).append(additionalProperties).toHashCode();
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
        return new EqualsBuilder().append(dataKeySpecification3nameSpecification3, rhs.dataKeySpecification3nameSpecification3).append(dataKeySpecification2nameSpecification2, rhs.dataKeySpecification2nameSpecification2).append(dataKeyEntitynameEntity, rhs.dataKeyEntitynameEntity).append(dataKeyOptionlistnumber1Optionlist, rhs.dataKeyOptionlistnumber1Optionlist).append(dataKeyOptionlistnumber4Optionlist, rhs.dataKeyOptionlistnumber4Optionlist).append(dataKeySpecification1nameSpecification1, rhs.dataKeySpecification1nameSpecification1).append(dataKeyAbsencetypeAbsencetype, rhs.dataKeyAbsencetypeAbsencetype).append(dataKeyJobfavorite, rhs.dataKeyJobfavorite).append(dataKeyLocationnameLocation, rhs.dataKeyLocationnameLocation).append(dataKeyEmployeecategorynumberEmployeecategorymember, rhs.dataKeyEmployeecategorynumberEmployeecategorymember).append(dataKeyTheoption1, rhs.dataKeyTheoption1).append(dataKeyJobnumberJobheader, rhs.dataKeyJobnumberJobheader).append(dataKeyPurposenamePurpose, rhs.dataKeyPurposenamePurpose).append(dataKeyTheoption3, rhs.dataKeyTheoption3).append(dataKeyTheoption2, rhs.dataKeyTheoption2).append(dataKeySpecification9nameSpecification9, rhs.dataKeySpecification9nameSpecification9).append(dataKeyOptionlistnumber3Optionlist, rhs.dataKeyOptionlistnumber3Optionlist).append(dataKeyTheoption5, rhs.dataKeyTheoption5).append(dataKeyTheoption4, rhs.dataKeyTheoption4).append(dataKeySpecification8nameSpecification8, rhs.dataKeySpecification8nameSpecification8).append(dataKeySpecification7nameSpecification7, rhs.dataKeySpecification7nameSpecification7).append(dataKeyActivitynumberActivity, rhs.dataKeyActivitynumberActivity).append(dataKeySpecification6nameSpecification6, rhs.dataKeySpecification6nameSpecification6).append(dataKeyProjectnameProject, rhs.dataKeyProjectnameProject).append(dataKeySpecification5nameSpecification5, rhs.dataKeySpecification5nameSpecification5).append(dataKeySpecification4nameSpecification4, rhs.dataKeySpecification4nameSpecification4).append(dataKeyConversationinstancekeyConversation, rhs.dataKeyConversationinstancekeyConversation).append(dataKeySpecification10nameSpecification10, rhs.dataKeySpecification10nameSpecification10).append(dataKeyDailytimesheetheader, rhs.dataKeyDailytimesheetheader).append(dataKeyCompanynumberCompanyinformation, rhs.dataKeyCompanynumberCompanyinformation).append(dataKeyEmployeenumberEmployee, rhs.dataKeyEmployeenumberEmployee).append(dataKeyPurchaseorderline, rhs.dataKeyPurchaseorderline).append(dataKeyOptionlistnumber5Optionlist, rhs.dataKeyOptionlistnumber5Optionlist).append(dataKeyOptionlistnumber2Optionlist, rhs.dataKeyOptionlistnumber2Optionlist).append(actionInsert, rhs.actionInsert).append(actionCreate, rhs.actionCreate).append(actionUpdate, rhs.actionUpdate).append(actionDelete, rhs.actionDelete).append(actionStarttimer, rhs.actionStarttimer).append(actionActionsequence, rhs.actionActionsequence).append(actionRunreport, rhs.actionRunreport).append(actionCreatejobfavorite, rhs.actionCreatejobfavorite).append(actionStoptimer, rhs.actionStoptimer).append(actionEmailonaction, rhs.actionEmailonaction).append(actionCreateconversation, rhs.actionCreateconversation).append(actionTransfertime, rhs.actionTransfertime).append(actionExportdataset, rhs.actionExportdataset).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
