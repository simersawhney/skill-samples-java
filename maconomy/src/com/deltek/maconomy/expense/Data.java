
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
    "localspec1descriptionvar",
    "localspec2descriptionvar",
    "localspec3descriptionvar",
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
    "justificationrequiredvar",
    "justificationcompletevar"
})
public class Data {

    @JsonProperty("expensesheetnumber")
    private Integer expensesheetnumber;
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
    @JsonProperty("localspec1descriptionvar")
    private String localspec1descriptionvar;
    @JsonProperty("localspec2descriptionvar")
    private String localspec2descriptionvar;
    @JsonProperty("localspec3descriptionvar")
    private String localspec3descriptionvar;
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
    @JsonProperty("justificationrequiredvar")
    private Boolean justificationrequiredvar;
    @JsonProperty("justificationcompletevar")
    private Boolean justificationcompletevar;
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
     * @param linecustomerpopup5var
     * @param billingpricebase
     * @param specification2descriptionvar
     * @param billingpricetotalproposedcurrency
     * @param transferredamountbase
     * @param transactiontype
     * @param customernumbervar
     * @param startingdate
     * @param documentname
     * @param exchangerate
     * @param releasedbysuperior
     * @param linecompanynamevar
     * @param employeenumber
     * @param amountenterprise
     * @param transferredamountenterprise
     * @param vat3base
     * @param mileagefrom
     * @param localspec2descriptionvar
     * @param vat2enterprise
     * @param lineremarkvar
     * @param financevatcode3
     * @param financevatcode2
     * @param justificationrequiredvar
     * @param customernamevar
     * @param submitted
     * @param level5customernamevar
     * @param projectname
     * @param favorite
     * @param billingpriceproposedcurrency
     * @param endingdate
     * @param vatbase
     * @param transferredvatcurrency
     * @param amountcurrency
     * @param newapprovalstatus
     * @param lineapprovaltimevar
     * @param localspec1name
     * @param entityname
     * @param specification3descriptionvar
     * @param invoiceable
     * @param transactiontimestamp
     * @param linecurrentapprovalstatusdescriptionvar
     * @param lineapprovalnumbervar
     * @param unitpriceexvatcurrency
     * @param vat1currency
     * @param numberproposedtransferred
     * @param lineapprovalrelationvar
     * @param linecustomerremark19var
     * @param transferredamountcurrency
     * @param lineapprovedorrejectedbyvar
     * @param vat1enterprise
     * @param instancekey
     * @param level3customernumbervar
     * @param linecanbeapprovedbycurrentuservar
     * @param approvaldate
     * @param currency
     * @param commentprojectmanager
     * @param lineapprovaldatevar
     * @param activitytextvar
     * @param level1customernamevar
     * @param vat1base
     * @param tooltipconclusionvar
     * @param quantityb
     * @param entitydescriptionvar
     * @param quantitya
     * @param tooltipjobvar
     * @param specification1name
     * @param specification3name
     * @param approvedorrejectedby
     * @param mileagevehicle
     * @param linecustomerremark20var
     * @param level4customernumbervar
     * @param linecustomerremark15var
     * @param specification2name
     * @param mileageto
     * @param languagevar
     * @param specification1descriptionvar
     * @param lineapprovallinenumbervar
     * @param purposename
     * @param localspec3name
     * @param expensejustificationhelptextvar
     * @param linecurrentapprovalstatusvar
     * @param unitpriceenterprise
     * @param tasknamevar
     * @param vat3enterprise
     * @param expensesheetlinetime2
     * @param taskname
     * @param expensesheetlinetime1
     * @param level4customernamevar
     * @param expensejustification
     * @param vatcurrency
     * @param level2customernumbervar
     * @param unitpricecurrency
     * @param remark1
     * @param numberproposed
     * @param linecustomerremark16var
     * @param remark3
     * @param remark2
     * @param closingtime
     * @param linenumber
     * @param level1customernumbervar
     * @param justificationcompletevar
     * @param level2customernamevar
     * @param expensesheetnumber
     * @param entrydate
     * @param locationdescriptionvar
     * @param jobnamevar
     * @param localspec3descriptionvar
     * @param taskpathvar
     * @param unitpriceexvatenterprise
     * @param level5customernumbervar
     * @param transferredquantityb
     * @param transferredquantitya
     * @param text
     * @param mileagevia
     * @param companynumber
     * @param vat2currency
     * @param approvedbysuperior
     * @param linecustomerremark17var
     * @param transferredvatspecificationentry
     * @param vat3currency
     * @param transferredvatbase
     * @param vatenterprise
     * @param linecustomerremark18var
     * @param unitpriceexvatbase
     * @param costtype
     * @param amountbase
     * @param expensesheetlinetext8
     * @param expensesheetlinetext9
     * @param useinvoiceproposal
     * @param approvalstatus
     * @param billingpriceenterprise
     * @param tooltipactivityvar
     * @param purposedescriptionvar
     * @param billingpricecurrency
     * @param financevatcode
     * @param numberof
     * @param customerlevelnamevar
     * @param expensesheettype
     * @param expensesheetlinetext1
     * @param level3customernamevar
     * @param locationname
     * @param expensesheetlinetext3
     * @param expensesheetlinetext2
     * @param tooltiptasklinebreakvar
     * @param expensesheetlinetext5
     * @param transferredforposting
     * @param activitynumber
     * @param expensesheetlinetext4
     * @param expensesheetlinetext7
     * @param localspec2name
     * @param startingtime
     * @param expensesheetlinetext6
     * @param transferrednumberof
     * @param expensesheetlinetext10
     * @param expensesheetlineinteger4
     * @param tooltiptaskvar
     * @param expensesheetlineinteger3
     * @param expensesheetlineinteger5
     * @param expensesheetlinedate2
     * @param expensesheetlinedate1
     * @param unitpricebase
     * @param projectdescriptionvar
     * @param reference
     * @param jobnumber
     * @param vat2base
     * @param timesheetlineinstancekey
     * @param linedetailsvar
     * @param linedetailstypevar
     * @param localspec1descriptionvar
     * @param expensesheetlineinteger1
     * @param expensesheetlineinteger2
     * @param transferredvatenterprise
     */
    public Data(Integer expensesheetnumber, Integer linenumber, String entrydate, String jobnumber, String activitynumber, String text, String currency, Integer amountbase, Integer amountcurrency, String financevatcode, String reference, String taskname, String companynumber, String locationname, String entityname, String projectname, String purposename, String specification1name, String specification2name, String specification3name, String localspec1name, String localspec2name, String localspec3name, String startingdate, String startingtime, String endingdate, String closingtime, String remark1, String remark2, String remark3, Integer quantitya, Integer quantityb, Integer unitpricebase, Integer unitpricecurrency, Double numberof, String costtype, Boolean submitted, String newapprovalstatus, String approvalstatus, String approvedorrejectedby, String approvaldate, String commentprojectmanager, Boolean approvedbysuperior, Boolean transferredforposting, Integer transferredamountbase, Integer transferredquantitya, Integer transferredquantityb, Integer transferredamountcurrency, String employeenumber, Boolean releasedbysuperior, Integer amountenterprise, Integer unitpriceenterprise, Integer transferredamountenterprise, Integer exchangerate, Integer vatcurrency, Integer vatbase, Integer vatenterprise, Integer transferredvatcurrency, Integer transferredvatbase, Integer transferredvatenterprise, Integer unitpriceexvatbase, Integer unitpriceexvatcurrency, Integer unitpriceexvatenterprise, String documentname, String instancekey, String transactiontimestamp, String favorite, String transferredvatspecificationentry, String financevatcode2, String financevatcode3, Integer vat1currency, Integer vat1base, Integer vat1enterprise, Integer vat2currency, Integer vat2base, Integer vat2enterprise, Integer vat3currency, Integer vat3base, Integer vat3enterprise, Integer numberproposed, Integer numberproposedtransferred, Integer billingpricetotalproposedcurrency, Integer billingpriceproposedcurrency, Integer billingpricecurrency, Boolean useinvoiceproposal, String mileagefrom, String mileageto, String mileagevia, String mileagevehicle, String transactiontype, String expensesheetlinetext1, String expensesheetlinetext2, String expensesheetlinetext3, String expensesheetlinetext4, String expensesheetlinetext5, String expensesheetlinetext6, String expensesheetlinetext7, String expensesheetlinetext8, String expensesheetlinetext9, String expensesheetlinetext10, Integer expensesheetlineinteger1, Integer expensesheetlineinteger2, Integer expensesheetlineinteger3, Integer expensesheetlineinteger4, Integer expensesheetlineinteger5, String expensesheetlinedate1, String expensesheetlinedate2, String expensesheetlinetime1, String expensesheetlinetime2, Integer transferrednumberof, String expensesheettype, Boolean invoiceable, String expensejustification, String timesheetlineinstancekey, Integer billingpricebase, Integer billingpriceenterprise, String jobnamevar, String activitytextvar, String tasknamevar, String taskpathvar, String linecompanynamevar, String locationdescriptionvar, String entitydescriptionvar, String projectdescriptionvar, String purposedescriptionvar, String specification1descriptionvar, String specification2descriptionvar, String specification3descriptionvar, String localspec1descriptionvar, String localspec2descriptionvar, String localspec3descriptionvar, String linecustomerpopup5var, String linecustomerremark15var, String linecustomerremark16var, String linecustomerremark17var, String linecustomerremark18var, String linecustomerremark19var, String linecustomerremark20var, String customernumbervar, String customernamevar, String languagevar, String expensejustificationhelptextvar, String lineapprovalrelationvar, Integer lineapprovalnumbervar, Integer lineapprovallinenumbervar, String linecurrentapprovalstatusdescriptionvar, String linecurrentapprovalstatusvar, Boolean linecanbeapprovedbycurrentuservar, String lineapprovedorrejectedbyvar, String lineapprovaldatevar, String lineapprovaltimevar, String lineremarkvar, String tooltipjobvar, String tooltiptaskvar, String tooltiptasklinebreakvar, String tooltipactivityvar, String tooltipconclusionvar, String linedetailsvar, String linedetailstypevar, String customerlevelnamevar, String level1customernumbervar, String level2customernumbervar, String level3customernumbervar, String level4customernumbervar, String level5customernumbervar, String level1customernamevar, String level2customernamevar, String level3customernamevar, String level4customernamevar, String level5customernamevar, Boolean justificationrequiredvar, Boolean justificationcompletevar) {
        super();
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
        this.localspec1descriptionvar = localspec1descriptionvar;
        this.localspec2descriptionvar = localspec2descriptionvar;
        this.localspec3descriptionvar = localspec3descriptionvar;
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
        this.justificationrequiredvar = justificationrequiredvar;
        this.justificationcompletevar = justificationcompletevar;
    }

