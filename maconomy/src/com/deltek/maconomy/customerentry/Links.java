
package com.deltek.maconomy.customerentry;

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
    "data:same-key",
    "data:key:projectname_project",
    "data:key:journalnumber_journal",
    "data:key:specification1name_specification1",
    "data:key:companycustomercustomerpaymentmode_customerpaymentmode",
    "data:key:locationname_location",
    "data:key:companycustomerspecification1name_specification1",
    "data:key:companycustomerspecification3name_specification3",
    "data:key:companyoforigin_companyinformation",
    "data:key:entityname_entity",
    "data:key:salespersonnumber_employee",
    "data:key:purposename_purpose",
    "data:key:ourcontact_employee",
    "data:key:companycustomerentityname_entity",
    "data:key:country_country",
    "data:key:specification2name_specification2",
    "data:key:documentarchivenumber_documentarchiveheader",
    "data:key:dimensioncombnumber_dimensioncombheader",
    "data:key:accountstatementcustomer_customer",
    "data:key:postaldistrict_1",
    "data:key:companycustomerpurposename_purpose",
    "data:key:customerentrycompanynumber_companyinformation",
    "data:key:remindertextgroupname_remindertextgroupheader",
    "data:key:creditgeneraljournal_customerpayment",
    "data:key:companycustomerprojectname_project",
    "data:key:companycustomercompanynumber_companyinformation",
    "data:key:accountstatement",
    "data:key:paymentagent_paymentagentinformation",
    "data:key:specification3name_specification3",
    "data:key:companycustomer",
    "data:key:companycustomerlocationname_location",
    "data:key:holidaycalendarname_holidaycalendarheader",
    "data:key:customernumber_customer",
    "data:key:activitynumber_activity",
    "data:key:jobnumber_jobheader",
    "data:key:paymentcustomer_customer",
    "data:key:interestreminderprinciple_interestreminderprinciple",
    "data:key:companycustomerspecification2name_specification2",
    "data:key:customerentrycustomerpaymentmode_customerpaymentmode",
    "data:key:accesslevelname_accesslevelheader",
    "data:key:parentcustomer_customer",
    "data:key:departmentnumber_department"
})
public class Links {

