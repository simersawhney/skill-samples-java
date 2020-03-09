
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
    "customernumber",
    "linenumber",
    "accesslevelname",
    "accountstatementcustomer",
    "accountstatementnumber",
    "accrualcause",
    "accrualremark",
    "accruedtotalbase",
    "accruedtotalcurrency",
    "accruedtotalenterprise",
    "activestatus",
    "activitynumber",
    "agreement",
    "approvedforreconciliation",
    "area",
    "attention",
    "automaticreconciliation",
    "beingcollectedbase",
    "beingcollectedcurrency",
    "beingcollectedenterprise",
    "beingcollectedoriginal",
    "boolean1",
    "boolean2",
    "boolean3",
    "boolean4",
    "boolean5",
    "cashdiscountcode",
    "changedby",
    "changeddate",
    "cnrnumber",
    "collectionagreementnumber",
    "collectioncurrency",
    "collectiongroupnumber",
    "companycurrency",
    "companycustomercustomerlinking",
    "companynumber",
    "companyoforigin",
    "companyregistrationnumber",
    "companyvatcode",
    "contactperson",
    "controlaccountcode",
    "country",
    "createdby",
    "createddate",
    "creditbase",
    "creditcardexpirydate",
    "creditcardnumber",
    "creditenterprise",
    "creditstandard",
    "customergroup",
    "customerpayeridentifcation",
    "customerpaymentmode",
    "customerpaymentreference",
    "customerpopup1",
    "customerpopup2",
    "customerpopup3",
    "customerpopup4",
    "customerpopup5",
    "customerremark",
    "customerremark1",
    "customerremark10",
    "customerremark2",
    "customerremark3",
    "customerremark4",
    "customerremark5",
    "customerremark6",
    "customerremark7",
    "customerremark8",
    "customerremark9",
    "customerreminderlevel",
    "customertype",
    "debitbase",
    "debitenterprise",
    "debitstandard",
    "departmentnumber",
    "derivedcompanynumber",
    "derivedentityname",
    "derivedlocalspec10name",
    "derivedlocalspec1name",
    "derivedlocalspec2name",
    "derivedlocalspec3name",
    "derivedlocalspec4name",
    "derivedlocalspec5name",
    "derivedlocalspec6name",
    "derivedlocalspec7name",
    "derivedlocalspec8name",
    "derivedlocalspec9name",
    "derivedlocationname",
    "derivedprojectname",
    "derivedpurposename",
    "derivedspec10name",
    "derivedspec1name",
    "derivedspec2name",
    "derivedspec3name",
    "derivedspec4name",
    "derivedspec5name",
    "derivedspec6name",
    "derivedspec7name",
    "derivedspec8name",
    "derivedspec9name",
    "dimensioncombnumber",
    "documentarchivenumber",
    "duedate",
    "electroniccollection",
    "electronicmailaddress",
    "enterprise",
    "entityname",
    "entrycurrency",
    "entrydate",
    "entryreconciliationdate",
    "entrytext",
    "entrytype",
    "exported",
    "exportentry",
    "giro",
    "globallocationnumber",
    "holidaycalendarname",
    "interestapprovaldate",
    "interestdate",
    "interestreminderblock",
    "interestreminderblockdate",
    "interestreminderblockedby",
    "interestreminderprinciple",
    "interestsum",
    "invoicedate",
    "invoicename",
    "jobnumber",
    "journallinenumber",
    "journalnumber",
    "language",
    "linkingrulename",
    "localspec10name",
    "localspec1name",
    "localspec2name",
    "localspec3name",
    "localspec4name",
    "localspec5name",
    "localspec6name",
    "localspec7name",
    "localspec8name",
    "localspec9name",
    "locationname",
    "name1",
    "name2",
    "name3",
    "name4",
    "name5",
    "openclosed",
    "originalamount",
    "originalcurrency",
    "originalduedate",
    "originline",
    "originlineinstancekey",
    "originobject",
    "originobjectinstancekey",
    "ourcontact",
    "overwritecompany",
    "overwriteentity",
    "overwritelocalspec1",
    "overwritelocalspec10",
    "overwritelocalspec2",
    "overwritelocalspec3",
    "overwritelocalspec4",
    "overwritelocalspec5",
    "overwritelocalspec6",
    "overwritelocalspec7",
    "overwritelocalspec8",
    "overwritelocalspec9",
    "overwritelocation",
    "overwriteproject",
    "overwritepurpose",
    "overwritespec1",
    "overwritespec10",
    "overwritespec2",
    "overwritespec3",
    "overwritespec4",
    "overwritespec5",
    "overwritespec6",
    "overwritespec7",
    "overwritespec8",
    "overwritespec9",
    "parentcustomer",
    "payeridentification",
    "paymentagent",
    "paymentcustomer",
    "paymentterms",
    "postaldistrict",
    "postingdate",
    "postingtime",
    "projectname",
    "purposename",
    "reconciliationdate",
    "reconciliationstatus",
    "remainderbase",
    "remainderenterprise",
    "remainderoriginal",
    "remainderstandard",
    "remark",
    "reminderdate",
    "reminderlevel",
    "remindertextgroupname",
    "salespersonnumber",
    "segment",
    "selectedforreconciliation",
    "selectedforreminder",
    "specification10name",
    "specification1name",
    "specification2name",
    "specification3name",
    "specification4name",
    "specification5name",
    "specification6name",
    "specification7name",
    "specification8name",
    "specification9name",
    "standardcustomerpaymentmode",
    "statistic1",
    "statistic2",
    "statistic3",
    "statistic4",
    "telefax",
    "telephone",
    "telex",
    "text1",
    "text2",
    "text3",
    "text4",
    "text5",
    "transactionnumber",
    "transactiontype",
    "vat",
    "vatnumber",
    "versionnumber",
    "withholdingtaxbase",
    "withholdingtaxcurrency",
    "withholdingtaxenterprise",
    "zipcode"
})
public class Data {

    @JsonProperty("customernumber")
    private String customernumber;
    @JsonProperty("linenumber")
    private Integer linenumber;
    @JsonProperty("accesslevelname")
    private String accesslevelname;
    @JsonProperty("accountstatementcustomer")
    private String accountstatementcustomer;
    @JsonProperty("accountstatementnumber")
    private Integer accountstatementnumber;
    @JsonProperty("accrualcause")
    private String accrualcause;
    @JsonProperty("accrualremark")
    private String accrualremark;
    @JsonProperty("accruedtotalbase")
    private Integer accruedtotalbase;
    @JsonProperty("accruedtotalcurrency")
    private Integer accruedtotalcurrency;
    @JsonProperty("accruedtotalenterprise")
    private Integer accruedtotalenterprise;
    @JsonProperty("activestatus")
    private String activestatus;
    @JsonProperty("activitynumber")
    private String activitynumber;
    @JsonProperty("agreement")
    private String agreement;
    @JsonProperty("approvedforreconciliation")
    private Boolean approvedforreconciliation;
    @JsonProperty("area")
    private String area;
    @JsonProperty("attention")
    private String attention;
    @JsonProperty("automaticreconciliation")
    private Boolean automaticreconciliation;
    @JsonProperty("beingcollectedbase")
    private Integer beingcollectedbase;
    @JsonProperty("beingcollectedcurrency")
    private Integer beingcollectedcurrency;
    @JsonProperty("beingcollectedenterprise")
    private Integer beingcollectedenterprise;
    @JsonProperty("beingcollectedoriginal")
    private Integer beingcollectedoriginal;
    @JsonProperty("boolean1")
    private Boolean boolean1;
    @JsonProperty("boolean2")
    private Boolean boolean2;
    @JsonProperty("boolean3")
    private Boolean boolean3;
    @JsonProperty("boolean4")
    private Boolean boolean4;
    @JsonProperty("boolean5")
    private Boolean boolean5;
    @JsonProperty("cashdiscountcode")
    private String cashdiscountcode;
    @JsonProperty("changedby")
    private String changedby;
    @JsonProperty("changeddate")
    private String changeddate;
    @JsonProperty("cnrnumber")
    private String cnrnumber;
    @JsonProperty("collectionagreementnumber")
    private String collectionagreementnumber;
    @JsonProperty("collectioncurrency")
    private Integer collectioncurrency;
    @JsonProperty("collectiongroupnumber")
    private String collectiongroupnumber;
    @JsonProperty("companycurrency")
    private String companycurrency;
    @JsonProperty("companycustomercustomerlinking")
    private String companycustomercustomerlinking;
    @JsonProperty("companynumber")
    private String companynumber;
    @JsonProperty("companyoforigin")
    private String companyoforigin;
    @JsonProperty("companyregistrationnumber")
    private String companyregistrationnumber;
    @JsonProperty("companyvatcode")
    private String companyvatcode;
    @JsonProperty("contactperson")
    private String contactperson;
    @JsonProperty("controlaccountcode")
    private String controlaccountcode;
    @JsonProperty("country")
    private String country;
    @JsonProperty("createdby")
    private String createdby;
    @JsonProperty("createddate")
    private String createddate;
    @JsonProperty("creditbase")
    private Integer creditbase;
    @JsonProperty("creditcardexpirydate")
    private String creditcardexpirydate;
    @JsonProperty("creditcardnumber")
    private String creditcardnumber;
    @JsonProperty("creditenterprise")
    private Integer creditenterprise;
    @JsonProperty("creditstandard")
    private Integer creditstandard;
    @JsonProperty("customergroup")
    private String customergroup;
    @JsonProperty("customerpayeridentifcation")
    private String customerpayeridentifcation;
    @JsonProperty("customerpaymentmode")
    private String customerpaymentmode;
    @JsonProperty("customerpaymentreference")
    private String customerpaymentreference;
    @JsonProperty("customerpopup1")
    private String customerpopup1;
    @JsonProperty("customerpopup2")
    private String customerpopup2;
    @JsonProperty("customerpopup3")
    private String customerpopup3;
    @JsonProperty("customerpopup4")
    private String customerpopup4;
    @JsonProperty("customerpopup5")
    private String customerpopup5;
    @JsonProperty("customerremark")
    private String customerremark;
    @JsonProperty("customerremark1")
    private String customerremark1;
    @JsonProperty("customerremark10")
    private String customerremark10;
    @JsonProperty("customerremark2")
    private String customerremark2;
    @JsonProperty("customerremark3")
    private String customerremark3;
    @JsonProperty("customerremark4")
    private String customerremark4;
    @JsonProperty("customerremark5")
    private String customerremark5;
    @JsonProperty("customerremark6")
    private String customerremark6;
    @JsonProperty("customerremark7")
    private String customerremark7;
    @JsonProperty("customerremark8")
    private String customerremark8;
    @JsonProperty("customerremark9")
    private String customerremark9;
    @JsonProperty("customerreminderlevel")
    private Integer customerreminderlevel;
    @JsonProperty("customertype")
    private String customertype;
    @JsonProperty("debitbase")
    private Integer debitbase;
    @JsonProperty("debitenterprise")
    private Integer debitenterprise;
    @JsonProperty("debitstandard")
    private Integer debitstandard;
    @JsonProperty("departmentnumber")
    private String departmentnumber;
    @JsonProperty("derivedcompanynumber")
    private String derivedcompanynumber;
    @JsonProperty("derivedentityname")
    private String derivedentityname;
    @JsonProperty("derivedlocalspec10name")
    private String derivedlocalspec10name;
    @JsonProperty("derivedlocalspec1name")
    private String derivedlocalspec1name;
    @JsonProperty("derivedlocalspec2name")
    private String derivedlocalspec2name;
    @JsonProperty("derivedlocalspec3name")
    private String derivedlocalspec3name;
    @JsonProperty("derivedlocalspec4name")
    private String derivedlocalspec4name;
    @JsonProperty("derivedlocalspec5name")
    private String derivedlocalspec5name;
    @JsonProperty("derivedlocalspec6name")
    private String derivedlocalspec6name;
    @JsonProperty("derivedlocalspec7name")
    private String derivedlocalspec7name;
    @JsonProperty("derivedlocalspec8name")
    private String derivedlocalspec8name;
    @JsonProperty("derivedlocalspec9name")
    private String derivedlocalspec9name;
    @JsonProperty("derivedlocationname")
    private String derivedlocationname;
    @JsonProperty("derivedprojectname")
    private String derivedprojectname;
    @JsonProperty("derivedpurposename")
    private String derivedpurposename;
    @JsonProperty("derivedspec10name")
    private String derivedspec10name;
    @JsonProperty("derivedspec1name")
    private String derivedspec1name;
    @JsonProperty("derivedspec2name")
    private String derivedspec2name;
    @JsonProperty("derivedspec3name")
    private String derivedspec3name;
    @JsonProperty("derivedspec4name")
    private String derivedspec4name;
    @JsonProperty("derivedspec5name")
    private String derivedspec5name;
    @JsonProperty("derivedspec6name")
    private String derivedspec6name;
    @JsonProperty("derivedspec7name")
    private String derivedspec7name;
    @JsonProperty("derivedspec8name")
    private String derivedspec8name;
    @JsonProperty("derivedspec9name")
    private String derivedspec9name;
    @JsonProperty("dimensioncombnumber")
    private String dimensioncombnumber;
    @JsonProperty("documentarchivenumber")
    private String documentarchivenumber;
    @JsonProperty("duedate")
    private String duedate;
    @JsonProperty("electroniccollection")
    private Boolean electroniccollection;
    @JsonProperty("electronicmailaddress")
    private String electronicmailaddress;
    @JsonProperty("enterprise")
    private String enterprise;
    @JsonProperty("entityname")
    private String entityname;
    @JsonProperty("entrycurrency")
    private String entrycurrency;
    @JsonProperty("entrydate")
    private String entrydate;
    @JsonProperty("entryreconciliationdate")
    private String entryreconciliationdate;
    @JsonProperty("entrytext")
    private String entrytext;
    @JsonProperty("entrytype")
    private String entrytype;
    @JsonProperty("exported")
    private Boolean exported;
    @JsonProperty("exportentry")
    private Boolean exportentry;
    @JsonProperty("giro")
    private String giro;
    @JsonProperty("globallocationnumber")
    private String globallocationnumber;
    @JsonProperty("holidaycalendarname")
    private String holidaycalendarname;
    @JsonProperty("interestapprovaldate")
    private String interestapprovaldate;
    @JsonProperty("interestdate")
    private String interestdate;
    @JsonProperty("interestreminderblock")
    private String interestreminderblock;
    @JsonProperty("interestreminderblockdate")
    private String interestreminderblockdate;
    @JsonProperty("interestreminderblockedby")
    private String interestreminderblockedby;
    @JsonProperty("interestreminderprinciple")
    private String interestreminderprinciple;
    @JsonProperty("interestsum")
    private Integer interestsum;
    @JsonProperty("invoicedate")
    private String invoicedate;
    @JsonProperty("invoicename")
    private String invoicename;
    @JsonProperty("jobnumber")
    private String jobnumber;
    @JsonProperty("journallinenumber")
    private Integer journallinenumber;
    @JsonProperty("journalnumber")
    private String journalnumber;
    @JsonProperty("language")
    private String language;
    @JsonProperty("linkingrulename")
    private String linkingrulename;
    @JsonProperty("localspec10name")
    private String localspec10name;
    @JsonProperty("localspec1name")
    private String localspec1name;
    @JsonProperty("localspec2name")
    private String localspec2name;
    @JsonProperty("localspec3name")
    private String localspec3name;
    @JsonProperty("localspec4name")
    private String localspec4name;
    @JsonProperty("localspec5name")
    private String localspec5name;
    @JsonProperty("localspec6name")
    private String localspec6name;
    @JsonProperty("localspec7name")
    private String localspec7name;
    @JsonProperty("localspec8name")
    private String localspec8name;
    @JsonProperty("localspec9name")
    private String localspec9name;
    @JsonProperty("locationname")
    private String locationname;
    @JsonProperty("name1")
    private String name1;
    @JsonProperty("name2")
    private String name2;
    @JsonProperty("name3")
    private String name3;
    @JsonProperty("name4")
    private String name4;
    @JsonProperty("name5")
    private String name5;
    @JsonProperty("openclosed")
    private String openclosed;
    @JsonProperty("originalamount")
    private Integer originalamount;
    @JsonProperty("originalcurrency")
    private String originalcurrency;
    @JsonProperty("originalduedate")
    private String originalduedate;
    @JsonProperty("originline")
    private String originline;
    @JsonProperty("originlineinstancekey")
    private String originlineinstancekey;
    @JsonProperty("originobject")
    private String originobject;
    @JsonProperty("originobjectinstancekey")
    private String originobjectinstancekey;
    @JsonProperty("ourcontact")
    private String ourcontact;
    @JsonProperty("overwritecompany")
    private Boolean overwritecompany;
    @JsonProperty("overwriteentity")
    private Boolean overwriteentity;
    @JsonProperty("overwritelocalspec1")
    private Boolean overwritelocalspec1;
    @JsonProperty("overwritelocalspec10")
    private Boolean overwritelocalspec10;
    @JsonProperty("overwritelocalspec2")
    private Boolean overwritelocalspec2;
    @JsonProperty("overwritelocalspec3")
    private Boolean overwritelocalspec3;
    @JsonProperty("overwritelocalspec4")
    private Boolean overwritelocalspec4;
    @JsonProperty("overwritelocalspec5")
    private Boolean overwritelocalspec5;
    @JsonProperty("overwritelocalspec6")
    private Boolean overwritelocalspec6;
    @JsonProperty("overwritelocalspec7")
    private Boolean overwritelocalspec7;
    @JsonProperty("overwritelocalspec8")
    private Boolean overwritelocalspec8;
    @JsonProperty("overwritelocalspec9")
    private Boolean overwritelocalspec9;
    @JsonProperty("overwritelocation")
    private Boolean overwritelocation;
    @JsonProperty("overwriteproject")
    private Boolean overwriteproject;
    @JsonProperty("overwritepurpose")
    private Boolean overwritepurpose;
    @JsonProperty("overwritespec1")
    private Boolean overwritespec1;
    @JsonProperty("overwritespec10")
    private Boolean overwritespec10;
    @JsonProperty("overwritespec2")
    private Boolean overwritespec2;
    @JsonProperty("overwritespec3")
    private Boolean overwritespec3;
    @JsonProperty("overwritespec4")
    private Boolean overwritespec4;
    @JsonProperty("overwritespec5")
    private Boolean overwritespec5;
    @JsonProperty("overwritespec6")
    private Boolean overwritespec6;
    @JsonProperty("overwritespec7")
    private Boolean overwritespec7;
    @JsonProperty("overwritespec8")
    private Boolean overwritespec8;
    @JsonProperty("overwritespec9")
    private Boolean overwritespec9;
    @JsonProperty("parentcustomer")
    private String parentcustomer;
    @JsonProperty("payeridentification")
    private String payeridentification;
    @JsonProperty("paymentagent")
    private String paymentagent;
    @JsonProperty("paymentcustomer")
    private String paymentcustomer;
    @JsonProperty("paymentterms")
    private String paymentterms;
    @JsonProperty("postaldistrict")
    private String postaldistrict;
    @JsonProperty("postingdate")
    private String postingdate;
    @JsonProperty("postingtime")
    private String postingtime;
    @JsonProperty("projectname")
    private String projectname;
    @JsonProperty("purposename")
    private String purposename;
    @JsonProperty("reconciliationdate")
    private String reconciliationdate;
    @JsonProperty("reconciliationstatus")
    private String reconciliationstatus;
    @JsonProperty("remainderbase")
    private Integer remainderbase;
    @JsonProperty("remainderenterprise")
    private Integer remainderenterprise;
    @JsonProperty("remainderoriginal")
    private Integer remainderoriginal;
    @JsonProperty("remainderstandard")
    private Integer remainderstandard;
    @JsonProperty("remark")
    private String remark;
    @JsonProperty("reminderdate")
    private String reminderdate;
    @JsonProperty("reminderlevel")
    private Integer reminderlevel;
    @JsonProperty("remindertextgroupname")
    private String remindertextgroupname;
    @JsonProperty("salespersonnumber")
    private String salespersonnumber;
    @JsonProperty("segment")
    private String segment;
    @JsonProperty("selectedforreconciliation")
    private Boolean selectedforreconciliation;
    @JsonProperty("selectedforreminder")
    private Boolean selectedforreminder;
    @JsonProperty("specification10name")
    private String specification10name;
    @JsonProperty("specification1name")
    private String specification1name;
    @JsonProperty("specification2name")
    private String specification2name;
    @JsonProperty("specification3name")
    private String specification3name;
    @JsonProperty("specification4name")
    private String specification4name;
    @JsonProperty("specification5name")
    private String specification5name;
    @JsonProperty("specification6name")
    private String specification6name;
    @JsonProperty("specification7name")
    private String specification7name;
    @JsonProperty("specification8name")
    private String specification8name;
    @JsonProperty("specification9name")
    private String specification9name;
    @JsonProperty("standardcustomerpaymentmode")
    private String standardcustomerpaymentmode;
    @JsonProperty("statistic1")
    private String statistic1;
    @JsonProperty("statistic2")
    private String statistic2;
    @JsonProperty("statistic3")
    private String statistic3;
    @JsonProperty("statistic4")
    private String statistic4;
    @JsonProperty("telefax")
    private String telefax;
    @JsonProperty("telephone")
    private String telephone;
    @JsonProperty("telex")
    private String telex;
    @JsonProperty("text1")
    private String text1;
    @JsonProperty("text2")
    private String text2;
    @JsonProperty("text3")
    private String text3;
    @JsonProperty("text4")
    private String text4;
    @JsonProperty("text5")
    private String text5;
    @JsonProperty("transactionnumber")
    private String transactionnumber;
    @JsonProperty("transactiontype")
    private String transactiontype;
    @JsonProperty("vat")
    private Boolean vat;
    @JsonProperty("vatnumber")
    private String vatnumber;
    @JsonProperty("versionnumber")
    private Integer versionnumber;
    @JsonProperty("withholdingtaxbase")
    private Integer withholdingtaxbase;
    @JsonProperty("withholdingtaxcurrency")
    private Integer withholdingtaxcurrency;
    @JsonProperty("withholdingtaxenterprise")
    private Integer withholdingtaxenterprise;
    @JsonProperty("zipcode")
    private String zipcode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Data() {
    }

