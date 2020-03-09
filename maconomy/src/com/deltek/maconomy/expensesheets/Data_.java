
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
    "expensesheetnumber",
    "linenumber",
    "entrydate",
    "jobnumber",
    "activitynumber",
    "text",
    "currency",
    "amountbase",
    "amountcurrency",
    "financevatcode",
    "reference",
    "taskname",
    "companynumber",
    "locationname",
    "entityname",
    "projectname",
    "purposename",
    "specification1name",
    "specification2name",
    "specification3name",
    "localspec1name",
    "localspec2name",
    "localspec3name",
    "startingdate",
    "startingtime",
    "endingdate",
    "closingtime",
    "remark1",
    "remark2",
    "remark3",
    "quantitya",
    "quantityb",
    "unitpricebase",
    "unitpricecurrency",
    "numberof",
    "costtype",
    "submitted",
    "newapprovalstatus",
    "approvalstatus",
    "approvedorrejectedby",
    "approvaldate",
    "commentprojectmanager",
    "approvedbysuperior",
    "transferredforposting",
    "transferredamountbase",
    "transferredquantitya",
    "transferredquantityb",
    "transferredamountcurrency",
    "employeenumber",
    "releasedbysuperior",
    "amountenterprise",
    "unitpriceenterprise",
    "transferredamountenterprise",
    "exchangerate",
    "vatcurrency",
    "vatbase",
    "vatenterprise",
    "transferredvatcurrency",
    "transferredvatbase",
    "transferredvatenterprise",
    "unitpriceexvatbase",
    "unitpriceexvatcurrency",
    "unitpriceexvatenterprise",
    "documentname",
    "instancekey",
    "transactiontimestamp",
    "favorite",
    "transferredvatspecificationentry",
    "financevatcode2",
    "financevatcode3",
    "vat1currency",
    "vat1base",
    "vat1enterprise",
    "vat2currency",
    "vat2base",
    "vat2enterprise",
    "vat3currency",
    "vat3base",
    "vat3enterprise",
    "numberproposed",
    "numberproposedtransferred",
    "billingpricetotalproposedcurrency",
    "billingpriceproposedcurrency",
    "billingpricecurrency",
    "useinvoiceproposal",
    "mileagefrom",
    "mileageto",
    "mileagevia",
    "mileagevehicle",
    "transactiontype",
    "expensesheetlinetext1",
    "expensesheetlinetext2",
    "expensesheetlinetext3",
    "expensesheetlinetext4",
    "expensesheetlinetext5",
    "expensesheetlinetext6",
    "expensesheetlinetext7",
    "expensesheetlinetext8",
    "expensesheetlinetext9",
    "expensesheetlinetext10",
    "expensesheetlineinteger1",
    "expensesheetlineinteger2",
    "expensesheetlineinteger3",
    "expensesheetlineinteger4",
    "expensesheetlineinteger5",
    "expensesheetlinedate1",
    "expensesheetlinedate2",
    "expensesheetlinetime1",
    "expensesheetlinetime2",
    "transferrednumberof",
    "expensesheettype",
    "invoiceable",
    "expensejustification",
    "timesheetlineinstancekey",
    "billingpricebase",
    "billingpriceenterprise",
    "specification4name",
    "specification5name",
    "specification6name",
    "specification7name",
    "specification8name",
    "specification9name",
    "specification10name",
    "localspec4name",
    "localspec5name",
    "localspec6name",
    "localspec7name",
    "localspec8name",
    "localspec9name",
    "localspec10name",
    "purchaseordernumber",
    "purchaseorderlinenumber",
    "settleviavendor",
    "jobnamevar",
    "activitytextvar",
    "tasknamevar",
    "taskpathvar",
    "linecompanynamevar",
    "locationdescriptionvar",
    "entitydescriptionvar",
    "projectdescriptionvar",
    "purposedescriptionvar",
    "specification1descriptionvar",
    "specification2descriptionvar",
    "specification3descriptionvar",
    "specification4descriptionvar",
    "specification5descriptionvar",
    "specification6descriptionvar",
    "specification7descriptionvar",
    "specification8descriptionvar",
    "specification9descriptionvar",
    "specification10descriptionvar",
    "localspec1descriptionvar",
    "localspec2descriptionvar",
    "localspec3descriptionvar",
    "localspec4descriptionvar",
    "localspec5descriptionvar",
    "localspec6descriptionvar",
    "localspec7descriptionvar",
    "localspec8descriptionvar",
    "localspec9descriptionvar",
    "localspec10descriptionvar",
    "linecustomerpopup5var",
    "linecustomerremark15var",
    "linecustomerremark16var",
    "linecustomerremark17var",
    "linecustomerremark18var",
    "linecustomerremark19var",
    "linecustomerremark20var",
    "customernumbervar",
    "customernamevar",
    "languagevar",
    "expensejustificationhelptextvar",
    "lineapprovalrelationvar",
    "lineapprovalnumbervar",
    "lineapprovallinenumbervar",
    "linecurrentapprovalstatusdescriptionvar",
    "linecurrentapprovalstatusvar",
    "linecanbeapprovedbycurrentuservar",
    "lineapprovedorrejectedbyvar",
    "lineapprovaldatevar",
    "lineapprovaltimevar",
    "lineremarkvar",
    "tooltipjobvar",
    "tooltiptaskvar",
    "tooltiptasklinebreakvar",
    "tooltipactivityvar",
    "tooltipconclusionvar",
    "linedetailsvar",
    "linedetailstypevar",
    "customerlevelnamevar",
    "level1customernumbervar",
    "level2customernumbervar",
    "level3customernumbervar",
    "level4customernumbervar",
    "level5customernumbervar",
    "level1customernamevar",
    "level2customernamevar",
    "level3customernamevar",
    "level4customernamevar",
    "level5customernamevar",
    "lineprojectmanagernumbervar",
    "lineprojectmanagernamevar",
    "justificationrequiredvar",
    "justificationcompletevar",
    "taskisperdiem",
    "unitpriceopen"
})
public class Data_ {

    @JsonProperty("expensesheetnumber")
    private String expensesheetnumber;
    @JsonProperty("linenumber")
    private Integer linenumber;
    @JsonProperty("entrydate")
    private String entrydate;
    @JsonProperty("jobnumber")
    private String jobnumber;
    @JsonProperty("activitynumber")
    private String activitynumber;
    @JsonProperty("text")
    private String text;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("amountbase")
    private Integer amountbase;
    @JsonProperty("amountcurrency")
    private Integer amountcurrency;
    @JsonProperty("financevatcode")
    private String financevatcode;
    @JsonProperty("reference")
    private String reference;
    @JsonProperty("taskname")
    private String taskname;
    @JsonProperty("companynumber")
    private String companynumber;
    @JsonProperty("locationname")
    private String locationname;
    @JsonProperty("entityname")
    private String entityname;
    @JsonProperty("projectname")
    private String projectname;
    @JsonProperty("purposename")
    private String purposename;
    @JsonProperty("specification1name")
    private String specification1name;
    @JsonProperty("specification2name")
    private String specification2name;
    @JsonProperty("specification3name")
    private String specification3name;
    @JsonProperty("localspec1name")
    private String localspec1name;
    @JsonProperty("localspec2name")
    private String localspec2name;
    @JsonProperty("localspec3name")
    private String localspec3name;
    @JsonProperty("startingdate")
    private String startingdate;
    @JsonProperty("startingtime")
    private String startingtime;
    @JsonProperty("endingdate")
    private String endingdate;
    @JsonProperty("closingtime")
    private String closingtime;
    @JsonProperty("remark1")
    private String remark1;
    @JsonProperty("remark2")
    private String remark2;
    @JsonProperty("remark3")
    private String remark3;
    @JsonProperty("quantitya")
    private Integer quantitya;
    @JsonProperty("quantityb")
    private Integer quantityb;
    @JsonProperty("unitpricebase")
    private Integer unitpricebase;
    @JsonProperty("unitpricecurrency")
    private Integer unitpricecurrency;
    @JsonProperty("numberof")
    private Double numberof;
    @JsonProperty("costtype")
    private String costtype;
    @JsonProperty("submitted")
    private Boolean submitted;
    @JsonProperty("newapprovalstatus")
    private String newapprovalstatus;
    @JsonProperty("approvalstatus")
    private String approvalstatus;
    @JsonProperty("approvedorrejectedby")
    private String approvedorrejectedby;
    @JsonProperty("approvaldate")
    private String approvaldate;
    @JsonProperty("commentprojectmanager")
    private String commentprojectmanager;
    @JsonProperty("approvedbysuperior")
    private Boolean approvedbysuperior;
    @JsonProperty("transferredforposting")
    private Boolean transferredforposting;
    @JsonProperty("transferredamountbase")
    private Integer transferredamountbase;
    @JsonProperty("transferredquantitya")
    private Integer transferredquantitya;
    @JsonProperty("transferredquantityb")
    private Integer transferredquantityb;
    @JsonProperty("transferredamountcurrency")
    private Integer transferredamountcurrency;
    @JsonProperty("employeenumber")
    private String employeenumber;
    @JsonProperty("releasedbysuperior")
    private Boolean releasedbysuperior;
    @JsonProperty("amountenterprise")
    private Integer amountenterprise;
    @JsonProperty("unitpriceenterprise")
    private Integer unitpriceenterprise;
    @JsonProperty("transferredamountenterprise")
    private Integer transferredamountenterprise;
    @JsonProperty("exchangerate")
    private Integer exchangerate;
    @JsonProperty("vatcurrency")
    private Integer vatcurrency;
    @JsonProperty("vatbase")
    private Integer vatbase;
    @JsonProperty("vatenterprise")
    private Integer vatenterprise;
    @JsonProperty("transferredvatcurrency")
    private Integer transferredvatcurrency;
    @JsonProperty("transferredvatbase")
    private Integer transferredvatbase;
    @JsonProperty("transferredvatenterprise")
    private Integer transferredvatenterprise;
    @JsonProperty("unitpriceexvatbase")
    private Integer unitpriceexvatbase;
    @JsonProperty("unitpriceexvatcurrency")
    private Integer unitpriceexvatcurrency;
    @JsonProperty("unitpriceexvatenterprise")
    private Integer unitpriceexvatenterprise;
    @JsonProperty("documentname")
    private String documentname;
    @JsonProperty("instancekey")
    private String instancekey;
    @JsonProperty("transactiontimestamp")
    private String transactiontimestamp;
    @JsonProperty("favorite")
    private String favorite;
    @JsonProperty("transferredvatspecificationentry")
    private String transferredvatspecificationentry;
    @JsonProperty("financevatcode2")
    private String financevatcode2;
    @JsonProperty("financevatcode3")
    private String financevatcode3;
    @JsonProperty("vat1currency")
    private Integer vat1currency;
    @JsonProperty("vat1base")
    private Integer vat1base;
    @JsonProperty("vat1enterprise")
    private Integer vat1enterprise;
    @JsonProperty("vat2currency")
    private Integer vat2currency;
    @JsonProperty("vat2base")
    private Integer vat2base;
    @JsonProperty("vat2enterprise")
    private Integer vat2enterprise;
    @JsonProperty("vat3currency")
    private Integer vat3currency;
    @JsonProperty("vat3base")
    private Integer vat3base;
    @JsonProperty("vat3enterprise")
    private Integer vat3enterprise;
    @JsonProperty("numberproposed")
    private Integer numberproposed;
    @JsonProperty("numberproposedtransferred")
    private Integer numberproposedtransferred;
    @JsonProperty("billingpricetotalproposedcurrency")
    private Integer billingpricetotalproposedcurrency;
    @JsonProperty("billingpriceproposedcurrency")
    private Integer billingpriceproposedcurrency;
    @JsonProperty("billingpricecurrency")
    private Integer billingpricecurrency;
    @JsonProperty("useinvoiceproposal")
    private Boolean useinvoiceproposal;
    @JsonProperty("mileagefrom")
    private String mileagefrom;
    @JsonProperty("mileageto")
    private String mileageto;
    @JsonProperty("mileagevia")
    private String mileagevia;
    @JsonProperty("mileagevehicle")
    private String mileagevehicle;
    @JsonProperty("transactiontype")
    private String transactiontype;
    @JsonProperty("expensesheetlinetext1")
    private String expensesheetlinetext1;
    @JsonProperty("expensesheetlinetext2")
    private String expensesheetlinetext2;
    @JsonProperty("expensesheetlinetext3")
    private String expensesheetlinetext3;
    @JsonProperty("expensesheetlinetext4")
    private String expensesheetlinetext4;
    @JsonProperty("expensesheetlinetext5")
    private String expensesheetlinetext5;
    @JsonProperty("expensesheetlinetext6")
    private String expensesheetlinetext6;
    @JsonProperty("expensesheetlinetext7")
    private String expensesheetlinetext7;
    @JsonProperty("expensesheetlinetext8")
    private String expensesheetlinetext8;
    @JsonProperty("expensesheetlinetext9")
    private String expensesheetlinetext9;
    @JsonProperty("expensesheetlinetext10")
    private String expensesheetlinetext10;
    @JsonProperty("expensesheetlineinteger1")
    private Integer expensesheetlineinteger1;
    @JsonProperty("expensesheetlineinteger2")
    private Integer expensesheetlineinteger2;
    @JsonProperty("expensesheetlineinteger3")
    private Integer expensesheetlineinteger3;
    @JsonProperty("expensesheetlineinteger4")
    private Integer expensesheetlineinteger4;
    @JsonProperty("expensesheetlineinteger5")
    private Integer expensesheetlineinteger5;
    @JsonProperty("expensesheetlinedate1")
    private String expensesheetlinedate1;
    @JsonProperty("expensesheetlinedate2")
    private String expensesheetlinedate2;
    @JsonProperty("expensesheetlinetime1")
    private String expensesheetlinetime1;
    @JsonProperty("expensesheetlinetime2")
    private String expensesheetlinetime2;
    @JsonProperty("transferrednumberof")
    private Integer transferrednumberof;
    @JsonProperty("expensesheettype")
    private String expensesheettype;
    @JsonProperty("invoiceable")
    private Boolean invoiceable;
    @JsonProperty("expensejustification")
    private String expensejustification;
    @JsonProperty("timesheetlineinstancekey")
    private String timesheetlineinstancekey;
    @JsonProperty("billingpricebase")
    private Integer billingpricebase;
    @JsonProperty("billingpriceenterprise")
    private Integer billingpriceenterprise;
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
    @JsonProperty("specification10name")
    private String specification10name;
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
    @JsonProperty("localspec10name")
    private String localspec10name;
    @JsonProperty("purchaseordernumber")
    private String purchaseordernumber;
    @JsonProperty("purchaseorderlinenumber")
    private Integer purchaseorderlinenumber;
    @JsonProperty("settleviavendor")
    private Boolean settleviavendor;
    @JsonProperty("jobnamevar")
    private String jobnamevar;
    @JsonProperty("activitytextvar")
    private String activitytextvar;
    @JsonProperty("tasknamevar")
    private String tasknamevar;
    @JsonProperty("taskpathvar")
    private String taskpathvar;
    @JsonProperty("linecompanynamevar")
    private String linecompanynamevar;
    @JsonProperty("locationdescriptionvar")
    private String locationdescriptionvar;
    @JsonProperty("entitydescriptionvar")
    private String entitydescriptionvar;
    @JsonProperty("projectdescriptionvar")
    private String projectdescriptionvar;
    @JsonProperty("purposedescriptionvar")
    private String purposedescriptionvar;
    @JsonProperty("specification1descriptionvar")
    private String specification1descriptionvar;
    @JsonProperty("specification2descriptionvar")
    private String specification2descriptionvar;
    @JsonProperty("specification3descriptionvar")
    private String specification3descriptionvar;
    @JsonProperty("specification4descriptionvar")
    private String specification4descriptionvar;
    @JsonProperty("specification5descriptionvar")
    private String specification5descriptionvar;
    @JsonProperty("specification6descriptionvar")
    private String specification6descriptionvar;
    @JsonProperty("specification7descriptionvar")
    private String specification7descriptionvar;
    @JsonProperty("specification8descriptionvar")
    private String specification8descriptionvar;
    @JsonProperty("specification9descriptionvar")
    private String specification9descriptionvar;
    @JsonProperty("specification10descriptionvar")
    private String specification10descriptionvar;
    @JsonProperty("localspec1descriptionvar")
    private String localspec1descriptionvar;
    @JsonProperty("localspec2descriptionvar")
    private String localspec2descriptionvar;
    @JsonProperty("localspec3descriptionvar")
    private String localspec3descriptionvar;
    @JsonProperty("localspec4descriptionvar")
    private String localspec4descriptionvar;
    @JsonProperty("localspec5descriptionvar")
    private String localspec5descriptionvar;
    @JsonProperty("localspec6descriptionvar")
    private String localspec6descriptionvar;
    @JsonProperty("localspec7descriptionvar")
    private String localspec7descriptionvar;
    @JsonProperty("localspec8descriptionvar")
    private String localspec8descriptionvar;
    @JsonProperty("localspec9descriptionvar")
    private String localspec9descriptionvar;
    @JsonProperty("localspec10descriptionvar")
    private String localspec10descriptionvar;
    @JsonProperty("linecustomerpopup5var")
    private String linecustomerpopup5var;
    @JsonProperty("linecustomerremark15var")
    private String linecustomerremark15var;
    @JsonProperty("linecustomerremark16var")
    private String linecustomerremark16var;
    @JsonProperty("linecustomerremark17var")
    private String linecustomerremark17var;
    @JsonProperty("linecustomerremark18var")
    private String linecustomerremark18var;
    @JsonProperty("linecustomerremark19var")
    private String linecustomerremark19var;
    @JsonProperty("linecustomerremark20var")
    private String linecustomerremark20var;
    @JsonProperty("customernumbervar")
    private String customernumbervar;
    @JsonProperty("customernamevar")
    private String customernamevar;
    @JsonProperty("languagevar")
    private String languagevar;
    @JsonProperty("expensejustificationhelptextvar")
    private String expensejustificationhelptextvar;
    @JsonProperty("lineapprovalrelationvar")
    private String lineapprovalrelationvar;
    @JsonProperty("lineapprovalnumbervar")
    private Integer lineapprovalnumbervar;
    @JsonProperty("lineapprovallinenumbervar")
    private Integer lineapprovallinenumbervar;
    @JsonProperty("linecurrentapprovalstatusdescriptionvar")
    private String linecurrentapprovalstatusdescriptionvar;
    @JsonProperty("linecurrentapprovalstatusvar")
    private String linecurrentapprovalstatusvar;
    @JsonProperty("linecanbeapprovedbycurrentuservar")
    private Boolean linecanbeapprovedbycurrentuservar;
    @JsonProperty("lineapprovedorrejectedbyvar")
    private String lineapprovedorrejectedbyvar;
    @JsonProperty("lineapprovaldatevar")
    private String lineapprovaldatevar;
    @JsonProperty("lineapprovaltimevar")
    private String lineapprovaltimevar;
    @JsonProperty("lineremarkvar")
    private String lineremarkvar;
    @JsonProperty("tooltipjobvar")
    private String tooltipjobvar;
    @JsonProperty("tooltiptaskvar")
    private String tooltiptaskvar;
    @JsonProperty("tooltiptasklinebreakvar")
    private String tooltiptasklinebreakvar;
    @JsonProperty("tooltipactivityvar")
    private String tooltipactivityvar;
    @JsonProperty("tooltipconclusionvar")
    private String tooltipconclusionvar;
    @JsonProperty("linedetailsvar")
    private String linedetailsvar;
    @JsonProperty("linedetailstypevar")
    private String linedetailstypevar;
    @JsonProperty("customerlevelnamevar")
    private String customerlevelnamevar;
    @JsonProperty("level1customernumbervar")
    private String level1customernumbervar;
    @JsonProperty("level2customernumbervar")
    private String level2customernumbervar;
    @JsonProperty("level3customernumbervar")
    private String level3customernumbervar;
    @JsonProperty("level4customernumbervar")
    private String level4customernumbervar;
    @JsonProperty("level5customernumbervar")
    private String level5customernumbervar;
    @JsonProperty("level1customernamevar")
    private String level1customernamevar;
    @JsonProperty("level2customernamevar")
    private String level2customernamevar;
    @JsonProperty("level3customernamevar")
    private String level3customernamevar;
    @JsonProperty("level4customernamevar")
    private String level4customernamevar;
    @JsonProperty("level5customernamevar")
    private String level5customernamevar;
    @JsonProperty("lineprojectmanagernumbervar")
    private String lineprojectmanagernumbervar;
    @JsonProperty("lineprojectmanagernamevar")
    private String lineprojectmanagernamevar;
    @JsonProperty("justificationrequiredvar")
    private Boolean justificationrequiredvar;
    @JsonProperty("justificationcompletevar")
    private Boolean justificationcompletevar;
    @JsonProperty("taskisperdiem")
    private Boolean taskisperdiem;
    @JsonProperty("unitpriceopen")
    private Boolean unitpriceopen;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Data_() {
    }