    @JsonProperty("data:same-key")
    private DataSameKey dataSameKey;
    @JsonProperty("data:key:projectname_project")
    private DataKeyProjectnameProject dataKeyProjectnameProject;
    @JsonProperty("data:key:journalnumber_journal")
    private DataKeyJournalnumberJournal dataKeyJournalnumberJournal;
    @JsonProperty("data:key:specification1name_specification1")
    private DataKeySpecification1nameSpecification1 dataKeySpecification1nameSpecification1;
    @JsonProperty("data:key:companycustomercustomerpaymentmode_customerpaymentmode")
    private DataKeyCompanycustomercustomerpaymentmodeCustomerpaymentmode dataKeyCompanycustomercustomerpaymentmodeCustomerpaymentmode;
    @JsonProperty("data:key:locationname_location")
    private DataKeyLocationnameLocation dataKeyLocationnameLocation;
    @JsonProperty("data:key:companycustomerspecification1name_specification1")
    private DataKeyCompanycustomerspecification1nameSpecification1 dataKeyCompanycustomerspecification1nameSpecification1;
    @JsonProperty("data:key:companycustomerspecification3name_specification3")
    private DataKeyCompanycustomerspecification3nameSpecification3 dataKeyCompanycustomerspecification3nameSpecification3;
    @JsonProperty("data:key:companyoforigin_companyinformation")
    private DataKeyCompanyoforiginCompanyinformation dataKeyCompanyoforiginCompanyinformation;
    @JsonProperty("data:key:entityname_entity")
    private DataKeyEntitynameEntity dataKeyEntitynameEntity;
    @JsonProperty("data:key:salespersonnumber_employee")
    private DataKeySalespersonnumberEmployee dataKeySalespersonnumberEmployee;
    @JsonProperty("data:key:purposename_purpose")
    private DataKeyPurposenamePurpose dataKeyPurposenamePurpose;
    @JsonProperty("data:key:ourcontact_employee")
    private DataKeyOurcontactEmployee dataKeyOurcontactEmployee;
    @JsonProperty("data:key:companycustomerentityname_entity")
    private DataKeyCompanycustomerentitynameEntity dataKeyCompanycustomerentitynameEntity;
    @JsonProperty("data:key:country_country")
    private DataKeyCountryCountry dataKeyCountryCountry;
    @JsonProperty("data:key:specification2name_specification2")
    private DataKeySpecification2nameSpecification2 dataKeySpecification2nameSpecification2;
    @JsonProperty("data:key:documentarchivenumber_documentarchiveheader")
    private DataKeyDocumentarchivenumberDocumentarchiveheader dataKeyDocumentarchivenumberDocumentarchiveheader;
    @JsonProperty("data:key:dimensioncombnumber_dimensioncombheader")
    private DataKeyDimensioncombnumberDimensioncombheader dataKeyDimensioncombnumberDimensioncombheader;
    @JsonProperty("data:key:accountstatementcustomer_customer")
    private DataKeyAccountstatementcustomerCustomer dataKeyAccountstatementcustomerCustomer;
    @JsonProperty("data:key:postaldistrict_1")
    private DataKeyPostaldistrict1 dataKeyPostaldistrict1;
    @JsonProperty("data:key:companycustomerpurposename_purpose")
    private DataKeyCompanycustomerpurposenamePurpose dataKeyCompanycustomerpurposenamePurpose;
    @JsonProperty("data:key:customerentrycompanynumber_companyinformation")
    private DataKeyCustomerentrycompanynumberCompanyinformation dataKeyCustomerentrycompanynumberCompanyinformation;
    @JsonProperty("data:key:remindertextgroupname_remindertextgroupheader")
    private DataKeyRemindertextgroupnameRemindertextgroupheader dataKeyRemindertextgroupnameRemindertextgroupheader;
    @JsonProperty("data:key:creditgeneraljournal_customerpayment")
    private DataKeyCreditgeneraljournalCustomerpayment dataKeyCreditgeneraljournalCustomerpayment;
    @JsonProperty("data:key:companycustomerprojectname_project")
    private DataKeyCompanycustomerprojectnameProject dataKeyCompanycustomerprojectnameProject;
    @JsonProperty("data:key:companycustomercompanynumber_companyinformation")
    private DataKeyCompanycustomercompanynumberCompanyinformation dataKeyCompanycustomercompanynumberCompanyinformation;
    @JsonProperty("data:key:accountstatement")
    private DataKeyAccountstatement dataKeyAccountstatement;
    @JsonProperty("data:key:paymentagent_paymentagentinformation")
    private DataKeyPaymentagentPaymentagentinformation dataKeyPaymentagentPaymentagentinformation;
    @JsonProperty("data:key:specification3name_specification3")
    private DataKeySpecification3nameSpecification3 dataKeySpecification3nameSpecification3;
    @JsonProperty("data:key:companycustomer")
    private DataKeyCompanycustomer dataKeyCompanycustomer;
    @JsonProperty("data:key:companycustomerlocationname_location")
    private DataKeyCompanycustomerlocationnameLocation dataKeyCompanycustomerlocationnameLocation;
    @JsonProperty("data:key:holidaycalendarname_holidaycalendarheader")
    private DataKeyHolidaycalendarnameHolidaycalendarheader dataKeyHolidaycalendarnameHolidaycalendarheader;
    @JsonProperty("data:key:customernumber_customer")
    private DataKeyCustomernumberCustomer dataKeyCustomernumberCustomer;
    @JsonProperty("data:key:activitynumber_activity")
    private DataKeyActivitynumberActivity dataKeyActivitynumberActivity;
    @JsonProperty("data:key:jobnumber_jobheader")
    private DataKeyJobnumberJobheader dataKeyJobnumberJobheader;
    @JsonProperty("data:key:paymentcustomer_customer")
    private DataKeyPaymentcustomerCustomer dataKeyPaymentcustomerCustomer;
    @JsonProperty("data:key:interestreminderprinciple_interestreminderprinciple")
    private DataKeyInterestreminderprincipleInterestreminderprinciple dataKeyInterestreminderprincipleInterestreminderprinciple;
    @JsonProperty("data:key:companycustomerspecification2name_specification2")
    private DataKeyCompanycustomerspecification2nameSpecification2 dataKeyCompanycustomerspecification2nameSpecification2;
    @JsonProperty("data:key:customerentrycustomerpaymentmode_customerpaymentmode")
    private DataKeyCustomerentrycustomerpaymentmodeCustomerpaymentmode dataKeyCustomerentrycustomerpaymentmodeCustomerpaymentmode;
    @JsonProperty("data:key:accesslevelname_accesslevelheader")
    private DataKeyAccesslevelnameAccesslevelheader dataKeyAccesslevelnameAccesslevelheader;
    @JsonProperty("data:key:parentcustomer_customer")
    private DataKeyParentcustomerCustomer dataKeyParentcustomerCustomer;
    @JsonProperty("data:key:departmentnumber_department")
    private DataKeyDepartmentnumberDepartment dataKeyDepartmentnumberDepartment;
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
     * @param dataKeyPostaldistrict1
     * @param dataKeyHolidaycalendarnameHolidaycalendarheader
     * @param dataKeySpecification1nameSpecification1
     * @param dataKeyCompanycustomer
     * @param dataKeyCompanyoforiginCompanyinformation
     * @param dataKeyCompanycustomerspecification3nameSpecification3
     * @param dataKeySalespersonnumberEmployee
     * @param dataKeyInterestreminderprincipleInterestreminderprinciple
     * @param dataKeyJournalnumberJournal
     * @param dataKeyCustomerentrycompanynumberCompanyinformation
     * @param dataKeyEntitynameEntity
     * @param dataKeyAccesslevelnameAccesslevelheader
     * @param dataKeyCompanycustomerspecification2nameSpecification2
     * @param dataKeyActivitynumberActivity
     * @param dataSameKey
     * @param dataKeyLocationnameLocation
     * @param dataKeyCustomernumberCustomer
     * @param dataKeyPaymentagentPaymentagentinformation
     * @param dataKeyDocumentarchivenumberDocumentarchiveheader
     * @param dataKeyAccountstatementcustomerCustomer
     * @param dataKeyCompanycustomercompanynumberCompanyinformation
     * @param dataKeyJobnumberJobheader
     * @param dataKeyPurposenamePurpose
     * @param dataKeyAccountstatement
     * @param dataKeyCompanycustomerentitynameEntity
     * @param dataKeyCompanycustomerpurposenamePurpose
     * @param dataKeyPaymentcustomerCustomer
     * @param dataKeyCompanycustomercustomerpaymentmodeCustomerpaymentmode
     * @param dataKeyCompanycustomerspecification1nameSpecification1
     * @param dataKeyCustomerentrycustomerpaymentmodeCustomerpaymentmode
     * @param dataKeyCompanycustomerprojectnameProject
     * @param dataKeyDepartmentnumberDepartment
     * @param dataKeyCreditgeneraljournalCustomerpayment
     * @param dataKeyProjectnameProject
     * @param dataKeyDimensioncombnumberDimensioncombheader
     * @param dataKeyOurcontactEmployee
     * @param dataKeyCountryCountry
     * @param dataKeyRemindertextgroupnameRemindertextgroupheader
     * @param dataKeySpecification2nameSpecification2
     * @param dataKeyParentcustomerCustomer
     * @param dataKeySpecification3nameSpecification3
     * @param dataKeyCompanycustomerlocationnameLocation
     */
    public Links(DataSameKey dataSameKey, DataKeyProjectnameProject dataKeyProjectnameProject, DataKeyJournalnumberJournal dataKeyJournalnumberJournal, DataKeySpecification1nameSpecification1 dataKeySpecification1nameSpecification1, DataKeyCompanycustomercustomerpaymentmodeCustomerpaymentmode dataKeyCompanycustomercustomerpaymentmodeCustomerpaymentmode, DataKeyLocationnameLocation dataKeyLocationnameLocation, DataKeyCompanycustomerspecification1nameSpecification1 dataKeyCompanycustomerspecification1nameSpecification1, DataKeyCompanycustomerspecification3nameSpecification3 dataKeyCompanycustomerspecification3nameSpecification3, DataKeyCompanyoforiginCompanyinformation dataKeyCompanyoforiginCompanyinformation, DataKeyEntitynameEntity dataKeyEntitynameEntity, DataKeySalespersonnumberEmployee dataKeySalespersonnumberEmployee, DataKeyPurposenamePurpose dataKeyPurposenamePurpose, DataKeyOurcontactEmployee dataKeyOurcontactEmployee, DataKeyCompanycustomerentitynameEntity dataKeyCompanycustomerentitynameEntity, DataKeyCountryCountry dataKeyCountryCountry, DataKeySpecification2nameSpecification2 dataKeySpecification2nameSpecification2, DataKeyDocumentarchivenumberDocumentarchiveheader dataKeyDocumentarchivenumberDocumentarchiveheader, DataKeyDimensioncombnumberDimensioncombheader dataKeyDimensioncombnumberDimensioncombheader, DataKeyAccountstatementcustomerCustomer dataKeyAccountstatementcustomerCustomer, DataKeyPostaldistrict1 dataKeyPostaldistrict1, DataKeyCompanycustomerpurposenamePurpose dataKeyCompanycustomerpurposenamePurpose, DataKeyCustomerentrycompanynumberCompanyinformation dataKeyCustomerentrycompanynumberCompanyinformation, DataKeyRemindertextgroupnameRemindertextgroupheader dataKeyRemindertextgroupnameRemindertextgroupheader, DataKeyCreditgeneraljournalCustomerpayment dataKeyCreditgeneraljournalCustomerpayment, DataKeyCompanycustomerprojectnameProject dataKeyCompanycustomerprojectnameProject, DataKeyCompanycustomercompanynumberCompanyinformation dataKeyCompanycustomercompanynumberCompanyinformation, DataKeyAccountstatement dataKeyAccountstatement, DataKeyPaymentagentPaymentagentinformation dataKeyPaymentagentPaymentagentinformation, DataKeySpecification3nameSpecification3 dataKeySpecification3nameSpecification3, DataKeyCompanycustomer dataKeyCompanycustomer, DataKeyCompanycustomerlocationnameLocation dataKeyCompanycustomerlocationnameLocation, DataKeyHolidaycalendarnameHolidaycalendarheader dataKeyHolidaycalendarnameHolidaycalendarheader, DataKeyCustomernumberCustomer dataKeyCustomernumberCustomer, DataKeyActivitynumberActivity dataKeyActivitynumberActivity, DataKeyJobnumberJobheader dataKeyJobnumberJobheader, DataKeyPaymentcustomerCustomer dataKeyPaymentcustomerCustomer, DataKeyInterestreminderprincipleInterestreminderprinciple dataKeyInterestreminderprincipleInterestreminderprinciple, DataKeyCompanycustomerspecification2nameSpecification2 dataKeyCompanycustomerspecification2nameSpecification2, DataKeyCustomerentrycustomerpaymentmodeCustomerpaymentmode dataKeyCustomerentrycustomerpaymentmodeCustomerpaymentmode, DataKeyAccesslevelnameAccesslevelheader dataKeyAccesslevelnameAccesslevelheader, DataKeyParentcustomerCustomer dataKeyParentcustomerCustomer, DataKeyDepartmentnumberDepartment dataKeyDepartmentnumberDepartment) {
        super();
        this.dataSameKey = dataSameKey;
        this.dataKeyProjectnameProject = dataKeyProjectnameProject;
        this.dataKeyJournalnumberJournal = dataKeyJournalnumberJournal;
        this.dataKeySpecification1nameSpecification1 = dataKeySpecification1nameSpecification1;
        this.dataKeyCompanycustomercustomerpaymentmodeCustomerpaymentmode = dataKeyCompanycustomercustomerpaymentmodeCustomerpaymentmode;
        this.dataKeyLocationnameLocation = dataKeyLocationnameLocation;
        this.dataKeyCompanycustomerspecification1nameSpecification1 = dataKeyCompanycustomerspecification1nameSpecification1;
        this.dataKeyCompanycustomerspecification3nameSpecification3 = dataKeyCompanycustomerspecification3nameSpecification3;
        this.dataKeyCompanyoforiginCompanyinformation = dataKeyCompanyoforiginCompanyinformation;
        this.dataKeyEntitynameEntity = dataKeyEntitynameEntity;
        this.dataKeySalespersonnumberEmployee = dataKeySalespersonnumberEmployee;
        this.dataKeyPurposenamePurpose = dataKeyPurposenamePurpose;
        this.dataKeyOurcontactEmployee = dataKeyOurcontactEmployee;
        this.dataKeyCompanycustomerentitynameEntity = dataKeyCompanycustomerentitynameEntity;
        this.dataKeyCountryCountry = dataKeyCountryCountry;
        this.dataKeySpecification2nameSpecification2 = dataKeySpecification2nameSpecification2;
        this.dataKeyDocumentarchivenumberDocumentarchiveheader = dataKeyDocumentarchivenumberDocumentarchiveheader;
        this.dataKeyDimensioncombnumberDimensioncombheader = dataKeyDimensioncombnumberDimensioncombheader;
        this.dataKeyAccountstatementcustomerCustomer = dataKeyAccountstatementcustomerCustomer;
        this.dataKeyPostaldistrict1 = dataKeyPostaldistrict1;
        this.dataKeyCompanycustomerpurposenamePurpose = dataKeyCompanycustomerpurposenamePurpose;
        this.dataKeyCustomerentrycompanynumberCompanyinformation = dataKeyCustomerentrycompanynumberCompanyinformation;
        this.dataKeyRemindertextgroupnameRemindertextgroupheader = dataKeyRemindertextgroupnameRemindertextgroupheader;
        this.dataKeyCreditgeneraljournalCustomerpayment = dataKeyCreditgeneraljournalCustomerpayment;
        this.dataKeyCompanycustomerprojectnameProject = dataKeyCompanycustomerprojectnameProject;
        this.dataKeyCompanycustomercompanynumberCompanyinformation = dataKeyCompanycustomercompanynumberCompanyinformation;
        this.dataKeyAccountstatement = dataKeyAccountstatement;
        this.dataKeyPaymentagentPaymentagentinformation = dataKeyPaymentagentPaymentagentinformation;
        this.dataKeySpecification3nameSpecification3 = dataKeySpecification3nameSpecification3;
        this.dataKeyCompanycustomer = dataKeyCompanycustomer;
        this.dataKeyCompanycustomerlocationnameLocation = dataKeyCompanycustomerlocationnameLocation;
        this.dataKeyHolidaycalendarnameHolidaycalendarheader = dataKeyHolidaycalendarnameHolidaycalendarheader;
        this.dataKeyCustomernumberCustomer = dataKeyCustomernumberCustomer;
        this.dataKeyActivitynumberActivity = dataKeyActivitynumberActivity;
        this.dataKeyJobnumberJobheader = dataKeyJobnumberJobheader;
        this.dataKeyPaymentcustomerCustomer = dataKeyPaymentcustomerCustomer;
        this.dataKeyInterestreminderprincipleInterestreminderprinciple = dataKeyInterestreminderprincipleInterestreminderprinciple;
        this.dataKeyCompanycustomerspecification2nameSpecification2 = dataKeyCompanycustomerspecification2nameSpecification2;
        this.dataKeyCustomerentrycustomerpaymentmodeCustomerpaymentmode = dataKeyCustomerentrycustomerpaymentmodeCustomerpaymentmode;
        this.dataKeyAccesslevelnameAccesslevelheader = dataKeyAccesslevelnameAccesslevelheader;
        this.dataKeyParentcustomerCustomer = dataKeyParentcustomerCustomer;
        this.dataKeyDepartmentnumberDepartment = dataKeyDepartmentnumberDepartment;
    }