    /**
     * 
     * @param overwritelocalspec9
     * @param journallinenumber
     * @param contactperson
     * @param overwritelocalspec7
     * @param overwritelocalspec8
     * @param overwritelocalspec5
     * @param overwritelocalspec6
     * @param overwritelocalspec3
     * @param overwritelocalspec4
     * @param companynumber
     * @param overwritelocalspec1
     * @param overwritelocalspec2
     * @param originalduedate
     * @param interestreminderblockdate
     * @param derivedspec5name
     * @param specification4name
     * @param specification8name
     * @param derivedspec1name
     * @param agreement
     * @param salespersonnumber
     * @param derivedlocalspec3name
     * @param beingcollectedenterprise
     * @param localspec6name
     * @param text3
     * @param jobnumber
     * @param text4
     * @param text1
     * @param text2
     * @param activitynumber
     * @param text5
     * @param parentcustomer
     * @param customerpaymentreference
     * @param derivedspec8name
     * @param remainderoriginal
     * @param specification1name
     * @param createddate
     * @param remainderbase
     * @param exportentry
     * @param overwritepurpose
     * @param controlaccountcode
     * @param localspec9name
     * @param transactiontype
     * @param entrydate
     * @param creditstandard
     * @param companyvatcode
     * @param exported
     * @param customernumber
     * @param customerremark
     * @param localspec2name
     * @param versionnumber
     * @param derivedlocalspec7name
     * @param accrualremark
     * @param companyoforigin
     * @param creditcardexpirydate
     * @param country
     * @param overwritespec1
     * @param overwritespec4
     * @param overwritespec5
     * @param overwritespec2
     * @param overwritespec3
     * @param language
     * @param specification5name
     * @param beingcollectedcurrency
     * @param createdby
     * @param overwriteentity
     * @param originobjectinstancekey
     * @param segment
     * @param boolean2
     * @param derivedcompanynumber
     * @param localspec3name
     * @param overwritespec8
     * @param approvedforreconciliation
     * @param boolean3
     * @param debitstandard
     * @param overwritespec9
     * @param customerpaymentmode
     * @param overwritespec6
     * @param boolean1
     * @param overwritespec7
     * @param accesslevelname
     * @param telex
     * @param derivedlocalspec4name
     * @param boolean4
     * @param boolean5
     * @param area
     * @param localspec7name
     * @param automaticreconciliation
     * @param accruedtotalbase
     * @param derivedlocalspec10name
     * @param accrualcause
     * @param telephone
     * @param giro
     * @param derivedspec2name
     * @param withholdingtaxbase
     * @param changedby
     * @param interestreminderblockedby
     * @param globallocationnumber
     * @param statistic4
     * @param departmentnumber
     * @param statistic1
     * @param statistic2
     * @param statistic3
     * @param linenumber
     * @param paymentterms
     * @param purposename
     * @param paymentagent
     * @param reconciliationstatus
     * @param collectionagreementnumber
     * @param dimensioncombnumber
     * @param derivedlocalspec8name
     * @param localspec8name
     * @param overwritelocation
     * @param standardcustomerpaymentmode
     * @param interestreminderprinciple
     * @param beingcollectedoriginal
     * @param specification9name
     * @param companycurrency
     * @param customerpayeridentifcation
     * @param entryreconciliationdate
     * @param derivedspec7name
     * @param beingcollectedbase
     * @param duedate
     * @param remindertextgroupname
     * @param interestreminderblock
     * @param invoicedate
     * @param overwriteproject
     * @param derivedspec3name
     * @param interestapprovaldate
     * @param reminderdate
     * @param derivedlocalspec5name
     * @param reconciliationdate
     * @param localspec4name
     * @param projectname
     * @param localspec10name
     * @param originalcurrency
     * @param vat
     * @param creditbase
     * @param derivedspec10name
     * @param originobject
     * @param name5
     * @param derivedlocalspec1name
     * @param name4
     * @param name3
     * @param accruedtotalcurrency
     * @param vatnumber
     * @param collectiongroupnumber
     * @param name2
     * @param name1
     * @param creditcardnumber
     * @param specification6name
     * @param customerremark2
     * @param customerremark3
     * @param customerremark4
     * @param customerremark5
     * @param enterprise
     * @param customerremark1
     * @param entityname
     * @param derivedlocalspec9name
     * @param customerremark6
     * @param customerremark7
     * @param customerremark8
     * @param debitenterprise
     * @param customerremark10
     * @param customerremark9
     * @param ourcontact
     * @param selectedforreconciliation
     * @param cashdiscountcode
     * @param locationname
     * @param postingdate
     * @param remainderstandard
     * @param paymentcustomer
     * @param derivedspec6name
     * @param documentarchivenumber
     * @param cnrnumber
     * @param creditenterprise
     * @param postaldistrict
     * @param specification3name
     * @param withholdingtaxcurrency
     * @param specification10name
     * @param originalamount
     * @param overwritelocalspec10
     * @param interestsum
     * @param entrycurrency
     * @param selectedforreminder
     * @param localspec5name
     * @param accountstatementnumber
     * @param interestdate
     * @param holidaycalendarname
     * @param electronicmailaddress
     * @param customerreminderlevel
     * @param invoicename
     * @param companycustomercustomerlinking
     * @param openclosed
     * @param derivedspec4name
     * @param reminderlevel
     * @param withholdingtaxenterprise
     * @param transactionnumber
     * @param collectioncurrency
     * @param customertype
     * @param accountstatementcustomer
     * @param originlineinstancekey
     * @param derivedlocationname
     * @param originline
     * @param linkingrulename
     * @param derivedprojectname
     * @param specification7name
     * @param zipcode
     * @param customerpopup3
     * @param customerpopup2
     * @param customerpopup5
     * @param customerpopup4
     * @param derivedlocalspec2name
     * @param customerpopup1
     * @param postingtime
     * @param changeddate
     * @param derivedentityname
     * @param remark
     * @param customergroup
     * @param companyregistrationnumber
     * @param debitbase
     * @param entrytype
     * @param overwritespec10
     * @param remainderenterprise
     * @param overwritecompany
     * @param electroniccollection
     * @param derivedpurposename
     * @param payeridentification
     * @param derivedspec9name
     * @param entrytext
     * @param specification2name
     * @param journalnumber
     * @param localspec1name
     * @param accruedtotalenterprise
     * @param attention
     * @param telefax
     * @param activestatus
     * @param derivedlocalspec6name
     */
    public Data(String customernumber, Integer linenumber, String accesslevelname, String accountstatementcustomer, Integer accountstatementnumber, String accrualcause, String accrualremark, Integer accruedtotalbase, Integer accruedtotalcurrency, Integer accruedtotalenterprise, String activestatus, String activitynumber, String agreement, Boolean approvedforreconciliation, String area, String attention, Boolean automaticreconciliation, Integer beingcollectedbase, Integer beingcollectedcurrency, Integer beingcollectedenterprise, Integer beingcollectedoriginal, Boolean boolean1, Boolean boolean2, Boolean boolean3, Boolean boolean4, Boolean boolean5, String cashdiscountcode, String changedby, String changeddate, String cnrnumber, String collectionagreementnumber, Integer collectioncurrency, String collectiongroupnumber, String companycurrency, String companycustomercustomerlinking, String companynumber, String companyoforigin, String companyregistrationnumber, String companyvatcode, String contactperson, String controlaccountcode, String country, String createdby, String createddate, Integer creditbase, String creditcardexpirydate, String creditcardnumber, Integer creditenterprise, Integer creditstandard, String customergroup, String customerpayeridentifcation, String customerpaymentmode, String customerpaymentreference, String customerpopup1, String customerpopup2, String customerpopup3, String customerpopup4, String customerpopup5, String customerremark, String customerremark1, String customerremark10, String customerremark2, String customerremark3, String customerremark4, String customerremark5, String customerremark6, String customerremark7, String customerremark8, String customerremark9, Integer customerreminderlevel, String customertype, Integer debitbase, Integer debitenterprise, Integer debitstandard, String departmentnumber, String derivedcompanynumber, String derivedentityname, String derivedlocalspec10name, String derivedlocalspec1name, String derivedlocalspec2name, String derivedlocalspec3name, String derivedlocalspec4name, String derivedlocalspec5name, String derivedlocalspec6name, String derivedlocalspec7name, String derivedlocalspec8name, String derivedlocalspec9name, String derivedlocationname, String derivedprojectname, String derivedpurposename, String derivedspec10name, String derivedspec1name, String derivedspec2name, String derivedspec3name, String derivedspec4name, String derivedspec5name, String derivedspec6name, String derivedspec7name, String derivedspec8name, String derivedspec9name, String dimensioncombnumber, String documentarchivenumber, String duedate, Boolean electroniccollection, String electronicmailaddress, String enterprise, String entityname, String entrycurrency, String entrydate, String entryreconciliationdate, String entrytext, String entrytype, Boolean exported, Boolean exportentry, String giro, String globallocationnumber, String holidaycalendarname, String interestapprovaldate, String interestdate, String interestreminderblock, String interestreminderblockdate, String interestreminderblockedby, String interestreminderprinciple, Integer interestsum, String invoicedate, String invoicename, String jobnumber, Integer journallinenumber, String journalnumber, String language, String linkingrulename, String localspec10name, String localspec1name, String localspec2name, String localspec3name, String localspec4name, String localspec5name, String localspec6name, String localspec7name, String localspec8name, String localspec9name, String locationname, String name1, String name2, String name3, String name4, String name5, String openclosed, Integer originalamount, String originalcurrency, String originalduedate, String originline, String originlineinstancekey, String originobject, String originobjectinstancekey, String ourcontact, Boolean overwritecompany, Boolean overwriteentity, Boolean overwritelocalspec1, Boolean overwritelocalspec10, Boolean overwritelocalspec2, Boolean overwritelocalspec3, Boolean overwritelocalspec4, Boolean overwritelocalspec5, Boolean overwritelocalspec6, Boolean overwritelocalspec7, Boolean overwritelocalspec8, Boolean overwritelocalspec9, Boolean overwritelocation, Boolean overwriteproject, Boolean overwritepurpose, Boolean overwritespec1, Boolean overwritespec10, Boolean overwritespec2, Boolean overwritespec3, Boolean overwritespec4, Boolean overwritespec5, Boolean overwritespec6, Boolean overwritespec7, Boolean overwritespec8, Boolean overwritespec9, String parentcustomer, String payeridentification, String paymentagent, String paymentcustomer, String paymentterms, String postaldistrict, String postingdate, String postingtime, String projectname, String purposename, String reconciliationdate, String reconciliationstatus, Integer remainderbase, Integer remainderenterprise, Integer remainderoriginal, Integer remainderstandard, String remark, String reminderdate, Integer reminderlevel, String remindertextgroupname, String salespersonnumber, String segment, Boolean selectedforreconciliation, Boolean selectedforreminder, String specification10name, String specification1name, String specification2name, String specification3name, String specification4name, String specification5name, String specification6name, String specification7name, String specification8name, String specification9name, String standardcustomerpaymentmode, String statistic1, String statistic2, String statistic3, String statistic4, String telefax, String telephone, String telex, String text1, String text2, String text3, String text4, String text5, String transactionnumber, String transactiontype, Boolean vat, String vatnumber, Integer versionnumber, Integer withholdingtaxbase, Integer withholdingtaxcurrency, Integer withholdingtaxenterprise, String zipcode) {
        this.customernumber = customernumber;
        this.linenumber = linenumber;
        this.accesslevelname = accesslevelname;
        this.accountstatementcustomer = accountstatementcustomer;
        this.accountstatementnumber = accountstatementnumber;
        this.accrualcause = accrualcause;
        this.accrualremark = accrualremark;
        this.accruedtotalbase = accruedtotalbase;
        this.accruedtotalcurrency = accruedtotalcurrency;
        this.accruedtotalenterprise = accruedtotalenterprise;
        this.activestatus = activestatus;
        this.activitynumber = activitynumber;
        this.agreement = agreement;
        this.approvedforreconciliation = approvedforreconciliation;
        this.area = area;
        this.attention = attention;
        this.automaticreconciliation = automaticreconciliation;
        this.beingcollectedbase = beingcollectedbase;
        this.beingcollectedcurrency = beingcollectedcurrency;
        this.beingcollectedenterprise = beingcollectedenterprise;
        this.beingcollectedoriginal = beingcollectedoriginal;
        this.boolean1 = boolean1;
        this.boolean2 = boolean2;
        this.boolean3 = boolean3;
        this.boolean4 = boolean4;
        this.boolean5 = boolean5;
        this.cashdiscountcode = cashdiscountcode;
        this.changedby = changedby;
        this.changeddate = changeddate;
        this.cnrnumber = cnrnumber;
        this.collectionagreementnumber = collectionagreementnumber;
        this.collectioncurrency = collectioncurrency;
        this.collectiongroupnumber = collectiongroupnumber;
        this.companycurrency = companycurrency;
        this.companycustomercustomerlinking = companycustomercustomerlinking;
        this.companynumber = companynumber;
        this.companyoforigin = companyoforigin;
        this.companyregistrationnumber = companyregistrationnumber;
        this.companyvatcode = companyvatcode;
        this.contactperson = contactperson;
        this.controlaccountcode = controlaccountcode;
        this.country = country;
        this.createdby = createdby;
        this.createddate = createddate;
        this.creditbase = creditbase;
        this.creditcardexpirydate = creditcardexpirydate;
        this.creditcardnumber = creditcardnumber;
        this.creditenterprise = creditenterprise;
        this.creditstandard = creditstandard;
        this.customergroup = customergroup;
        this.customerpayeridentifcation = customerpayeridentifcation;
        this.customerpaymentmode = customerpaymentmode;
        this.customerpaymentreference = customerpaymentreference;
        this.customerpopup1 = customerpopup1;
        this.customerpopup2 = customerpopup2;
        this.customerpopup3 = customerpopup3;
        this.customerpopup4 = customerpopup4;
        this.customerpopup5 = customerpopup5;
        this.customerremark = customerremark;
        this.customerremark1 = customerremark1;
        this.customerremark10 = customerremark10;
        this.customerremark2 = customerremark2;
        this.customerremark3 = customerremark3;
        this.customerremark4 = customerremark4;
        this.customerremark5 = customerremark5;
        this.customerremark6 = customerremark6;
        this.customerremark7 = customerremark7;
        this.customerremark8 = customerremark8;
        this.customerremark9 = customerremark9;
        this.customerreminderlevel = customerreminderlevel;
        this.customertype = customertype;
        this.debitbase = debitbase;
        this.debitenterprise = debitenterprise;
        this.debitstandard = debitstandard;
        this.departmentnumber = departmentnumber;
        this.derivedcompanynumber = derivedcompanynumber;
        this.derivedentityname = derivedentityname;
        this.derivedlocalspec10name = derivedlocalspec10name;
        this.derivedlocalspec1name = derivedlocalspec1name;
        this.derivedlocalspec2name = derivedlocalspec2name;
        this.derivedlocalspec3name = derivedlocalspec3name;
        this.derivedlocalspec4name = derivedlocalspec4name;
        this.derivedlocalspec5name = derivedlocalspec5name;
        this.derivedlocalspec6name = derivedlocalspec6name;
        this.derivedlocalspec7name = derivedlocalspec7name;
        this.derivedlocalspec8name = derivedlocalspec8name;
        this.derivedlocalspec9name = derivedlocalspec9name;
        this.derivedlocationname = derivedlocationname;
        this.derivedprojectname = derivedprojectname;
        this.derivedpurposename = derivedpurposename;
        this.derivedspec10name = derivedspec10name;
        this.derivedspec1name = derivedspec1name;
        this.derivedspec2name = derivedspec2name;
        this.derivedspec3name = derivedspec3name;
        this.derivedspec4name = derivedspec4name;
        this.derivedspec5name = derivedspec5name;
        this.derivedspec6name = derivedspec6name;
        this.derivedspec7name = derivedspec7name;
        this.derivedspec8name = derivedspec8name;
        this.derivedspec9name = derivedspec9name;
        this.dimensioncombnumber = dimensioncombnumber;
        this.documentarchivenumber = documentarchivenumber;
        this.duedate = duedate;
        this.electroniccollection = electroniccollection;
        this.electronicmailaddress = electronicmailaddress;
        this.enterprise = enterprise;
        this.entityname = entityname;
        this.entrycurrency = entrycurrency;
        this.entrydate = entrydate;
        this.entryreconciliationdate = entryreconciliationdate;
        this.entrytext = entrytext;
        this.entrytype = entrytype;
        this.exported = exported;
        this.exportentry = exportentry;
        this.giro = giro;
        this.globallocationnumber = globallocationnumber;
        this.holidaycalendarname = holidaycalendarname;
        this.interestapprovaldate = interestapprovaldate;
        this.interestdate = interestdate;
        this.interestreminderblock = interestreminderblock;
        this.interestreminderblockdate = interestreminderblockdate;
        this.interestreminderblockedby = interestreminderblockedby;
        this.interestreminderprinciple = interestreminderprinciple;
        this.interestsum = interestsum;
        this.invoicedate = invoicedate;
        this.invoicename = invoicename;
        this.jobnumber = jobnumber;
        this.journallinenumber = journallinenumber;
        this.journalnumber = journalnumber;
        this.language = language;
        this.linkingrulename = linkingrulename;
        this.localspec10name = localspec10name;
        this.localspec1name = localspec1name;
        this.localspec2name = localspec2name;
        this.localspec3name = localspec3name;
        this.localspec4name = localspec4name;
        this.localspec5name = localspec5name;
        this.localspec6name = localspec6name;
        this.localspec7name = localspec7name;
        this.localspec8name = localspec8name;
        this.localspec9name = localspec9name;
        this.locationname = locationname;
        this.name1 = name1;
        this.name2 = name2;
        this.name3 = name3;
        this.name4 = name4;
        this.name5 = name5;
        this.openclosed = openclosed;
        this.originalamount = originalamount;
        this.originalcurrency = originalcurrency;
        this.originalduedate = originalduedate;
        this.originline = originline;
        this.originlineinstancekey = originlineinstancekey;
        this.originobject = originobject;
        this.originobjectinstancekey = originobjectinstancekey;
        this.ourcontact = ourcontact;
        this.overwritecompany = overwritecompany;
        this.overwriteentity = overwriteentity;
        this.overwritelocalspec1 = overwritelocalspec1;
        this.overwritelocalspec10 = overwritelocalspec10;
        this.overwritelocalspec2 = overwritelocalspec2;
        this.overwritelocalspec3 = overwritelocalspec3;
        this.overwritelocalspec4 = overwritelocalspec4;
        this.overwritelocalspec5 = overwritelocalspec5;
        this.overwritelocalspec6 = overwritelocalspec6;
        this.overwritelocalspec7 = overwritelocalspec7;
        this.overwritelocalspec8 = overwritelocalspec8;
        this.overwritelocalspec9 = overwritelocalspec9;
        this.overwritelocation = overwritelocation;
        this.overwriteproject = overwriteproject;
        this.overwritepurpose = overwritepurpose;
        this.overwritespec1 = overwritespec1;
        this.overwritespec10 = overwritespec10;
        this.overwritespec2 = overwritespec2;
        this.overwritespec3 = overwritespec3;
        this.overwritespec4 = overwritespec4;
        this.overwritespec5 = overwritespec5;
        this.overwritespec6 = overwritespec6;
        this.overwritespec7 = overwritespec7;
        this.overwritespec8 = overwritespec8;
        this.overwritespec9 = overwritespec9;
        this.parentcustomer = parentcustomer;
        this.payeridentification = payeridentification;
        this.paymentagent = paymentagent;
        this.paymentcustomer = paymentcustomer;
        this.paymentterms = paymentterms;
        this.postaldistrict = postaldistrict;
        this.postingdate = postingdate;
        this.postingtime = postingtime;
        this.projectname = projectname;
        this.purposename = purposename;
        this.reconciliationdate = reconciliationdate;
        this.reconciliationstatus = reconciliationstatus;
        this.remainderbase = remainderbase;
        this.remainderenterprise = remainderenterprise;
        this.remainderoriginal = remainderoriginal;
        this.remainderstandard = remainderstandard;
        this.remark = remark;
        this.reminderdate = reminderdate;
        this.reminderlevel = reminderlevel;
        this.remindertextgroupname = remindertextgroupname;
        this.salespersonnumber = salespersonnumber;
        this.segment = segment;
        this.selectedforreconciliation = selectedforreconciliation;
        this.selectedforreminder = selectedforreminder;
        this.specification10name = specification10name;
        this.specification1name = specification1name;
        this.specification2name = specification2name;
        this.specification3name = specification3name;
        this.specification4name = specification4name;
        this.specification5name = specification5name;
        this.specification6name = specification6name;
        this.specification7name = specification7name;
        this.specification8name = specification8name;
        this.specification9name = specification9name;
        this.standardcustomerpaymentmode = standardcustomerpaymentmode;
        this.statistic1 = statistic1;
        this.statistic2 = statistic2;
        this.statistic3 = statistic3;
        this.statistic4 = statistic4;
        this.telefax = telefax;
        this.telephone = telephone;
        this.telex = telex;
        this.text1 = text1;
        this.text2 = text2;
        this.text3 = text3;
        this.text4 = text4;
        this.text5 = text5;
        this.transactionnumber = transactionnumber;
        this.transactiontype = transactiontype;
        this.vat = vat;
        this.vatnumber = vatnumber;
        this.versionnumber = versionnumber;
        this.withholdingtaxbase = withholdingtaxbase;
        this.withholdingtaxcurrency = withholdingtaxcurrency;
        this.withholdingtaxenterprise = withholdingtaxenterprise;
        this.zipcode = zipcode;
    }

