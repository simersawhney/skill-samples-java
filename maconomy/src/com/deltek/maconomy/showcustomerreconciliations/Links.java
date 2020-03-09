
package com.deltek.maconomy.showcustomerreconciliations;

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
    "data:same-key",
    "data:key:specification2name_specification2",
    "data:key:locationname_location",
    "data:key:holidaycalendarname_holidaycalendarheader",
    "data:key:companycustomerspecification8name_specification8",
    "data:key:jobnumber_jobheader",
    "data:key:companycustomerspecification6name_specification6",
    "data:key:creditgeneraljournal_customerpayment",
    "data:key:specification8name_specification8",
    "data:key:paymentcustomer_customer",
    "data:key:specification6name_specification6",
    "data:key:dimensioncombnumber_dimensioncombheader",
    "data:key:remindertextgroupname_remindertextgroupheader",
    "data:key:specification4name_specification4",
    "data:key:customerentrycompanynumber_companyinformation",
    "data:key:accountstatementcustomer_customer",
    "data:key:accesslevelname_accesslevelheader",
    "data:key:interestreminderprinciple_interestreminderprinciple",
    "data:key:companyoforigin_companyinformation",
    "data:key:postaldistrict_1",
    "data:key:departmentnumber_department",
    "data:key:specification3name_specification3",
    "data:key:journalnumber_journal",
    "data:key:entityname_entity",
    "data:key:paymentagent_paymentagentinformation",
    "data:key:specification1name_specification1",
    "data:key:customernumber_customer",
    "data:key:companycustomerlocationname_location",
    "data:key:companycustomercompanynumber_companyinformation",
    "data:key:parentcustomer_customer",
    "data:key:companycustomerpurposename_purpose",
    "data:key:ourcontact_employee",
    "data:key:customerentrycustomerpaymentmode_customerpaymentmode",
    "data:key:companycustomerspecification7name_specification7",
    "data:key:purposename_purpose",
    "data:key:companycustomerspecification5name_specification5",
    "data:key:specification9name_specification9",
    "data:key:companycustomerentityname_entity",
    "data:key:specification7name_specification7",
    "data:key:activitynumber_activity",
    "data:key:companycustomerspecification9name_specification9",
    "data:key:projectname_project",
    "data:key:specification5name_specification5",
    "data:key:companycustomerspecification10name_specification10",
    "data:key:documentarchivenumber_documentarchiveheader",
    "data:key:companycustomer",
    "data:key:specification10name_specification10",
    "data:key:companycustomerprojectname_project",
    "data:key:companycustomercustomerpaymentmode_customerpaymentmode",
    "data:key:companycustomerspecification3name_specification3",
    "data:key:companycustomerspecification4name_specification4",
    "data:key:companycustomerspecification1name_specification1",
    "data:key:companycustomerspecification2name_specification2",
    "data:key:country_country",
    "data:key:accountstatement",
    "data:key:salespersonnumber_employee"
})
public class Links {

