
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
    "blocked",
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
    "customernumber",
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
    "derivedlocalspec1name",
    "derivedlocalspec2name",
    "derivedlocalspec3name",
    "derivedlocationname",
    "derivedprojectname",
    "derivedpurposename",
    "derivedspec1name",
    "derivedspec2name",
    "derivedspec3name",
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
    "invoicename",
    "jobnumber",
    "journallinenumber",
    "journalnumber",
    "language",
    "linenumber",
    "linkingrulename",
    "localspec1name",
    "localspec2name",
    "localspec3name",
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
    "overwritelocalspec2",
    "overwritelocalspec3",
    "overwritelocation",
    "overwriteproject",
    "overwritepurpose",
    "overwritespec1",
    "overwritespec2",
    "overwritespec3",
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
    "specification1name",
    "specification2name",
    "specification3name",
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
    @JsonProperty("blocked")
    private Boolean blocked;
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
    @JsonProperty("customernumber")
    private String customernumber;
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
    @JsonProperty("derivedlocalspec1name")
    private String derivedlocalspec1name;
    @JsonProperty("derivedlocalspec2name")
    private String derivedlocalspec2name;
    @JsonProperty("derivedlocalspec3name")
    private String derivedlocalspec3name;
    @JsonProperty("derivedlocationname")
    private String derivedlocationname;
    @JsonProperty("derivedprojectname")
    private String derivedprojectname;
    @JsonProperty("derivedpurposename")
    private String derivedpurposename;
    @JsonProperty("derivedspec1name")
    private String derivedspec1name;
    @JsonProperty("derivedspec2name")
    private String derivedspec2name;
    @JsonProperty("derivedspec3name")
    private String derivedspec3name;
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
    @JsonProperty("invoicename")
    private String invoicename;
    @JsonProperty("jobnumber")
    private String jobnumber;
    @JsonProperty("journallinenumber")
    private Integer journallinenumber;
    @JsonProperty("journalnumber")
    private Integer journalnumber;
    @JsonProperty("language")
    private String language;
    @JsonProperty("linenumber")
    private Integer linenumber;
    @JsonProperty("linkingrulename")
    private String linkingrulename;
    @JsonProperty("localspec1name")
    private String localspec1name;
    @JsonProperty("localspec2name")
    private String localspec2name;
    @JsonProperty("localspec3name")
    private String localspec3name;
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
    @JsonProperty("overwritelocalspec2")
    private Boolean overwritelocalspec2;
    @JsonProperty("overwritelocalspec3")
    private Boolean overwritelocalspec3;
    @JsonProperty("overwritelocation")
    private Boolean overwritelocation;
    @JsonProperty("overwriteproject")
    private Boolean overwriteproject;
    @JsonProperty("overwritepurpose")
    private Boolean overwritepurpose;
    @JsonProperty("overwritespec1")
    private Boolean overwritespec1;
    @JsonProperty("overwritespec2")
    private Boolean overwritespec2;
    @JsonProperty("overwritespec3")
    private Boolean overwritespec3;
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
    @JsonProperty("specification1name")
    private String specification1name;
    @JsonProperty("specification2name")
    private String specification2name;
    @JsonProperty("specification3name")
    private String specification3name;
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
    private Integer transactionnumber;
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
     * @param derivedentityname
     * @param withholdingtaxenterprise
     * @param customerpaymentreference
     * @param accruedtotalbase
     * @param reconciliationstatus
     * @param linkingrulename
     * @param customerremark1
     * @param companyoforigin
     * @param customerremark3
     * @param customerremark2
     * @param customerremark5
     * @param originalduedate
     * @param customerremark4
     * @param customerremark7
     * @param customerremark6
     * @param customerremark9
     * @param projectname
     * @param customerremark8
     * @param derivedspec1name
     * @param creditbase
     * @param paymentterms
     * @param beingcollectedenterprise
     * @param derivedlocalspec1name
     * @param creditstandard
     * @param localspec1name
     * @param entrytype
     * @param telex
     * @param originalamount
     * @param interestdate
     * @param versionnumber
     * @param specification1name
     * @param remindertextgroupname
     * @param selectedforreminder
     * @param interestsum
     * @param cnrnumber
     * @param selectedforreconciliation
     * @param documentarchivenumber
     * @param overwritepurpose
     * @param debitenterprise
     * @param interestapprovaldate
     * @param purposename
     * @param customerpopup1
     * @param customerpopup4
     * @param interestreminderblock
     * @param customerpopup5
     * @param accruedtotalenterprise
     * @param customerpopup2
     * @param customerpopup3
     * @param collectionagreementnumber
     * @param customerpaymentmode
     * @param originobject
     * @param derivedcompanynumber
     * @param ourcontact
     * @param originline
     * @param exported
     * @param changedby
     * @param postaldistrict
     * @param linenumber
     * @param departmentnumber
     * @param companycustomercustomerlinking
     * @param vatnumber
     * @param collectioncurrency
     * @param country
     * @param overwritelocation
     * @param accountstatementcustomer
     * @param salespersonnumber
     * @param parentcustomer
     * @param vat
     * @param beingcollectedcurrency
     * @param creditenterprise
     * @param debitbase
     * @param electronicmailaddress
     * @param holidaycalendarname
     * @param companycurrency
     * @param area
     * @param overwriteproject
     * @param derivedprojectname
     * @param paymentcustomer
     * @param withholdingtaxbase
     * @param attention
     * @param activitynumber
     * @param overwritelocalspec2
     * @param originobjectinstancekey
     * @param overwritelocalspec1
     * @param payeridentification
     * @param contactperson
     * @param overwritelocalspec3
     * @param name5
     * @param customerpayeridentifcation
     * @param jobnumber
     * @param name3
     * @param name4
     * @param reminderlevel
     * @param beingcollectedbase
     * @param derivedspec3name
     * @param accesslevelname
     * @param name1
     * @param name2
     * @param entryreconciliationdate
     * @param accrualcause
     * @param changeddate
     * @param transactiontype
     * @param interestreminderblockdate
     * @param statistic3
     * @param customertype
     * @param statistic2
     * @param statistic1
     * @param statistic4
     * @param overwritespec3
     * @param activestatus
     * @param overwritespec2
     * @param overwritespec1
     * @param derivedpurposename
     * @param journallinenumber
     * @param dimensioncombnumber
     * @param collectiongroupnumber
     * @param createddate
     * @param reminderdate
     * @param entityname
     * @param language
     * @param overwritecompany
     * @param postingdate
     * @param entrytext
     * @param derivedspec2name
     * @param debitstandard
     * @param openclosed
     * @param creditcardexpirydate
     * @param automaticreconciliation
     * @param duedate
     * @param beingcollectedoriginal
     * @param specification3name
     * @param text3
     * @param specification2name
     * @param text4
     * @param postingtime
     * @param text1
     * @param zipcode
     * @param text2
     * @param companyregistrationnumber
     * @param originalcurrency
     * @param customerremark
     * @param text5
     * @param localspec3name
     * @param standardcustomerpaymentmode
     * @param interestreminderprinciple
     * @param electroniccollection
     * @param telephone
     * @param interestreminderblockedby
     * @param overwriteentity
     * @param accruedtotalcurrency
     * @param remark
     * @param segment
     * @param withholdingtaxcurrency
     * @param cashdiscountcode
     * @param customernumber
     * @param journalnumber
     * @param entrydate
     * @param customergroup
     * @param derivedlocalspec3name
     * @param customerremark10
     * @param companynumber
     * @param enterprise
     * @param createdby
     * @param paymentagent
     * @param reconciliationdate
     * @param transactionnumber
     * @param controlaccountcode
     * @param remainderstandard
     * @param remainderoriginal
     * @param telefax
     * @param creditcardnumber
     * @param derivedlocationname
     * @param originlineinstancekey
     * @param giro
     * @param blocked
     * @param approvedforreconciliation
     * @param locationname
     * @param customerreminderlevel
     * @param globallocationnumber
     * @param localspec2name
     * @param remainderbase
     * @param remainderenterprise
     * @param derivedlocalspec2name
     * @param boolean3
     * @param agreement
     * @param boolean2
     * @param boolean1
     * @param boolean5
     * @param boolean4
     * @param invoicename
     * @param companyvatcode
     * @param entrycurrency
     * @param exportentry
     * @param accrualremark
     * @param accountstatementnumber
     */
    public Data(String accesslevelname, String accountstatementcustomer, Integer accountstatementnumber, String accrualcause, String accrualremark, Integer accruedtotalbase, Integer accruedtotalcurrency, Integer accruedtotalenterprise, String activestatus, String activitynumber, String agreement, Boolean approvedforreconciliation, String area, String attention, Boolean automaticreconciliation, Integer beingcollectedbase, Integer beingcollectedcurrency, Integer beingcollectedenterprise, Integer beingcollectedoriginal, Boolean blocked, Boolean boolean1, Boolean boolean2, Boolean boolean3, Boolean boolean4, Boolean boolean5, String cashdiscountcode, String changedby, String changeddate, String cnrnumber, String collectionagreementnumber, Integer collectioncurrency, String collectiongroupnumber, String companycurrency, String companycustomercustomerlinking, String companynumber, String companyoforigin, String companyregistrationnumber, String companyvatcode, String contactperson, String controlaccountcode, String country, String createdby, String createddate, Integer creditbase, String creditcardexpirydate, String creditcardnumber, Integer creditenterprise, Integer creditstandard, String customergroup, String customernumber, String customerpayeridentifcation, String customerpaymentmode, String customerpaymentreference, String customerpopup1, String customerpopup2, String customerpopup3, String customerpopup4, String customerpopup5, String customerremark, String customerremark1, String customerremark10, String customerremark2, String customerremark3, String customerremark4, String customerremark5, String customerremark6, String customerremark7, String customerremark8, String customerremark9, Integer customerreminderlevel, String customertype, Integer debitbase, Integer debitenterprise, Integer debitstandard, String departmentnumber, String derivedcompanynumber, String derivedentityname, String derivedlocalspec1name, String derivedlocalspec2name, String derivedlocalspec3name, String derivedlocationname, String derivedprojectname, String derivedpurposename, String derivedspec1name, String derivedspec2name, String derivedspec3name, String dimensioncombnumber, String documentarchivenumber, String duedate, Boolean electroniccollection, String electronicmailaddress, String enterprise, String entityname, String entrycurrency, String entrydate, String entryreconciliationdate, String entrytext, String entrytype, Boolean exported, Boolean exportentry, String giro, String globallocationnumber, String holidaycalendarname, String interestapprovaldate, String interestdate, String interestreminderblock, String interestreminderblockdate, String interestreminderblockedby, String interestreminderprinciple, Integer interestsum, String invoicename, String jobnumber, Integer journallinenumber, Integer journalnumber, String language, Integer linenumber, String linkingrulename, String localspec1name, String localspec2name, String localspec3name, String locationname, String name1, String name2, String name3, String name4, String name5, String openclosed, Integer originalamount, String originalcurrency, String originalduedate, String originline, String originlineinstancekey, String originobject, String originobjectinstancekey, String ourcontact, Boolean overwritecompany, Boolean overwriteentity, Boolean overwritelocalspec1, Boolean overwritelocalspec2, Boolean overwritelocalspec3, Boolean overwritelocation, Boolean overwriteproject, Boolean overwritepurpose, Boolean overwritespec1, Boolean overwritespec2, Boolean overwritespec3, String parentcustomer, String payeridentification, String paymentagent, String paymentcustomer, String paymentterms, String postaldistrict, String postingdate, String postingtime, String projectname, String purposename, String reconciliationdate, String reconciliationstatus, Integer remainderbase, Integer remainderenterprise, Integer remainderoriginal, Integer remainderstandard, String remark, String reminderdate, Integer reminderlevel, String remindertextgroupname, String salespersonnumber, String segment, Boolean selectedforreconciliation, Boolean selectedforreminder, String specification1name, String specification2name, String specification3name, String standardcustomerpaymentmode, String statistic1, String statistic2, String statistic3, String statistic4, String telefax, String telephone, String telex, String text1, String text2, String text3, String text4, String text5, Integer transactionnumber, String transactiontype, Boolean vat, String vatnumber, Integer versionnumber, Integer withholdingtaxbase, Integer withholdingtaxcurrency, Integer withholdingtaxenterprise, String zipcode) {
        super();
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
        this.blocked = blocked;
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
        this.customernumber = customernumber;
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
        this.derivedlocalspec1name = derivedlocalspec1name;
        this.derivedlocalspec2name = derivedlocalspec2name;
        this.derivedlocalspec3name = derivedlocalspec3name;
        this.derivedlocationname = derivedlocationname;
        this.derivedprojectname = derivedprojectname;
        this.derivedpurposename = derivedpurposename;
        this.derivedspec1name = derivedspec1name;
        this.derivedspec2name = derivedspec2name;
        this.derivedspec3name = derivedspec3name;
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
        this.invoicename = invoicename;
        this.jobnumber = jobnumber;
        this.journallinenumber = journallinenumber;
        this.journalnumber = journalnumber;
        this.language = language;
        this.linenumber = linenumber;
        this.linkingrulename = linkingrulename;
        this.localspec1name = localspec1name;
        this.localspec2name = localspec2name;
        this.localspec3name = localspec3name;
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
        this.overwritelocalspec2 = overwritelocalspec2;
        this.overwritelocalspec3 = overwritelocalspec3;
        this.overwritelocation = overwritelocation;
        this.overwriteproject = overwriteproject;
        this.overwritepurpose = overwritepurpose;
        this.overwritespec1 = overwritespec1;
        this.overwritespec2 = overwritespec2;
        this.overwritespec3 = overwritespec3;
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
        this.specification1name = specification1name;
        this.specification2name = specification2name;
        this.specification3name = specification3name;
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

    @JsonProperty("accesslevelname")
    public String getAccesslevelname() {
        return accesslevelname;
    }

    @JsonProperty("accesslevelname")
    public void setAccesslevelname(String accesslevelname) {
        this.accesslevelname = accesslevelname;
    }

    @JsonProperty("accountstatementcustomer")
    public String getAccountstatementcustomer() {
        return accountstatementcustomer;
    }

    @JsonProperty("accountstatementcustomer")
    public void setAccountstatementcustomer(String accountstatementcustomer) {
        this.accountstatementcustomer = accountstatementcustomer;
    }

    @JsonProperty("accountstatementnumber")
    public Integer getAccountstatementnumber() {
        return accountstatementnumber;
    }

    @JsonProperty("accountstatementnumber")
    public void setAccountstatementnumber(Integer accountstatementnumber) {
        this.accountstatementnumber = accountstatementnumber;
    }

    @JsonProperty("accrualcause")
    public String getAccrualcause() {
        return accrualcause;
    }

    @JsonProperty("accrualcause")
    public void setAccrualcause(String accrualcause) {
        this.accrualcause = accrualcause;
    }

    @JsonProperty("accrualremark")
    public String getAccrualremark() {
        return accrualremark;
    }

    @JsonProperty("accrualremark")
    public void setAccrualremark(String accrualremark) {
        this.accrualremark = accrualremark;
    }

    @JsonProperty("accruedtotalbase")
    public Integer getAccruedtotalbase() {
        return accruedtotalbase;
    }

    @JsonProperty("accruedtotalbase")
    public void setAccruedtotalbase(Integer accruedtotalbase) {
        this.accruedtotalbase = accruedtotalbase;
    }

    @JsonProperty("accruedtotalcurrency")
    public Integer getAccruedtotalcurrency() {
        return accruedtotalcurrency;
    }

    @JsonProperty("accruedtotalcurrency")
    public void setAccruedtotalcurrency(Integer accruedtotalcurrency) {
        this.accruedtotalcurrency = accruedtotalcurrency;
    }

    @JsonProperty("accruedtotalenterprise")
    public Integer getAccruedtotalenterprise() {
        return accruedtotalenterprise;
    }

    @JsonProperty("accruedtotalenterprise")
    public void setAccruedtotalenterprise(Integer accruedtotalenterprise) {
        this.accruedtotalenterprise = accruedtotalenterprise;
    }

    @JsonProperty("activestatus")
    public String getActivestatus() {
        return activestatus;
    }

    @JsonProperty("activestatus")
    public void setActivestatus(String activestatus) {
        this.activestatus = activestatus;
    }

    @JsonProperty("activitynumber")
    public String getActivitynumber() {
        return activitynumber;
    }

    @JsonProperty("activitynumber")
    public void setActivitynumber(String activitynumber) {
        this.activitynumber = activitynumber;
    }

    @JsonProperty("agreement")
    public String getAgreement() {
        return agreement;
    }

    @JsonProperty("agreement")
    public void setAgreement(String agreement) {
        this.agreement = agreement;
    }

    @JsonProperty("approvedforreconciliation")
    public Boolean getApprovedforreconciliation() {
        return approvedforreconciliation;
    }

    @JsonProperty("approvedforreconciliation")
    public void setApprovedforreconciliation(Boolean approvedforreconciliation) {
        this.approvedforreconciliation = approvedforreconciliation;
    }

    @JsonProperty("area")
    public String getArea() {
        return area;
    }

    @JsonProperty("area")
    public void setArea(String area) {
        this.area = area;
    }

    @JsonProperty("attention")
    public String getAttention() {
        return attention;
    }

    @JsonProperty("attention")
    public void setAttention(String attention) {
        this.attention = attention;
    }

    @JsonProperty("automaticreconciliation")
    public Boolean getAutomaticreconciliation() {
        return automaticreconciliation;
    }

    @JsonProperty("automaticreconciliation")
    public void setAutomaticreconciliation(Boolean automaticreconciliation) {
        this.automaticreconciliation = automaticreconciliation;
    }

    @JsonProperty("beingcollectedbase")
    public Integer getBeingcollectedbase() {
        return beingcollectedbase;
    }

    @JsonProperty("beingcollectedbase")
    public void setBeingcollectedbase(Integer beingcollectedbase) {
        this.beingcollectedbase = beingcollectedbase;
    }

    @JsonProperty("beingcollectedcurrency")
    public Integer getBeingcollectedcurrency() {
        return beingcollectedcurrency;
    }

    @JsonProperty("beingcollectedcurrency")
    public void setBeingcollectedcurrency(Integer beingcollectedcurrency) {
        this.beingcollectedcurrency = beingcollectedcurrency;
    }

    @JsonProperty("beingcollectedenterprise")
    public Integer getBeingcollectedenterprise() {
        return beingcollectedenterprise;
    }

    @JsonProperty("beingcollectedenterprise")
    public void setBeingcollectedenterprise(Integer beingcollectedenterprise) {
        this.beingcollectedenterprise = beingcollectedenterprise;
    }

    @JsonProperty("beingcollectedoriginal")
    public Integer getBeingcollectedoriginal() {
        return beingcollectedoriginal;
    }

    @JsonProperty("beingcollectedoriginal")
    public void setBeingcollectedoriginal(Integer beingcollectedoriginal) {
        this.beingcollectedoriginal = beingcollectedoriginal;
    }

    @JsonProperty("blocked")
    public Boolean getBlocked() {
        return blocked;
    }

    @JsonProperty("blocked")
    public void setBlocked(Boolean blocked) {
        this.blocked = blocked;
    }

    @JsonProperty("boolean1")
    public Boolean getBoolean1() {
        return boolean1;
    }

    @JsonProperty("boolean1")
    public void setBoolean1(Boolean boolean1) {
        this.boolean1 = boolean1;
    }

    @JsonProperty("boolean2")
    public Boolean getBoolean2() {
        return boolean2;
    }

    @JsonProperty("boolean2")
    public void setBoolean2(Boolean boolean2) {
        this.boolean2 = boolean2;
    }

    @JsonProperty("boolean3")
    public Boolean getBoolean3() {
        return boolean3;
    }

    @JsonProperty("boolean3")
    public void setBoolean3(Boolean boolean3) {
        this.boolean3 = boolean3;
    }

    @JsonProperty("boolean4")
    public Boolean getBoolean4() {
        return boolean4;
    }

    @JsonProperty("boolean4")
    public void setBoolean4(Boolean boolean4) {
        this.boolean4 = boolean4;
    }

    @JsonProperty("boolean5")
    public Boolean getBoolean5() {
        return boolean5;
    }

    @JsonProperty("boolean5")
    public void setBoolean5(Boolean boolean5) {
        this.boolean5 = boolean5;
    }

    @JsonProperty("cashdiscountcode")
    public String getCashdiscountcode() {
        return cashdiscountcode;
    }

    @JsonProperty("cashdiscountcode")
    public void setCashdiscountcode(String cashdiscountcode) {
        this.cashdiscountcode = cashdiscountcode;
    }

    @JsonProperty("changedby")
    public String getChangedby() {
        return changedby;
    }

    @JsonProperty("changedby")
    public void setChangedby(String changedby) {
        this.changedby = changedby;
    }

    @JsonProperty("changeddate")
    public String getChangeddate() {
        return changeddate;
    }

    @JsonProperty("changeddate")
    public void setChangeddate(String changeddate) {
        this.changeddate = changeddate;
    }

    @JsonProperty("cnrnumber")
    public String getCnrnumber() {
        return cnrnumber;
    }

    @JsonProperty("cnrnumber")
    public void setCnrnumber(String cnrnumber) {
        this.cnrnumber = cnrnumber;
    }

    @JsonProperty("collectionagreementnumber")
    public String getCollectionagreementnumber() {
        return collectionagreementnumber;
    }

    @JsonProperty("collectionagreementnumber")
    public void setCollectionagreementnumber(String collectionagreementnumber) {
        this.collectionagreementnumber = collectionagreementnumber;
    }

    @JsonProperty("collectioncurrency")
    public Integer getCollectioncurrency() {
        return collectioncurrency;
    }

    @JsonProperty("collectioncurrency")
    public void setCollectioncurrency(Integer collectioncurrency) {
        this.collectioncurrency = collectioncurrency;
    }

    @JsonProperty("collectiongroupnumber")
    public String getCollectiongroupnumber() {
        return collectiongroupnumber;
    }

    @JsonProperty("collectiongroupnumber")
    public void setCollectiongroupnumber(String collectiongroupnumber) {
        this.collectiongroupnumber = collectiongroupnumber;
    }

    @JsonProperty("companycurrency")
    public String getCompanycurrency() {
        return companycurrency;
    }

    @JsonProperty("companycurrency")
    public void setCompanycurrency(String companycurrency) {
        this.companycurrency = companycurrency;
    }

    @JsonProperty("companycustomercustomerlinking")
    public String getCompanycustomercustomerlinking() {
        return companycustomercustomerlinking;
    }

    @JsonProperty("companycustomercustomerlinking")
    public void setCompanycustomercustomerlinking(String companycustomercustomerlinking) {
        this.companycustomercustomerlinking = companycustomercustomerlinking;
    }

    @JsonProperty("companynumber")
    public String getCompanynumber() {
        return companynumber;
    }

    @JsonProperty("companynumber")
    public void setCompanynumber(String companynumber) {
        this.companynumber = companynumber;
    }

    @JsonProperty("companyoforigin")
    public String getCompanyoforigin() {
        return companyoforigin;
    }

    @JsonProperty("companyoforigin")
    public void setCompanyoforigin(String companyoforigin) {
        this.companyoforigin = companyoforigin;
    }

    @JsonProperty("companyregistrationnumber")
    public String getCompanyregistrationnumber() {
        return companyregistrationnumber;
    }

    @JsonProperty("companyregistrationnumber")
    public void setCompanyregistrationnumber(String companyregistrationnumber) {
        this.companyregistrationnumber = companyregistrationnumber;
    }

    @JsonProperty("companyvatcode")
    public String getCompanyvatcode() {
        return companyvatcode;
    }

    @JsonProperty("companyvatcode")
    public void setCompanyvatcode(String companyvatcode) {
        this.companyvatcode = companyvatcode;
    }

    @JsonProperty("contactperson")
    public String getContactperson() {
        return contactperson;
    }

    @JsonProperty("contactperson")
    public void setContactperson(String contactperson) {
        this.contactperson = contactperson;
    }

    @JsonProperty("controlaccountcode")
    public String getControlaccountcode() {
        return controlaccountcode;
    }

    @JsonProperty("controlaccountcode")
    public void setControlaccountcode(String controlaccountcode) {
        this.controlaccountcode = controlaccountcode;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("createdby")
    public String getCreatedby() {
        return createdby;
    }

    @JsonProperty("createdby")
    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    @JsonProperty("createddate")
    public String getCreateddate() {
        return createddate;
    }

    @JsonProperty("createddate")
    public void setCreateddate(String createddate) {
        this.createddate = createddate;
    }

    @JsonProperty("creditbase")
    public Integer getCreditbase() {
        return creditbase;
    }

    @JsonProperty("creditbase")
    public void setCreditbase(Integer creditbase) {
        this.creditbase = creditbase;
    }

    @JsonProperty("creditcardexpirydate")
    public String getCreditcardexpirydate() {
        return creditcardexpirydate;
    }

    @JsonProperty("creditcardexpirydate")
    public void setCreditcardexpirydate(String creditcardexpirydate) {
        this.creditcardexpirydate = creditcardexpirydate;
    }

    @JsonProperty("creditcardnumber")
    public String getCreditcardnumber() {
        return creditcardnumber;
    }

    @JsonProperty("creditcardnumber")
    public void setCreditcardnumber(String creditcardnumber) {
        this.creditcardnumber = creditcardnumber;
    }

    @JsonProperty("creditenterprise")
    public Integer getCreditenterprise() {
        return creditenterprise;
    }

    @JsonProperty("creditenterprise")
    public void setCreditenterprise(Integer creditenterprise) {
        this.creditenterprise = creditenterprise;
    }

    @JsonProperty("creditstandard")
    public Integer getCreditstandard() {
        return creditstandard;
    }

    @JsonProperty("creditstandard")
    public void setCreditstandard(Integer creditstandard) {
        this.creditstandard = creditstandard;
    }

    @JsonProperty("customergroup")
    public String getCustomergroup() {
        return customergroup;
    }

    @JsonProperty("customergroup")
    public void setCustomergroup(String customergroup) {
        this.customergroup = customergroup;
    }

    @JsonProperty("customernumber")
    public String getCustomernumber() {
        return customernumber;
    }

    @JsonProperty("customernumber")
    public void setCustomernumber(String customernumber) {
        this.customernumber = customernumber;
    }

    @JsonProperty("customerpayeridentifcation")
    public String getCustomerpayeridentifcation() {
        return customerpayeridentifcation;
    }

    @JsonProperty("customerpayeridentifcation")
    public void setCustomerpayeridentifcation(String customerpayeridentifcation) {
        this.customerpayeridentifcation = customerpayeridentifcation;
    }

    @JsonProperty("customerpaymentmode")
    public String getCustomerpaymentmode() {
        return customerpaymentmode;
    }

    @JsonProperty("customerpaymentmode")
    public void setCustomerpaymentmode(String customerpaymentmode) {
        this.customerpaymentmode = customerpaymentmode;
    }

    @JsonProperty("customerpaymentreference")
    public String getCustomerpaymentreference() {
        return customerpaymentreference;
    }

    @JsonProperty("customerpaymentreference")
    public void setCustomerpaymentreference(String customerpaymentreference) {
        this.customerpaymentreference = customerpaymentreference;
    }

    @JsonProperty("customerpopup1")
    public String getCustomerpopup1() {
        return customerpopup1;
    }

    @JsonProperty("customerpopup1")
    public void setCustomerpopup1(String customerpopup1) {
        this.customerpopup1 = customerpopup1;
    }

    @JsonProperty("customerpopup2")
    public String getCustomerpopup2() {
        return customerpopup2;
    }

    @JsonProperty("customerpopup2")
    public void setCustomerpopup2(String customerpopup2) {
        this.customerpopup2 = customerpopup2;
    }

    @JsonProperty("customerpopup3")
    public String getCustomerpopup3() {
        return customerpopup3;
    }

    @JsonProperty("customerpopup3")
    public void setCustomerpopup3(String customerpopup3) {
        this.customerpopup3 = customerpopup3;
    }

    @JsonProperty("customerpopup4")
    public String getCustomerpopup4() {
        return customerpopup4;
    }

    @JsonProperty("customerpopup4")
    public void setCustomerpopup4(String customerpopup4) {
        this.customerpopup4 = customerpopup4;
    }

    @JsonProperty("customerpopup5")
    public String getCustomerpopup5() {
        return customerpopup5;
    }

    @JsonProperty("customerpopup5")
    public void setCustomerpopup5(String customerpopup5) {
        this.customerpopup5 = customerpopup5;
    }

    @JsonProperty("customerremark")
    public String getCustomerremark() {
        return customerremark;
    }

    @JsonProperty("customerremark")
    public void setCustomerremark(String customerremark) {
        this.customerremark = customerremark;
    }

    @JsonProperty("customerremark1")
    public String getCustomerremark1() {
        return customerremark1;
    }

    @JsonProperty("customerremark1")
    public void setCustomerremark1(String customerremark1) {
        this.customerremark1 = customerremark1;
    }

    @JsonProperty("customerremark10")
    public String getCustomerremark10() {
        return customerremark10;
    }

    @JsonProperty("customerremark10")
    public void setCustomerremark10(String customerremark10) {
        this.customerremark10 = customerremark10;
    }

    @JsonProperty("customerremark2")
    public String getCustomerremark2() {
        return customerremark2;
    }

    @JsonProperty("customerremark2")
    public void setCustomerremark2(String customerremark2) {
        this.customerremark2 = customerremark2;
    }

    @JsonProperty("customerremark3")
    public String getCustomerremark3() {
        return customerremark3;
    }

    @JsonProperty("customerremark3")
    public void setCustomerremark3(String customerremark3) {
        this.customerremark3 = customerremark3;
    }

    @JsonProperty("customerremark4")
    public String getCustomerremark4() {
        return customerremark4;
    }

    @JsonProperty("customerremark4")
    public void setCustomerremark4(String customerremark4) {
        this.customerremark4 = customerremark4;
    }

    @JsonProperty("customerremark5")
    public String getCustomerremark5() {
        return customerremark5;
    }

    @JsonProperty("customerremark5")
    public void setCustomerremark5(String customerremark5) {
        this.customerremark5 = customerremark5;
    }

    @JsonProperty("customerremark6")
    public String getCustomerremark6() {
        return customerremark6;
    }

    @JsonProperty("customerremark6")
    public void setCustomerremark6(String customerremark6) {
        this.customerremark6 = customerremark6;
    }

    @JsonProperty("customerremark7")
    public String getCustomerremark7() {
        return customerremark7;
    }

    @JsonProperty("customerremark7")
    public void setCustomerremark7(String customerremark7) {
        this.customerremark7 = customerremark7;
    }

    @JsonProperty("customerremark8")
    public String getCustomerremark8() {
        return customerremark8;
    }

    @JsonProperty("customerremark8")
    public void setCustomerremark8(String customerremark8) {
        this.customerremark8 = customerremark8;
    }

    @JsonProperty("customerremark9")
    public String getCustomerremark9() {
        return customerremark9;
    }

    @JsonProperty("customerremark9")
    public void setCustomerremark9(String customerremark9) {
        this.customerremark9 = customerremark9;
    }

    @JsonProperty("customerreminderlevel")
    public Integer getCustomerreminderlevel() {
        return customerreminderlevel;
    }

    @JsonProperty("customerreminderlevel")
    public void setCustomerreminderlevel(Integer customerreminderlevel) {
        this.customerreminderlevel = customerreminderlevel;
    }

    @JsonProperty("customertype")
    public String getCustomertype() {
        return customertype;
    }

    @JsonProperty("customertype")
    public void setCustomertype(String customertype) {
        this.customertype = customertype;
    }

    @JsonProperty("debitbase")
    public Integer getDebitbase() {
        return debitbase;
    }

    @JsonProperty("debitbase")
    public void setDebitbase(Integer debitbase) {
        this.debitbase = debitbase;
    }

    @JsonProperty("debitenterprise")
    public Integer getDebitenterprise() {
        return debitenterprise;
    }

    @JsonProperty("debitenterprise")
    public void setDebitenterprise(Integer debitenterprise) {
        this.debitenterprise = debitenterprise;
    }

    @JsonProperty("debitstandard")
    public Integer getDebitstandard() {
        return debitstandard;
    }

    @JsonProperty("debitstandard")
    public void setDebitstandard(Integer debitstandard) {
        this.debitstandard = debitstandard;
    }

    @JsonProperty("departmentnumber")
    public String getDepartmentnumber() {
        return departmentnumber;
    }

    @JsonProperty("departmentnumber")
    public void setDepartmentnumber(String departmentnumber) {
        this.departmentnumber = departmentnumber;
    }

    @JsonProperty("derivedcompanynumber")
    public String getDerivedcompanynumber() {
        return derivedcompanynumber;
    }

    @JsonProperty("derivedcompanynumber")
    public void setDerivedcompanynumber(String derivedcompanynumber) {
        this.derivedcompanynumber = derivedcompanynumber;
    }

    @JsonProperty("derivedentityname")
    public String getDerivedentityname() {
        return derivedentityname;
    }

    @JsonProperty("derivedentityname")
    public void setDerivedentityname(String derivedentityname) {
        this.derivedentityname = derivedentityname;
    }

    @JsonProperty("derivedlocalspec1name")
    public String getDerivedlocalspec1name() {
        return derivedlocalspec1name;
    }

    @JsonProperty("derivedlocalspec1name")
    public void setDerivedlocalspec1name(String derivedlocalspec1name) {
        this.derivedlocalspec1name = derivedlocalspec1name;
    }

    @JsonProperty("derivedlocalspec2name")
    public String getDerivedlocalspec2name() {
        return derivedlocalspec2name;
    }

    @JsonProperty("derivedlocalspec2name")
    public void setDerivedlocalspec2name(String derivedlocalspec2name) {
        this.derivedlocalspec2name = derivedlocalspec2name;
    }

    @JsonProperty("derivedlocalspec3name")
    public String getDerivedlocalspec3name() {
        return derivedlocalspec3name;
    }

    @JsonProperty("derivedlocalspec3name")
    public void setDerivedlocalspec3name(String derivedlocalspec3name) {
        this.derivedlocalspec3name = derivedlocalspec3name;
    }

    @JsonProperty("derivedlocationname")
    public String getDerivedlocationname() {
        return derivedlocationname;
    }

    @JsonProperty("derivedlocationname")
    public void setDerivedlocationname(String derivedlocationname) {
        this.derivedlocationname = derivedlocationname;
    }

    @JsonProperty("derivedprojectname")
    public String getDerivedprojectname() {
        return derivedprojectname;
    }

    @JsonProperty("derivedprojectname")
    public void setDerivedprojectname(String derivedprojectname) {
        this.derivedprojectname = derivedprojectname;
    }

    @JsonProperty("derivedpurposename")
    public String getDerivedpurposename() {
        return derivedpurposename;
    }

    @JsonProperty("derivedpurposename")
    public void setDerivedpurposename(String derivedpurposename) {
        this.derivedpurposename = derivedpurposename;
    }

    @JsonProperty("derivedspec1name")
    public String getDerivedspec1name() {
        return derivedspec1name;
    }

    @JsonProperty("derivedspec1name")
    public void setDerivedspec1name(String derivedspec1name) {
        this.derivedspec1name = derivedspec1name;
    }

    @JsonProperty("derivedspec2name")
    public String getDerivedspec2name() {
        return derivedspec2name;
    }

    @JsonProperty("derivedspec2name")
    public void setDerivedspec2name(String derivedspec2name) {
        this.derivedspec2name = derivedspec2name;
    }

    @JsonProperty("derivedspec3name")
    public String getDerivedspec3name() {
        return derivedspec3name;
    }

    @JsonProperty("derivedspec3name")
    public void setDerivedspec3name(String derivedspec3name) {
        this.derivedspec3name = derivedspec3name;
    }

    @JsonProperty("dimensioncombnumber")
    public String getDimensioncombnumber() {
        return dimensioncombnumber;
    }

    @JsonProperty("dimensioncombnumber")
    public void setDimensioncombnumber(String dimensioncombnumber) {
        this.dimensioncombnumber = dimensioncombnumber;
    }

    @JsonProperty("documentarchivenumber")
    public String getDocumentarchivenumber() {
        return documentarchivenumber;
    }

    @JsonProperty("documentarchivenumber")
    public void setDocumentarchivenumber(String documentarchivenumber) {
        this.documentarchivenumber = documentarchivenumber;
    }

    @JsonProperty("duedate")
    public String getDuedate() {
        return duedate;
    }

    @JsonProperty("duedate")
    public void setDuedate(String duedate) {
        this.duedate = duedate;
    }

    @JsonProperty("electroniccollection")
    public Boolean getElectroniccollection() {
        return electroniccollection;
    }

    @JsonProperty("electroniccollection")
    public void setElectroniccollection(Boolean electroniccollection) {
        this.electroniccollection = electroniccollection;
    }

    @JsonProperty("electronicmailaddress")
    public String getElectronicmailaddress() {
        return electronicmailaddress;
    }

    @JsonProperty("electronicmailaddress")
    public void setElectronicmailaddress(String electronicmailaddress) {
        this.electronicmailaddress = electronicmailaddress;
    }

    @JsonProperty("enterprise")
    public String getEnterprise() {
        return enterprise;
    }

    @JsonProperty("enterprise")
    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise;
    }

    @JsonProperty("entityname")
    public String getEntityname() {
        return entityname;
    }

    @JsonProperty("entityname")
    public void setEntityname(String entityname) {
        this.entityname = entityname;
    }

    @JsonProperty("entrycurrency")
    public String getEntrycurrency() {
        return entrycurrency;
    }

    @JsonProperty("entrycurrency")
    public void setEntrycurrency(String entrycurrency) {
        this.entrycurrency = entrycurrency;
    }

    @JsonProperty("entrydate")
    public String getEntrydate() {
        return entrydate;
    }

    @JsonProperty("entrydate")
    public void setEntrydate(String entrydate) {
        this.entrydate = entrydate;
    }

    @JsonProperty("entryreconciliationdate")
    public String getEntryreconciliationdate() {
        return entryreconciliationdate;
    }

    @JsonProperty("entryreconciliationdate")
    public void setEntryreconciliationdate(String entryreconciliationdate) {
        this.entryreconciliationdate = entryreconciliationdate;
    }

    @JsonProperty("entrytext")
    public String getEntrytext() {
        return entrytext;
    }

    @JsonProperty("entrytext")
    public void setEntrytext(String entrytext) {
        this.entrytext = entrytext;
    }

    @JsonProperty("entrytype")
    public String getEntrytype() {
        return entrytype;
    }

    @JsonProperty("entrytype")
    public void setEntrytype(String entrytype) {
        this.entrytype = entrytype;
    }

    @JsonProperty("exported")
    public Boolean getExported() {
        return exported;
    }

    @JsonProperty("exported")
    public void setExported(Boolean exported) {
        this.exported = exported;
    }

    @JsonProperty("exportentry")
    public Boolean getExportentry() {
        return exportentry;
    }

    @JsonProperty("exportentry")
    public void setExportentry(Boolean exportentry) {
        this.exportentry = exportentry;
    }

    @JsonProperty("giro")
    public String getGiro() {
        return giro;
    }

    @JsonProperty("giro")
    public void setGiro(String giro) {
        this.giro = giro;
    }

    @JsonProperty("globallocationnumber")
    public String getGloballocationnumber() {
        return globallocationnumber;
    }

    @JsonProperty("globallocationnumber")
    public void setGloballocationnumber(String globallocationnumber) {
        this.globallocationnumber = globallocationnumber;
    }

    @JsonProperty("holidaycalendarname")
    public String getHolidaycalendarname() {
        return holidaycalendarname;
    }

    @JsonProperty("holidaycalendarname")
    public void setHolidaycalendarname(String holidaycalendarname) {
        this.holidaycalendarname = holidaycalendarname;
    }

    @JsonProperty("interestapprovaldate")
    public String getInterestapprovaldate() {
        return interestapprovaldate;
    }

    @JsonProperty("interestapprovaldate")
    public void setInterestapprovaldate(String interestapprovaldate) {
        this.interestapprovaldate = interestapprovaldate;
    }

    @JsonProperty("interestdate")
    public String getInterestdate() {
        return interestdate;
    }

    @JsonProperty("interestdate")
    public void setInterestdate(String interestdate) {
        this.interestdate = interestdate;
    }

    @JsonProperty("interestreminderblock")
    public String getInterestreminderblock() {
        return interestreminderblock;
    }

    @JsonProperty("interestreminderblock")
    public void setInterestreminderblock(String interestreminderblock) {
        this.interestreminderblock = interestreminderblock;
    }

    @JsonProperty("interestreminderblockdate")
    public String getInterestreminderblockdate() {
        return interestreminderblockdate;
    }

    @JsonProperty("interestreminderblockdate")
    public void setInterestreminderblockdate(String interestreminderblockdate) {
        this.interestreminderblockdate = interestreminderblockdate;
    }

    @JsonProperty("interestreminderblockedby")
    public String getInterestreminderblockedby() {
        return interestreminderblockedby;
    }

    @JsonProperty("interestreminderblockedby")
    public void setInterestreminderblockedby(String interestreminderblockedby) {
        this.interestreminderblockedby = interestreminderblockedby;
    }

    @JsonProperty("interestreminderprinciple")
    public String getInterestreminderprinciple() {
        return interestreminderprinciple;
    }

    @JsonProperty("interestreminderprinciple")
    public void setInterestreminderprinciple(String interestreminderprinciple) {
        this.interestreminderprinciple = interestreminderprinciple;
    }

    @JsonProperty("interestsum")
    public Integer getInterestsum() {
        return interestsum;
    }

    @JsonProperty("interestsum")
    public void setInterestsum(Integer interestsum) {
        this.interestsum = interestsum;
    }

    @JsonProperty("invoicename")
    public String getInvoicename() {
        return invoicename;
    }

    @JsonProperty("invoicename")
    public void setInvoicename(String invoicename) {
        this.invoicename = invoicename;
    }

    @JsonProperty("jobnumber")
    public String getJobnumber() {
        return jobnumber;
    }

    @JsonProperty("jobnumber")
    public void setJobnumber(String jobnumber) {
        this.jobnumber = jobnumber;
    }

    @JsonProperty("journallinenumber")
    public Integer getJournallinenumber() {
        return journallinenumber;
    }

    @JsonProperty("journallinenumber")
    public void setJournallinenumber(Integer journallinenumber) {
        this.journallinenumber = journallinenumber;
    }

    @JsonProperty("journalnumber")
    public Integer getJournalnumber() {
        return journalnumber;
    }

    @JsonProperty("journalnumber")
    public void setJournalnumber(Integer journalnumber) {
        this.journalnumber = journalnumber;
    }

    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty("linenumber")
    public Integer getLinenumber() {
        return linenumber;
    }

    @JsonProperty("linenumber")
    public void setLinenumber(Integer linenumber) {
        this.linenumber = linenumber;
    }

    @JsonProperty("linkingrulename")
    public String getLinkingrulename() {
        return linkingrulename;
    }

    @JsonProperty("linkingrulename")
    public void setLinkingrulename(String linkingrulename) {
        this.linkingrulename = linkingrulename;
    }

    @JsonProperty("localspec1name")
    public String getLocalspec1name() {
        return localspec1name;
    }

    @JsonProperty("localspec1name")
    public void setLocalspec1name(String localspec1name) {
        this.localspec1name = localspec1name;
    }

    @JsonProperty("localspec2name")
    public String getLocalspec2name() {
        return localspec2name;
    }

    @JsonProperty("localspec2name")
    public void setLocalspec2name(String localspec2name) {
        this.localspec2name = localspec2name;
    }

    @JsonProperty("localspec3name")
    public String getLocalspec3name() {
        return localspec3name;
    }

    @JsonProperty("localspec3name")
    public void setLocalspec3name(String localspec3name) {
        this.localspec3name = localspec3name;
    }

    @JsonProperty("locationname")
    public String getLocationname() {
        return locationname;
    }

    @JsonProperty("locationname")
    public void setLocationname(String locationname) {
        this.locationname = locationname;
    }

    @JsonProperty("name1")
    public String getName1() {
        return name1;
    }

    @JsonProperty("name1")
    public void setName1(String name1) {
        this.name1 = name1;
    }

    @JsonProperty("name2")
    public String getName2() {
        return name2;
    }

    @JsonProperty("name2")
    public void setName2(String name2) {
        this.name2 = name2;
    }

    @JsonProperty("name3")
    public String getName3() {
        return name3;
    }

    @JsonProperty("name3")
    public void setName3(String name3) {
        this.name3 = name3;
    }

    @JsonProperty("name4")
    public String getName4() {
        return name4;
    }

    @JsonProperty("name4")
    public void setName4(String name4) {
        this.name4 = name4;
    }

    @JsonProperty("name5")
    public String getName5() {
        return name5;
    }

    @JsonProperty("name5")
    public void setName5(String name5) {
        this.name5 = name5;
    }

    @JsonProperty("openclosed")
    public String getOpenclosed() {
        return openclosed;
    }

    @JsonProperty("openclosed")
    public void setOpenclosed(String openclosed) {
        this.openclosed = openclosed;
    }

    @JsonProperty("originalamount")
    public Integer getOriginalamount() {
        return originalamount;
    }

    @JsonProperty("originalamount")
    public void setOriginalamount(Integer originalamount) {
        this.originalamount = originalamount;
    }

    @JsonProperty("originalcurrency")
    public String getOriginalcurrency() {
        return originalcurrency;
    }

    @JsonProperty("originalcurrency")
    public void setOriginalcurrency(String originalcurrency) {
        this.originalcurrency = originalcurrency;
    }

    @JsonProperty("originalduedate")
    public String getOriginalduedate() {
        return originalduedate;
    }

    @JsonProperty("originalduedate")
    public void setOriginalduedate(String originalduedate) {
        this.originalduedate = originalduedate;
    }

    @JsonProperty("originline")
    public String getOriginline() {
        return originline;
    }

    @JsonProperty("originline")
    public void setOriginline(String originline) {
        this.originline = originline;
    }

    @JsonProperty("originlineinstancekey")
    public String getOriginlineinstancekey() {
        return originlineinstancekey;
    }

    @JsonProperty("originlineinstancekey")
    public void setOriginlineinstancekey(String originlineinstancekey) {
        this.originlineinstancekey = originlineinstancekey;
    }

    @JsonProperty("originobject")
    public String getOriginobject() {
        return originobject;
    }

    @JsonProperty("originobject")
    public void setOriginobject(String originobject) {
        this.originobject = originobject;
    }

    @JsonProperty("originobjectinstancekey")
    public String getOriginobjectinstancekey() {
        return originobjectinstancekey;
    }

    @JsonProperty("originobjectinstancekey")
    public void setOriginobjectinstancekey(String originobjectinstancekey) {
        this.originobjectinstancekey = originobjectinstancekey;
    }

    @JsonProperty("ourcontact")
    public String getOurcontact() {
        return ourcontact;
    }

    @JsonProperty("ourcontact")
    public void setOurcontact(String ourcontact) {
        this.ourcontact = ourcontact;
    }

    @JsonProperty("overwritecompany")
    public Boolean getOverwritecompany() {
        return overwritecompany;
    }

    @JsonProperty("overwritecompany")
    public void setOverwritecompany(Boolean overwritecompany) {
        this.overwritecompany = overwritecompany;
    }

    @JsonProperty("overwriteentity")
    public Boolean getOverwriteentity() {
        return overwriteentity;
    }

    @JsonProperty("overwriteentity")
    public void setOverwriteentity(Boolean overwriteentity) {
        this.overwriteentity = overwriteentity;
    }

    @JsonProperty("overwritelocalspec1")
    public Boolean getOverwritelocalspec1() {
        return overwritelocalspec1;
    }

    @JsonProperty("overwritelocalspec1")
    public void setOverwritelocalspec1(Boolean overwritelocalspec1) {
        this.overwritelocalspec1 = overwritelocalspec1;
    }

    @JsonProperty("overwritelocalspec2")
    public Boolean getOverwritelocalspec2() {
        return overwritelocalspec2;
    }

    @JsonProperty("overwritelocalspec2")
    public void setOverwritelocalspec2(Boolean overwritelocalspec2) {
        this.overwritelocalspec2 = overwritelocalspec2;
    }

    @JsonProperty("overwritelocalspec3")
    public Boolean getOverwritelocalspec3() {
        return overwritelocalspec3;
    }

    @JsonProperty("overwritelocalspec3")
    public void setOverwritelocalspec3(Boolean overwritelocalspec3) {
        this.overwritelocalspec3 = overwritelocalspec3;
    }

    @JsonProperty("overwritelocation")
    public Boolean getOverwritelocation() {
        return overwritelocation;
    }

    @JsonProperty("overwritelocation")
    public void setOverwritelocation(Boolean overwritelocation) {
        this.overwritelocation = overwritelocation;
    }

    @JsonProperty("overwriteproject")
    public Boolean getOverwriteproject() {
        return overwriteproject;
    }

    @JsonProperty("overwriteproject")
    public void setOverwriteproject(Boolean overwriteproject) {
        this.overwriteproject = overwriteproject;
    }

    @JsonProperty("overwritepurpose")
    public Boolean getOverwritepurpose() {
        return overwritepurpose;
    }

    @JsonProperty("overwritepurpose")
    public void setOverwritepurpose(Boolean overwritepurpose) {
        this.overwritepurpose = overwritepurpose;
    }

    @JsonProperty("overwritespec1")
    public Boolean getOverwritespec1() {
        return overwritespec1;
    }

    @JsonProperty("overwritespec1")
    public void setOverwritespec1(Boolean overwritespec1) {
        this.overwritespec1 = overwritespec1;
    }

    @JsonProperty("overwritespec2")
    public Boolean getOverwritespec2() {
        return overwritespec2;
    }

    @JsonProperty("overwritespec2")
    public void setOverwritespec2(Boolean overwritespec2) {
        this.overwritespec2 = overwritespec2;
    }

    @JsonProperty("overwritespec3")
    public Boolean getOverwritespec3() {
        return overwritespec3;
    }

    @JsonProperty("overwritespec3")
    public void setOverwritespec3(Boolean overwritespec3) {
        this.overwritespec3 = overwritespec3;
    }

    @JsonProperty("parentcustomer")
    public String getParentcustomer() {
        return parentcustomer;
    }

    @JsonProperty("parentcustomer")
    public void setParentcustomer(String parentcustomer) {
        this.parentcustomer = parentcustomer;
    }

    @JsonProperty("payeridentification")
    public String getPayeridentification() {
        return payeridentification;
    }

    @JsonProperty("payeridentification")
    public void setPayeridentification(String payeridentification) {
        this.payeridentification = payeridentification;
    }

    @JsonProperty("paymentagent")
    public String getPaymentagent() {
        return paymentagent;
    }

    @JsonProperty("paymentagent")
    public void setPaymentagent(String paymentagent) {
        this.paymentagent = paymentagent;
    }

    @JsonProperty("paymentcustomer")
    public String getPaymentcustomer() {
        return paymentcustomer;
    }

    @JsonProperty("paymentcustomer")
    public void setPaymentcustomer(String paymentcustomer) {
        this.paymentcustomer = paymentcustomer;
    }

    @JsonProperty("paymentterms")
    public String getPaymentterms() {
        return paymentterms;
    }

    @JsonProperty("paymentterms")
    public void setPaymentterms(String paymentterms) {
        this.paymentterms = paymentterms;
    }

    @JsonProperty("postaldistrict")
    public String getPostaldistrict() {
        return postaldistrict;
    }

    @JsonProperty("postaldistrict")
    public void setPostaldistrict(String postaldistrict) {
        this.postaldistrict = postaldistrict;
    }

    @JsonProperty("postingdate")
    public String getPostingdate() {
        return postingdate;
    }

    @JsonProperty("postingdate")
    public void setPostingdate(String postingdate) {
        this.postingdate = postingdate;
    }

    @JsonProperty("postingtime")
    public String getPostingtime() {
        return postingtime;
    }

    @JsonProperty("postingtime")
    public void setPostingtime(String postingtime) {
        this.postingtime = postingtime;
    }

    @JsonProperty("projectname")
    public String getProjectname() {
        return projectname;
    }

    @JsonProperty("projectname")
    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    @JsonProperty("purposename")
    public String getPurposename() {
        return purposename;
    }

    @JsonProperty("purposename")
    public void setPurposename(String purposename) {
        this.purposename = purposename;
    }

    @JsonProperty("reconciliationdate")
    public String getReconciliationdate() {
        return reconciliationdate;
    }

    @JsonProperty("reconciliationdate")
    public void setReconciliationdate(String reconciliationdate) {
        this.reconciliationdate = reconciliationdate;
    }

    @JsonProperty("reconciliationstatus")
    public String getReconciliationstatus() {
        return reconciliationstatus;
    }

    @JsonProperty("reconciliationstatus")
    public void setReconciliationstatus(String reconciliationstatus) {
        this.reconciliationstatus = reconciliationstatus;
    }

    @JsonProperty("remainderbase")
    public Integer getRemainderbase() {
        return remainderbase;
    }

    @JsonProperty("remainderbase")
    public void setRemainderbase(Integer remainderbase) {
        this.remainderbase = remainderbase;
    }

    @JsonProperty("remainderenterprise")
    public Integer getRemainderenterprise() {
        return remainderenterprise;
    }

    @JsonProperty("remainderenterprise")
    public void setRemainderenterprise(Integer remainderenterprise) {
        this.remainderenterprise = remainderenterprise;
    }

    @JsonProperty("remainderoriginal")
    public Integer getRemainderoriginal() {
        return remainderoriginal;
    }

    @JsonProperty("remainderoriginal")
    public void setRemainderoriginal(Integer remainderoriginal) {
        this.remainderoriginal = remainderoriginal;
    }

    @JsonProperty("remainderstandard")
    public Integer getRemainderstandard() {
        return remainderstandard;
    }

    @JsonProperty("remainderstandard")
    public void setRemainderstandard(Integer remainderstandard) {
        this.remainderstandard = remainderstandard;
    }

    @JsonProperty("remark")
    public String getRemark() {
        return remark;
    }

    @JsonProperty("remark")
    public void setRemark(String remark) {
        this.remark = remark;
    }

    @JsonProperty("reminderdate")
    public String getReminderdate() {
        return reminderdate;
    }

    @JsonProperty("reminderdate")
    public void setReminderdate(String reminderdate) {
        this.reminderdate = reminderdate;
    }

    @JsonProperty("reminderlevel")
    public Integer getReminderlevel() {
        return reminderlevel;
    }

    @JsonProperty("reminderlevel")
    public void setReminderlevel(Integer reminderlevel) {
        this.reminderlevel = reminderlevel;
    }

    @JsonProperty("remindertextgroupname")
    public String getRemindertextgroupname() {
        return remindertextgroupname;
    }

    @JsonProperty("remindertextgroupname")
    public void setRemindertextgroupname(String remindertextgroupname) {
        this.remindertextgroupname = remindertextgroupname;
    }

    @JsonProperty("salespersonnumber")
    public String getSalespersonnumber() {
        return salespersonnumber;
    }

    @JsonProperty("salespersonnumber")
    public void setSalespersonnumber(String salespersonnumber) {
        this.salespersonnumber = salespersonnumber;
    }

    @JsonProperty("segment")
    public String getSegment() {
        return segment;
    }

    @JsonProperty("segment")
    public void setSegment(String segment) {
        this.segment = segment;
    }

    @JsonProperty("selectedforreconciliation")
    public Boolean getSelectedforreconciliation() {
        return selectedforreconciliation;
    }

    @JsonProperty("selectedforreconciliation")
    public void setSelectedforreconciliation(Boolean selectedforreconciliation) {
        this.selectedforreconciliation = selectedforreconciliation;
    }

    @JsonProperty("selectedforreminder")
    public Boolean getSelectedforreminder() {
        return selectedforreminder;
    }

    @JsonProperty("selectedforreminder")
    public void setSelectedforreminder(Boolean selectedforreminder) {
        this.selectedforreminder = selectedforreminder;
    }

    @JsonProperty("specification1name")
    public String getSpecification1name() {
        return specification1name;
    }

    @JsonProperty("specification1name")
    public void setSpecification1name(String specification1name) {
        this.specification1name = specification1name;
    }

    @JsonProperty("specification2name")
    public String getSpecification2name() {
        return specification2name;
    }

    @JsonProperty("specification2name")
    public void setSpecification2name(String specification2name) {
        this.specification2name = specification2name;
    }

    @JsonProperty("specification3name")
    public String getSpecification3name() {
        return specification3name;
    }

    @JsonProperty("specification3name")
    public void setSpecification3name(String specification3name) {
        this.specification3name = specification3name;
    }

    @JsonProperty("standardcustomerpaymentmode")
    public String getStandardcustomerpaymentmode() {
        return standardcustomerpaymentmode;
    }

    @JsonProperty("standardcustomerpaymentmode")
    public void setStandardcustomerpaymentmode(String standardcustomerpaymentmode) {
        this.standardcustomerpaymentmode = standardcustomerpaymentmode;
    }

    @JsonProperty("statistic1")
    public String getStatistic1() {
        return statistic1;
    }

    @JsonProperty("statistic1")
    public void setStatistic1(String statistic1) {
        this.statistic1 = statistic1;
    }

    @JsonProperty("statistic2")
    public String getStatistic2() {
        return statistic2;
    }

    @JsonProperty("statistic2")
    public void setStatistic2(String statistic2) {
        this.statistic2 = statistic2;
    }

    @JsonProperty("statistic3")
    public String getStatistic3() {
        return statistic3;
    }

    @JsonProperty("statistic3")
    public void setStatistic3(String statistic3) {
        this.statistic3 = statistic3;
    }

    @JsonProperty("statistic4")
    public String getStatistic4() {
        return statistic4;
    }

    @JsonProperty("statistic4")
    public void setStatistic4(String statistic4) {
        this.statistic4 = statistic4;
    }

    @JsonProperty("telefax")
    public String getTelefax() {
        return telefax;
    }

    @JsonProperty("telefax")
    public void setTelefax(String telefax) {
        this.telefax = telefax;
    }

    @JsonProperty("telephone")
    public String getTelephone() {
        return telephone;
    }

    @JsonProperty("telephone")
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @JsonProperty("telex")
    public String getTelex() {
        return telex;
    }

    @JsonProperty("telex")
    public void setTelex(String telex) {
        this.telex = telex;
    }

    @JsonProperty("text1")
    public String getText1() {
        return text1;
    }

    @JsonProperty("text1")
    public void setText1(String text1) {
        this.text1 = text1;
    }

    @JsonProperty("text2")
    public String getText2() {
        return text2;
    }

    @JsonProperty("text2")
    public void setText2(String text2) {
        this.text2 = text2;
    }

    @JsonProperty("text3")
    public String getText3() {
        return text3;
    }

    @JsonProperty("text3")
    public void setText3(String text3) {
        this.text3 = text3;
    }

    @JsonProperty("text4")
    public String getText4() {
        return text4;
    }

    @JsonProperty("text4")
    public void setText4(String text4) {
        this.text4 = text4;
    }

    @JsonProperty("text5")
    public String getText5() {
        return text5;
    }

    @JsonProperty("text5")
    public void setText5(String text5) {
        this.text5 = text5;
    }

    @JsonProperty("transactionnumber")
    public Integer getTransactionnumber() {
        return transactionnumber;
    }

    @JsonProperty("transactionnumber")
    public void setTransactionnumber(Integer transactionnumber) {
        this.transactionnumber = transactionnumber;
    }

    @JsonProperty("transactiontype")
    public String getTransactiontype() {
        return transactiontype;
    }

    @JsonProperty("transactiontype")
    public void setTransactiontype(String transactiontype) {
        this.transactiontype = transactiontype;
    }

    @JsonProperty("vat")
    public Boolean getVat() {
        return vat;
    }

    @JsonProperty("vat")
    public void setVat(Boolean vat) {
        this.vat = vat;
    }

    @JsonProperty("vatnumber")
    public String getVatnumber() {
        return vatnumber;
    }

    @JsonProperty("vatnumber")
    public void setVatnumber(String vatnumber) {
        this.vatnumber = vatnumber;
    }

    @JsonProperty("versionnumber")
    public Integer getVersionnumber() {
        return versionnumber;
    }

    @JsonProperty("versionnumber")
    public void setVersionnumber(Integer versionnumber) {
        this.versionnumber = versionnumber;
    }

    @JsonProperty("withholdingtaxbase")
    public Integer getWithholdingtaxbase() {
        return withholdingtaxbase;
    }

    @JsonProperty("withholdingtaxbase")
    public void setWithholdingtaxbase(Integer withholdingtaxbase) {
        this.withholdingtaxbase = withholdingtaxbase;
    }

    @JsonProperty("withholdingtaxcurrency")
    public Integer getWithholdingtaxcurrency() {
        return withholdingtaxcurrency;
    }

    @JsonProperty("withholdingtaxcurrency")
    public void setWithholdingtaxcurrency(Integer withholdingtaxcurrency) {
        this.withholdingtaxcurrency = withholdingtaxcurrency;
    }

    @JsonProperty("withholdingtaxenterprise")
    public Integer getWithholdingtaxenterprise() {
        return withholdingtaxenterprise;
    }

    @JsonProperty("withholdingtaxenterprise")
    public void setWithholdingtaxenterprise(Integer withholdingtaxenterprise) {
        this.withholdingtaxenterprise = withholdingtaxenterprise;
    }

    @JsonProperty("zipcode")
    public String getZipcode() {
        return zipcode;
    }

    @JsonProperty("zipcode")
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
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
        return new ToStringBuilder(this).append("accesslevelname", accesslevelname).append("accountstatementcustomer", accountstatementcustomer).append("accountstatementnumber", accountstatementnumber).append("accrualcause", accrualcause).append("accrualremark", accrualremark).append("accruedtotalbase", accruedtotalbase).append("accruedtotalcurrency", accruedtotalcurrency).append("accruedtotalenterprise", accruedtotalenterprise).append("activestatus", activestatus).append("activitynumber", activitynumber).append("agreement", agreement).append("approvedforreconciliation", approvedforreconciliation).append("area", area).append("attention", attention).append("automaticreconciliation", automaticreconciliation).append("beingcollectedbase", beingcollectedbase).append("beingcollectedcurrency", beingcollectedcurrency).append("beingcollectedenterprise", beingcollectedenterprise).append("beingcollectedoriginal", beingcollectedoriginal).append("blocked", blocked).append("boolean1", boolean1).append("boolean2", boolean2).append("boolean3", boolean3).append("boolean4", boolean4).append("boolean5", boolean5).append("cashdiscountcode", cashdiscountcode).append("changedby", changedby).append("changeddate", changeddate).append("cnrnumber", cnrnumber).append("collectionagreementnumber", collectionagreementnumber).append("collectioncurrency", collectioncurrency).append("collectiongroupnumber", collectiongroupnumber).append("companycurrency", companycurrency).append("companycustomercustomerlinking", companycustomercustomerlinking).append("companynumber", companynumber).append("companyoforigin", companyoforigin).append("companyregistrationnumber", companyregistrationnumber).append("companyvatcode", companyvatcode).append("contactperson", contactperson).append("controlaccountcode", controlaccountcode).append("country", country).append("createdby", createdby).append("createddate", createddate).append("creditbase", creditbase).append("creditcardexpirydate", creditcardexpirydate).append("creditcardnumber", creditcardnumber).append("creditenterprise", creditenterprise).append("creditstandard", creditstandard).append("customergroup", customergroup).append("customernumber", customernumber).append("customerpayeridentifcation", customerpayeridentifcation).append("customerpaymentmode", customerpaymentmode).append("customerpaymentreference", customerpaymentreference).append("customerpopup1", customerpopup1).append("customerpopup2", customerpopup2).append("customerpopup3", customerpopup3).append("customerpopup4", customerpopup4).append("customerpopup5", customerpopup5).append("customerremark", customerremark).append("customerremark1", customerremark1).append("customerremark10", customerremark10).append("customerremark2", customerremark2).append("customerremark3", customerremark3).append("customerremark4", customerremark4).append("customerremark5", customerremark5).append("customerremark6", customerremark6).append("customerremark7", customerremark7).append("customerremark8", customerremark8).append("customerremark9", customerremark9).append("customerreminderlevel", customerreminderlevel).append("customertype", customertype).append("debitbase", debitbase).append("debitenterprise", debitenterprise).append("debitstandard", debitstandard).append("departmentnumber", departmentnumber).append("derivedcompanynumber", derivedcompanynumber).append("derivedentityname", derivedentityname).append("derivedlocalspec1name", derivedlocalspec1name).append("derivedlocalspec2name", derivedlocalspec2name).append("derivedlocalspec3name", derivedlocalspec3name).append("derivedlocationname", derivedlocationname).append("derivedprojectname", derivedprojectname).append("derivedpurposename", derivedpurposename).append("derivedspec1name", derivedspec1name).append("derivedspec2name", derivedspec2name).append("derivedspec3name", derivedspec3name).append("dimensioncombnumber", dimensioncombnumber).append("documentarchivenumber", documentarchivenumber).append("duedate", duedate).append("electroniccollection", electroniccollection).append("electronicmailaddress", electronicmailaddress).append("enterprise", enterprise).append("entityname", entityname).append("entrycurrency", entrycurrency).append("entrydate", entrydate).append("entryreconciliationdate", entryreconciliationdate).append("entrytext", entrytext).append("entrytype", entrytype).append("exported", exported).append("exportentry", exportentry).append("giro", giro).append("globallocationnumber", globallocationnumber).append("holidaycalendarname", holidaycalendarname).append("interestapprovaldate", interestapprovaldate).append("interestdate", interestdate).append("interestreminderblock", interestreminderblock).append("interestreminderblockdate", interestreminderblockdate).append("interestreminderblockedby", interestreminderblockedby).append("interestreminderprinciple", interestreminderprinciple).append("interestsum", interestsum).append("invoicename", invoicename).append("jobnumber", jobnumber).append("journallinenumber", journallinenumber).append("journalnumber", journalnumber).append("language", language).append("linenumber", linenumber).append("linkingrulename", linkingrulename).append("localspec1name", localspec1name).append("localspec2name", localspec2name).append("localspec3name", localspec3name).append("locationname", locationname).append("name1", name1).append("name2", name2).append("name3", name3).append("name4", name4).append("name5", name5).append("openclosed", openclosed).append("originalamount", originalamount).append("originalcurrency", originalcurrency).append("originalduedate", originalduedate).append("originline", originline).append("originlineinstancekey", originlineinstancekey).append("originobject", originobject).append("originobjectinstancekey", originobjectinstancekey).append("ourcontact", ourcontact).append("overwritecompany", overwritecompany).append("overwriteentity", overwriteentity).append("overwritelocalspec1", overwritelocalspec1).append("overwritelocalspec2", overwritelocalspec2).append("overwritelocalspec3", overwritelocalspec3).append("overwritelocation", overwritelocation).append("overwriteproject", overwriteproject).append("overwritepurpose", overwritepurpose).append("overwritespec1", overwritespec1).append("overwritespec2", overwritespec2).append("overwritespec3", overwritespec3).append("parentcustomer", parentcustomer).append("payeridentification", payeridentification).append("paymentagent", paymentagent).append("paymentcustomer", paymentcustomer).append("paymentterms", paymentterms).append("postaldistrict", postaldistrict).append("postingdate", postingdate).append("postingtime", postingtime).append("projectname", projectname).append("purposename", purposename).append("reconciliationdate", reconciliationdate).append("reconciliationstatus", reconciliationstatus).append("remainderbase", remainderbase).append("remainderenterprise", remainderenterprise).append("remainderoriginal", remainderoriginal).append("remainderstandard", remainderstandard).append("remark", remark).append("reminderdate", reminderdate).append("reminderlevel", reminderlevel).append("remindertextgroupname", remindertextgroupname).append("salespersonnumber", salespersonnumber).append("segment", segment).append("selectedforreconciliation", selectedforreconciliation).append("selectedforreminder", selectedforreminder).append("specification1name", specification1name).append("specification2name", specification2name).append("specification3name", specification3name).append("standardcustomerpaymentmode", standardcustomerpaymentmode).append("statistic1", statistic1).append("statistic2", statistic2).append("statistic3", statistic3).append("statistic4", statistic4).append("telefax", telefax).append("telephone", telephone).append("telex", telex).append("text1", text1).append("text2", text2).append("text3", text3).append("text4", text4).append("text5", text5).append("transactionnumber", transactionnumber).append("transactiontype", transactiontype).append("vat", vat).append("vatnumber", vatnumber).append("versionnumber", versionnumber).append("withholdingtaxbase", withholdingtaxbase).append("withholdingtaxcurrency", withholdingtaxcurrency).append("withholdingtaxenterprise", withholdingtaxenterprise).append("zipcode", zipcode).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(derivedentityname).append(withholdingtaxenterprise).append(customerpaymentreference).append(accruedtotalbase).append(reconciliationstatus).append(linkingrulename).append(customerremark1).append(companyoforigin).append(customerremark3).append(customerremark2).append(originalduedate).append(customerremark5).append(customerremark4).append(customerremark7).append(customerremark6).append(projectname).append(customerremark9).append(customerremark8).append(derivedspec1name).append(paymentterms).append(creditbase).append(beingcollectedenterprise).append(derivedlocalspec1name).append(creditstandard).append(localspec1name).append(entrytype).append(telex).append(originalamount).append(interestdate).append(versionnumber).append(specification1name).append(selectedforreminder).append(remindertextgroupname).append(interestsum).append(cnrnumber).append(selectedforreconciliation).append(documentarchivenumber).append(overwritepurpose).append(debitenterprise).append(interestapprovaldate).append(purposename).append(customerpopup1).append(interestreminderblock).append(customerpopup4).append(customerpopup5).append(accruedtotalenterprise).append(customerpopup2).append(customerpopup3).append(collectionagreementnumber).append(customerpaymentmode).append(originobject).append(derivedcompanynumber).append(ourcontact).append(originline).append(exported).append(changedby).append(postaldistrict).append(linenumber).append(departmentnumber).append(companycustomercustomerlinking).append(vatnumber).append(country).append(collectioncurrency).append(overwritelocation).append(accountstatementcustomer).append(salespersonnumber).append(parentcustomer).append(vat).append(beingcollectedcurrency).append(creditenterprise).append(debitbase).append(holidaycalendarname).append(electronicmailaddress).append(companycurrency).append(area).append(overwriteproject).append(paymentcustomer).append(derivedprojectname).append(withholdingtaxbase).append(attention).append(activitynumber).append(overwritelocalspec2).append(overwritelocalspec1).append(originobjectinstancekey).append(payeridentification).append(overwritelocalspec3).append(contactperson).append(name5).append(customerpayeridentifcation).append(name3).append(jobnumber).append(name4).append(reminderlevel).append(beingcollectedbase).append(derivedspec3name).append(accesslevelname).append(name1).append(name2).append(entryreconciliationdate).append(accrualcause).append(transactiontype).append(changeddate).append(interestreminderblockdate).append(statistic3).append(statistic2).append(customertype).append(statistic1).append(statistic4).append(overwritespec3).append(overwritespec2).append(activestatus).append(overwritespec1).append(journallinenumber).append(derivedpurposename).append(dimensioncombnumber).append(createddate).append(collectiongroupnumber).append(reminderdate).append(entityname).append(language).append(postingdate).append(overwritecompany).append(entrytext).append(derivedspec2name).append(debitstandard).append(openclosed).append(creditcardexpirydate).append(automaticreconciliation).append(duedate).append(beingcollectedoriginal).append(specification3name).append(text3).append(text4).append(specification2name).append(text1).append(postingtime).append(zipcode).append(text2).append(originalcurrency).append(companyregistrationnumber).append(text5).append(customerremark).append(localspec3name).append(standardcustomerpaymentmode).append(interestreminderprinciple).append(electroniccollection).append(telephone).append(interestreminderblockedby).append(overwriteentity).append(accruedtotalcurrency).append(remark).append(segment).append(withholdingtaxcurrency).append(cashdiscountcode).append(customernumber).append(journalnumber).append(entrydate).append(customergroup).append(derivedlocalspec3name).append(customerremark10).append(companynumber).append(enterprise).append(paymentagent).append(createdby).append(additionalProperties).append(reconciliationdate).append(transactionnumber).append(controlaccountcode).append(remainderstandard).append(remainderoriginal).append(telefax).append(creditcardnumber).append(originlineinstancekey).append(derivedlocationname).append(giro).append(locationname).append(blocked).append(approvedforreconciliation).append(globallocationnumber).append(customerreminderlevel).append(localspec2name).append(remainderbase).append(remainderenterprise).append(derivedlocalspec2name).append(boolean3).append(agreement).append(boolean2).append(boolean1).append(boolean5).append(boolean4).append(invoicename).append(companyvatcode).append(entrycurrency).append(exportentry).append(accrualremark).append(accountstatementnumber).toHashCode();
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
        return new EqualsBuilder().append(derivedentityname, rhs.derivedentityname).append(withholdingtaxenterprise, rhs.withholdingtaxenterprise).append(customerpaymentreference, rhs.customerpaymentreference).append(accruedtotalbase, rhs.accruedtotalbase).append(reconciliationstatus, rhs.reconciliationstatus).append(linkingrulename, rhs.linkingrulename).append(customerremark1, rhs.customerremark1).append(companyoforigin, rhs.companyoforigin).append(customerremark3, rhs.customerremark3).append(customerremark2, rhs.customerremark2).append(originalduedate, rhs.originalduedate).append(customerremark5, rhs.customerremark5).append(customerremark4, rhs.customerremark4).append(customerremark7, rhs.customerremark7).append(customerremark6, rhs.customerremark6).append(projectname, rhs.projectname).append(customerremark9, rhs.customerremark9).append(customerremark8, rhs.customerremark8).append(derivedspec1name, rhs.derivedspec1name).append(paymentterms, rhs.paymentterms).append(creditbase, rhs.creditbase).append(beingcollectedenterprise, rhs.beingcollectedenterprise).append(derivedlocalspec1name, rhs.derivedlocalspec1name).append(creditstandard, rhs.creditstandard).append(localspec1name, rhs.localspec1name).append(entrytype, rhs.entrytype).append(telex, rhs.telex).append(originalamount, rhs.originalamount).append(interestdate, rhs.interestdate).append(versionnumber, rhs.versionnumber).append(specification1name, rhs.specification1name).append(selectedforreminder, rhs.selectedforreminder).append(remindertextgroupname, rhs.remindertextgroupname).append(interestsum, rhs.interestsum).append(cnrnumber, rhs.cnrnumber).append(selectedforreconciliation, rhs.selectedforreconciliation).append(documentarchivenumber, rhs.documentarchivenumber).append(overwritepurpose, rhs.overwritepurpose).append(debitenterprise, rhs.debitenterprise).append(interestapprovaldate, rhs.interestapprovaldate).append(purposename, rhs.purposename).append(customerpopup1, rhs.customerpopup1).append(interestreminderblock, rhs.interestreminderblock).append(customerpopup4, rhs.customerpopup4).append(customerpopup5, rhs.customerpopup5).append(accruedtotalenterprise, rhs.accruedtotalenterprise).append(customerpopup2, rhs.customerpopup2).append(customerpopup3, rhs.customerpopup3).append(collectionagreementnumber, rhs.collectionagreementnumber).append(customerpaymentmode, rhs.customerpaymentmode).append(originobject, rhs.originobject).append(derivedcompanynumber, rhs.derivedcompanynumber).append(ourcontact, rhs.ourcontact).append(originline, rhs.originline).append(exported, rhs.exported).append(changedby, rhs.changedby).append(postaldistrict, rhs.postaldistrict).append(linenumber, rhs.linenumber).append(departmentnumber, rhs.departmentnumber).append(companycustomercustomerlinking, rhs.companycustomercustomerlinking).append(vatnumber, rhs.vatnumber).append(country, rhs.country).append(collectioncurrency, rhs.collectioncurrency).append(overwritelocation, rhs.overwritelocation).append(accountstatementcustomer, rhs.accountstatementcustomer).append(salespersonnumber, rhs.salespersonnumber).append(parentcustomer, rhs.parentcustomer).append(vat, rhs.vat).append(beingcollectedcurrency, rhs.beingcollectedcurrency).append(creditenterprise, rhs.creditenterprise).append(debitbase, rhs.debitbase).append(holidaycalendarname, rhs.holidaycalendarname).append(electronicmailaddress, rhs.electronicmailaddress).append(companycurrency, rhs.companycurrency).append(area, rhs.area).append(overwriteproject, rhs.overwriteproject).append(paymentcustomer, rhs.paymentcustomer).append(derivedprojectname, rhs.derivedprojectname).append(withholdingtaxbase, rhs.withholdingtaxbase).append(attention, rhs.attention).append(activitynumber, rhs.activitynumber).append(overwritelocalspec2, rhs.overwritelocalspec2).append(overwritelocalspec1, rhs.overwritelocalspec1).append(originobjectinstancekey, rhs.originobjectinstancekey).append(payeridentification, rhs.payeridentification).append(overwritelocalspec3, rhs.overwritelocalspec3).append(contactperson, rhs.contactperson).append(name5, rhs.name5).append(customerpayeridentifcation, rhs.customerpayeridentifcation).append(name3, rhs.name3).append(jobnumber, rhs.jobnumber).append(name4, rhs.name4).append(reminderlevel, rhs.reminderlevel).append(beingcollectedbase, rhs.beingcollectedbase).append(derivedspec3name, rhs.derivedspec3name).append(accesslevelname, rhs.accesslevelname).append(name1, rhs.name1).append(name2, rhs.name2).append(entryreconciliationdate, rhs.entryreconciliationdate).append(accrualcause, rhs.accrualcause).append(transactiontype, rhs.transactiontype).append(changeddate, rhs.changeddate).append(interestreminderblockdate, rhs.interestreminderblockdate).append(statistic3, rhs.statistic3).append(statistic2, rhs.statistic2).append(customertype, rhs.customertype).append(statistic1, rhs.statistic1).append(statistic4, rhs.statistic4).append(overwritespec3, rhs.overwritespec3).append(overwritespec2, rhs.overwritespec2).append(activestatus, rhs.activestatus).append(overwritespec1, rhs.overwritespec1).append(journallinenumber, rhs.journallinenumber).append(derivedpurposename, rhs.derivedpurposename).append(dimensioncombnumber, rhs.dimensioncombnumber).append(createddate, rhs.createddate).append(collectiongroupnumber, rhs.collectiongroupnumber).append(reminderdate, rhs.reminderdate).append(entityname, rhs.entityname).append(language, rhs.language).append(postingdate, rhs.postingdate).append(overwritecompany, rhs.overwritecompany).append(entrytext, rhs.entrytext).append(derivedspec2name, rhs.derivedspec2name).append(debitstandard, rhs.debitstandard).append(openclosed, rhs.openclosed).append(creditcardexpirydate, rhs.creditcardexpirydate).append(automaticreconciliation, rhs.automaticreconciliation).append(duedate, rhs.duedate).append(beingcollectedoriginal, rhs.beingcollectedoriginal).append(specification3name, rhs.specification3name).append(text3, rhs.text3).append(text4, rhs.text4).append(specification2name, rhs.specification2name).append(text1, rhs.text1).append(postingtime, rhs.postingtime).append(zipcode, rhs.zipcode).append(text2, rhs.text2).append(originalcurrency, rhs.originalcurrency).append(companyregistrationnumber, rhs.companyregistrationnumber).append(text5, rhs.text5).append(customerremark, rhs.customerremark).append(localspec3name, rhs.localspec3name).append(standardcustomerpaymentmode, rhs.standardcustomerpaymentmode).append(interestreminderprinciple, rhs.interestreminderprinciple).append(electroniccollection, rhs.electroniccollection).append(telephone, rhs.telephone).append(interestreminderblockedby, rhs.interestreminderblockedby).append(overwriteentity, rhs.overwriteentity).append(accruedtotalcurrency, rhs.accruedtotalcurrency).append(remark, rhs.remark).append(segment, rhs.segment).append(withholdingtaxcurrency, rhs.withholdingtaxcurrency).append(cashdiscountcode, rhs.cashdiscountcode).append(customernumber, rhs.customernumber).append(journalnumber, rhs.journalnumber).append(entrydate, rhs.entrydate).append(customergroup, rhs.customergroup).append(derivedlocalspec3name, rhs.derivedlocalspec3name).append(customerremark10, rhs.customerremark10).append(companynumber, rhs.companynumber).append(enterprise, rhs.enterprise).append(paymentagent, rhs.paymentagent).append(createdby, rhs.createdby).append(additionalProperties, rhs.additionalProperties).append(reconciliationdate, rhs.reconciliationdate).append(transactionnumber, rhs.transactionnumber).append(controlaccountcode, rhs.controlaccountcode).append(remainderstandard, rhs.remainderstandard).append(remainderoriginal, rhs.remainderoriginal).append(telefax, rhs.telefax).append(creditcardnumber, rhs.creditcardnumber).append(originlineinstancekey, rhs.originlineinstancekey).append(derivedlocationname, rhs.derivedlocationname).append(giro, rhs.giro).append(locationname, rhs.locationname).append(blocked, rhs.blocked).append(approvedforreconciliation, rhs.approvedforreconciliation).append(globallocationnumber, rhs.globallocationnumber).append(customerreminderlevel, rhs.customerreminderlevel).append(localspec2name, rhs.localspec2name).append(remainderbase, rhs.remainderbase).append(remainderenterprise, rhs.remainderenterprise).append(derivedlocalspec2name, rhs.derivedlocalspec2name).append(boolean3, rhs.boolean3).append(agreement, rhs.agreement).append(boolean2, rhs.boolean2).append(boolean1, rhs.boolean1).append(boolean5, rhs.boolean5).append(boolean4, rhs.boolean4).append(invoicename, rhs.invoicename).append(companyvatcode, rhs.companyvatcode).append(entrycurrency, rhs.entrycurrency).append(exportentry, rhs.exportentry).append(accrualremark, rhs.accrualremark).append(accountstatementnumber, rhs.accountstatementnumber).isEquals();
    }

}