    @JsonProperty("data:same-key")
    public DataSameKey getDataSameKey() {
        return dataSameKey;
    }

    @JsonProperty("data:same-key")
    public void setDataSameKey(DataSameKey dataSameKey) {
        this.dataSameKey = dataSameKey;
    }

    @JsonProperty("data:key:projectname_project")
    public DataKeyProjectnameProject getDataKeyProjectnameProject() {
        return dataKeyProjectnameProject;
    }

    @JsonProperty("data:key:projectname_project")
    public void setDataKeyProjectnameProject(DataKeyProjectnameProject dataKeyProjectnameProject) {
        this.dataKeyProjectnameProject = dataKeyProjectnameProject;
    }

    @JsonProperty("data:key:journalnumber_journal")
    public DataKeyJournalnumberJournal getDataKeyJournalnumberJournal() {
        return dataKeyJournalnumberJournal;
    }

    @JsonProperty("data:key:journalnumber_journal")
    public void setDataKeyJournalnumberJournal(DataKeyJournalnumberJournal dataKeyJournalnumberJournal) {
        this.dataKeyJournalnumberJournal = dataKeyJournalnumberJournal;
    }

    @JsonProperty("data:key:specification1name_specification1")
    public DataKeySpecification1nameSpecification1 getDataKeySpecification1nameSpecification1() {
        return dataKeySpecification1nameSpecification1;
    }