    /**
     * 
     * @param companynumber
     * @param taskname
     * @param unitpricebase
     * @param numberproposed
     * @param vat3base
     * @param tooltipactivityvar
     * @param tooltiptaskvar
     * @param unitpriceexvatcurrency
     * @param specification4name
     * @param documentname
     * @param transferredvatbase
     * @param specification8name
     * @param localspec6descriptionvar
     * @param localspec1descriptionvar
     * @param specification6descriptionvar
     * @param approvedbysuperior
     * @param tooltiptasklinebreakvar
     * @param amountbase
     * @param localspec6name
     * @param submitted
     * @param jobnumber
     * @param specification1descriptionvar
     * @param activitynumber
     * @param costtype
     * @param level2customernumbervar
     * @param vat2currency
     * @param specification1name
     * @param localspec5descriptionvar
     * @param closingtime
     * @param specification5descriptionvar
     * @param localspec9name
     * @param transactiontype
     * @param linecustomerremark17var
     * @param transferredamountbase
     * @param entrydate
     * @param amountcurrency
     * @param financevatcode
     * @param currency
     * @param linecustomerpopup5var
     * @param lineapprovallinenumbervar
     * @param unitpriceexvatenterprise
     * @param amountenterprise
     * @param tasknamevar
     * @param approvalstatus
     * @param localspec2name
     * @param transferredamountenterprise
     * @param lineapprovaldatevar
     * @param financevatcode2
     * @param financevatcode3
     * @param locationdescriptionvar
     * @param unitpriceenterprise
     * @param expensesheetlinetime1
     * @param expensesheetlinetime2
     * @param lineremarkvar
     * @param specification10descriptionvar
     * @param specification5name
     * @param quantitya
     * @param quantityb
     * @param transferredforposting
     * @param localspec10descriptionvar
     * @param localspec3name
     * @param localspec2descriptionvar
     * @param specification2descriptionvar
     * @param billingpriceenterprise
     * @param invoiceable
     * @param localspec7name
     * @param transferrednumberof
     * @param unitpriceopen
     * @param lineapprovalnumbervar
     * @param linecustomerremark16var
     * @param jobnamevar
     * @param vatcurrency
     * @param linedetailsvar
     * @param linenumber
     * @param employeenumber
     * @param purposename
     * @param exchangerate
     * @param timesheetlineinstancekey
     * @param mileagevehicle
     * @param localspec8name
     * @param lineapprovalrelationvar
     * @param transferredquantityb
     * @param transferredquantitya
     * @param expensesheetlinetext3
     * @param expensesheetlinetext2
     * @param expensesheetlinetext1
     * @param linecurrentapprovalstatusdescriptionvar
     * @param expensesheetlinetext7
     * @param expensesheetlinetext6
     * @param taskisperdiem
     * @param commentprojectmanager
     * @param expensesheetlinetext5
     * @param expensesheetlinetext4
     * @param unitpricecurrency
     * @param specification9name
     * @param expensejustification
     * @param billingpricecurrency
     * @param lineprojectmanagernamevar
     * @param customernamevar
     * @param expensesheetlinetext9
     * @param expensesheetlinetext8
     * @param useinvoiceproposal
     * @param numberproposedtransferred
     * @param billingpricetotalproposedcurrency
     * @param endingdate
     * @param entitydescriptionvar
     * @param lineprojectmanagernumbervar
     * @param customernumbervar
     * @param specification8descriptionvar
     * @param billingpriceproposedcurrency
     * @param vat1currency
     * @param approvaldate
     * @param lineapprovedorrejectedbyvar
     * @param level3customernamevar
     * @param localspec4name
     * @param justificationrequiredvar
     * @param text
     * @param instancekey
     * @param vat3enterprise
     * @param vat1base
     * @param projectname
     * @param linedetailstypevar
     * @param approvedorrejectedby
     * @param linecanbeapprovedbycurrentuservar
     * @param releasedbysuperior
     * @param localspec10name
     * @param languagevar
     * @param linecustomerremark15var
     * @param startingdate
     * @param expensesheetlinetext10
     * @param purchaseorderlinenumber
     * @param vatenterprise
     * @param favorite
     * @param specification6name
     * @param level4customernumbervar
     * @param level4customernamevar
     * @param mileageto
     * @param entityname
     * @param transferredvatspecificationentry
     * @param level5customernumbervar
     * @param vatbase
     * @param settleviavendor
     * @param locationname
     * @param lineapprovaltimevar
     * @param expensejustificationhelptextvar
     * @param justificationcompletevar
     * @param localspec4descriptionvar
     * @param specification4descriptionvar
     * @param specification3name
     * @param level1customernumbervar
     * @param numberof
     * @param specification10name
     * @param localspec3descriptionvar
     * @param activitytextvar
     * @param linecurrentapprovalstatusvar
     * @param specification3descriptionvar
     * @param vat2enterprise
     * @param linecustomerremark20var
     * @param mileagefrom
     * @param vat3currency
     * @param localspec5name
     * @param mileagevia
     * @param localspec7descriptionvar
     * @param expensesheetlineinteger2
     * @param linecustomerremark19var
     * @param newapprovalstatus
     * @param expensesheetlineinteger1
     * @param specification7descriptionvar
     * @param reference
     * @param expensesheetlineinteger5
     * @param expensesheetlineinteger4
     * @param expensesheetlineinteger3
     * @param unitpriceexvatbase
     * @param taskpathvar
     * @param linecompanynamevar
     * @param vat2base
     * @param specification9descriptionvar
     * @param level1customernamevar
     * @param transferredvatcurrency
     * @param expensesheetlinedate2
     * @param expensesheetlinedate1
     * @param specification7name
     * @param customerlevelnamevar
     * @param purposedescriptionvar
     * @param level2customernamevar
     * @param remark1
     * @param remark3
     * @param remark2
     * @param tooltipjobvar
     * @param startingtime
     * @param purchaseordernumber
     * @param vat1enterprise
     * @param tooltipconclusionvar
     * @param projectdescriptionvar
     * @param billingpricebase
     * @param localspec9descriptionvar
     * @param transferredvatenterprise
     * @param transactiontimestamp
     * @param expensesheettype
     * @param localspec8descriptionvar
     * @param linecustomerremark18var
     * @param level3customernumbervar
     * @param specification2name
     * @param expensesheetnumber
     * @param level5customernamevar
     * @param localspec1name
     * @param transferredamountcurrency
     */
    public Data_(String expensesheetnumber, Integer linenumber, String entrydate, String jobnumber, String activitynumber, String text, String currency, Integer amountbase, Integer amountcurrency, String financevatcode, String reference, String taskname, String companynumber, String locationname, String entityname, String projectname, String purposename, String specification1name, String specification2name, String specification3name, String localspec1name, String localspec2name, String localspec3name, String startingdate, String startingtime, String endingdate, String closingtime, String remark1, String remark2, String remark3, Integer quantitya, Integer quantityb, Integer unitpricebase, Integer unitpricecurrency, Double numberof, String costtype, Boolean submitted, String newapprovalstatus, String approvalstatus, String approvedorrejectedby, String approvaldate, String commentprojectmanager, Boolean approvedbysuperior, Boolean transferredforposting, Integer transferredamountbase, Integer transferredquantitya, Integer transferredquantityb, Integer transferredamountcurrency, String employeenumber, Boolean releasedbysuperior, Integer amountenterprise, Integer unitpriceenterprise, Integer transferredamountenterprise, Integer exchangerate, Integer vatcurrency, Integer vatbase, Integer vatenterprise, Integer transferredvatcurrency, Integer transferredvatbase, Integer transferredvatenterprise, Integer unitpriceexvatbase, Integer unitpriceexvatcurrency, Integer unitpriceexvatenterprise, String documentname, String instancekey, String transactiontimestamp, String favorite, String transferredvatspecificationentry, String financevatcode2, String financevatcode3, Integer vat1currency, Integer vat1base, Integer vat1enterprise, Integer vat2currency, Integer vat2base, Integer vat2enterprise, Integer vat3currency, Integer vat3base, Integer vat3enterprise, Integer numberproposed, Integer numberproposedtransferred, Integer billingpricetotalproposedcurrency, Integer billingpriceproposedcurrency, Integer billingpricecurrency, Boolean useinvoiceproposal, String mileagefrom, String mileageto, String mileagevia, String mileagevehicle, String transactiontype, String expensesheetlinetext1, String expensesheetlinetext2, String expensesheetlinetext3, String expensesheetlinetext4, String expensesheetlinetext5, String expensesheetlinetext6, String expensesheetlinetext7, String expensesheetlinetext8, String expensesheetlinetext9, String expensesheetlinetext10, Integer expensesheetlineinteger1, Integer expensesheetlineinteger2, Integer expensesheetlineinteger3, Integer expensesheetlineinteger4, Integer expensesheetlineinteger5, String expensesheetlinedate1, String expensesheetlinedate2, String expensesheetlinetime1, String expensesheetlinetime2, Integer transferrednumberof, String expensesheettype, Boolean invoiceable, String expensejustification, String timesheetlineinstancekey, Integer billingpricebase, Integer billingpriceenterprise, String specification4name, String specification5name, String specification6name, String specification7name, String specification8name, String specification9name, String specification10name, String localspec4name, String localspec5name, String localspec6name, String localspec7name, String localspec8name, String localspec9name, String localspec10name, String purchaseordernumber, Integer purchaseorderlinenumber, Boolean settleviavendor, String jobnamevar, String activitytextvar, String tasknamevar, String taskpathvar, String linecompanynamevar, String locationdescriptionvar, String entitydescriptionvar, String projectdescriptionvar, String purposedescriptionvar, String specification1descriptionvar, String specification2descriptionvar, String specification3descriptionvar, String specification4descriptionvar, String specification5descriptionvar, String specification6descriptionvar, String specification7descriptionvar, String specification8descriptionvar, String specification9descriptionvar, String specification10descriptionvar, String localspec1descriptionvar, String localspec2descriptionvar, String localspec3descriptionvar, String localspec4descriptionvar, String localspec5descriptionvar, String localspec6descriptionvar, String localspec7descriptionvar, String localspec8descriptionvar, String localspec9descriptionvar, String localspec10descriptionvar, String linecustomerpopup5var, String linecustomerremark15var, String linecustomerremark16var, String linecustomerremark17var, String linecustomerremark18var, String linecustomerremark19var, String linecustomerremark20var, String customernumbervar, String customernamevar, String languagevar, String expensejustificationhelptextvar, String lineapprovalrelationvar, Integer lineapprovalnumbervar, Integer lineapprovallinenumbervar, String linecurrentapprovalstatusdescriptionvar, String linecurrentapprovalstatusvar, Boolean linecanbeapprovedbycurrentuservar, String lineapprovedorrejectedbyvar, String lineapprovaldatevar, String lineapprovaltimevar, String lineremarkvar, String tooltipjobvar, String tooltiptaskvar, String tooltiptasklinebreakvar, String tooltipactivityvar, String tooltipconclusionvar, String linedetailsvar, String linedetailstypevar, String customerlevelnamevar, String level1customernumbervar, String level2customernumbervar, String level3customernumbervar, String level4customernumbervar, String level5customernumbervar, String level1customernamevar, String level2customernamevar, String level3customernamevar, String level4customernamevar, String level5customernamevar, String lineprojectmanagernumbervar, String lineprojectmanagernamevar, Boolean justificationrequiredvar, Boolean justificationcompletevar, Boolean taskisperdiem, Boolean unitpriceopen) {
        this.expensesheetnumber = expensesheetnumber;
        this.linenumber = linenumber;
        this.entrydate = entrydate;
        this.jobnumber = jobnumber;
        this.activitynumber = activitynumber;
        this.text = text;
        this.currency = currency;
        this.amountbase = amountbase;
        this.amountcurrency = amountcurrency;
        this.financevatcode = financevatcode;
        this.reference = reference;
        this.taskname = taskname;
        this.companynumber = companynumber;
        this.locationname = locationname;
        this.entityname = entityname;
        this.projectname = projectname;
        this.purposename = purposename;
        this.specification1name = specification1name;
        this.specification2name = specification2name;
        this.specification3name = specification3name;
        this.localspec1name = localspec1name;
        this.localspec2name = localspec2name;
        this.localspec3name = localspec3name;
        this.startingdate = startingdate;
        this.startingtime = startingtime;
        this.endingdate = endingdate;
        this.closingtime = closingtime;
        this.remark1 = remark1;
        this.remark2 = remark2;
        this.remark3 = remark3;
        this.quantitya = quantitya;
        this.quantityb = quantityb;
        this.unitpricebase = unitpricebase;
        this.unitpricecurrency = unitpricecurrency;
        this.numberof = numberof;
        this.costtype = costtype;
        this.submitted = submitted;
        this.newapprovalstatus = newapprovalstatus;
        this.approvalstatus = approvalstatus;
        this.approvedorrejectedby = approvedorrejectedby;
        this.approvaldate = approvaldate;
        this.commentprojectmanager = commentprojectmanager;
        this.approvedbysuperior = approvedbysuperior;
        this.transferredforposting = transferredforposting;
        this.transferredamountbase = transferredamountbase;
        this.transferredquantitya = transferredquantitya;
        this.transferredquantityb = transferredquantityb;
        this.transferredamountcurrency = transferredamountcurrency;
        this.employeenumber = employeenumber;
        this.releasedbysuperior = releasedbysuperior;
        this.amountenterprise = amountenterprise;
        this.unitpriceenterprise = unitpriceenterprise;
        this.transferredamountenterprise = transferredamountenterprise;
        this.exchangerate = exchangerate;
        this.vatcurrency = vatcurrency;
        this.vatbase = vatbase;
        this.vatenterprise = vatenterprise;
        this.transferredvatcurrency = transferredvatcurrency;
        this.transferredvatbase = transferredvatbase;
        this.transferredvatenterprise = transferredvatenterprise;
        this.unitpriceexvatbase = unitpriceexvatbase;
        this.unitpriceexvatcurrency = unitpriceexvatcurrency;
        this.unitpriceexvatenterprise = unitpriceexvatenterprise;
        this.documentname = documentname;
        this.instancekey = instancekey;
        this.transactiontimestamp = transactiontimestamp;
        this.favorite = favorite;
        this.transferredvatspecificationentry = transferredvatspecificationentry;
        this.financevatcode2 = financevatcode2;
        this.financevatcode3 = financevatcode3;
        this.vat1currency = vat1currency;
        this.vat1base = vat1base;
        this.vat1enterprise = vat1enterprise;
        this.vat2currency = vat2currency;
        this.vat2base = vat2base;
        this.vat2enterprise = vat2enterprise;
        this.vat3currency = vat3currency;
        this.vat3base = vat3base;
        this.vat3enterprise = vat3enterprise;
        this.numberproposed = numberproposed;
        this.numberproposedtransferred = numberproposedtransferred;
        this.billingpricetotalproposedcurrency = billingpricetotalproposedcurrency;
        this.billingpriceproposedcurrency = billingpriceproposedcurrency;
        this.billingpricecurrency = billingpricecurrency;
        this.useinvoiceproposal = useinvoiceproposal;
        this.mileagefrom = mileagefrom;
        this.mileageto = mileageto;
        this.mileagevia = mileagevia;
        this.mileagevehicle = mileagevehicle;
        this.transactiontype = transactiontype;
        this.expensesheetlinetext1 = expensesheetlinetext1;
        this.expensesheetlinetext2 = expensesheetlinetext2;
        this.expensesheetlinetext3 = expensesheetlinetext3;
        this.expensesheetlinetext4 = expensesheetlinetext4;
        this.expensesheetlinetext5 = expensesheetlinetext5;
        this.expensesheetlinetext6 = expensesheetlinetext6;
        this.expensesheetlinetext7 = expensesheetlinetext7;
        this.expensesheetlinetext8 = expensesheetlinetext8;
        this.expensesheetlinetext9 = expensesheetlinetext9;
        this.expensesheetlinetext10 = expensesheetlinetext10;
        this.expensesheetlineinteger1 = expensesheetlineinteger1;
        this.expensesheetlineinteger2 = expensesheetlineinteger2;
        this.expensesheetlineinteger3 = expensesheetlineinteger3;
        this.expensesheetlineinteger4 = expensesheetlineinteger4;
        this.expensesheetlineinteger5 = expensesheetlineinteger5;
        this.expensesheetlinedate1 = expensesheetlinedate1;
        this.expensesheetlinedate2 = expensesheetlinedate2;
        this.expensesheetlinetime1 = expensesheetlinetime1;
        this.expensesheetlinetime2 = expensesheetlinetime2;
        this.transferrednumberof = transferrednumberof;
        this.expensesheettype = expensesheettype;
        this.invoiceable = invoiceable;
        this.expensejustification = expensejustification;
        this.timesheetlineinstancekey = timesheetlineinstancekey;
        this.billingpricebase = billingpricebase;
        this.billingpriceenterprise = billingpriceenterprise;
        this.specification4name = specification4name;
        this.specification5name = specification5name;
        this.specification6name = specification6name;
        this.specification7name = specification7name;
        this.specification8name = specification8name;
        this.specification9name = specification9name;
        this.specification10name = specification10name;
        this.localspec4name = localspec4name;
        this.localspec5name = localspec5name;
        this.localspec6name = localspec6name;
        this.localspec7name = localspec7name;
        this.localspec8name = localspec8name;
        this.localspec9name = localspec9name;
        this.localspec10name = localspec10name;
        this.purchaseordernumber = purchaseordernumber;
        this.purchaseorderlinenumber = purchaseorderlinenumber;
        this.settleviavendor = settleviavendor;
        this.jobnamevar = jobnamevar;
        this.activitytextvar = activitytextvar;
        this.tasknamevar = tasknamevar;
        this.taskpathvar = taskpathvar;
        this.linecompanynamevar = linecompanynamevar;
        this.locationdescriptionvar = locationdescriptionvar;
        this.entitydescriptionvar = entitydescriptionvar;
        this.projectdescriptionvar = projectdescriptionvar;
        this.purposedescriptionvar = purposedescriptionvar;
        this.specification1descriptionvar = specification1descriptionvar;
        this.specification2descriptionvar = specification2descriptionvar;
        this.specification3descriptionvar = specification3descriptionvar;
        this.specification4descriptionvar = specification4descriptionvar;
        this.specification5descriptionvar = specification5descriptionvar;
        this.specification6descriptionvar = specification6descriptionvar;
        this.specification7descriptionvar = specification7descriptionvar;
        this.specification8descriptionvar = specification8descriptionvar;
        this.specification9descriptionvar = specification9descriptionvar;
        this.specification10descriptionvar = specification10descriptionvar;
        this.localspec1descriptionvar = localspec1descriptionvar;
        this.localspec2descriptionvar = localspec2descriptionvar;
        this.localspec3descriptionvar = localspec3descriptionvar;
        this.localspec4descriptionvar = localspec4descriptionvar;
        this.localspec5descriptionvar = localspec5descriptionvar;
        this.localspec6descriptionvar = localspec6descriptionvar;
        this.localspec7descriptionvar = localspec7descriptionvar;
        this.localspec8descriptionvar = localspec8descriptionvar;
        this.localspec9descriptionvar = localspec9descriptionvar;
        this.localspec10descriptionvar = localspec10descriptionvar;
        this.linecustomerpopup5var = linecustomerpopup5var;
        this.linecustomerremark15var = linecustomerremark15var;
        this.linecustomerremark16var = linecustomerremark16var;
        this.linecustomerremark17var = linecustomerremark17var;
        this.linecustomerremark18var = linecustomerremark18var;
        this.linecustomerremark19var = linecustomerremark19var;
        this.linecustomerremark20var = linecustomerremark20var;
        this.customernumbervar = customernumbervar;
        this.customernamevar = customernamevar;
        this.languagevar = languagevar;
        this.expensejustificationhelptextvar = expensejustificationhelptextvar;
        this.lineapprovalrelationvar = lineapprovalrelationvar;
        this.lineapprovalnumbervar = lineapprovalnumbervar;
        this.lineapprovallinenumbervar = lineapprovallinenumbervar;
        this.linecurrentapprovalstatusdescriptionvar = linecurrentapprovalstatusdescriptionvar;
        this.linecurrentapprovalstatusvar = linecurrentapprovalstatusvar;
        this.linecanbeapprovedbycurrentuservar = linecanbeapprovedbycurrentuservar;
        this.lineapprovedorrejectedbyvar = lineapprovedorrejectedbyvar;
        this.lineapprovaldatevar = lineapprovaldatevar;
        this.lineapprovaltimevar = lineapprovaltimevar;
        this.lineremarkvar = lineremarkvar;
        this.tooltipjobvar = tooltipjobvar;
        this.tooltiptaskvar = tooltiptaskvar;
        this.tooltiptasklinebreakvar = tooltiptasklinebreakvar;
        this.tooltipactivityvar = tooltipactivityvar;
        this.tooltipconclusionvar = tooltipconclusionvar;
        this.linedetailsvar = linedetailsvar;
        this.linedetailstypevar = linedetailstypevar;
        this.customerlevelnamevar = customerlevelnamevar;
        this.level1customernumbervar = level1customernumbervar;
        this.level2customernumbervar = level2customernumbervar;
        this.level3customernumbervar = level3customernumbervar;
        this.level4customernumbervar = level4customernumbervar;
        this.level5customernumbervar = level5customernumbervar;
        this.level1customernamevar = level1customernamevar;
        this.level2customernamevar = level2customernamevar;
        this.level3customernamevar = level3customernamevar;
        this.level4customernamevar = level4customernamevar;
        this.level5customernamevar = level5customernamevar;
        this.lineprojectmanagernumbervar = lineprojectmanagernumbervar;
        this.lineprojectmanagernamevar = lineprojectmanagernamevar;
        this.justificationrequiredvar = justificationrequiredvar;
        this.justificationcompletevar = justificationcompletevar;
        this.taskisperdiem = taskisperdiem;
        this.unitpriceopen = unitpriceopen;
    }