    @JsonProperty("data:same-key")
    private DataSameKey dataSameKey;
    @JsonProperty("data:key:specification2name_specification2")
    private DataKeySpecification2nameSpecification2 dataKeySpecification2nameSpecification2;
    @JsonProperty("data:key:locationname_location")
    private DataKeyLocationnameLocation dataKeyLocationnameLocation;
    @JsonProperty("data:key:holidaycalendarname_holidaycalendarheader")
    private DataKeyHolidaycalendarnameHolidaycalendarheader dataKeyHolidaycalendarnameHolidaycalendarheader;
    @JsonProperty("data:key:companycustomerspecification8name_specification8")
    private DataKeyCompanycustomerspecification8nameSpecification8 dataKeyCompanycustomerspecification8nameSpecification8;
    @JsonProperty("data:key:jobnumber_jobheader")
    private DataKeyJobnumberJobheader dataKeyJobnumberJobheader;
    @JsonProperty("data:key:companycustomerspecification6name_specification6")
    private DataKeyCompanycustomerspecification6nameSpecification6 dataKeyCompanycustomerspecification6nameSpecification6;
    @JsonProperty("data:key:creditgeneraljournal_customerpayment")
    private DataKeyCreditgeneraljournalCustomerpayment dataKeyCreditgeneraljournalCustomerpayment;
    @JsonProperty("data:key:specification8name_specification8")
    private DataKeySpecification8nameSpecification8 dataKeySpecification8nameSpecification8;
    @JsonProperty("data:key:paymentcustomer_customer")
    private DataKeyPaymentcustomerCustomer dataKeyPaymentcustomerCustomer;
    @JsonProperty("data:key:specification6name_specification6")
    private DataKeySpecification6nameSpecification6 dataKeySpecification6nameSpecification6;
    @JsonProperty("data:key:dimensioncombnumber_dimensioncombheader")
    private DataKeyDimensioncombnumberDimensioncombheader dataKeyDimensioncombnumberDimensioncombheader;
    @JsonProperty("data:key:remindertextgroupname_remindertextgroupheader")
    private DataKeyRemindertextgroupnameRemindertextgroupheader dataKeyRemindertextgroupnameRemindertextgroupheader;
    @JsonProperty("data:key:specification4name_specification4")
    private DataKeySpecification4nameSpecification4 dataKeySpecification4nameSpecification4;
    @JsonProperty("data:key:customerentrycompanynumber_companyinformation")
    private DataKeyCustomerentrycompanynumberCompanyinformation dataKeyCustomerentrycompanynumberCompanyinformation;
    @JsonProperty("data:key:accountstatementcustomer_customer")
    private DataKeyAccountstatementcustomerCustomer dataKeyAccountstatementcustomerCustomer;
    @JsonProperty("data:key:accesslevelname_accesslevelheader")
    private DataKeyAccesslevelnameAccesslevelheader dataKeyAccesslevelnameAccesslevelheader;
    @JsonProperty("data:key:interestreminderprinciple_interestreminderprinciple")
    private DataKeyInterestreminderprincipleInterestreminderprinciple dataKeyInterestreminderprincipleInterestreminderprinciple;
    @JsonProperty("data:key:companyoforigin_companyinformation")
    private DataKeyCompanyoforiginCompanyinformation dataKeyCompanyoforiginCompanyinformation;
    @JsonProperty("data:key:postaldistrict_1")
    private DataKeyPostaldistrict1 dataKeyPostaldistrict1;
    @JsonProperty("data:key:departmentnumber_department")
    private DataKeyDepartmentnumberDepartment dataKeyDepartmentnumberDepartment;
    @JsonProperty("data:key:specification3name_specification3")
    private DataKeySpecification3nameSpecification3 dataKeySpecification3nameSpecification3;
    @JsonProperty("data:key:journalnumber_journal")
    private DataKeyJournalnumberJournal dataKeyJournalnumberJournal;
    @JsonProperty("data:key:entityname_entity")
    private DataKeyEntitynameEntity dataKeyEntitynameEntity;
    @JsonProperty("data:key:paymentagent_paymentagentinformation")
    private DataKeyPaymentagentPaymentagentinformation dataKeyPaymentagentPaymentagentinformation;
    @JsonProperty("data:key:specification1name_specification1")
    private DataKeySpecification1nameSpecification1 dataKeySpecification1nameSpecification1;
    @JsonProperty("data:key:customernumber_customer")
    private DataKeyCustomernumberCustomer dataKeyCustomernumberCustomer;
    @JsonProperty("data:key:companycustomerlocationname_location")
    private DataKeyCompanycustomerlocationnameLocation dataKeyCompanycustomerlocationnameLocation;
    @JsonProperty("data:key:companycustomercompanynumber_companyinformation")
    private DataKeyCompanycustomercompanynumberCompanyinformation dataKeyCompanycustomercompanynumberCompanyinformation;
    @JsonProperty("data:key:parentcustomer_customer")
    private DataKeyParentcustomerCustomer dataKeyParentcustomerCustomer;
    @JsonProperty("data:key:companycustomerpurposename_purpose")
    private DataKeyCompanycustomerpurposenamePurpose dataKeyCompanycustomerpurposenamePurpose;
    @JsonProperty("data:key:ourcontact_employee")
    private DataKeyOurcontactEmployee dataKeyOurcontactEmployee;
    @JsonProperty("data:key:customerentrycustomerpaymentmode_customerpaymentmode")
    private DataKeyCustomerentrycustomerpaymentmodeCustomerpaymentmode dataKeyCustomerentrycustomerpaymentmodeCustomerpaymentmode;
    @JsonProperty("data:key:companycustomerspecification7name_specification7")
    private DataKeyCompanycustomerspecification7nameSpecification7 dataKeyCompanycustomerspecification7nameSpecification7;
    @JsonProperty("data:key:purposename_purpose")
    private DataKeyPurposenamePurpose dataKeyPurposenamePurpose;
    @JsonProperty("data:key:companycustomerspecification5name_specification5")
    private DataKeyCompanycustomerspecification5nameSpecification5 dataKeyCompanycustomerspecification5nameSpecification5;
    @JsonProperty("data:key:specification9name_specification9")
    private DataKeySpecification9nameSpecification9 dataKeySpecification9nameSpecification9;
    @JsonProperty("data:key:companycustomerentityname_entity")
    private DataKeyCompanycustomerentitynameEntity dataKeyCompanycustomerentitynameEntity;
    @JsonProperty("data:key:specification7name_specification7")
    private DataKeySpecification7nameSpecification7 dataKeySpecification7nameSpecification7;
    @JsonProperty("data:key:activitynumber_activity")
    private DataKeyActivitynumberActivity dataKeyActivitynumberActivity;
    @JsonProperty("data:key:companycustomerspecification9name_specification9")
    private DataKeyCompanycustomerspecification9nameSpecification9 dataKeyCompanycustomerspecification9nameSpecification9;
    @JsonProperty("data:key:projectname_project")
    private DataKeyProjectnameProject dataKeyProjectnameProject;
    @JsonProperty("data:key:specification5name_specification5")
    private DataKeySpecification5nameSpecification5 dataKeySpecification5nameSpecification5;
    @JsonProperty("data:key:companycustomerspecification10name_specification10")
    private DataKeyCompanycustomerspecification10nameSpecification10 dataKeyCompanycustomerspecification10nameSpecification10;
    @JsonProperty("data:key:documentarchivenumber_documentarchiveheader")
    private DataKeyDocumentarchivenumberDocumentarchiveheader dataKeyDocumentarchivenumberDocumentarchiveheader;
    @JsonProperty("data:key:companycustomer")
    private DataKeyCompanycustomer dataKeyCompanycustomer;
    @JsonProperty("data:key:specification10name_specification10")
    private DataKeySpecification10nameSpecification10 dataKeySpecification10nameSpecification10;
    @JsonProperty("data:key:companycustomerprojectname_project")
    private DataKeyCompanycustomerprojectnameProject dataKeyCompanycustomerprojectnameProject;
    @JsonProperty("data:key:companycustomercustomerpaymentmode_customerpaymentmode")
    private DataKeyCompanycustomercustomerpaymentmodeCustomerpaymentmode dataKeyCompanycustomercustomerpaymentmodeCustomerpaymentmode;
    @JsonProperty("data:key:companycustomerspecification3name_specification3")
    private DataKeyCompanycustomerspecification3nameSpecification3 dataKeyCompanycustomerspecification3nameSpecification3;
    @JsonProperty("data:key:companycustomerspecification4name_specification4")
    private DataKeyCompanycustomerspecification4nameSpecification4 dataKeyCompanycustomerspecification4nameSpecification4;
    @JsonProperty("data:key:companycustomerspecification1name_specification1")
    private DataKeyCompanycustomerspecification1nameSpecification1 dataKeyCompanycustomerspecification1nameSpecification1;
    @JsonProperty("data:key:companycustomerspecification2name_specification2")
    private DataKeyCompanycustomerspecification2nameSpecification2 dataKeyCompanycustomerspecification2nameSpecification2;
    @JsonProperty("data:key:country_country")
    private DataKeyCountryCountry dataKeyCountryCountry;
    @JsonProperty("data:key:accountstatement")
    private DataKeyAccountstatement dataKeyAccountstatement;
    @JsonProperty("data:key:salespersonnumber_employee")
    private DataKeySalespersonnumberEmployee dataKeySalespersonnumberEmployee;
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
     * @param dataKeyJournalnumberJournal
     * @param dataKeyCompanycustomerspecification2nameSpecification2
     * @param dataKeySpecification4nameSpecification4
     * @param dataKeyAccountstatement
     * @param dataKeyInterestreminderprincipleInterestreminderprinciple
     * @param dataKeyJobnumberJobheader
     * @param dataKeyOurcontactEmployee
     * @param dataKeySpecification9nameSpecification9
     * @param dataKeyPostaldistrict1
     * @param dataKeyCompanycustomerspecification8nameSpecification8
     * @param dataKeySpecification10nameSpecification10
     * @param dataKeyCompanycustomerpurposenamePurpose
     * @param dataKeyAccountstatementcustomerCustomer
     * @param dataKeySpecification3nameSpecification3
     * @param dataKeyPaymentcustomerCustomer
     * @param dataKeyCompanycustomerspecification1nameSpecification1
     * @param dataKeyCustomerentrycompanynumberCompanyinformation
     * @param dataKeySalespersonnumberEmployee
     * @param dataKeyCustomerentrycustomerpaymentmodeCustomerpaymentmode
     * @param dataKeyProjectnameProject
     * @param dataKeyCompanycustomerspecification6nameSpecification6
     * @param dataKeyDocumentarchivenumberDocumentarchiveheader
     * @param dataKeySpecification1nameSpecification1
     * @param dataKeyCompanycustomercompanynumberCompanyinformation
     * @param dataKeyCountryCountry
     * @param dataKeySpecification8nameSpecification8
     * @param dataKeyCompanycustomerspecification7nameSpecification7
     * @param dataKeyDimensioncombnumberDimensioncombheader
     * @param dataKeySpecification7nameSpecification7
     * @param dataKeyCompanycustomercustomerpaymentmodeCustomerpaymentmode
     * @param dataKeyActivitynumberActivity
     * @param dataKeySpecification2nameSpecification2
     * @param dataKeyCompanycustomerspecification10nameSpecification10
     * @param dataKeyLocationnameLocation
     * @param dataKeyCompanycustomerentitynameEntity
     * @param dataKeyParentcustomerCustomer
     * @param dataKeyPaymentagentPaymentagentinformation
     * @param dataKeyAccesslevelnameAccesslevelheader
     * @param dataKeyCompanycustomer
     * @param dataKeyCompanycustomerlocationnameLocation
     * @param dataKeyPurposenamePurpose
     * @param dataSameKey
     * @param dataKeyCompanycustomerprojectnameProject
     * @param dataKeySpecification6nameSpecification6
     * @param dataKeyCompanycustomerspecification5nameSpecification5
     * @param dataKeyCreditgeneraljournalCustomerpayment
     * @param dataKeyDepartmentnumberDepartment
     * @param dataKeyCompanycustomerspecification3nameSpecification3
     * @param dataKeyCompanycustomerspecification9nameSpecification9
     * @param dataKeyCompanycustomerspecification4nameSpecification4
     * @param dataKeyCompanyoforiginCompanyinformation
     * @param dataKeyHolidaycalendarnameHolidaycalendarheader
     * @param dataKeyEntitynameEntity
     * @param dataKeySpecification5nameSpecification5
     * @param dataKeyRemindertextgroupnameRemindertextgroupheader
     * @param dataKeyCustomernumberCustomer
     */
    public Links(DataSameKey dataSameKey, DataKeySpecification2nameSpecification2 dataKeySpecification2nameSpecification2, DataKeyLocationnameLocation dataKeyLocationnameLocation, DataKeyHolidaycalendarnameHolidaycalendarheader dataKeyHolidaycalendarnameHolidaycalendarheader, DataKeyCompanycustomerspecification8nameSpecification8 dataKeyCompanycustomerspecification8nameSpecification8, DataKeyJobnumberJobheader dataKeyJobnumberJobheader, DataKeyCompanycustomerspecification6nameSpecification6 dataKeyCompanycustomerspecification6nameSpecification6, DataKeyCreditgeneraljournalCustomerpayment dataKeyCreditgeneraljournalCustomerpayment, DataKeySpecification8nameSpecification8 dataKeySpecification8nameSpecification8, DataKeyPaymentcustomerCustomer dataKeyPaymentcustomerCustomer, DataKeySpecification6nameSpecification6 dataKeySpecification6nameSpecification6, DataKeyDimensioncombnumberDimensioncombheader dataKeyDimensioncombnumberDimensioncombheader, DataKeyRemindertextgroupnameRemindertextgroupheader dataKeyRemindertextgroupnameRemindertextgroupheader, DataKeySpecification4nameSpecification4 dataKeySpecification4nameSpecification4, DataKeyCustomerentrycompanynumberCompanyinformation dataKeyCustomerentrycompanynumberCompanyinformation, DataKeyAccountstatementcustomerCustomer dataKeyAccountstatementcustomerCustomer, DataKeyAccesslevelnameAccesslevelheader dataKeyAccesslevelnameAccesslevelheader, DataKeyInterestreminderprincipleInterestreminderprinciple dataKeyInterestreminderprincipleInterestreminderprinciple, DataKeyCompanyoforiginCompanyinformation dataKeyCompanyoforiginCompanyinformation, DataKeyPostaldistrict1 dataKeyPostaldistrict1, DataKeyDepartmentnumberDepartment dataKeyDepartmentnumberDepartment, DataKeySpecification3nameSpecification3 dataKeySpecification3nameSpecification3, DataKeyJournalnumberJournal dataKeyJournalnumberJournal, DataKeyEntitynameEntity dataKeyEntitynameEntity, DataKeyPaymentagentPaymentagentinformation dataKeyPaymentagentPaymentagentinformation, DataKeySpecification1nameSpecification1 dataKeySpecification1nameSpecification1, DataKeyCustomernumberCustomer dataKeyCustomernumberCustomer, DataKeyCompanycustomerlocationnameLocation dataKeyCompanycustomerlocationnameLocation, DataKeyCompanycustomercompanynumberCompanyinformation dataKeyCompanycustomercompanynumberCompanyinformation, DataKeyParentcustomerCustomer dataKeyParentcustomerCustomer, DataKeyCompanycustomerpurposenamePurpose dataKeyCompanycustomerpurposenamePurpose, DataKeyOurcontactEmployee dataKeyOurcontactEmployee, DataKeyCustomerentrycustomerpaymentmodeCustomerpaymentmode dataKeyCustomerentrycustomerpaymentmodeCustomerpaymentmode, DataKeyCompanycustomerspecification7nameSpecification7 dataKeyCompanycustomerspecification7nameSpecification7, DataKeyPurposenamePurpose dataKeyPurposenamePurpose, DataKeyCompanycustomerspecification5nameSpecification5 dataKeyCompanycustomerspecification5nameSpecification5, DataKeySpecification9nameSpecification9 dataKeySpecification9nameSpecification9, DataKeyCompanycustomerentitynameEntity dataKeyCompanycustomerentitynameEntity, DataKeySpecification7nameSpecification7 dataKeySpecification7nameSpecification7, DataKeyActivitynumberActivity dataKeyActivitynumberActivity, DataKeyCompanycustomerspecification9nameSpecification9 dataKeyCompanycustomerspecification9nameSpecification9, DataKeyProjectnameProject dataKeyProjectnameProject, DataKeySpecification5nameSpecification5 dataKeySpecification5nameSpecification5, DataKeyCompanycustomerspecification10nameSpecification10 dataKeyCompanycustomerspecification10nameSpecification10, DataKeyDocumentarchivenumberDocumentarchiveheader dataKeyDocumentarchivenumberDocumentarchiveheader, DataKeyCompanycustomer dataKeyCompanycustomer, DataKeySpecification10nameSpecification10 dataKeySpecification10nameSpecification10, DataKeyCompanycustomerprojectnameProject dataKeyCompanycustomerprojectnameProject, DataKeyCompanycustomercustomerpaymentmodeCustomerpaymentmode dataKeyCompanycustomercustomerpaymentmodeCustomerpaymentmode, DataKeyCompanycustomerspecification3nameSpecification3 dataKeyCompanycustomerspecification3nameSpecification3, DataKeyCompanycustomerspecification4nameSpecification4 dataKeyCompanycustomerspecification4nameSpecification4, DataKeyCompanycustomerspecification1nameSpecification1 dataKeyCompanycustomerspecification1nameSpecification1, DataKeyCompanycustomerspecification2nameSpecification2 dataKeyCompanycustomerspecification2nameSpecification2, DataKeyCountryCountry dataKeyCountryCountry, DataKeyAccountstatement dataKeyAccountstatement, DataKeySalespersonnumberEmployee dataKeySalespersonnumberEmployee) {
        this.dataSameKey = dataSameKey;
        this.dataKeySpecification2nameSpecification2 = dataKeySpecification2nameSpecification2;
        this.dataKeyLocationnameLocation = dataKeyLocationnameLocation;
        this.dataKeyHolidaycalendarnameHolidaycalendarheader = dataKeyHolidaycalendarnameHolidaycalendarheader;
        this.dataKeyCompanycustomerspecification8nameSpecification8 = dataKeyCompanycustomerspecification8nameSpecification8;
        this.dataKeyJobnumberJobheader = dataKeyJobnumberJobheader;
        this.dataKeyCompanycustomerspecification6nameSpecification6 = dataKeyCompanycustomerspecification6nameSpecification6;
        this.dataKeyCreditgeneraljournalCustomerpayment = dataKeyCreditgeneraljournalCustomerpayment;
        this.dataKeySpecification8nameSpecification8 = dataKeySpecification8nameSpecification8;
        this.dataKeyPaymentcustomerCustomer = dataKeyPaymentcustomerCustomer;
        this.dataKeySpecification6nameSpecification6 = dataKeySpecification6nameSpecification6;
        this.dataKeyDimensioncombnumberDimensioncombheader = dataKeyDimensioncombnumberDimensioncombheader;
        this.dataKeyRemindertextgroupnameRemindertextgroupheader = dataKeyRemindertextgroupnameRemindertextgroupheader;
        this.dataKeySpecification4nameSpecification4 = dataKeySpecification4nameSpecification4;
        this.dataKeyCustomerentrycompanynumberCompanyinformation = dataKeyCustomerentrycompanynumberCompanyinformation;
        this.dataKeyAccountstatementcustomerCustomer = dataKeyAccountstatementcustomerCustomer;
        this.dataKeyAccesslevelnameAccesslevelheader = dataKeyAccesslevelnameAccesslevelheader;
        this.dataKeyInterestreminderprincipleInterestreminderprinciple = dataKeyInterestreminderprincipleInterestreminderprinciple;
        this.dataKeyCompanyoforiginCompanyinformation = dataKeyCompanyoforiginCompanyinformation;
        this.dataKeyPostaldistrict1 = dataKeyPostaldistrict1;
        this.dataKeyDepartmentnumberDepartment = dataKeyDepartmentnumberDepartment;
        this.dataKeySpecification3nameSpecification3 = dataKeySpecification3nameSpecification3;
        this.dataKeyJournalnumberJournal = dataKeyJournalnumberJournal;
        this.dataKeyEntitynameEntity = dataKeyEntitynameEntity;
        this.dataKeyPaymentagentPaymentagentinformation = dataKeyPaymentagentPaymentagentinformation;
        this.dataKeySpecification1nameSpecification1 = dataKeySpecification1nameSpecification1;
        this.dataKeyCustomernumberCustomer = dataKeyCustomernumberCustomer;
        this.dataKeyCompanycustomerlocationnameLocation = dataKeyCompanycustomerlocationnameLocation;
        this.dataKeyCompanycustomercompanynumberCompanyinformation = dataKeyCompanycustomercompanynumberCompanyinformation;
        this.dataKeyParentcustomerCustomer = dataKeyParentcustomerCustomer;
        this.dataKeyCompanycustomerpurposenamePurpose = dataKeyCompanycustomerpurposenamePurpose;
        this.dataKeyOurcontactEmployee = dataKeyOurcontactEmployee;
        this.dataKeyCustomerentrycustomerpaymentmodeCustomerpaymentmode = dataKeyCustomerentrycustomerpaymentmodeCustomerpaymentmode;
        this.dataKeyCompanycustomerspecification7nameSpecification7 = dataKeyCompanycustomerspecification7nameSpecification7;
        this.dataKeyPurposenamePurpose = dataKeyPurposenamePurpose;
        this.dataKeyCompanycustomerspecification5nameSpecification5 = dataKeyCompanycustomerspecification5nameSpecification5;
        this.dataKeySpecification9nameSpecification9 = dataKeySpecification9nameSpecification9;
        this.dataKeyCompanycustomerentitynameEntity = dataKeyCompanycustomerentitynameEntity;
        this.dataKeySpecification7nameSpecification7 = dataKeySpecification7nameSpecification7;
        this.dataKeyActivitynumberActivity = dataKeyActivitynumberActivity;
        this.dataKeyCompanycustomerspecification9nameSpecification9 = dataKeyCompanycustomerspecification9nameSpecification9;
        this.dataKeyProjectnameProject = dataKeyProjectnameProject;
        this.dataKeySpecification5nameSpecification5 = dataKeySpecification5nameSpecification5;
        this.dataKeyCompanycustomerspecification10nameSpecification10 = dataKeyCompanycustomerspecification10nameSpecification10;
        this.dataKeyDocumentarchivenumberDocumentarchiveheader = dataKeyDocumentarchivenumberDocumentarchiveheader;
        this.dataKeyCompanycustomer = dataKeyCompanycustomer;
        this.dataKeySpecification10nameSpecification10 = dataKeySpecification10nameSpecification10;
        this.dataKeyCompanycustomerprojectnameProject = dataKeyCompanycustomerprojectnameProject;
        this.dataKeyCompanycustomercustomerpaymentmodeCustomerpaymentmode = dataKeyCompanycustomercustomerpaymentmodeCustomerpaymentmode;
        this.dataKeyCompanycustomerspecification3nameSpecification3 = dataKeyCompanycustomerspecification3nameSpecification3;
        this.dataKeyCompanycustomerspecification4nameSpecification4 = dataKeyCompanycustomerspecification4nameSpecification4;
        this.dataKeyCompanycustomerspecification1nameSpecification1 = dataKeyCompanycustomerspecification1nameSpecification1;
        this.dataKeyCompanycustomerspecification2nameSpecification2 = dataKeyCompanycustomerspecification2nameSpecification2;
        this.dataKeyCountryCountry = dataKeyCountryCountry;
        this.dataKeyAccountstatement = dataKeyAccountstatement;
        this.dataKeySalespersonnumberEmployee = dataKeySalespersonnumberEmployee;
    }