    @JsonProperty("data:key:specification1name_specification1")
    public void setDataKeySpecification1nameSpecification1(DataKeySpecification1nameSpecification1 dataKeySpecification1nameSpecification1) {
        this.dataKeySpecification1nameSpecification1 = dataKeySpecification1nameSpecification1;
    }

    @JsonProperty("data:key:companycustomercustomerpaymentmode_customerpaymentmode")
    public DataKeyCompanycustomercustomerpaymentmodeCustomerpaymentmode getDataKeyCompanycustomercustomerpaymentmodeCustomerpaymentmode() {
        return dataKeyCompanycustomercustomerpaymentmodeCustomerpaymentmode;
    }

    @JsonProperty("data:key:companycustomercustomerpaymentmode_customerpaymentmode")
    public void setDataKeyCompanycustomercustomerpaymentmodeCustomerpaymentmode(DataKeyCompanycustomercustomerpaymentmodeCustomerpaymentmode dataKeyCompanycustomercustomerpaymentmodeCustomerpaymentmode) {
        this.dataKeyCompanycustomercustomerpaymentmodeCustomerpaymentmode = dataKeyCompanycustomercustomerpaymentmodeCustomerpaymentmode;
    }

    @JsonProperty("data:key:locationname_location")
    public DataKeyLocationnameLocation getDataKeyLocationnameLocation() {
        return dataKeyLocationnameLocation;
    }

    @JsonProperty("data:key:locationname_location")
    public void setDataKeyLocationnameLocation(DataKeyLocationnameLocation dataKeyLocationnameLocation) {
        this.dataKeyLocationnameLocation = dataKeyLocationnameLocation;
    }

    @JsonProperty("data:key:companycustomerspecification1name_specification1")
    public DataKeyCompanycustomerspecification1nameSpecification1 getDataKeyCompanycustomerspecification1nameSpecification1() {
        return dataKeyCompanycustomerspecification1nameSpecification1;
    }

    @JsonProperty("data:key:companycustomerspecification1name_specification1")
    public void setDataKeyCompanycustomerspecification1nameSpecification1(DataKeyCompanycustomerspecification1nameSpecification1 dataKeyCompanycustomerspecification1nameSpecification1) {
        this.dataKeyCompanycustomerspecification1nameSpecification1 = dataKeyCompanycustomerspecification1nameSpecification1;
    }

    @JsonProperty("data:key:companycustomerspecification3name_specification3")
    public DataKeyCompanycustomerspecification3nameSpecification3 getDataKeyCompanycustomerspecification3nameSpecification3() {
        return dataKeyCompanycustomerspecification3nameSpecification3;
    }

    @JsonProperty("data:key:companycustomerspecification3name_specification3")
    public void setDataKeyCompanycustomerspecification3nameSpecification3(DataKeyCompanycustomerspecification3nameSpecification3 dataKeyCompanycustomerspecification3nameSpecification3) {
        this.dataKeyCompanycustomerspecification3nameSpecification3 = dataKeyCompanycustomerspecification3nameSpecification3;
    }

    @JsonProperty("data:key:companyoforigin_companyinformation")
    public DataKeyCompanyoforiginCompanyinformation getDataKeyCompanyoforiginCompanyinformation() {
        return dataKeyCompanyoforiginCompanyinformation;
    }

    @JsonProperty("data:key:companyoforigin_companyinformation")
    public void setDataKeyCompanyoforiginCompanyinformation(DataKeyCompanyoforiginCompanyinformation dataKeyCompanyoforiginCompanyinformation) {
        this.dataKeyCompanyoforiginCompanyinformation = dataKeyCompanyoforiginCompanyinformation;
    }

    @JsonProperty("data:key:entityname_entity")
    public DataKeyEntitynameEntity getDataKeyEntitynameEntity() {
        return dataKeyEntitynameEntity;
    }

    @JsonProperty("data:key:entityname_entity")
    public void setDataKeyEntitynameEntity(DataKeyEntitynameEntity dataKeyEntitynameEntity) {
        this.dataKeyEntitynameEntity = dataKeyEntitynameEntity;
    }

    @JsonProperty("data:key:salespersonnumber_employee")
    public DataKeySalespersonnumberEmployee getDataKeySalespersonnumberEmployee() {
        return dataKeySalespersonnumberEmployee;
    }

    @JsonProperty("data:key:salespersonnumber_employee")
    public void setDataKeySalespersonnumberEmployee(DataKeySalespersonnumberEmployee dataKeySalespersonnumberEmployee) {
        this.dataKeySalespersonnumberEmployee = dataKeySalespersonnumberEmployee;
    }

    @JsonProperty("data:key:purposename_purpose")
    public DataKeyPurposenamePurpose getDataKeyPurposenamePurpose() {
        return dataKeyPurposenamePurpose;
    }

    @JsonProperty("data:key:purposename_purpose")
    public void setDataKeyPurposenamePurpose(DataKeyPurposenamePurpose dataKeyPurposenamePurpose) {
        this.dataKeyPurposenamePurpose = dataKeyPurposenamePurpose;
    }

    @JsonProperty("data:key:ourcontact_employee")
    public DataKeyOurcontactEmployee getDataKeyOurcontactEmployee() {
        return dataKeyOurcontactEmployee;
    }

    @JsonProperty("data:key:ourcontact_employee")
    public void setDataKeyOurcontactEmployee(DataKeyOurcontactEmployee dataKeyOurcontactEmployee) {
        this.dataKeyOurcontactEmployee = dataKeyOurcontactEmployee;
    }

    @JsonProperty("data:key:companycustomerentityname_entity")
    public DataKeyCompanycustomerentitynameEntity getDataKeyCompanycustomerentitynameEntity() {
        return dataKeyCompanycustomerentitynameEntity;
    }