    @JsonProperty("expensesheetnumber")
    public Integer getExpensesheetnumber() {
        return expensesheetnumber;
    }

    @JsonProperty("expensesheetnumber")
    public void setExpensesheetnumber(Integer expensesheetnumber) {
        this.expensesheetnumber = expensesheetnumber;
    }

    @JsonProperty("linenumber")
    public Integer getLinenumber() {
        return linenumber;
    }

    @JsonProperty("linenumber")
    public void setLinenumber(Integer linenumber) {
        this.linenumber = linenumber;
    }

    @JsonProperty("entrydate")
    public String getEntrydate() {
        return entrydate;
    }

    @JsonProperty("entrydate")
    public void setEntrydate(String entrydate) {
        this.entrydate = entrydate;
    }

    @JsonProperty("jobnumber")
    public String getJobnumber() {
        return jobnumber;
    }

    @JsonProperty("jobnumber")
    public void setJobnumber(String jobnumber) {
        this.jobnumber = jobnumber;
    }

    @JsonProperty("activitynumber")
    public String getActivitynumber() {
        return activitynumber;
    }

    @JsonProperty("activitynumber")
    public void setActivitynumber(String activitynumber) {
        this.activitynumber = activitynumber;
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("amountbase")
    public Integer getAmountbase() {
        return amountbase;
    }

    @JsonProperty("amountbase")
    public void setAmountbase(Integer amountbase) {
        this.amountbase = amountbase;
    }

    @JsonProperty("amountcurrency")
    public Integer getAmountcurrency() {
        return amountcurrency;
    }

    @JsonProperty("amountcurrency")
    public void setAmountcurrency(Integer amountcurrency) {
        this.amountcurrency = amountcurrency;
    }

    @JsonProperty("financevatcode")
    public String getFinancevatcode() {
        return financevatcode;
    }

    @JsonProperty("financevatcode")
    public void setFinancevatcode(String financevatcode) {
        this.financevatcode = financevatcode;
    }

    @JsonProperty("reference")
    public String getReference() {
        return reference;
    }

    @JsonProperty("reference")
    public void setReference(String reference) {
        this.reference = reference;
    }

    @JsonProperty("taskname")
    public String getTaskname() {
        return taskname;
    }

    @JsonProperty("taskname")
    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }

    @JsonProperty("companynumber")
    public String getCompanynumber() {
        return companynumber;
    }

    @JsonProperty("companynumber")
    public void setCompanynumber(String companynumber) {
        this.companynumber = companynumber;
    }

    @JsonProperty("locationname")
    public String getLocationname() {
        return locationname;
    }

    @JsonProperty("locationname")
    public void setLocationname(String locationname) {
        this.locationname = locationname;
    }

    @JsonProperty("entityname")
    public String getEntityname() {
        return entityname;
    }

