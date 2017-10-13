
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
    "data:key:optionlistnumber1_optionlist",
    "data:key:companynumber_companyinformation",
    "data:key:projectname_project",
    "data:key:dailytimesheetheader",
    "data:key:specification1name_specification1",
    "data:key:employeenumber_employee",
    "data:key:locationname_location",
    "data:key:optionlistnumber2_optionlist",
    "data:key:specification3name_specification3",
    "data:key:entityname_entity",
    "data:key:purposename_purpose",
    "data:key:specification2name_specification2",
    "data:key:activitynumber_activity",
    "data:key:jobnumber_jobheader",
    "data:key:absencetype_absencetype",
    "data:key:optionlistnumber4_optionlist",
    "data:key:theoption_1",
    "data:key:theoption_3",
    "data:key:theoption_2",
    "data:key:optionlistnumber5_optionlist",
    "data:key:theoption_5",
    "data:key:theoption_4",
    "data:key:employeecategorynumber_employeecategorymember",
    "data:key:optionlistnumber3_optionlist",
    "data:key:jobfavorite",
    "action:insert",
    "action:create",
    "action:update",
    "action:delete",
    "action:exportdataset",
    "action:actionsequence",
    "action:emailonaction",
    "action:runreport",
    "action:createjobfavorite"
})
public class Links {