    @JsonProperty("data:key:companycustomerentityname_entity")
    public void setDataKeyCompanycustomerentitynameEntity(DataKeyCompanycustomerentitynameEntity dataKeyCompanycustomerentitynameEntity) {
        this.dataKeyCompanycustomerentitynameEntity = dataKeyCompanycustomerentitynameEntity;
    }

    @JsonProperty("data:key:country_country")
    public DataKeyCountryCountry getDataKeyCountryCountry() {
        return dataKeyCountryCountry;
    }

    @JsonProperty("data:key:country_country")
    public void setDataKeyCountryCountry(DataKeyCountryCountry dataKeyCountryCountry) {
        this.dataKeyCountryCountry = dataKeyCountryCountry;
    }

    @JsonProperty("data:key:specification2name_specification2")
    public DataKeySpecification2nameSpecification2 getDataKeySpecification2nameSpecification2() {
        return dataKeySpecification2nameSpecification2;
    }

    @JsonProperty("data:key:specification2name_specification2")
    public void setDataKeySpecification2nameSpecification2(DataKeySpecification2nameSpecification2 dataKeySpecification2nameSpecification2) {
        this.dataKeySpecification2nameSpecification2 = dataKeySpecification2nameSpecification2;
    }

    @JsonProperty("data:key:documentarchivenumber_documentarchiveheader")
    public DataKeyDocumentarchivenumberDocumentarchiveheader getDataKeyDocumentarchivenumberDocumentarchiveheader() {
        return dataKeyDocumentarchivenumberDocumentarchiveheader;
    }

    @JsonProperty("data:key:documentarchivenumber_documentarchiveheader")
    public void setDataKeyDocumentarchivenumberDocumentarchiveheader(DataKeyDocumentarchivenumberDocumentarchiveheader dataKeyDocumentarchivenumberDocumentarchiveheader) {
        this.dataKeyDocumentarchivenumberDocumentarchiveheader = dataKeyDocumentarchivenumberDocumentarchiveheader;
    }

    @JsonProperty("data:key:dimensioncombnumber_dimensioncombheader")
    public DataKeyDimensioncombnumberDimensioncombheader getDataKeyDimensioncombnumberDimensioncombheader() {
        return dataKeyDimensioncombnumberDimensioncombheader;
    }

    @JsonProperty("data:key:dimensioncombnumber_dimensioncombheader")
    public void setDataKeyDimensioncombnumberDimensioncombheader(DataKeyDimensioncombnumberDimensioncombheader dataKeyDimensioncombnumberDimensioncombheader) {
        this.dataKeyDimensioncombnumberDimensioncombheader = dataKeyDimensioncombnumberDimensioncombheader;
    }

    @JsonProperty("data:key:accountstatementcustomer_customer")
    public DataKeyAccountstatementcustomerCustomer getDataKeyAccountstatementcustomerCustomer() {
        return dataKeyAccountstatementcustomerCustomer;
    }

    @JsonProperty("data:key:accountstatementcustomer_customer")
    public void setDataKeyAccountstatementcustomerCustomer(DataKeyAccountstatementcustomerCustomer dataKeyAccountstatementcustomerCustomer) {
        this.dataKeyAccountstatementcustomerCustomer = dataKeyAccountstatementcustomerCustomer;
    }

    @JsonProperty("data:key:postaldistrict_1")
    public DataKeyPostaldistrict1 getDataKeyPostaldistrict1() {
        return dataKeyPostaldistrict1;
    }

    @JsonProperty("data:key:postaldistrict_1")
    public void setDataKeyPostaldistrict1(DataKeyPostaldistrict1 dataKeyPostaldistrict1) {
        this.dataKeyPostaldistrict1 = dataKeyPostaldistrict1;
    }

    @JsonProperty("data:key:companycustomerpurposename_purpose")
    public DataKeyCompanycustomerpurposenamePurpose getDataKeyCompanycustomerpurposenamePurpose() {
        return dataKeyCompanycustomerpurposenamePurpose;
    }

    @JsonProperty("data:key:companycustomerpurposename_purpose")
    public void setDataKeyCompanycustomerpurposenamePurpose(DataKeyCompanycustomerpurposenamePurpose dataKeyCompanycustomerpurposenamePurpose) {
        this.dataKeyCompanycustomerpurposenamePurpose = dataKeyCompanycustomerpurposenamePurpose;
    }

    @JsonProperty("data:key:customerentrycompanynumber_companyinformation")
    public DataKeyCustomerentrycompanynumberCompanyinformation getDataKeyCustomerentrycompanynumberCompanyinformation() {
        return dataKeyCustomerentrycompanynumberCompanyinformation;
    }

    @JsonProperty("data:key:customerentrycompanynumber_companyinformation")
    public void setDataKeyCustomerentrycompanynumberCompanyinformation(DataKeyCustomerentrycompanynumberCompanyinformation dataKeyCustomerentrycompanynumberCompanyinformation) {
        this.dataKeyCustomerentrycompanynumberCompanyinformation = dataKeyCustomerentrycompanynumberCompanyinformation;
    }

    @JsonProperty("data:key:remindertextgroupname_remindertextgroupheader")
    public DataKeyRemindertextgroupnameRemindertextgroupheader getDataKeyRemindertextgroupnameRemindertextgroupheader() {
        return dataKeyRemindertextgroupnameRemindertextgroupheader;
    }

    @JsonProperty("data:key:remindertextgroupname_remindertextgroupheader")
    public void setDataKeyRemindertextgroupnameRemindertextgroupheader(DataKeyRemindertextgroupnameRemindertextgroupheader dataKeyRemindertextgroupnameRemindertextgroupheader) {
        this.dataKeyRemindertextgroupnameRemindertextgroupheader = dataKeyRemindertextgroupnameRemindertextgroupheader;
    }

    @JsonProperty("data:key:creditgeneraljournal_customerpayment")
    public DataKeyCreditgeneraljournalCustomerpayment getDataKeyCreditgeneraljournalCustomerpayment() {
        return dataKeyCreditgeneraljournalCustomerpayment;
    }

    @JsonProperty("data:key:creditgeneraljournal_customerpayment")
    public void setDataKeyCreditgeneraljournalCustomerpayment(DataKeyCreditgeneraljournalCustomerpayment dataKeyCreditgeneraljournalCustomerpayment) {
        this.dataKeyCreditgeneraljournalCustomerpayment = dataKeyCreditgeneraljournalCustomerpayment;
    }

    @JsonProperty("data:key:companycustomerprojectname_project")
    public DataKeyCompanycustomerprojectnameProject getDataKeyCompanycustomerprojectnameProject() {
        return dataKeyCompanycustomerprojectnameProject;
    }

    @JsonProperty("data:key:companycustomerprojectname_project")
    public void setDataKeyCompanycustomerprojectnameProject(DataKeyCompanycustomerprojectnameProject dataKeyCompanycustomerprojectnameProject) {
        this.dataKeyCompanycustomerprojectnameProject = dataKeyCompanycustomerprojectnameProject;
    }