    @JsonProperty("entityname")
    public void setEntityname(String entityname) {
        this.entityname = entityname;
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

    @JsonProperty("startingdate")
    public String getStartingdate() {
        return startingdate;
    }

    @JsonProperty("startingdate")
    public void setStartingdate(String startingdate) {
        this.startingdate = startingdate;
    }

    @JsonProperty("startingtime")
    public String getStartingtime() {
        return startingtime;
    }

    @JsonProperty("startingtime")
    public void setStartingtime(String startingtime) {
        this.startingtime = startingtime;
    }

    @JsonProperty("endingdate")
    public String getEndingdate() {
        return endingdate;
    }

    @JsonProperty("endingdate")
    public void setEndingdate(String endingdate) {
        this.endingdate = endingdate;
    }

    @JsonProperty("closingtime")
    public String getClosingtime() {
        return closingtime;
    }

    @JsonProperty("closingtime")
    public void setClosingtime(String closingtime) {
        this.closingtime = closingtime;
    }

    @JsonProperty("remark1")
    public String getRemark1() {
        return remark1;
    }

    @JsonProperty("remark1")
    public void setRemark1(String remark1) {
        this.remark1 = remark1;
    }

    @JsonProperty("remark2")
    public String getRemark2() {
        return remark2;
    }

    @JsonProperty("remark2")
    public void setRemark2(String remark2) {
        this.remark2 = remark2;
    }

    @JsonProperty("remark3")
    public String getRemark3() {
        return remark3;
    }

    @JsonProperty("remark3")
    public void setRemark3(String remark3) {
        this.remark3 = remark3;
    }

    @JsonProperty("quantitya")
    public Integer getQuantitya() {
        return quantitya;
    }

    @JsonProperty("quantitya")
    public void setQuantitya(Integer quantitya) {
        this.quantitya = quantitya;
    }

    @JsonProperty("quantityb")
    public Integer getQuantityb() {
        return quantityb;
    }

    @JsonProperty("quantityb")
    public void setQuantityb(Integer quantityb) {
        this.quantityb = quantityb;
    }

    @JsonProperty("unitpricebase")
    public Integer getUnitpricebase() {
        return unitpricebase;
    }

    @JsonProperty("unitpricebase")
    public void setUnitpricebase(Integer unitpricebase) {
        this.unitpricebase = unitpricebase;
    }

    @JsonProperty("unitpricecurrency")
    public Integer getUnitpricecurrency() {
        return unitpricecurrency;
    }

    @JsonProperty("unitpricecurrency")
    public void setUnitpricecurrency(Integer unitpricecurrency) {
        this.unitpricecurrency = unitpricecurrency;
    }

    @JsonProperty("numberof")
    public Double getNumberof() {
        return numberof;
    }

    @JsonProperty("numberof")
    public void setNumberof(Double numberof) {
        this.numberof = numberof;
    }

    @JsonProperty("costtype")
    public String getCosttype() {
        return costtype;
    }

    @JsonProperty("costtype")
    public void setCosttype(String costtype) {
        this.costtype = costtype;
    }

    @JsonProperty("submitted")
    public Boolean getSubmitted() {
        return submitted;
    }

    @JsonProperty("submitted")
    public void setSubmitted(Boolean submitted) {
        this.submitted = submitted;
    }

    @JsonProperty("newapprovalstatus")
    public String getNewapprovalstatus() {
        return newapprovalstatus;
    }

    @JsonProperty("newapprovalstatus")
    public void setNewapprovalstatus(String newapprovalstatus) {
        this.newapprovalstatus = newapprovalstatus;
    }

    @JsonProperty("approvalstatus")
    public String getApprovalstatus() {
        return approvalstatus;
    }

    @JsonProperty("approvalstatus")
    public void setApprovalstatus(String approvalstatus) {
        this.approvalstatus = approvalstatus;
    }

    @JsonProperty("approvedorrejectedby")
    public String getApprovedorrejectedby() {
        return approvedorrejectedby;
    }

    @JsonProperty("approvedorrejectedby")
    public void setApprovedorrejectedby(String approvedorrejectedby) {
        this.approvedorrejectedby = approvedorrejectedby;
    }

    @JsonProperty("approvaldate")
    public String getApprovaldate() {
        return approvaldate;
    }

    @JsonProperty("approvaldate")
    public void setApprovaldate(String approvaldate) {
        this.approvaldate = approvaldate;
    }

    @JsonProperty("commentprojectmanager")
    public String getCommentprojectmanager() {
        return commentprojectmanager;
    }

    @JsonProperty("commentprojectmanager")
    public void setCommentprojectmanager(String commentprojectmanager) {
        this.commentprojectmanager = commentprojectmanager;
    }

    @JsonProperty("approvedbysuperior")
    public Boolean getApprovedbysuperior() {
        return approvedbysuperior;
    }

    @JsonProperty("approvedbysuperior")
    public void setApprovedbysuperior(Boolean approvedbysuperior) {
        this.approvedbysuperior = approvedbysuperior;
    }

    @JsonProperty("transferredforposting")
    public Boolean getTransferredforposting() {
        return transferredforposting;
    }

    @JsonProperty("transferredforposting")
    public void setTransferredforposting(Boolean transferredforposting) {
        this.transferredforposting = transferredforposting;
    }

    @JsonProperty("transferredamountbase")
    public Integer getTransferredamountbase() {
        return transferredamountbase;
    }

    @JsonProperty("transferredamountbase")
    public void setTransferredamountbase(Integer transferredamountbase) {
        this.transferredamountbase = transferredamountbase;
    }

    @JsonProperty("transferredquantitya")
    public Integer getTransferredquantitya() {
        return transferredquantitya;
    }

    @JsonProperty("transferredquantitya")
    public void setTransferredquantitya(Integer transferredquantitya) {
        this.transferredquantitya = transferredquantitya;
    }

    @JsonProperty("transferredquantityb")
    public Integer getTransferredquantityb() {
        return transferredquantityb;
    }

    @JsonProperty("transferredquantityb")
    public void setTransferredquantityb(Integer transferredquantityb) {
        this.transferredquantityb = transferredquantityb;
    }

    @JsonProperty("transferredamountcurrency")
    public Integer getTransferredamountcurrency() {
        return transferredamountcurrency;
    }

    @JsonProperty("transferredamountcurrency")
    public void setTransferredamountcurrency(Integer transferredamountcurrency) {
        this.transferredamountcurrency = transferredamountcurrency;
    }

    @JsonProperty("employeenumber")
    public String getEmployeenumber() {
        return employeenumber;
    }

    @JsonProperty("employeenumber")
    public void setEmployeenumber(String employeenumber) {
        this.employeenumber = employeenumber;
    }

    @JsonProperty("releasedbysuperior")
    public Boolean getReleasedbysuperior() {
        return releasedbysuperior;
    }

    @JsonProperty("releasedbysuperior")
    public void setReleasedbysuperior(Boolean releasedbysuperior) {
        this.releasedbysuperior = releasedbysuperior;
    }

    @JsonProperty("amountenterprise")
    public Integer getAmountenterprise() {
        return amountenterprise;
    }

    @JsonProperty("amountenterprise")
    public void setAmountenterprise(Integer amountenterprise) {
        this.amountenterprise = amountenterprise;
    }

    @JsonProperty("unitpriceenterprise")
    public Integer getUnitpriceenterprise() {
        return unitpriceenterprise;
    }

    @JsonProperty("unitpriceenterprise")
    public void setUnitpriceenterprise(Integer unitpriceenterprise) {
        this.unitpriceenterprise = unitpriceenterprise;
    }

    @JsonProperty("transferredamountenterprise")
    public Integer getTransferredamountenterprise() {
        return transferredamountenterprise;
    }

    @JsonProperty("transferredamountenterprise")
    public void setTransferredamountenterprise(Integer transferredamountenterprise) {
        this.transferredamountenterprise = transferredamountenterprise;
    }

    @JsonProperty("exchangerate")
    public Integer getExchangerate() {
        return exchangerate;
    }

    @JsonProperty("exchangerate")
    public void setExchangerate(Integer exchangerate) {
        this.exchangerate = exchangerate;
    }

    @JsonProperty("vatcurrency")
    public Integer getVatcurrency() {
        return vatcurrency;
    }

    @JsonProperty("vatcurrency")
    public void setVatcurrency(Integer vatcurrency) {
        this.vatcurrency = vatcurrency;
    }

    @JsonProperty("vatbase")
    public Integer getVatbase() {
        return vatbase;
    }

    @JsonProperty("vatbase")
    public void setVatbase(Integer vatbase) {
        this.vatbase = vatbase;
    }

    @JsonProperty("vatenterprise")
    public Integer getVatenterprise() {
        return vatenterprise;
    }

    @JsonProperty("vatenterprise")
    public void setVatenterprise(Integer vatenterprise) {
        this.vatenterprise = vatenterprise;
    }

    @JsonProperty("transferredvatcurrency")
    public Integer getTransferredvatcurrency() {
        return transferredvatcurrency;
    }

    @JsonProperty("transferredvatcurrency")
    public void setTransferredvatcurrency(Integer transferredvatcurrency) {
        this.transferredvatcurrency = transferredvatcurrency;
    }

    @JsonProperty("transferredvatbase")
    public Integer getTransferredvatbase() {
        return transferredvatbase;
    }

    @JsonProperty("transferredvatbase")
    public void setTransferredvatbase(Integer transferredvatbase) {
        this.transferredvatbase = transferredvatbase;
    }

    @JsonProperty("transferredvatenterprise")
    public Integer getTransferredvatenterprise() {
        return transferredvatenterprise;
    }

    @JsonProperty("transferredvatenterprise")
    public void setTransferredvatenterprise(Integer transferredvatenterprise) {
        this.transferredvatenterprise = transferredvatenterprise;
    }

    @JsonProperty("unitpriceexvatbase")
    public Integer getUnitpriceexvatbase() {
        return unitpriceexvatbase;
    }

    @JsonProperty("unitpriceexvatbase")
    public void setUnitpriceexvatbase(Integer unitpriceexvatbase) {
        this.unitpriceexvatbase = unitpriceexvatbase;
    }

    @JsonProperty("unitpriceexvatcurrency")
    public Integer getUnitpriceexvatcurrency() {
        return unitpriceexvatcurrency;
    }

    @JsonProperty("unitpriceexvatcurrency")
    public void setUnitpriceexvatcurrency(Integer unitpriceexvatcurrency) {
        this.unitpriceexvatcurrency = unitpriceexvatcurrency;
    }

    @JsonProperty("unitpriceexvatenterprise")
    public Integer getUnitpriceexvatenterprise() {
        return unitpriceexvatenterprise;
    }

    @JsonProperty("unitpriceexvatenterprise")
    public void setUnitpriceexvatenterprise(Integer unitpriceexvatenterprise) {
        this.unitpriceexvatenterprise = unitpriceexvatenterprise;
    }

    @JsonProperty("documentname")
    public String getDocumentname() {
        return documentname;
    }

    @JsonProperty("documentname")
    public void setDocumentname(String documentname) {
        this.documentname = documentname;
    }

    @JsonProperty("instancekey")
    public String getInstancekey() {
        return instancekey;
    }

    @JsonProperty("instancekey")
    public void setInstancekey(String instancekey) {
        this.instancekey = instancekey;
    }

    @JsonProperty("transactiontimestamp")
    public String getTransactiontimestamp() {
        return transactiontimestamp;
    }

    @JsonProperty("transactiontimestamp")
    public void setTransactiontimestamp(String transactiontimestamp) {
        this.transactiontimestamp = transactiontimestamp;
    }

    @JsonProperty("favorite")
    public String getFavorite() {
        return favorite;
    }

    @JsonProperty("favorite")
    public void setFavorite(String favorite) {
        this.favorite = favorite;
    }

    @JsonProperty("transferredvatspecificationentry")
    public String getTransferredvatspecificationentry() {
        return transferredvatspecificationentry;
    }

    @JsonProperty("transferredvatspecificationentry")
    public void setTransferredvatspecificationentry(String transferredvatspecificationentry) {
        this.transferredvatspecificationentry = transferredvatspecificationentry;
    }

    @JsonProperty("financevatcode2")
    public String getFinancevatcode2() {
        return financevatcode2;
    }

    @JsonProperty("financevatcode2")
    public void setFinancevatcode2(String financevatcode2) {
        this.financevatcode2 = financevatcode2;
    }

    @JsonProperty("financevatcode3")
    public String getFinancevatcode3() {
        return financevatcode3;
    }

    @JsonProperty("financevatcode3")
    public void setFinancevatcode3(String financevatcode3) {
        this.financevatcode3 = financevatcode3;
    }

    @JsonProperty("vat1currency")
    public Integer getVat1currency() {
        return vat1currency;
    }

    @JsonProperty("vat1currency")
    public void setVat1currency(Integer vat1currency) {
        this.vat1currency = vat1currency;
    }

    @JsonProperty("vat1base")
    public Integer getVat1base() {
        return vat1base;
    }

    @JsonProperty("vat1base")
    public void setVat1base(Integer vat1base) {
        this.vat1base = vat1base;
    }

    @JsonProperty("vat1enterprise")
    public Integer getVat1enterprise() {
        return vat1enterprise;
    }

    @JsonProperty("vat1enterprise")
    public void setVat1enterprise(Integer vat1enterprise) {
        this.vat1enterprise = vat1enterprise;
    }

    @JsonProperty("vat2currency")
    public Integer getVat2currency() {
        return vat2currency;
    }

    @JsonProperty("vat2currency")
    public void setVat2currency(Integer vat2currency) {
        this.vat2currency = vat2currency;
    }

    @JsonProperty("vat2base")
    public Integer getVat2base() {
        return vat2base;
    }

    @JsonProperty("vat2base")
    public void setVat2base(Integer vat2base) {
        this.vat2base = vat2base;
    }

    @JsonProperty("vat2enterprise")
    public Integer getVat2enterprise() {
        return vat2enterprise;
    }

    @JsonProperty("vat2enterprise")
    public void setVat2enterprise(Integer vat2enterprise) {
        this.vat2enterprise = vat2enterprise;
    }

    @JsonProperty("vat3currency")
    public Integer getVat3currency() {
        return vat3currency;
    }

    @JsonProperty("vat3currency")
    public void setVat3currency(Integer vat3currency) {
        this.vat3currency = vat3currency;
    }

    @JsonProperty("vat3base")
    public Integer getVat3base() {
        return vat3base;
    }

    @JsonProperty("vat3base")
    public void setVat3base(Integer vat3base) {
        this.vat3base = vat3base;
    }

    @JsonProperty("vat3enterprise")
    public Integer getVat3enterprise() {
        return vat3enterprise;
    }

    @JsonProperty("vat3enterprise")
    public void setVat3enterprise(Integer vat3enterprise) {
        this.vat3enterprise = vat3enterprise;
    }

    @JsonProperty("numberproposed")
    public Integer getNumberproposed() {
        return numberproposed;
    }

    @JsonProperty("numberproposed")
    public void setNumberproposed(Integer numberproposed) {
        this.numberproposed = numberproposed;
    }

    @JsonProperty("numberproposedtransferred")
    public Integer getNumberproposedtransferred() {
        return numberproposedtransferred;
    }

    @JsonProperty("numberproposedtransferred")
    public void setNumberproposedtransferred(Integer numberproposedtransferred) {
        this.numberproposedtransferred = numberproposedtransferred;
    }

    @JsonProperty("billingpricetotalproposedcurrency")
    public Integer getBillingpricetotalproposedcurrency() {
        return billingpricetotalproposedcurrency;
    }

    @JsonProperty("billingpricetotalproposedcurrency")
    public void setBillingpricetotalproposedcurrency(Integer billingpricetotalproposedcurrency) {
        this.billingpricetotalproposedcurrency = billingpricetotalproposedcurrency;
    }

    @JsonProperty("billingpriceproposedcurrency")
    public Integer getBillingpriceproposedcurrency() {
        return billingpriceproposedcurrency;
    }

    @JsonProperty("billingpriceproposedcurrency")
    public void setBillingpriceproposedcurrency(Integer billingpriceproposedcurrency) {
        this.billingpriceproposedcurrency = billingpriceproposedcurrency;
    }

    @JsonProperty("billingpricecurrency")
    public Integer getBillingpricecurrency() {
        return billingpricecurrency;
    }

    @JsonProperty("billingpricecurrency")
    public void setBillingpricecurrency(Integer billingpricecurrency) {
        this.billingpricecurrency = billingpricecurrency;
    }

    @JsonProperty("useinvoiceproposal")
    public Boolean getUseinvoiceproposal() {
        return useinvoiceproposal;
    }

    @JsonProperty("useinvoiceproposal")
    public void setUseinvoiceproposal(Boolean useinvoiceproposal) {
        this.useinvoiceproposal = useinvoiceproposal;
    }

    @JsonProperty("mileagefrom")
    public String getMileagefrom() {
        return mileagefrom;
    }

    @JsonProperty("mileagefrom")
    public void setMileagefrom(String mileagefrom) {
        this.mileagefrom = mileagefrom;
    }

    @JsonProperty("mileageto")
    public String getMileageto() {
        return mileageto;
    }

    @JsonProperty("mileageto")
    public void setMileageto(String mileageto) {
        this.mileageto = mileageto;
    }

    @JsonProperty("mileagevia")
    public String getMileagevia() {
        return mileagevia;
    }

    @JsonProperty("mileagevia")
    public void setMileagevia(String mileagevia) {
        this.mileagevia = mileagevia;
    }

    @JsonProperty("mileagevehicle")
    public String getMileagevehicle() {
        return mileagevehicle;
    }

    @JsonProperty("mileagevehicle")
    public void setMileagevehicle(String mileagevehicle) {
        this.mileagevehicle = mileagevehicle;
    }

    @JsonProperty("transactiontype")
    public String getTransactiontype() {
        return transactiontype;
    }

    @JsonProperty("transactiontype")
    public void setTransactiontype(String transactiontype) {
        this.transactiontype = transactiontype;
    }

    @JsonProperty("expensesheetlinetext1")
    public String getExpensesheetlinetext1() {
        return expensesheetlinetext1;
    }

    @JsonProperty("expensesheetlinetext1")
    public void setExpensesheetlinetext1(String expensesheetlinetext1) {
        this.expensesheetlinetext1 = expensesheetlinetext1;
    }

    @JsonProperty("expensesheetlinetext2")
    public String getExpensesheetlinetext2() {
        return expensesheetlinetext2;
    }

    @JsonProperty("expensesheetlinetext2")
    public void setExpensesheetlinetext2(String expensesheetlinetext2) {
        this.expensesheetlinetext2 = expensesheetlinetext2;
    }

    @JsonProperty("expensesheetlinetext3")
    public String getExpensesheetlinetext3() {
        return expensesheetlinetext3;
    }

    @JsonProperty("expensesheetlinetext3")
    public void setExpensesheetlinetext3(String expensesheetlinetext3) {
        this.expensesheetlinetext3 = expensesheetlinetext3;
    }

    @JsonProperty("expensesheetlinetext4")
    public String getExpensesheetlinetext4() {
        return expensesheetlinetext4;
    }

    @JsonProperty("expensesheetlinetext4")
    public void setExpensesheetlinetext4(String expensesheetlinetext4) {
        this.expensesheetlinetext4 = expensesheetlinetext4;
    }

    @JsonProperty("expensesheetlinetext5")
    public String getExpensesheetlinetext5() {
        return expensesheetlinetext5;
    }

    @JsonProperty("expensesheetlinetext5")
    public void setExpensesheetlinetext5(String expensesheetlinetext5) {
        this.expensesheetlinetext5 = expensesheetlinetext5;
    }

    @JsonProperty("expensesheetlinetext6")
    public String getExpensesheetlinetext6() {
        return expensesheetlinetext6;
    }

    @JsonProperty("expensesheetlinetext6")
    public void setExpensesheetlinetext6(String expensesheetlinetext6) {
        this.expensesheetlinetext6 = expensesheetlinetext6;
    }

    @JsonProperty("expensesheetlinetext7")
    public String getExpensesheetlinetext7() {
        return expensesheetlinetext7;
    }

    @JsonProperty("expensesheetlinetext7")
    public void setExpensesheetlinetext7(String expensesheetlinetext7) {
        this.expensesheetlinetext7 = expensesheetlinetext7;
    }

    @JsonProperty("expensesheetlinetext8")
    public String getExpensesheetlinetext8() {
        return expensesheetlinetext8;
    }

    @JsonProperty("expensesheetlinetext8")
    public void setExpensesheetlinetext8(String expensesheetlinetext8) {
        this.expensesheetlinetext8 = expensesheetlinetext8;
    }

    @JsonProperty("expensesheetlinetext9")
    public String getExpensesheetlinetext9() {
        return expensesheetlinetext9;
    }

    @JsonProperty("expensesheetlinetext9")
    public void setExpensesheetlinetext9(String expensesheetlinetext9) {
        this.expensesheetlinetext9 = expensesheetlinetext9;
    }

    @JsonProperty("expensesheetlinetext10")
    public String getExpensesheetlinetext10() {
        return expensesheetlinetext10;
    }

    @JsonProperty("expensesheetlinetext10")
    public void setExpensesheetlinetext10(String expensesheetlinetext10) {
        this.expensesheetlinetext10 = expensesheetlinetext10;
    }

    @JsonProperty("expensesheetlineinteger1")
    public Integer getExpensesheetlineinteger1() {
        return expensesheetlineinteger1;
    }

    @JsonProperty("expensesheetlineinteger1")
    public void setExpensesheetlineinteger1(Integer expensesheetlineinteger1) {
        this.expensesheetlineinteger1 = expensesheetlineinteger1;
    }

    @JsonProperty("expensesheetlineinteger2")
    public Integer getExpensesheetlineinteger2() {
        return expensesheetlineinteger2;
    }

    @JsonProperty("expensesheetlineinteger2")
    public void setExpensesheetlineinteger2(Integer expensesheetlineinteger2) {
        this.expensesheetlineinteger2 = expensesheetlineinteger2;
    }

    @JsonProperty("expensesheetlineinteger3")
    public Integer getExpensesheetlineinteger3() {
        return expensesheetlineinteger3;
    }

    @JsonProperty("expensesheetlineinteger3")
    public void setExpensesheetlineinteger3(Integer expensesheetlineinteger3) {
        this.expensesheetlineinteger3 = expensesheetlineinteger3;
    }

    @JsonProperty("expensesheetlineinteger4")
    public Integer getExpensesheetlineinteger4() {
        return expensesheetlineinteger4;
    }

    @JsonProperty("expensesheetlineinteger4")
    public void setExpensesheetlineinteger4(Integer expensesheetlineinteger4) {
        this.expensesheetlineinteger4 = expensesheetlineinteger4;
    }

    @JsonProperty("expensesheetlineinteger5")
    public Integer getExpensesheetlineinteger5() {
        return expensesheetlineinteger5;
    }

    @JsonProperty("expensesheetlineinteger5")
    public void setExpensesheetlineinteger5(Integer expensesheetlineinteger5) {
        this.expensesheetlineinteger5 = expensesheetlineinteger5;
    }

    @JsonProperty("expensesheetlinedate1")
    public String getExpensesheetlinedate1() {
        return expensesheetlinedate1;
    }

    @JsonProperty("expensesheetlinedate1")
    public void setExpensesheetlinedate1(String expensesheetlinedate1) {
        this.expensesheetlinedate1 = expensesheetlinedate1;
    }

    @JsonProperty("expensesheetlinedate2")
    public String getExpensesheetlinedate2() {
        return expensesheetlinedate2;
    }

    @JsonProperty("expensesheetlinedate2")
    public void setExpensesheetlinedate2(String expensesheetlinedate2) {
        this.expensesheetlinedate2 = expensesheetlinedate2;
    }

    @JsonProperty("expensesheetlinetime1")
    public String getExpensesheetlinetime1() {
        return expensesheetlinetime1;
    }

    @JsonProperty("expensesheetlinetime1")
    public void setExpensesheetlinetime1(String expensesheetlinetime1) {
        this.expensesheetlinetime1 = expensesheetlinetime1;
    }

    @JsonProperty("expensesheetlinetime2")
    public String getExpensesheetlinetime2() {
        return expensesheetlinetime2;
    }

    @JsonProperty("expensesheetlinetime2")
    public void setExpensesheetlinetime2(String expensesheetlinetime2) {
        this.expensesheetlinetime2 = expensesheetlinetime2;
    }

    @JsonProperty("transferrednumberof")
    public Integer getTransferrednumberof() {
        return transferrednumberof;
    }

    @JsonProperty("transferrednumberof")
    public void setTransferrednumberof(Integer transferrednumberof) {
        this.transferrednumberof = transferrednumberof;
    }

    @JsonProperty("expensesheettype")
    public String getExpensesheettype() {
        return expensesheettype;
    }

    @JsonProperty("expensesheettype")
    public void setExpensesheettype(String expensesheettype) {
        this.expensesheettype = expensesheettype;
    }

    @JsonProperty("invoiceable")
    public Boolean getInvoiceable() {
        return invoiceable;
    }

    @JsonProperty("invoiceable")
    public void setInvoiceable(Boolean invoiceable) {
        this.invoiceable = invoiceable;
    }

    @JsonProperty("expensejustification")
    public String getExpensejustification() {
        return expensejustification;
    }

    @JsonProperty("expensejustification")
    public void setExpensejustification(String expensejustification) {
        this.expensejustification = expensejustification;
    }

    @JsonProperty("timesheetlineinstancekey")
    public String getTimesheetlineinstancekey() {
        return timesheetlineinstancekey;
    }

    @JsonProperty("timesheetlineinstancekey")
    public void setTimesheetlineinstancekey(String timesheetlineinstancekey) {
        this.timesheetlineinstancekey = timesheetlineinstancekey;
    }

    @JsonProperty("billingpricebase")
    public Integer getBillingpricebase() {
        return billingpricebase;
    }

    @JsonProperty("billingpricebase")
    public void setBillingpricebase(Integer billingpricebase) {
        this.billingpricebase = billingpricebase;
    }

    @JsonProperty("billingpriceenterprise")
    public Integer getBillingpriceenterprise() {
        return billingpriceenterprise;
    }

    @JsonProperty("billingpriceenterprise")
    public void setBillingpriceenterprise(Integer billingpriceenterprise) {
        this.billingpriceenterprise = billingpriceenterprise;
    }

    @JsonProperty("jobnamevar")
    public String getJobnamevar() {
        return jobnamevar;
    }

    @JsonProperty("jobnamevar")
    public void setJobnamevar(String jobnamevar) {
        this.jobnamevar = jobnamevar;
    }

    @JsonProperty("activitytextvar")
    public String getActivitytextvar() {
        return activitytextvar;
    }

    @JsonProperty("activitytextvar")
    public void setActivitytextvar(String activitytextvar) {
        this.activitytextvar = activitytextvar;
    }

    @JsonProperty("tasknamevar")
    public String getTasknamevar() {
        return tasknamevar;
    }

    @JsonProperty("tasknamevar")
    public void setTasknamevar(String tasknamevar) {
        this.tasknamevar = tasknamevar;
    }

    @JsonProperty("taskpathvar")
    public String getTaskpathvar() {
        return taskpathvar;
    }

    @JsonProperty("taskpathvar")
    public void setTaskpathvar(String taskpathvar) {
        this.taskpathvar = taskpathvar;
    }

    @JsonProperty("linecompanynamevar")
    public String getLinecompanynamevar() {
        return linecompanynamevar;
    }

    @JsonProperty("linecompanynamevar")
    public void setLinecompanynamevar(String linecompanynamevar) {
        this.linecompanynamevar = linecompanynamevar;
    }

    @JsonProperty("locationdescriptionvar")
    public String getLocationdescriptionvar() {
        return locationdescriptionvar;
    }

    @JsonProperty("locationdescriptionvar")
    public void setLocationdescriptionvar(String locationdescriptionvar) {
        this.locationdescriptionvar = locationdescriptionvar;
    }

    @JsonProperty("entitydescriptionvar")
    public String getEntitydescriptionvar() {
        return entitydescriptionvar;
    }

    @JsonProperty("entitydescriptionvar")
    public void setEntitydescriptionvar(String entitydescriptionvar) {
        this.entitydescriptionvar = entitydescriptionvar;
    }

    @JsonProperty("projectdescriptionvar")
    public String getProjectdescriptionvar() {
        return projectdescriptionvar;
    }

    @JsonProperty("projectdescriptionvar")
    public void setProjectdescriptionvar(String projectdescriptionvar) {
        this.projectdescriptionvar = projectdescriptionvar;
    }

    @JsonProperty("purposedescriptionvar")
    public String getPurposedescriptionvar() {
        return purposedescriptionvar;
    }

    @JsonProperty("purposedescriptionvar")
    public void setPurposedescriptionvar(String purposedescriptionvar) {
        this.purposedescriptionvar = purposedescriptionvar;
    }

    @JsonProperty("specification1descriptionvar")
    public String getSpecification1descriptionvar() {
        return specification1descriptionvar;
    }

    @JsonProperty("specification1descriptionvar")
    public void setSpecification1descriptionvar(String specification1descriptionvar) {
        this.specification1descriptionvar = specification1descriptionvar;
    }

    @JsonProperty("specification2descriptionvar")
    public String getSpecification2descriptionvar() {
        return specification2descriptionvar;
    }

    @JsonProperty("specification2descriptionvar")
    public void setSpecification2descriptionvar(String specification2descriptionvar) {
        this.specification2descriptionvar = specification2descriptionvar;
    }

    @JsonProperty("specification3descriptionvar")
    public String getSpecification3descriptionvar() {
        return specification3descriptionvar;
    }

    @JsonProperty("specification3descriptionvar")
    public void setSpecification3descriptionvar(String specification3descriptionvar) {
        this.specification3descriptionvar = specification3descriptionvar;
    }

    @JsonProperty("localspec1descriptionvar")
    public String getLocalspec1descriptionvar() {
        return localspec1descriptionvar;
    }

    @JsonProperty("localspec1descriptionvar")
    public void setLocalspec1descriptionvar(String localspec1descriptionvar) {
        this.localspec1descriptionvar = localspec1descriptionvar;
    }

    @JsonProperty("localspec2descriptionvar")
    public String getLocalspec2descriptionvar() {
        return localspec2descriptionvar;
    }

    @JsonProperty("localspec2descriptionvar")
    public void setLocalspec2descriptionvar(String localspec2descriptionvar) {
        this.localspec2descriptionvar = localspec2descriptionvar;
    }

    @JsonProperty("localspec3descriptionvar")
    public String getLocalspec3descriptionvar() {
        return localspec3descriptionvar;
    }

    @JsonProperty("localspec3descriptionvar")
    public void setLocalspec3descriptionvar(String localspec3descriptionvar) {
        this.localspec3descriptionvar = localspec3descriptionvar;
    }

    @JsonProperty("linecustomerpopup5var")
    public String getLinecustomerpopup5var() {
        return linecustomerpopup5var;
    }

    @JsonProperty("linecustomerpopup5var")
    public void setLinecustomerpopup5var(String linecustomerpopup5var) {
        this.linecustomerpopup5var = linecustomerpopup5var;
    }

    @JsonProperty("linecustomerremark15var")
    public String getLinecustomerremark15var() {
        return linecustomerremark15var;
    }

    @JsonProperty("linecustomerremark15var")
    public void setLinecustomerremark15var(String linecustomerremark15var) {
        this.linecustomerremark15var = linecustomerremark15var;
    }

    @JsonProperty("linecustomerremark16var")
    public String getLinecustomerremark16var() {
        return linecustomerremark16var;
    }

    @JsonProperty("linecustomerremark16var")
    public void setLinecustomerremark16var(String linecustomerremark16var) {
        this.linecustomerremark16var = linecustomerremark16var;
    }

    @JsonProperty("linecustomerremark17var")
    public String getLinecustomerremark17var() {
        return linecustomerremark17var;
    }

    @JsonProperty("linecustomerremark17var")
    public void setLinecustomerremark17var(String linecustomerremark17var) {
        this.linecustomerremark17var = linecustomerremark17var;
    }

    @JsonProperty("linecustomerremark18var")
    public String getLinecustomerremark18var() {
        return linecustomerremark18var;
    }

    @JsonProperty("linecustomerremark18var")
    public void setLinecustomerremark18var(String linecustomerremark18var) {
        this.linecustomerremark18var = linecustomerremark18var;
    }

    @JsonProperty("linecustomerremark19var")
    public String getLinecustomerremark19var() {
        return linecustomerremark19var;
    }

    @JsonProperty("linecustomerremark19var")
    public void setLinecustomerremark19var(String linecustomerremark19var) {
        this.linecustomerremark19var = linecustomerremark19var;
    }

    @JsonProperty("linecustomerremark20var")
    public String getLinecustomerremark20var() {
        return linecustomerremark20var;
    }

    @JsonProperty("linecustomerremark20var")
    public void setLinecustomerremark20var(String linecustomerremark20var) {
        this.linecustomerremark20var = linecustomerremark20var;
    }

    @JsonProperty("customernumbervar")
    public String getCustomernumbervar() {
        return customernumbervar;
    }

    @JsonProperty("customernumbervar")
    public void setCustomernumbervar(String customernumbervar) {
        this.customernumbervar = customernumbervar;
    }

    @JsonProperty("customernamevar")
    public String getCustomernamevar() {
        return customernamevar;
    }

    @JsonProperty("customernamevar")
    public void setCustomernamevar(String customernamevar) {
        this.customernamevar = customernamevar;
    }

    @JsonProperty("languagevar")
    public String getLanguagevar() {
        return languagevar;
    }

    @JsonProperty("languagevar")
    public void setLanguagevar(String languagevar) {
        this.languagevar = languagevar;
    }

    @JsonProperty("expensejustificationhelptextvar")
    public String getExpensejustificationhelptextvar() {
        return expensejustificationhelptextvar;
    }

    @JsonProperty("expensejustificationhelptextvar")
    public void setExpensejustificationhelptextvar(String expensejustificationhelptextvar) {
        this.expensejustificationhelptextvar = expensejustificationhelptextvar;
    }

    @JsonProperty("lineapprovalrelationvar")
    public String getLineapprovalrelationvar() {
        return lineapprovalrelationvar;
    }

    @JsonProperty("lineapprovalrelationvar")
    public void setLineapprovalrelationvar(String lineapprovalrelationvar) {
        this.lineapprovalrelationvar = lineapprovalrelationvar;
    }

    @JsonProperty("lineapprovalnumbervar")
    public Integer getLineapprovalnumbervar() {
        return lineapprovalnumbervar;
    }

    @JsonProperty("lineapprovalnumbervar")
    public void setLineapprovalnumbervar(Integer lineapprovalnumbervar) {
        this.lineapprovalnumbervar = lineapprovalnumbervar;
    }

    @JsonProperty("lineapprovallinenumbervar")
    public Integer getLineapprovallinenumbervar() {
        return lineapprovallinenumbervar;
    }

    @JsonProperty("lineapprovallinenumbervar")
    public void setLineapprovallinenumbervar(Integer lineapprovallinenumbervar) {
        this.lineapprovallinenumbervar = lineapprovallinenumbervar;
    }

    @JsonProperty("linecurrentapprovalstatusdescriptionvar")
    public String getLinecurrentapprovalstatusdescriptionvar() {
        return linecurrentapprovalstatusdescriptionvar;
    }

    @JsonProperty("linecurrentapprovalstatusdescriptionvar")
    public void setLinecurrentapprovalstatusdescriptionvar(String linecurrentapprovalstatusdescriptionvar) {
        this.linecurrentapprovalstatusdescriptionvar = linecurrentapprovalstatusdescriptionvar;
    }

    @JsonProperty("linecurrentapprovalstatusvar")
    public String getLinecurrentapprovalstatusvar() {
        return linecurrentapprovalstatusvar;
    }

    @JsonProperty("linecurrentapprovalstatusvar")
    public void setLinecurrentapprovalstatusvar(String linecurrentapprovalstatusvar) {
        this.linecurrentapprovalstatusvar = linecurrentapprovalstatusvar;
    }

    @JsonProperty("linecanbeapprovedbycurrentuservar")
    public Boolean getLinecanbeapprovedbycurrentuservar() {
        return linecanbeapprovedbycurrentuservar;
    }

    @JsonProperty("linecanbeapprovedbycurrentuservar")
    public void setLinecanbeapprovedbycurrentuservar(Boolean linecanbeapprovedbycurrentuservar) {
        this.linecanbeapprovedbycurrentuservar = linecanbeapprovedbycurrentuservar;
    }

    @JsonProperty("lineapprovedorrejectedbyvar")
    public String getLineapprovedorrejectedbyvar() {
        return lineapprovedorrejectedbyvar;
    }

    @JsonProperty("lineapprovedorrejectedbyvar")
    public void setLineapprovedorrejectedbyvar(String lineapprovedorrejectedbyvar) {
        this.lineapprovedorrejectedbyvar = lineapprovedorrejectedbyvar;
    }

    @JsonProperty("lineapprovaldatevar")
    public String getLineapprovaldatevar() {
        return lineapprovaldatevar;
    }

    @JsonProperty("lineapprovaldatevar")
    public void setLineapprovaldatevar(String lineapprovaldatevar) {
        this.lineapprovaldatevar = lineapprovaldatevar;
    }

    @JsonProperty("lineapprovaltimevar")
    public String getLineapprovaltimevar() {
        return lineapprovaltimevar;
    }

    @JsonProperty("lineapprovaltimevar")
    public void setLineapprovaltimevar(String lineapprovaltimevar) {
        this.lineapprovaltimevar = lineapprovaltimevar;
    }

    @JsonProperty("lineremarkvar")
    public String getLineremarkvar() {
        return lineremarkvar;
    }

    @JsonProperty("lineremarkvar")
    public void setLineremarkvar(String lineremarkvar) {
        this.lineremarkvar = lineremarkvar;
    }

    @JsonProperty("tooltipjobvar")
    public String getTooltipjobvar() {
        return tooltipjobvar;
    }

    @JsonProperty("tooltipjobvar")
    public void setTooltipjobvar(String tooltipjobvar) {
        this.tooltipjobvar = tooltipjobvar;
    }

    @JsonProperty("tooltiptaskvar")
    public String getTooltiptaskvar() {
        return tooltiptaskvar;
    }

    @JsonProperty("tooltiptaskvar")
    public void setTooltiptaskvar(String tooltiptaskvar) {
        this.tooltiptaskvar = tooltiptaskvar;
    }

    @JsonProperty("tooltiptasklinebreakvar")
    public String getTooltiptasklinebreakvar() {
        return tooltiptasklinebreakvar;
    }

    @JsonProperty("tooltiptasklinebreakvar")
    public void setTooltiptasklinebreakvar(String tooltiptasklinebreakvar) {
        this.tooltiptasklinebreakvar = tooltiptasklinebreakvar;
    }

    @JsonProperty("tooltipactivityvar")
    public String getTooltipactivityvar() {
        return tooltipactivityvar;
    }

    @JsonProperty("tooltipactivityvar")
    public void setTooltipactivityvar(String tooltipactivityvar) {
        this.tooltipactivityvar = tooltipactivityvar;
    }

    @JsonProperty("tooltipconclusionvar")
    public String getTooltipconclusionvar() {
        return tooltipconclusionvar;
    }

    @JsonProperty("tooltipconclusionvar")
    public void setTooltipconclusionvar(String tooltipconclusionvar) {
        this.tooltipconclusionvar = tooltipconclusionvar;
    }

    @JsonProperty("linedetailsvar")
    public String getLinedetailsvar() {
        return linedetailsvar;
    }

    @JsonProperty("linedetailsvar")
    public void setLinedetailsvar(String linedetailsvar) {
        this.linedetailsvar = linedetailsvar;
    }

    @JsonProperty("linedetailstypevar")
    public String getLinedetailstypevar() {
        return linedetailstypevar;
    }

    @JsonProperty("linedetailstypevar")
    public void setLinedetailstypevar(String linedetailstypevar) {
        this.linedetailstypevar = linedetailstypevar;
    }

    @JsonProperty("customerlevelnamevar")
    public String getCustomerlevelnamevar() {
        return customerlevelnamevar;
    }

    @JsonProperty("customerlevelnamevar")
    public void setCustomerlevelnamevar(String customerlevelnamevar) {
        this.customerlevelnamevar = customerlevelnamevar;
    }

    @JsonProperty("level1customernumbervar")
    public String getLevel1customernumbervar() {
        return level1customernumbervar;
    }

    @JsonProperty("level1customernumbervar")
    public void setLevel1customernumbervar(String level1customernumbervar) {
        this.level1customernumbervar = level1customernumbervar;
    }

    @JsonProperty("level2customernumbervar")
    public String getLevel2customernumbervar() {
        return level2customernumbervar;
    }

    @JsonProperty("level2customernumbervar")
    public void setLevel2customernumbervar(String level2customernumbervar) {
        this.level2customernumbervar = level2customernumbervar;
    }

    @JsonProperty("level3customernumbervar")
    public String getLevel3customernumbervar() {
        return level3customernumbervar;
    }

    @JsonProperty("level3customernumbervar")
    public void setLevel3customernumbervar(String level3customernumbervar) {
        this.level3customernumbervar = level3customernumbervar;
    }

    @JsonProperty("level4customernumbervar")
    public String getLevel4customernumbervar() {
        return level4customernumbervar;
    }

    @JsonProperty("level4customernumbervar")
    public void setLevel4customernumbervar(String level4customernumbervar) {
        this.level4customernumbervar = level4customernumbervar;
    }

    @JsonProperty("level5customernumbervar")
    public String getLevel5customernumbervar() {
        return level5customernumbervar;
    }

    @JsonProperty("level5customernumbervar")
    public void setLevel5customernumbervar(String level5customernumbervar) {
        this.level5customernumbervar = level5customernumbervar;
    }

    @JsonProperty("level1customernamevar")
    public String getLevel1customernamevar() {
        return level1customernamevar;
    }

    @JsonProperty("level1customernamevar")
    public void setLevel1customernamevar(String level1customernamevar) {
        this.level1customernamevar = level1customernamevar;
    }

    @JsonProperty("level2customernamevar")
    public String getLevel2customernamevar() {
        return level2customernamevar;
    }

    @JsonProperty("level2customernamevar")
    public void setLevel2customernamevar(String level2customernamevar) {
        this.level2customernamevar = level2customernamevar;
    }

    @JsonProperty("level3customernamevar")
    public String getLevel3customernamevar() {
        return level3customernamevar;
    }

    @JsonProperty("level3customernamevar")
    public void setLevel3customernamevar(String level3customernamevar) {
        this.level3customernamevar = level3customernamevar;
    }

    @JsonProperty("level4customernamevar")
    public String getLevel4customernamevar() {
        return level4customernamevar;
    }

    @JsonProperty("level4customernamevar")
    public void setLevel4customernamevar(String level4customernamevar) {
        this.level4customernamevar = level4customernamevar;
    }

    @JsonProperty("level5customernamevar")
    public String getLevel5customernamevar() {
        return level5customernamevar;
    }

    @JsonProperty("level5customernamevar")
    public void setLevel5customernamevar(String level5customernamevar) {
        this.level5customernamevar = level5customernamevar;
    }

    @JsonProperty("justificationrequiredvar")
    public Boolean getJustificationrequiredvar() {
        return justificationrequiredvar;
    }

    @JsonProperty("justificationrequiredvar")
    public void setJustificationrequiredvar(Boolean justificationrequiredvar) {
        this.justificationrequiredvar = justificationrequiredvar;
    }

    @JsonProperty("justificationcompletevar")
    public Boolean getJustificationcompletevar() {
        return justificationcompletevar;
    }

    @JsonProperty("justificationcompletevar")
    public void setJustificationcompletevar(Boolean justificationcompletevar) {
        this.justificationcompletevar = justificationcompletevar;
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
        return new ToStringBuilder(this).append("expensesheetnumber", expensesheetnumber).append("linenumber", linenumber).append("entrydate", entrydate).append("jobnumber", jobnumber).append("activitynumber", activitynumber).append("text", text).append("currency", currency).append("amountbase", amountbase).append("amountcurrency", amountcurrency).append("financevatcode", financevatcode).append("reference", reference).append("taskname", taskname).append("companynumber", companynumber).append("locationname", locationname).append("entityname", entityname).append("projectname", projectname).append("purposename", purposename).append("specification1name", specification1name).append("specification2name", specification2name).append("specification3name", specification3name).append("localspec1name", localspec1name).append("localspec2name", localspec2name).append("localspec3name", localspec3name).append("startingdate", startingdate).append("startingtime", startingtime).append("endingdate", endingdate).append("closingtime", closingtime).append("remark1", remark1).append("remark2", remark2).append("remark3", remark3).append("quantitya", quantitya).append("quantityb", quantityb).append("unitpricebase", unitpricebase).append("unitpricecurrency", unitpricecurrency).append("numberof", numberof).append("costtype", costtype).append("submitted", submitted).append("newapprovalstatus", newapprovalstatus).append("approvalstatus", approvalstatus).append("approvedorrejectedby", approvedorrejectedby).append("approvaldate", approvaldate).append("commentprojectmanager", commentprojectmanager).append("approvedbysuperior", approvedbysuperior).append("transferredforposting", transferredforposting).append("transferredamountbase", transferredamountbase).append("transferredquantitya", transferredquantitya).append("transferredquantityb", transferredquantityb).append("transferredamountcurrency", transferredamountcurrency).append("employeenumber", employeenumber).append("releasedbysuperior", releasedbysuperior).append("amountenterprise", amountenterprise).append("unitpriceenterprise", unitpriceenterprise).append("transferredamountenterprise", transferredamountenterprise).append("exchangerate", exchangerate).append("vatcurrency", vatcurrency).append("vatbase", vatbase).append("vatenterprise", vatenterprise).append("transferredvatcurrency", transferredvatcurrency).append("transferredvatbase", transferredvatbase).append("transferredvatenterprise", transferredvatenterprise).append("unitpriceexvatbase", unitpriceexvatbase).append("unitpriceexvatcurrency", unitpriceexvatcurrency).append("unitpriceexvatenterprise", unitpriceexvatenterprise).append("documentname", documentname).append("instancekey", instancekey).append("transactiontimestamp", transactiontimestamp).append("favorite", favorite).append("transferredvatspecificationentry", transferredvatspecificationentry).append("financevatcode2", financevatcode2).append("financevatcode3", financevatcode3).append("vat1currency", vat1currency).append("vat1base", vat1base).append("vat1enterprise", vat1enterprise).append("vat2currency", vat2currency).append("vat2base", vat2base).append("vat2enterprise", vat2enterprise).append("vat3currency", vat3currency).append("vat3base", vat3base).append("vat3enterprise", vat3enterprise).append("numberproposed", numberproposed).append("numberproposedtransferred", numberproposedtransferred).append("billingpricetotalproposedcurrency", billingpricetotalproposedcurrency).append("billingpriceproposedcurrency", billingpriceproposedcurrency).append("billingpricecurrency", billingpricecurrency).append("useinvoiceproposal", useinvoiceproposal).append("mileagefrom", mileagefrom).append("mileageto", mileageto).append("mileagevia", mileagevia).append("mileagevehicle", mileagevehicle).append("transactiontype", transactiontype).append("expensesheetlinetext1", expensesheetlinetext1).append("expensesheetlinetext2", expensesheetlinetext2).append("expensesheetlinetext3", expensesheetlinetext3).append("expensesheetlinetext4", expensesheetlinetext4).append("expensesheetlinetext5", expensesheetlinetext5).append("expensesheetlinetext6", expensesheetlinetext6).append("expensesheetlinetext7", expensesheetlinetext7).append("expensesheetlinetext8", expensesheetlinetext8).append("expensesheetlinetext9", expensesheetlinetext9).append("expensesheetlinetext10", expensesheetlinetext10).append("expensesheetlineinteger1", expensesheetlineinteger1).append("expensesheetlineinteger2", expensesheetlineinteger2).append("expensesheetlineinteger3", expensesheetlineinteger3).append("expensesheetlineinteger4", expensesheetlineinteger4).append("expensesheetlineinteger5", expensesheetlineinteger5).append("expensesheetlinedate1", expensesheetlinedate1).append("expensesheetlinedate2", expensesheetlinedate2).append("expensesheetlinetime1", expensesheetlinetime1).append("expensesheetlinetime2", expensesheetlinetime2).append("transferrednumberof", transferrednumberof).append("expensesheettype", expensesheettype).append("invoiceable", invoiceable).append("expensejustification", expensejustification).append("timesheetlineinstancekey", timesheetlineinstancekey).append("billingpricebase", billingpricebase).append("billingpriceenterprise", billingpriceenterprise).append("jobnamevar", jobnamevar).append("activitytextvar", activitytextvar).append("tasknamevar", tasknamevar).append("taskpathvar", taskpathvar).append("linecompanynamevar", linecompanynamevar).append("locationdescriptionvar", locationdescriptionvar).append("entitydescriptionvar", entitydescriptionvar).append("projectdescriptionvar", projectdescriptionvar).append("purposedescriptionvar", purposedescriptionvar).append("specification1descriptionvar", specification1descriptionvar).append("specification2descriptionvar", specification2descriptionvar).append("specification3descriptionvar", specification3descriptionvar).append("localspec1descriptionvar", localspec1descriptionvar).append("localspec2descriptionvar", localspec2descriptionvar).append("localspec3descriptionvar", localspec3descriptionvar).append("linecustomerpopup5var", linecustomerpopup5var).append("linecustomerremark15var", linecustomerremark15var).append("linecustomerremark16var", linecustomerremark16var).append("linecustomerremark17var", linecustomerremark17var).append("linecustomerremark18var", linecustomerremark18var).append("linecustomerremark19var", linecustomerremark19var).append("linecustomerremark20var", linecustomerremark20var).append("customernumbervar", customernumbervar).append("customernamevar", customernamevar).append("languagevar", languagevar).append("expensejustificationhelptextvar", expensejustificationhelptextvar).append("lineapprovalrelationvar", lineapprovalrelationvar).append("lineapprovalnumbervar", lineapprovalnumbervar).append("lineapprovallinenumbervar", lineapprovallinenumbervar).append("linecurrentapprovalstatusdescriptionvar", linecurrentapprovalstatusdescriptionvar).append("linecurrentapprovalstatusvar", linecurrentapprovalstatusvar).append("linecanbeapprovedbycurrentuservar", linecanbeapprovedbycurrentuservar).append("lineapprovedorrejectedbyvar", lineapprovedorrejectedbyvar).append("lineapprovaldatevar", lineapprovaldatevar).append("lineapprovaltimevar", lineapprovaltimevar).append("lineremarkvar", lineremarkvar).append("tooltipjobvar", tooltipjobvar).append("tooltiptaskvar", tooltiptaskvar).append("tooltiptasklinebreakvar", tooltiptasklinebreakvar).append("tooltipactivityvar", tooltipactivityvar).append("tooltipconclusionvar", tooltipconclusionvar).append("linedetailsvar", linedetailsvar).append("linedetailstypevar", linedetailstypevar).append("customerlevelnamevar", customerlevelnamevar).append("level1customernumbervar", level1customernumbervar).append("level2customernumbervar", level2customernumbervar).append("level3customernumbervar", level3customernumbervar).append("level4customernumbervar", level4customernumbervar).append("level5customernumbervar", level5customernumbervar).append("level1customernamevar", level1customernamevar).append("level2customernamevar", level2customernamevar).append("level3customernamevar", level3customernamevar).append("level4customernamevar", level4customernamevar).append("level5customernamevar", level5customernamevar).append("justificationrequiredvar", justificationrequiredvar).append("justificationcompletevar", justificationcompletevar).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(linecustomerpopup5var).append(billingpricebase).append(specification2descriptionvar).append(billingpricetotalproposedcurrency).append(transferredamountbase).append(transactiontype).append(customernumbervar).append(documentname).append(startingdate).append(exchangerate).append(releasedbysuperior).append(linecompanynamevar).append(vat3base).append(transferredamountenterprise).append(amountenterprise).append(employeenumber).append(mileagefrom).append(localspec2descriptionvar).append(vat2enterprise).append(lineremarkvar).append(financevatcode3).append(financevatcode2).append(justificationrequiredvar).append(customernamevar).append(submitted).append(level5customernamevar).append(projectname).append(favorite).append(billingpriceproposedcurrency).append(endingdate).append(vatbase).append(transferredvatcurrency).append(amountcurrency).append(newapprovalstatus).append(lineapprovaltimevar).append(localspec1name).append(entityname).append(specification3descriptionvar).append(invoiceable).append(transactiontimestamp).append(linecurrentapprovalstatusdescriptionvar).append(lineapprovalnumbervar).append(numberproposedtransferred).append(vat1currency).append(unitpriceexvatcurrency).append(lineapprovalrelationvar).append(linecustomerremark19var).append(transferredamountcurrency).append(lineapprovedorrejectedbyvar).append(vat1enterprise).append(instancekey).append(level3customernumbervar).append(linecanbeapprovedbycurrentuservar).append(approvaldate).append(currency).append(commentprojectmanager).append(lineapprovaldatevar).append(activitytextvar).append(level1customernamevar).append(vat1base).append(tooltipconclusionvar).append(quantityb).append(entitydescriptionvar).append(quantitya).append(tooltipjobvar).append(specification1name).append(specification3name).append(approvedorrejectedby).append(mileagevehicle).append(linecustomerremark20var).append(level4customernumbervar).append(linecustomerremark15var).append(specification2name).append(mileageto).append(languagevar).append(specification1descriptionvar).append(lineapprovallinenumbervar).append(localspec3name).append(purposename).append(expensejustificationhelptextvar).append(linecurrentapprovalstatusvar).append(unitpriceenterprise).append(tasknamevar).append(vat3enterprise).append(expensesheetlinetime2).append(taskname).append(expensesheetlinetime1).append(level4customernamevar).append(expensejustification).append(vatcurrency).append(level2customernumbervar).append(unitpricecurrency).append(numberproposed).append(remark1).append(linecustomerremark16var).append(remark3).append(remark2).append(closingtime).append(linenumber).append(level1customernumbervar).append(justificationcompletevar).append(level2customernamevar).append(expensesheetnumber).append(entrydate).append(locationdescriptionvar).append(jobnamevar).append(localspec3descriptionvar).append(taskpathvar).append(unitpriceexvatenterprise).append(level5customernumbervar).append(transferredquantityb).append(transferredquantitya).append(mileagevia).append(text).append(vat2currency).append(companynumber).append(approvedbysuperior).append(linecustomerremark17var).append(vat3currency).append(transferredvatspecificationentry).append(transferredvatbase).append(additionalProperties).append(vatenterprise).append(linecustomerremark18var).append(unitpriceexvatbase).append(costtype).append(amountbase).append(expensesheetlinetext8).append(expensesheetlinetext9).append(useinvoiceproposal).append(approvalstatus).append(billingpriceenterprise).append(tooltipactivityvar).append(purposedescriptionvar).append(billingpricecurrency).append(financevatcode).append(numberof).append(customerlevelnamevar).append(expensesheettype).append(expensesheetlinetext1).append(level3customernamevar).append(expensesheetlinetext3).append(locationname).append(expensesheetlinetext2).append(tooltiptasklinebreakvar).append(expensesheetlinetext5).append(expensesheetlinetext4).append(transferredforposting).append(activitynumber).append(expensesheetlinetext7).append(localspec2name).append(expensesheetlinetext6).append(startingtime).append(transferrednumberof).append(expensesheetlinetext10).append(expensesheetlineinteger4).append(tooltiptaskvar).append(expensesheetlineinteger3).append(expensesheetlineinteger5).append(expensesheetlinedate2).append(expensesheetlinedate1).append(unitpricebase).append(projectdescriptionvar).append(reference).append(jobnumber).append(vat2base).append(timesheetlineinstancekey).append(linedetailsvar).append(linedetailstypevar).append(localspec1descriptionvar).append(expensesheetlineinteger1).append(expensesheetlineinteger2).append(transferredvatenterprise).toHashCode();
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
        return new EqualsBuilder().append(linecustomerpopup5var, rhs.linecustomerpopup5var).append(billingpricebase, rhs.billingpricebase).append(specification2descriptionvar, rhs.specification2descriptionvar).append(billingpricetotalproposedcurrency, rhs.billingpricetotalproposedcurrency).append(transferredamountbase, rhs.transferredamountbase).append(transactiontype, rhs.transactiontype).append(customernumbervar, rhs.customernumbervar).append(documentname, rhs.documentname).append(startingdate, rhs.startingdate).append(exchangerate, rhs.exchangerate).append(releasedbysuperior, rhs.releasedbysuperior).append(linecompanynamevar, rhs.linecompanynamevar).append(vat3base, rhs.vat3base).append(transferredamountenterprise, rhs.transferredamountenterprise).append(amountenterprise, rhs.amountenterprise).append(employeenumber, rhs.employeenumber).append(mileagefrom, rhs.mileagefrom).append(localspec2descriptionvar, rhs.localspec2descriptionvar).append(vat2enterprise, rhs.vat2enterprise).append(lineremarkvar, rhs.lineremarkvar).append(financevatcode3, rhs.financevatcode3).append(financevatcode2, rhs.financevatcode2).append(justificationrequiredvar, rhs.justificationrequiredvar).append(customernamevar, rhs.customernamevar).append(submitted, rhs.submitted).append(level5customernamevar, rhs.level5customernamevar).append(projectname, rhs.projectname).append(favorite, rhs.favorite).append(billingpriceproposedcurrency, rhs.billingpriceproposedcurrency).append(endingdate, rhs.endingdate).append(vatbase, rhs.vatbase).append(transferredvatcurrency, rhs.transferredvatcurrency).append(amountcurrency, rhs.amountcurrency).append(newapprovalstatus, rhs.newapprovalstatus).append(lineapprovaltimevar, rhs.lineapprovaltimevar).append(localspec1name, rhs.localspec1name).append(entityname, rhs.entityname).append(specification3descriptionvar, rhs.specification3descriptionvar).append(invoiceable, rhs.invoiceable).append(transactiontimestamp, rhs.transactiontimestamp).append(linecurrentapprovalstatusdescriptionvar, rhs.linecurrentapprovalstatusdescriptionvar).append(lineapprovalnumbervar, rhs.lineapprovalnumbervar).append(numberproposedtransferred, rhs.numberproposedtransferred).append(vat1currency, rhs.vat1currency).append(unitpriceexvatcurrency, rhs.unitpriceexvatcurrency).append(lineapprovalrelationvar, rhs.lineapprovalrelationvar).append(linecustomerremark19var, rhs.linecustomerremark19var).append(transferredamountcurrency, rhs.transferredamountcurrency).append(lineapprovedorrejectedbyvar, rhs.lineapprovedorrejectedbyvar).append(vat1enterprise, rhs.vat1enterprise).append(instancekey, rhs.instancekey).append(level3customernumbervar, rhs.level3customernumbervar).append(linecanbeapprovedbycurrentuservar, rhs.linecanbeapprovedbycurrentuservar).append(approvaldate, rhs.approvaldate).append(currency, rhs.currency).append(commentprojectmanager, rhs.commentprojectmanager).append(lineapprovaldatevar, rhs.lineapprovaldatevar).append(activitytextvar, rhs.activitytextvar).append(level1customernamevar, rhs.level1customernamevar).append(vat1base, rhs.vat1base).append(tooltipconclusionvar, rhs.tooltipconclusionvar).append(quantityb, rhs.quantityb).append(entitydescriptionvar, rhs.entitydescriptionvar).append(quantitya, rhs.quantitya).append(tooltipjobvar, rhs.tooltipjobvar).append(specification1name, rhs.specification1name).append(specification3name, rhs.specification3name).append(approvedorrejectedby, rhs.approvedorrejectedby).append(mileagevehicle, rhs.mileagevehicle).append(linecustomerremark20var, rhs.linecustomerremark20var).append(level4customernumbervar, rhs.level4customernumbervar).append(linecustomerremark15var, rhs.linecustomerremark15var).append(specification2name, rhs.specification2name).append(mileageto, rhs.mileageto).append(languagevar, rhs.languagevar).append(specification1descriptionvar, rhs.specification1descriptionvar).append(lineapprovallinenumbervar, rhs.lineapprovallinenumbervar).append(localspec3name, rhs.localspec3name).append(purposename, rhs.purposename).append(expensejustificationhelptextvar, rhs.expensejustificationhelptextvar).append(linecurrentapprovalstatusvar, rhs.linecurrentapprovalstatusvar).append(unitpriceenterprise, rhs.unitpriceenterprise).append(tasknamevar, rhs.tasknamevar).append(vat3enterprise, rhs.vat3enterprise).append(expensesheetlinetime2, rhs.expensesheetlinetime2).append(taskname, rhs.taskname).append(expensesheetlinetime1, rhs.expensesheetlinetime1).append(level4customernamevar, rhs.level4customernamevar).append(expensejustification, rhs.expensejustification).append(vatcurrency, rhs.vatcurrency).append(level2customernumbervar, rhs.level2customernumbervar).append(unitpricecurrency, rhs.unitpricecurrency).append(numberproposed, rhs.numberproposed).append(remark1, rhs.remark1).append(linecustomerremark16var, rhs.linecustomerremark16var).append(remark3, rhs.remark3).append(remark2, rhs.remark2).append(closingtime, rhs.closingtime).append(linenumber, rhs.linenumber).append(level1customernumbervar, rhs.level1customernumbervar).append(justificationcompletevar, rhs.justificationcompletevar).append(level2customernamevar, rhs.level2customernamevar).append(expensesheetnumber, rhs.expensesheetnumber).append(entrydate, rhs.entrydate).append(locationdescriptionvar, rhs.locationdescriptionvar).append(jobnamevar, rhs.jobnamevar).append(localspec3descriptionvar, rhs.localspec3descriptionvar).append(taskpathvar, rhs.taskpathvar).append(unitpriceexvatenterprise, rhs.unitpriceexvatenterprise).append(level5customernumbervar, rhs.level5customernumbervar).append(transferredquantityb, rhs.transferredquantityb).append(transferredquantitya, rhs.transferredquantitya).append(mileagevia, rhs.mileagevia).append(text, rhs.text).append(vat2currency, rhs.vat2currency).append(companynumber, rhs.companynumber).append(approvedbysuperior, rhs.approvedbysuperior).append(linecustomerremark17var, rhs.linecustomerremark17var).append(vat3currency, rhs.vat3currency).append(transferredvatspecificationentry, rhs.transferredvatspecificationentry).append(transferredvatbase, rhs.transferredvatbase).append(additionalProperties, rhs.additionalProperties).append(vatenterprise, rhs.vatenterprise).append(linecustomerremark18var, rhs.linecustomerremark18var).append(unitpriceexvatbase, rhs.unitpriceexvatbase).append(costtype, rhs.costtype).append(amountbase, rhs.amountbase).append(expensesheetlinetext8, rhs.expensesheetlinetext8).append(expensesheetlinetext9, rhs.expensesheetlinetext9).append(useinvoiceproposal, rhs.useinvoiceproposal).append(approvalstatus, rhs.approvalstatus).append(billingpriceenterprise, rhs.billingpriceenterprise).append(tooltipactivityvar, rhs.tooltipactivityvar).append(purposedescriptionvar, rhs.purposedescriptionvar).append(billingpricecurrency, rhs.billingpricecurrency).append(financevatcode, rhs.financevatcode).append(numberof, rhs.numberof).append(customerlevelnamevar, rhs.customerlevelnamevar).append(expensesheettype, rhs.expensesheettype).append(expensesheetlinetext1, rhs.expensesheetlinetext1).append(level3customernamevar, rhs.level3customernamevar).append(expensesheetlinetext3, rhs.expensesheetlinetext3).append(locationname, rhs.locationname).append(expensesheetlinetext2, rhs.expensesheetlinetext2).append(tooltiptasklinebreakvar, rhs.tooltiptasklinebreakvar).append(expensesheetlinetext5, rhs.expensesheetlinetext5).append(expensesheetlinetext4, rhs.expensesheetlinetext4).append(transferredforposting, rhs.transferredforposting).append(activitynumber, rhs.activitynumber).append(expensesheetlinetext7, rhs.expensesheetlinetext7).append(localspec2name, rhs.localspec2name).append(expensesheetlinetext6, rhs.expensesheetlinetext6).append(startingtime, rhs.startingtime).append(transferrednumberof, rhs.transferrednumberof).append(expensesheetlinetext10, rhs.expensesheetlinetext10).append(expensesheetlineinteger4, rhs.expensesheetlineinteger4).append(tooltiptaskvar, rhs.tooltiptaskvar).append(expensesheetlineinteger3, rhs.expensesheetlineinteger3).append(expensesheetlineinteger5, rhs.expensesheetlineinteger5).append(expensesheetlinedate2, rhs.expensesheetlinedate2).append(expensesheetlinedate1, rhs.expensesheetlinedate1).append(unitpricebase, rhs.unitpricebase).append(projectdescriptionvar, rhs.projectdescriptionvar).append(reference, rhs.reference).append(jobnumber, rhs.jobnumber).append(vat2base, rhs.vat2base).append(timesheetlineinstancekey, rhs.timesheetlineinstancekey).append(linedetailsvar, rhs.linedetailsvar).append(linedetailstypevar, rhs.linedetailstypevar).append(localspec1descriptionvar, rhs.localspec1descriptionvar).append(expensesheetlineinteger1, rhs.expensesheetlineinteger1).append(expensesheetlineinteger2, rhs.expensesheetlineinteger2).append(transferredvatenterprise, rhs.transferredvatenterprise).isEquals();
    }

}