    @JsonProperty("data:key:optionlistnumber1_optionlist")
    private DataKeyOptionlistnumber1Optionlist dataKeyOptionlistnumber1Optionlist;
    @JsonProperty("data:key:companynumber_companyinformation")
    private DataKeyCompanynumberCompanyinformation dataKeyCompanynumberCompanyinformation;
    @JsonProperty("data:key:projectname_project")
    private DataKeyProjectnameProject dataKeyProjectnameProject;
    @JsonProperty("data:key:dailytimesheetheader")
    private DataKeyDailytimesheetheader dataKeyDailytimesheetheader;
    @JsonProperty("data:key:specification1name_specification1")
    private DataKeySpecification1nameSpecification1 dataKeySpecification1nameSpecification1;
    @JsonProperty("data:key:employeenumber_employee")
    private DataKeyEmployeenumberEmployee dataKeyEmployeenumberEmployee;
    @JsonProperty("data:key:locationname_location")
    private DataKeyLocationnameLocation dataKeyLocationnameLocation;
    @JsonProperty("data:key:optionlistnumber2_optionlist")
    private DataKeyOptionlistnumber2Optionlist dataKeyOptionlistnumber2Optionlist;
    @JsonProperty("data:key:specification3name_specification3")
    private DataKeySpecification3nameSpecification3 dataKeySpecification3nameSpecification3;
    @JsonProperty("data:key:entityname_entity")
    private DataKeyEntitynameEntity dataKeyEntitynameEntity;
    @JsonProperty("data:key:purposename_purpose")
    private DataKeyPurposenamePurpose dataKeyPurposenamePurpose;
    @JsonProperty("data:key:specification2name_specification2")
    private DataKeySpecification2nameSpecification2 dataKeySpecification2nameSpecification2;
    @JsonProperty("data:key:activitynumber_activity")
    private DataKeyActivitynumberActivity dataKeyActivitynumberActivity;
    @JsonProperty("data:key:jobnumber_jobheader")
    private DataKeyJobnumberJobheader dataKeyJobnumberJobheader;
    @JsonProperty("data:key:absencetype_absencetype")
    private DataKeyAbsencetypeAbsencetype dataKeyAbsencetypeAbsencetype;
    @JsonProperty("data:key:optionlistnumber4_optionlist")
    private DataKeyOptionlistnumber4Optionlist dataKeyOptionlistnumber4Optionlist;
    @JsonProperty("data:key:theoption_1")
    private DataKeyTheoption1 dataKeyTheoption1;
    @JsonProperty("data:key:theoption_3")
    private DataKeyTheoption3 dataKeyTheoption3;
    @JsonProperty("data:key:theoption_2")
    private DataKeyTheoption2 dataKeyTheoption2;
    @JsonProperty("data:key:optionlistnumber5_optionlist")
    private DataKeyOptionlistnumber5Optionlist dataKeyOptionlistnumber5Optionlist;
    @JsonProperty("data:key:theoption_5")
    private DataKeyTheoption5 dataKeyTheoption5;
    @JsonProperty("data:key:theoption_4")
    private DataKeyTheoption4 dataKeyTheoption4;
    @JsonProperty("data:key:employeecategorynumber_employeecategorymember")
    private DataKeyEmployeecategorynumberEmployeecategorymember dataKeyEmployeecategorynumberEmployeecategorymember;
    @JsonProperty("data:key:optionlistnumber3_optionlist")
    private DataKeyOptionlistnumber3Optionlist dataKeyOptionlistnumber3Optionlist;
    @JsonProperty("data:key:jobfavorite")
    private DataKeyJobfavorite dataKeyJobfavorite;
    @JsonProperty("action:insert")
    private ActionInsert actionInsert;
    @JsonProperty("action:create")
    private ActionCreate actionCreate;
    @JsonProperty("action:update")
    private ActionUpdate actionUpdate;
    @JsonProperty("action:delete")
    private ActionDelete actionDelete;
    @JsonProperty("action:exportdataset")
    private ActionExportdataset actionExportdataset;
    @JsonProperty("action:actionsequence")
    private ActionActionsequence actionActionsequence;
    @JsonProperty("action:emailonaction")
    private ActionEmailonaction actionEmailonaction;
    @JsonProperty("action:runreport")
    private ActionRunreport actionRunreport;
    @JsonProperty("action:createjobfavorite")
    private ActionCreatejobfavorite actionCreatejobfavorite;
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
     * @param dataKeyDailytimesheetheader
     * @param actionEmailonaction
     * @param dataKeyOptionlistnumber5Optionlist
     * @param dataKeySpecification1nameSpecification1
     * @param dataKeyOptionlistnumber4Optionlist
     * @param actionActionsequence
     * @param actionCreatejobfavorite
     * @param dataKeyEmployeenumberEmployee
     * @param dataKeyEntitynameEntity
     * @param actionCreate
     * @param dataKeyActivitynumberActivity
     * @param dataKeyLocationnameLocation
     * @param actionRunreport
     * @param dataKeyTheoption5
     * @param dataKeyJobfavorite
     * @param actionInsert
     * @param dataKeyPurposenamePurpose
     * @param dataKeyJobnumberJobheader
     * @param dataKeyTheoption1
     * @param dataKeyTheoption2
     * @param dataKeyTheoption3
     * @param dataKeyTheoption4
     * @param dataKeyOptionlistnumber3Optionlist
     * @param dataKeyCompanynumberCompanyinformation
     * @param actionUpdate
     * @param dataKeyOptionlistnumber2Optionlist
     * @param dataKeyAbsencetypeAbsencetype
     * @param dataKeyProjectnameProject
     * @param dataKeyEmployeecategorynumberEmployeecategorymember
     * @param dataKeySpecification2nameSpecification2
     * @param actionExportdataset
     * @param actionDelete
     * @param dataKeySpecification3nameSpecification3
     * @param dataKeyOptionlistnumber1Optionlist
     */
    public Links(DataKeyOptionlistnumber1Optionlist dataKeyOptionlistnumber1Optionlist, DataKeyCompanynumberCompanyinformation dataKeyCompanynumberCompanyinformation, DataKeyProjectnameProject dataKeyProjectnameProject, DataKeyDailytimesheetheader dataKeyDailytimesheetheader, DataKeySpecification1nameSpecification1 dataKeySpecification1nameSpecification1, DataKeyEmployeenumberEmployee dataKeyEmployeenumberEmployee, DataKeyLocationnameLocation dataKeyLocationnameLocation, DataKeyOptionlistnumber2Optionlist dataKeyOptionlistnumber2Optionlist, DataKeySpecification3nameSpecification3 dataKeySpecification3nameSpecification3, DataKeyEntitynameEntity dataKeyEntitynameEntity, DataKeyPurposenamePurpose dataKeyPurposenamePurpose, DataKeySpecification2nameSpecification2 dataKeySpecification2nameSpecification2, DataKeyActivitynumberActivity dataKeyActivitynumberActivity, DataKeyJobnumberJobheader dataKeyJobnumberJobheader, DataKeyAbsencetypeAbsencetype dataKeyAbsencetypeAbsencetype, DataKeyOptionlistnumber4Optionlist dataKeyOptionlistnumber4Optionlist, DataKeyTheoption1 dataKeyTheoption1, DataKeyTheoption3 dataKeyTheoption3, DataKeyTheoption2 dataKeyTheoption2, DataKeyOptionlistnumber5Optionlist dataKeyOptionlistnumber5Optionlist, DataKeyTheoption5 dataKeyTheoption5, DataKeyTheoption4 dataKeyTheoption4, DataKeyEmployeecategorynumberEmployeecategorymember dataKeyEmployeecategorynumberEmployeecategorymember, DataKeyOptionlistnumber3Optionlist dataKeyOptionlistnumber3Optionlist, DataKeyJobfavorite dataKeyJobfavorite, ActionInsert actionInsert, ActionCreate actionCreate, ActionUpdate actionUpdate, ActionDelete actionDelete, ActionExportdataset actionExportdataset, ActionActionsequence actionActionsequence, ActionEmailonaction actionEmailonaction, ActionRunreport actionRunreport, ActionCreatejobfavorite actionCreatejobfavorite) {
        super();
        this.dataKeyOptionlistnumber1Optionlist = dataKeyOptionlistnumber1Optionlist;
        this.dataKeyCompanynumberCompanyinformation = dataKeyCompanynumberCompanyinformation;
        this.dataKeyProjectnameProject = dataKeyProjectnameProject;
        this.dataKeyDailytimesheetheader = dataKeyDailytimesheetheader;
        this.dataKeySpecification1nameSpecification1 = dataKeySpecification1nameSpecification1;
        this.dataKeyEmployeenumberEmployee = dataKeyEmployeenumberEmployee;
        this.dataKeyLocationnameLocation = dataKeyLocationnameLocation;
        this.dataKeyOptionlistnumber2Optionlist = dataKeyOptionlistnumber2Optionlist;
        this.dataKeySpecification3nameSpecification3 = dataKeySpecification3nameSpecification3;
        this.dataKeyEntitynameEntity = dataKeyEntitynameEntity;
        this.dataKeyPurposenamePurpose = dataKeyPurposenamePurpose;
        this.dataKeySpecification2nameSpecification2 = dataKeySpecification2nameSpecification2;
        this.dataKeyActivitynumberActivity = dataKeyActivitynumberActivity;
        this.dataKeyJobnumberJobheader = dataKeyJobnumberJobheader;
        this.dataKeyAbsencetypeAbsencetype = dataKeyAbsencetypeAbsencetype;
        this.dataKeyOptionlistnumber4Optionlist = dataKeyOptionlistnumber4Optionlist;
        this.dataKeyTheoption1 = dataKeyTheoption1;
        this.dataKeyTheoption3 = dataKeyTheoption3;
        this.dataKeyTheoption2 = dataKeyTheoption2;
        this.dataKeyOptionlistnumber5Optionlist = dataKeyOptionlistnumber5Optionlist;
        this.dataKeyTheoption5 = dataKeyTheoption5;
        this.dataKeyTheoption4 = dataKeyTheoption4;
        this.dataKeyEmployeecategorynumberEmployeecategorymember = dataKeyEmployeecategorynumberEmployeecategorymember;
        this.dataKeyOptionlistnumber3Optionlist = dataKeyOptionlistnumber3Optionlist;
        this.dataKeyJobfavorite = dataKeyJobfavorite;
        this.actionInsert = actionInsert;
        this.actionCreate = actionCreate;
        this.actionUpdate = actionUpdate;
        this.actionDelete = actionDelete;
        this.actionExportdataset = actionExportdataset;
        this.actionActionsequence = actionActionsequence;
        this.actionEmailonaction = actionEmailonaction;
        this.actionRunreport = actionRunreport;
        this.actionCreatejobfavorite = actionCreatejobfavorite;
    }