    @JsonProperty("data:key:companycustomercompanynumber_companyinformation")
    public DataKeyCompanycustomercompanynumberCompanyinformation getDataKeyCompanycustomercompanynumberCompanyinformation() {
        return dataKeyCompanycustomercompanynumberCompanyinformation;
    }

    @JsonProperty("data:key:companycustomercompanynumber_companyinformation")
    public void setDataKeyCompanycustomercompanynumberCompanyinformation(DataKeyCompanycustomercompanynumberCompanyinformation dataKeyCompanycustomercompanynumberCompanyinformation) {
        this.dataKeyCompanycustomercompanynumberCompanyinformation = dataKeyCompanycustomercompanynumberCompanyinformation;
    }

    @JsonProperty("data:key:accountstatement")
    public DataKeyAccountstatement getDataKeyAccountstatement() {
        return dataKeyAccountstatement;
    }

    @JsonProperty("data:key:accountstatement")
    public void setDataKeyAccountstatement(DataKeyAccountstatement dataKeyAccountstatement) {
        this.dataKeyAccountstatement = dataKeyAccountstatement;
    }

    @JsonProperty("data:key:paymentagent_paymentagentinformation")
    public DataKeyPaymentagentPaymentagentinformation getDataKeyPaymentagentPaymentagentinformation() {
        return dataKeyPaymentagentPaymentagentinformation;
    }

    @JsonProperty("data:key:paymentagent_paymentagentinformation")
    public void setDataKeyPaymentagentPaymentagentinformation(DataKeyPaymentagentPaymentagentinformation dataKeyPaymentagentPaymentagentinformation) {
        this.dataKeyPaymentagentPaymentagentinformation = dataKeyPaymentagentPaymentagentinformation;
    }

    @JsonProperty("data:key:specification3name_specification3")
    public DataKeySpecification3nameSpecification3 getDataKeySpecification3nameSpecification3() {
        return dataKeySpecification3nameSpecification3;
    }

    @JsonProperty("data:key:specification3name_specification3")
    public void setDataKeySpecification3nameSpecification3(DataKeySpecification3nameSpecification3 dataKeySpecification3nameSpecification3) {
        this.dataKeySpecification3nameSpecification3 = dataKeySpecification3nameSpecification3;
    }

    @JsonProperty("data:key:companycustomer")
    public DataKeyCompanycustomer getDataKeyCompanycustomer() {
        return dataKeyCompanycustomer;
    }

    @JsonProperty("data:key:companycustomer")
    public void setDataKeyCompanycustomer(DataKeyCompanycustomer dataKeyCompanycustomer) {
        this.dataKeyCompanycustomer = dataKeyCompanycustomer;
    }

    @JsonProperty("data:key:companycustomerlocationname_location")
    public DataKeyCompanycustomerlocationnameLocation getDataKeyCompanycustomerlocationnameLocation() {
        return dataKeyCompanycustomerlocationnameLocation;
    }

    @JsonProperty("data:key:companycustomerlocationname_location")
    public void setDataKeyCompanycustomerlocationnameLocation(DataKeyCompanycustomerlocationnameLocation dataKeyCompanycustomerlocationnameLocation) {
        this.dataKeyCompanycustomerlocationnameLocation = dataKeyCompanycustomerlocationnameLocation;
    }

    @JsonProperty("data:key:holidaycalendarname_holidaycalendarheader")
    public DataKeyHolidaycalendarnameHolidaycalendarheader getDataKeyHolidaycalendarnameHolidaycalendarheader() {
        return dataKeyHolidaycalendarnameHolidaycalendarheader;
    }

    @JsonProperty("data:key:holidaycalendarname_holidaycalendarheader")
    public void setDataKeyHolidaycalendarnameHolidaycalendarheader(DataKeyHolidaycalendarnameHolidaycalendarheader dataKeyHolidaycalendarnameHolidaycalendarheader) {
        this.dataKeyHolidaycalendarnameHolidaycalendarheader = dataKeyHolidaycalendarnameHolidaycalendarheader;
    }

    @JsonProperty("data:key:customernumber_customer")
    public DataKeyCustomernumberCustomer getDataKeyCustomernumberCustomer() {
        return dataKeyCustomernumberCustomer;
    }