    /**
     * 
     * @return
     *     The customernumber
     */
    @JsonProperty("customernumber")
    public String getCustomernumber() {
        return customernumber;
    }

    /**
     * 
     * @param customernumber
     *     The customernumber
     */
    @JsonProperty("customernumber")
    public void setCustomernumber(String customernumber) {
        this.customernumber = customernumber;
    }

    /**
     * 
     * @return
     *     The linenumber
     */
    @JsonProperty("linenumber")
    public Integer getLinenumber() {
        return linenumber;
    }

    /**
     * 
     * @param linenumber
     *     The linenumber
     */
    @JsonProperty("linenumber")
    public void setLinenumber(Integer linenumber) {
        this.linenumber = linenumber;
    }

    /**
     * 
     * @return
     *     The accesslevelname
     */
    @JsonProperty("accesslevelname")
    public String getAccesslevelname() {
        return accesslevelname;
    }

    /**
     * 
     * @param accesslevelname
     *     The accesslevelname
     */
    @JsonProperty("accesslevelname")
    public void setAccesslevelname(String accesslevelname) {
        this.accesslevelname = accesslevelname;
    }

    /**
     * 
     * @return
     *     The accountstatementcustomer
     */
    @JsonProperty("accountstatementcustomer")
    public String getAccountstatementcustomer() {
        return accountstatementcustomer;
    }

    /**
     * 
     * @param accountstatementcustomer
     *     The accountstatementcustomer
     */
    @JsonProperty("accountstatementcustomer")
    public void setAccountstatementcustomer(String accountstatementcustomer) {
        this.accountstatementcustomer = accountstatementcustomer;
    }

    /**
     * 
     * @return
     *     The accountstatementnumber
     */
    @JsonProperty("accountstatementnumber")
    public Integer getAccountstatementnumber() {
        return accountstatementnumber;
    }

    /**
     * 
     * @param accountstatementnumber
     *     The accountstatementnumber
     */
    @JsonProperty("accountstatementnumber")
    public void setAccountstatementnumber(Integer accountstatementnumber) {
        this.accountstatementnumber = accountstatementnumber;
    }

    /**
     * 
     * @return
     *     The accrualcause
     */
    @JsonProperty("accrualcause")
    public String getAccrualcause() {
        return accrualcause;
    }

    /**
     * 
     * @param accrualcause
     *     The accrualcause
     */
    @JsonProperty("accrualcause")
    public void setAccrualcause(String accrualcause) {
        this.accrualcause = accrualcause;
    }

    /**
     * 
     * @return
     *     The accrualremark
     */
    @JsonProperty("accrualremark")
    public String getAccrualremark() {
        return accrualremark;
    }

    /**
     * 
     * @param accrualremark
     *     The accrualremark
     */
    @JsonProperty("accrualremark")
    public void setAccrualremark(String accrualremark) {
        this.accrualremark = accrualremark;
    }

    /**
     * 
     * @return
     *     The accruedtotalbase
     */
    @JsonProperty("accruedtotalbase")
    public Integer getAccruedtotalbase() {
        return accruedtotalbase;
    }

    /**
     * 
     * @param accruedtotalbase
     *     The accruedtotalbase
     */
    @JsonProperty("accruedtotalbase")
    public void setAccruedtotalbase(Integer accruedtotalbase) {
        this.accruedtotalbase = accruedtotalbase;
    }

    /**
     * 
     * @return
     *     The accruedtotalcurrency
     */
    @JsonProperty("accruedtotalcurrency")
    public Integer getAccruedtotalcurrency() {
        return accruedtotalcurrency;
    }

    /**
     * 
     * @param accruedtotalcurrency
     *     The accruedtotalcurrency
     */
    @JsonProperty("accruedtotalcurrency")
    public void setAccruedtotalcurrency(Integer accruedtotalcurrency) {
        this.accruedtotalcurrency = accruedtotalcurrency;
    }

    /**
     * 
     * @return
     *     The accruedtotalenterprise
     */
    @JsonProperty("accruedtotalenterprise")
    public Integer getAccruedtotalenterprise() {
        return accruedtotalenterprise;
    }

    /**
     * 
     * @param accruedtotalenterprise
     *     The accruedtotalenterprise
     */
    @JsonProperty("accruedtotalenterprise")
    public void setAccruedtotalenterprise(Integer accruedtotalenterprise) {
        this.accruedtotalenterprise = accruedtotalenterprise;
    }

    /**
     * 
     * @return
     *     The activestatus
     */
    @JsonProperty("activestatus")
    public String getActivestatus() {
        return activestatus;
    }

    /**
     * 
     * @param activestatus
     *     The activestatus
     */
    @JsonProperty("activestatus")
    public void setActivestatus(String activestatus) {
        this.activestatus = activestatus;
    }

    /**
     * 
     * @return
     *     The activitynumber
     */
    @JsonProperty("activitynumber")
    public String getActivitynumber() {
        return activitynumber;
    }

    /**
     * 
     * @param activitynumber
     *     The activitynumber
     */
    @JsonProperty("activitynumber")
    public void setActivitynumber(String activitynumber) {
        this.activitynumber = activitynumber;
    }

    /**
     * 
     * @return
     *     The agreement
     */
    @JsonProperty("agreement")
    public String getAgreement() {
        return agreement;
    }

    /**
     * 
     * @param agreement
     *     The agreement
     */
    @JsonProperty("agreement")
    public void setAgreement(String agreement) {
        this.agreement = agreement;
    }

    /**
     * 
     * @return
     *     The approvedforreconciliation
     */
    @JsonProperty("approvedforreconciliation")
    public Boolean getApprovedforreconciliation() {
        return approvedforreconciliation;
    }

    /**
     * 
     * @param approvedforreconciliation
     *     The approvedforreconciliation
     */
    @JsonProperty("approvedforreconciliation")
    public void setApprovedforreconciliation(Boolean approvedforreconciliation) {
        this.approvedforreconciliation = approvedforreconciliation;
    }

    /**
     * 
     * @return
     *     The area
     */
    @JsonProperty("area")
    public String getArea() {
        return area;
    }

    /**
     * 
     * @param area
     *     The area
     */
    @JsonProperty("area")
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * 
     * @return
     *     The attention
     */
    @JsonProperty("attention")
    public String getAttention() {
        return attention;
    }

    /**
     * 
     * @param attention
     *     The attention
     */
    @JsonProperty("attention")
    public void setAttention(String attention) {
        this.attention = attention;
    }

    /**
     * 
     * @return
     *     The automaticreconciliation
     */
    @JsonProperty("automaticreconciliation")
    public Boolean getAutomaticreconciliation() {
        return automaticreconciliation;
    }

    /**
     * 
     * @param automaticreconciliation
     *     The automaticreconciliation
     */
    @JsonProperty("automaticreconciliation")
    public void setAutomaticreconciliation(Boolean automaticreconciliation) {
        this.automaticreconciliation = automaticreconciliation;
    }

    /**
     * 
     * @return
     *     The beingcollectedbase
     */
    @JsonProperty("beingcollectedbase")
    public Integer getBeingcollectedbase() {
        return beingcollectedbase;
    }

    /**
     * 
     * @param beingcollectedbase
     *     The beingcollectedbase
     */
    @JsonProperty("beingcollectedbase")
    public void setBeingcollectedbase(Integer beingcollectedbase) {
        this.beingcollectedbase = beingcollectedbase;
    }

    /**
     * 
     * @return
     *     The beingcollectedcurrency
     */
    @JsonProperty("beingcollectedcurrency")
    public Integer getBeingcollectedcurrency() {
        return beingcollectedcurrency;
    }

    /**
     * 
     * @param beingcollectedcurrency
     *     The beingcollectedcurrency
     */
    @JsonProperty("beingcollectedcurrency")
    public void setBeingcollectedcurrency(Integer beingcollectedcurrency) {
        this.beingcollectedcurrency = beingcollectedcurrency;
    }

    /**
     * 
     * @return
     *     The beingcollectedenterprise
     */
    @JsonProperty("beingcollectedenterprise")
    public Integer getBeingcollectedenterprise() {
        return beingcollectedenterprise;
    }

    /**
     * 
     * @param beingcollectedenterprise
     *     The beingcollectedenterprise
     */
    @JsonProperty("beingcollectedenterprise")
    public void setBeingcollectedenterprise(Integer beingcollectedenterprise) {
        this.beingcollectedenterprise = beingcollectedenterprise;
    }

    /**
     * 
     * @return
     *     The beingcollectedoriginal
     */
    @JsonProperty("beingcollectedoriginal")
    public Integer getBeingcollectedoriginal() {
        return beingcollectedoriginal;
    }

    /**
     * 
     * @param beingcollectedoriginal
     *     The beingcollectedoriginal
     */
    @JsonProperty("beingcollectedoriginal")
    public void setBeingcollectedoriginal(Integer beingcollectedoriginal) {
        this.beingcollectedoriginal = beingcollectedoriginal;
    }

    /**
     * 
     * @return
     *     The boolean1
     */
    @JsonProperty("boolean1")
    public Boolean getBoolean1() {
        return boolean1;
    }

    /**
     * 
     * @param boolean1
     *     The boolean1
     */
    @JsonProperty("boolean1")
    public void setBoolean1(Boolean boolean1) {
        this.boolean1 = boolean1;
    }

    /**
     * 
     * @return
     *     The boolean2
     */
    @JsonProperty("boolean2")
    public Boolean getBoolean2() {
        return boolean2;
    }

    /**
     * 
     * @param boolean2
     *     The boolean2
     */
    @JsonProperty("boolean2")
    public void setBoolean2(Boolean boolean2) {
        this.boolean2 = boolean2;
    }

    /**
     * 
     * @return
     *     The boolean3
     */
    @JsonProperty("boolean3")
    public Boolean getBoolean3() {
        return boolean3;
    }

    /**
     * 
     * @param boolean3
     *     The boolean3
     */
    @JsonProperty("boolean3")
    public void setBoolean3(Boolean boolean3) {
        this.boolean3 = boolean3;
    }

    /**
     * 
     * @return
     *     The boolean4
     */
    @JsonProperty("boolean4")
    public Boolean getBoolean4() {
        return boolean4;
    }

    /**
     * 
     * @param boolean4
     *     The boolean4
     */
    @JsonProperty("boolean4")
    public void setBoolean4(Boolean boolean4) {
        this.boolean4 = boolean4;
    }

    /**
     * 
     * @return
     *     The boolean5
     */
    @JsonProperty("boolean5")
    public Boolean getBoolean5() {
        return boolean5;
    }

    /**
     * 
     * @param boolean5
     *     The boolean5
     */
    @JsonProperty("boolean5")
    public void setBoolean5(Boolean boolean5) {
        this.boolean5 = boolean5;
    }

    /**
     * 
     * @return
     *     The cashdiscountcode
     */
    @JsonProperty("cashdiscountcode")
    public String getCashdiscountcode() {
        return cashdiscountcode;
    }

    /**
     * 
     * @param cashdiscountcode
     *     The cashdiscountcode
     */
    @JsonProperty("cashdiscountcode")
    public void setCashdiscountcode(String cashdiscountcode) {
        this.cashdiscountcode = cashdiscountcode;
    }

    /**
     * 
     * @return
     *     The changedby
     */
    @JsonProperty("changedby")
    public String getChangedby() {
        return changedby;
    }

    /**
     * 
     * @param changedby
     *     The changedby
     */
    @JsonProperty("changedby")
    public void setChangedby(String changedby) {
        this.changedby = changedby;
    }

    /**
     * 
     * @return
     *     The changeddate
     */
    @JsonProperty("changeddate")
    public String getChangeddate() {
        return changeddate;
    }

    /**
     * 
     * @param changeddate
     *     The changeddate
     */
    @JsonProperty("changeddate")
    public void setChangeddate(String changeddate) {
        this.changeddate = changeddate;
    }

    /**
     * 
     * @return
     *     The cnrnumber
     */
    @JsonProperty("cnrnumber")
    public String getCnrnumber() {
        return cnrnumber;
    }

    /**
     * 
     * @param cnrnumber
     *     The cnrnumber
     */
    @JsonProperty("cnrnumber")
    public void setCnrnumber(String cnrnumber) {
        this.cnrnumber = cnrnumber;
    }

    /**
     * 
     * @return
     *     The collectionagreementnumber
     */
    @JsonProperty("collectionagreementnumber")
    public String getCollectionagreementnumber() {
        return collectionagreementnumber;
    }

    /**
     * 
     * @param collectionagreementnumber
     *     The collectionagreementnumber
     */
    @JsonProperty("collectionagreementnumber")
    public void setCollectionagreementnumber(String collectionagreementnumber) {
        this.collectionagreementnumber = collectionagreementnumber;
    }

    /**
     * 
     * @return
     *     The collectioncurrency
     */
    @JsonProperty("collectioncurrency")
    public Integer getCollectioncurrency() {
        return collectioncurrency;
    }

    /**
     * 
     * @param collectioncurrency
     *     The collectioncurrency
     */
    @JsonProperty("collectioncurrency")
    public void setCollectioncurrency(Integer collectioncurrency) {
        this.collectioncurrency = collectioncurrency;
    }

    /**
     * 
     * @return
     *     The collectiongroupnumber
     */
    @JsonProperty("collectiongroupnumber")
    public String getCollectiongroupnumber() {
        return collectiongroupnumber;
    }

    /**
     * 
     * @param collectiongroupnumber
     *     The collectiongroupnumber
     */
    @JsonProperty("collectiongroupnumber")
    public void setCollectiongroupnumber(String collectiongroupnumber) {
        this.collectiongroupnumber = collectiongroupnumber;
    }

    /**
     * 
     * @return
     *     The companycurrency
     */
    @JsonProperty("companycurrency")
    public String getCompanycurrency() {
        return companycurrency;
    }

    /**
     * 
     * @param companycurrency
     *     The companycurrency
     */
    @JsonProperty("companycurrency")
    public void setCompanycurrency(String companycurrency) {
        this.companycurrency = companycurrency;
    }

    /**
     * 
     * @return
     *     The companycustomercustomerlinking
     */
    @JsonProperty("companycustomercustomerlinking")
    public String getCompanycustomercustomerlinking() {
        return companycustomercustomerlinking;
    }