    @JsonProperty("data:key:optionlistnumber1_optionlist")
    public DataKeyOptionlistnumber1Optionlist getDataKeyOptionlistnumber1Optionlist() {
        return dataKeyOptionlistnumber1Optionlist;
    }

    @JsonProperty("data:key:optionlistnumber1_optionlist")
    public void setDataKeyOptionlistnumber1Optionlist(DataKeyOptionlistnumber1Optionlist dataKeyOptionlistnumber1Optionlist) {
        this.dataKeyOptionlistnumber1Optionlist = dataKeyOptionlistnumber1Optionlist;
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

    @JsonProperty("data:key:dailytimesheetheader")
    public DataKeyDailytimesheetheader getDataKeyDailytimesheetheader() {
        return dataKeyDailytimesheetheader;
    }

    @JsonProperty("data:key:dailytimesheetheader")
    public void setDataKeyDailytimesheetheader(DataKeyDailytimesheetheader dataKeyDailytimesheetheader) {
        this.dataKeyDailytimesheetheader = dataKeyDailytimesheetheader;
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

    @JsonProperty("data:key:locationname_location")
    public DataKeyLocationnameLocation getDataKeyLocationnameLocation() {
        return dataKeyLocationnameLocation;
    }

    @JsonProperty("data:key:locationname_location")
    public void setDataKeyLocationnameLocation(DataKeyLocationnameLocation dataKeyLocationnameLocation) {
        this.dataKeyLocationnameLocation = dataKeyLocationnameLocation;
    }

    @JsonProperty("data:key:optionlistnumber2_optionlist")
    public DataKeyOptionlistnumber2Optionlist getDataKeyOptionlistnumber2Optionlist() {
        return dataKeyOptionlistnumber2Optionlist;
    }

    @JsonProperty("data:key:optionlistnumber2_optionlist")
    public void setDataKeyOptionlistnumber2Optionlist(DataKeyOptionlistnumber2Optionlist dataKeyOptionlistnumber2Optionlist) {
        this.dataKeyOptionlistnumber2Optionlist = dataKeyOptionlistnumber2Optionlist;
    }

    @JsonProperty("data:key:specification3name_specification3")
    public DataKeySpecification3nameSpecification3 getDataKeySpecification3nameSpecification3() {
        return dataKeySpecification3nameSpecification3;
    }

    @JsonProperty("data:key:specification3name_specification3")
    public void setDataKeySpecification3nameSpecification3(DataKeySpecification3nameSpecification3 dataKeySpecification3nameSpecification3) {
        this.dataKeySpecification3nameSpecification3 = dataKeySpecification3nameSpecification3;
    }

    @JsonProperty("data:key:entityname_entity")
    public DataKeyEntitynameEntity getDataKeyEntitynameEntity() {
        return dataKeyEntitynameEntity;
    }

    @JsonProperty("data:key:entityname_entity")
    public void setDataKeyEntitynameEntity(DataKeyEntitynameEntity dataKeyEntitynameEntity) {
        this.dataKeyEntitynameEntity = dataKeyEntitynameEntity;
    }

    @JsonProperty("data:key:purposename_purpose")
    public DataKeyPurposenamePurpose getDataKeyPurposenamePurpose() {
        return dataKeyPurposenamePurpose;
    }

    @JsonProperty("data:key:purposename_purpose")
    public void setDataKeyPurposenamePurpose(DataKeyPurposenamePurpose dataKeyPurposenamePurpose) {
        this.dataKeyPurposenamePurpose = dataKeyPurposenamePurpose;
    }

    @JsonProperty("data:key:specification2name_specification2")
    public DataKeySpecification2nameSpecification2 getDataKeySpecification2nameSpecification2() {
        return dataKeySpecification2nameSpecification2;
    }

    @JsonProperty("data:key:specification2name_specification2")
    public void setDataKeySpecification2nameSpecification2(DataKeySpecification2nameSpecification2 dataKeySpecification2nameSpecification2) {
        this.dataKeySpecification2nameSpecification2 = dataKeySpecification2nameSpecification2;
    }

    @JsonProperty("data:key:activitynumber_activity")
    public DataKeyActivitynumberActivity getDataKeyActivitynumberActivity() {
        return dataKeyActivitynumberActivity;
    }

    @JsonProperty("data:key:activitynumber_activity")
    public void setDataKeyActivitynumberActivity(DataKeyActivitynumberActivity dataKeyActivitynumberActivity) {
        this.dataKeyActivitynumberActivity = dataKeyActivitynumberActivity;
    }

    @JsonProperty("data:key:jobnumber_jobheader")
    public DataKeyJobnumberJobheader getDataKeyJobnumberJobheader() {
        return dataKeyJobnumberJobheader;
    }

    @JsonProperty("data:key:jobnumber_jobheader")
    public void setDataKeyJobnumberJobheader(DataKeyJobnumberJobheader dataKeyJobnumberJobheader) {
        this.dataKeyJobnumberJobheader = dataKeyJobnumberJobheader;
    }

    @JsonProperty("data:key:absencetype_absencetype")
    public DataKeyAbsencetypeAbsencetype getDataKeyAbsencetypeAbsencetype() {
        return dataKeyAbsencetypeAbsencetype;
    }

    @JsonProperty("data:key:absencetype_absencetype")
    public void setDataKeyAbsencetypeAbsencetype(DataKeyAbsencetypeAbsencetype dataKeyAbsencetypeAbsencetype) {
        this.dataKeyAbsencetypeAbsencetype = dataKeyAbsencetypeAbsencetype;
    }

    @JsonProperty("data:key:optionlistnumber4_optionlist")
    public DataKeyOptionlistnumber4Optionlist getDataKeyOptionlistnumber4Optionlist() {
        return dataKeyOptionlistnumber4Optionlist;
    }

    @JsonProperty("data:key:optionlistnumber4_optionlist")
    public void setDataKeyOptionlistnumber4Optionlist(DataKeyOptionlistnumber4Optionlist dataKeyOptionlistnumber4Optionlist) {
        this.dataKeyOptionlistnumber4Optionlist = dataKeyOptionlistnumber4Optionlist;
    }

    @JsonProperty("data:key:theoption_1")
    public DataKeyTheoption1 getDataKeyTheoption1() {
        return dataKeyTheoption1;
    }

    @JsonProperty("data:key:theoption_1")
    public void setDataKeyTheoption1(DataKeyTheoption1 dataKeyTheoption1) {
        this.dataKeyTheoption1 = dataKeyTheoption1;
    }

    @JsonProperty("data:key:theoption_3")
    public DataKeyTheoption3 getDataKeyTheoption3() {
        return dataKeyTheoption3;
    }

    @JsonProperty("data:key:theoption_3")
    public void setDataKeyTheoption3(DataKeyTheoption3 dataKeyTheoption3) {
        this.dataKeyTheoption3 = dataKeyTheoption3;
    }

    @JsonProperty("data:key:theoption_2")
    public DataKeyTheoption2 getDataKeyTheoption2() {
        return dataKeyTheoption2;
    }

    @JsonProperty("data:key:theoption_2")
    public void setDataKeyTheoption2(DataKeyTheoption2 dataKeyTheoption2) {
        this.dataKeyTheoption2 = dataKeyTheoption2;
    }

    @JsonProperty("data:key:optionlistnumber5_optionlist")
    public DataKeyOptionlistnumber5Optionlist getDataKeyOptionlistnumber5Optionlist() {
        return dataKeyOptionlistnumber5Optionlist;
    }

    @JsonProperty("data:key:optionlistnumber5_optionlist")
    public void setDataKeyOptionlistnumber5Optionlist(DataKeyOptionlistnumber5Optionlist dataKeyOptionlistnumber5Optionlist) {
        this.dataKeyOptionlistnumber5Optionlist = dataKeyOptionlistnumber5Optionlist;
    }

    @JsonProperty("data:key:theoption_5")
    public DataKeyTheoption5 getDataKeyTheoption5() {
        return dataKeyTheoption5;
    }

    @JsonProperty("data:key:theoption_5")
    public void setDataKeyTheoption5(DataKeyTheoption5 dataKeyTheoption5) {
        this.dataKeyTheoption5 = dataKeyTheoption5;
    }

    @JsonProperty("data:key:theoption_4")
    public DataKeyTheoption4 getDataKeyTheoption4() {
        return dataKeyTheoption4;
    }

    @JsonProperty("data:key:theoption_4")
    public void setDataKeyTheoption4(DataKeyTheoption4 dataKeyTheoption4) {
        this.dataKeyTheoption4 = dataKeyTheoption4;
    }

    @JsonProperty("data:key:employeecategorynumber_employeecategorymember")
    public DataKeyEmployeecategorynumberEmployeecategorymember getDataKeyEmployeecategorynumberEmployeecategorymember() {
        return dataKeyEmployeecategorynumberEmployeecategorymember;
    }

    @JsonProperty("data:key:employeecategorynumber_employeecategorymember")
    public void setDataKeyEmployeecategorynumberEmployeecategorymember(DataKeyEmployeecategorynumberEmployeecategorymember dataKeyEmployeecategorynumberEmployeecategorymember) {
        this.dataKeyEmployeecategorynumberEmployeecategorymember = dataKeyEmployeecategorynumberEmployeecategorymember;
    }

    @JsonProperty("data:key:optionlistnumber3_optionlist")
    public DataKeyOptionlistnumber3Optionlist getDataKeyOptionlistnumber3Optionlist() {
        return dataKeyOptionlistnumber3Optionlist;
    }

    @JsonProperty("data:key:optionlistnumber3_optionlist")
    public void setDataKeyOptionlistnumber3Optionlist(DataKeyOptionlistnumber3Optionlist dataKeyOptionlistnumber3Optionlist) {
        this.dataKeyOptionlistnumber3Optionlist = dataKeyOptionlistnumber3Optionlist;
    }

    @JsonProperty("data:key:jobfavorite")
    public DataKeyJobfavorite getDataKeyJobfavorite() {
        return dataKeyJobfavorite;
    }

    @JsonProperty("data:key:jobfavorite")
    public void setDataKeyJobfavorite(DataKeyJobfavorite dataKeyJobfavorite) {
        this.dataKeyJobfavorite = dataKeyJobfavorite;
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

    @JsonProperty("action:exportdataset")
    public ActionExportdataset getActionExportdataset() {
        return actionExportdataset;
    }

    @JsonProperty("action:exportdataset")
    public void setActionExportdataset(ActionExportdataset actionExportdataset) {
        this.actionExportdataset = actionExportdataset;
    }

    @JsonProperty("action:actionsequence")
    public ActionActionsequence getActionActionsequence() {
        return actionActionsequence;
    }

    @JsonProperty("action:actionsequence")
    public void setActionActionsequence(ActionActionsequence actionActionsequence) {
        this.actionActionsequence = actionActionsequence;
    }

    @JsonProperty("action:emailonaction")
    public ActionEmailonaction getActionEmailonaction() {
        return actionEmailonaction;
    }

    @JsonProperty("action:emailonaction")
    public void setActionEmailonaction(ActionEmailonaction actionEmailonaction) {
        this.actionEmailonaction = actionEmailonaction;
    }

    @JsonProperty("action:runreport")
    public ActionRunreport getActionRunreport() {
        return actionRunreport;
    }

    @JsonProperty("action:runreport")
    public void setActionRunreport(ActionRunreport actionRunreport) {
        this.actionRunreport = actionRunreport;
    }

    @JsonProperty("action:createjobfavorite")
    public ActionCreatejobfavorite getActionCreatejobfavorite() {
        return actionCreatejobfavorite;
    }

    @JsonProperty("action:createjobfavorite")
    public void setActionCreatejobfavorite(ActionCreatejobfavorite actionCreatejobfavorite) {
        this.actionCreatejobfavorite = actionCreatejobfavorite;
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
        return new HashCodeBuilder().append(dataKeyDailytimesheetheader).append(actionEmailonaction).append(dataKeyOptionlistnumber5Optionlist).append(dataKeySpecification1nameSpecification1).append(dataKeyOptionlistnumber4Optionlist).append(actionActionsequence).append(actionCreatejobfavorite).append(dataKeyEmployeenumberEmployee).append(dataKeyEntitynameEntity).append(actionCreate).append(dataKeyActivitynumberActivity).append(dataKeyLocationnameLocation).append(actionRunreport).append(dataKeyTheoption5).append(dataKeyJobfavorite).append(actionInsert).append(dataKeyJobnumberJobheader).append(dataKeyPurposenamePurpose).append(dataKeyTheoption1).append(dataKeyTheoption2).append(dataKeyTheoption3).append(dataKeyTheoption4).append(dataKeyOptionlistnumber3Optionlist).append(dataKeyCompanynumberCompanyinformation).append(actionUpdate).append(dataKeyOptionlistnumber2Optionlist).append(dataKeyAbsencetypeAbsencetype).append(dataKeyProjectnameProject).append(dataKeyEmployeecategorynumberEmployeecategorymember).append(additionalProperties).append(dataKeySpecification2nameSpecification2).append(actionExportdataset).append(actionDelete).append(dataKeySpecification3nameSpecification3).append(dataKeyOptionlistnumber1Optionlist).toHashCode();
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
        return new EqualsBuilder().append(dataKeyDailytimesheetheader, rhs.dataKeyDailytimesheetheader).append(actionEmailonaction, rhs.actionEmailonaction).append(dataKeyOptionlistnumber5Optionlist, rhs.dataKeyOptionlistnumber5Optionlist).append(dataKeySpecification1nameSpecification1, rhs.dataKeySpecification1nameSpecification1).append(dataKeyOptionlistnumber4Optionlist, rhs.dataKeyOptionlistnumber4Optionlist).append(actionActionsequence, rhs.actionActionsequence).append(actionCreatejobfavorite, rhs.actionCreatejobfavorite).append(dataKeyEmployeenumberEmployee, rhs.dataKeyEmployeenumberEmployee).append(dataKeyEntitynameEntity, rhs.dataKeyEntitynameEntity).append(actionCreate, rhs.actionCreate).append(dataKeyActivitynumberActivity, rhs.dataKeyActivitynumberActivity).append(dataKeyLocationnameLocation, rhs.dataKeyLocationnameLocation).append(actionRunreport, rhs.actionRunreport).append(dataKeyTheoption5, rhs.dataKeyTheoption5).append(dataKeyJobfavorite, rhs.dataKeyJobfavorite).append(actionInsert, rhs.actionInsert).append(dataKeyJobnumberJobheader, rhs.dataKeyJobnumberJobheader).append(dataKeyPurposenamePurpose, rhs.dataKeyPurposenamePurpose).append(dataKeyTheoption1, rhs.dataKeyTheoption1).append(dataKeyTheoption2, rhs.dataKeyTheoption2).append(dataKeyTheoption3, rhs.dataKeyTheoption3).append(dataKeyTheoption4, rhs.dataKeyTheoption4).append(dataKeyOptionlistnumber3Optionlist, rhs.dataKeyOptionlistnumber3Optionlist).append(dataKeyCompanynumberCompanyinformation, rhs.dataKeyCompanynumberCompanyinformation).append(actionUpdate, rhs.actionUpdate).append(dataKeyOptionlistnumber2Optionlist, rhs.dataKeyOptionlistnumber2Optionlist).append(dataKeyAbsencetypeAbsencetype, rhs.dataKeyAbsencetypeAbsencetype).append(dataKeyProjectnameProject, rhs.dataKeyProjectnameProject).append(dataKeyEmployeecategorynumberEmployeecategorymember, rhs.dataKeyEmployeecategorynumberEmployeecategorymember).append(additionalProperties, rhs.additionalProperties).append(dataKeySpecification2nameSpecification2, rhs.dataKeySpecification2nameSpecification2).append(actionExportdataset, rhs.actionExportdataset).append(actionDelete, rhs.actionDelete).append(dataKeySpecification3nameSpecification3, rhs.dataKeySpecification3nameSpecification3).append(dataKeyOptionlistnumber1Optionlist, rhs.dataKeyOptionlistnumber1Optionlist).isEquals();
    }

}