    @JsonProperty("data:key:customernumber_customer")
    public void setDataKeyCustomernumberCustomer(DataKeyCustomernumberCustomer dataKeyCustomernumberCustomer) {
        this.dataKeyCustomernumberCustomer = dataKeyCustomernumberCustomer;
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

    @JsonProperty("data:key:paymentcustomer_customer")
    public DataKeyPaymentcustomerCustomer getDataKeyPaymentcustomerCustomer() {
        return dataKeyPaymentcustomerCustomer;
    }

    @JsonProperty("data:key:paymentcustomer_customer")
    public void setDataKeyPaymentcustomerCustomer(DataKeyPaymentcustomerCustomer dataKeyPaymentcustomerCustomer) {
        this.dataKeyPaymentcustomerCustomer = dataKeyPaymentcustomerCustomer;
    }

    @JsonProperty("data:key:interestreminderprinciple_interestreminderprinciple")
    public DataKeyInterestreminderprincipleInterestreminderprinciple getDataKeyInterestreminderprincipleInterestreminderprinciple() {
        return dataKeyInterestreminderprincipleInterestreminderprinciple;
    }

    @JsonProperty("data:key:interestreminderprinciple_interestreminderprinciple")
    public void setDataKeyInterestreminderprincipleInterestreminderprinciple(DataKeyInterestreminderprincipleInterestreminderprinciple dataKeyInterestreminderprincipleInterestreminderprinciple) {
        this.dataKeyInterestreminderprincipleInterestreminderprinciple = dataKeyInterestreminderprincipleInterestreminderprinciple;
    }

    @JsonProperty("data:key:companycustomerspecification2name_specification2")
    public DataKeyCompanycustomerspecification2nameSpecification2 getDataKeyCompanycustomerspecification2nameSpecification2() {
        return dataKeyCompanycustomerspecification2nameSpecification2;
    }

    @JsonProperty("data:key:companycustomerspecification2name_specification2")
    public void setDataKeyCompanycustomerspecification2nameSpecification2(DataKeyCompanycustomerspecification2nameSpecification2 dataKeyCompanycustomerspecification2nameSpecification2) {
        this.dataKeyCompanycustomerspecification2nameSpecification2 = dataKeyCompanycustomerspecification2nameSpecification2;
    }

    @JsonProperty("data:key:customerentrycustomerpaymentmode_customerpaymentmode")
    public DataKeyCustomerentrycustomerpaymentmodeCustomerpaymentmode getDataKeyCustomerentrycustomerpaymentmodeCustomerpaymentmode() {
        return dataKeyCustomerentrycustomerpaymentmodeCustomerpaymentmode;
    }

    @JsonProperty("data:key:customerentrycustomerpaymentmode_customerpaymentmode")
    public void setDataKeyCustomerentrycustomerpaymentmodeCustomerpaymentmode(DataKeyCustomerentrycustomerpaymentmodeCustomerpaymentmode dataKeyCustomerentrycustomerpaymentmodeCustomerpaymentmode) {
        this.dataKeyCustomerentrycustomerpaymentmodeCustomerpaymentmode = dataKeyCustomerentrycustomerpaymentmodeCustomerpaymentmode;
    }

    @JsonProperty("data:key:accesslevelname_accesslevelheader")
    public DataKeyAccesslevelnameAccesslevelheader getDataKeyAccesslevelnameAccesslevelheader() {
        return dataKeyAccesslevelnameAccesslevelheader;
    }

    @JsonProperty("data:key:accesslevelname_accesslevelheader")
    public void setDataKeyAccesslevelnameAccesslevelheader(DataKeyAccesslevelnameAccesslevelheader dataKeyAccesslevelnameAccesslevelheader) {
        this.dataKeyAccesslevelnameAccesslevelheader = dataKeyAccesslevelnameAccesslevelheader;
    }

    @JsonProperty("data:key:parentcustomer_customer")
    public DataKeyParentcustomerCustomer getDataKeyParentcustomerCustomer() {
        return dataKeyParentcustomerCustomer;
    }

    @JsonProperty("data:key:parentcustomer_customer")
    public void setDataKeyParentcustomerCustomer(DataKeyParentcustomerCustomer dataKeyParentcustomerCustomer) {
        this.dataKeyParentcustomerCustomer = dataKeyParentcustomerCustomer;
    }

    @JsonProperty("data:key:departmentnumber_department")
    public DataKeyDepartmentnumberDepartment getDataKeyDepartmentnumberDepartment() {
        return dataKeyDepartmentnumberDepartment;
    }

    @JsonProperty("data:key:departmentnumber_department")
    public void setDataKeyDepartmentnumberDepartment(DataKeyDepartmentnumberDepartment dataKeyDepartmentnumberDepartment) {
        this.dataKeyDepartmentnumberDepartment = dataKeyDepartmentnumberDepartment;
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
        return new ToStringBuilder(this).append("dataSameKey", dataSameKey).append("dataKeyProjectnameProject", dataKeyProjectnameProject).append("dataKeyJournalnumberJournal", dataKeyJournalnumberJournal).append("dataKeySpecification1nameSpecification1", dataKeySpecification1nameSpecification1).append("dataKeyCompanycustomercustomerpaymentmodeCustomerpaymentmode", dataKeyCompanycustomercustomerpaymentmodeCustomerpaymentmode).append("dataKeyLocationnameLocation", dataKeyLocationnameLocation).append("dataKeyCompanycustomerspecification1nameSpecification1", dataKeyCompanycustomerspecification1nameSpecification1).append("dataKeyCompanycustomerspecification3nameSpecification3", dataKeyCompanycustomerspecification3nameSpecification3).append("dataKeyCompanyoforiginCompanyinformation", dataKeyCompanyoforiginCompanyinformation).append("dataKeyEntitynameEntity", dataKeyEntitynameEntity).append("dataKeySalespersonnumberEmployee", dataKeySalespersonnumberEmployee).append("dataKeyPurposenamePurpose", dataKeyPurposenamePurpose).append("dataKeyOurcontactEmployee", dataKeyOurcontactEmployee).append("dataKeyCompanycustomerentitynameEntity", dataKeyCompanycustomerentitynameEntity).append("dataKeyCountryCountry", dataKeyCountryCountry).append("dataKeySpecification2nameSpecification2", dataKeySpecification2nameSpecification2).append("dataKeyDocumentarchivenumberDocumentarchiveheader", dataKeyDocumentarchivenumberDocumentarchiveheader).append("dataKeyDimensioncombnumberDimensioncombheader", dataKeyDimensioncombnumberDimensioncombheader).append("dataKeyAccountstatementcustomerCustomer", dataKeyAccountstatementcustomerCustomer).append("dataKeyPostaldistrict1", dataKeyPostaldistrict1).append("dataKeyCompanycustomerpurposenamePurpose", dataKeyCompanycustomerpurposenamePurpose).append("dataKeyCustomerentrycompanynumberCompanyinformation", dataKeyCustomerentrycompanynumberCompanyinformation).append("dataKeyRemindertextgroupnameRemindertextgroupheader", dataKeyRemindertextgroupnameRemindertextgroupheader).append("dataKeyCreditgeneraljournalCustomerpayment", dataKeyCreditgeneraljournalCustomerpayment).append("dataKeyCompanycustomerprojectnameProject", dataKeyCompanycustomerprojectnameProject).append("dataKeyCompanycustomercompanynumberCompanyinformation", dataKeyCompanycustomercompanynumberCompanyinformation).append("dataKeyAccountstatement", dataKeyAccountstatement).append("dataKeyPaymentagentPaymentagentinformation", dataKeyPaymentagentPaymentagentinformation).append("dataKeySpecification3nameSpecification3", dataKeySpecification3nameSpecification3).append("dataKeyCompanycustomer", dataKeyCompanycustomer).append("dataKeyCompanycustomerlocationnameLocation", dataKeyCompanycustomerlocationnameLocation).append("dataKeyHolidaycalendarnameHolidaycalendarheader", dataKeyHolidaycalendarnameHolidaycalendarheader).append("dataKeyCustomernumberCustomer", dataKeyCustomernumberCustomer).append("dataKeyActivitynumberActivity", dataKeyActivitynumberActivity).append("dataKeyJobnumberJobheader", dataKeyJobnumberJobheader).append("dataKeyPaymentcustomerCustomer", dataKeyPaymentcustomerCustomer).append("dataKeyInterestreminderprincipleInterestreminderprinciple", dataKeyInterestreminderprincipleInterestreminderprinciple).append("dataKeyCompanycustomerspecification2nameSpecification2", dataKeyCompanycustomerspecification2nameSpecification2).append("dataKeyCustomerentrycustomerpaymentmodeCustomerpaymentmode", dataKeyCustomerentrycustomerpaymentmodeCustomerpaymentmode).append("dataKeyAccesslevelnameAccesslevelheader", dataKeyAccesslevelnameAccesslevelheader).append("dataKeyParentcustomerCustomer", dataKeyParentcustomerCustomer).append("dataKeyDepartmentnumberDepartment", dataKeyDepartmentnumberDepartment).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(dataKeyPostaldistrict1).append(dataKeyHolidaycalendarnameHolidaycalendarheader).append(dataKeySpecification1nameSpecification1).append(dataKeyCompanycustomer).append(dataKeyCompanyoforiginCompanyinformation).append(dataKeyCompanycustomerspecification3nameSpecification3).append(dataKeySalespersonnumberEmployee).append(dataKeyInterestreminderprincipleInterestreminderprinciple).append(dataKeyJournalnumberJournal).append(dataKeyCustomerentrycompanynumberCompanyinformation).append(dataKeyEntitynameEntity).append(dataKeyAccesslevelnameAccesslevelheader).append(dataKeyCompanycustomerspecification2nameSpecification2).append(dataKeyActivitynumberActivity).append(dataSameKey).append(dataKeyLocationnameLocation).append(dataKeyCustomernumberCustomer).append(dataKeyPaymentagentPaymentagentinformation).append(dataKeyAccountstatementcustomerCustomer).append(dataKeyDocumentarchivenumberDocumentarchiveheader).append(dataKeyCompanycustomercompanynumberCompanyinformation).append(dataKeyJobnumberJobheader).append(dataKeyPurposenamePurpose).append(dataKeyAccountstatement).append(dataKeyCompanycustomerentitynameEntity).append(dataKeyCompanycustomerpurposenamePurpose).append(dataKeyPaymentcustomerCustomer).append(dataKeyCompanycustomercustomerpaymentmodeCustomerpaymentmode).append(dataKeyCompanycustomerspecification1nameSpecification1).append(dataKeyCustomerentrycustomerpaymentmodeCustomerpaymentmode).append(dataKeyCompanycustomerprojectnameProject).append(dataKeyDepartmentnumberDepartment).append(dataKeyCreditgeneraljournalCustomerpayment).append(dataKeyDimensioncombnumberDimensioncombheader).append(dataKeyProjectnameProject).append(dataKeyOurcontactEmployee).append(additionalProperties).append(dataKeyCountryCountry).append(dataKeyRemindertextgroupnameRemindertextgroupheader).append(dataKeySpecification2nameSpecification2).append(dataKeyParentcustomerCustomer).append(dataKeySpecification3nameSpecification3).append(dataKeyCompanycustomerlocationnameLocation).toHashCode();
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
        return new EqualsBuilder().append(dataKeyPostaldistrict1, rhs.dataKeyPostaldistrict1).append(dataKeyHolidaycalendarnameHolidaycalendarheader, rhs.dataKeyHolidaycalendarnameHolidaycalendarheader).append(dataKeySpecification1nameSpecification1, rhs.dataKeySpecification1nameSpecification1).append(dataKeyCompanycustomer, rhs.dataKeyCompanycustomer).append(dataKeyCompanyoforiginCompanyinformation, rhs.dataKeyCompanyoforiginCompanyinformation).append(dataKeyCompanycustomerspecification3nameSpecification3, rhs.dataKeyCompanycustomerspecification3nameSpecification3).append(dataKeySalespersonnumberEmployee, rhs.dataKeySalespersonnumberEmployee).append(dataKeyInterestreminderprincipleInterestreminderprinciple, rhs.dataKeyInterestreminderprincipleInterestreminderprinciple).append(dataKeyJournalnumberJournal, rhs.dataKeyJournalnumberJournal).append(dataKeyCustomerentrycompanynumberCompanyinformation, rhs.dataKeyCustomerentrycompanynumberCompanyinformation).append(dataKeyEntitynameEntity, rhs.dataKeyEntitynameEntity).append(dataKeyAccesslevelnameAccesslevelheader, rhs.dataKeyAccesslevelnameAccesslevelheader).append(dataKeyCompanycustomerspecification2nameSpecification2, rhs.dataKeyCompanycustomerspecification2nameSpecification2).append(dataKeyActivitynumberActivity, rhs.dataKeyActivitynumberActivity).append(dataSameKey, rhs.dataSameKey).append(dataKeyLocationnameLocation, rhs.dataKeyLocationnameLocation).append(dataKeyCustomernumberCustomer, rhs.dataKeyCustomernumberCustomer).append(dataKeyPaymentagentPaymentagentinformation, rhs.dataKeyPaymentagentPaymentagentinformation).append(dataKeyAccountstatementcustomerCustomer, rhs.dataKeyAccountstatementcustomerCustomer).append(dataKeyDocumentarchivenumberDocumentarchiveheader, rhs.dataKeyDocumentarchivenumberDocumentarchiveheader).append(dataKeyCompanycustomercompanynumberCompanyinformation, rhs.dataKeyCompanycustomercompanynumberCompanyinformation).append(dataKeyJobnumberJobheader, rhs.dataKeyJobnumberJobheader).append(dataKeyPurposenamePurpose, rhs.dataKeyPurposenamePurpose).append(dataKeyAccountstatement, rhs.dataKeyAccountstatement).append(dataKeyCompanycustomerentitynameEntity, rhs.dataKeyCompanycustomerentitynameEntity).append(dataKeyCompanycustomerpurposenamePurpose, rhs.dataKeyCompanycustomerpurposenamePurpose).append(dataKeyPaymentcustomerCustomer, rhs.dataKeyPaymentcustomerCustomer).append(dataKeyCompanycustomercustomerpaymentmodeCustomerpaymentmode, rhs.dataKeyCompanycustomercustomerpaymentmodeCustomerpaymentmode).append(dataKeyCompanycustomerspecification1nameSpecification1, rhs.dataKeyCompanycustomerspecification1nameSpecification1).append(dataKeyCustomerentrycustomerpaymentmodeCustomerpaymentmode, rhs.dataKeyCustomerentrycustomerpaymentmodeCustomerpaymentmode).append(dataKeyCompanycustomerprojectnameProject, rhs.dataKeyCompanycustomerprojectnameProject).append(dataKeyDepartmentnumberDepartment, rhs.dataKeyDepartmentnumberDepartment).append(dataKeyCreditgeneraljournalCustomerpayment, rhs.dataKeyCreditgeneraljournalCustomerpayment).append(dataKeyDimensioncombnumberDimensioncombheader, rhs.dataKeyDimensioncombnumberDimensioncombheader).append(dataKeyProjectnameProject, rhs.dataKeyProjectnameProject).append(dataKeyOurcontactEmployee, rhs.dataKeyOurcontactEmployee).append(additionalProperties, rhs.additionalProperties).append(dataKeyCountryCountry, rhs.dataKeyCountryCountry).append(dataKeyRemindertextgroupnameRemindertextgroupheader, rhs.dataKeyRemindertextgroupnameRemindertextgroupheader).append(dataKeySpecification2nameSpecification2, rhs.dataKeySpecification2nameSpecification2).append(dataKeyParentcustomerCustomer, rhs.dataKeyParentcustomerCustomer).append(dataKeySpecification3nameSpecification3, rhs.dataKeySpecification3nameSpecification3).append(dataKeyCompanycustomerlocationnameLocation, rhs.dataKeyCompanycustomerlocationnameLocation).isEquals();
    }

}