    /**
     * 
     * @param companycustomercustomerlinking
     *     The companycustomercustomerlinking
     */
    @JsonProperty("companycustomercustomerlinking")
    public void setCompanycustomercustomerlinking(String companycustomercustomerlinking) {
        this.companycustomercustomerlinking = companycustomercustomerlinking;
    }

    /**
     * 
     * @return
     *     The companynumber
     */
    @JsonProperty("companynumber")
    public String getCompanynumber() {
        return companynumber;
    }

    /**
     * 
     * @param companynumber
     *     The companynumber
     */
    @JsonProperty("companynumber")
    public void setCompanynumber(String companynumber) {
        this.companynumber = companynumber;
    }

    /**
     * 
     * @return
     *     The companyoforigin
     */
    @JsonProperty("companyoforigin")
    public String getCompanyoforigin() {
        return companyoforigin;
    }

    /**
     * 
     * @param companyoforigin
     *     The companyoforigin
     */
    @JsonProperty("companyoforigin")
    public void setCompanyoforigin(String companyoforigin) {
        this.companyoforigin = companyoforigin;
    }

    /**
     * 
     * @return
     *     The companyregistrationnumber
     */
    @JsonProperty("companyregistrationnumber")
    public String getCompanyregistrationnumber() {
        return companyregistrationnumber;
    }

    /**
     * 
     * @param companyregistrationnumber
     *     The companyregistrationnumber
     */
    @JsonProperty("companyregistrationnumber")
    public void setCompanyregistrationnumber(String companyregistrationnumber) {
        this.companyregistrationnumber = companyregistrationnumber;
    }

    /**
     * 
     * @return
     *     The companyvatcode
     */
    @JsonProperty("companyvatcode")
    public String getCompanyvatcode() {
        return companyvatcode;
    }

    /**
     * 
     * @param companyvatcode
     *     The companyvatcode
     */
    @JsonProperty("companyvatcode")
    public void setCompanyvatcode(String companyvatcode) {
        this.companyvatcode = companyvatcode;
    }

    /**
     * 
     * @return
     *     The contactperson
     */
    @JsonProperty("contactperson")
    public String getContactperson() {
        return contactperson;
    }

    /**
     * 
     * @param contactperson
     *     The contactperson
     */
    @JsonProperty("contactperson")
    public void setContactperson(String contactperson) {
        this.contactperson = contactperson;
    }

    /**
     * 
     * @return
     *     The controlaccountcode
     */
    @JsonProperty("controlaccountcode")
    public String getControlaccountcode() {
        return controlaccountcode;
    }

    /**
     * 
     * @param controlaccountcode
     *     The controlaccountcode
     */
    @JsonProperty("controlaccountcode")
    public void setControlaccountcode(String controlaccountcode) {
        this.controlaccountcode = controlaccountcode;
    }

    /**
     * 
     * @return
     *     The country
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     * 
     * @param country
     *     The country
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 
     * @return
     *     The createdby
     */
    @JsonProperty("createdby")
    public String getCreatedby() {
        return createdby;
    }

    /**
     * 
     * @param createdby
     *     The createdby
     */
    @JsonProperty("createdby")
    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    /**
     * 
     * @return
     *     The createddate
     */
    @JsonProperty("createddate")
    public String getCreateddate() {
        return createddate;
    }

    /**
     * 
     * @param createddate
     *     The createddate
     */
    @JsonProperty("createddate")
    public void setCreateddate(String createddate) {
        this.createddate = createddate;
    }

    /**
     * 
     * @return
     *     The creditbase
     */
    @JsonProperty("creditbase")
    public Integer getCreditbase() {
        return creditbase;
    }

    /**
     * 
     * @param creditbase
     *     The creditbase
     */
    @JsonProperty("creditbase")
    public void setCreditbase(Integer creditbase) {
        this.creditbase = creditbase;
    }

    /**
     * 
     * @return
     *     The creditcardexpirydate
     */
    @JsonProperty("creditcardexpirydate")
    public String getCreditcardexpirydate() {
        return creditcardexpirydate;
    }

    /**
     * 
     * @param creditcardexpirydate
     *     The creditcardexpirydate
     */
    @JsonProperty("creditcardexpirydate")
    public void setCreditcardexpirydate(String creditcardexpirydate) {
        this.creditcardexpirydate = creditcardexpirydate;
    }

    /**
     * 
     * @return
     *     The creditcardnumber
     */
    @JsonProperty("creditcardnumber")
    public String getCreditcardnumber() {
        return creditcardnumber;
    }

    /**
     * 
     * @param creditcardnumber
     *     The creditcardnumber
     */
    @JsonProperty("creditcardnumber")
    public void setCreditcardnumber(String creditcardnumber) {
        this.creditcardnumber = creditcardnumber;
    }

    /**
     * 
     * @return
     *     The creditenterprise
     */
    @JsonProperty("creditenterprise")
    public Integer getCreditenterprise() {
        return creditenterprise;
    }

    /**
     * 
     * @param creditenterprise
     *     The creditenterprise
     */
    @JsonProperty("creditenterprise")
    public void setCreditenterprise(Integer creditenterprise) {
        this.creditenterprise = creditenterprise;
    }

    /**
     * 
     * @return
     *     The creditstandard
     */
    @JsonProperty("creditstandard")
    public Integer getCreditstandard() {
        return creditstandard;
    }

    /**
     * 
     * @param creditstandard
     *     The creditstandard
     */
    @JsonProperty("creditstandard")
    public void setCreditstandard(Integer creditstandard) {
        this.creditstandard = creditstandard;
    }

    /**
     * 
     * @return
     *     The customergroup
     */
    @JsonProperty("customergroup")
    public String getCustomergroup() {
        return customergroup;
    }

    /**
     * 
     * @param customergroup
     *     The customergroup
     */
    @JsonProperty("customergroup")
    public void setCustomergroup(String customergroup) {
        this.customergroup = customergroup;
    }

    /**
     * 
     * @return
     *     The customerpayeridentifcation
     */
    @JsonProperty("customerpayeridentifcation")
    public String getCustomerpayeridentifcation() {
        return customerpayeridentifcation;
    }

    /**
     * 
     * @param customerpayeridentifcation
     *     The customerpayeridentifcation
     */
    @JsonProperty("customerpayeridentifcation")
    public void setCustomerpayeridentifcation(String customerpayeridentifcation) {
        this.customerpayeridentifcation = customerpayeridentifcation;
    }

    /**
     * 
     * @return
     *     The customerpaymentmode
     */
    @JsonProperty("customerpaymentmode")
    public String getCustomerpaymentmode() {
        return customerpaymentmode;
    }

    /**
     * 
     * @param customerpaymentmode
     *     The customerpaymentmode
     */
    @JsonProperty("customerpaymentmode")
    public void setCustomerpaymentmode(String customerpaymentmode) {
        this.customerpaymentmode = customerpaymentmode;
    }

    /**
     * 
     * @return
     *     The customerpaymentreference
     */
    @JsonProperty("customerpaymentreference")
    public String getCustomerpaymentreference() {
        return customerpaymentreference;
    }

    /**
     * 
     * @param customerpaymentreference
     *     The customerpaymentreference
     */
    @JsonProperty("customerpaymentreference")
    public void setCustomerpaymentreference(String customerpaymentreference) {
        this.customerpaymentreference = customerpaymentreference;
    }

    /**
     * 
     * @return
     *     The customerpopup1
     */
    @JsonProperty("customerpopup1")
    public String getCustomerpopup1() {
        return customerpopup1;
    }

    /**
     * 
     * @param customerpopup1
     *     The customerpopup1
     */
    @JsonProperty("customerpopup1")
    public void setCustomerpopup1(String customerpopup1) {
        this.customerpopup1 = customerpopup1;
    }

    /**
     * 
     * @return
     *     The customerpopup2
     */
    @JsonProperty("customerpopup2")
    public String getCustomerpopup2() {
        return customerpopup2;
    }

    /**
     * 
     * @param customerpopup2
     *     The customerpopup2
     */
    @JsonProperty("customerpopup2")
    public void setCustomerpopup2(String customerpopup2) {
        this.customerpopup2 = customerpopup2;
    }

    /**
     * 
     * @return
     *     The customerpopup3
     */
    @JsonProperty("customerpopup3")
    public String getCustomerpopup3() {
        return customerpopup3;
    }

    /**
     * 
     * @param customerpopup3
     *     The customerpopup3
     */
    @JsonProperty("customerpopup3")
    public void setCustomerpopup3(String customerpopup3) {
        this.customerpopup3 = customerpopup3;
    }

    /**
     * 
     * @return
     *     The customerpopup4
     */
    @JsonProperty("customerpopup4")
    public String getCustomerpopup4() {
        return customerpopup4;
    }

    /**
     * 
     * @param customerpopup4
     *     The customerpopup4
     */
    @JsonProperty("customerpopup4")
    public void setCustomerpopup4(String customerpopup4) {
        this.customerpopup4 = customerpopup4;
    }

    /**
     * 
     * @return
     *     The customerpopup5
     */
    @JsonProperty("customerpopup5")
    public String getCustomerpopup5() {
        return customerpopup5;
    }

    /**
     * 
     * @param customerpopup5
     *     The customerpopup5
     */
    @JsonProperty("customerpopup5")
    public void setCustomerpopup5(String customerpopup5) {
        this.customerpopup5 = customerpopup5;
    }

    /**
     * 
     * @return
     *     The customerremark
     */
    @JsonProperty("customerremark")
    public String getCustomerremark() {
        return customerremark;
    }

    /**
     * 
     * @param customerremark
     *     The customerremark
     */
    @JsonProperty("customerremark")
    public void setCustomerremark(String customerremark) {
        this.customerremark = customerremark;
    }

    /**
     * 
     * @return
     *     The customerremark1
     */
    @JsonProperty("customerremark1")
    public String getCustomerremark1() {
        return customerremark1;
    }

    /**
     * 
     * @param customerremark1
     *     The customerremark1
     */
    @JsonProperty("customerremark1")
    public void setCustomerremark1(String customerremark1) {
        this.customerremark1 = customerremark1;
    }

    /**
     * 
     * @return
     *     The customerremark10
     */
    @JsonProperty("customerremark10")
    public String getCustomerremark10() {
        return customerremark10;
    }

    /**
     * 
     * @param customerremark10
     *     The customerremark10
     */
    @JsonProperty("customerremark10")
    public void setCustomerremark10(String customerremark10) {
        this.customerremark10 = customerremark10;
    }

    /**
     * 
     * @return
     *     The customerremark2
     */
    @JsonProperty("customerremark2")
    public String getCustomerremark2() {
        return customerremark2;
    }

    /**
     * 
     * @param customerremark2
     *     The customerremark2
     */
    @JsonProperty("customerremark2")
    public void setCustomerremark2(String customerremark2) {
        this.customerremark2 = customerremark2;
    }

    /**
     * 
     * @return
     *     The customerremark3
     */
    @JsonProperty("customerremark3")
    public String getCustomerremark3() {
        return customerremark3;
    }

    /**
     * 
     * @param customerremark3
     *     The customerremark3
     */
    @JsonProperty("customerremark3")
    public void setCustomerremark3(String customerremark3) {
        this.customerremark3 = customerremark3;
    }

    /**
     * 
     * @return
     *     The customerremark4
     */
    @JsonProperty("customerremark4")
    public String getCustomerremark4() {
        return customerremark4;
    }

    /**
     * 
     * @param customerremark4
     *     The customerremark4
     */
    @JsonProperty("customerremark4")
    public void setCustomerremark4(String customerremark4) {
        this.customerremark4 = customerremark4;
    }

    /**
     * 
     * @return
     *     The customerremark5
     */
    @JsonProperty("customerremark5")
    public String getCustomerremark5() {
        return customerremark5;
    }

    /**
     * 
     * @param customerremark5
     *     The customerremark5
     */
    @JsonProperty("customerremark5")
    public void setCustomerremark5(String customerremark5) {
        this.customerremark5 = customerremark5;
    }

    /**
     * 
     * @return
     *     The customerremark6
     */
    @JsonProperty("customerremark6")
    public String getCustomerremark6() {
        return customerremark6;
    }

    /**
     * 
     * @param customerremark6
     *     The customerremark6
     */
    @JsonProperty("customerremark6")
    public void setCustomerremark6(String customerremark6) {
        this.customerremark6 = customerremark6;
    }

    /**
     * 
     * @return
     *     The customerremark7
     */
    @JsonProperty("customerremark7")
    public String getCustomerremark7() {
        return customerremark7;
    }

    /**
     * 
     * @param customerremark7
     *     The customerremark7
     */
    @JsonProperty("customerremark7")
    public void setCustomerremark7(String customerremark7) {
        this.customerremark7 = customerremark7;
    }

    /**
     * 
     * @return
     *     The customerremark8
     */
    @JsonProperty("customerremark8")
    public String getCustomerremark8() {
        return customerremark8;
    }

    /**
     * 
     * @param customerremark8
     *     The customerremark8
     */
    @JsonProperty("customerremark8")
    public void setCustomerremark8(String customerremark8) {
        this.customerremark8 = customerremark8;
    }

    /**
     * 
     * @return
     *     The customerremark9
     */
    @JsonProperty("customerremark9")
    public String getCustomerremark9() {
        return customerremark9;
    }

    /**
     * 
     * @param customerremark9
     *     The customerremark9
     */
    @JsonProperty("customerremark9")
    public void setCustomerremark9(String customerremark9) {
        this.customerremark9 = customerremark9;
    }

    /**
     * 
     * @return
     *     The customerreminderlevel
     */
    @JsonProperty("customerreminderlevel")
    public Integer getCustomerreminderlevel() {
        return customerreminderlevel;
    }

    /**
     * 
     * @param customerreminderlevel
     *     The customerreminderlevel
     */
    @JsonProperty("customerreminderlevel")
    public void setCustomerreminderlevel(Integer customerreminderlevel) {
        this.customerreminderlevel = customerreminderlevel;
    }

    /**
     * 
     * @return
     *     The customertype
     */
    @JsonProperty("customertype")
    public String getCustomertype() {
        return customertype;
    }

    /**
     * 
     * @param customertype
     *     The customertype
     */
    @JsonProperty("customertype")
    public void setCustomertype(String customertype) {
        this.customertype = customertype;
    }

    /**
     * 
     * @return
     *     The debitbase
     */
    @JsonProperty("debitbase")
    public Integer getDebitbase() {
        return debitbase;
    }

    /**
     * 
     * @param debitbase
     *     The debitbase
     */
    @JsonProperty("debitbase")
    public void setDebitbase(Integer debitbase) {
        this.debitbase = debitbase;
    }

    /**
     * 
     * @return
     *     The debitenterprise
     */
    @JsonProperty("debitenterprise")
    public Integer getDebitenterprise() {
        return debitenterprise;
    }

    /**
     * 
     * @param debitenterprise
     *     The debitenterprise
     */
    @JsonProperty("debitenterprise")
    public void setDebitenterprise(Integer debitenterprise) {
        this.debitenterprise = debitenterprise;
    }

    /**
     * 
     * @return
     *     The debitstandard
     */
    @JsonProperty("debitstandard")
    public Integer getDebitstandard() {
        return debitstandard;
    }

    /**
     * 
     * @param debitstandard
     *     The debitstandard
     */
    @JsonProperty("debitstandard")
    public void setDebitstandard(Integer debitstandard) {
        this.debitstandard = debitstandard;
    }

    /**
     * 
     * @return
     *     The departmentnumber
     */
    @JsonProperty("departmentnumber")
    public String getDepartmentnumber() {
        return departmentnumber;
    }

    /**
     * 
     * @param departmentnumber
     *     The departmentnumber
     */
    @JsonProperty("departmentnumber")
    public void setDepartmentnumber(String departmentnumber) {
        this.departmentnumber = departmentnumber;
    }

    /**
     * 
     * @return
     *     The derivedcompanynumber
     */
    @JsonProperty("derivedcompanynumber")
    public String getDerivedcompanynumber() {
        return derivedcompanynumber;
    }

    /**
     * 
     * @param derivedcompanynumber
     *     The derivedcompanynumber
     */
    @JsonProperty("derivedcompanynumber")
    public void setDerivedcompanynumber(String derivedcompanynumber) {
        this.derivedcompanynumber = derivedcompanynumber;
    }

    /**
     * 
     * @return
     *     The derivedentityname
     */
    @JsonProperty("derivedentityname")
    public String getDerivedentityname() {
        return derivedentityname;
    }

    /**
     * 
     * @param derivedentityname
     *     The derivedentityname
     */
    @JsonProperty("derivedentityname")
    public void setDerivedentityname(String derivedentityname) {
        this.derivedentityname = derivedentityname;
    }

    /**
     * 
     * @return
     *     The derivedlocalspec10name
     */
    @JsonProperty("derivedlocalspec10name")
    public String getDerivedlocalspec10name() {
        return derivedlocalspec10name;
    }

    /**
     * 
     * @param derivedlocalspec10name
     *     The derivedlocalspec10name
     */
    @JsonProperty("derivedlocalspec10name")
    public void setDerivedlocalspec10name(String derivedlocalspec10name) {
        this.derivedlocalspec10name = derivedlocalspec10name;
    }

    /**
     * 
     * @return
     *     The derivedlocalspec1name
     */
    @JsonProperty("derivedlocalspec1name")
    public String getDerivedlocalspec1name() {
        return derivedlocalspec1name;
    }

    /**
     * 
     * @param derivedlocalspec1name
     *     The derivedlocalspec1name
     */
    @JsonProperty("derivedlocalspec1name")
    public void setDerivedlocalspec1name(String derivedlocalspec1name) {
        this.derivedlocalspec1name = derivedlocalspec1name;
    }

    /**
     * 
     * @return
     *     The derivedlocalspec2name
     */
    @JsonProperty("derivedlocalspec2name")
    public String getDerivedlocalspec2name() {
        return derivedlocalspec2name;
    }

    /**
     * 
     * @param derivedlocalspec2name
     *     The derivedlocalspec2name
     */
    @JsonProperty("derivedlocalspec2name")
    public void setDerivedlocalspec2name(String derivedlocalspec2name) {
        this.derivedlocalspec2name = derivedlocalspec2name;
    }

    /**
     * 
     * @return
     *     The derivedlocalspec3name
     */
    @JsonProperty("derivedlocalspec3name")
    public String getDerivedlocalspec3name() {
        return derivedlocalspec3name;
    }

    /**
     * 
     * @param derivedlocalspec3name
     *     The derivedlocalspec3name
     */
    @JsonProperty("derivedlocalspec3name")
    public void setDerivedlocalspec3name(String derivedlocalspec3name) {
        this.derivedlocalspec3name = derivedlocalspec3name;
    }

    /**
     * 
     * @return
     *     The derivedlocalspec4name
     */
    @JsonProperty("derivedlocalspec4name")
    public String getDerivedlocalspec4name() {
        return derivedlocalspec4name;
    }

    /**
     * 
     * @param derivedlocalspec4name
     *     The derivedlocalspec4name
     */
    @JsonProperty("derivedlocalspec4name")
    public void setDerivedlocalspec4name(String derivedlocalspec4name) {
        this.derivedlocalspec4name = derivedlocalspec4name;
    }

    /**
     * 
     * @return
     *     The derivedlocalspec5name
     */
    @JsonProperty("derivedlocalspec5name")
    public String getDerivedlocalspec5name() {
        return derivedlocalspec5name;
    }