    /**
     * 
     * @return
     *     The dataSameKey
     */
    @JsonProperty("data:same-key")
    public DataSameKey getDataSameKey() {
        return dataSameKey;
    }

    /**
     * 
     * @param dataSameKey
     *     The data:same-key
     */
    @JsonProperty("data:same-key")
    public void setDataSameKey(DataSameKey dataSameKey) {
        this.dataSameKey = dataSameKey;
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
     *     The dataKeyHolidaycalendarnameHolidaycalendarheader
     */
    @JsonProperty("data:key:holidaycalendarname_holidaycalendarheader")
    public DataKeyHolidaycalendarnameHolidaycalendarheader getDataKeyHolidaycalendarnameHolidaycalendarheader() {
        return dataKeyHolidaycalendarnameHolidaycalendarheader;
    }

    /**
     * 
     * @param dataKeyHolidaycalendarnameHolidaycalendarheader
     *     The data:key:holidaycalendarname_holidaycalendarheader
     */
    @JsonProperty("data:key:holidaycalendarname_holidaycalendarheader")
    public void setDataKeyHolidaycalendarnameHolidaycalendarheader(DataKeyHolidaycalendarnameHolidaycalendarheader dataKeyHolidaycalendarnameHolidaycalendarheader) {
        this.dataKeyHolidaycalendarnameHolidaycalendarheader = dataKeyHolidaycalendarnameHolidaycalendarheader;
    }

    /**
     * 
     * @return
     *     The dataKeyCompanycustomerspecification8nameSpecification8
     */
    @JsonProperty("data:key:companycustomerspecification8name_specification8")
    public DataKeyCompanycustomerspecification8nameSpecification8 getDataKeyCompanycustomerspecification8nameSpecification8() {
        return dataKeyCompanycustomerspecification8nameSpecification8;
    }

    /**
     * 
     * @param dataKeyCompanycustomerspecification8nameSpecification8
     *     The data:key:companycustomerspecification8name_specification8
     */
    @JsonProperty("data:key:companycustomerspecification8name_specification8")
    public void setDataKeyCompanycustomerspecification8nameSpecification8(DataKeyCompanycustomerspecification8nameSpecification8 dataKeyCompanycustomerspecification8nameSpecification8) {
        this.dataKeyCompanycustomerspecification8nameSpecification8 = dataKeyCompanycustomerspecification8nameSpecification8;
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
     *     The dataKeyCompanycustomerspecification6nameSpecification6
     */
    @JsonProperty("data:key:companycustomerspecification6name_specification6")
    public DataKeyCompanycustomerspecification6nameSpecification6 getDataKeyCompanycustomerspecification6nameSpecification6() {
        return dataKeyCompanycustomerspecification6nameSpecification6;
    }

    /**
     * 
     * @param dataKeyCompanycustomerspecification6nameSpecification6
     *     The data:key:companycustomerspecification6name_specification6
     */
    @JsonProperty("data:key:companycustomerspecification6name_specification6")
    public void setDataKeyCompanycustomerspecification6nameSpecification6(DataKeyCompanycustomerspecification6nameSpecification6 dataKeyCompanycustomerspecification6nameSpecification6) {
        this.dataKeyCompanycustomerspecification6nameSpecification6 = dataKeyCompanycustomerspecification6nameSpecification6;
    }

    /**
     * 
     * @return
     *     The dataKeyCreditgeneraljournalCustomerpayment
     */
    @JsonProperty("data:key:creditgeneraljournal_customerpayment")
    public DataKeyCreditgeneraljournalCustomerpayment getDataKeyCreditgeneraljournalCustomerpayment() {
        return dataKeyCreditgeneraljournalCustomerpayment;
    }

    /**
     * 
     * @param dataKeyCreditgeneraljournalCustomerpayment
     *     The data:key:creditgeneraljournal_customerpayment
     */
    @JsonProperty("data:key:creditgeneraljournal_customerpayment")
    public void setDataKeyCreditgeneraljournalCustomerpayment(DataKeyCreditgeneraljournalCustomerpayment dataKeyCreditgeneraljournalCustomerpayment) {
        this.dataKeyCreditgeneraljournalCustomerpayment = dataKeyCreditgeneraljournalCustomerpayment;
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
     *     The dataKeyPaymentcustomerCustomer
     */
    @JsonProperty("data:key:paymentcustomer_customer")
    public DataKeyPaymentcustomerCustomer getDataKeyPaymentcustomerCustomer() {
        return dataKeyPaymentcustomerCustomer;
    }

    /**
     * 
     * @param dataKeyPaymentcustomerCustomer
     *     The data:key:paymentcustomer_customer
     */
    @JsonProperty("data:key:paymentcustomer_customer")
    public void setDataKeyPaymentcustomerCustomer(DataKeyPaymentcustomerCustomer dataKeyPaymentcustomerCustomer) {
        this.dataKeyPaymentcustomerCustomer = dataKeyPaymentcustomerCustomer;
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
     *     The dataKeyDimensioncombnumberDimensioncombheader
     */
    @JsonProperty("data:key:dimensioncombnumber_dimensioncombheader")
    public DataKeyDimensioncombnumberDimensioncombheader getDataKeyDimensioncombnumberDimensioncombheader() {
        return dataKeyDimensioncombnumberDimensioncombheader;
    }

    /**
     * 
     * @param dataKeyDimensioncombnumberDimensioncombheader
     *     The data:key:dimensioncombnumber_dimensioncombheader
     */
    @JsonProperty("data:key:dimensioncombnumber_dimensioncombheader")
    public void setDataKeyDimensioncombnumberDimensioncombheader(DataKeyDimensioncombnumberDimensioncombheader dataKeyDimensioncombnumberDimensioncombheader) {
        this.dataKeyDimensioncombnumberDimensioncombheader = dataKeyDimensioncombnumberDimensioncombheader;
    }

    /**
     * 
     * @return
     *     The dataKeyRemindertextgroupnameRemindertextgroupheader
     */
    @JsonProperty("data:key:remindertextgroupname_remindertextgroupheader")
    public DataKeyRemindertextgroupnameRemindertextgroupheader getDataKeyRemindertextgroupnameRemindertextgroupheader() {
        return dataKeyRemindertextgroupnameRemindertextgroupheader;
    }

    /**
     * 
     * @param dataKeyRemindertextgroupnameRemindertextgroupheader
     *     The data:key:remindertextgroupname_remindertextgroupheader
     */
    @JsonProperty("data:key:remindertextgroupname_remindertextgroupheader")
    public void setDataKeyRemindertextgroupnameRemindertextgroupheader(DataKeyRemindertextgroupnameRemindertextgroupheader dataKeyRemindertextgroupnameRemindertextgroupheader) {
        this.dataKeyRemindertextgroupnameRemindertextgroupheader = dataKeyRemindertextgroupnameRemindertextgroupheader;
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
     *     The dataKeyCustomerentrycompanynumberCompanyinformation
     */
    @JsonProperty("data:key:customerentrycompanynumber_companyinformation")
    public DataKeyCustomerentrycompanynumberCompanyinformation getDataKeyCustomerentrycompanynumberCompanyinformation() {
        return dataKeyCustomerentrycompanynumberCompanyinformation;
    }

    /**
     * 
     * @param dataKeyCustomerentrycompanynumberCompanyinformation
     *     The data:key:customerentrycompanynumber_companyinformation
     */
    @JsonProperty("data:key:customerentrycompanynumber_companyinformation")
    public void setDataKeyCustomerentrycompanynumberCompanyinformation(DataKeyCustomerentrycompanynumberCompanyinformation dataKeyCustomerentrycompanynumberCompanyinformation) {
        this.dataKeyCustomerentrycompanynumberCompanyinformation = dataKeyCustomerentrycompanynumberCompanyinformation;
    }

    /**
     * 
     * @return
     *     The dataKeyAccountstatementcustomerCustomer
     */
    @JsonProperty("data:key:accountstatementcustomer_customer")
    public DataKeyAccountstatementcustomerCustomer getDataKeyAccountstatementcustomerCustomer() {
        return dataKeyAccountstatementcustomerCustomer;
    }

    /**
     * 
     * @param dataKeyAccountstatementcustomerCustomer
     *     The data:key:accountstatementcustomer_customer
     */
    @JsonProperty("data:key:accountstatementcustomer_customer")
    public void setDataKeyAccountstatementcustomerCustomer(DataKeyAccountstatementcustomerCustomer dataKeyAccountstatementcustomerCustomer) {
        this.dataKeyAccountstatementcustomerCustomer = dataKeyAccountstatementcustomerCustomer;
    }

    /**
     * 
     * @return
     *     The dataKeyAccesslevelnameAccesslevelheader
     */
    @JsonProperty("data:key:accesslevelname_accesslevelheader")
    public DataKeyAccesslevelnameAccesslevelheader getDataKeyAccesslevelnameAccesslevelheader() {
        return dataKeyAccesslevelnameAccesslevelheader;
    }

    /**
     * 
     * @param dataKeyAccesslevelnameAccesslevelheader
     *     The data:key:accesslevelname_accesslevelheader
     */
    @JsonProperty("data:key:accesslevelname_accesslevelheader")
    public void setDataKeyAccesslevelnameAccesslevelheader(DataKeyAccesslevelnameAccesslevelheader dataKeyAccesslevelnameAccesslevelheader) {
        this.dataKeyAccesslevelnameAccesslevelheader = dataKeyAccesslevelnameAccesslevelheader;
    }

    /**
     * 
     * @return
     *     The dataKeyInterestreminderprincipleInterestreminderprinciple
     */
    @JsonProperty("data:key:interestreminderprinciple_interestreminderprinciple")
    public DataKeyInterestreminderprincipleInterestreminderprinciple getDataKeyInterestreminderprincipleInterestreminderprinciple() {
        return dataKeyInterestreminderprincipleInterestreminderprinciple;
    }

    /**
     * 
     * @param dataKeyInterestreminderprincipleInterestreminderprinciple
     *     The data:key:interestreminderprinciple_interestreminderprinciple
     */
    @JsonProperty("data:key:interestreminderprinciple_interestreminderprinciple")
    public void setDataKeyInterestreminderprincipleInterestreminderprinciple(DataKeyInterestreminderprincipleInterestreminderprinciple dataKeyInterestreminderprincipleInterestreminderprinciple) {
        this.dataKeyInterestreminderprincipleInterestreminderprinciple = dataKeyInterestreminderprincipleInterestreminderprinciple;
    }

    /**
     * 
     * @return
     *     The dataKeyCompanyoforiginCompanyinformation
     */
    @JsonProperty("data:key:companyoforigin_companyinformation")
    public DataKeyCompanyoforiginCompanyinformation getDataKeyCompanyoforiginCompanyinformation() {
        return dataKeyCompanyoforiginCompanyinformation;
    }

    /**
     * 
     * @param dataKeyCompanyoforiginCompanyinformation
     *     The data:key:companyoforigin_companyinformation
     */
    @JsonProperty("data:key:companyoforigin_companyinformation")
    public void setDataKeyCompanyoforiginCompanyinformation(DataKeyCompanyoforiginCompanyinformation dataKeyCompanyoforiginCompanyinformation) {
        this.dataKeyCompanyoforiginCompanyinformation = dataKeyCompanyoforiginCompanyinformation;
    }

    /**
     * 
     * @return
     *     The dataKeyPostaldistrict1
     */
    @JsonProperty("data:key:postaldistrict_1")
    public DataKeyPostaldistrict1 getDataKeyPostaldistrict1() {
        return dataKeyPostaldistrict1;
    }

    /**
     * 
     * @param dataKeyPostaldistrict1
     *     The data:key:postaldistrict_1
     */
    @JsonProperty("data:key:postaldistrict_1")
    public void setDataKeyPostaldistrict1(DataKeyPostaldistrict1 dataKeyPostaldistrict1) {
        this.dataKeyPostaldistrict1 = dataKeyPostaldistrict1;
    }

    /**
     * 
     * @return
     *     The dataKeyDepartmentnumberDepartment
     */
    @JsonProperty("data:key:departmentnumber_department")
    public DataKeyDepartmentnumberDepartment getDataKeyDepartmentnumberDepartment() {
        return dataKeyDepartmentnumberDepartment;
    }

    /**
     * 
     * @param dataKeyDepartmentnumberDepartment
     *     The data:key:departmentnumber_department
     */
    @JsonProperty("data:key:departmentnumber_department")
    public void setDataKeyDepartmentnumberDepartment(DataKeyDepartmentnumberDepartment dataKeyDepartmentnumberDepartment) {
        this.dataKeyDepartmentnumberDepartment = dataKeyDepartmentnumberDepartment;
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
     *     The dataKeyJournalnumberJournal
     */
    @JsonProperty("data:key:journalnumber_journal")
    public DataKeyJournalnumberJournal getDataKeyJournalnumberJournal() {
        return dataKeyJournalnumberJournal;
    }

    /**
     * 
     * @param dataKeyJournalnumberJournal
     *     The data:key:journalnumber_journal
     */
    @JsonProperty("data:key:journalnumber_journal")
    public void setDataKeyJournalnumberJournal(DataKeyJournalnumberJournal dataKeyJournalnumberJournal) {
        this.dataKeyJournalnumberJournal = dataKeyJournalnumberJournal;
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
     *     The dataKeyPaymentagentPaymentagentinformation
     */
    @JsonProperty("data:key:paymentagent_paymentagentinformation")
    public DataKeyPaymentagentPaymentagentinformation getDataKeyPaymentagentPaymentagentinformation() {
        return dataKeyPaymentagentPaymentagentinformation;
    }

    /**
     * 
     * @param dataKeyPaymentagentPaymentagentinformation
     *     The data:key:paymentagent_paymentagentinformation
     */
    @JsonProperty("data:key:paymentagent_paymentagentinformation")
    public void setDataKeyPaymentagentPaymentagentinformation(DataKeyPaymentagentPaymentagentinformation dataKeyPaymentagentPaymentagentinformation) {
        this.dataKeyPaymentagentPaymentagentinformation = dataKeyPaymentagentPaymentagentinformation;
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
     *     The dataKeyCustomernumberCustomer
     */
    @JsonProperty("data:key:customernumber_customer")
    public DataKeyCustomernumberCustomer getDataKeyCustomernumberCustomer() {
        return dataKeyCustomernumberCustomer;
    }

    /**
     * 
     * @param dataKeyCustomernumberCustomer
     *     The data:key:customernumber_customer
     */
    @JsonProperty("data:key:customernumber_customer")
    public void setDataKeyCustomernumberCustomer(DataKeyCustomernumberCustomer dataKeyCustomernumberCustomer) {
        this.dataKeyCustomernumberCustomer = dataKeyCustomernumberCustomer;
    }

    /**
     * 
     * @return
     *     The dataKeyCompanycustomerlocationnameLocation
     */
    @JsonProperty("data:key:companycustomerlocationname_location")
    public DataKeyCompanycustomerlocationnameLocation getDataKeyCompanycustomerlocationnameLocation() {
        return dataKeyCompanycustomerlocationnameLocation;
    }

    /**
     * 
     * @param dataKeyCompanycustomerlocationnameLocation
     *     The data:key:companycustomerlocationname_location
     */
    @JsonProperty("data:key:companycustomerlocationname_location")
    public void setDataKeyCompanycustomerlocationnameLocation(DataKeyCompanycustomerlocationnameLocation dataKeyCompanycustomerlocationnameLocation) {
        this.dataKeyCompanycustomerlocationnameLocation = dataKeyCompanycustomerlocationnameLocation;
    }

    /**
     * 
     * @return
     *     The dataKeyCompanycustomercompanynumberCompanyinformation
     */
    @JsonProperty("data:key:companycustomercompanynumber_companyinformation")
    public DataKeyCompanycustomercompanynumberCompanyinformation getDataKeyCompanycustomercompanynumberCompanyinformation() {
        return dataKeyCompanycustomercompanynumberCompanyinformation;
    }

    /**
     * 
     * @param dataKeyCompanycustomercompanynumberCompanyinformation
     *     The data:key:companycustomercompanynumber_companyinformation
     */
    @JsonProperty("data:key:companycustomercompanynumber_companyinformation")
    public void setDataKeyCompanycustomercompanynumberCompanyinformation(DataKeyCompanycustomercompanynumberCompanyinformation dataKeyCompanycustomercompanynumberCompanyinformation) {
        this.dataKeyCompanycustomercompanynumberCompanyinformation = dataKeyCompanycustomercompanynumberCompanyinformation;
    }

    /**
     * 
     * @return
     *     The dataKeyParentcustomerCustomer
     */
    @JsonProperty("data:key:parentcustomer_customer")
    public DataKeyParentcustomerCustomer getDataKeyParentcustomerCustomer() {
        return dataKeyParentcustomerCustomer;
    }

    /**
     * 
     * @param dataKeyParentcustomerCustomer
     *     The data:key:parentcustomer_customer
     */
    @JsonProperty("data:key:parentcustomer_customer")
    public void setDataKeyParentcustomerCustomer(DataKeyParentcustomerCustomer dataKeyParentcustomerCustomer) {
        this.dataKeyParentcustomerCustomer = dataKeyParentcustomerCustomer;
    }

    /**
     * 
     * @return
     *     The dataKeyCompanycustomerpurposenamePurpose
     */
    @JsonProperty("data:key:companycustomerpurposename_purpose")
    public DataKeyCompanycustomerpurposenamePurpose getDataKeyCompanycustomerpurposenamePurpose() {
        return dataKeyCompanycustomerpurposenamePurpose;
    }

    /**
     * 
     * @param dataKeyCompanycustomerpurposenamePurpose
     *     The data:key:companycustomerpurposename_purpose
     */
    @JsonProperty("data:key:companycustomerpurposename_purpose")
    public void setDataKeyCompanycustomerpurposenamePurpose(DataKeyCompanycustomerpurposenamePurpose dataKeyCompanycustomerpurposenamePurpose) {
        this.dataKeyCompanycustomerpurposenamePurpose = dataKeyCompanycustomerpurposenamePurpose;
    }

    /**
     * 
     * @return
     *     The dataKeyOurcontactEmployee
     */
    @JsonProperty("data:key:ourcontact_employee")
    public DataKeyOurcontactEmployee getDataKeyOurcontactEmployee() {
        return dataKeyOurcontactEmployee;
    }

    /**
     * 
     * @param dataKeyOurcontactEmployee
     *     The data:key:ourcontact_employee
     */
    @JsonProperty("data:key:ourcontact_employee")
    public void setDataKeyOurcontactEmployee(DataKeyOurcontactEmployee dataKeyOurcontactEmployee) {
        this.dataKeyOurcontactEmployee = dataKeyOurcontactEmployee;
    }

    /**
     * 
     * @return
     *     The dataKeyCustomerentrycustomerpaymentmodeCustomerpaymentmode
     */
    @JsonProperty("data:key:customerentrycustomerpaymentmode_customerpaymentmode")
    public DataKeyCustomerentrycustomerpaymentmodeCustomerpaymentmode getDataKeyCustomerentrycustomerpaymentmodeCustomerpaymentmode() {
        return dataKeyCustomerentrycustomerpaymentmodeCustomerpaymentmode;
    }

    /**
     * 
     * @param dataKeyCustomerentrycustomerpaymentmodeCustomerpaymentmode
     *     The data:key:customerentrycustomerpaymentmode_customerpaymentmode
     */
    @JsonProperty("data:key:customerentrycustomerpaymentmode_customerpaymentmode")
    public void setDataKeyCustomerentrycustomerpaymentmodeCustomerpaymentmode(DataKeyCustomerentrycustomerpaymentmodeCustomerpaymentmode dataKeyCustomerentrycustomerpaymentmodeCustomerpaymentmode) {
        this.dataKeyCustomerentrycustomerpaymentmodeCustomerpaymentmode = dataKeyCustomerentrycustomerpaymentmodeCustomerpaymentmode;
    }

    /**
     * 
     * @return
     *     The dataKeyCompanycustomerspecification7nameSpecification7
     */
    @JsonProperty("data:key:companycustomerspecification7name_specification7")
    public DataKeyCompanycustomerspecification7nameSpecification7 getDataKeyCompanycustomerspecification7nameSpecification7() {
        return dataKeyCompanycustomerspecification7nameSpecification7;
    }

    /**
     * 
     * @param dataKeyCompanycustomerspecification7nameSpecification7
     *     The data:key:companycustomerspecification7name_specification7
     */
    @JsonProperty("data:key:companycustomerspecification7name_specification7")
    public void setDataKeyCompanycustomerspecification7nameSpecification7(DataKeyCompanycustomerspecification7nameSpecification7 dataKeyCompanycustomerspecification7nameSpecification7) {
        this.dataKeyCompanycustomerspecification7nameSpecification7 = dataKeyCompanycustomerspecification7nameSpecification7;
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
     *     The dataKeyCompanycustomerspecification5nameSpecification5
     */
    @JsonProperty("data:key:companycustomerspecification5name_specification5")
    public DataKeyCompanycustomerspecification5nameSpecification5 getDataKeyCompanycustomerspecification5nameSpecification5() {
        return dataKeyCompanycustomerspecification5nameSpecification5;
    }

    /**
     * 
     * @param dataKeyCompanycustomerspecification5nameSpecification5
     *     The data:key:companycustomerspecification5name_specification5
     */
    @JsonProperty("data:key:companycustomerspecification5name_specification5")
    public void setDataKeyCompanycustomerspecification5nameSpecification5(DataKeyCompanycustomerspecification5nameSpecification5 dataKeyCompanycustomerspecification5nameSpecification5) {
        this.dataKeyCompanycustomerspecification5nameSpecification5 = dataKeyCompanycustomerspecification5nameSpecification5;
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
     *     The dataKeyCompanycustomerentitynameEntity
     */
    @JsonProperty("data:key:companycustomerentityname_entity")
    public DataKeyCompanycustomerentitynameEntity getDataKeyCompanycustomerentitynameEntity() {
        return dataKeyCompanycustomerentitynameEntity;
    }

    /**
     * 
     * @param dataKeyCompanycustomerentitynameEntity
     *     The data:key:companycustomerentityname_entity
     */
    @JsonProperty("data:key:companycustomerentityname_entity")
    public void setDataKeyCompanycustomerentitynameEntity(DataKeyCompanycustomerentitynameEntity dataKeyCompanycustomerentitynameEntity) {
        this.dataKeyCompanycustomerentitynameEntity = dataKeyCompanycustomerentitynameEntity;
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
     *     The dataKeyCompanycustomerspecification9nameSpecification9
     */
    @JsonProperty("data:key:companycustomerspecification9name_specification9")
    public DataKeyCompanycustomerspecification9nameSpecification9 getDataKeyCompanycustomerspecification9nameSpecification9() {
        return dataKeyCompanycustomerspecification9nameSpecification9;
    }

    /**
     * 
     * @param dataKeyCompanycustomerspecification9nameSpecification9
     *     The data:key:companycustomerspecification9name_specification9
     */
    @JsonProperty("data:key:companycustomerspecification9name_specification9")
    public void setDataKeyCompanycustomerspecification9nameSpecification9(DataKeyCompanycustomerspecification9nameSpecification9 dataKeyCompanycustomerspecification9nameSpecification9) {
        this.dataKeyCompanycustomerspecification9nameSpecification9 = dataKeyCompanycustomerspecification9nameSpecification9;
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
     *     The dataKeyCompanycustomerspecification10nameSpecification10
     */
    @JsonProperty("data:key:companycustomerspecification10name_specification10")
    public DataKeyCompanycustomerspecification10nameSpecification10 getDataKeyCompanycustomerspecification10nameSpecification10() {
        return dataKeyCompanycustomerspecification10nameSpecification10;
    }

    /**
     * 
     * @param dataKeyCompanycustomerspecification10nameSpecification10
     *     The data:key:companycustomerspecification10name_specification10
     */
    @JsonProperty("data:key:companycustomerspecification10name_specification10")
    public void setDataKeyCompanycustomerspecification10nameSpecification10(DataKeyCompanycustomerspecification10nameSpecification10 dataKeyCompanycustomerspecification10nameSpecification10) {
        this.dataKeyCompanycustomerspecification10nameSpecification10 = dataKeyCompanycustomerspecification10nameSpecification10;
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
     *     The dataKeyCompanycustomer
     */
    @JsonProperty("data:key:companycustomer")
    public DataKeyCompanycustomer getDataKeyCompanycustomer() {
        return dataKeyCompanycustomer;
    }

    /**
     * 
     * @param dataKeyCompanycustomer
     *     The data:key:companycustomer
     */
    @JsonProperty("data:key:companycustomer")
    public void setDataKeyCompanycustomer(DataKeyCompanycustomer dataKeyCompanycustomer) {
        this.dataKeyCompanycustomer = dataKeyCompanycustomer;
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
     *     The dataKeyCompanycustomerprojectnameProject
     */
    @JsonProperty("data:key:companycustomerprojectname_project")
    public DataKeyCompanycustomerprojectnameProject getDataKeyCompanycustomerprojectnameProject() {
        return dataKeyCompanycustomerprojectnameProject;
    }

    /**
     * 
     * @param dataKeyCompanycustomerprojectnameProject
     *     The data:key:companycustomerprojectname_project
     */
    @JsonProperty("data:key:companycustomerprojectname_project")
    public void setDataKeyCompanycustomerprojectnameProject(DataKeyCompanycustomerprojectnameProject dataKeyCompanycustomerprojectnameProject) {
        this.dataKeyCompanycustomerprojectnameProject = dataKeyCompanycustomerprojectnameProject;
    }

    /**
     * 
     * @return
     *     The dataKeyCompanycustomercustomerpaymentmodeCustomerpaymentmode
     */
    @JsonProperty("data:key:companycustomercustomerpaymentmode_customerpaymentmode")
    public DataKeyCompanycustomercustomerpaymentmodeCustomerpaymentmode getDataKeyCompanycustomercustomerpaymentmodeCustomerpaymentmode() {
        return dataKeyCompanycustomercustomerpaymentmodeCustomerpaymentmode;
    }

    /**
     * 
     * @param dataKeyCompanycustomercustomerpaymentmodeCustomerpaymentmode
     *     The data:key:companycustomercustomerpaymentmode_customerpaymentmode
     */
    @JsonProperty("data:key:companycustomercustomerpaymentmode_customerpaymentmode")
    public void setDataKeyCompanycustomercustomerpaymentmodeCustomerpaymentmode(DataKeyCompanycustomercustomerpaymentmodeCustomerpaymentmode dataKeyCompanycustomercustomerpaymentmodeCustomerpaymentmode) {
        this.dataKeyCompanycustomercustomerpaymentmodeCustomerpaymentmode = dataKeyCompanycustomercustomerpaymentmodeCustomerpaymentmode;
    }

    /**
     * 
     * @return
     *     The dataKeyCompanycustomerspecification3nameSpecification3
     */
    @JsonProperty("data:key:companycustomerspecification3name_specification3")
    public DataKeyCompanycustomerspecification3nameSpecification3 getDataKeyCompanycustomerspecification3nameSpecification3() {
        return dataKeyCompanycustomerspecification3nameSpecification3;
    }

    /**
     * 
     * @param dataKeyCompanycustomerspecification3nameSpecification3
     *     The data:key:companycustomerspecification3name_specification3
     */
    @JsonProperty("data:key:companycustomerspecification3name_specification3")
    public void setDataKeyCompanycustomerspecification3nameSpecification3(DataKeyCompanycustomerspecification3nameSpecification3 dataKeyCompanycustomerspecification3nameSpecification3) {
        this.dataKeyCompanycustomerspecification3nameSpecification3 = dataKeyCompanycustomerspecification3nameSpecification3;
    }

    /**
     * 
     * @return
     *     The dataKeyCompanycustomerspecification4nameSpecification4
     */
    @JsonProperty("data:key:companycustomerspecification4name_specification4")
    public DataKeyCompanycustomerspecification4nameSpecification4 getDataKeyCompanycustomerspecification4nameSpecification4() {
        return dataKeyCompanycustomerspecification4nameSpecification4;
    }

    /**
     * 
     * @param dataKeyCompanycustomerspecification4nameSpecification4
     *     The data:key:companycustomerspecification4name_specification4
     */
    @JsonProperty("data:key:companycustomerspecification4name_specification4")
    public void setDataKeyCompanycustomerspecification4nameSpecification4(DataKeyCompanycustomerspecification4nameSpecification4 dataKeyCompanycustomerspecification4nameSpecification4) {
        this.dataKeyCompanycustomerspecification4nameSpecification4 = dataKeyCompanycustomerspecification4nameSpecification4;
    }

    /**
     * 
     * @return
     *     The dataKeyCompanycustomerspecification1nameSpecification1
     */
    @JsonProperty("data:key:companycustomerspecification1name_specification1")
    public DataKeyCompanycustomerspecification1nameSpecification1 getDataKeyCompanycustomerspecification1nameSpecification1() {
        return dataKeyCompanycustomerspecification1nameSpecification1;
    }

    /**
     * 
     * @param dataKeyCompanycustomerspecification1nameSpecification1
     *     The data:key:companycustomerspecification1name_specification1
     */
    @JsonProperty("data:key:companycustomerspecification1name_specification1")
    public void setDataKeyCompanycustomerspecification1nameSpecification1(DataKeyCompanycustomerspecification1nameSpecification1 dataKeyCompanycustomerspecification1nameSpecification1) {
        this.dataKeyCompanycustomerspecification1nameSpecification1 = dataKeyCompanycustomerspecification1nameSpecification1;
    }

    /**
     * 
     * @return
     *     The dataKeyCompanycustomerspecification2nameSpecification2
     */
    @JsonProperty("data:key:companycustomerspecification2name_specification2")
    public DataKeyCompanycustomerspecification2nameSpecification2 getDataKeyCompanycustomerspecification2nameSpecification2() {
        return dataKeyCompanycustomerspecification2nameSpecification2;
    }

    /**
     * 
     * @param dataKeyCompanycustomerspecification2nameSpecification2
     *     The data:key:companycustomerspecification2name_specification2
     */
    @JsonProperty("data:key:companycustomerspecification2name_specification2")
    public void setDataKeyCompanycustomerspecification2nameSpecification2(DataKeyCompanycustomerspecification2nameSpecification2 dataKeyCompanycustomerspecification2nameSpecification2) {
        this.dataKeyCompanycustomerspecification2nameSpecification2 = dataKeyCompanycustomerspecification2nameSpecification2;
    }

    /**
     * 
     * @return
     *     The dataKeyCountryCountry
     */
    @JsonProperty("data:key:country_country")
    public DataKeyCountryCountry getDataKeyCountryCountry() {
        return dataKeyCountryCountry;
    }

    /**
     * 
     * @param dataKeyCountryCountry
     *     The data:key:country_country
     */
    @JsonProperty("data:key:country_country")
    public void setDataKeyCountryCountry(DataKeyCountryCountry dataKeyCountryCountry) {
        this.dataKeyCountryCountry = dataKeyCountryCountry;
    }

    /**
     * 
     * @return
     *     The dataKeyAccountstatement
     */
    @JsonProperty("data:key:accountstatement")
    public DataKeyAccountstatement getDataKeyAccountstatement() {
        return dataKeyAccountstatement;
    }

    /**
     * 
     * @param dataKeyAccountstatement
     *     The data:key:accountstatement
     */
    @JsonProperty("data:key:accountstatement")
    public void setDataKeyAccountstatement(DataKeyAccountstatement dataKeyAccountstatement) {
        this.dataKeyAccountstatement = dataKeyAccountstatement;
    }

    /**
     * 
     * @return
     *     The dataKeySalespersonnumberEmployee
     */
    @JsonProperty("data:key:salespersonnumber_employee")
    public DataKeySalespersonnumberEmployee getDataKeySalespersonnumberEmployee() {
        return dataKeySalespersonnumberEmployee;
    }

    /**
     * 
     * @param dataKeySalespersonnumberEmployee
     *     The data:key:salespersonnumber_employee
     */
    @JsonProperty("data:key:salespersonnumber_employee")
    public void setDataKeySalespersonnumberEmployee(DataKeySalespersonnumberEmployee dataKeySalespersonnumberEmployee) {
        this.dataKeySalespersonnumberEmployee = dataKeySalespersonnumberEmployee;
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
        return new HashCodeBuilder().append(dataSameKey).append(dataKeySpecification2nameSpecification2).append(dataKeyLocationnameLocation).append(dataKeyHolidaycalendarnameHolidaycalendarheader).append(dataKeyCompanycustomerspecification8nameSpecification8).append(dataKeyJobnumberJobheader).append(dataKeyCompanycustomerspecification6nameSpecification6).append(dataKeyCreditgeneraljournalCustomerpayment).append(dataKeySpecification8nameSpecification8).append(dataKeyPaymentcustomerCustomer).append(dataKeySpecification6nameSpecification6).append(dataKeyDimensioncombnumberDimensioncombheader).append(dataKeyRemindertextgroupnameRemindertextgroupheader).append(dataKeySpecification4nameSpecification4).append(dataKeyCustomerentrycompanynumberCompanyinformation).append(dataKeyAccountstatementcustomerCustomer).append(dataKeyAccesslevelnameAccesslevelheader).append(dataKeyInterestreminderprincipleInterestreminderprinciple).append(dataKeyCompanyoforiginCompanyinformation).append(dataKeyPostaldistrict1).append(dataKeyDepartmentnumberDepartment).append(dataKeySpecification3nameSpecification3).append(dataKeyJournalnumberJournal).append(dataKeyEntitynameEntity).append(dataKeyPaymentagentPaymentagentinformation).append(dataKeySpecification1nameSpecification1).append(dataKeyCustomernumberCustomer).append(dataKeyCompanycustomerlocationnameLocation).append(dataKeyCompanycustomercompanynumberCompanyinformation).append(dataKeyParentcustomerCustomer).append(dataKeyCompanycustomerpurposenamePurpose).append(dataKeyOurcontactEmployee).append(dataKeyCustomerentrycustomerpaymentmodeCustomerpaymentmode).append(dataKeyCompanycustomerspecification7nameSpecification7).append(dataKeyPurposenamePurpose).append(dataKeyCompanycustomerspecification5nameSpecification5).append(dataKeySpecification9nameSpecification9).append(dataKeyCompanycustomerentitynameEntity).append(dataKeySpecification7nameSpecification7).append(dataKeyActivitynumberActivity).append(dataKeyCompanycustomerspecification9nameSpecification9).append(dataKeyProjectnameProject).append(dataKeySpecification5nameSpecification5).append(dataKeyCompanycustomerspecification10nameSpecification10).append(dataKeyDocumentarchivenumberDocumentarchiveheader).append(dataKeyCompanycustomer).append(dataKeySpecification10nameSpecification10).append(dataKeyCompanycustomerprojectnameProject).append(dataKeyCompanycustomercustomerpaymentmodeCustomerpaymentmode).append(dataKeyCompanycustomerspecification3nameSpecification3).append(dataKeyCompanycustomerspecification4nameSpecification4).append(dataKeyCompanycustomerspecification1nameSpecification1).append(dataKeyCompanycustomerspecification2nameSpecification2).append(dataKeyCountryCountry).append(dataKeyAccountstatement).append(dataKeySalespersonnumberEmployee).append(additionalProperties).toHashCode();
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
        return new EqualsBuilder().append(dataSameKey, rhs.dataSameKey).append(dataKeySpecification2nameSpecification2, rhs.dataKeySpecification2nameSpecification2).append(dataKeyLocationnameLocation, rhs.dataKeyLocationnameLocation).append(dataKeyHolidaycalendarnameHolidaycalendarheader, rhs.dataKeyHolidaycalendarnameHolidaycalendarheader).append(dataKeyCompanycustomerspecification8nameSpecification8, rhs.dataKeyCompanycustomerspecification8nameSpecification8).append(dataKeyJobnumberJobheader, rhs.dataKeyJobnumberJobheader).append(dataKeyCompanycustomerspecification6nameSpecification6, rhs.dataKeyCompanycustomerspecification6nameSpecification6).append(dataKeyCreditgeneraljournalCustomerpayment, rhs.dataKeyCreditgeneraljournalCustomerpayment).append(dataKeySpecification8nameSpecification8, rhs.dataKeySpecification8nameSpecification8).append(dataKeyPaymentcustomerCustomer, rhs.dataKeyPaymentcustomerCustomer).append(dataKeySpecification6nameSpecification6, rhs.dataKeySpecification6nameSpecification6).append(dataKeyDimensioncombnumberDimensioncombheader, rhs.dataKeyDimensioncombnumberDimensioncombheader).append(dataKeyRemindertextgroupnameRemindertextgroupheader, rhs.dataKeyRemindertextgroupnameRemindertextgroupheader).append(dataKeySpecification4nameSpecification4, rhs.dataKeySpecification4nameSpecification4).append(dataKeyCustomerentrycompanynumberCompanyinformation, rhs.dataKeyCustomerentrycompanynumberCompanyinformation).append(dataKeyAccountstatementcustomerCustomer, rhs.dataKeyAccountstatementcustomerCustomer).append(dataKeyAccesslevelnameAccesslevelheader, rhs.dataKeyAccesslevelnameAccesslevelheader).append(dataKeyInterestreminderprincipleInterestreminderprinciple, rhs.dataKeyInterestreminderprincipleInterestreminderprinciple).append(dataKeyCompanyoforiginCompanyinformation, rhs.dataKeyCompanyoforiginCompanyinformation).append(dataKeyPostaldistrict1, rhs.dataKeyPostaldistrict1).append(dataKeyDepartmentnumberDepartment, rhs.dataKeyDepartmentnumberDepartment).append(dataKeySpecification3nameSpecification3, rhs.dataKeySpecification3nameSpecification3).append(dataKeyJournalnumberJournal, rhs.dataKeyJournalnumberJournal).append(dataKeyEntitynameEntity, rhs.dataKeyEntitynameEntity).append(dataKeyPaymentagentPaymentagentinformation, rhs.dataKeyPaymentagentPaymentagentinformation).append(dataKeySpecification1nameSpecification1, rhs.dataKeySpecification1nameSpecification1).append(dataKeyCustomernumberCustomer, rhs.dataKeyCustomernumberCustomer).append(dataKeyCompanycustomerlocationnameLocation, rhs.dataKeyCompanycustomerlocationnameLocation).append(dataKeyCompanycustomercompanynumberCompanyinformation, rhs.dataKeyCompanycustomercompanynumberCompanyinformation).append(dataKeyParentcustomerCustomer, rhs.dataKeyParentcustomerCustomer).append(dataKeyCompanycustomerpurposenamePurpose, rhs.dataKeyCompanycustomerpurposenamePurpose).append(dataKeyOurcontactEmployee, rhs.dataKeyOurcontactEmployee).append(dataKeyCustomerentrycustomerpaymentmodeCustomerpaymentmode, rhs.dataKeyCustomerentrycustomerpaymentmodeCustomerpaymentmode).append(dataKeyCompanycustomerspecification7nameSpecification7, rhs.dataKeyCompanycustomerspecification7nameSpecification7).append(dataKeyPurposenamePurpose, rhs.dataKeyPurposenamePurpose).append(dataKeyCompanycustomerspecification5nameSpecification5, rhs.dataKeyCompanycustomerspecification5nameSpecification5).append(dataKeySpecification9nameSpecification9, rhs.dataKeySpecification9nameSpecification9).append(dataKeyCompanycustomerentitynameEntity, rhs.dataKeyCompanycustomerentitynameEntity).append(dataKeySpecification7nameSpecification7, rhs.dataKeySpecification7nameSpecification7).append(dataKeyActivitynumberActivity, rhs.dataKeyActivitynumberActivity).append(dataKeyCompanycustomerspecification9nameSpecification9, rhs.dataKeyCompanycustomerspecification9nameSpecification9).append(dataKeyProjectnameProject, rhs.dataKeyProjectnameProject).append(dataKeySpecification5nameSpecification5, rhs.dataKeySpecification5nameSpecification5).append(dataKeyCompanycustomerspecification10nameSpecification10, rhs.dataKeyCompanycustomerspecification10nameSpecification10).append(dataKeyDocumentarchivenumberDocumentarchiveheader, rhs.dataKeyDocumentarchivenumberDocumentarchiveheader).append(dataKeyCompanycustomer, rhs.dataKeyCompanycustomer).append(dataKeySpecification10nameSpecification10, rhs.dataKeySpecification10nameSpecification10).append(dataKeyCompanycustomerprojectnameProject, rhs.dataKeyCompanycustomerprojectnameProject).append(dataKeyCompanycustomercustomerpaymentmodeCustomerpaymentmode, rhs.dataKeyCompanycustomercustomerpaymentmodeCustomerpaymentmode).append(dataKeyCompanycustomerspecification3nameSpecification3, rhs.dataKeyCompanycustomerspecification3nameSpecification3).append(dataKeyCompanycustomerspecification4nameSpecification4, rhs.dataKeyCompanycustomerspecification4nameSpecification4).append(dataKeyCompanycustomerspecification1nameSpecification1, rhs.dataKeyCompanycustomerspecification1nameSpecification1).append(dataKeyCompanycustomerspecification2nameSpecification2, rhs.dataKeyCompanycustomerspecification2nameSpecification2).append(dataKeyCountryCountry, rhs.dataKeyCountryCountry).append(dataKeyAccountstatement, rhs.dataKeyAccountstatement).append(dataKeySalespersonnumberEmployee, rhs.dataKeySalespersonnumberEmployee).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