    /**
     * 
     * @return
     *     The expensesheetnumber
     */
    @JsonProperty("expensesheetnumber")
    public String getExpensesheetnumber() {
        return expensesheetnumber;
    }

    /**
     * 
     * @param expensesheetnumber
     *     The expensesheetnumber
     */
    @JsonProperty("expensesheetnumber")
    public void setExpensesheetnumber(String expensesheetnumber) {
        this.expensesheetnumber = expensesheetnumber;
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
     *     The text
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * 
     * @param text
     *     The text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * 
     * @return
     *     The currency
     */
    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    /**
     * 
     * @param currency
     *     The currency
     */
    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * 
     * @return
     *     The amountbase
     */
    @JsonProperty("amountbase")
    public Integer getAmountbase() {
        return amountbase;
    }

    /**
     * 
     * @param amountbase
     *     The amountbase
     */
    @JsonProperty("amountbase")
    public void setAmountbase(Integer amountbase) {
        this.amountbase = amountbase;
    }

    /**
     * 
     * @return
     *     The amountcurrency
     */
    @JsonProperty("amountcurrency")
    public Integer getAmountcurrency() {
        return amountcurrency;
    }

    /**
     * 
     * @param amountcurrency
     *     The amountcurrency
     */
    @JsonProperty("amountcurrency")
    public void setAmountcurrency(Integer amountcurrency) {
        this.amountcurrency = amountcurrency;
    }

    /**
     * 
     * @return
     *     The financevatcode
     */
    @JsonProperty("financevatcode")
    public String getFinancevatcode() {
        return financevatcode;
    }

    /**
     * 
     * @param financevatcode
     *     The financevatcode
     */
    @JsonProperty("financevatcode")
    public void setFinancevatcode(String financevatcode) {
        this.financevatcode = financevatcode;
    }

    /**
     * 
     * @return
     *     The reference
     */
    @JsonProperty("reference")
    public String getReference() {
        return reference;
    }

    /**
     * 
     * @param reference
     *     The reference
     */
    @JsonProperty("reference")
    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * 
     * @return
     *     The taskname
     */
    @JsonProperty("taskname")
    public String getTaskname() {
        return taskname;
    }

    /**
     * 
     * @param taskname
     *     The taskname
     */
    @JsonProperty("taskname")
    public void setTaskname(String taskname) {
        this.taskname = taskname;
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
     *     The startingdate
     */
    @JsonProperty("startingdate")
    public String getStartingdate() {
        return startingdate;
    }

    /**
     * 
     * @param startingdate
     *     The startingdate
     */
    @JsonProperty("startingdate")
    public void setStartingdate(String startingdate) {
        this.startingdate = startingdate;
    }

    /**
     * 
     * @return
     *     The startingtime
     */
    @JsonProperty("startingtime")
    public String getStartingtime() {
        return startingtime;
    }

    /**
     * 
     * @param startingtime
     *     The startingtime
     */
    @JsonProperty("startingtime")
    public void setStartingtime(String startingtime) {
        this.startingtime = startingtime;
    }

    /**
     * 
     * @return
     *     The endingdate
     */
    @JsonProperty("endingdate")
    public String getEndingdate() {
        return endingdate;
    }

    /**
     * 
     * @param endingdate
     *     The endingdate
     */
    @JsonProperty("endingdate")
    public void setEndingdate(String endingdate) {
        this.endingdate = endingdate;
    }

    /**
     * 
     * @return
     *     The closingtime
     */
    @JsonProperty("closingtime")
    public String getClosingtime() {
        return closingtime;
    }

    /**
     * 
     * @param closingtime
     *     The closingtime
     */
    @JsonProperty("closingtime")
    public void setClosingtime(String closingtime) {
        this.closingtime = closingtime;
    }

    /**
     * 
     * @return
     *     The remark1
     */
    @JsonProperty("remark1")
    public String getRemark1() {
        return remark1;
    }

    /**
     * 
     * @param remark1
     *     The remark1
     */
    @JsonProperty("remark1")
    public void setRemark1(String remark1) {
        this.remark1 = remark1;
    }

    /**
     * 
     * @return
     *     The remark2
     */
    @JsonProperty("remark2")
    public String getRemark2() {
        return remark2;
    }

    /**
     * 
     * @param remark2
     *     The remark2
     */
    @JsonProperty("remark2")
    public void setRemark2(String remark2) {
        this.remark2 = remark2;
    }

    /**
     * 
     * @return
     *     The remark3
     */
    @JsonProperty("remark3")
    public String getRemark3() {
        return remark3;
    }

    /**
     * 
     * @param remark3
     *     The remark3
     */
    @JsonProperty("remark3")
    public void setRemark3(String remark3) {
        this.remark3 = remark3;
    }

    /**
     * 
     * @return
     *     The quantitya
     */
    @JsonProperty("quantitya")
    public Integer getQuantitya() {
        return quantitya;
    }

    /**
     * 
     * @param quantitya
     *     The quantitya
     */
    @JsonProperty("quantitya")
    public void setQuantitya(Integer quantitya) {
        this.quantitya = quantitya;
    }

    /**
     * 
     * @return
     *     The quantityb
     */
    @JsonProperty("quantityb")
    public Integer getQuantityb() {
        return quantityb;
    }

    /**
     * 
     * @param quantityb
     *     The quantityb
     */
    @JsonProperty("quantityb")
    public void setQuantityb(Integer quantityb) {
        this.quantityb = quantityb;
    }

    /**
     * 
     * @return
     *     The unitpricebase
     */
    @JsonProperty("unitpricebase")
    public Integer getUnitpricebase() {
        return unitpricebase;
    }

    /**
     * 
     * @param unitpricebase
     *     The unitpricebase
     */
    @JsonProperty("unitpricebase")
    public void setUnitpricebase(Integer unitpricebase) {
        this.unitpricebase = unitpricebase;
    }

    /**
     * 
     * @return
     *     The unitpricecurrency
     */
    @JsonProperty("unitpricecurrency")
    public Integer getUnitpricecurrency() {
        return unitpricecurrency;
    }

    /**
     * 
     * @param unitpricecurrency
     *     The unitpricecurrency
     */
    @JsonProperty("unitpricecurrency")
    public void setUnitpricecurrency(Integer unitpricecurrency) {
        this.unitpricecurrency = unitpricecurrency;
    }

    /**
     * 
     * @return
     *     The numberof
     */
    @JsonProperty("numberof")
    public Double getNumberof() {
        return numberof;
    }

    /**
     * 
     * @param numberof
     *     The numberof
     */
    @JsonProperty("numberof")
    public void setNumberof(Double numberof) {
        this.numberof = numberof;
    }

    /**
     * 
     * @return
     *     The costtype
     */
    @JsonProperty("costtype")
    public String getCosttype() {
        return costtype;
    }

    /**
     * 
     * @param costtype
     *     The costtype
     */
    @JsonProperty("costtype")
    public void setCosttype(String costtype) {
        this.costtype = costtype;
    }

    /**
     * 
     * @return
     *     The submitted
     */
    @JsonProperty("submitted")
    public Boolean getSubmitted() {
        return submitted;
    }

    /**
     * 
     * @param submitted
     *     The submitted
     */
    @JsonProperty("submitted")
    public void setSubmitted(Boolean submitted) {
        this.submitted = submitted;
    }

    /**
     * 
     * @return
     *     The newapprovalstatus
     */
    @JsonProperty("newapprovalstatus")
    public String getNewapprovalstatus() {
        return newapprovalstatus;
    }

    /**
     * 
     * @param newapprovalstatus
     *     The newapprovalstatus
     */
    @JsonProperty("newapprovalstatus")
    public void setNewapprovalstatus(String newapprovalstatus) {
        this.newapprovalstatus = newapprovalstatus;
    }

    /**
     * 
     * @return
     *     The approvalstatus
     */
    @JsonProperty("approvalstatus")
    public String getApprovalstatus() {
        return approvalstatus;
    }

    /**
     * 
     * @param approvalstatus
     *     The approvalstatus
     */
    @JsonProperty("approvalstatus")
    public void setApprovalstatus(String approvalstatus) {
        this.approvalstatus = approvalstatus;
    }

    /**
     * 
     * @return
     *     The approvedorrejectedby
     */
    @JsonProperty("approvedorrejectedby")
    public String getApprovedorrejectedby() {
        return approvedorrejectedby;
    }

    /**
     * 
     * @param approvedorrejectedby
     *     The approvedorrejectedby
     */
    @JsonProperty("approvedorrejectedby")
    public void setApprovedorrejectedby(String approvedorrejectedby) {
        this.approvedorrejectedby = approvedorrejectedby;
    }

    /**
     * 
     * @return
     *     The approvaldate
     */
    @JsonProperty("approvaldate")
    public String getApprovaldate() {
        return approvaldate;
    }

    /**
     * 
     * @param approvaldate
     *     The approvaldate
     */
    @JsonProperty("approvaldate")
    public void setApprovaldate(String approvaldate) {
        this.approvaldate = approvaldate;
    }

    /**
     * 
     * @return
     *     The commentprojectmanager
     */
    @JsonProperty("commentprojectmanager")
    public String getCommentprojectmanager() {
        return commentprojectmanager;
    }

    /**
     * 
     * @param commentprojectmanager
     *     The commentprojectmanager
     */
    @JsonProperty("commentprojectmanager")
    public void setCommentprojectmanager(String commentprojectmanager) {
        this.commentprojectmanager = commentprojectmanager;
    }

    /**
     * 
     * @return
     *     The approvedbysuperior
     */
    @JsonProperty("approvedbysuperior")
    public Boolean getApprovedbysuperior() {
        return approvedbysuperior;
    }

    /**
     * 
     * @param approvedbysuperior
     *     The approvedbysuperior
     */
    @JsonProperty("approvedbysuperior")
    public void setApprovedbysuperior(Boolean approvedbysuperior) {
        this.approvedbysuperior = approvedbysuperior;
    }

    /**
     * 
     * @return
     *     The transferredforposting
     */
    @JsonProperty("transferredforposting")
    public Boolean getTransferredforposting() {
        return transferredforposting;
    }

    /**
     * 
     * @param transferredforposting
     *     The transferredforposting
     */
    @JsonProperty("transferredforposting")
    public void setTransferredforposting(Boolean transferredforposting) {
        this.transferredforposting = transferredforposting;
    }

    /**
     * 
     * @return
     *     The transferredamountbase
     */
    @JsonProperty("transferredamountbase")
    public Integer getTransferredamountbase() {
        return transferredamountbase;
    }

    /**
     * 
     * @param transferredamountbase
     *     The transferredamountbase
     */
    @JsonProperty("transferredamountbase")
    public void setTransferredamountbase(Integer transferredamountbase) {
        this.transferredamountbase = transferredamountbase;
    }

    /**
     * 
     * @return
     *     The transferredquantitya
     */
    @JsonProperty("transferredquantitya")
    public Integer getTransferredquantitya() {
        return transferredquantitya;
    }

    /**
     * 
     * @param transferredquantitya
     *     The transferredquantitya
     */
    @JsonProperty("transferredquantitya")
    public void setTransferredquantitya(Integer transferredquantitya) {
        this.transferredquantitya = transferredquantitya;
    }

    /**
     * 
     * @return
     *     The transferredquantityb
     */
    @JsonProperty("transferredquantityb")
    public Integer getTransferredquantityb() {
        return transferredquantityb;
    }

    /**
     * 
     * @param transferredquantityb
     *     The transferredquantityb
     */
    @JsonProperty("transferredquantityb")
    public void setTransferredquantityb(Integer transferredquantityb) {
        this.transferredquantityb = transferredquantityb;
    }

    /**
     * 
     * @return
     *     The transferredamountcurrency
     */
    @JsonProperty("transferredamountcurrency")
    public Integer getTransferredamountcurrency() {
        return transferredamountcurrency;
    }

    /**
     * 
     * @param transferredamountcurrency
     *     The transferredamountcurrency
     */
    @JsonProperty("transferredamountcurrency")
    public void setTransferredamountcurrency(Integer transferredamountcurrency) {
        this.transferredamountcurrency = transferredamountcurrency;
    }

    /**
     * 
     * @return
     *     The employeenumber
     */
    @JsonProperty("employeenumber")
    public String getEmployeenumber() {
        return employeenumber;
    }

    /**
     * 
     * @param employeenumber
     *     The employeenumber
     */
    @JsonProperty("employeenumber")
    public void setEmployeenumber(String employeenumber) {
        this.employeenumber = employeenumber;
    }

    /**
     * 
     * @return
     *     The releasedbysuperior
     */
    @JsonProperty("releasedbysuperior")
    public Boolean getReleasedbysuperior() {
        return releasedbysuperior;
    }

    /**
     * 
     * @param releasedbysuperior
     *     The releasedbysuperior
     */
    @JsonProperty("releasedbysuperior")
    public void setReleasedbysuperior(Boolean releasedbysuperior) {
        this.releasedbysuperior = releasedbysuperior;
    }

    /**
     * 
     * @return
     *     The amountenterprise
     */
    @JsonProperty("amountenterprise")
    public Integer getAmountenterprise() {
        return amountenterprise;
    }

    /**
     * 
     * @param amountenterprise
     *     The amountenterprise
     */
    @JsonProperty("amountenterprise")
    public void setAmountenterprise(Integer amountenterprise) {
        this.amountenterprise = amountenterprise;
    }

    /**
     * 
     * @return
     *     The unitpriceenterprise
     */
    @JsonProperty("unitpriceenterprise")
    public Integer getUnitpriceenterprise() {
        return unitpriceenterprise;
    }

    /**
     * 
     * @param unitpriceenterprise
     *     The unitpriceenterprise
     */
    @JsonProperty("unitpriceenterprise")
    public void setUnitpriceenterprise(Integer unitpriceenterprise) {
        this.unitpriceenterprise = unitpriceenterprise;
    }

    /**
     * 
     * @return
     *     The transferredamountenterprise
     */
    @JsonProperty("transferredamountenterprise")
    public Integer getTransferredamountenterprise() {
        return transferredamountenterprise;
    }

    /**
     * 
     * @param transferredamountenterprise
     *     The transferredamountenterprise
     */
    @JsonProperty("transferredamountenterprise")
    public void setTransferredamountenterprise(Integer transferredamountenterprise) {
        this.transferredamountenterprise = transferredamountenterprise;
    }

    /**
     * 
     * @return
     *     The exchangerate
     */
    @JsonProperty("exchangerate")
    public Integer getExchangerate() {
        return exchangerate;
    }

    /**
     * 
     * @param exchangerate
     *     The exchangerate
     */
    @JsonProperty("exchangerate")
    public void setExchangerate(Integer exchangerate) {
        this.exchangerate = exchangerate;
    }

    /**
     * 
     * @return
     *     The vatcurrency
     */
    @JsonProperty("vatcurrency")
    public Integer getVatcurrency() {
        return vatcurrency;
    }

    /**
     * 
     * @param vatcurrency
     *     The vatcurrency
     */
    @JsonProperty("vatcurrency")
    public void setVatcurrency(Integer vatcurrency) {
        this.vatcurrency = vatcurrency;
    }

    /**
     * 
     * @return
     *     The vatbase
     */
    @JsonProperty("vatbase")
    public Integer getVatbase() {
        return vatbase;
    }

    /**
     * 
     * @param vatbase
     *     The vatbase
     */
    @JsonProperty("vatbase")
    public void setVatbase(Integer vatbase) {
        this.vatbase = vatbase;
    }

    /**
     * 
     * @return
     *     The vatenterprise
     */
    @JsonProperty("vatenterprise")
    public Integer getVatenterprise() {
        return vatenterprise;
    }

    /**
     * 
     * @param vatenterprise
     *     The vatenterprise
     */
    @JsonProperty("vatenterprise")
    public void setVatenterprise(Integer vatenterprise) {
        this.vatenterprise = vatenterprise;
    }

    /**
     * 
     * @return
     *     The transferredvatcurrency
     */
    @JsonProperty("transferredvatcurrency")
    public Integer getTransferredvatcurrency() {
        return transferredvatcurrency;
    }

    /**
     * 
     * @param transferredvatcurrency
     *     The transferredvatcurrency
     */
    @JsonProperty("transferredvatcurrency")
    public void setTransferredvatcurrency(Integer transferredvatcurrency) {
        this.transferredvatcurrency = transferredvatcurrency;
    }

    /**
     * 
     * @return
     *     The transferredvatbase
     */
    @JsonProperty("transferredvatbase")
    public Integer getTransferredvatbase() {
        return transferredvatbase;
    }

    /**
     * 
     * @param transferredvatbase
     *     The transferredvatbase
     */
    @JsonProperty("transferredvatbase")
    public void setTransferredvatbase(Integer transferredvatbase) {
        this.transferredvatbase = transferredvatbase;
    }

    /**
     * 
     * @return
     *     The transferredvatenterprise
     */
    @JsonProperty("transferredvatenterprise")
    public Integer getTransferredvatenterprise() {
        return transferredvatenterprise;
    }

    /**
     * 
     * @param transferredvatenterprise
     *     The transferredvatenterprise
     */
    @JsonProperty("transferredvatenterprise")
    public void setTransferredvatenterprise(Integer transferredvatenterprise) {
        this.transferredvatenterprise = transferredvatenterprise;
    }

    /**
     * 
     * @return
     *     The unitpriceexvatbase
     */
    @JsonProperty("unitpriceexvatbase")
    public Integer getUnitpriceexvatbase() {
        return unitpriceexvatbase;
    }

    /**
     * 
     * @param unitpriceexvatbase
     *     The unitpriceexvatbase
     */
    @JsonProperty("unitpriceexvatbase")
    public void setUnitpriceexvatbase(Integer unitpriceexvatbase) {
        this.unitpriceexvatbase = unitpriceexvatbase;
    }

    /**
     * 
     * @return
     *     The unitpriceexvatcurrency
     */
    @JsonProperty("unitpriceexvatcurrency")
    public Integer getUnitpriceexvatcurrency() {
        return unitpriceexvatcurrency;
    }

    /**
     * 
     * @param unitpriceexvatcurrency
     *     The unitpriceexvatcurrency
     */
    @JsonProperty("unitpriceexvatcurrency")
    public void setUnitpriceexvatcurrency(Integer unitpriceexvatcurrency) {
        this.unitpriceexvatcurrency = unitpriceexvatcurrency;
    }

    /**
     * 
     * @return
     *     The unitpriceexvatenterprise
     */
    @JsonProperty("unitpriceexvatenterprise")
    public Integer getUnitpriceexvatenterprise() {
        return unitpriceexvatenterprise;
    }

    /**
     * 
     * @param unitpriceexvatenterprise
     *     The unitpriceexvatenterprise
     */
    @JsonProperty("unitpriceexvatenterprise")
    public void setUnitpriceexvatenterprise(Integer unitpriceexvatenterprise) {
        this.unitpriceexvatenterprise = unitpriceexvatenterprise;
    }

    /**
     * 
     * @return
     *     The documentname
     */
    @JsonProperty("documentname")
    public String getDocumentname() {
        return documentname;
    }

    /**
     * 
     * @param documentname
     *     The documentname
     */
    @JsonProperty("documentname")
    public void setDocumentname(String documentname) {
        this.documentname = documentname;
    }

    /**
     * 
     * @return
     *     The instancekey
     */
    @JsonProperty("instancekey")
    public String getInstancekey() {
        return instancekey;
    }

    /**
     * 
     * @param instancekey
     *     The instancekey
     */
    @JsonProperty("instancekey")
    public void setInstancekey(String instancekey) {
        this.instancekey = instancekey;
    }

    /**
     * 
     * @return
     *     The transactiontimestamp
     */
    @JsonProperty("transactiontimestamp")
    public String getTransactiontimestamp() {
        return transactiontimestamp;
    }

    /**
     * 
     * @param transactiontimestamp
     *     The transactiontimestamp
     */
    @JsonProperty("transactiontimestamp")
    public void setTransactiontimestamp(String transactiontimestamp) {
        this.transactiontimestamp = transactiontimestamp;
    }

    /**
     * 
     * @return
     *     The favorite
     */
    @JsonProperty("favorite")
    public String getFavorite() {
        return favorite;
    }

    /**
     * 
     * @param favorite
     *     The favorite
     */
    @JsonProperty("favorite")
    public void setFavorite(String favorite) {
        this.favorite = favorite;
    }

    /**
     * 
     * @return
     *     The transferredvatspecificationentry
     */
    @JsonProperty("transferredvatspecificationentry")
    public String getTransferredvatspecificationentry() {
        return transferredvatspecificationentry;
    }

    /**
     * 
     * @param transferredvatspecificationentry
     *     The transferredvatspecificationentry
     */
    @JsonProperty("transferredvatspecificationentry")
    public void setTransferredvatspecificationentry(String transferredvatspecificationentry) {
        this.transferredvatspecificationentry = transferredvatspecificationentry;
    }

    /**
     * 
     * @return
     *     The financevatcode2
     */
    @JsonProperty("financevatcode2")
    public String getFinancevatcode2() {
        return financevatcode2;
    }

    /**
     * 
     * @param financevatcode2
     *     The financevatcode2
     */
    @JsonProperty("financevatcode2")
    public void setFinancevatcode2(String financevatcode2) {
        this.financevatcode2 = financevatcode2;
    }

    /**
     * 
     * @return
     *     The financevatcode3
     */
    @JsonProperty("financevatcode3")
    public String getFinancevatcode3() {
        return financevatcode3;
    }

    /**
     * 
     * @param financevatcode3
     *     The financevatcode3
     */
    @JsonProperty("financevatcode3")
    public void setFinancevatcode3(String financevatcode3) {
        this.financevatcode3 = financevatcode3;
    }

    /**
     * 
     * @return
     *     The vat1currency
     */
    @JsonProperty("vat1currency")
    public Integer getVat1currency() {
        return vat1currency;
    }

    /**
     * 
     * @param vat1currency
     *     The vat1currency
     */
    @JsonProperty("vat1currency")
    public void setVat1currency(Integer vat1currency) {
        this.vat1currency = vat1currency;
    }

    /**
     * 
     * @return
     *     The vat1base
     */
    @JsonProperty("vat1base")
    public Integer getVat1base() {
        return vat1base;
    }

    /**
     * 
     * @param vat1base
     *     The vat1base
     */
    @JsonProperty("vat1base")
    public void setVat1base(Integer vat1base) {
        this.vat1base = vat1base;
    }

    /**
     * 
     * @return
     *     The vat1enterprise
     */
    @JsonProperty("vat1enterprise")
    public Integer getVat1enterprise() {
        return vat1enterprise;
    }

    /**
     * 
     * @param vat1enterprise
     *     The vat1enterprise
     */
    @JsonProperty("vat1enterprise")
    public void setVat1enterprise(Integer vat1enterprise) {
        this.vat1enterprise = vat1enterprise;
    }

    /**
     * 
     * @return
     *     The vat2currency
     */
    @JsonProperty("vat2currency")
    public Integer getVat2currency() {
        return vat2currency;
    }

    /**
     * 
     * @param vat2currency
     *     The vat2currency
     */
    @JsonProperty("vat2currency")
    public void setVat2currency(Integer vat2currency) {
        this.vat2currency = vat2currency;
    }

    /**
     * 
     * @return
     *     The vat2base
     */
    @JsonProperty("vat2base")
    public Integer getVat2base() {
        return vat2base;
    }

    /**
     * 
     * @param vat2base
     *     The vat2base
     */
    @JsonProperty("vat2base")
    public void setVat2base(Integer vat2base) {
        this.vat2base = vat2base;
    }

    /**
     * 
     * @return
     *     The vat2enterprise
     */
    @JsonProperty("vat2enterprise")
    public Integer getVat2enterprise() {
        return vat2enterprise;
    }

    /**
     * 
     * @param vat2enterprise
     *     The vat2enterprise
     */
    @JsonProperty("vat2enterprise")
    public void setVat2enterprise(Integer vat2enterprise) {
        this.vat2enterprise = vat2enterprise;
    }

    /**
     * 
     * @return
     *     The vat3currency
     */
    @JsonProperty("vat3currency")
    public Integer getVat3currency() {
        return vat3currency;
    }

    /**
     * 
     * @param vat3currency
     *     The vat3currency
     */
    @JsonProperty("vat3currency")
    public void setVat3currency(Integer vat3currency) {
        this.vat3currency = vat3currency;
    }

    /**
     * 
     * @return
     *     The vat3base
     */
    @JsonProperty("vat3base")
    public Integer getVat3base() {
        return vat3base;
    }

    /**
     * 
     * @param vat3base
     *     The vat3base
     */
    @JsonProperty("vat3base")
    public void setVat3base(Integer vat3base) {
        this.vat3base = vat3base;
    }

    /**
     * 
     * @return
     *     The vat3enterprise
     */
    @JsonProperty("vat3enterprise")
    public Integer getVat3enterprise() {
        return vat3enterprise;
    }

    /**
     * 
     * @param vat3enterprise
     *     The vat3enterprise
     */
    @JsonProperty("vat3enterprise")
    public void setVat3enterprise(Integer vat3enterprise) {
        this.vat3enterprise = vat3enterprise;
    }

    /**
     * 
     * @return
     *     The numberproposed
     */
    @JsonProperty("numberproposed")
    public Integer getNumberproposed() {
        return numberproposed;
    }

    /**
     * 
     * @param numberproposed
     *     The numberproposed
     */
    @JsonProperty("numberproposed")
    public void setNumberproposed(Integer numberproposed) {
        this.numberproposed = numberproposed;
    }

    /**
     * 
     * @return
     *     The numberproposedtransferred
     */
    @JsonProperty("numberproposedtransferred")
    public Integer getNumberproposedtransferred() {
        return numberproposedtransferred;
    }

    /**
     * 
     * @param numberproposedtransferred
     *     The numberproposedtransferred
     */
    @JsonProperty("numberproposedtransferred")
    public void setNumberproposedtransferred(Integer numberproposedtransferred) {
        this.numberproposedtransferred = numberproposedtransferred;
    }

    /**
     * 
     * @return
     *     The billingpricetotalproposedcurrency
     */
    @JsonProperty("billingpricetotalproposedcurrency")
    public Integer getBillingpricetotalproposedcurrency() {
        return billingpricetotalproposedcurrency;
    }

    /**
     * 
     * @param billingpricetotalproposedcurrency
     *     The billingpricetotalproposedcurrency
     */
    @JsonProperty("billingpricetotalproposedcurrency")
    public void setBillingpricetotalproposedcurrency(Integer billingpricetotalproposedcurrency) {
        this.billingpricetotalproposedcurrency = billingpricetotalproposedcurrency;
    }

    /**
     * 
     * @return
     *     The billingpriceproposedcurrency
     */
    @JsonProperty("billingpriceproposedcurrency")
    public Integer getBillingpriceproposedcurrency() {
        return billingpriceproposedcurrency;
    }

    /**
     * 
     * @param billingpriceproposedcurrency
     *     The billingpriceproposedcurrency
     */
    @JsonProperty("billingpriceproposedcurrency")
    public void setBillingpriceproposedcurrency(Integer billingpriceproposedcurrency) {
        this.billingpriceproposedcurrency = billingpriceproposedcurrency;
    }

    /**
     * 
     * @return
     *     The billingpricecurrency
     */
    @JsonProperty("billingpricecurrency")
    public Integer getBillingpricecurrency() {
        return billingpricecurrency;
    }

    /**
     * 
     * @param billingpricecurrency
     *     The billingpricecurrency
     */
    @JsonProperty("billingpricecurrency")
    public void setBillingpricecurrency(Integer billingpricecurrency) {
        this.billingpricecurrency = billingpricecurrency;
    }

    /**
     * 
     * @return
     *     The useinvoiceproposal
     */
    @JsonProperty("useinvoiceproposal")
    public Boolean getUseinvoiceproposal() {
        return useinvoiceproposal;
    }

    /**
     * 
     * @param useinvoiceproposal
     *     The useinvoiceproposal
     */
    @JsonProperty("useinvoiceproposal")
    public void setUseinvoiceproposal(Boolean useinvoiceproposal) {
        this.useinvoiceproposal = useinvoiceproposal;
    }

    /**
     * 
     * @return
     *     The mileagefrom
     */
    @JsonProperty("mileagefrom")
    public String getMileagefrom() {
        return mileagefrom;
    }

    /**
     * 
     * @param mileagefrom
     *     The mileagefrom
     */
    @JsonProperty("mileagefrom")
    public void setMileagefrom(String mileagefrom) {
        this.mileagefrom = mileagefrom;
    }

    /**
     * 
     * @return
     *     The mileageto
     */
    @JsonProperty("mileageto")
    public String getMileageto() {
        return mileageto;
    }

    /**
     * 
     * @param mileageto
     *     The mileageto
     */
    @JsonProperty("mileageto")
    public void setMileageto(String mileageto) {
        this.mileageto = mileageto;
    }

    /**
     * 
     * @return
     *     The mileagevia
     */
    @JsonProperty("mileagevia")
    public String getMileagevia() {
        return mileagevia;
    }

    /**
     * 
     * @param mileagevia
     *     The mileagevia
     */
    @JsonProperty("mileagevia")
    public void setMileagevia(String mileagevia) {
        this.mileagevia = mileagevia;
    }

    /**
     * 
     * @return
     *     The mileagevehicle
     */
    @JsonProperty("mileagevehicle")
    public String getMileagevehicle() {
        return mileagevehicle;
    }

    /**
     * 
     * @param mileagevehicle
     *     The mileagevehicle
     */
    @JsonProperty("mileagevehicle")
    public void setMileagevehicle(String mileagevehicle) {
        this.mileagevehicle = mileagevehicle;
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
     *     The expensesheetlinetext1
     */
    @JsonProperty("expensesheetlinetext1")
    public String getExpensesheetlinetext1() {
        return expensesheetlinetext1;
    }

    /**
     * 
     * @param expensesheetlinetext1
     *     The expensesheetlinetext1
     */
    @JsonProperty("expensesheetlinetext1")
    public void setExpensesheetlinetext1(String expensesheetlinetext1) {
        this.expensesheetlinetext1 = expensesheetlinetext1;
    }

    /**
     * 
     * @return
     *     The expensesheetlinetext2
     */
    @JsonProperty("expensesheetlinetext2")
    public String getExpensesheetlinetext2() {
        return expensesheetlinetext2;
    }

    /**
     * 
     * @param expensesheetlinetext2
     *     The expensesheetlinetext2
     */
    @JsonProperty("expensesheetlinetext2")
    public void setExpensesheetlinetext2(String expensesheetlinetext2) {
        this.expensesheetlinetext2 = expensesheetlinetext2;
    }

    /**
     * 
     * @return
     *     The expensesheetlinetext3
     */
    @JsonProperty("expensesheetlinetext3")
    public String getExpensesheetlinetext3() {
        return expensesheetlinetext3;
    }

    /**
     * 
     * @param expensesheetlinetext3
     *     The expensesheetlinetext3
     */
    @JsonProperty("expensesheetlinetext3")
    public void setExpensesheetlinetext3(String expensesheetlinetext3) {
        this.expensesheetlinetext3 = expensesheetlinetext3;
    }

    /**
     * 
     * @return
     *     The expensesheetlinetext4
     */
    @JsonProperty("expensesheetlinetext4")
    public String getExpensesheetlinetext4() {
        return expensesheetlinetext4;
    }

    /**
     * 
     * @param expensesheetlinetext4
     *     The expensesheetlinetext4
     */
    @JsonProperty("expensesheetlinetext4")
    public void setExpensesheetlinetext4(String expensesheetlinetext4) {
        this.expensesheetlinetext4 = expensesheetlinetext4;
    }

    /**
     * 
     * @return
     *     The expensesheetlinetext5
     */
    @JsonProperty("expensesheetlinetext5")
    public String getExpensesheetlinetext5() {
        return expensesheetlinetext5;
    }

    /**
     * 
     * @param expensesheetlinetext5
     *     The expensesheetlinetext5
     */
    @JsonProperty("expensesheetlinetext5")
    public void setExpensesheetlinetext5(String expensesheetlinetext5) {
        this.expensesheetlinetext5 = expensesheetlinetext5;
    }

    /**
     * 
     * @return
     *     The expensesheetlinetext6
     */
    @JsonProperty("expensesheetlinetext6")
    public String getExpensesheetlinetext6() {
        return expensesheetlinetext6;
    }

    /**
     * 
     * @param expensesheetlinetext6
     *     The expensesheetlinetext6
     */
    @JsonProperty("expensesheetlinetext6")
    public void setExpensesheetlinetext6(String expensesheetlinetext6) {
        this.expensesheetlinetext6 = expensesheetlinetext6;
    }

    /**
     * 
     * @return
     *     The expensesheetlinetext7
     */
    @JsonProperty("expensesheetlinetext7")
    public String getExpensesheetlinetext7() {
        return expensesheetlinetext7;
    }

    /**
     * 
     * @param expensesheetlinetext7
     *     The expensesheetlinetext7
     */
    @JsonProperty("expensesheetlinetext7")
    public void setExpensesheetlinetext7(String expensesheetlinetext7) {
        this.expensesheetlinetext7 = expensesheetlinetext7;
    }

    /**
     * 
     * @return
     *     The expensesheetlinetext8
     */
    @JsonProperty("expensesheetlinetext8")
    public String getExpensesheetlinetext8() {
        return expensesheetlinetext8;
    }

    /**
     * 
     * @param expensesheetlinetext8
     *     The expensesheetlinetext8
     */
    @JsonProperty("expensesheetlinetext8")
    public void setExpensesheetlinetext8(String expensesheetlinetext8) {
        this.expensesheetlinetext8 = expensesheetlinetext8;
    }

    /**
     * 
     * @return
     *     The expensesheetlinetext9
     */
    @JsonProperty("expensesheetlinetext9")
    public String getExpensesheetlinetext9() {
        return expensesheetlinetext9;
    }

    /**
     * 
     * @param expensesheetlinetext9
     *     The expensesheetlinetext9
     */
    @JsonProperty("expensesheetlinetext9")
    public void setExpensesheetlinetext9(String expensesheetlinetext9) {
        this.expensesheetlinetext9 = expensesheetlinetext9;
    }

    /**
     * 
     * @return
     *     The expensesheetlinetext10
     */
    @JsonProperty("expensesheetlinetext10")
    public String getExpensesheetlinetext10() {
        return expensesheetlinetext10;
    }

    /**
     * 
     * @param expensesheetlinetext10
     *     The expensesheetlinetext10
     */
    @JsonProperty("expensesheetlinetext10")
    public void setExpensesheetlinetext10(String expensesheetlinetext10) {
        this.expensesheetlinetext10 = expensesheetlinetext10;
    }

    /**
     * 
     * @return
     *     The expensesheetlineinteger1
     */
    @JsonProperty("expensesheetlineinteger1")
    public Integer getExpensesheetlineinteger1() {
        return expensesheetlineinteger1;
    }

    /**
     * 
     * @param expensesheetlineinteger1
     *     The expensesheetlineinteger1
     */
    @JsonProperty("expensesheetlineinteger1")
    public void setExpensesheetlineinteger1(Integer expensesheetlineinteger1) {
        this.expensesheetlineinteger1 = expensesheetlineinteger1;
    }

    /**
     * 
     * @return
     *     The expensesheetlineinteger2
     */
    @JsonProperty("expensesheetlineinteger2")
    public Integer getExpensesheetlineinteger2() {
        return expensesheetlineinteger2;
    }

    /**
     * 
     * @param expensesheetlineinteger2
     *     The expensesheetlineinteger2
     */
    @JsonProperty("expensesheetlineinteger2")
    public void setExpensesheetlineinteger2(Integer expensesheetlineinteger2) {
        this.expensesheetlineinteger2 = expensesheetlineinteger2;
    }

    /**
     * 
     * @return
     *     The expensesheetlineinteger3
     */
    @JsonProperty("expensesheetlineinteger3")
    public Integer getExpensesheetlineinteger3() {
        return expensesheetlineinteger3;
    }

    /**
     * 
     * @param expensesheetlineinteger3
     *     The expensesheetlineinteger3
     */
    @JsonProperty("expensesheetlineinteger3")
    public void setExpensesheetlineinteger3(Integer expensesheetlineinteger3) {
        this.expensesheetlineinteger3 = expensesheetlineinteger3;
    }

    /**
     * 
     * @return
     *     The expensesheetlineinteger4
     */
    @JsonProperty("expensesheetlineinteger4")
    public Integer getExpensesheetlineinteger4() {
        return expensesheetlineinteger4;
    }

    /**
     * 
     * @param expensesheetlineinteger4
     *     The expensesheetlineinteger4
     */
    @JsonProperty("expensesheetlineinteger4")
    public void setExpensesheetlineinteger4(Integer expensesheetlineinteger4) {
        this.expensesheetlineinteger4 = expensesheetlineinteger4;
    }

    /**
     * 
     * @return
     *     The expensesheetlineinteger5
     */
    @JsonProperty("expensesheetlineinteger5")
    public Integer getExpensesheetlineinteger5() {
        return expensesheetlineinteger5;
    }

    /**
     * 
     * @param expensesheetlineinteger5
     *     The expensesheetlineinteger5
     */
    @JsonProperty("expensesheetlineinteger5")
    public void setExpensesheetlineinteger5(Integer expensesheetlineinteger5) {
        this.expensesheetlineinteger5 = expensesheetlineinteger5;
    }

    /**
     * 
     * @return
     *     The expensesheetlinedate1
     */
    @JsonProperty("expensesheetlinedate1")
    public String getExpensesheetlinedate1() {
        return expensesheetlinedate1;
    }

    /**
     * 
     * @param expensesheetlinedate1
     *     The expensesheetlinedate1
     */
    @JsonProperty("expensesheetlinedate1")
    public void setExpensesheetlinedate1(String expensesheetlinedate1) {
        this.expensesheetlinedate1 = expensesheetlinedate1;
    }

    /**
     * 
     * @return
     *     The expensesheetlinedate2
     */
    @JsonProperty("expensesheetlinedate2")
    public String getExpensesheetlinedate2() {
        return expensesheetlinedate2;
    }

    /**
     * 
     * @param expensesheetlinedate2
     *     The expensesheetlinedate2
     */
    @JsonProperty("expensesheetlinedate2")
    public void setExpensesheetlinedate2(String expensesheetlinedate2) {
        this.expensesheetlinedate2 = expensesheetlinedate2;
    }

    /**
     * 
     * @return
     *     The expensesheetlinetime1
     */
    @JsonProperty("expensesheetlinetime1")
    public String getExpensesheetlinetime1() {
        return expensesheetlinetime1;
    }

    /**
     * 
     * @param expensesheetlinetime1
     *     The expensesheetlinetime1
     */
    @JsonProperty("expensesheetlinetime1")
    public void setExpensesheetlinetime1(String expensesheetlinetime1) {
        this.expensesheetlinetime1 = expensesheetlinetime1;
    }

    /**
     * 
     * @return
     *     The expensesheetlinetime2
     */
    @JsonProperty("expensesheetlinetime2")
    public String getExpensesheetlinetime2() {
        return expensesheetlinetime2;
    }

    /**
     * 
     * @param expensesheetlinetime2
     *     The expensesheetlinetime2
     */
    @JsonProperty("expensesheetlinetime2")
    public void setExpensesheetlinetime2(String expensesheetlinetime2) {
        this.expensesheetlinetime2 = expensesheetlinetime2;
    }

    /**
     * 
     * @return
     *     The transferrednumberof
     */
    @JsonProperty("transferrednumberof")
    public Integer getTransferrednumberof() {
        return transferrednumberof;
    }

    /**
     * 
     * @param transferrednumberof
     *     The transferrednumberof
     */
    @JsonProperty("transferrednumberof")
    public void setTransferrednumberof(Integer transferrednumberof) {
        this.transferrednumberof = transferrednumberof;
    }

    /**
     * 
     * @return
     *     The expensesheettype
     */
    @JsonProperty("expensesheettype")
    public String getExpensesheettype() {
        return expensesheettype;
    }

    /**
     * 
     * @param expensesheettype
     *     The expensesheettype
     */
    @JsonProperty("expensesheettype")
    public void setExpensesheettype(String expensesheettype) {
        this.expensesheettype = expensesheettype;
    }

    /**
     * 
     * @return
     *     The invoiceable
     */
    @JsonProperty("invoiceable")
    public Boolean getInvoiceable() {
        return invoiceable;
    }

    /**
     * 
     * @param invoiceable
     *     The invoiceable
     */
    @JsonProperty("invoiceable")
    public void setInvoiceable(Boolean invoiceable) {
        this.invoiceable = invoiceable;
    }

    /**
     * 
     * @return
     *     The expensejustification
     */
    @JsonProperty("expensejustification")
    public String getExpensejustification() {
        return expensejustification;
    }

    /**
     * 
     * @param expensejustification
     *     The expensejustification
     */
    @JsonProperty("expensejustification")
    public void setExpensejustification(String expensejustification) {
        this.expensejustification = expensejustification;
    }

    /**
     * 
     * @return
     *     The timesheetlineinstancekey
     */
    @JsonProperty("timesheetlineinstancekey")
    public String getTimesheetlineinstancekey() {
        return timesheetlineinstancekey;
    }

    /**
     * 
     * @param timesheetlineinstancekey
     *     The timesheetlineinstancekey
     */
    @JsonProperty("timesheetlineinstancekey")
    public void setTimesheetlineinstancekey(String timesheetlineinstancekey) {
        this.timesheetlineinstancekey = timesheetlineinstancekey;
    }

    /**
     * 
     * @return
     *     The billingpricebase
     */
    @JsonProperty("billingpricebase")
    public Integer getBillingpricebase() {
        return billingpricebase;
    }

    /**
     * 
     * @param billingpricebase
     *     The billingpricebase
     */
    @JsonProperty("billingpricebase")
    public void setBillingpricebase(Integer billingpricebase) {
        this.billingpricebase = billingpricebase;
    }

    /**
     * 
     * @return
     *     The billingpriceenterprise
     */
    @JsonProperty("billingpriceenterprise")
    public Integer getBillingpriceenterprise() {
        return billingpriceenterprise;
    }

    /**
     * 
     * @param billingpriceenterprise
     *     The billingpriceenterprise
     */
    @JsonProperty("billingpriceenterprise")
    public void setBillingpriceenterprise(Integer billingpriceenterprise) {
        this.billingpriceenterprise = billingpriceenterprise;
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
     *     The purchaseordernumber
     */
    @JsonProperty("purchaseordernumber")
    public String getPurchaseordernumber() {
        return purchaseordernumber;
    }

    /**
     * 
     * @param purchaseordernumber
     *     The purchaseordernumber
     */
    @JsonProperty("purchaseordernumber")
    public void setPurchaseordernumber(String purchaseordernumber) {
        this.purchaseordernumber = purchaseordernumber;
    }

    /**
     * 
     * @return
     *     The purchaseorderlinenumber
     */
    @JsonProperty("purchaseorderlinenumber")
    public Integer getPurchaseorderlinenumber() {
        return purchaseorderlinenumber;
    }

    /**
     * 
     * @param purchaseorderlinenumber
     *     The purchaseorderlinenumber
     */
    @JsonProperty("purchaseorderlinenumber")
    public void setPurchaseorderlinenumber(Integer purchaseorderlinenumber) {
        this.purchaseorderlinenumber = purchaseorderlinenumber;
    }

    /**
     * 
     * @return
     *     The settleviavendor
     */
    @JsonProperty("settleviavendor")
    public Boolean getSettleviavendor() {
        return settleviavendor;
    }

    /**
     * 
     * @param settleviavendor
     *     The settleviavendor
     */
    @JsonProperty("settleviavendor")
    public void setSettleviavendor(Boolean settleviavendor) {
        this.settleviavendor = settleviavendor;
    }

    /**
     * 
     * @return
     *     The jobnamevar
     */
    @JsonProperty("jobnamevar")
    public String getJobnamevar() {
        return jobnamevar;
    }

    /**
     * 
     * @param jobnamevar
     *     The jobnamevar
     */
    @JsonProperty("jobnamevar")
    public void setJobnamevar(String jobnamevar) {
        this.jobnamevar = jobnamevar;
    }

    /**
     * 
     * @return
     *     The activitytextvar
     */
    @JsonProperty("activitytextvar")
    public String getActivitytextvar() {
        return activitytextvar;
    }

    /**
     * 
     * @param activitytextvar
     *     The activitytextvar
     */
    @JsonProperty("activitytextvar")
    public void setActivitytextvar(String activitytextvar) {
        this.activitytextvar = activitytextvar;
    }

    /**
     * 
     * @return
     *     The tasknamevar
     */
    @JsonProperty("tasknamevar")
    public String getTasknamevar() {
        return tasknamevar;
    }

    /**
     * 
     * @param tasknamevar
     *     The tasknamevar
     */
    @JsonProperty("tasknamevar")
    public void setTasknamevar(String tasknamevar) {
        this.tasknamevar = tasknamevar;
    }

    /**
     * 
     * @return
     *     The taskpathvar
     */
    @JsonProperty("taskpathvar")
    public String getTaskpathvar() {
        return taskpathvar;
    }

    /**
     * 
     * @param taskpathvar
     *     The taskpathvar
     */
    @JsonProperty("taskpathvar")
    public void setTaskpathvar(String taskpathvar) {
        this.taskpathvar = taskpathvar;
    }

    /**
     * 
     * @return
     *     The linecompanynamevar
     */
    @JsonProperty("linecompanynamevar")
    public String getLinecompanynamevar() {
        return linecompanynamevar;
    }

    /**
     * 
     * @param linecompanynamevar
     *     The linecompanynamevar
     */
    @JsonProperty("linecompanynamevar")
    public void setLinecompanynamevar(String linecompanynamevar) {
        this.linecompanynamevar = linecompanynamevar;
    }

    /**
     * 
     * @return
     *     The locationdescriptionvar
     */
    @JsonProperty("locationdescriptionvar")
    public String getLocationdescriptionvar() {
        return locationdescriptionvar;
    }

    /**
     * 
     * @param locationdescriptionvar
     *     The locationdescriptionvar
     */
    @JsonProperty("locationdescriptionvar")
    public void setLocationdescriptionvar(String locationdescriptionvar) {
        this.locationdescriptionvar = locationdescriptionvar;
    }

    /**
     * 
     * @return
     *     The entitydescriptionvar
     */
    @JsonProperty("entitydescriptionvar")
    public String getEntitydescriptionvar() {
        return entitydescriptionvar;
    }

    /**
     * 
     * @param entitydescriptionvar
     *     The entitydescriptionvar
     */
    @JsonProperty("entitydescriptionvar")
    public void setEntitydescriptionvar(String entitydescriptionvar) {
        this.entitydescriptionvar = entitydescriptionvar;
    }

    /**
     * 
     * @return
     *     The projectdescriptionvar
     */
    @JsonProperty("projectdescriptionvar")
    public String getProjectdescriptionvar() {
        return projectdescriptionvar;
    }

    /**
     * 
     * @param projectdescriptionvar
     *     The projectdescriptionvar
     */
    @JsonProperty("projectdescriptionvar")
    public void setProjectdescriptionvar(String projectdescriptionvar) {
        this.projectdescriptionvar = projectdescriptionvar;
    }

    /**
     * 
     * @return
     *     The purposedescriptionvar
     */
    @JsonProperty("purposedescriptionvar")
    public String getPurposedescriptionvar() {
        return purposedescriptionvar;
    }

    /**
     * 
     * @param purposedescriptionvar
     *     The purposedescriptionvar
     */
    @JsonProperty("purposedescriptionvar")
    public void setPurposedescriptionvar(String purposedescriptionvar) {
        this.purposedescriptionvar = purposedescriptionvar;
    }

    /**
     * 
     * @return
     *     The specification1descriptionvar
     */
    @JsonProperty("specification1descriptionvar")
    public String getSpecification1descriptionvar() {
        return specification1descriptionvar;
    }

    /**
     * 
     * @param specification1descriptionvar
     *     The specification1descriptionvar
     */
    @JsonProperty("specification1descriptionvar")
    public void setSpecification1descriptionvar(String specification1descriptionvar) {
        this.specification1descriptionvar = specification1descriptionvar;
    }

    /**
     * 
     * @return
     *     The specification2descriptionvar
     */
    @JsonProperty("specification2descriptionvar")
    public String getSpecification2descriptionvar() {
        return specification2descriptionvar;
    }

    /**
     * 
     * @param specification2descriptionvar
     *     The specification2descriptionvar
     */
    @JsonProperty("specification2descriptionvar")
    public void setSpecification2descriptionvar(String specification2descriptionvar) {
        this.specification2descriptionvar = specification2descriptionvar;
    }

    /**
     * 
     * @return
     *     The specification3descriptionvar
     */
    @JsonProperty("specification3descriptionvar")
    public String getSpecification3descriptionvar() {
        return specification3descriptionvar;
    }

    /**
     * 
     * @param specification3descriptionvar
     *     The specification3descriptionvar
     */
    @JsonProperty("specification3descriptionvar")
    public void setSpecification3descriptionvar(String specification3descriptionvar) {
        this.specification3descriptionvar = specification3descriptionvar;
    }

    /**
     * 
     * @return
     *     The specification4descriptionvar
     */
    @JsonProperty("specification4descriptionvar")
    public String getSpecification4descriptionvar() {
        return specification4descriptionvar;
    }

    /**
     * 
     * @param specification4descriptionvar
     *     The specification4descriptionvar
     */
    @JsonProperty("specification4descriptionvar")
    public void setSpecification4descriptionvar(String specification4descriptionvar) {
        this.specification4descriptionvar = specification4descriptionvar;
    }

    /**
     * 
     * @return
     *     The specification5descriptionvar
     */
    @JsonProperty("specification5descriptionvar")
    public String getSpecification5descriptionvar() {
        return specification5descriptionvar;
    }

    /**
     * 
     * @param specification5descriptionvar
     *     The specification5descriptionvar
     */
    @JsonProperty("specification5descriptionvar")
    public void setSpecification5descriptionvar(String specification5descriptionvar) {
        this.specification5descriptionvar = specification5descriptionvar;
    }

    /**
     * 
     * @return
     *     The specification6descriptionvar
     */
    @JsonProperty("specification6descriptionvar")
    public String getSpecification6descriptionvar() {
        return specification6descriptionvar;
    }

    /**
     * 
     * @param specification6descriptionvar
     *     The specification6descriptionvar
     */
    @JsonProperty("specification6descriptionvar")
    public void setSpecification6descriptionvar(String specification6descriptionvar) {
        this.specification6descriptionvar = specification6descriptionvar;
    }

    /**
     * 
     * @return
     *     The specification7descriptionvar
     */
    @JsonProperty("specification7descriptionvar")
    public String getSpecification7descriptionvar() {
        return specification7descriptionvar;
    }

    /**
     * 
     * @param specification7descriptionvar
     *     The specification7descriptionvar
     */
    @JsonProperty("specification7descriptionvar")
    public void setSpecification7descriptionvar(String specification7descriptionvar) {
        this.specification7descriptionvar = specification7descriptionvar;
    }

    /**
     * 
     * @return
     *     The specification8descriptionvar
     */
    @JsonProperty("specification8descriptionvar")
    public String getSpecification8descriptionvar() {
        return specification8descriptionvar;
    }

    /**
     * 
     * @param specification8descriptionvar
     *     The specification8descriptionvar
     */
    @JsonProperty("specification8descriptionvar")
    public void setSpecification8descriptionvar(String specification8descriptionvar) {
        this.specification8descriptionvar = specification8descriptionvar;
    }

    /**
     * 
     * @return
     *     The specification9descriptionvar
     */
    @JsonProperty("specification9descriptionvar")
    public String getSpecification9descriptionvar() {
        return specification9descriptionvar;
    }

    /**
     * 
     * @param specification9descriptionvar
     *     The specification9descriptionvar
     */
    @JsonProperty("specification9descriptionvar")
    public void setSpecification9descriptionvar(String specification9descriptionvar) {
        this.specification9descriptionvar = specification9descriptionvar;
    }

    /**
     * 
     * @return
     *     The specification10descriptionvar
     */
    @JsonProperty("specification10descriptionvar")
    public String getSpecification10descriptionvar() {
        return specification10descriptionvar;
    }

    /**
     * 
     * @param specification10descriptionvar
     *     The specification10descriptionvar
     */
    @JsonProperty("specification10descriptionvar")
    public void setSpecification10descriptionvar(String specification10descriptionvar) {
        this.specification10descriptionvar = specification10descriptionvar;
    }

    /**
     * 
     * @return
     *     The localspec1descriptionvar
     */
    @JsonProperty("localspec1descriptionvar")
    public String getLocalspec1descriptionvar() {
        return localspec1descriptionvar;
    }

    /**
     * 
     * @param localspec1descriptionvar
     *     The localspec1descriptionvar
     */
    @JsonProperty("localspec1descriptionvar")
    public void setLocalspec1descriptionvar(String localspec1descriptionvar) {
        this.localspec1descriptionvar = localspec1descriptionvar;
    }

    /**
     * 
     * @return
     *     The localspec2descriptionvar
     */
    @JsonProperty("localspec2descriptionvar")
    public String getLocalspec2descriptionvar() {
        return localspec2descriptionvar;
    }

    /**
     * 
     * @param localspec2descriptionvar
     *     The localspec2descriptionvar
     */
    @JsonProperty("localspec2descriptionvar")
    public void setLocalspec2descriptionvar(String localspec2descriptionvar) {
        this.localspec2descriptionvar = localspec2descriptionvar;
    }

    /**
     * 
     * @return
     *     The localspec3descriptionvar
     */
    @JsonProperty("localspec3descriptionvar")
    public String getLocalspec3descriptionvar() {
        return localspec3descriptionvar;
    }

    /**
     * 
     * @param localspec3descriptionvar
     *     The localspec3descriptionvar
     */
    @JsonProperty("localspec3descriptionvar")
    public void setLocalspec3descriptionvar(String localspec3descriptionvar) {
        this.localspec3descriptionvar = localspec3descriptionvar;
    }

    /**
     * 
     * @return
     *     The localspec4descriptionvar
     */
    @JsonProperty("localspec4descriptionvar")
    public String getLocalspec4descriptionvar() {
        return localspec4descriptionvar;
    }

    /**
     * 
     * @param localspec4descriptionvar
     *     The localspec4descriptionvar
     */
    @JsonProperty("localspec4descriptionvar")
    public void setLocalspec4descriptionvar(String localspec4descriptionvar) {
        this.localspec4descriptionvar = localspec4descriptionvar;
    }

    /**
     * 
     * @return
     *     The localspec5descriptionvar
     */
    @JsonProperty("localspec5descriptionvar")
    public String getLocalspec5descriptionvar() {
        return localspec5descriptionvar;
    }

    /**
     * 
     * @param localspec5descriptionvar
     *     The localspec5descriptionvar
     */
    @JsonProperty("localspec5descriptionvar")
    public void setLocalspec5descriptionvar(String localspec5descriptionvar) {
        this.localspec5descriptionvar = localspec5descriptionvar;
    }

    /**
     * 
     * @return
     *     The localspec6descriptionvar
     */
    @JsonProperty("localspec6descriptionvar")
    public String getLocalspec6descriptionvar() {
        return localspec6descriptionvar;
    }

    /**
     * 
     * @param localspec6descriptionvar
     *     The localspec6descriptionvar
     */
    @JsonProperty("localspec6descriptionvar")
    public void setLocalspec6descriptionvar(String localspec6descriptionvar) {
        this.localspec6descriptionvar = localspec6descriptionvar;
    }

    /**
     * 
     * @return
     *     The localspec7descriptionvar
     */
    @JsonProperty("localspec7descriptionvar")
    public String getLocalspec7descriptionvar() {
        return localspec7descriptionvar;
    }

    /**
     * 
     * @param localspec7descriptionvar
     *     The localspec7descriptionvar
     */
    @JsonProperty("localspec7descriptionvar")
    public void setLocalspec7descriptionvar(String localspec7descriptionvar) {
        this.localspec7descriptionvar = localspec7descriptionvar;
    }

    /**
     * 
     * @return
     *     The localspec8descriptionvar
     */
    @JsonProperty("localspec8descriptionvar")
    public String getLocalspec8descriptionvar() {
        return localspec8descriptionvar;
    }

    /**
     * 
     * @param localspec8descriptionvar
     *     The localspec8descriptionvar
     */
    @JsonProperty("localspec8descriptionvar")
    public void setLocalspec8descriptionvar(String localspec8descriptionvar) {
        this.localspec8descriptionvar = localspec8descriptionvar;
    }

    /**
     * 
     * @return
     *     The localspec9descriptionvar
     */
    @JsonProperty("localspec9descriptionvar")
    public String getLocalspec9descriptionvar() {
        return localspec9descriptionvar;
    }

    /**
     * 
     * @param localspec9descriptionvar
     *     The localspec9descriptionvar
     */
    @JsonProperty("localspec9descriptionvar")
    public void setLocalspec9descriptionvar(String localspec9descriptionvar) {
        this.localspec9descriptionvar = localspec9descriptionvar;
    }

    /**
     * 
     * @return
     *     The localspec10descriptionvar
     */
    @JsonProperty("localspec10descriptionvar")
    public String getLocalspec10descriptionvar() {
        return localspec10descriptionvar;
    }

    /**
     * 
     * @param localspec10descriptionvar
     *     The localspec10descriptionvar
     */
    @JsonProperty("localspec10descriptionvar")
    public void setLocalspec10descriptionvar(String localspec10descriptionvar) {
        this.localspec10descriptionvar = localspec10descriptionvar;
    }

    /**
     * 
     * @return
     *     The linecustomerpopup5var
     */
    @JsonProperty("linecustomerpopup5var")
    public String getLinecustomerpopup5var() {
        return linecustomerpopup5var;
    }

    /**
     * 
     * @param linecustomerpopup5var
     *     The linecustomerpopup5var
     */
    @JsonProperty("linecustomerpopup5var")
    public void setLinecustomerpopup5var(String linecustomerpopup5var) {
        this.linecustomerpopup5var = linecustomerpopup5var;
    }

    /**
     * 
     * @return
     *     The linecustomerremark15var
     */
    @JsonProperty("linecustomerremark15var")
    public String getLinecustomerremark15var() {
        return linecustomerremark15var;
    }

    /**
     * 
     * @param linecustomerremark15var
     *     The linecustomerremark15var
     */
    @JsonProperty("linecustomerremark15var")
    public void setLinecustomerremark15var(String linecustomerremark15var) {
        this.linecustomerremark15var = linecustomerremark15var;
    }

    /**
     * 
     * @return
     *     The linecustomerremark16var
     */
    @JsonProperty("linecustomerremark16var")
    public String getLinecustomerremark16var() {
        return linecustomerremark16var;
    }

    /**
     * 
     * @param linecustomerremark16var
     *     The linecustomerremark16var
     */
    @JsonProperty("linecustomerremark16var")
    public void setLinecustomerremark16var(String linecustomerremark16var) {
        this.linecustomerremark16var = linecustomerremark16var;
    }

    /**
     * 
     * @return
     *     The linecustomerremark17var
     */
    @JsonProperty("linecustomerremark17var")
    public String getLinecustomerremark17var() {
        return linecustomerremark17var;
    }

    /**
     * 
     * @param linecustomerremark17var
     *     The linecustomerremark17var
     */
    @JsonProperty("linecustomerremark17var")
    public void setLinecustomerremark17var(String linecustomerremark17var) {
        this.linecustomerremark17var = linecustomerremark17var;
    }

    /**
     * 
     * @return
     *     The linecustomerremark18var
     */
    @JsonProperty("linecustomerremark18var")
    public String getLinecustomerremark18var() {
        return linecustomerremark18var;
    }

    /**
     * 
     * @param linecustomerremark18var
     *     The linecustomerremark18var
     */
    @JsonProperty("linecustomerremark18var")
    public void setLinecustomerremark18var(String linecustomerremark18var) {
        this.linecustomerremark18var = linecustomerremark18var;
    }

    /**
     * 
     * @return
     *     The linecustomerremark19var
     */
    @JsonProperty("linecustomerremark19var")
    public String getLinecustomerremark19var() {
        return linecustomerremark19var;
    }

    /**
     * 
     * @param linecustomerremark19var
     *     The linecustomerremark19var
     */
    @JsonProperty("linecustomerremark19var")
    public void setLinecustomerremark19var(String linecustomerremark19var) {
        this.linecustomerremark19var = linecustomerremark19var;
    }

    /**
     * 
     * @return
     *     The linecustomerremark20var
     */
    @JsonProperty("linecustomerremark20var")
    public String getLinecustomerremark20var() {
        return linecustomerremark20var;
    }

    /**
     * 
     * @param linecustomerremark20var
     *     The linecustomerremark20var
     */
    @JsonProperty("linecustomerremark20var")
    public void setLinecustomerremark20var(String linecustomerremark20var) {
        this.linecustomerremark20var = linecustomerremark20var;
    }

    /**
     * 
     * @return
     *     The customernumbervar
     */
    @JsonProperty("customernumbervar")
    public String getCustomernumbervar() {
        return customernumbervar;
    }

    /**
     * 
     * @param customernumbervar
     *     The customernumbervar
     */
    @JsonProperty("customernumbervar")
    public void setCustomernumbervar(String customernumbervar) {
        this.customernumbervar = customernumbervar;
    }

    /**
     * 
     * @return
     *     The customernamevar
     */
    @JsonProperty("customernamevar")
    public String getCustomernamevar() {
        return customernamevar;
    }

    /**
     * 
     * @param customernamevar
     *     The customernamevar
     */
    @JsonProperty("customernamevar")
    public void setCustomernamevar(String customernamevar) {
        this.customernamevar = customernamevar;
    }

    /**
     * 
     * @return
     *     The languagevar
     */
    @JsonProperty("languagevar")
    public String getLanguagevar() {
        return languagevar;
    }

    /**
     * 
     * @param languagevar
     *     The languagevar
     */
    @JsonProperty("languagevar")
    public void setLanguagevar(String languagevar) {
        this.languagevar = languagevar;
    }

    /**
     * 
     * @return
     *     The expensejustificationhelptextvar
     */
    @JsonProperty("expensejustificationhelptextvar")
    public String getExpensejustificationhelptextvar() {
        return expensejustificationhelptextvar;
    }

    /**
     * 
     * @param expensejustificationhelptextvar
     *     The expensejustificationhelptextvar
     */
    @JsonProperty("expensejustificationhelptextvar")
    public void setExpensejustificationhelptextvar(String expensejustificationhelptextvar) {
        this.expensejustificationhelptextvar = expensejustificationhelptextvar;
    }

    /**
     * 
     * @return
     *     The lineapprovalrelationvar
     */
    @JsonProperty("lineapprovalrelationvar")
    public String getLineapprovalrelationvar() {
        return lineapprovalrelationvar;
    }

    /**
     * 
     * @param lineapprovalrelationvar
     *     The lineapprovalrelationvar
     */
    @JsonProperty("lineapprovalrelationvar")
    public void setLineapprovalrelationvar(String lineapprovalrelationvar) {
        this.lineapprovalrelationvar = lineapprovalrelationvar;
    }

    /**
     * 
     * @return
     *     The lineapprovalnumbervar
     */
    @JsonProperty("lineapprovalnumbervar")
    public Integer getLineapprovalnumbervar() {
        return lineapprovalnumbervar;
    }

    /**
     * 
     * @param lineapprovalnumbervar
     *     The lineapprovalnumbervar
     */
    @JsonProperty("lineapprovalnumbervar")
    public void setLineapprovalnumbervar(Integer lineapprovalnumbervar) {
        this.lineapprovalnumbervar = lineapprovalnumbervar;
    }

    /**
     * 
     * @return
     *     The lineapprovallinenumbervar
     */
    @JsonProperty("lineapprovallinenumbervar")
    public Integer getLineapprovallinenumbervar() {
        return lineapprovallinenumbervar;
    }

    /**
     * 
     * @param lineapprovallinenumbervar
     *     The lineapprovallinenumbervar
     */
    @JsonProperty("lineapprovallinenumbervar")
    public void setLineapprovallinenumbervar(Integer lineapprovallinenumbervar) {
        this.lineapprovallinenumbervar = lineapprovallinenumbervar;
    }

    /**
     * 
     * @return
     *     The linecurrentapprovalstatusdescriptionvar
     */
    @JsonProperty("linecurrentapprovalstatusdescriptionvar")
    public String getLinecurrentapprovalstatusdescriptionvar() {
        return linecurrentapprovalstatusdescriptionvar;
    }

    /**
     * 
     * @param linecurrentapprovalstatusdescriptionvar
     *     The linecurrentapprovalstatusdescriptionvar
     */
    @JsonProperty("linecurrentapprovalstatusdescriptionvar")
    public void setLinecurrentapprovalstatusdescriptionvar(String linecurrentapprovalstatusdescriptionvar) {
        this.linecurrentapprovalstatusdescriptionvar = linecurrentapprovalstatusdescriptionvar;
    }

    /**
     * 
     * @return
     *     The linecurrentapprovalstatusvar
     */
    @JsonProperty("linecurrentapprovalstatusvar")
    public String getLinecurrentapprovalstatusvar() {
        return linecurrentapprovalstatusvar;
    }

    /**
     * 
     * @param linecurrentapprovalstatusvar
     *     The linecurrentapprovalstatusvar
     */
    @JsonProperty("linecurrentapprovalstatusvar")
    public void setLinecurrentapprovalstatusvar(String linecurrentapprovalstatusvar) {
        this.linecurrentapprovalstatusvar = linecurrentapprovalstatusvar;
    }

    /**
     * 
     * @return
     *     The linecanbeapprovedbycurrentuservar
     */
    @JsonProperty("linecanbeapprovedbycurrentuservar")
    public Boolean getLinecanbeapprovedbycurrentuservar() {
        return linecanbeapprovedbycurrentuservar;
    }

    /**
     * 
     * @param linecanbeapprovedbycurrentuservar
     *     The linecanbeapprovedbycurrentuservar
     */
    @JsonProperty("linecanbeapprovedbycurrentuservar")
    public void setLinecanbeapprovedbycurrentuservar(Boolean linecanbeapprovedbycurrentuservar) {
        this.linecanbeapprovedbycurrentuservar = linecanbeapprovedbycurrentuservar;
    }

    /**
     * 
     * @return
     *     The lineapprovedorrejectedbyvar
     */
    @JsonProperty("lineapprovedorrejectedbyvar")
    public String getLineapprovedorrejectedbyvar() {
        return lineapprovedorrejectedbyvar;
    }

    /**
     * 
     * @param lineapprovedorrejectedbyvar
     *     The lineapprovedorrejectedbyvar
     */
    @JsonProperty("lineapprovedorrejectedbyvar")
    public void setLineapprovedorrejectedbyvar(String lineapprovedorrejectedbyvar) {
        this.lineapprovedorrejectedbyvar = lineapprovedorrejectedbyvar;
    }

    /**
     * 
     * @return
     *     The lineapprovaldatevar
     */
    @JsonProperty("lineapprovaldatevar")
    public String getLineapprovaldatevar() {
        return lineapprovaldatevar;
    }

    /**
     * 
     * @param lineapprovaldatevar
     *     The lineapprovaldatevar
     */
    @JsonProperty("lineapprovaldatevar")
    public void setLineapprovaldatevar(String lineapprovaldatevar) {
        this.lineapprovaldatevar = lineapprovaldatevar;
    }

    /**
     * 
     * @return
     *     The lineapprovaltimevar
     */
    @JsonProperty("lineapprovaltimevar")
    public String getLineapprovaltimevar() {
        return lineapprovaltimevar;
    }

    /**
     * 
     * @param lineapprovaltimevar
     *     The lineapprovaltimevar
     */
    @JsonProperty("lineapprovaltimevar")
    public void setLineapprovaltimevar(String lineapprovaltimevar) {
        this.lineapprovaltimevar = lineapprovaltimevar;
    }

    /**
     * 
     * @return
     *     The lineremarkvar
     */
    @JsonProperty("lineremarkvar")
    public String getLineremarkvar() {
        return lineremarkvar;
    }

    /**
     * 
     * @param lineremarkvar
     *     The lineremarkvar
     */
    @JsonProperty("lineremarkvar")
    public void setLineremarkvar(String lineremarkvar) {
        this.lineremarkvar = lineremarkvar;
    }

    /**
     * 
     * @return
     *     The tooltipjobvar
     */
    @JsonProperty("tooltipjobvar")
    public String getTooltipjobvar() {
        return tooltipjobvar;
    }

    /**
     * 
     * @param tooltipjobvar
     *     The tooltipjobvar
     */
    @JsonProperty("tooltipjobvar")
    public void setTooltipjobvar(String tooltipjobvar) {
        this.tooltipjobvar = tooltipjobvar;
    }

    /**
     * 
     * @return
     *     The tooltiptaskvar
     */
    @JsonProperty("tooltiptaskvar")
    public String getTooltiptaskvar() {
        return tooltiptaskvar;
    }

    /**
     * 
     * @param tooltiptaskvar
     *     The tooltiptaskvar
     */
    @JsonProperty("tooltiptaskvar")
    public void setTooltiptaskvar(String tooltiptaskvar) {
        this.tooltiptaskvar = tooltiptaskvar;
    }

    /**
     * 
     * @return
     *     The tooltiptasklinebreakvar
     */
    @JsonProperty("tooltiptasklinebreakvar")
    public String getTooltiptasklinebreakvar() {
        return tooltiptasklinebreakvar;
    }

    /**
     * 
     * @param tooltiptasklinebreakvar
     *     The tooltiptasklinebreakvar
     */
    @JsonProperty("tooltiptasklinebreakvar")
    public void setTooltiptasklinebreakvar(String tooltiptasklinebreakvar) {
        this.tooltiptasklinebreakvar = tooltiptasklinebreakvar;
    }

    /**
     * 
     * @return
     *     The tooltipactivityvar
     */
    @JsonProperty("tooltipactivityvar")
    public String getTooltipactivityvar() {
        return tooltipactivityvar;
    }

    /**
     * 
     * @param tooltipactivityvar
     *     The tooltipactivityvar
     */
    @JsonProperty("tooltipactivityvar")
    public void setTooltipactivityvar(String tooltipactivityvar) {
        this.tooltipactivityvar = tooltipactivityvar;
    }

    /**
     * 
     * @return
     *     The tooltipconclusionvar
     */
    @JsonProperty("tooltipconclusionvar")
    public String getTooltipconclusionvar() {
        return tooltipconclusionvar;
    }

    /**
     * 
     * @param tooltipconclusionvar
     *     The tooltipconclusionvar
     */
    @JsonProperty("tooltipconclusionvar")
    public void setTooltipconclusionvar(String tooltipconclusionvar) {
        this.tooltipconclusionvar = tooltipconclusionvar;
    }

    /**
     * 
     * @return
     *     The linedetailsvar
     */
    @JsonProperty("linedetailsvar")
    public String getLinedetailsvar() {
        return linedetailsvar;
    }

    /**
     * 
     * @param linedetailsvar
     *     The linedetailsvar
     */
    @JsonProperty("linedetailsvar")
    public void setLinedetailsvar(String linedetailsvar) {
        this.linedetailsvar = linedetailsvar;
    }

    /**
     * 
     * @return
     *     The linedetailstypevar
     */
    @JsonProperty("linedetailstypevar")
    public String getLinedetailstypevar() {
        return linedetailstypevar;
    }

    /**
     * 
     * @param linedetailstypevar
     *     The linedetailstypevar
     */
    @JsonProperty("linedetailstypevar")
    public void setLinedetailstypevar(String linedetailstypevar) {
        this.linedetailstypevar = linedetailstypevar;
    }

    /**
     * 
     * @return
     *     The customerlevelnamevar
     */
    @JsonProperty("customerlevelnamevar")
    public String getCustomerlevelnamevar() {
        return customerlevelnamevar;
    }

    /**
     * 
     * @param customerlevelnamevar
     *     The customerlevelnamevar
     */
    @JsonProperty("customerlevelnamevar")
    public void setCustomerlevelnamevar(String customerlevelnamevar) {
        this.customerlevelnamevar = customerlevelnamevar;
    }

    /**
     * 
     * @return
     *     The level1customernumbervar
     */
    @JsonProperty("level1customernumbervar")
    public String getLevel1customernumbervar() {
        return level1customernumbervar;
    }

    /**
     * 
     * @param level1customernumbervar
     *     The level1customernumbervar
     */
    @JsonProperty("level1customernumbervar")
    public void setLevel1customernumbervar(String level1customernumbervar) {
        this.level1customernumbervar = level1customernumbervar;
    }

    /**
     * 
     * @return
     *     The level2customernumbervar
     */
    @JsonProperty("level2customernumbervar")
    public String getLevel2customernumbervar() {
        return level2customernumbervar;
    }

    /**
     * 
     * @param level2customernumbervar
     *     The level2customernumbervar
     */
    @JsonProperty("level2customernumbervar")
    public void setLevel2customernumbervar(String level2customernumbervar) {
        this.level2customernumbervar = level2customernumbervar;
    }

    /**
     * 
     * @return
     *     The level3customernumbervar
     */
    @JsonProperty("level3customernumbervar")
    public String getLevel3customernumbervar() {
        return level3customernumbervar;
    }

    /**
     * 
     * @param level3customernumbervar
     *     The level3customernumbervar
     */
    @JsonProperty("level3customernumbervar")
    public void setLevel3customernumbervar(String level3customernumbervar) {
        this.level3customernumbervar = level3customernumbervar;
    }

    /**
     * 
     * @return
     *     The level4customernumbervar
     */
    @JsonProperty("level4customernumbervar")
    public String getLevel4customernumbervar() {
        return level4customernumbervar;
    }

    /**
     * 
     * @param level4customernumbervar
     *     The level4customernumbervar
     */
    @JsonProperty("level4customernumbervar")
    public void setLevel4customernumbervar(String level4customernumbervar) {
        this.level4customernumbervar = level4customernumbervar;
    }

    /**
     * 
     * @return
     *     The level5customernumbervar
     */
    @JsonProperty("level5customernumbervar")
    public String getLevel5customernumbervar() {
        return level5customernumbervar;
    }

    /**
     * 
     * @param level5customernumbervar
     *     The level5customernumbervar
     */
    @JsonProperty("level5customernumbervar")
    public void setLevel5customernumbervar(String level5customernumbervar) {
        this.level5customernumbervar = level5customernumbervar;
    }

    /**
     * 
     * @return
     *     The level1customernamevar
     */
    @JsonProperty("level1customernamevar")
    public String getLevel1customernamevar() {
        return level1customernamevar;
    }

    /**
     * 
     * @param level1customernamevar
     *     The level1customernamevar
     */
    @JsonProperty("level1customernamevar")
    public void setLevel1customernamevar(String level1customernamevar) {
        this.level1customernamevar = level1customernamevar;
    }

    /**
     * 
     * @return
     *     The level2customernamevar
     */
    @JsonProperty("level2customernamevar")
    public String getLevel2customernamevar() {
        return level2customernamevar;
    }

    /**
     * 
     * @param level2customernamevar
     *     The level2customernamevar
     */
    @JsonProperty("level2customernamevar")
    public void setLevel2customernamevar(String level2customernamevar) {
        this.level2customernamevar = level2customernamevar;
    }

    /**
     * 
     * @return
     *     The level3customernamevar
     */
    @JsonProperty("level3customernamevar")
    public String getLevel3customernamevar() {
        return level3customernamevar;
    }

    /**
     * 
     * @param level3customernamevar
     *     The level3customernamevar
     */
    @JsonProperty("level3customernamevar")
    public void setLevel3customernamevar(String level3customernamevar) {
        this.level3customernamevar = level3customernamevar;
    }

    /**
     * 
     * @return
     *     The level4customernamevar
     */
    @JsonProperty("level4customernamevar")
    public String getLevel4customernamevar() {
        return level4customernamevar;
    }

    /**
     * 
     * @param level4customernamevar
     *     The level4customernamevar
     */
    @JsonProperty("level4customernamevar")
    public void setLevel4customernamevar(String level4customernamevar) {
        this.level4customernamevar = level4customernamevar;
    }

    /**
     * 
     * @return
     *     The level5customernamevar
     */
    @JsonProperty("level5customernamevar")
    public String getLevel5customernamevar() {
        return level5customernamevar;
    }

    /**
     * 
     * @param level5customernamevar
     *     The level5customernamevar
     */
    @JsonProperty("level5customernamevar")
    public void setLevel5customernamevar(String level5customernamevar) {
        this.level5customernamevar = level5customernamevar;
    }

    /**
     * 
     * @return
     *     The lineprojectmanagernumbervar
     */
    @JsonProperty("lineprojectmanagernumbervar")
    public String getLineprojectmanagernumbervar() {
        return lineprojectmanagernumbervar;
    }

    /**
     * 
     * @param lineprojectmanagernumbervar
     *     The lineprojectmanagernumbervar
     */
    @JsonProperty("lineprojectmanagernumbervar")
    public void setLineprojectmanagernumbervar(String lineprojectmanagernumbervar) {
        this.lineprojectmanagernumbervar = lineprojectmanagernumbervar;
    }

    /**
     * 
     * @return
     *     The lineprojectmanagernamevar
     */
    @JsonProperty("lineprojectmanagernamevar")
    public String getLineprojectmanagernamevar() {
        return lineprojectmanagernamevar;
    }

    /**
     * 
     * @param lineprojectmanagernamevar
     *     The lineprojectmanagernamevar
     */
    @JsonProperty("lineprojectmanagernamevar")
    public void setLineprojectmanagernamevar(String lineprojectmanagernamevar) {
        this.lineprojectmanagernamevar = lineprojectmanagernamevar;
    }

    /**
     * 
     * @return
     *     The justificationrequiredvar
     */
    @JsonProperty("justificationrequiredvar")
    public Boolean getJustificationrequiredvar() {
        return justificationrequiredvar;
    }

    /**
     * 
     * @param justificationrequiredvar
     *     The justificationrequiredvar
     */
    @JsonProperty("justificationrequiredvar")
    public void setJustificationrequiredvar(Boolean justificationrequiredvar) {
        this.justificationrequiredvar = justificationrequiredvar;
    }

    /**
     * 
     * @return
     *     The justificationcompletevar
     */
    @JsonProperty("justificationcompletevar")
    public Boolean getJustificationcompletevar() {
        return justificationcompletevar;
    }

    /**
     * 
     * @param justificationcompletevar
     *     The justificationcompletevar
     */
    @JsonProperty("justificationcompletevar")
    public void setJustificationcompletevar(Boolean justificationcompletevar) {
        this.justificationcompletevar = justificationcompletevar;
    }

    /**
     * 
     * @return
     *     The taskisperdiem
     */
    @JsonProperty("taskisperdiem")
    public Boolean getTaskisperdiem() {
        return taskisperdiem;
    }

    /**
     * 
     * @param taskisperdiem
     *     The taskisperdiem
     */
    @JsonProperty("taskisperdiem")
    public void setTaskisperdiem(Boolean taskisperdiem) {
        this.taskisperdiem = taskisperdiem;
    }

    /**
     * 
     * @return
     *     The unitpriceopen
     */
    @JsonProperty("unitpriceopen")
    public Boolean getUnitpriceopen() {
        return unitpriceopen;
    }

    /**
     * 
     * @param unitpriceopen
     *     The unitpriceopen
     */
    @JsonProperty("unitpriceopen")
    public void setUnitpriceopen(Boolean unitpriceopen) {
        this.unitpriceopen = unitpriceopen;
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
        return new HashCodeBuilder().append(expensesheetnumber).append(linenumber).append(entrydate).append(jobnumber).append(activitynumber).append(text).append(currency).append(amountbase).append(amountcurrency).append(financevatcode).append(reference).append(taskname).append(companynumber).append(locationname).append(entityname).append(projectname).append(purposename).append(specification1name).append(specification2name).append(specification3name).append(localspec1name).append(localspec2name).append(localspec3name).append(startingdate).append(startingtime).append(endingdate).append(closingtime).append(remark1).append(remark2).append(remark3).append(quantitya).append(quantityb).append(unitpricebase).append(unitpricecurrency).append(numberof).append(costtype).append(submitted).append(newapprovalstatus).append(approvalstatus).append(approvedorrejectedby).append(approvaldate).append(commentprojectmanager).append(approvedbysuperior).append(transferredforposting).append(transferredamountbase).append(transferredquantitya).append(transferredquantityb).append(transferredamountcurrency).append(employeenumber).append(releasedbysuperior).append(amountenterprise).append(unitpriceenterprise).append(transferredamountenterprise).append(exchangerate).append(vatcurrency).append(vatbase).append(vatenterprise).append(transferredvatcurrency).append(transferredvatbase).append(transferredvatenterprise).append(unitpriceexvatbase).append(unitpriceexvatcurrency).append(unitpriceexvatenterprise).append(documentname).append(instancekey).append(transactiontimestamp).append(favorite).append(transferredvatspecificationentry).append(financevatcode2).append(financevatcode3).append(vat1currency).append(vat1base).append(vat1enterprise).append(vat2currency).append(vat2base).append(vat2enterprise).append(vat3currency).append(vat3base).append(vat3enterprise).append(numberproposed).append(numberproposedtransferred).append(billingpricetotalproposedcurrency).append(billingpriceproposedcurrency).append(billingpricecurrency).append(useinvoiceproposal).append(mileagefrom).append(mileageto).append(mileagevia).append(mileagevehicle).append(transactiontype).append(expensesheetlinetext1).append(expensesheetlinetext2).append(expensesheetlinetext3).append(expensesheetlinetext4).append(expensesheetlinetext5).append(expensesheetlinetext6).append(expensesheetlinetext7).append(expensesheetlinetext8).append(expensesheetlinetext9).append(expensesheetlinetext10).append(expensesheetlineinteger1).append(expensesheetlineinteger2).append(expensesheetlineinteger3).append(expensesheetlineinteger4).append(expensesheetlineinteger5).append(expensesheetlinedate1).append(expensesheetlinedate2).append(expensesheetlinetime1).append(expensesheetlinetime2).append(transferrednumberof).append(expensesheettype).append(invoiceable).append(expensejustification).append(timesheetlineinstancekey).append(billingpricebase).append(billingpriceenterprise).append(specification4name).append(specification5name).append(specification6name).append(specification7name).append(specification8name).append(specification9name).append(specification10name).append(localspec4name).append(localspec5name).append(localspec6name).append(localspec7name).append(localspec8name).append(localspec9name).append(localspec10name).append(purchaseordernumber).append(purchaseorderlinenumber).append(settleviavendor).append(jobnamevar).append(activitytextvar).append(tasknamevar).append(taskpathvar).append(linecompanynamevar).append(locationdescriptionvar).append(entitydescriptionvar).append(projectdescriptionvar).append(purposedescriptionvar).append(specification1descriptionvar).append(specification2descriptionvar).append(specification3descriptionvar).append(specification4descriptionvar).append(specification5descriptionvar).append(specification6descriptionvar).append(specification7descriptionvar).append(specification8descriptionvar).append(specification9descriptionvar).append(specification10descriptionvar).append(localspec1descriptionvar).append(localspec2descriptionvar).append(localspec3descriptionvar).append(localspec4descriptionvar).append(localspec5descriptionvar).append(localspec6descriptionvar).append(localspec7descriptionvar).append(localspec8descriptionvar).append(localspec9descriptionvar).append(localspec10descriptionvar).append(linecustomerpopup5var).append(linecustomerremark15var).append(linecustomerremark16var).append(linecustomerremark17var).append(linecustomerremark18var).append(linecustomerremark19var).append(linecustomerremark20var).append(customernumbervar).append(customernamevar).append(languagevar).append(expensejustificationhelptextvar).append(lineapprovalrelationvar).append(lineapprovalnumbervar).append(lineapprovallinenumbervar).append(linecurrentapprovalstatusdescriptionvar).append(linecurrentapprovalstatusvar).append(linecanbeapprovedbycurrentuservar).append(lineapprovedorrejectedbyvar).append(lineapprovaldatevar).append(lineapprovaltimevar).append(lineremarkvar).append(tooltipjobvar).append(tooltiptaskvar).append(tooltiptasklinebreakvar).append(tooltipactivityvar).append(tooltipconclusionvar).append(linedetailsvar).append(linedetailstypevar).append(customerlevelnamevar).append(level1customernumbervar).append(level2customernumbervar).append(level3customernumbervar).append(level4customernumbervar).append(level5customernumbervar).append(level1customernamevar).append(level2customernamevar).append(level3customernamevar).append(level4customernamevar).append(level5customernamevar).append(lineprojectmanagernumbervar).append(lineprojectmanagernamevar).append(justificationrequiredvar).append(justificationcompletevar).append(taskisperdiem).append(unitpriceopen).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Data_) == false) {
            return false;
        }
        Data_ rhs = ((Data_) other);
        return new EqualsBuilder().append(expensesheetnumber, rhs.expensesheetnumber).append(linenumber, rhs.linenumber).append(entrydate, rhs.entrydate).append(jobnumber, rhs.jobnumber).append(activitynumber, rhs.activitynumber).append(text, rhs.text).append(currency, rhs.currency).append(amountbase, rhs.amountbase).append(amountcurrency, rhs.amountcurrency).append(financevatcode, rhs.financevatcode).append(reference, rhs.reference).append(taskname, rhs.taskname).append(companynumber, rhs.companynumber).append(locationname, rhs.locationname).append(entityname, rhs.entityname).append(projectname, rhs.projectname).append(purposename, rhs.purposename).append(specification1name, rhs.specification1name).append(specification2name, rhs.specification2name).append(specification3name, rhs.specification3name).append(localspec1name, rhs.localspec1name).append(localspec2name, rhs.localspec2name).append(localspec3name, rhs.localspec3name).append(startingdate, rhs.startingdate).append(startingtime, rhs.startingtime).append(endingdate, rhs.endingdate).append(closingtime, rhs.closingtime).append(remark1, rhs.remark1).append(remark2, rhs.remark2).append(remark3, rhs.remark3).append(quantitya, rhs.quantitya).append(quantityb, rhs.quantityb).append(unitpricebase, rhs.unitpricebase).append(unitpricecurrency, rhs.unitpricecurrency).append(numberof, rhs.numberof).append(costtype, rhs.costtype).append(submitted, rhs.submitted).append(newapprovalstatus, rhs.newapprovalstatus).append(approvalstatus, rhs.approvalstatus).append(approvedorrejectedby, rhs.approvedorrejectedby).append(approvaldate, rhs.approvaldate).append(commentprojectmanager, rhs.commentprojectmanager).append(approvedbysuperior, rhs.approvedbysuperior).append(transferredforposting, rhs.transferredforposting).append(transferredamountbase, rhs.transferredamountbase).append(transferredquantitya, rhs.transferredquantitya).append(transferredquantityb, rhs.transferredquantityb).append(transferredamountcurrency, rhs.transferredamountcurrency).append(employeenumber, rhs.employeenumber).append(releasedbysuperior, rhs.releasedbysuperior).append(amountenterprise, rhs.amountenterprise).append(unitpriceenterprise, rhs.unitpriceenterprise).append(transferredamountenterprise, rhs.transferredamountenterprise).append(exchangerate, rhs.exchangerate).append(vatcurrency, rhs.vatcurrency).append(vatbase, rhs.vatbase).append(vatenterprise, rhs.vatenterprise).append(transferredvatcurrency, rhs.transferredvatcurrency).append(transferredvatbase, rhs.transferredvatbase).append(transferredvatenterprise, rhs.transferredvatenterprise).append(unitpriceexvatbase, rhs.unitpriceexvatbase).append(unitpriceexvatcurrency, rhs.unitpriceexvatcurrency).append(unitpriceexvatenterprise, rhs.unitpriceexvatenterprise).append(documentname, rhs.documentname).append(instancekey, rhs.instancekey).append(transactiontimestamp, rhs.transactiontimestamp).append(favorite, rhs.favorite).append(transferredvatspecificationentry, rhs.transferredvatspecificationentry).append(financevatcode2, rhs.financevatcode2).append(financevatcode3, rhs.financevatcode3).append(vat1currency, rhs.vat1currency).append(vat1base, rhs.vat1base).append(vat1enterprise, rhs.vat1enterprise).append(vat2currency, rhs.vat2currency).append(vat2base, rhs.vat2base).append(vat2enterprise, rhs.vat2enterprise).append(vat3currency, rhs.vat3currency).append(vat3base, rhs.vat3base).append(vat3enterprise, rhs.vat3enterprise).append(numberproposed, rhs.numberproposed).append(numberproposedtransferred, rhs.numberproposedtransferred).append(billingpricetotalproposedcurrency, rhs.billingpricetotalproposedcurrency).append(billingpriceproposedcurrency, rhs.billingpriceproposedcurrency).append(billingpricecurrency, rhs.billingpricecurrency).append(useinvoiceproposal, rhs.useinvoiceproposal).append(mileagefrom, rhs.mileagefrom).append(mileageto, rhs.mileageto).append(mileagevia, rhs.mileagevia).append(mileagevehicle, rhs.mileagevehicle).append(transactiontype, rhs.transactiontype).append(expensesheetlinetext1, rhs.expensesheetlinetext1).append(expensesheetlinetext2, rhs.expensesheetlinetext2).append(expensesheetlinetext3, rhs.expensesheetlinetext3).append(expensesheetlinetext4, rhs.expensesheetlinetext4).append(expensesheetlinetext5, rhs.expensesheetlinetext5).append(expensesheetlinetext6, rhs.expensesheetlinetext6).append(expensesheetlinetext7, rhs.expensesheetlinetext7).append(expensesheetlinetext8, rhs.expensesheetlinetext8).append(expensesheetlinetext9, rhs.expensesheetlinetext9).append(expensesheetlinetext10, rhs.expensesheetlinetext10).append(expensesheetlineinteger1, rhs.expensesheetlineinteger1).append(expensesheetlineinteger2, rhs.expensesheetlineinteger2).append(expensesheetlineinteger3, rhs.expensesheetlineinteger3).append(expensesheetlineinteger4, rhs.expensesheetlineinteger4).append(expensesheetlineinteger5, rhs.expensesheetlineinteger5).append(expensesheetlinedate1, rhs.expensesheetlinedate1).append(expensesheetlinedate2, rhs.expensesheetlinedate2).append(expensesheetlinetime1, rhs.expensesheetlinetime1).append(expensesheetlinetime2, rhs.expensesheetlinetime2).append(transferrednumberof, rhs.transferrednumberof).append(expensesheettype, rhs.expensesheettype).append(invoiceable, rhs.invoiceable).append(expensejustification, rhs.expensejustification).append(timesheetlineinstancekey, rhs.timesheetlineinstancekey).append(billingpricebase, rhs.billingpricebase).append(billingpriceenterprise, rhs.billingpriceenterprise).append(specification4name, rhs.specification4name).append(specification5name, rhs.specification5name).append(specification6name, rhs.specification6name).append(specification7name, rhs.specification7name).append(specification8name, rhs.specification8name).append(specification9name, rhs.specification9name).append(specification10name, rhs.specification10name).append(localspec4name, rhs.localspec4name).append(localspec5name, rhs.localspec5name).append(localspec6name, rhs.localspec6name).append(localspec7name, rhs.localspec7name).append(localspec8name, rhs.localspec8name).append(localspec9name, rhs.localspec9name).append(localspec10name, rhs.localspec10name).append(purchaseordernumber, rhs.purchaseordernumber).append(purchaseorderlinenumber, rhs.purchaseorderlinenumber).append(settleviavendor, rhs.settleviavendor).append(jobnamevar, rhs.jobnamevar).append(activitytextvar, rhs.activitytextvar).append(tasknamevar, rhs.tasknamevar).append(taskpathvar, rhs.taskpathvar).append(linecompanynamevar, rhs.linecompanynamevar).append(locationdescriptionvar, rhs.locationdescriptionvar).append(entitydescriptionvar, rhs.entitydescriptionvar).append(projectdescriptionvar, rhs.projectdescriptionvar).append(purposedescriptionvar, rhs.purposedescriptionvar).append(specification1descriptionvar, rhs.specification1descriptionvar).append(specification2descriptionvar, rhs.specification2descriptionvar).append(specification3descriptionvar, rhs.specification3descriptionvar).append(specification4descriptionvar, rhs.specification4descriptionvar).append(specification5descriptionvar, rhs.specification5descriptionvar).append(specification6descriptionvar, rhs.specification6descriptionvar).append(specification7descriptionvar, rhs.specification7descriptionvar).append(specification8descriptionvar, rhs.specification8descriptionvar).append(specification9descriptionvar, rhs.specification9descriptionvar).append(specification10descriptionvar, rhs.specification10descriptionvar).append(localspec1descriptionvar, rhs.localspec1descriptionvar).append(localspec2descriptionvar, rhs.localspec2descriptionvar).append(localspec3descriptionvar, rhs.localspec3descriptionvar).append(localspec4descriptionvar, rhs.localspec4descriptionvar).append(localspec5descriptionvar, rhs.localspec5descriptionvar).append(localspec6descriptionvar, rhs.localspec6descriptionvar).append(localspec7descriptionvar, rhs.localspec7descriptionvar).append(localspec8descriptionvar, rhs.localspec8descriptionvar).append(localspec9descriptionvar, rhs.localspec9descriptionvar).append(localspec10descriptionvar, rhs.localspec10descriptionvar).append(linecustomerpopup5var, rhs.linecustomerpopup5var).append(linecustomerremark15var, rhs.linecustomerremark15var).append(linecustomerremark16var, rhs.linecustomerremark16var).append(linecustomerremark17var, rhs.linecustomerremark17var).append(linecustomerremark18var, rhs.linecustomerremark18var).append(linecustomerremark19var, rhs.linecustomerremark19var).append(linecustomerremark20var, rhs.linecustomerremark20var).append(customernumbervar, rhs.customernumbervar).append(customernamevar, rhs.customernamevar).append(languagevar, rhs.languagevar).append(expensejustificationhelptextvar, rhs.expensejustificationhelptextvar).append(lineapprovalrelationvar, rhs.lineapprovalrelationvar).append(lineapprovalnumbervar, rhs.lineapprovalnumbervar).append(lineapprovallinenumbervar, rhs.lineapprovallinenumbervar).append(linecurrentapprovalstatusdescriptionvar, rhs.linecurrentapprovalstatusdescriptionvar).append(linecurrentapprovalstatusvar, rhs.linecurrentapprovalstatusvar).append(linecanbeapprovedbycurrentuservar, rhs.linecanbeapprovedbycurrentuservar).append(lineapprovedorrejectedbyvar, rhs.lineapprovedorrejectedbyvar).append(lineapprovaldatevar, rhs.lineapprovaldatevar).append(lineapprovaltimevar, rhs.lineapprovaltimevar).append(lineremarkvar, rhs.lineremarkvar).append(tooltipjobvar, rhs.tooltipjobvar).append(tooltiptaskvar, rhs.tooltiptaskvar).append(tooltiptasklinebreakvar, rhs.tooltiptasklinebreakvar).append(tooltipactivityvar, rhs.tooltipactivityvar).append(tooltipconclusionvar, rhs.tooltipconclusionvar).append(linedetailsvar, rhs.linedetailsvar).append(linedetailstypevar, rhs.linedetailstypevar).append(customerlevelnamevar, rhs.customerlevelnamevar).append(level1customernumbervar, rhs.level1customernumbervar).append(level2customernumbervar, rhs.level2customernumbervar).append(level3customernumbervar, rhs.level3customernumbervar).append(level4customernumbervar, rhs.level4customernumbervar).append(level5customernumbervar, rhs.level5customernumbervar).append(level1customernamevar, rhs.level1customernamevar).append(level2customernamevar, rhs.level2customernamevar).append(level3customernamevar, rhs.level3customernamevar).append(level4customernamevar, rhs.level4customernamevar).append(level5customernamevar, rhs.level5customernamevar).append(lineprojectmanagernumbervar, rhs.lineprojectmanagernumbervar).append(lineprojectmanagernamevar, rhs.lineprojectmanagernamevar).append(justificationrequiredvar, rhs.justificationrequiredvar).append(justificationcompletevar, rhs.justificationcompletevar).append(taskisperdiem, rhs.taskisperdiem).append(unitpriceopen, rhs.unitpriceopen).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