    /**
     * 
     * @param derivedlocalspec5name
     *     The derivedlocalspec5name
     */
    @JsonProperty("derivedlocalspec5name")
    public void setDerivedlocalspec5name(String derivedlocalspec5name) {
        this.derivedlocalspec5name = derivedlocalspec5name;
    }

    /**
     * 
     * @return
     *     The derivedlocalspec6name
     */
    @JsonProperty("derivedlocalspec6name")
    public String getDerivedlocalspec6name() {
        return derivedlocalspec6name;
    }

    /**
     * 
     * @param derivedlocalspec6name
     *     The derivedlocalspec6name
     */
    @JsonProperty("derivedlocalspec6name")
    public void setDerivedlocalspec6name(String derivedlocalspec6name) {
        this.derivedlocalspec6name = derivedlocalspec6name;
    }

    /**
     * 
     * @return
     *     The derivedlocalspec7name
     */
    @JsonProperty("derivedlocalspec7name")
    public String getDerivedlocalspec7name() {
        return derivedlocalspec7name;
    }

    /**
     * 
     * @param derivedlocalspec7name
     *     The derivedlocalspec7name
     */
    @JsonProperty("derivedlocalspec7name")
    public void setDerivedlocalspec7name(String derivedlocalspec7name) {
        this.derivedlocalspec7name = derivedlocalspec7name;
    }

    /**
     * 
     * @return
     *     The derivedlocalspec8name
     */
    @JsonProperty("derivedlocalspec8name")
    public String getDerivedlocalspec8name() {
        return derivedlocalspec8name;
    }

    /**
     * 
     * @param derivedlocalspec8name
     *     The derivedlocalspec8name
     */
    @JsonProperty("derivedlocalspec8name")
    public void setDerivedlocalspec8name(String derivedlocalspec8name) {
        this.derivedlocalspec8name = derivedlocalspec8name;
    }

    /**
     * 
     * @return
     *     The derivedlocalspec9name
     */
    @JsonProperty("derivedlocalspec9name")
    public String getDerivedlocalspec9name() {
        return derivedlocalspec9name;
    }

    /**
     * 
     * @param derivedlocalspec9name
     *     The derivedlocalspec9name
     */
    @JsonProperty("derivedlocalspec9name")
    public void setDerivedlocalspec9name(String derivedlocalspec9name) {
        this.derivedlocalspec9name = derivedlocalspec9name;
    }

    /**
     * 
     * @return
     *     The derivedlocationname
     */
    @JsonProperty("derivedlocationname")
    public String getDerivedlocationname() {
        return derivedlocationname;
    }

    /**
     * 
     * @param derivedlocationname
     *     The derivedlocationname
     */
    @JsonProperty("derivedlocationname")
    public void setDerivedlocationname(String derivedlocationname) {
        this.derivedlocationname = derivedlocationname;
    }

    /**
     * 
     * @return
     *     The derivedprojectname
     */
    @JsonProperty("derivedprojectname")
    public String getDerivedprojectname() {
        return derivedprojectname;
    }

    /**
     * 
     * @param derivedprojectname
     *     The derivedprojectname
     */
    @JsonProperty("derivedprojectname")
    public void setDerivedprojectname(String derivedprojectname) {
        this.derivedprojectname = derivedprojectname;
    }

    /**
     * 
     * @return
     *     The derivedpurposename
     */
    @JsonProperty("derivedpurposename")
    public String getDerivedpurposename() {
        return derivedpurposename;
    }

    /**
     * 
     * @param derivedpurposename
     *     The derivedpurposename
     */
    @JsonProperty("derivedpurposename")
    public void setDerivedpurposename(String derivedpurposename) {
        this.derivedpurposename = derivedpurposename;
    }

    /**
     * 
     * @return
     *     The derivedspec10name
     */
    @JsonProperty("derivedspec10name")
    public String getDerivedspec10name() {
        return derivedspec10name;
    }

    /**
     * 
     * @param derivedspec10name
     *     The derivedspec10name
     */
    @JsonProperty("derivedspec10name")
    public void setDerivedspec10name(String derivedspec10name) {
        this.derivedspec10name = derivedspec10name;
    }

    /**
     * 
     * @return
     *     The derivedspec1name
     */
    @JsonProperty("derivedspec1name")
    public String getDerivedspec1name() {
        return derivedspec1name;
    }

    /**
     * 
     * @param derivedspec1name
     *     The derivedspec1name
     */
    @JsonProperty("derivedspec1name")
    public void setDerivedspec1name(String derivedspec1name) {
        this.derivedspec1name = derivedspec1name;
    }

    /**
     * 
     * @return
     *     The derivedspec2name
     */
    @JsonProperty("derivedspec2name")
    public String getDerivedspec2name() {
        return derivedspec2name;
    }

    /**
     * 
     * @param derivedspec2name
     *     The derivedspec2name
     */
    @JsonProperty("derivedspec2name")
    public void setDerivedspec2name(String derivedspec2name) {
        this.derivedspec2name = derivedspec2name;
    }

    /**
     * 
     * @return
     *     The derivedspec3name
     */
    @JsonProperty("derivedspec3name")
    public String getDerivedspec3name() {
        return derivedspec3name;
    }

    /**
     * 
     * @param derivedspec3name
     *     The derivedspec3name
     */
    @JsonProperty("derivedspec3name")
    public void setDerivedspec3name(String derivedspec3name) {
        this.derivedspec3name = derivedspec3name;
    }

    /**
     * 
     * @return
     *     The derivedspec4name
     */
    @JsonProperty("derivedspec4name")
    public String getDerivedspec4name() {
        return derivedspec4name;
    }

    /**
     * 
     * @param derivedspec4name
     *     The derivedspec4name
     */
    @JsonProperty("derivedspec4name")
    public void setDerivedspec4name(String derivedspec4name) {
        this.derivedspec4name = derivedspec4name;
    }

    /**
     * 
     * @return
     *     The derivedspec5name
     */
    @JsonProperty("derivedspec5name")
    public String getDerivedspec5name() {
        return derivedspec5name;
    }

    /**
     * 
     * @param derivedspec5name
     *     The derivedspec5name
     */
    @JsonProperty("derivedspec5name")
    public void setDerivedspec5name(String derivedspec5name) {
        this.derivedspec5name = derivedspec5name;
    }

    /**
     * 
     * @return
     *     The derivedspec6name
     */
    @JsonProperty("derivedspec6name")
    public String getDerivedspec6name() {
        return derivedspec6name;
    }

    /**
     * 
     * @param derivedspec6name
     *     The derivedspec6name
     */
    @JsonProperty("derivedspec6name")
    public void setDerivedspec6name(String derivedspec6name) {
        this.derivedspec6name = derivedspec6name;
    }

    /**
     * 
     * @return
     *     The derivedspec7name
     */
    @JsonProperty("derivedspec7name")
    public String getDerivedspec7name() {
        return derivedspec7name;
    }

    /**
     * 
     * @param derivedspec7name
     *     The derivedspec7name
     */
    @JsonProperty("derivedspec7name")
    public void setDerivedspec7name(String derivedspec7name) {
        this.derivedspec7name = derivedspec7name;
    }

    /**
     * 
     * @return
     *     The derivedspec8name
     */
    @JsonProperty("derivedspec8name")
    public String getDerivedspec8name() {
        return derivedspec8name;
    }

    /**
     * 
     * @param derivedspec8name
     *     The derivedspec8name
     */
    @JsonProperty("derivedspec8name")
    public void setDerivedspec8name(String derivedspec8name) {
        this.derivedspec8name = derivedspec8name;
    }

    /**
     * 
     * @return
     *     The derivedspec9name
     */
    @JsonProperty("derivedspec9name")
    public String getDerivedspec9name() {
        return derivedspec9name;
    }

    /**
     * 
     * @param derivedspec9name
     *     The derivedspec9name
     */
    @JsonProperty("derivedspec9name")
    public void setDerivedspec9name(String derivedspec9name) {
        this.derivedspec9name = derivedspec9name;
    }

    /**
     * 
     * @return
     *     The dimensioncombnumber
     */
    @JsonProperty("dimensioncombnumber")
    public String getDimensioncombnumber() {
        return dimensioncombnumber;
    }

    /**
     * 
     * @param dimensioncombnumber
     *     The dimensioncombnumber
     */
    @JsonProperty("dimensioncombnumber")
    public void setDimensioncombnumber(String dimensioncombnumber) {
        this.dimensioncombnumber = dimensioncombnumber;
    }

    /**
     * 
     * @return
     *     The documentarchivenumber
     */
    @JsonProperty("documentarchivenumber")
    public String getDocumentarchivenumber() {
        return documentarchivenumber;
    }

    /**
     * 
     * @param documentarchivenumber
     *     The documentarchivenumber
     */
    @JsonProperty("documentarchivenumber")
    public void setDocumentarchivenumber(String documentarchivenumber) {
        this.documentarchivenumber = documentarchivenumber;
    }

    /**
     * 
     * @return
     *     The duedate
     */
    @JsonProperty("duedate")
    public String getDuedate() {
        return duedate;
    }

    /**
     * 
     * @param duedate
     *     The duedate
     */
    @JsonProperty("duedate")
    public void setDuedate(String duedate) {
        this.duedate = duedate;
    }

    /**
     * 
     * @return
     *     The electroniccollection
     */
    @JsonProperty("electroniccollection")
    public Boolean getElectroniccollection() {
        return electroniccollection;
    }

    /**
     * 
     * @param electroniccollection
     *     The electroniccollection
     */
    @JsonProperty("electroniccollection")
    public void setElectroniccollection(Boolean electroniccollection) {
        this.electroniccollection = electroniccollection;
    }

    /**
     * 
     * @return
     *     The electronicmailaddress
     */
    @JsonProperty("electronicmailaddress")
    public String getElectronicmailaddress() {
        return electronicmailaddress;
    }

    /**
     * 
     * @param electronicmailaddress
     *     The electronicmailaddress
     */
    @JsonProperty("electronicmailaddress")
    public void setElectronicmailaddress(String electronicmailaddress) {
        this.electronicmailaddress = electronicmailaddress;
    }

    /**
     * 
     * @return
     *     The enterprise
     */
    @JsonProperty("enterprise")
    public String getEnterprise() {
        return enterprise;
    }

    /**
     * 
     * @param enterprise
     *     The enterprise
     */
    @JsonProperty("enterprise")
    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise;
    }

    /**
     * 
     * @return
     *     The entityname
     */
    @JsonProperty("entityname")
    public String getEntityname() {
        return entityname;
    }

    /**
     * 
     * @param entityname
     *     The entityname
     */
    @JsonProperty("entityname")
    public void setEntityname(String entityname) {
        this.entityname = entityname;
    }

    /**
     * 
     * @return
     *     The entrycurrency
     */
    @JsonProperty("entrycurrency")
    public String getEntrycurrency() {
        return entrycurrency;
    }

    /**
     * 
     * @param entrycurrency
     *     The entrycurrency
     */
    @JsonProperty("entrycurrency")
    public void setEntrycurrency(String entrycurrency) {
        this.entrycurrency = entrycurrency;
    }

    /**
     * 
     * @return
     *     The entrydate
     */
    @JsonProperty("entrydate")
    public String getEntrydate() {
        return entrydate;
    }

    /**
     * 
     * @param entrydate
     *     The entrydate
     */
    @JsonProperty("entrydate")
    public void setEntrydate(String entrydate) {
        this.entrydate = entrydate;
    }

    /**
     * 
     * @return
     *     The entryreconciliationdate
     */
    @JsonProperty("entryreconciliationdate")
    public String getEntryreconciliationdate() {
        return entryreconciliationdate;
    }

    /**
     * 
     * @param entryreconciliationdate
     *     The entryreconciliationdate
     */
    @JsonProperty("entryreconciliationdate")
    public void setEntryreconciliationdate(String entryreconciliationdate) {
        this.entryreconciliationdate = entryreconciliationdate;
    }

    /**
     * 
     * @return
     *     The entrytext
     */
    @JsonProperty("entrytext")
    public String getEntrytext() {
        return entrytext;
    }

    /**
     * 
     * @param entrytext
     *     The entrytext
     */
    @JsonProperty("entrytext")
    public void setEntrytext(String entrytext) {
        this.entrytext = entrytext;
    }

    /**
     * 
     * @return
     *     The entrytype
     */
    @JsonProperty("entrytype")
    public String getEntrytype() {
        return entrytype;
    }

    /**
     * 
     * @param entrytype
     *     The entrytype
     */
    @JsonProperty("entrytype")
    public void setEntrytype(String entrytype) {
        this.entrytype = entrytype;
    }

    /**
     * 
     * @return
     *     The exported
     */
    @JsonProperty("exported")
    public Boolean getExported() {
        return exported;
    }

    /**
     * 
     * @param exported
     *     The exported
     */
    @JsonProperty("exported")
    public void setExported(Boolean exported) {
        this.exported = exported;
    }

    /**
     * 
     * @return
     *     The exportentry
     */
    @JsonProperty("exportentry")
    public Boolean getExportentry() {
        return exportentry;
    }

    /**
     * 
     * @param exportentry
     *     The exportentry
     */
    @JsonProperty("exportentry")
    public void setExportentry(Boolean exportentry) {
        this.exportentry = exportentry;
    }

    /**
     * 
     * @return
     *     The giro
     */
    @JsonProperty("giro")
    public String getGiro() {
        return giro;
    }

    /**
     * 
     * @param giro
     *     The giro
     */
    @JsonProperty("giro")
    public void setGiro(String giro) {
        this.giro = giro;
    }

    /**
     * 
     * @return
     *     The globallocationnumber
     */
    @JsonProperty("globallocationnumber")
    public String getGloballocationnumber() {
        return globallocationnumber;
    }

    /**
     * 
     * @param globallocationnumber
     *     The globallocationnumber
     */
    @JsonProperty("globallocationnumber")
    public void setGloballocationnumber(String globallocationnumber) {
        this.globallocationnumber = globallocationnumber;
    }

    /**
     * 
     * @return
     *     The holidaycalendarname
     */
    @JsonProperty("holidaycalendarname")
    public String getHolidaycalendarname() {
        return holidaycalendarname;
    }

    /**
     * 
     * @param holidaycalendarname
     *     The holidaycalendarname
     */
    @JsonProperty("holidaycalendarname")
    public void setHolidaycalendarname(String holidaycalendarname) {
        this.holidaycalendarname = holidaycalendarname;
    }

    /**
     * 
     * @return
     *     The interestapprovaldate
     */
    @JsonProperty("interestapprovaldate")
    public String getInterestapprovaldate() {
        return interestapprovaldate;
    }

    /**
     * 
     * @param interestapprovaldate
     *     The interestapprovaldate
     */
    @JsonProperty("interestapprovaldate")
    public void setInterestapprovaldate(String interestapprovaldate) {
        this.interestapprovaldate = interestapprovaldate;
    }

    /**
     * 
     * @return
     *     The interestdate
     */
    @JsonProperty("interestdate")
    public String getInterestdate() {
        return interestdate;
    }

    /**
     * 
     * @param interestdate
     *     The interestdate
     */
    @JsonProperty("interestdate")
    public void setInterestdate(String interestdate) {
        this.interestdate = interestdate;
    }

    /**
     * 
     * @return
     *     The interestreminderblock
     */
    @JsonProperty("interestreminderblock")
    public String getInterestreminderblock() {
        return interestreminderblock;
    }

    /**
     * 
     * @param interestreminderblock
     *     The interestreminderblock
     */
    @JsonProperty("interestreminderblock")
    public void setInterestreminderblock(String interestreminderblock) {
        this.interestreminderblock = interestreminderblock;
    }

    /**
     * 
     * @return
     *     The interestreminderblockdate
     */
    @JsonProperty("interestreminderblockdate")
    public String getInterestreminderblockdate() {
        return interestreminderblockdate;
    }

    /**
     * 
     * @param interestreminderblockdate
     *     The interestreminderblockdate
     */
    @JsonProperty("interestreminderblockdate")
    public void setInterestreminderblockdate(String interestreminderblockdate) {
        this.interestreminderblockdate = interestreminderblockdate;
    }

    /**
     * 
     * @return
     *     The interestreminderblockedby
     */
    @JsonProperty("interestreminderblockedby")
    public String getInterestreminderblockedby() {
        return interestreminderblockedby;
    }

    /**
     * 
     * @param interestreminderblockedby
     *     The interestreminderblockedby
     */
    @JsonProperty("interestreminderblockedby")
    public void setInterestreminderblockedby(String interestreminderblockedby) {
        this.interestreminderblockedby = interestreminderblockedby;
    }

    /**
     * 
     * @return
     *     The interestreminderprinciple
     */
    @JsonProperty("interestreminderprinciple")
    public String getInterestreminderprinciple() {
        return interestreminderprinciple;
    }

    /**
     * 
     * @param interestreminderprinciple
     *     The interestreminderprinciple
     */
    @JsonProperty("interestreminderprinciple")
    public void setInterestreminderprinciple(String interestreminderprinciple) {
        this.interestreminderprinciple = interestreminderprinciple;
    }

    /**
     * 
     * @return
     *     The interestsum
     */
    @JsonProperty("interestsum")
    public Integer getInterestsum() {
        return interestsum;
    }

    /**
     * 
     * @param interestsum
     *     The interestsum
     */
    @JsonProperty("interestsum")
    public void setInterestsum(Integer interestsum) {
        this.interestsum = interestsum;
    }

    /**
     * 
     * @return
     *     The invoicedate
     */
    @JsonProperty("invoicedate")
    public String getInvoicedate() {
        return invoicedate;
    }

    /**
     * 
     * @param invoicedate
     *     The invoicedate
     */
    @JsonProperty("invoicedate")
    public void setInvoicedate(String invoicedate) {
        this.invoicedate = invoicedate;
    }

    /**
     * 
     * @return
     *     The invoicename
     */
    @JsonProperty("invoicename")
    public String getInvoicename() {
        return invoicename;
    }

    /**
     * 
     * @param invoicename
     *     The invoicename
     */
    @JsonProperty("invoicename")
    public void setInvoicename(String invoicename) {
        this.invoicename = invoicename;
    }

    /**
     * 
     * @return
     *     The jobnumber
     */
    @JsonProperty("jobnumber")
    public String getJobnumber() {
        return jobnumber;
    }

    /**
     * 
     * @param jobnumber
     *     The jobnumber
     */
    @JsonProperty("jobnumber")
    public void setJobnumber(String jobnumber) {
        this.jobnumber = jobnumber;
    }

    /**
     * 
     * @return
     *     The journallinenumber
     */
    @JsonProperty("journallinenumber")
    public Integer getJournallinenumber() {
        return journallinenumber;
    }

    /**
     * 
     * @param journallinenumber
     *     The journallinenumber
     */
    @JsonProperty("journallinenumber")
    public void setJournallinenumber(Integer journallinenumber) {
        this.journallinenumber = journallinenumber;
    }

    /**
     * 
     * @return
     *     The journalnumber
     */
    @JsonProperty("journalnumber")
    public String getJournalnumber() {
        return journalnumber;
    }

    /**
     * 
     * @param journalnumber
     *     The journalnumber
     */
    @JsonProperty("journalnumber")
    public void setJournalnumber(String journalnumber) {
        this.journalnumber = journalnumber;
    }

    /**
     * 
     * @return
     *     The language
     */
    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    /**
     * 
     * @param language
     *     The language
     */
    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * 
     * @return
     *     The linkingrulename
     */
    @JsonProperty("linkingrulename")
    public String getLinkingrulename() {
        return linkingrulename;
    }

    /**
     * 
     * @param linkingrulename
     *     The linkingrulename
     */
    @JsonProperty("linkingrulename")
    public void setLinkingrulename(String linkingrulename) {
        this.linkingrulename = linkingrulename;
    }

    /**
     * 
     * @return
     *     The localspec10name
     */
    @JsonProperty("localspec10name")
    public String getLocalspec10name() {
        return localspec10name;
    }

    /**
     * 
     * @param localspec10name
     *     The localspec10name
     */
    @JsonProperty("localspec10name")
    public void setLocalspec10name(String localspec10name) {
        this.localspec10name = localspec10name;
    }

    /**
     * 
     * @return
     *     The localspec1name
     */
    @JsonProperty("localspec1name")
    public String getLocalspec1name() {
        return localspec1name;
    }

    /**
     * 
     * @param localspec1name
     *     The localspec1name
     */
    @JsonProperty("localspec1name")
    public void setLocalspec1name(String localspec1name) {
        this.localspec1name = localspec1name;
    }

    /**
     * 
     * @return
     *     The localspec2name
     */
    @JsonProperty("localspec2name")
    public String getLocalspec2name() {
        return localspec2name;
    }

    /**
     * 
     * @param localspec2name
     *     The localspec2name
     */
    @JsonProperty("localspec2name")
    public void setLocalspec2name(String localspec2name) {
        this.localspec2name = localspec2name;
    }

    /**
     * 
     * @return
     *     The localspec3name
     */
    @JsonProperty("localspec3name")
    public String getLocalspec3name() {
        return localspec3name;
    }

    /**
     * 
     * @param localspec3name
     *     The localspec3name
     */
    @JsonProperty("localspec3name")
    public void setLocalspec3name(String localspec3name) {
        this.localspec3name = localspec3name;
    }

    /**
     * 
     * @return
     *     The localspec4name
     */
    @JsonProperty("localspec4name")
    public String getLocalspec4name() {
        return localspec4name;
    }

    /**
     * 
     * @param localspec4name
     *     The localspec4name
     */
    @JsonProperty("localspec4name")
    public void setLocalspec4name(String localspec4name) {
        this.localspec4name = localspec4name;
    }

    /**
     * 
     * @return
     *     The localspec5name
     */
    @JsonProperty("localspec5name")
    public String getLocalspec5name() {
        return localspec5name;
    }

    /**
     * 
     * @param localspec5name
     *     The localspec5name
     */
    @JsonProperty("localspec5name")
    public void setLocalspec5name(String localspec5name) {
        this.localspec5name = localspec5name;
    }

    /**
     * 
     * @return
     *     The localspec6name
     */
    @JsonProperty("localspec6name")
    public String getLocalspec6name() {
        return localspec6name;
    }

    /**
     * 
     * @param localspec6name
     *     The localspec6name
     */
    @JsonProperty("localspec6name")
    public void setLocalspec6name(String localspec6name) {
        this.localspec6name = localspec6name;
    }

    /**
     * 
     * @return
     *     The localspec7name
     */
    @JsonProperty("localspec7name")
    public String getLocalspec7name() {
        return localspec7name;
    }

    /**
     * 
     * @param localspec7name
     *     The localspec7name
     */
    @JsonProperty("localspec7name")
    public void setLocalspec7name(String localspec7name) {
        this.localspec7name = localspec7name;
    }

    /**
     * 
     * @return
     *     The localspec8name
     */
    @JsonProperty("localspec8name")
    public String getLocalspec8name() {
        return localspec8name;
    }

    /**
     * 
     * @param localspec8name
     *     The localspec8name
     */
    @JsonProperty("localspec8name")
    public void setLocalspec8name(String localspec8name) {
        this.localspec8name = localspec8name;
    }

    /**
     * 
     * @return
     *     The localspec9name
     */
    @JsonProperty("localspec9name")
    public String getLocalspec9name() {
        return localspec9name;
    }

    /**
     * 
     * @param localspec9name
     *     The localspec9name
     */
    @JsonProperty("localspec9name")
    public void setLocalspec9name(String localspec9name) {
        this.localspec9name = localspec9name;
    }

    /**
     * 
     * @return
     *     The locationname
     */
    @JsonProperty("locationname")
    public String getLocationname() {
        return locationname;
    }

    /**
     * 
     * @param locationname
     *     The locationname
     */
    @JsonProperty("locationname")
    public void setLocationname(String locationname) {
        this.locationname = locationname;
    }

    /**
     * 
     * @return
     *     The name1
     */
    @JsonProperty("name1")
    public String getName1() {
        return name1;
    }

    /**
     * 
     * @param name1
     *     The name1
     */
    @JsonProperty("name1")
    public void setName1(String name1) {
        this.name1 = name1;
    }

    /**
     * 
     * @return
     *     The name2
     */
    @JsonProperty("name2")
    public String getName2() {
        return name2;
    }

    /**
     * 
     * @param name2
     *     The name2
     */
    @JsonProperty("name2")
    public void setName2(String name2) {
        this.name2 = name2;
    }

    /**
     * 
     * @return
     *     The name3
     */
    @JsonProperty("name3")
    public String getName3() {
        return name3;
    }

    /**
     * 
     * @param name3
     *     The name3
     */
    @JsonProperty("name3")
    public void setName3(String name3) {
        this.name3 = name3;
    }

    /**
     * 
     * @return
     *     The name4
     */
    @JsonProperty("name4")
    public String getName4() {
        return name4;
    }

    /**
     * 
     * @param name4
     *     The name4
     */
    @JsonProperty("name4")
    public void setName4(String name4) {
        this.name4 = name4;
    }

    /**
     * 
     * @return
     *     The name5
     */
    @JsonProperty("name5")
    public String getName5() {
        return name5;
    }

    /**
     * 
     * @param name5
     *     The name5
     */
    @JsonProperty("name5")
    public void setName5(String name5) {
        this.name5 = name5;
    }

    /**
     * 
     * @return
     *     The openclosed
     */
    @JsonProperty("openclosed")
    public String getOpenclosed() {
        return openclosed;
    }

    /**
     * 
     * @param openclosed
     *     The openclosed
     */
    @JsonProperty("openclosed")
    public void setOpenclosed(String openclosed) {
        this.openclosed = openclosed;
    }

    /**
     * 
     * @return
     *     The originalamount
     */
    @JsonProperty("originalamount")
    public Integer getOriginalamount() {
        return originalamount;
    }

    /**
     * 
     * @param originalamount
     *     The originalamount
     */
    @JsonProperty("originalamount")
    public void setOriginalamount(Integer originalamount) {
        this.originalamount = originalamount;
    }

    /**
     * 
     * @return
     *     The originalcurrency
     */
    @JsonProperty("originalcurrency")
    public String getOriginalcurrency() {
        return originalcurrency;
    }

    /**
     * 
     * @param originalcurrency
     *     The originalcurrency
     */
    @JsonProperty("originalcurrency")
    public void setOriginalcurrency(String originalcurrency) {
        this.originalcurrency = originalcurrency;
    }

    /**
     * 
     * @return
     *     The originalduedate
     */
    @JsonProperty("originalduedate")
    public String getOriginalduedate() {
        return originalduedate;
    }

    /**
     * 
     * @param originalduedate
     *     The originalduedate
     */
    @JsonProperty("originalduedate")
    public void setOriginalduedate(String originalduedate) {
        this.originalduedate = originalduedate;
    }

    /**
     * 
     * @return
     *     The originline
     */
    @JsonProperty("originline")
    public String getOriginline() {
        return originline;
    }

    /**
     * 
     * @param originline
     *     The originline
     */
    @JsonProperty("originline")
    public void setOriginline(String originline) {
        this.originline = originline;
    }

    /**
     * 
     * @return
     *     The originlineinstancekey
     */
    @JsonProperty("originlineinstancekey")
    public String getOriginlineinstancekey() {
        return originlineinstancekey;
    }

    /**
     * 
     * @param originlineinstancekey
     *     The originlineinstancekey
     */
    @JsonProperty("originlineinstancekey")
    public void setOriginlineinstancekey(String originlineinstancekey) {
        this.originlineinstancekey = originlineinstancekey;
    }

    /**
     * 
     * @return
     *     The originobject
     */
    @JsonProperty("originobject")
    public String getOriginobject() {
        return originobject;
    }

    /**
     * 
     * @param originobject
     *     The originobject
     */
    @JsonProperty("originobject")
    public void setOriginobject(String originobject) {
        this.originobject = originobject;
    }

    /**
     * 
     * @return
     *     The originobjectinstancekey
     */
    @JsonProperty("originobjectinstancekey")
    public String getOriginobjectinstancekey() {
        return originobjectinstancekey;
    }

    /**
     * 
     * @param originobjectinstancekey
     *     The originobjectinstancekey
     */
    @JsonProperty("originobjectinstancekey")
    public void setOriginobjectinstancekey(String originobjectinstancekey) {
        this.originobjectinstancekey = originobjectinstancekey;
    }

    /**
     * 
     * @return
     *     The ourcontact
     */
    @JsonProperty("ourcontact")
    public String getOurcontact() {
        return ourcontact;
    }

    /**
     * 
     * @param ourcontact
     *     The ourcontact
     */
    @JsonProperty("ourcontact")
    public void setOurcontact(String ourcontact) {
        this.ourcontact = ourcontact;
    }

    /**
     * 
     * @return
     *     The overwritecompany
     */
    @JsonProperty("overwritecompany")
    public Boolean getOverwritecompany() {
        return overwritecompany;
    }

    /**
     * 
     * @param overwritecompany
     *     The overwritecompany
     */
    @JsonProperty("overwritecompany")
    public void setOverwritecompany(Boolean overwritecompany) {
        this.overwritecompany = overwritecompany;
    }

    /**
     * 
     * @return
     *     The overwriteentity
     */
    @JsonProperty("overwriteentity")
    public Boolean getOverwriteentity() {
        return overwriteentity;
    }

    /**
     * 
     * @param overwriteentity
     *     The overwriteentity
     */
    @JsonProperty("overwriteentity")
    public void setOverwriteentity(Boolean overwriteentity) {
        this.overwriteentity = overwriteentity;
    }

    /**
     * 
     * @return
     *     The overwritelocalspec1
     */
    @JsonProperty("overwritelocalspec1")
    public Boolean getOverwritelocalspec1() {
        return overwritelocalspec1;
    }

    /**
     * 
     * @param overwritelocalspec1
     *     The overwritelocalspec1
     */
    @JsonProperty("overwritelocalspec1")
    public void setOverwritelocalspec1(Boolean overwritelocalspec1) {
        this.overwritelocalspec1 = overwritelocalspec1;
    }

    /**
     * 
     * @return
     *     The overwritelocalspec10
     */
    @JsonProperty("overwritelocalspec10")
    public Boolean getOverwritelocalspec10() {
        return overwritelocalspec10;
    }

    /**
     * 
     * @param overwritelocalspec10
     *     The overwritelocalspec10
     */
    @JsonProperty("overwritelocalspec10")
    public void setOverwritelocalspec10(Boolean overwritelocalspec10) {
        this.overwritelocalspec10 = overwritelocalspec10;
    }

    /**
     * 
     * @return
     *     The overwritelocalspec2
     */
    @JsonProperty("overwritelocalspec2")
    public Boolean getOverwritelocalspec2() {
        return overwritelocalspec2;
    }

    /**
     * 
     * @param overwritelocalspec2
     *     The overwritelocalspec2
     */
    @JsonProperty("overwritelocalspec2")
    public void setOverwritelocalspec2(Boolean overwritelocalspec2) {
        this.overwritelocalspec2 = overwritelocalspec2;
    }

    /**
     * 
     * @return
     *     The overwritelocalspec3
     */
    @JsonProperty("overwritelocalspec3")
    public Boolean getOverwritelocalspec3() {
        return overwritelocalspec3;
    }

    /**
     * 
     * @param overwritelocalspec3
     *     The overwritelocalspec3
     */
    @JsonProperty("overwritelocalspec3")
    public void setOverwritelocalspec3(Boolean overwritelocalspec3) {
        this.overwritelocalspec3 = overwritelocalspec3;
    }

    /**
     * 
     * @return
     *     The overwritelocalspec4
     */
    @JsonProperty("overwritelocalspec4")
    public Boolean getOverwritelocalspec4() {
        return overwritelocalspec4;
    }

    /**
     * 
     * @param overwritelocalspec4
     *     The overwritelocalspec4
     */
    @JsonProperty("overwritelocalspec4")
    public void setOverwritelocalspec4(Boolean overwritelocalspec4) {
        this.overwritelocalspec4 = overwritelocalspec4;
    }

    /**
     * 
     * @return
     *     The overwritelocalspec5
     */
    @JsonProperty("overwritelocalspec5")
    public Boolean getOverwritelocalspec5() {
        return overwritelocalspec5;
    }

    /**
     * 
     * @param overwritelocalspec5
     *     The overwritelocalspec5
     */
    @JsonProperty("overwritelocalspec5")
    public void setOverwritelocalspec5(Boolean overwritelocalspec5) {
        this.overwritelocalspec5 = overwritelocalspec5;
    }

    /**
     * 
     * @return
     *     The overwritelocalspec6
     */
    @JsonProperty("overwritelocalspec6")
    public Boolean getOverwritelocalspec6() {
        return overwritelocalspec6;
    }

    /**
     * 
     * @param overwritelocalspec6
     *     The overwritelocalspec6
     */
    @JsonProperty("overwritelocalspec6")
    public void setOverwritelocalspec6(Boolean overwritelocalspec6) {
        this.overwritelocalspec6 = overwritelocalspec6;
    }

    /**
     * 
     * @return
     *     The overwritelocalspec7
     */
    @JsonProperty("overwritelocalspec7")
    public Boolean getOverwritelocalspec7() {
        return overwritelocalspec7;
    }

    /**
     * 
     * @param overwritelocalspec7
     *     The overwritelocalspec7
     */
    @JsonProperty("overwritelocalspec7")
    public void setOverwritelocalspec7(Boolean overwritelocalspec7) {
        this.overwritelocalspec7 = overwritelocalspec7;
    }

    /**
     * 
     * @return
     *     The overwritelocalspec8
     */
    @JsonProperty("overwritelocalspec8")
    public Boolean getOverwritelocalspec8() {
        return overwritelocalspec8;
    }

    /**
     * 
     * @param overwritelocalspec8
     *     The overwritelocalspec8
     */
    @JsonProperty("overwritelocalspec8")
    public void setOverwritelocalspec8(Boolean overwritelocalspec8) {
        this.overwritelocalspec8 = overwritelocalspec8;
    }

    /**
     * 
     * @return
     *     The overwritelocalspec9
     */
    @JsonProperty("overwritelocalspec9")
    public Boolean getOverwritelocalspec9() {
        return overwritelocalspec9;
    }

    /**
     * 
     * @param overwritelocalspec9
     *     The overwritelocalspec9
     */
    @JsonProperty("overwritelocalspec9")
    public void setOverwritelocalspec9(Boolean overwritelocalspec9) {
        this.overwritelocalspec9 = overwritelocalspec9;
    }

    /**
     * 
     * @return
     *     The overwritelocation
     */
    @JsonProperty("overwritelocation")
    public Boolean getOverwritelocation() {
        return overwritelocation;
    }

    /**
     * 
     * @param overwritelocation
     *     The overwritelocation
     */
    @JsonProperty("overwritelocation")
    public void setOverwritelocation(Boolean overwritelocation) {
        this.overwritelocation = overwritelocation;
    }

    /**
     * 
     * @return
     *     The overwriteproject
     */
    @JsonProperty("overwriteproject")
    public Boolean getOverwriteproject() {
        return overwriteproject;
    }

    /**
     * 
     * @param overwriteproject
     *     The overwriteproject
     */
    @JsonProperty("overwriteproject")
    public void setOverwriteproject(Boolean overwriteproject) {
        this.overwriteproject = overwriteproject;
    }

    /**
     * 
     * @return
     *     The overwritepurpose
     */
    @JsonProperty("overwritepurpose")
    public Boolean getOverwritepurpose() {
        return overwritepurpose;
    }

    /**
     * 
     * @param overwritepurpose
     *     The overwritepurpose
     */
    @JsonProperty("overwritepurpose")
    public void setOverwritepurpose(Boolean overwritepurpose) {
        this.overwritepurpose = overwritepurpose;
    }

    /**
     * 
     * @return
     *     The overwritespec1
     */
    @JsonProperty("overwritespec1")
    public Boolean getOverwritespec1() {
        return overwritespec1;
    }

    /**
     * 
     * @param overwritespec1
     *     The overwritespec1
     */
    @JsonProperty("overwritespec1")
    public void setOverwritespec1(Boolean overwritespec1) {
        this.overwritespec1 = overwritespec1;
    }

    /**
     * 
     * @return
     *     The overwritespec10
     */
    @JsonProperty("overwritespec10")
    public Boolean getOverwritespec10() {
        return overwritespec10;
    }

    /**
     * 
     * @param overwritespec10
     *     The overwritespec10
     */
    @JsonProperty("overwritespec10")
    public void setOverwritespec10(Boolean overwritespec10) {
        this.overwritespec10 = overwritespec10;
    }

    /**
     * 
     * @return
     *     The overwritespec2
     */
    @JsonProperty("overwritespec2")
    public Boolean getOverwritespec2() {
        return overwritespec2;
    }

    /**
     * 
     * @param overwritespec2
     *     The overwritespec2
     */
    @JsonProperty("overwritespec2")
    public void setOverwritespec2(Boolean overwritespec2) {
        this.overwritespec2 = overwritespec2;
    }

    /**
     * 
     * @return
     *     The overwritespec3
     */
    @JsonProperty("overwritespec3")
    public Boolean getOverwritespec3() {
        return overwritespec3;
    }

    /**
     * 
     * @param overwritespec3
     *     The overwritespec3
     */
    @JsonProperty("overwritespec3")
    public void setOverwritespec3(Boolean overwritespec3) {
        this.overwritespec3 = overwritespec3;
    }

    /**
     * 
     * @return
     *     The overwritespec4
     */
    @JsonProperty("overwritespec4")
    public Boolean getOverwritespec4() {
        return overwritespec4;
    }

    /**
     * 
     * @param overwritespec4
     *     The overwritespec4
     */
    @JsonProperty("overwritespec4")
    public void setOverwritespec4(Boolean overwritespec4) {
        this.overwritespec4 = overwritespec4;
    }

    /**
     * 
     * @return
     *     The overwritespec5
     */
    @JsonProperty("overwritespec5")
    public Boolean getOverwritespec5() {
        return overwritespec5;
    }

    /**
     * 
     * @param overwritespec5
     *     The overwritespec5
     */
    @JsonProperty("overwritespec5")
    public void setOverwritespec5(Boolean overwritespec5) {
        this.overwritespec5 = overwritespec5;
    }

    /**
     * 
     * @return
     *     The overwritespec6
     */
    @JsonProperty("overwritespec6")
    public Boolean getOverwritespec6() {
        return overwritespec6;
    }

    /**
     * 
     * @param overwritespec6
     *     The overwritespec6
     */
    @JsonProperty("overwritespec6")
    public void setOverwritespec6(Boolean overwritespec6) {
        this.overwritespec6 = overwritespec6;
    }

    /**
     * 
     * @return
     *     The overwritespec7
     */
    @JsonProperty("overwritespec7")
    public Boolean getOverwritespec7() {
        return overwritespec7;
    }

    /**
     * 
     * @param overwritespec7
     *     The overwritespec7
     */
    @JsonProperty("overwritespec7")
    public void setOverwritespec7(Boolean overwritespec7) {
        this.overwritespec7 = overwritespec7;
    }

    /**
     * 
     * @return
     *     The overwritespec8
     */
    @JsonProperty("overwritespec8")
    public Boolean getOverwritespec8() {
        return overwritespec8;
    }

    /**
     * 
     * @param overwritespec8
     *     The overwritespec8
     */
    @JsonProperty("overwritespec8")
    public void setOverwritespec8(Boolean overwritespec8) {
        this.overwritespec8 = overwritespec8;
    }

    /**
     * 
     * @return
     *     The overwritespec9
     */
    @JsonProperty("overwritespec9")
    public Boolean getOverwritespec9() {
        return overwritespec9;
    }

    /**
     * 
     * @param overwritespec9
     *     The overwritespec9
     */
    @JsonProperty("overwritespec9")
    public void setOverwritespec9(Boolean overwritespec9) {
        this.overwritespec9 = overwritespec9;
    }

    /**
     * 
     * @return
     *     The parentcustomer
     */
    @JsonProperty("parentcustomer")
    public String getParentcustomer() {
        return parentcustomer;
    }

    /**
     * 
     * @param parentcustomer
     *     The parentcustomer
     */
    @JsonProperty("parentcustomer")
    public void setParentcustomer(String parentcustomer) {
        this.parentcustomer = parentcustomer;
    }

    /**
     * 
     * @return
     *     The payeridentification
     */
    @JsonProperty("payeridentification")
    public String getPayeridentification() {
        return payeridentification;
    }

    /**
     * 
     * @param payeridentification
     *     The payeridentification
     */
    @JsonProperty("payeridentification")
    public void setPayeridentification(String payeridentification) {
        this.payeridentification = payeridentification;
    }

    /**
     * 
     * @return
     *     The paymentagent
     */
    @JsonProperty("paymentagent")
    public String getPaymentagent() {
        return paymentagent;
    }

    /**
     * 
     * @param paymentagent
     *     The paymentagent
     */
    @JsonProperty("paymentagent")
    public void setPaymentagent(String paymentagent) {
        this.paymentagent = paymentagent;
    }

    /**
     * 
     * @return
     *     The paymentcustomer
     */
    @JsonProperty("paymentcustomer")
    public String getPaymentcustomer() {
        return paymentcustomer;
    }

    /**
     * 
     * @param paymentcustomer
     *     The paymentcustomer
     */
    @JsonProperty("paymentcustomer")
    public void setPaymentcustomer(String paymentcustomer) {
        this.paymentcustomer = paymentcustomer;
    }

    /**
     * 
     * @return
     *     The paymentterms
     */
    @JsonProperty("paymentterms")
    public String getPaymentterms() {
        return paymentterms;
    }

    /**
     * 
     * @param paymentterms
     *     The paymentterms
     */
    @JsonProperty("paymentterms")
    public void setPaymentterms(String paymentterms) {
        this.paymentterms = paymentterms;
    }

    /**
     * 
     * @return
     *     The postaldistrict
     */
    @JsonProperty("postaldistrict")
    public String getPostaldistrict() {
        return postaldistrict;
    }

    /**
     * 
     * @param postaldistrict
     *     The postaldistrict
     */
    @JsonProperty("postaldistrict")
    public void setPostaldistrict(String postaldistrict) {
        this.postaldistrict = postaldistrict;
    }

    /**
     * 
     * @return
     *     The postingdate
     */
    @JsonProperty("postingdate")
    public String getPostingdate() {
        return postingdate;
    }

    /**
     * 
     * @param postingdate
     *     The postingdate
     */
    @JsonProperty("postingdate")
    public void setPostingdate(String postingdate) {
        this.postingdate = postingdate;
    }

    /**
     * 
     * @return
     *     The postingtime
     */
    @JsonProperty("postingtime")
    public String getPostingtime() {
        return postingtime;
    }

    /**
     * 
     * @param postingtime
     *     The postingtime
     */
    @JsonProperty("postingtime")
    public void setPostingtime(String postingtime) {
        this.postingtime = postingtime;
    }

    /**
     * 
     * @return
     *     The projectname
     */
    @JsonProperty("projectname")
    public String getProjectname() {
        return projectname;
    }

    /**
     * 
     * @param projectname
     *     The projectname
     */
    @JsonProperty("projectname")
    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    /**
     * 
     * @return
     *     The purposename
     */
    @JsonProperty("purposename")
    public String getPurposename() {
        return purposename;
    }

    /**
     * 
     * @param purposename
     *     The purposename
     */
    @JsonProperty("purposename")
    public void setPurposename(String purposename) {
        this.purposename = purposename;
    }

    /**
     * 
     * @return
     *     The reconciliationdate
     */
    @JsonProperty("reconciliationdate")
    public String getReconciliationdate() {
        return reconciliationdate;
    }

    /**
     * 
     * @param reconciliationdate
     *     The reconciliationdate
     */
    @JsonProperty("reconciliationdate")
    public void setReconciliationdate(String reconciliationdate) {
        this.reconciliationdate = reconciliationdate;
    }

    /**
     * 
     * @return
     *     The reconciliationstatus
     */
    @JsonProperty("reconciliationstatus")
    public String getReconciliationstatus() {
        return reconciliationstatus;
    }

    /**
     * 
     * @param reconciliationstatus
     *     The reconciliationstatus
     */
    @JsonProperty("reconciliationstatus")
    public void setReconciliationstatus(String reconciliationstatus) {
        this.reconciliationstatus = reconciliationstatus;
    }

    /**
     * 
     * @return
     *     The remainderbase
     */
    @JsonProperty("remainderbase")
    public Integer getRemainderbase() {
        return remainderbase;
    }

    /**
     * 
     * @param remainderbase
     *     The remainderbase
     */
    @JsonProperty("remainderbase")
    public void setRemainderbase(Integer remainderbase) {
        this.remainderbase = remainderbase;
    }

    /**
     * 
     * @return
     *     The remainderenterprise
     */
    @JsonProperty("remainderenterprise")
    public Integer getRemainderenterprise() {
        return remainderenterprise;
    }

    /**
     * 
     * @param remainderenterprise
     *     The remainderenterprise
     */
    @JsonProperty("remainderenterprise")
    public void setRemainderenterprise(Integer remainderenterprise) {
        this.remainderenterprise = remainderenterprise;
    }

    /**
     * 
     * @return
     *     The remainderoriginal
     */
    @JsonProperty("remainderoriginal")
    public Integer getRemainderoriginal() {
        return remainderoriginal;
    }

    /**
     * 
     * @param remainderoriginal
     *     The remainderoriginal
     */
    @JsonProperty("remainderoriginal")
    public void setRemainderoriginal(Integer remainderoriginal) {
        this.remainderoriginal = remainderoriginal;
    }

    /**
     * 
     * @return
     *     The remainderstandard
     */
    @JsonProperty("remainderstandard")
    public Integer getRemainderstandard() {
        return remainderstandard;
    }

    /**
     * 
     * @param remainderstandard
     *     The remainderstandard
     */
    @JsonProperty("remainderstandard")
    public void setRemainderstandard(Integer remainderstandard) {
        this.remainderstandard = remainderstandard;
    }

    /**
     * 
     * @return
     *     The remark
     */
    @JsonProperty("remark")
    public String getRemark() {
        return remark;
    }

    /**
     * 
     * @param remark
     *     The remark
     */
    @JsonProperty("remark")
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 
     * @return
     *     The reminderdate
     */
    @JsonProperty("reminderdate")
    public String getReminderdate() {
        return reminderdate;
    }

    /**
     * 
     * @param reminderdate
     *     The reminderdate
     */
    @JsonProperty("reminderdate")
    public void setReminderdate(String reminderdate) {
        this.reminderdate = reminderdate;
    }

    /**
     * 
     * @return
     *     The reminderlevel
     */
    @JsonProperty("reminderlevel")
    public Integer getReminderlevel() {
        return reminderlevel;
    }

    /**
     * 
     * @param reminderlevel
     *     The reminderlevel
     */
    @JsonProperty("reminderlevel")
    public void setReminderlevel(Integer reminderlevel) {
        this.reminderlevel = reminderlevel;
    }

    /**
     * 
     * @return
     *     The remindertextgroupname
     */
    @JsonProperty("remindertextgroupname")
    public String getRemindertextgroupname() {
        return remindertextgroupname;
    }

    /**
     * 
     * @param remindertextgroupname
     *     The remindertextgroupname
     */
    @JsonProperty("remindertextgroupname")
    public void setRemindertextgroupname(String remindertextgroupname) {
        this.remindertextgroupname = remindertextgroupname;
    }

    /**
     * 
     * @return
     *     The salespersonnumber
     */
    @JsonProperty("salespersonnumber")
    public String getSalespersonnumber() {
        return salespersonnumber;
    }

    /**
     * 
     * @param salespersonnumber
     *     The salespersonnumber
     */
    @JsonProperty("salespersonnumber")
    public void setSalespersonnumber(String salespersonnumber) {
        this.salespersonnumber = salespersonnumber;
    }

    /**
     * 
     * @return
     *     The segment
     */
    @JsonProperty("segment")
    public String getSegment() {
        return segment;
    }

    /**
     * 
     * @param segment
     *     The segment
     */
    @JsonProperty("segment")
    public void setSegment(String segment) {
        this.segment = segment;
    }

    /**
     * 
     * @return
     *     The selectedforreconciliation
     */
    @JsonProperty("selectedforreconciliation")
    public Boolean getSelectedforreconciliation() {
        return selectedforreconciliation;
    }

    /**
     * 
     * @param selectedforreconciliation
     *     The selectedforreconciliation
     */
    @JsonProperty("selectedforreconciliation")
    public void setSelectedforreconciliation(Boolean selectedforreconciliation) {
        this.selectedforreconciliation = selectedforreconciliation;
    }

    /**
     * 
     * @return
     *     The selectedforreminder
     */
    @JsonProperty("selectedforreminder")
    public Boolean getSelectedforreminder() {
        return selectedforreminder;
    }

    /**
     * 
     * @param selectedforreminder
     *     The selectedforreminder
     */
    @JsonProperty("selectedforreminder")
    public void setSelectedforreminder(Boolean selectedforreminder) {
        this.selectedforreminder = selectedforreminder;
    }

    /**
     * 
     * @return
     *     The specification10name
     */
    @JsonProperty("specification10name")
    public String getSpecification10name() {
        return specification10name;
    }

    /**
     * 
     * @param specification10name
     *     The specification10name
     */
    @JsonProperty("specification10name")
    public void setSpecification10name(String specification10name) {
        this.specification10name = specification10name;
    }

    /**
     * 
     * @return
     *     The specification1name
     */
    @JsonProperty("specification1name")
    public String getSpecification1name() {
        return specification1name;
    }

    /**
     * 
     * @param specification1name
     *     The specification1name
     */
    @JsonProperty("specification1name")
    public void setSpecification1name(String specification1name) {
        this.specification1name = specification1name;
    }

    /**
     * 
     * @return
     *     The specification2name
     */
    @JsonProperty("specification2name")
    public String getSpecification2name() {
        return specification2name;
    }

    /**
     * 
     * @param specification2name
     *     The specification2name
     */
    @JsonProperty("specification2name")
    public void setSpecification2name(String specification2name) {
        this.specification2name = specification2name;
    }

    /**
     * 
     * @return
     *     The specification3name
     */
    @JsonProperty("specification3name")
    public String getSpecification3name() {
        return specification3name;
    }

    /**
     * 
     * @param specification3name
     *     The specification3name
     */
    @JsonProperty("specification3name")
    public void setSpecification3name(String specification3name) {
        this.specification3name = specification3name;
    }

    /**
     * 
     * @return
     *     The specification4name
     */
    @JsonProperty("specification4name")
    public String getSpecification4name() {
        return specification4name;
    }

    /**
     * 
     * @param specification4name
     *     The specification4name
     */
    @JsonProperty("specification4name")
    public void setSpecification4name(String specification4name) {
        this.specification4name = specification4name;
    }

    /**
     * 
     * @return
     *     The specification5name
     */
    @JsonProperty("specification5name")
    public String getSpecification5name() {
        return specification5name;
    }

    /**
     * 
     * @param specification5name
     *     The specification5name
     */
    @JsonProperty("specification5name")
    public void setSpecification5name(String specification5name) {
        this.specification5name = specification5name;
    }

    /**
     * 
     * @return
     *     The specification6name
     */
    @JsonProperty("specification6name")
    public String getSpecification6name() {
        return specification6name;
    }

    /**
     * 
     * @param specification6name
     *     The specification6name
     */
    @JsonProperty("specification6name")
    public void setSpecification6name(String specification6name) {
        this.specification6name = specification6name;
    }

    /**
     * 
     * @return
     *     The specification7name
     */
    @JsonProperty("specification7name")
    public String getSpecification7name() {
        return specification7name;
    }

    /**
     * 
     * @param specification7name
     *     The specification7name
     */
    @JsonProperty("specification7name")
    public void setSpecification7name(String specification7name) {
        this.specification7name = specification7name;
    }

    /**
     * 
     * @return
     *     The specification8name
     */
    @JsonProperty("specification8name")
    public String getSpecification8name() {
        return specification8name;
    }

    /**
     * 
     * @param specification8name
     *     The specification8name
     */
    @JsonProperty("specification8name")
    public void setSpecification8name(String specification8name) {
        this.specification8name = specification8name;
    }

    /**
     * 
     * @return
     *     The specification9name
     */
    @JsonProperty("specification9name")
    public String getSpecification9name() {
        return specification9name;
    }

    /**
     * 
     * @param specification9name
     *     The specification9name
     */
    @JsonProperty("specification9name")
    public void setSpecification9name(String specification9name) {
        this.specification9name = specification9name;
    }

    /**
     * 
     * @return
     *     The standardcustomerpaymentmode
     */
    @JsonProperty("standardcustomerpaymentmode")
    public String getStandardcustomerpaymentmode() {
        return standardcustomerpaymentmode;
    }

    /**
     * 
     * @param standardcustomerpaymentmode
     *     The standardcustomerpaymentmode
     */
    @JsonProperty("standardcustomerpaymentmode")
    public void setStandardcustomerpaymentmode(String standardcustomerpaymentmode) {
        this.standardcustomerpaymentmode = standardcustomerpaymentmode;
    }

    /**
     * 
     * @return
     *     The statistic1
     */
    @JsonProperty("statistic1")
    public String getStatistic1() {
        return statistic1;
    }

    /**
     * 
     * @param statistic1
     *     The statistic1
     */
    @JsonProperty("statistic1")
    public void setStatistic1(String statistic1) {
        this.statistic1 = statistic1;
    }

    /**
     * 
     * @return
     *     The statistic2
     */
    @JsonProperty("statistic2")
    public String getStatistic2() {
        return statistic2;
    }

    /**
     * 
     * @param statistic2
     *     The statistic2
     */
    @JsonProperty("statistic2")
    public void setStatistic2(String statistic2) {
        this.statistic2 = statistic2;
    }

    /**
     * 
     * @return
     *     The statistic3
     */
    @JsonProperty("statistic3")
    public String getStatistic3() {
        return statistic3;
    }

    /**
     * 
     * @param statistic3
     *     The statistic3
     */
    @JsonProperty("statistic3")
    public void setStatistic3(String statistic3) {
        this.statistic3 = statistic3;
    }

    /**
     * 
     * @return
     *     The statistic4
     */
    @JsonProperty("statistic4")
    public String getStatistic4() {
        return statistic4;
    }

    /**
     * 
     * @param statistic4
     *     The statistic4
     */
    @JsonProperty("statistic4")
    public void setStatistic4(String statistic4) {
        this.statistic4 = statistic4;
    }

    /**
     * 
     * @return
     *     The telefax
     */
    @JsonProperty("telefax")
    public String getTelefax() {
        return telefax;
    }

    /**
     * 
     * @param telefax
     *     The telefax
     */
    @JsonProperty("telefax")
    public void setTelefax(String telefax) {
        this.telefax = telefax;
    }

    /**
     * 
     * @return
     *     The telephone
     */
    @JsonProperty("telephone")
    public String getTelephone() {
        return telephone;
    }

    /**
     * 
     * @param telephone
     *     The telephone
     */
    @JsonProperty("telephone")
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * 
     * @return
     *     The telex
     */
    @JsonProperty("telex")
    public String getTelex() {
        return telex;
    }

    /**
     * 
     * @param telex
     *     The telex
     */
    @JsonProperty("telex")
    public void setTelex(String telex) {
        this.telex = telex;
    }

    /**
     * 
     * @return
     *     The text1
     */
    @JsonProperty("text1")
    public String getText1() {
        return text1;
    }

    /**
     * 
     * @param text1
     *     The text1
     */
    @JsonProperty("text1")
    public void setText1(String text1) {
        this.text1 = text1;
    }

    /**
     * 
     * @return
     *     The text2
     */
    @JsonProperty("text2")
    public String getText2() {
        return text2;
    }

    /**
     * 
     * @param text2
     *     The text2
     */
    @JsonProperty("text2")
    public void setText2(String text2) {
        this.text2 = text2;
    }

    /**
     * 
     * @return
     *     The text3
     */
    @JsonProperty("text3")
    public String getText3() {
        return text3;
    }

    /**
     * 
     * @param text3
     *     The text3
     */
    @JsonProperty("text3")
    public void setText3(String text3) {
        this.text3 = text3;
    }

    /**
     * 
     * @return
     *     The text4
     */
    @JsonProperty("text4")
    public String getText4() {
        return text4;
    }

    /**
     * 
     * @param text4
     *     The text4
     */
    @JsonProperty("text4")
    public void setText4(String text4) {
        this.text4 = text4;
    }

    /**
     * 
     * @return
     *     The text5
     */
    @JsonProperty("text5")
    public String getText5() {
        return text5;
    }

    /**
     * 
     * @param text5
     *     The text5
     */
    @JsonProperty("text5")
    public void setText5(String text5) {
        this.text5 = text5;
    }

    /**
     * 
     * @return
     *     The transactionnumber
     */
    @JsonProperty("transactionnumber")
    public String getTransactionnumber() {
        return transactionnumber;
    }

    /**
     * 
     * @param transactionnumber
     *     The transactionnumber
     */
    @JsonProperty("transactionnumber")
    public void setTransactionnumber(String transactionnumber) {
        this.transactionnumber = transactionnumber;
    }

    /**
     * 
     * @return
     *     The transactiontype
     */
    @JsonProperty("transactiontype")
    public String getTransactiontype() {
        return transactiontype;
    }

    /**
     * 
     * @param transactiontype
     *     The transactiontype
     */
    @JsonProperty("transactiontype")
    public void setTransactiontype(String transactiontype) {
        this.transactiontype = transactiontype;
    }

    /**
     * 
     * @return
     *     The vat
     */
    @JsonProperty("vat")
    public Boolean getVat() {
        return vat;
    }

    /**
     * 
     * @param vat
     *     The vat
     */
    @JsonProperty("vat")
    public void setVat(Boolean vat) {
        this.vat = vat;
    }

    /**
     * 
     * @return
     *     The vatnumber
     */
    @JsonProperty("vatnumber")
    public String getVatnumber() {
        return vatnumber;
    }

    /**
     * 
     * @param vatnumber
     *     The vatnumber
     */
    @JsonProperty("vatnumber")
    public void setVatnumber(String vatnumber) {
        this.vatnumber = vatnumber;
    }

    /**
     * 
     * @return
     *     The versionnumber
     */
    @JsonProperty("versionnumber")
    public Integer getVersionnumber() {
        return versionnumber;
    }

    /**
     * 
     * @param versionnumber
     *     The versionnumber
     */
    @JsonProperty("versionnumber")
    public void setVersionnumber(Integer versionnumber) {
        this.versionnumber = versionnumber;
    }

    /**
     * 
     * @return
     *     The withholdingtaxbase
     */
    @JsonProperty("withholdingtaxbase")
    public Integer getWithholdingtaxbase() {
        return withholdingtaxbase;
    }

    /**
     * 
     * @param withholdingtaxbase
     *     The withholdingtaxbase
     */
    @JsonProperty("withholdingtaxbase")
    public void setWithholdingtaxbase(Integer withholdingtaxbase) {
        this.withholdingtaxbase = withholdingtaxbase;
    }

    /**
     * 
     * @return
     *     The withholdingtaxcurrency
     */
    @JsonProperty("withholdingtaxcurrency")
    public Integer getWithholdingtaxcurrency() {
        return withholdingtaxcurrency;
    }

    /**
     * 
     * @param withholdingtaxcurrency
     *     The withholdingtaxcurrency
     */
    @JsonProperty("withholdingtaxcurrency")
    public void setWithholdingtaxcurrency(Integer withholdingtaxcurrency) {
        this.withholdingtaxcurrency = withholdingtaxcurrency;
    }

    /**
     * 
     * @return
     *     The withholdingtaxenterprise
     */
    @JsonProperty("withholdingtaxenterprise")
    public Integer getWithholdingtaxenterprise() {
        return withholdingtaxenterprise;
    }

    /**
     * 
     * @param withholdingtaxenterprise
     *     The withholdingtaxenterprise
     */
    @JsonProperty("withholdingtaxenterprise")
    public void setWithholdingtaxenterprise(Integer withholdingtaxenterprise) {
        this.withholdingtaxenterprise = withholdingtaxenterprise;
    }

    /**
     * 
     * @return
     *     The zipcode
     */
    @JsonProperty("zipcode")
    public String getZipcode() {
        return zipcode;
    }

    /**
     * 
     * @param zipcode
     *     The zipcode
     */
    @JsonProperty("zipcode")
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
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
        return new HashCodeBuilder().append(customernumber).append(linenumber).append(accesslevelname).append(accountstatementcustomer).append(accountstatementnumber).append(accrualcause).append(accrualremark).append(accruedtotalbase).append(accruedtotalcurrency).append(accruedtotalenterprise).append(activestatus).append(activitynumber).append(agreement).append(approvedforreconciliation).append(area).append(attention).append(automaticreconciliation).append(beingcollectedbase).append(beingcollectedcurrency).append(beingcollectedenterprise).append(beingcollectedoriginal).append(boolean1).append(boolean2).append(boolean3).append(boolean4).append(boolean5).append(cashdiscountcode).append(changedby).append(changeddate).append(cnrnumber).append(collectionagreementnumber).append(collectioncurrency).append(collectiongroupnumber).append(companycurrency).append(companycustomercustomerlinking).append(companynumber).append(companyoforigin).append(companyregistrationnumber).append(companyvatcode).append(contactperson).append(controlaccountcode).append(country).append(createdby).append(createddate).append(creditbase).append(creditcardexpirydate).append(creditcardnumber).append(creditenterprise).append(creditstandard).append(customergroup).append(customerpayeridentifcation).append(customerpaymentmode).append(customerpaymentreference).append(customerpopup1).append(customerpopup2).append(customerpopup3).append(customerpopup4).append(customerpopup5).append(customerremark).append(customerremark1).append(customerremark10).append(customerremark2).append(customerremark3).append(customerremark4).append(customerremark5).append(customerremark6).append(customerremark7).append(customerremark8).append(customerremark9).append(customerreminderlevel).append(customertype).append(debitbase).append(debitenterprise).append(debitstandard).append(departmentnumber).append(derivedcompanynumber).append(derivedentityname).append(derivedlocalspec10name).append(derivedlocalspec1name).append(derivedlocalspec2name).append(derivedlocalspec3name).append(derivedlocalspec4name).append(derivedlocalspec5name).append(derivedlocalspec6name).append(derivedlocalspec7name).append(derivedlocalspec8name).append(derivedlocalspec9name).append(derivedlocationname).append(derivedprojectname).append(derivedpurposename).append(derivedspec10name).append(derivedspec1name).append(derivedspec2name).append(derivedspec3name).append(derivedspec4name).append(derivedspec5name).append(derivedspec6name).append(derivedspec7name).append(derivedspec8name).append(derivedspec9name).append(dimensioncombnumber).append(documentarchivenumber).append(duedate).append(electroniccollection).append(electronicmailaddress).append(enterprise).append(entityname).append(entrycurrency).append(entrydate).append(entryreconciliationdate).append(entrytext).append(entrytype).append(exported).append(exportentry).append(giro).append(globallocationnumber).append(holidaycalendarname).append(interestapprovaldate).append(interestdate).append(interestreminderblock).append(interestreminderblockdate).append(interestreminderblockedby).append(interestreminderprinciple).append(interestsum).append(invoicedate).append(invoicename).append(jobnumber).append(journallinenumber).append(journalnumber).append(language).append(linkingrulename).append(localspec10name).append(localspec1name).append(localspec2name).append(localspec3name).append(localspec4name).append(localspec5name).append(localspec6name).append(localspec7name).append(localspec8name).append(localspec9name).append(locationname).append(name1).append(name2).append(name3).append(name4).append(name5).append(openclosed).append(originalamount).append(originalcurrency).append(originalduedate).append(originline).append(originlineinstancekey).append(originobject).append(originobjectinstancekey).append(ourcontact).append(overwritecompany).append(overwriteentity).append(overwritelocalspec1).append(overwritelocalspec10).append(overwritelocalspec2).append(overwritelocalspec3).append(overwritelocalspec4).append(overwritelocalspec5).append(overwritelocalspec6).append(overwritelocalspec7).append(overwritelocalspec8).append(overwritelocalspec9).append(overwritelocation).append(overwriteproject).append(overwritepurpose).append(overwritespec1).append(overwritespec10).append(overwritespec2).append(overwritespec3).append(overwritespec4).append(overwritespec5).append(overwritespec6).append(overwritespec7).append(overwritespec8).append(overwritespec9).append(parentcustomer).append(payeridentification).append(paymentagent).append(paymentcustomer).append(paymentterms).append(postaldistrict).append(postingdate).append(postingtime).append(projectname).append(purposename).append(reconciliationdate).append(reconciliationstatus).append(remainderbase).append(remainderenterprise).append(remainderoriginal).append(remainderstandard).append(remark).append(reminderdate).append(reminderlevel).append(remindertextgroupname).append(salespersonnumber).append(segment).append(selectedforreconciliation).append(selectedforreminder).append(specification10name).append(specification1name).append(specification2name).append(specification3name).append(specification4name).append(specification5name).append(specification6name).append(specification7name).append(specification8name).append(specification9name).append(standardcustomerpaymentmode).append(statistic1).append(statistic2).append(statistic3).append(statistic4).append(telefax).append(telephone).append(telex).append(text1).append(text2).append(text3).append(text4).append(text5).append(transactionnumber).append(transactiontype).append(vat).append(vatnumber).append(versionnumber).append(withholdingtaxbase).append(withholdingtaxcurrency).append(withholdingtaxenterprise).append(zipcode).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Data) == false) {
            return false;
        }
        Data rhs = ((Data) other);
        return new EqualsBuilder().append(customernumber, rhs.customernumber).append(linenumber, rhs.linenumber).append(accesslevelname, rhs.accesslevelname).append(accountstatementcustomer, rhs.accountstatementcustomer).append(accountstatementnumber, rhs.accountstatementnumber).append(accrualcause, rhs.accrualcause).append(accrualremark, rhs.accrualremark).append(accruedtotalbase, rhs.accruedtotalbase).append(accruedtotalcurrency, rhs.accruedtotalcurrency).append(accruedtotalenterprise, rhs.accruedtotalenterprise).append(activestatus, rhs.activestatus).append(activitynumber, rhs.activitynumber).append(agreement, rhs.agreement).append(approvedforreconciliation, rhs.approvedforreconciliation).append(area, rhs.area).append(attention, rhs.attention).append(automaticreconciliation, rhs.automaticreconciliation).append(beingcollectedbase, rhs.beingcollectedbase).append(beingcollectedcurrency, rhs.beingcollectedcurrency).append(beingcollectedenterprise, rhs.beingcollectedenterprise).append(beingcollectedoriginal, rhs.beingcollectedoriginal).append(boolean1, rhs.boolean1).append(boolean2, rhs.boolean2).append(boolean3, rhs.boolean3).append(boolean4, rhs.boolean4).append(boolean5, rhs.boolean5).append(cashdiscountcode, rhs.cashdiscountcode).append(changedby, rhs.changedby).append(changeddate, rhs.changeddate).append(cnrnumber, rhs.cnrnumber).append(collectionagreementnumber, rhs.collectionagreementnumber).append(collectioncurrency, rhs.collectioncurrency).append(collectiongroupnumber, rhs.collectiongroupnumber).append(companycurrency, rhs.companycurrency).append(companycustomercustomerlinking, rhs.companycustomercustomerlinking).append(companynumber, rhs.companynumber).append(companyoforigin, rhs.companyoforigin).append(companyregistrationnumber, rhs.companyregistrationnumber).append(companyvatcode, rhs.companyvatcode).append(contactperson, rhs.contactperson).append(controlaccountcode, rhs.controlaccountcode).append(country, rhs.country).append(createdby, rhs.createdby).append(createddate, rhs.createddate).append(creditbase, rhs.creditbase).append(creditcardexpirydate, rhs.creditcardexpirydate).append(creditcardnumber, rhs.creditcardnumber).append(creditenterprise, rhs.creditenterprise).append(creditstandard, rhs.creditstandard).append(customergroup, rhs.customergroup).append(customerpayeridentifcation, rhs.customerpayeridentifcation).append(customerpaymentmode, rhs.customerpaymentmode).append(customerpaymentreference, rhs.customerpaymentreference).append(customerpopup1, rhs.customerpopup1).append(customerpopup2, rhs.customerpopup2).append(customerpopup3, rhs.customerpopup3).append(customerpopup4, rhs.customerpopup4).append(customerpopup5, rhs.customerpopup5).append(customerremark, rhs.customerremark).append(customerremark1, rhs.customerremark1).append(customerremark10, rhs.customerremark10).append(customerremark2, rhs.customerremark2).append(customerremark3, rhs.customerremark3).append(customerremark4, rhs.customerremark4).append(customerremark5, rhs.customerremark5).append(customerremark6, rhs.customerremark6).append(customerremark7, rhs.customerremark7).append(customerremark8, rhs.customerremark8).append(customerremark9, rhs.customerremark9).append(customerreminderlevel, rhs.customerreminderlevel).append(customertype, rhs.customertype).append(debitbase, rhs.debitbase).append(debitenterprise, rhs.debitenterprise).append(debitstandard, rhs.debitstandard).append(departmentnumber, rhs.departmentnumber).append(derivedcompanynumber, rhs.derivedcompanynumber).append(derivedentityname, rhs.derivedentityname).append(derivedlocalspec10name, rhs.derivedlocalspec10name).append(derivedlocalspec1name, rhs.derivedlocalspec1name).append(derivedlocalspec2name, rhs.derivedlocalspec2name).append(derivedlocalspec3name, rhs.derivedlocalspec3name).append(derivedlocalspec4name, rhs.derivedlocalspec4name).append(derivedlocalspec5name, rhs.derivedlocalspec5name).append(derivedlocalspec6name, rhs.derivedlocalspec6name).append(derivedlocalspec7name, rhs.derivedlocalspec7name).append(derivedlocalspec8name, rhs.derivedlocalspec8name).append(derivedlocalspec9name, rhs.derivedlocalspec9name).append(derivedlocationname, rhs.derivedlocationname).append(derivedprojectname, rhs.derivedprojectname).append(derivedpurposename, rhs.derivedpurposename).append(derivedspec10name, rhs.derivedspec10name).append(derivedspec1name, rhs.derivedspec1name).append(derivedspec2name, rhs.derivedspec2name).append(derivedspec3name, rhs.derivedspec3name).append(derivedspec4name, rhs.derivedspec4name).append(derivedspec5name, rhs.derivedspec5name).append(derivedspec6name, rhs.derivedspec6name).append(derivedspec7name, rhs.derivedspec7name).append(derivedspec8name, rhs.derivedspec8name).append(derivedspec9name, rhs.derivedspec9name).append(dimensioncombnumber, rhs.dimensioncombnumber).append(documentarchivenumber, rhs.documentarchivenumber).append(duedate, rhs.duedate).append(electroniccollection, rhs.electroniccollection).append(electronicmailaddress, rhs.electronicmailaddress).append(enterprise, rhs.enterprise).append(entityname, rhs.entityname).append(entrycurrency, rhs.entrycurrency).append(entrydate, rhs.entrydate).append(entryreconciliationdate, rhs.entryreconciliationdate).append(entrytext, rhs.entrytext).append(entrytype, rhs.entrytype).append(exported, rhs.exported).append(exportentry, rhs.exportentry).append(giro, rhs.giro).append(globallocationnumber, rhs.globallocationnumber).append(holidaycalendarname, rhs.holidaycalendarname).append(interestapprovaldate, rhs.interestapprovaldate).append(interestdate, rhs.interestdate).append(interestreminderblock, rhs.interestreminderblock).append(interestreminderblockdate, rhs.interestreminderblockdate).append(interestreminderblockedby, rhs.interestreminderblockedby).append(interestreminderprinciple, rhs.interestreminderprinciple).append(interestsum, rhs.interestsum).append(invoicedate, rhs.invoicedate).append(invoicename, rhs.invoicename).append(jobnumber, rhs.jobnumber).append(journallinenumber, rhs.journallinenumber).append(journalnumber, rhs.journalnumber).append(language, rhs.language).append(linkingrulename, rhs.linkingrulename).append(localspec10name, rhs.localspec10name).append(localspec1name, rhs.localspec1name).append(localspec2name, rhs.localspec2name).append(localspec3name, rhs.localspec3name).append(localspec4name, rhs.localspec4name).append(localspec5name, rhs.localspec5name).append(localspec6name, rhs.localspec6name).append(localspec7name, rhs.localspec7name).append(localspec8name, rhs.localspec8name).append(localspec9name, rhs.localspec9name).append(locationname, rhs.locationname).append(name1, rhs.name1).append(name2, rhs.name2).append(name3, rhs.name3).append(name4, rhs.name4).append(name5, rhs.name5).append(openclosed, rhs.openclosed).append(originalamount, rhs.originalamount).append(originalcurrency, rhs.originalcurrency).append(originalduedate, rhs.originalduedate).append(originline, rhs.originline).append(originlineinstancekey, rhs.originlineinstancekey).append(originobject, rhs.originobject).append(originobjectinstancekey, rhs.originobjectinstancekey).append(ourcontact, rhs.ourcontact).append(overwritecompany, rhs.overwritecompany).append(overwriteentity, rhs.overwriteentity).append(overwritelocalspec1, rhs.overwritelocalspec1).append(overwritelocalspec10, rhs.overwritelocalspec10).append(overwritelocalspec2, rhs.overwritelocalspec2).append(overwritelocalspec3, rhs.overwritelocalspec3).append(overwritelocalspec4, rhs.overwritelocalspec4).append(overwritelocalspec5, rhs.overwritelocalspec5).append(overwritelocalspec6, rhs.overwritelocalspec6).append(overwritelocalspec7, rhs.overwritelocalspec7).append(overwritelocalspec8, rhs.overwritelocalspec8).append(overwritelocalspec9, rhs.overwritelocalspec9).append(overwritelocation, rhs.overwritelocation).append(overwriteproject, rhs.overwriteproject).append(overwritepurpose, rhs.overwritepurpose).append(overwritespec1, rhs.overwritespec1).append(overwritespec10, rhs.overwritespec10).append(overwritespec2, rhs.overwritespec2).append(overwritespec3, rhs.overwritespec3).append(overwritespec4, rhs.overwritespec4).append(overwritespec5, rhs.overwritespec5).append(overwritespec6, rhs.overwritespec6).append(overwritespec7, rhs.overwritespec7).append(overwritespec8, rhs.overwritespec8).append(overwritespec9, rhs.overwritespec9).append(parentcustomer, rhs.parentcustomer).append(payeridentification, rhs.payeridentification).append(paymentagent, rhs.paymentagent).append(paymentcustomer, rhs.paymentcustomer).append(paymentterms, rhs.paymentterms).append(postaldistrict, rhs.postaldistrict).append(postingdate, rhs.postingdate).append(postingtime, rhs.postingtime).append(projectname, rhs.projectname).append(purposename, rhs.purposename).append(reconciliationdate, rhs.reconciliationdate).append(reconciliationstatus, rhs.reconciliationstatus).append(remainderbase, rhs.remainderbase).append(remainderenterprise, rhs.remainderenterprise).append(remainderoriginal, rhs.remainderoriginal).append(remainderstandard, rhs.remainderstandard).append(remark, rhs.remark).append(reminderdate, rhs.reminderdate).append(reminderlevel, rhs.reminderlevel).append(remindertextgroupname, rhs.remindertextgroupname).append(salespersonnumber, rhs.salespersonnumber).append(segment, rhs.segment).append(selectedforreconciliation, rhs.selectedforreconciliation).append(selectedforreminder, rhs.selectedforreminder).append(specification10name, rhs.specification10name).append(specification1name, rhs.specification1name).append(specification2name, rhs.specification2name).append(specification3name, rhs.specification3name).append(specification4name, rhs.specification4name).append(specification5name, rhs.specification5name).append(specification6name, rhs.specification6name).append(specification7name, rhs.specification7name).append(specification8name, rhs.specification8name).append(specification9name, rhs.specification9name).append(standardcustomerpaymentmode, rhs.standardcustomerpaymentmode).append(statistic1, rhs.statistic1).append(statistic2, rhs.statistic2).append(statistic3, rhs.statistic3).append(statistic4, rhs.statistic4).append(telefax, rhs.telefax).append(telephone, rhs.telephone).append(telex, rhs.telex).append(text1, rhs.text1).append(text2, rhs.text2).append(text3, rhs.text3).append(text4, rhs.text4).append(text5, rhs.text5).append(transactionnumber, rhs.transactionnumber).append(transactiontype, rhs.transactiontype).append(vat, rhs.vat).append(vatnumber, rhs.vatnumber).append(versionnumber, rhs.versionnumber).append(withholdingtaxbase, rhs.withholdingtaxbase).append(withholdingtaxcurrency, rhs.withholdingtaxcurrency).append(withholdingtaxenterprise, rhs.withholdingtaxenterprise).append(zipcode, rhs.zipcode).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
