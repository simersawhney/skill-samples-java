
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
    "description",
    "employeenumber",
    "companynumber",
    "createdby",
    "createddate",
    "submitted",
    "submittedby",
    "datesubmitted",
    "transferred",
    "transferredby",
    "transferdate",
    "approved",
    "approvedby",
    "approvaldate",
    "fromdate",
    "todate",
    "remark1",
    "remark2",
    "remark3",
    "superioremployee",
    "secretaryemployee",
    "reopened",
    "lineapprovalmissing",
    "fullyapproved",
    "copyfromexpensesheetnumber",
    "jobnumber",
    "jobname",
    "amountbase",
    "amountenterprise",
    "numberof",
    "quantitya",
    "quantityb",
    "approvalnumber",
    "currency",
    "exchangerate",
    "documentarchivenumber",
    "employeename",
    "instancekey",
    "notenumber",
    "tutoremployee",
    "transactiontimestamp",
    "expensesheettype",
    "copyallfields",
    "defaulttransactiontype",
    "expensesheettext1",
    "expensesheettext2",
    "expensesheettext3",
    "expensesheettext4",
    "expensesheettext5",
    "expensesheetboolean1",
    "expensesheetboolean2",
    "expensesheetboolean3",
    "expensesheetboolean4",
    "expensesheetboolean5",
    "expensesheetdate1",
    "expensesheetdate2",
    "expensesheetdate3",
    "expensesheetdate4",
    "expensesheetdate5",
    "expensesheetpopup1",
    "expensesheetpopup2",
    "expensesheetpopup3",
    "expensesheetpopup4",
    "expensesheetpopup5",
    "approvalgroupinstancekey",
    "approveraccessinstancekey",
    "approvalremarkvar",
    "companyname1var",
    "basecurrencyvar",
    "totalvatbasevar",
    "superioremployeenamevar",
    "secretaryemployeenamevar",
    "tutoremployeenamevar",
    "employeesubcontractornumbervar",
    "documentarchivedescriptionvar",
    "isproxycurrentemployeevar",
    "registrationnumbervar",
    "accountnumbervar",
    "vendornumbervar",
    "amounttotaltovendorbasevar",
    "vendorname1var",
    "bankvar",
    "notedescriptionvar",
    "headerapprovalrelationvar",
    "headerapprovalnumbervar",
    "headerapprovallinenumbervar",
    "headercurrentapprovalstatusvar",
    "headercurrentapprovalstatusdescriptionvar",
    "headercanbeapprovedbycurrentuservar",
    "headerapprovedorrejectedbyvar",
    "headerapprovaldatevar",
    "headerapprovaltimevar",
    "headerremarkvar",
    "workflowstatusvar",
    "duplicatedexpensesheetnumbervar",
    "level1titlenovar",
    "level2titlenovar",
    "level3titlenovar",
    "level4titlenovar",
    "level5titlenovar",
    "level1titlenamevar",
    "level2titlenamevar",
    "level3titlenamevar",
    "level4titlenamevar",
    "level5titlenamevar",
    "headercustomernumbervar",
    "headercustomernamevar",
    "projectmanagernumbervar",
    "projectmanagernamevar",
    "vendorsettlementstatusvar",
    "documentarchivelinecountvar",
    "expensesheetheaderstatusvar",
    "removeddocumentnamevar",
    "receiptnamevar",
    "expenseattachmenttypevar",
    "attachtolineinstancekeyvar",
    "allowincompleteexpensesheetlinevar",
    "defaultdescriptionvar",
    "employeepositionvar",
    "employeeelectronicmailaddressvar",
    "employeetelephonevar",
    "employeemobilephonevar",
    "employeecompanynumbervar",
    "employeecompanynamevar",
    "canseeallexpensesheetsvar",
    "usersemployeenumbervar",
    "lastjobnumbervar",
    "lastactivitynumbervar",
    "lasttasknamevar",
    "removed3var",
    "removed2var",
    "removed1var",
    "lastentrydatevar",
    "lastcurrencyvar",
    "numberoflinesvar"
})
public class Data {

    @JsonProperty("expensesheetnumber")
    private String expensesheetnumber;
    @JsonProperty("description")
    private String description;
    @JsonProperty("employeenumber")
    private String employeenumber;
    @JsonProperty("companynumber")
    private String companynumber;
    @JsonProperty("createdby")
    private String createdby;
    @JsonProperty("createddate")
    private String createddate;
    @JsonProperty("submitted")
    private Boolean submitted;
    @JsonProperty("submittedby")
    private String submittedby;
    @JsonProperty("datesubmitted")
    private String datesubmitted;
    @JsonProperty("transferred")
    private Boolean transferred;
    @JsonProperty("transferredby")
    private String transferredby;
    @JsonProperty("transferdate")
    private String transferdate;
    @JsonProperty("approved")
    private Boolean approved;
    @JsonProperty("approvedby")
    private String approvedby;
    @JsonProperty("approvaldate")
    private String approvaldate;
    @JsonProperty("fromdate")
    private String fromdate;
    @JsonProperty("todate")
    private String todate;
    @JsonProperty("remark1")
    private String remark1;
    @JsonProperty("remark2")
    private String remark2;
    @JsonProperty("remark3")
    private String remark3;
    @JsonProperty("superioremployee")
    private String superioremployee;
    @JsonProperty("secretaryemployee")
    private String secretaryemployee;
    @JsonProperty("reopened")
    private Boolean reopened;
    @JsonProperty("lineapprovalmissing")
    private Boolean lineapprovalmissing;
    @JsonProperty("fullyapproved")
    private Boolean fullyapproved;
    @JsonProperty("copyfromexpensesheetnumber")
    private String copyfromexpensesheetnumber;
    @JsonProperty("jobnumber")
    private String jobnumber;
    @JsonProperty("jobname")
    private String jobname;
    @JsonProperty("amountbase")
    private Integer amountbase;
    @JsonProperty("amountenterprise")
    private Integer amountenterprise;
    @JsonProperty("numberof")
    private Integer numberof;
    @JsonProperty("quantitya")
    private Integer quantitya;
    @JsonProperty("quantityb")
    private Integer quantityb;
    @JsonProperty("approvalnumber")
    private Integer approvalnumber;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("exchangerate")
    private Integer exchangerate;
    @JsonProperty("documentarchivenumber")
    private String documentarchivenumber;
    @JsonProperty("employeename")
    private String employeename;
    @JsonProperty("instancekey")
    private String instancekey;
    @JsonProperty("notenumber")
    private String notenumber;
    @JsonProperty("tutoremployee")
    private String tutoremployee;
    @JsonProperty("transactiontimestamp")
    private String transactiontimestamp;
    @JsonProperty("expensesheettype")
    private String expensesheettype;
    @JsonProperty("copyallfields")
    private Boolean copyallfields;
    @JsonProperty("defaulttransactiontype")
    private String defaulttransactiontype;
    @JsonProperty("expensesheettext1")
    private String expensesheettext1;
    @JsonProperty("expensesheettext2")
    private String expensesheettext2;
    @JsonProperty("expensesheettext3")
    private String expensesheettext3;
    @JsonProperty("expensesheettext4")
    private String expensesheettext4;
    @JsonProperty("expensesheettext5")
    private String expensesheettext5;
    @JsonProperty("expensesheetboolean1")
    private Boolean expensesheetboolean1;
    @JsonProperty("expensesheetboolean2")
    private Boolean expensesheetboolean2;
    @JsonProperty("expensesheetboolean3")
    private Boolean expensesheetboolean3;
    @JsonProperty("expensesheetboolean4")
    private Boolean expensesheetboolean4;
    @JsonProperty("expensesheetboolean5")
    private Boolean expensesheetboolean5;
    @JsonProperty("expensesheetdate1")
    private String expensesheetdate1;
    @JsonProperty("expensesheetdate2")
    private String expensesheetdate2;
    @JsonProperty("expensesheetdate3")
    private String expensesheetdate3;
    @JsonProperty("expensesheetdate4")
    private String expensesheetdate4;
    @JsonProperty("expensesheetdate5")
    private String expensesheetdate5;
    @JsonProperty("expensesheetpopup1")
    private String expensesheetpopup1;
    @JsonProperty("expensesheetpopup2")
    private String expensesheetpopup2;
    @JsonProperty("expensesheetpopup3")
    private String expensesheetpopup3;
    @JsonProperty("expensesheetpopup4")
    private String expensesheetpopup4;
    @JsonProperty("expensesheetpopup5")
    private String expensesheetpopup5;
    @JsonProperty("approvalgroupinstancekey")
    private String approvalgroupinstancekey;
    @JsonProperty("approveraccessinstancekey")
    private String approveraccessinstancekey;
    @JsonProperty("approvalremarkvar")
    private String approvalremarkvar;
    @JsonProperty("companyname1var")
    private String companyname1var;
    @JsonProperty("basecurrencyvar")
    private String basecurrencyvar;
    @JsonProperty("totalvatbasevar")
    private Integer totalvatbasevar;
    @JsonProperty("superioremployeenamevar")
    private String superioremployeenamevar;
    @JsonProperty("secretaryemployeenamevar")
    private String secretaryemployeenamevar;
    @JsonProperty("tutoremployeenamevar")
    private String tutoremployeenamevar;
    @JsonProperty("employeesubcontractornumbervar")
    private String employeesubcontractornumbervar;
    @JsonProperty("documentarchivedescriptionvar")
    private String documentarchivedescriptionvar;
    @JsonProperty("isproxycurrentemployeevar")
    private Boolean isproxycurrentemployeevar;
    @JsonProperty("registrationnumbervar")
    private String registrationnumbervar;
    @JsonProperty("accountnumbervar")
    private String accountnumbervar;
    @JsonProperty("vendornumbervar")
    private String vendornumbervar;
    @JsonProperty("amounttotaltovendorbasevar")
    private Integer amounttotaltovendorbasevar;
    @JsonProperty("vendorname1var")
    private String vendorname1var;
    @JsonProperty("bankvar")
    private String bankvar;
    @JsonProperty("notedescriptionvar")
    private String notedescriptionvar;
    @JsonProperty("headerapprovalrelationvar")
    private String headerapprovalrelationvar;
    @JsonProperty("headerapprovalnumbervar")
    private Integer headerapprovalnumbervar;
    @JsonProperty("headerapprovallinenumbervar")
    private Integer headerapprovallinenumbervar;
    @JsonProperty("headercurrentapprovalstatusvar")
    private String headercurrentapprovalstatusvar;
    @JsonProperty("headercurrentapprovalstatusdescriptionvar")
    private String headercurrentapprovalstatusdescriptionvar;
    @JsonProperty("headercanbeapprovedbycurrentuservar")
    private Boolean headercanbeapprovedbycurrentuservar;
    @JsonProperty("headerapprovedorrejectedbyvar")
    private String headerapprovedorrejectedbyvar;
    @JsonProperty("headerapprovaldatevar")
    private String headerapprovaldatevar;
    @JsonProperty("headerapprovaltimevar")
    private String headerapprovaltimevar;
    @JsonProperty("headerremarkvar")
    private String headerremarkvar;
    @JsonProperty("workflowstatusvar")
    private String workflowstatusvar;
    @JsonProperty("duplicatedexpensesheetnumbervar")
    private String duplicatedexpensesheetnumbervar;
    @JsonProperty("level1titlenovar")
    private String level1titlenovar;
    @JsonProperty("level2titlenovar")
    private String level2titlenovar;
    @JsonProperty("level3titlenovar")
    private String level3titlenovar;
    @JsonProperty("level4titlenovar")
    private String level4titlenovar;
    @JsonProperty("level5titlenovar")
    private String level5titlenovar;
    @JsonProperty("level1titlenamevar")
    private String level1titlenamevar;
    @JsonProperty("level2titlenamevar")
    private String level2titlenamevar;
    @JsonProperty("level3titlenamevar")
    private String level3titlenamevar;
    @JsonProperty("level4titlenamevar")
    private String level4titlenamevar;
    @JsonProperty("level5titlenamevar")
    private String level5titlenamevar;
    @JsonProperty("headercustomernumbervar")
    private String headercustomernumbervar;
    @JsonProperty("headercustomernamevar")
    private String headercustomernamevar;
    @JsonProperty("projectmanagernumbervar")
    private String projectmanagernumbervar;
    @JsonProperty("projectmanagernamevar")
    private String projectmanagernamevar;
    @JsonProperty("vendorsettlementstatusvar")
    private String vendorsettlementstatusvar;
    @JsonProperty("documentarchivelinecountvar")
    private Integer documentarchivelinecountvar;
    @JsonProperty("expensesheetheaderstatusvar")
    private String expensesheetheaderstatusvar;
    @JsonProperty("removeddocumentnamevar")
    private String removeddocumentnamevar;
    @JsonProperty("receiptnamevar")
    private String receiptnamevar;
    @JsonProperty("expenseattachmenttypevar")
    private String expenseattachmenttypevar;
    @JsonProperty("attachtolineinstancekeyvar")
    private String attachtolineinstancekeyvar;
    @JsonProperty("allowincompleteexpensesheetlinevar")
    private Boolean allowincompleteexpensesheetlinevar;
    @JsonProperty("defaultdescriptionvar")
    private String defaultdescriptionvar;
    @JsonProperty("employeepositionvar")
    private String employeepositionvar;
    @JsonProperty("employeeelectronicmailaddressvar")
    private String employeeelectronicmailaddressvar;
    @JsonProperty("employeetelephonevar")
    private String employeetelephonevar;
    @JsonProperty("employeemobilephonevar")
    private String employeemobilephonevar;
    @JsonProperty("employeecompanynumbervar")
    private String employeecompanynumbervar;
    @JsonProperty("employeecompanynamevar")
    private String employeecompanynamevar;
    @JsonProperty("canseeallexpensesheetsvar")
    private Boolean canseeallexpensesheetsvar;
    @JsonProperty("usersemployeenumbervar")
    private String usersemployeenumbervar;
    @JsonProperty("lastjobnumbervar")
    private String lastjobnumbervar;
    @JsonProperty("lastactivitynumbervar")
    private String lastactivitynumbervar;
    @JsonProperty("lasttasknamevar")
    private String lasttasknamevar;
    @JsonProperty("removed3var")
    private Integer removed3var;
    @JsonProperty("removed2var")
    private Integer removed2var;
    @JsonProperty("removed1var")
    private Integer removed1var;
    @JsonProperty("lastentrydatevar")
    private String lastentrydatevar;
    @JsonProperty("lastcurrencyvar")
    private String lastcurrencyvar;
    @JsonProperty("numberoflinesvar")
    private Integer numberoflinesvar;
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
     * @param expensesheetheaderstatusvar
     * @param employeecompanynamevar
     * @param amounttotaltovendorbasevar
     * @param employeesubcontractornumbervar
     * @param companynumber
     * @param expensesheetboolean5
     * @param expensesheetboolean2
     * @param expensesheetboolean1
     * @param expensesheetboolean4
     * @param expensesheetboolean3
     * @param totalvatbasevar
     * @param approvaldate
     * @param approved
     * @param level4titlenovar
     * @param instancekey
     * @param removed1var
     * @param employeetelephonevar
     * @param headercurrentapprovalstatusdescriptionvar
     * @param vendorname1var
     * @param expensesheetpopup5
     * @param defaultdescriptionvar
     * @param level5titlenovar
     * @param amountbase
     * @param expensesheettext5
     * @param submitted
     * @param expensesheettext4
     * @param expensesheetpopup3
     * @param secretaryemployeenamevar
     * @param jobnumber
     * @param expensesheetpopup4
     * @param expensesheetpopup1
     * @param expensesheetpopup2
     * @param allowincompleteexpensesheetlinevar
     * @param employeename
     * @param headercanbeapprovedbycurrentuservar
     * @param employeemobilephonevar
     * @param tutoremployee
     * @param createddate
     * @param headerremarkvar
     * @param employeepositionvar
     * @param copyallfields
     * @param canseeallexpensesheetsvar
     * @param usersemployeenumbervar
     * @param approvalnumber
     * @param approvalremarkvar
     * @param headercustomernumbervar
     * @param transferdate
     * @param currency
     * @param fullyapproved
     * @param documentarchivedescriptionvar
     * @param approvalgroupinstancekey
     * @param amountenterprise
     * @param companyname1var
     * @param documentarchivenumber
     * @param transferredby
     * @param superioremployeenamevar
     * @param projectmanagernumbervar
     * @param registrationnumbervar
     * @param projectmanagernamevar
     * @param lastjobnumbervar
     * @param numberof
     * @param approveraccessinstancekey
     * @param accountnumbervar
     * @param level3titlenovar
     * @param vendornumbervar
     * @param transferred
     * @param bankvar
     * @param headercurrentapprovalstatusvar
     * @param reopened
     * @param level1titlenovar
     * @param headerapprovalnumbervar
     * @param fromdate
     * @param quantitya
     * @param quantityb
     * @param todate
     * @param createdby
     * @param headercustomernamevar
     * @param receiptnamevar
     * @param jobname
     * @param lastactivitynumbervar
     * @param headerapprovedorrejectedbyvar
     * @param lastentrydatevar
     * @param approvedby
     * @param lasttasknamevar
     * @param headerapprovallinenumbervar
     * @param notedescriptionvar
     * @param vendorsettlementstatusvar
     * @param duplicatedexpensesheetnumbervar
     * @param superioremployee
     * @param workflowstatusvar
     * @param remark1
     * @param removed2var
     * @param remark3
     * @param remark2
     * @param submittedby
     * @param employeeelectronicmailaddressvar
     * @param employeenumber
     * @param lineapprovalmissing
     * @param exchangerate
     * @param headerapprovalrelationvar
     * @param attachtolineinstancekeyvar
     * @param description
     * @param notenumber
     * @param expensesheettext3
     * @param expensesheetdate1
     * @param lastcurrencyvar
     * @param expensesheettext2
     * @param expensesheetdate2
     * @param documentarchivelinecountvar
     * @param expensesheettext1
     * @param expensesheetdate3
     * @param expensesheetdate4
     * @param tutoremployeenamevar
     * @param defaulttransactiontype
     * @param numberoflinesvar
     * @param headerapprovaltimevar
     * @param transactiontimestamp
     * @param isproxycurrentemployeevar
     * @param level2titlenovar
     * @param removed3var
     * @param expenseattachmenttypevar
     * @param level2titlenamevar
     * @param level4titlenamevar
     * @param secretaryemployee
     * @param level3titlenamevar
     * @param expensesheettype
     * @param datesubmitted
     * @param level5titlenamevar
     * @param expensesheetdate5
     * @param copyfromexpensesheetnumber
     * @param expensesheetnumber
     * @param employeecompanynumbervar
     * @param basecurrencyvar
     * @param removeddocumentnamevar
     * @param headerapprovaldatevar
     * @param level1titlenamevar
     */
    public Data(String expensesheetnumber, String description, String employeenumber, String companynumber, String createdby, String createddate, Boolean submitted, String submittedby, String datesubmitted, Boolean transferred, String transferredby, String transferdate, Boolean approved, String approvedby, String approvaldate, String fromdate, String todate, String remark1, String remark2, String remark3, String superioremployee, String secretaryemployee, Boolean reopened, Boolean lineapprovalmissing, Boolean fullyapproved, String copyfromexpensesheetnumber, String jobnumber, String jobname, Integer amountbase, Integer amountenterprise, Integer numberof, Integer quantitya, Integer quantityb, Integer approvalnumber, String currency, Integer exchangerate, String documentarchivenumber, String employeename, String instancekey, String notenumber, String tutoremployee, String transactiontimestamp, String expensesheettype, Boolean copyallfields, String defaulttransactiontype, String expensesheettext1, String expensesheettext2, String expensesheettext3, String expensesheettext4, String expensesheettext5, Boolean expensesheetboolean1, Boolean expensesheetboolean2, Boolean expensesheetboolean3, Boolean expensesheetboolean4, Boolean expensesheetboolean5, String expensesheetdate1, String expensesheetdate2, String expensesheetdate3, String expensesheetdate4, String expensesheetdate5, String expensesheetpopup1, String expensesheetpopup2, String expensesheetpopup3, String expensesheetpopup4, String expensesheetpopup5, String approvalgroupinstancekey, String approveraccessinstancekey, String approvalremarkvar, String companyname1var, String basecurrencyvar, Integer totalvatbasevar, String superioremployeenamevar, String secretaryemployeenamevar, String tutoremployeenamevar, String employeesubcontractornumbervar, String documentarchivedescriptionvar, Boolean isproxycurrentemployeevar, String registrationnumbervar, String accountnumbervar, String vendornumbervar, Integer amounttotaltovendorbasevar, String vendorname1var, String bankvar, String notedescriptionvar, String headerapprovalrelationvar, Integer headerapprovalnumbervar, Integer headerapprovallinenumbervar, String headercurrentapprovalstatusvar, String headercurrentapprovalstatusdescriptionvar, Boolean headercanbeapprovedbycurrentuservar, String headerapprovedorrejectedbyvar, String headerapprovaldatevar, String headerapprovaltimevar, String headerremarkvar, String workflowstatusvar, String duplicatedexpensesheetnumbervar, String level1titlenovar, String level2titlenovar, String level3titlenovar, String level4titlenovar, String level5titlenovar, String level1titlenamevar, String level2titlenamevar, String level3titlenamevar, String level4titlenamevar, String level5titlenamevar, String headercustomernumbervar, String headercustomernamevar, String projectmanagernumbervar, String projectmanagernamevar, String vendorsettlementstatusvar, Integer documentarchivelinecountvar, String expensesheetheaderstatusvar, String removeddocumentnamevar, String receiptnamevar, String expenseattachmenttypevar, String attachtolineinstancekeyvar, Boolean allowincompleteexpensesheetlinevar, String defaultdescriptionvar, String employeepositionvar, String employeeelectronicmailaddressvar, String employeetelephonevar, String employeemobilephonevar, String employeecompanynumbervar, String employeecompanynamevar, Boolean canseeallexpensesheetsvar, String usersemployeenumbervar, String lastjobnumbervar, String lastactivitynumbervar, String lasttasknamevar, Integer removed3var, Integer removed2var, Integer removed1var, String lastentrydatevar, String lastcurrencyvar, Integer numberoflinesvar) {
        this.expensesheetnumber = expensesheetnumber;
        this.description = description;
        this.employeenumber = employeenumber;
        this.companynumber = companynumber;
        this.createdby = createdby;
        this.createddate = createddate;
        this.submitted = submitted;
        this.submittedby = submittedby;
        this.datesubmitted = datesubmitted;
        this.transferred = transferred;
        this.transferredby = transferredby;
        this.transferdate = transferdate;
        this.approved = approved;
        this.approvedby = approvedby;
        this.approvaldate = approvaldate;
        this.fromdate = fromdate;
        this.todate = todate;
        this.remark1 = remark1;
        this.remark2 = remark2;
        this.remark3 = remark3;
        this.superioremployee = superioremployee;
        this.secretaryemployee = secretaryemployee;
        this.reopened = reopened;
        this.lineapprovalmissing = lineapprovalmissing;
        this.fullyapproved = fullyapproved;
        this.copyfromexpensesheetnumber = copyfromexpensesheetnumber;
        this.jobnumber = jobnumber;
        this.jobname = jobname;
        this.amountbase = amountbase;
        this.amountenterprise = amountenterprise;
        this.numberof = numberof;
        this.quantitya = quantitya;
        this.quantityb = quantityb;
        this.approvalnumber = approvalnumber;
        this.currency = currency;
        this.exchangerate = exchangerate;
        this.documentarchivenumber = documentarchivenumber;
        this.employeename = employeename;
        this.instancekey = instancekey;
        this.notenumber = notenumber;
        this.tutoremployee = tutoremployee;
        this.transactiontimestamp = transactiontimestamp;
        this.expensesheettype = expensesheettype;
        this.copyallfields = copyallfields;
        this.defaulttransactiontype = defaulttransactiontype;
        this.expensesheettext1 = expensesheettext1;
        this.expensesheettext2 = expensesheettext2;
        this.expensesheettext3 = expensesheettext3;
        this.expensesheettext4 = expensesheettext4;
        this.expensesheettext5 = expensesheettext5;
        this.expensesheetboolean1 = expensesheetboolean1;
        this.expensesheetboolean2 = expensesheetboolean2;
        this.expensesheetboolean3 = expensesheetboolean3;
        this.expensesheetboolean4 = expensesheetboolean4;
        this.expensesheetboolean5 = expensesheetboolean5;
        this.expensesheetdate1 = expensesheetdate1;
        this.expensesheetdate2 = expensesheetdate2;
        this.expensesheetdate3 = expensesheetdate3;
        this.expensesheetdate4 = expensesheetdate4;
        this.expensesheetdate5 = expensesheetdate5;
        this.expensesheetpopup1 = expensesheetpopup1;
        this.expensesheetpopup2 = expensesheetpopup2;
        this.expensesheetpopup3 = expensesheetpopup3;
        this.expensesheetpopup4 = expensesheetpopup4;
        this.expensesheetpopup5 = expensesheetpopup5;
        this.approvalgroupinstancekey = approvalgroupinstancekey;
        this.approveraccessinstancekey = approveraccessinstancekey;
        this.approvalremarkvar = approvalremarkvar;
        this.companyname1var = companyname1var;
        this.basecurrencyvar = basecurrencyvar;
        this.totalvatbasevar = totalvatbasevar;
        this.superioremployeenamevar = superioremployeenamevar;
        this.secretaryemployeenamevar = secretaryemployeenamevar;
        this.tutoremployeenamevar = tutoremployeenamevar;
        this.employeesubcontractornumbervar = employeesubcontractornumbervar;
        this.documentarchivedescriptionvar = documentarchivedescriptionvar;
        this.isproxycurrentemployeevar = isproxycurrentemployeevar;
        this.registrationnumbervar = registrationnumbervar;
        this.accountnumbervar = accountnumbervar;
        this.vendornumbervar = vendornumbervar;
        this.amounttotaltovendorbasevar = amounttotaltovendorbasevar;
        this.vendorname1var = vendorname1var;
        this.bankvar = bankvar;
        this.notedescriptionvar = notedescriptionvar;
        this.headerapprovalrelationvar = headerapprovalrelationvar;
        this.headerapprovalnumbervar = headerapprovalnumbervar;
        this.headerapprovallinenumbervar = headerapprovallinenumbervar;
        this.headercurrentapprovalstatusvar = headercurrentapprovalstatusvar;
        this.headercurrentapprovalstatusdescriptionvar = headercurrentapprovalstatusdescriptionvar;
        this.headercanbeapprovedbycurrentuservar = headercanbeapprovedbycurrentuservar;
        this.headerapprovedorrejectedbyvar = headerapprovedorrejectedbyvar;
        this.headerapprovaldatevar = headerapprovaldatevar;
        this.headerapprovaltimevar = headerapprovaltimevar;
        this.headerremarkvar = headerremarkvar;
        this.workflowstatusvar = workflowstatusvar;
        this.duplicatedexpensesheetnumbervar = duplicatedexpensesheetnumbervar;
        this.level1titlenovar = level1titlenovar;
        this.level2titlenovar = level2titlenovar;
        this.level3titlenovar = level3titlenovar;
        this.level4titlenovar = level4titlenovar;
        this.level5titlenovar = level5titlenovar;
        this.level1titlenamevar = level1titlenamevar;
        this.level2titlenamevar = level2titlenamevar;
        this.level3titlenamevar = level3titlenamevar;
        this.level4titlenamevar = level4titlenamevar;
        this.level5titlenamevar = level5titlenamevar;
        this.headercustomernumbervar = headercustomernumbervar;
        this.headercustomernamevar = headercustomernamevar;
        this.projectmanagernumbervar = projectmanagernumbervar;
        this.projectmanagernamevar = projectmanagernamevar;
        this.vendorsettlementstatusvar = vendorsettlementstatusvar;
        this.documentarchivelinecountvar = documentarchivelinecountvar;
        this.expensesheetheaderstatusvar = expensesheetheaderstatusvar;
        this.removeddocumentnamevar = removeddocumentnamevar;
        this.receiptnamevar = receiptnamevar;
        this.expenseattachmenttypevar = expenseattachmenttypevar;
        this.attachtolineinstancekeyvar = attachtolineinstancekeyvar;
        this.allowincompleteexpensesheetlinevar = allowincompleteexpensesheetlinevar;
        this.defaultdescriptionvar = defaultdescriptionvar;
        this.employeepositionvar = employeepositionvar;
        this.employeeelectronicmailaddressvar = employeeelectronicmailaddressvar;
        this.employeetelephonevar = employeetelephonevar;
        this.employeemobilephonevar = employeemobilephonevar;
        this.employeecompanynumbervar = employeecompanynumbervar;
        this.employeecompanynamevar = employeecompanynamevar;
        this.canseeallexpensesheetsvar = canseeallexpensesheetsvar;
        this.usersemployeenumbervar = usersemployeenumbervar;
        this.lastjobnumbervar = lastjobnumbervar;
        this.lastactivitynumbervar = lastactivitynumbervar;
        this.lasttasknamevar = lasttasknamevar;
        this.removed3var = removed3var;
        this.removed2var = removed2var;
        this.removed1var = removed1var;
        this.lastentrydatevar = lastentrydatevar;
        this.lastcurrencyvar = lastcurrencyvar;
        this.numberoflinesvar = numberoflinesvar;
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
     *     The description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
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
     *     The submittedby
     */
    @JsonProperty("submittedby")
    public String getSubmittedby() {
        return submittedby;
    }

    /**
     * 
     * @param submittedby
     *     The submittedby
     */
    @JsonProperty("submittedby")
    public void setSubmittedby(String submittedby) {
        this.submittedby = submittedby;
    }

    /**
     * 
     * @return
     *     The datesubmitted
     */
    @JsonProperty("datesubmitted")
    public String getDatesubmitted() {
        return datesubmitted;
    }

    /**
     * 
     * @param datesubmitted
     *     The datesubmitted
     */
    @JsonProperty("datesubmitted")
    public void setDatesubmitted(String datesubmitted) {
        this.datesubmitted = datesubmitted;
    }

    /**
     * 
     * @return
     *     The transferred
     */
    @JsonProperty("transferred")
    public Boolean getTransferred() {
        return transferred;
    }

    /**
     * 
     * @param transferred
     *     The transferred
     */
    @JsonProperty("transferred")
    public void setTransferred(Boolean transferred) {
        this.transferred = transferred;
    }

    /**
     * 
     * @return
     *     The transferredby
     */
    @JsonProperty("transferredby")
    public String getTransferredby() {
        return transferredby;
    }

    /**
     * 
     * @param transferredby
     *     The transferredby
     */
    @JsonProperty("transferredby")
    public void setTransferredby(String transferredby) {
        this.transferredby = transferredby;
    }

    /**
     * 
     * @return
     *     The transferdate
     */
    @JsonProperty("transferdate")
    public String getTransferdate() {
        return transferdate;
    }

    /**
     * 
     * @param transferdate
     *     The transferdate
     */
    @JsonProperty("transferdate")
    public void setTransferdate(String transferdate) {
        this.transferdate = transferdate;
    }

    /**
     * 
     * @return
     *     The approved
     */
    @JsonProperty("approved")
    public Boolean getApproved() {
        return approved;
    }

    /**
     * 
     * @param approved
     *     The approved
     */
    @JsonProperty("approved")
    public void setApproved(Boolean approved) {
        this.approved = approved;
    }

    /**
     * 
     * @return
     *     The approvedby
     */
    @JsonProperty("approvedby")
    public String getApprovedby() {
        return approvedby;
    }

    /**
     * 
     * @param approvedby
     *     The approvedby
     */
    @JsonProperty("approvedby")
    public void setApprovedby(String approvedby) {
        this.approvedby = approvedby;
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
     *     The fromdate
     */
    @JsonProperty("fromdate")
    public String getFromdate() {
        return fromdate;
    }

    /**
     * 
     * @param fromdate
     *     The fromdate
     */
    @JsonProperty("fromdate")
    public void setFromdate(String fromdate) {
        this.fromdate = fromdate;
    }

    /**
     * 
     * @return
     *     The todate
     */
    @JsonProperty("todate")
    public String getTodate() {
        return todate;
    }

    /**
     * 
     * @param todate
     *     The todate
     */
    @JsonProperty("todate")
    public void setTodate(String todate) {
        this.todate = todate;
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
     *     The superioremployee
     */
    @JsonProperty("superioremployee")
    public String getSuperioremployee() {
        return superioremployee;
    }

    /**
     * 
     * @param superioremployee
     *     The superioremployee
     */
    @JsonProperty("superioremployee")
    public void setSuperioremployee(String superioremployee) {
        this.superioremployee = superioremployee;
    }

    /**
     * 
     * @return
     *     The secretaryemployee
     */
    @JsonProperty("secretaryemployee")
    public String getSecretaryemployee() {
        return secretaryemployee;
    }

    /**
     * 
     * @param secretaryemployee
     *     The secretaryemployee
     */
    @JsonProperty("secretaryemployee")
    public void setSecretaryemployee(String secretaryemployee) {
        this.secretaryemployee = secretaryemployee;
    }

    /**
     * 
     * @return
     *     The reopened
     */
    @JsonProperty("reopened")
    public Boolean getReopened() {
        return reopened;
    }

    /**
     * 
     * @param reopened
     *     The reopened
     */
    @JsonProperty("reopened")
    public void setReopened(Boolean reopened) {
        this.reopened = reopened;
    }

    /**
     * 
     * @return
     *     The lineapprovalmissing
     */
    @JsonProperty("lineapprovalmissing")
    public Boolean getLineapprovalmissing() {
        return lineapprovalmissing;
    }

    /**
     * 
     * @param lineapprovalmissing
     *     The lineapprovalmissing
     */
    @JsonProperty("lineapprovalmissing")
    public void setLineapprovalmissing(Boolean lineapprovalmissing) {
        this.lineapprovalmissing = lineapprovalmissing;
    }

    /**
     * 
     * @return
     *     The fullyapproved
     */
    @JsonProperty("fullyapproved")
    public Boolean getFullyapproved() {
        return fullyapproved;
    }

    /**
     * 
     * @param fullyapproved
     *     The fullyapproved
     */
    @JsonProperty("fullyapproved")
    public void setFullyapproved(Boolean fullyapproved) {
        this.fullyapproved = fullyapproved;
    }

    /**
     * 
     * @return
     *     The copyfromexpensesheetnumber
     */
    @JsonProperty("copyfromexpensesheetnumber")
    public String getCopyfromexpensesheetnumber() {
        return copyfromexpensesheetnumber;
    }

    /**
     * 
     * @param copyfromexpensesheetnumber
     *     The copyfromexpensesheetnumber
     */
    @JsonProperty("copyfromexpensesheetnumber")
    public void setCopyfromexpensesheetnumber(String copyfromexpensesheetnumber) {
        this.copyfromexpensesheetnumber = copyfromexpensesheetnumber;
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
     *     The jobname
     */
    @JsonProperty("jobname")
    public String getJobname() {
        return jobname;
    }

    /**
     * 
     * @param jobname
     *     The jobname
     */
    @JsonProperty("jobname")
    public void setJobname(String jobname) {
        this.jobname = jobname;
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
     *     The numberof
     */
    @JsonProperty("numberof")
    public Integer getNumberof() {
        return numberof;
    }

    /**
     * 
     * @param numberof
     *     The numberof
     */
    @JsonProperty("numberof")
    public void setNumberof(Integer numberof) {
        this.numberof = numberof;
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
     *     The approvalnumber
     */
    @JsonProperty("approvalnumber")
    public Integer getApprovalnumber() {
        return approvalnumber;
    }

    /**
     * 
     * @param approvalnumber
     *     The approvalnumber
     */
    @JsonProperty("approvalnumber")
    public void setApprovalnumber(Integer approvalnumber) {
        this.approvalnumber = approvalnumber;
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
     *     The employeename
     */
    @JsonProperty("employeename")
    public String getEmployeename() {
        return employeename;
    }

    /**
     * 
     * @param employeename
     *     The employeename
     */
    @JsonProperty("employeename")
    public void setEmployeename(String employeename) {
        this.employeename = employeename;
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
     *     The notenumber
     */
    @JsonProperty("notenumber")
    public String getNotenumber() {
        return notenumber;
    }

    /**
     * 
     * @param notenumber
     *     The notenumber
     */
    @JsonProperty("notenumber")
    public void setNotenumber(String notenumber) {
        this.notenumber = notenumber;
    }

    /**
     * 
     * @return
     *     The tutoremployee
     */
    @JsonProperty("tutoremployee")
    public String getTutoremployee() {
        return tutoremployee;
    }

    /**
     * 
     * @param tutoremployee
     *     The tutoremployee
     */
    @JsonProperty("tutoremployee")
    public void setTutoremployee(String tutoremployee) {
        this.tutoremployee = tutoremployee;
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
     *     The copyallfields
     */
    @JsonProperty("copyallfields")
    public Boolean getCopyallfields() {
        return copyallfields;
    }

    /**
     * 
     * @param copyallfields
     *     The copyallfields
     */
    @JsonProperty("copyallfields")
    public void setCopyallfields(Boolean copyallfields) {
        this.copyallfields = copyallfields;
    }

    /**
     * 
     * @return
     *     The defaulttransactiontype
     */
    @JsonProperty("defaulttransactiontype")
    public String getDefaulttransactiontype() {
        return defaulttransactiontype;
    }

    /**
     * 
     * @param defaulttransactiontype
     *     The defaulttransactiontype
     */
    @JsonProperty("defaulttransactiontype")
    public void setDefaulttransactiontype(String defaulttransactiontype) {
        this.defaulttransactiontype = defaulttransactiontype;
    }

    /**
     * 
     * @return
     *     The expensesheettext1
     */
    @JsonProperty("expensesheettext1")
    public String getExpensesheettext1() {
        return expensesheettext1;
    }

    /**
     * 
     * @param expensesheettext1
     *     The expensesheettext1
     */
    @JsonProperty("expensesheettext1")
    public void setExpensesheettext1(String expensesheettext1) {
        this.expensesheettext1 = expensesheettext1;
    }

    /**
     * 
     * @return
     *     The expensesheettext2
     */
    @JsonProperty("expensesheettext2")
    public String getExpensesheettext2() {
        return expensesheettext2;
    }

    /**
     * 
     * @param expensesheettext2
     *     The expensesheettext2
     */
    @JsonProperty("expensesheettext2")
    public void setExpensesheettext2(String expensesheettext2) {
        this.expensesheettext2 = expensesheettext2;
    }

    /**
     * 
     * @return
     *     The expensesheettext3
     */
    @JsonProperty("expensesheettext3")
    public String getExpensesheettext3() {
        return expensesheettext3;
    }

    /**
     * 
     * @param expensesheettext3
     *     The expensesheettext3
     */
    @JsonProperty("expensesheettext3")
    public void setExpensesheettext3(String expensesheettext3) {
        this.expensesheettext3 = expensesheettext3;
    }

    /**
     * 
     * @return
     *     The expensesheettext4
     */
    @JsonProperty("expensesheettext4")
    public String getExpensesheettext4() {
        return expensesheettext4;
    }

    /**
     * 
     * @param expensesheettext4
     *     The expensesheettext4
     */
    @JsonProperty("expensesheettext4")
    public void setExpensesheettext4(String expensesheettext4) {
        this.expensesheettext4 = expensesheettext4;
    }

    /**
     * 
     * @return
     *     The expensesheettext5
     */
    @JsonProperty("expensesheettext5")
    public String getExpensesheettext5() {
        return expensesheettext5;
    }

    /**
     * 
     * @param expensesheettext5
     *     The expensesheettext5
     */
    @JsonProperty("expensesheettext5")
    public void setExpensesheettext5(String expensesheettext5) {
        this.expensesheettext5 = expensesheettext5;
    }

    /**
     * 
     * @return
     *     The expensesheetboolean1
     */
    @JsonProperty("expensesheetboolean1")
    public Boolean getExpensesheetboolean1() {
        return expensesheetboolean1;
    }

    /**
     * 
     * @param expensesheetboolean1
     *     The expensesheetboolean1
     */
    @JsonProperty("expensesheetboolean1")
    public void setExpensesheetboolean1(Boolean expensesheetboolean1) {
        this.expensesheetboolean1 = expensesheetboolean1;
    }

    /**
     * 
     * @return
     *     The expensesheetboolean2
     */
    @JsonProperty("expensesheetboolean2")
    public Boolean getExpensesheetboolean2() {
        return expensesheetboolean2;
    }

    /**
     * 
     * @param expensesheetboolean2
     *     The expensesheetboolean2
     */
    @JsonProperty("expensesheetboolean2")
    public void setExpensesheetboolean2(Boolean expensesheetboolean2) {
        this.expensesheetboolean2 = expensesheetboolean2;
    }

    /**
     * 
     * @return
     *     The expensesheetboolean3
     */
    @JsonProperty("expensesheetboolean3")
    public Boolean getExpensesheetboolean3() {
        return expensesheetboolean3;
    }

    /**
     * 
     * @param expensesheetboolean3
     *     The expensesheetboolean3
     */
    @JsonProperty("expensesheetboolean3")
    public void setExpensesheetboolean3(Boolean expensesheetboolean3) {
        this.expensesheetboolean3 = expensesheetboolean3;
    }

    /**
     * 
     * @return
     *     The expensesheetboolean4
     */
    @JsonProperty("expensesheetboolean4")
    public Boolean getExpensesheetboolean4() {
        return expensesheetboolean4;
    }

    /**
     * 
     * @param expensesheetboolean4
     *     The expensesheetboolean4
     */
    @JsonProperty("expensesheetboolean4")
    public void setExpensesheetboolean4(Boolean expensesheetboolean4) {
        this.expensesheetboolean4 = expensesheetboolean4;
    }

    /**
     * 
     * @return
     *     The expensesheetboolean5
     */
    @JsonProperty("expensesheetboolean5")
    public Boolean getExpensesheetboolean5() {
        return expensesheetboolean5;
    }

    /**
     * 
     * @param expensesheetboolean5
     *     The expensesheetboolean5
     */
    @JsonProperty("expensesheetboolean5")
    public void setExpensesheetboolean5(Boolean expensesheetboolean5) {
        this.expensesheetboolean5 = expensesheetboolean5;
    }

    /**
     * 
     * @return
     *     The expensesheetdate1
     */
    @JsonProperty("expensesheetdate1")
    public String getExpensesheetdate1() {
        return expensesheetdate1;
    }

    /**
     * 
     * @param expensesheetdate1
     *     The expensesheetdate1
     */
    @JsonProperty("expensesheetdate1")
    public void setExpensesheetdate1(String expensesheetdate1) {
        this.expensesheetdate1 = expensesheetdate1;
    }

    /**
     * 
     * @return
     *     The expensesheetdate2
     */
    @JsonProperty("expensesheetdate2")
    public String getExpensesheetdate2() {
        return expensesheetdate2;
    }

    /**
     * 
     * @param expensesheetdate2
     *     The expensesheetdate2
     */
    @JsonProperty("expensesheetdate2")
    public void setExpensesheetdate2(String expensesheetdate2) {
        this.expensesheetdate2 = expensesheetdate2;
    }

    /**
     * 
     * @return
     *     The expensesheetdate3
     */
    @JsonProperty("expensesheetdate3")
    public String getExpensesheetdate3() {
        return expensesheetdate3;
    }

    /**
     * 
     * @param expensesheetdate3
     *     The expensesheetdate3
     */
    @JsonProperty("expensesheetdate3")
    public void setExpensesheetdate3(String expensesheetdate3) {
        this.expensesheetdate3 = expensesheetdate3;
    }

    /**
     * 
     * @return
     *     The expensesheetdate4
     */
    @JsonProperty("expensesheetdate4")
    public String getExpensesheetdate4() {
        return expensesheetdate4;
    }

    /**
     * 
     * @param expensesheetdate4
     *     The expensesheetdate4
     */
    @JsonProperty("expensesheetdate4")
    public void setExpensesheetdate4(String expensesheetdate4) {
        this.expensesheetdate4 = expensesheetdate4;
    }

    /**
     * 
     * @return
     *     The expensesheetdate5
     */
    @JsonProperty("expensesheetdate5")
    public String getExpensesheetdate5() {
        return expensesheetdate5;
    }

    /**
     * 
     * @param expensesheetdate5
     *     The expensesheetdate5
     */
    @JsonProperty("expensesheetdate5")
    public void setExpensesheetdate5(String expensesheetdate5) {
        this.expensesheetdate5 = expensesheetdate5;
    }

    /**
     * 
     * @return
     *     The expensesheetpopup1
     */
    @JsonProperty("expensesheetpopup1")
    public String getExpensesheetpopup1() {
        return expensesheetpopup1;
    }

    /**
     * 
     * @param expensesheetpopup1
     *     The expensesheetpopup1
     */
    @JsonProperty("expensesheetpopup1")
    public void setExpensesheetpopup1(String expensesheetpopup1) {
        this.expensesheetpopup1 = expensesheetpopup1;
    }

    /**
     * 
     * @return
     *     The expensesheetpopup2
     */
    @JsonProperty("expensesheetpopup2")
    public String getExpensesheetpopup2() {
        return expensesheetpopup2;
    }

    /**
     * 
     * @param expensesheetpopup2
     *     The expensesheetpopup2
     */
    @JsonProperty("expensesheetpopup2")
    public void setExpensesheetpopup2(String expensesheetpopup2) {
        this.expensesheetpopup2 = expensesheetpopup2;
    }

    /**
     * 
     * @return
     *     The expensesheetpopup3
     */
    @JsonProperty("expensesheetpopup3")
    public String getExpensesheetpopup3() {
        return expensesheetpopup3;
    }

    /**
     * 
     * @param expensesheetpopup3
     *     The expensesheetpopup3
     */
    @JsonProperty("expensesheetpopup3")
    public void setExpensesheetpopup3(String expensesheetpopup3) {
        this.expensesheetpopup3 = expensesheetpopup3;
    }

    /**
     * 
     * @return
     *     The expensesheetpopup4
     */
    @JsonProperty("expensesheetpopup4")
    public String getExpensesheetpopup4() {
        return expensesheetpopup4;
    }

    /**
     * 
     * @param expensesheetpopup4
     *     The expensesheetpopup4
     */
    @JsonProperty("expensesheetpopup4")
    public void setExpensesheetpopup4(String expensesheetpopup4) {
        this.expensesheetpopup4 = expensesheetpopup4;
    }

    /**
     * 
     * @return
     *     The expensesheetpopup5
     */
    @JsonProperty("expensesheetpopup5")
    public String getExpensesheetpopup5() {
        return expensesheetpopup5;
    }

    /**
     * 
     * @param expensesheetpopup5
     *     The expensesheetpopup5
     */
    @JsonProperty("expensesheetpopup5")
    public void setExpensesheetpopup5(String expensesheetpopup5) {
        this.expensesheetpopup5 = expensesheetpopup5;
    }

    /**
     * 
     * @return
     *     The approvalgroupinstancekey
     */
    @JsonProperty("approvalgroupinstancekey")
    public String getApprovalgroupinstancekey() {
        return approvalgroupinstancekey;
    }

    /**
     * 
     * @param approvalgroupinstancekey
     *     The approvalgroupinstancekey
     */
    @JsonProperty("approvalgroupinstancekey")
    public void setApprovalgroupinstancekey(String approvalgroupinstancekey) {
        this.approvalgroupinstancekey = approvalgroupinstancekey;
    }

    /**
     * 
     * @return
     *     The approveraccessinstancekey
     */
    @JsonProperty("approveraccessinstancekey")
    public String getApproveraccessinstancekey() {
        return approveraccessinstancekey;
    }

    /**
     * 
     * @param approveraccessinstancekey
     *     The approveraccessinstancekey
     */
    @JsonProperty("approveraccessinstancekey")
    public void setApproveraccessinstancekey(String approveraccessinstancekey) {
        this.approveraccessinstancekey = approveraccessinstancekey;
    }

    /**
     * 
     * @return
     *     The approvalremarkvar
     */
    @JsonProperty("approvalremarkvar")
    public String getApprovalremarkvar() {
        return approvalremarkvar;
    }

    /**
     * 
     * @param approvalremarkvar
     *     The approvalremarkvar
     */
    @JsonProperty("approvalremarkvar")
    public void setApprovalremarkvar(String approvalremarkvar) {
        this.approvalremarkvar = approvalremarkvar;
    }

    /**
     * 
     * @return
     *     The companyname1var
     */
    @JsonProperty("companyname1var")
    public String getCompanyname1var() {
        return companyname1var;
    }

    /**
     * 
     * @param companyname1var
     *     The companyname1var
     */
    @JsonProperty("companyname1var")
    public void setCompanyname1var(String companyname1var) {
        this.companyname1var = companyname1var;
    }

    /**
     * 
     * @return
     *     The basecurrencyvar
     */
    @JsonProperty("basecurrencyvar")
    public String getBasecurrencyvar() {
        return basecurrencyvar;
    }

    /**
     * 
     * @param basecurrencyvar
     *     The basecurrencyvar
     */
    @JsonProperty("basecurrencyvar")
    public void setBasecurrencyvar(String basecurrencyvar) {
        this.basecurrencyvar = basecurrencyvar;
    }

    /**
     * 
     * @return
     *     The totalvatbasevar
     */
    @JsonProperty("totalvatbasevar")
    public Integer getTotalvatbasevar() {
        return totalvatbasevar;
    }

    /**
     * 
     * @param totalvatbasevar
     *     The totalvatbasevar
     */
    @JsonProperty("totalvatbasevar")
    public void setTotalvatbasevar(Integer totalvatbasevar) {
        this.totalvatbasevar = totalvatbasevar;
    }

    /**
     * 
     * @return
     *     The superioremployeenamevar
     */
    @JsonProperty("superioremployeenamevar")
    public String getSuperioremployeenamevar() {
        return superioremployeenamevar;
    }

    /**
     * 
     * @param superioremployeenamevar
     *     The superioremployeenamevar
     */
    @JsonProperty("superioremployeenamevar")
    public void setSuperioremployeenamevar(String superioremployeenamevar) {
        this.superioremployeenamevar = superioremployeenamevar;
    }

    /**
     * 
     * @return
     *     The secretaryemployeenamevar
     */
    @JsonProperty("secretaryemployeenamevar")
    public String getSecretaryemployeenamevar() {
        return secretaryemployeenamevar;
    }

    /**
     * 
     * @param secretaryemployeenamevar
     *     The secretaryemployeenamevar
     */
    @JsonProperty("secretaryemployeenamevar")
    public void setSecretaryemployeenamevar(String secretaryemployeenamevar) {
        this.secretaryemployeenamevar = secretaryemployeenamevar;
    }

    /**
     * 
     * @return
     *     The tutoremployeenamevar
     */
    @JsonProperty("tutoremployeenamevar")
    public String getTutoremployeenamevar() {
        return tutoremployeenamevar;
    }

    /**
     * 
     * @param tutoremployeenamevar
     *     The tutoremployeenamevar
     */
    @JsonProperty("tutoremployeenamevar")
    public void setTutoremployeenamevar(String tutoremployeenamevar) {
        this.tutoremployeenamevar = tutoremployeenamevar;
    }

    /**
     * 
     * @return
     *     The employeesubcontractornumbervar
     */
    @JsonProperty("employeesubcontractornumbervar")
    public String getEmployeesubcontractornumbervar() {
        return employeesubcontractornumbervar;
    }

    /**
     * 
     * @param employeesubcontractornumbervar
     *     The employeesubcontractornumbervar
     */
    @JsonProperty("employeesubcontractornumbervar")
    public void setEmployeesubcontractornumbervar(String employeesubcontractornumbervar) {
        this.employeesubcontractornumbervar = employeesubcontractornumbervar;
    }

    /**
     * 
     * @return
     *     The documentarchivedescriptionvar
     */
    @JsonProperty("documentarchivedescriptionvar")
    public String getDocumentarchivedescriptionvar() {
        return documentarchivedescriptionvar;
    }

    /**
     * 
     * @param documentarchivedescriptionvar
     *     The documentarchivedescriptionvar
     */
    @JsonProperty("documentarchivedescriptionvar")
    public void setDocumentarchivedescriptionvar(String documentarchivedescriptionvar) {
        this.documentarchivedescriptionvar = documentarchivedescriptionvar;
    }

    /**
     * 
     * @return
     *     The isproxycurrentemployeevar
     */
    @JsonProperty("isproxycurrentemployeevar")
    public Boolean getIsproxycurrentemployeevar() {
        return isproxycurrentemployeevar;
    }

    /**
     * 
     * @param isproxycurrentemployeevar
     *     The isproxycurrentemployeevar
     */
    @JsonProperty("isproxycurrentemployeevar")
    public void setIsproxycurrentemployeevar(Boolean isproxycurrentemployeevar) {
        this.isproxycurrentemployeevar = isproxycurrentemployeevar;
    }

    /**
     * 
     * @return
     *     The registrationnumbervar
     */
    @JsonProperty("registrationnumbervar")
    public String getRegistrationnumbervar() {
        return registrationnumbervar;
    }

    /**
     * 
     * @param registrationnumbervar
     *     The registrationnumbervar
     */
    @JsonProperty("registrationnumbervar")
    public void setRegistrationnumbervar(String registrationnumbervar) {
        this.registrationnumbervar = registrationnumbervar;
    }

    /**
     * 
     * @return
     *     The accountnumbervar
     */
    @JsonProperty("accountnumbervar")
    public String getAccountnumbervar() {
        return accountnumbervar;
    }

    /**
     * 
     * @param accountnumbervar
     *     The accountnumbervar
     */
    @JsonProperty("accountnumbervar")
    public void setAccountnumbervar(String accountnumbervar) {
        this.accountnumbervar = accountnumbervar;
    }

    /**
     * 
     * @return
     *     The vendornumbervar
     */
    @JsonProperty("vendornumbervar")
    public String getVendornumbervar() {
        return vendornumbervar;
    }

    /**
     * 
     * @param vendornumbervar
     *     The vendornumbervar
     */
    @JsonProperty("vendornumbervar")
    public void setVendornumbervar(String vendornumbervar) {
        this.vendornumbervar = vendornumbervar;
    }

    /**
     * 
     * @return
     *     The amounttotaltovendorbasevar
     */
    @JsonProperty("amounttotaltovendorbasevar")
    public Integer getAmounttotaltovendorbasevar() {
        return amounttotaltovendorbasevar;
    }

    /**
     * 
     * @param amounttotaltovendorbasevar
     *     The amounttotaltovendorbasevar
     */
    @JsonProperty("amounttotaltovendorbasevar")
    public void setAmounttotaltovendorbasevar(Integer amounttotaltovendorbasevar) {
        this.amounttotaltovendorbasevar = amounttotaltovendorbasevar;
    }

    /**
     * 
     * @return
     *     The vendorname1var
     */
    @JsonProperty("vendorname1var")
    public String getVendorname1var() {
        return vendorname1var;
    }

    /**
     * 
     * @param vendorname1var
     *     The vendorname1var
     */
    @JsonProperty("vendorname1var")
    public void setVendorname1var(String vendorname1var) {
        this.vendorname1var = vendorname1var;
    }

    /**
     * 
     * @return
     *     The bankvar
     */
    @JsonProperty("bankvar")
    public String getBankvar() {
        return bankvar;
    }

    /**
     * 
     * @param bankvar
     *     The bankvar
     */
    @JsonProperty("bankvar")
    public void setBankvar(String bankvar) {
        this.bankvar = bankvar;
    }

    /**
     * 
     * @return
     *     The notedescriptionvar
     */
    @JsonProperty("notedescriptionvar")
    public String getNotedescriptionvar() {
        return notedescriptionvar;
    }

    /**
     * 
     * @param notedescriptionvar
     *     The notedescriptionvar
     */
    @JsonProperty("notedescriptionvar")
    public void setNotedescriptionvar(String notedescriptionvar) {
        this.notedescriptionvar = notedescriptionvar;
    }

    /**
     * 
     * @return
     *     The headerapprovalrelationvar
     */
    @JsonProperty("headerapprovalrelationvar")
    public String getHeaderapprovalrelationvar() {
        return headerapprovalrelationvar;
    }

    /**
     * 
     * @param headerapprovalrelationvar
     *     The headerapprovalrelationvar
     */
    @JsonProperty("headerapprovalrelationvar")
    public void setHeaderapprovalrelationvar(String headerapprovalrelationvar) {
        this.headerapprovalrelationvar = headerapprovalrelationvar;
    }

    /**
     * 
     * @return
     *     The headerapprovalnumbervar
     */
    @JsonProperty("headerapprovalnumbervar")
    public Integer getHeaderapprovalnumbervar() {
        return headerapprovalnumbervar;
    }

    /**
     * 
     * @param headerapprovalnumbervar
     *     The headerapprovalnumbervar
     */
    @JsonProperty("headerapprovalnumbervar")
    public void setHeaderapprovalnumbervar(Integer headerapprovalnumbervar) {
        this.headerapprovalnumbervar = headerapprovalnumbervar;
    }

    /**
     * 
     * @return
     *     The headerapprovallinenumbervar
     */
    @JsonProperty("headerapprovallinenumbervar")
    public Integer getHeaderapprovallinenumbervar() {
        return headerapprovallinenumbervar;
    }

    /**
     * 
     * @param headerapprovallinenumbervar
     *     The headerapprovallinenumbervar
     */
    @JsonProperty("headerapprovallinenumbervar")
    public void setHeaderapprovallinenumbervar(Integer headerapprovallinenumbervar) {
        this.headerapprovallinenumbervar = headerapprovallinenumbervar;
    }

    /**
     * 
     * @return
     *     The headercurrentapprovalstatusvar
     */
    @JsonProperty("headercurrentapprovalstatusvar")
    public String getHeadercurrentapprovalstatusvar() {
        return headercurrentapprovalstatusvar;
    }

    /**
     * 
     * @param headercurrentapprovalstatusvar
     *     The headercurrentapprovalstatusvar
     */
    @JsonProperty("headercurrentapprovalstatusvar")
    public void setHeadercurrentapprovalstatusvar(String headercurrentapprovalstatusvar) {
        this.headercurrentapprovalstatusvar = headercurrentapprovalstatusvar;
    }

    /**
     * 
     * @return
     *     The headercurrentapprovalstatusdescriptionvar
     */
    @JsonProperty("headercurrentapprovalstatusdescriptionvar")
    public String getHeadercurrentapprovalstatusdescriptionvar() {
        return headercurrentapprovalstatusdescriptionvar;
    }

    /**
     * 
     * @param headercurrentapprovalstatusdescriptionvar
     *     The headercurrentapprovalstatusdescriptionvar
     */
    @JsonProperty("headercurrentapprovalstatusdescriptionvar")
    public void setHeadercurrentapprovalstatusdescriptionvar(String headercurrentapprovalstatusdescriptionvar) {
        this.headercurrentapprovalstatusdescriptionvar = headercurrentapprovalstatusdescriptionvar;
    }

    /**
     * 
     * @return
     *     The headercanbeapprovedbycurrentuservar
     */
    @JsonProperty("headercanbeapprovedbycurrentuservar")
    public Boolean getHeadercanbeapprovedbycurrentuservar() {
        return headercanbeapprovedbycurrentuservar;
    }

    /**
     * 
     * @param headercanbeapprovedbycurrentuservar
     *     The headercanbeapprovedbycurrentuservar
     */
    @JsonProperty("headercanbeapprovedbycurrentuservar")
    public void setHeadercanbeapprovedbycurrentuservar(Boolean headercanbeapprovedbycurrentuservar) {
        this.headercanbeapprovedbycurrentuservar = headercanbeapprovedbycurrentuservar;
    }

    /**
     * 
     * @return
     *     The headerapprovedorrejectedbyvar
     */
    @JsonProperty("headerapprovedorrejectedbyvar")
    public String getHeaderapprovedorrejectedbyvar() {
        return headerapprovedorrejectedbyvar;
    }

    /**
     * 
     * @param headerapprovedorrejectedbyvar
     *     The headerapprovedorrejectedbyvar
     */
    @JsonProperty("headerapprovedorrejectedbyvar")
    public void setHeaderapprovedorrejectedbyvar(String headerapprovedorrejectedbyvar) {
        this.headerapprovedorrejectedbyvar = headerapprovedorrejectedbyvar;
    }

    /**
     * 
     * @return
     *     The headerapprovaldatevar
     */
    @JsonProperty("headerapprovaldatevar")
    public String getHeaderapprovaldatevar() {
        return headerapprovaldatevar;
    }

    /**
     * 
     * @param headerapprovaldatevar
     *     The headerapprovaldatevar
     */
    @JsonProperty("headerapprovaldatevar")
    public void setHeaderapprovaldatevar(String headerapprovaldatevar) {
        this.headerapprovaldatevar = headerapprovaldatevar;
    }

    /**
     * 
     * @return
     *     The headerapprovaltimevar
     */
    @JsonProperty("headerapprovaltimevar")
    public String getHeaderapprovaltimevar() {
        return headerapprovaltimevar;
    }

    /**
     * 
     * @param headerapprovaltimevar
     *     The headerapprovaltimevar
     */
    @JsonProperty("headerapprovaltimevar")
    public void setHeaderapprovaltimevar(String headerapprovaltimevar) {
        this.headerapprovaltimevar = headerapprovaltimevar;
    }

    /**
     * 
     * @return
     *     The headerremarkvar
     */
    @JsonProperty("headerremarkvar")
    public String getHeaderremarkvar() {
        return headerremarkvar;
    }

    /**
     * 
     * @param headerremarkvar
     *     The headerremarkvar
     */
    @JsonProperty("headerremarkvar")
    public void setHeaderremarkvar(String headerremarkvar) {
        this.headerremarkvar = headerremarkvar;
    }

    /**
     * 
     * @return
     *     The workflowstatusvar
     */
    @JsonProperty("workflowstatusvar")
    public String getWorkflowstatusvar() {
        return workflowstatusvar;
    }

    /**
     * 
     * @param workflowstatusvar
     *     The workflowstatusvar
     */
    @JsonProperty("workflowstatusvar")
    public void setWorkflowstatusvar(String workflowstatusvar) {
        this.workflowstatusvar = workflowstatusvar;
    }

    /**
     * 
     * @return
     *     The duplicatedexpensesheetnumbervar
     */
    @JsonProperty("duplicatedexpensesheetnumbervar")
    public String getDuplicatedexpensesheetnumbervar() {
        return duplicatedexpensesheetnumbervar;
    }

    /**
     * 
     * @param duplicatedexpensesheetnumbervar
     *     The duplicatedexpensesheetnumbervar
     */
    @JsonProperty("duplicatedexpensesheetnumbervar")
    public void setDuplicatedexpensesheetnumbervar(String duplicatedexpensesheetnumbervar) {
        this.duplicatedexpensesheetnumbervar = duplicatedexpensesheetnumbervar;
    }

    /**
     * 
     * @return
     *     The level1titlenovar
     */
    @JsonProperty("level1titlenovar")
    public String getLevel1titlenovar() {
        return level1titlenovar;
    }

    /**
     * 
     * @param level1titlenovar
     *     The level1titlenovar
     */
    @JsonProperty("level1titlenovar")
    public void setLevel1titlenovar(String level1titlenovar) {
        this.level1titlenovar = level1titlenovar;
    }

    /**
     * 
     * @return
     *     The level2titlenovar
     */
    @JsonProperty("level2titlenovar")
    public String getLevel2titlenovar() {
        return level2titlenovar;
    }

    /**
     * 
     * @param level2titlenovar
     *     The level2titlenovar
     */
    @JsonProperty("level2titlenovar")
    public void setLevel2titlenovar(String level2titlenovar) {
        this.level2titlenovar = level2titlenovar;
    }

    /**
     * 
     * @return
     *     The level3titlenovar
     */
    @JsonProperty("level3titlenovar")
    public String getLevel3titlenovar() {
        return level3titlenovar;
    }

    /**
     * 
     * @param level3titlenovar
     *     The level3titlenovar
     */
    @JsonProperty("level3titlenovar")
    public void setLevel3titlenovar(String level3titlenovar) {
        this.level3titlenovar = level3titlenovar;
    }

    /**
     * 
     * @return
     *     The level4titlenovar
     */
    @JsonProperty("level4titlenovar")
    public String getLevel4titlenovar() {
        return level4titlenovar;
    }

    /**
     * 
     * @param level4titlenovar
     *     The level4titlenovar
     */
    @JsonProperty("level4titlenovar")
    public void setLevel4titlenovar(String level4titlenovar) {
        this.level4titlenovar = level4titlenovar;
    }

    /**
     * 
     * @return
     *     The level5titlenovar
     */
    @JsonProperty("level5titlenovar")
    public String getLevel5titlenovar() {
        return level5titlenovar;
    }

    /**
     * 
     * @param level5titlenovar
     *     The level5titlenovar
     */
    @JsonProperty("level5titlenovar")
    public void setLevel5titlenovar(String level5titlenovar) {
        this.level5titlenovar = level5titlenovar;
    }

    /**
     * 
     * @return
     *     The level1titlenamevar
     */
    @JsonProperty("level1titlenamevar")
    public String getLevel1titlenamevar() {
        return level1titlenamevar;
    }

    /**
     * 
     * @param level1titlenamevar
     *     The level1titlenamevar
     */
    @JsonProperty("level1titlenamevar")
    public void setLevel1titlenamevar(String level1titlenamevar) {
        this.level1titlenamevar = level1titlenamevar;
    }

    /**
     * 
     * @return
     *     The level2titlenamevar
     */
    @JsonProperty("level2titlenamevar")
    public String getLevel2titlenamevar() {
        return level2titlenamevar;
    }

    /**
     * 
     * @param level2titlenamevar
     *     The level2titlenamevar
     */
    @JsonProperty("level2titlenamevar")
    public void setLevel2titlenamevar(String level2titlenamevar) {
        this.level2titlenamevar = level2titlenamevar;
    }

    /**
     * 
     * @return
     *     The level3titlenamevar
     */
    @JsonProperty("level3titlenamevar")
    public String getLevel3titlenamevar() {
        return level3titlenamevar;
    }

    /**
     * 
     * @param level3titlenamevar
     *     The level3titlenamevar
     */
    @JsonProperty("level3titlenamevar")
    public void setLevel3titlenamevar(String level3titlenamevar) {
        this.level3titlenamevar = level3titlenamevar;
    }

    /**
     * 
     * @return
     *     The level4titlenamevar
     */
    @JsonProperty("level4titlenamevar")
    public String getLevel4titlenamevar() {
        return level4titlenamevar;
    }

    /**
     * 
     * @param level4titlenamevar
     *     The level4titlenamevar
     */
    @JsonProperty("level4titlenamevar")
    public void setLevel4titlenamevar(String level4titlenamevar) {
        this.level4titlenamevar = level4titlenamevar;
    }

    /**
     * 
     * @return
     *     The level5titlenamevar
     */
    @JsonProperty("level5titlenamevar")
    public String getLevel5titlenamevar() {
        return level5titlenamevar;
    }

    /**
     * 
     * @param level5titlenamevar
     *     The level5titlenamevar
     */
    @JsonProperty("level5titlenamevar")
    public void setLevel5titlenamevar(String level5titlenamevar) {
        this.level5titlenamevar = level5titlenamevar;
    }

    /**
     * 
     * @return
     *     The headercustomernumbervar
     */
    @JsonProperty("headercustomernumbervar")
    public String getHeadercustomernumbervar() {
        return headercustomernumbervar;
    }

    /**
     * 
     * @param headercustomernumbervar
     *     The headercustomernumbervar
     */
    @JsonProperty("headercustomernumbervar")
    public void setHeadercustomernumbervar(String headercustomernumbervar) {
        this.headercustomernumbervar = headercustomernumbervar;
    }

    /**
     * 
     * @return
     *     The headercustomernamevar
     */
    @JsonProperty("headercustomernamevar")
    public String getHeadercustomernamevar() {
        return headercustomernamevar;
    }

    /**
     * 
     * @param headercustomernamevar
     *     The headercustomernamevar
     */
    @JsonProperty("headercustomernamevar")
    public void setHeadercustomernamevar(String headercustomernamevar) {
        this.headercustomernamevar = headercustomernamevar;
    }

    /**
     * 
     * @return
     *     The projectmanagernumbervar
     */
    @JsonProperty("projectmanagernumbervar")
    public String getProjectmanagernumbervar() {
        return projectmanagernumbervar;
    }

    /**
     * 
     * @param projectmanagernumbervar
     *     The projectmanagernumbervar
     */
    @JsonProperty("projectmanagernumbervar")
    public void setProjectmanagernumbervar(String projectmanagernumbervar) {
        this.projectmanagernumbervar = projectmanagernumbervar;
    }

    /**
     * 
     * @return
     *     The projectmanagernamevar
     */
    @JsonProperty("projectmanagernamevar")
    public String getProjectmanagernamevar() {
        return projectmanagernamevar;
    }

    /**
     * 
     * @param projectmanagernamevar
     *     The projectmanagernamevar
     */
    @JsonProperty("projectmanagernamevar")
    public void setProjectmanagernamevar(String projectmanagernamevar) {
        this.projectmanagernamevar = projectmanagernamevar;
    }

    /**
     * 
     * @return
     *     The vendorsettlementstatusvar
     */
    @JsonProperty("vendorsettlementstatusvar")
    public String getVendorsettlementstatusvar() {
        return vendorsettlementstatusvar;
    }

    /**
     * 
     * @param vendorsettlementstatusvar
     *     The vendorsettlementstatusvar
     */
    @JsonProperty("vendorsettlementstatusvar")
    public void setVendorsettlementstatusvar(String vendorsettlementstatusvar) {
        this.vendorsettlementstatusvar = vendorsettlementstatusvar;
    }

    /**
     * 
     * @return
     *     The documentarchivelinecountvar
     */
    @JsonProperty("documentarchivelinecountvar")
    public Integer getDocumentarchivelinecountvar() {
        return documentarchivelinecountvar;
    }

    /**
     * 
     * @param documentarchivelinecountvar
     *     The documentarchivelinecountvar
     */
    @JsonProperty("documentarchivelinecountvar")
    public void setDocumentarchivelinecountvar(Integer documentarchivelinecountvar) {
        this.documentarchivelinecountvar = documentarchivelinecountvar;
    }

    /**
     * 
     * @return
     *     The expensesheetheaderstatusvar
     */
    @JsonProperty("expensesheetheaderstatusvar")
    public String getExpensesheetheaderstatusvar() {
        return expensesheetheaderstatusvar;
    }

    /**
     * 
     * @param expensesheetheaderstatusvar
     *     The expensesheetheaderstatusvar
     */
    @JsonProperty("expensesheetheaderstatusvar")
    public void setExpensesheetheaderstatusvar(String expensesheetheaderstatusvar) {
        this.expensesheetheaderstatusvar = expensesheetheaderstatusvar;
    }

    /**
     * 
     * @return
     *     The removeddocumentnamevar
     */
    @JsonProperty("removeddocumentnamevar")
    public String getRemoveddocumentnamevar() {
        return removeddocumentnamevar;
    }

    /**
     * 
     * @param removeddocumentnamevar
     *     The removeddocumentnamevar
     */
    @JsonProperty("removeddocumentnamevar")
    public void setRemoveddocumentnamevar(String removeddocumentnamevar) {
        this.removeddocumentnamevar = removeddocumentnamevar;
    }

    /**
     * 
     * @return
     *     The receiptnamevar
     */
    @JsonProperty("receiptnamevar")
    public String getReceiptnamevar() {
        return receiptnamevar;
    }

    /**
     * 
     * @param receiptnamevar
     *     The receiptnamevar
     */
    @JsonProperty("receiptnamevar")
    public void setReceiptnamevar(String receiptnamevar) {
        this.receiptnamevar = receiptnamevar;
    }

    /**
     * 
     * @return
     *     The expenseattachmenttypevar
     */
    @JsonProperty("expenseattachmenttypevar")
    public String getExpenseattachmenttypevar() {
        return expenseattachmenttypevar;
    }

    /**
     * 
     * @param expenseattachmenttypevar
     *     The expenseattachmenttypevar
     */
    @JsonProperty("expenseattachmenttypevar")
    public void setExpenseattachmenttypevar(String expenseattachmenttypevar) {
        this.expenseattachmenttypevar = expenseattachmenttypevar;
    }

    /**
     * 
     * @return
     *     The attachtolineinstancekeyvar
     */
    @JsonProperty("attachtolineinstancekeyvar")
    public String getAttachtolineinstancekeyvar() {
        return attachtolineinstancekeyvar;
    }

    /**
     * 
     * @param attachtolineinstancekeyvar
     *     The attachtolineinstancekeyvar
     */
    @JsonProperty("attachtolineinstancekeyvar")
    public void setAttachtolineinstancekeyvar(String attachtolineinstancekeyvar) {
        this.attachtolineinstancekeyvar = attachtolineinstancekeyvar;
    }

    /**
     * 
     * @return
     *     The allowincompleteexpensesheetlinevar
     */
    @JsonProperty("allowincompleteexpensesheetlinevar")
    public Boolean getAllowincompleteexpensesheetlinevar() {
        return allowincompleteexpensesheetlinevar;
    }

    /**
     * 
     * @param allowincompleteexpensesheetlinevar
     *     The allowincompleteexpensesheetlinevar
     */
    @JsonProperty("allowincompleteexpensesheetlinevar")
    public void setAllowincompleteexpensesheetlinevar(Boolean allowincompleteexpensesheetlinevar) {
        this.allowincompleteexpensesheetlinevar = allowincompleteexpensesheetlinevar;
    }

    /**
     * 
     * @return
     *     The defaultdescriptionvar
     */
    @JsonProperty("defaultdescriptionvar")
    public String getDefaultdescriptionvar() {
        return defaultdescriptionvar;
    }

    /**
     * 
     * @param defaultdescriptionvar
     *     The defaultdescriptionvar
     */
    @JsonProperty("defaultdescriptionvar")
    public void setDefaultdescriptionvar(String defaultdescriptionvar) {
        this.defaultdescriptionvar = defaultdescriptionvar;
    }

    /**
     * 
     * @return
     *     The employeepositionvar
     */
    @JsonProperty("employeepositionvar")
    public String getEmployeepositionvar() {
        return employeepositionvar;
    }

    /**
     * 
     * @param employeepositionvar
     *     The employeepositionvar
     */
    @JsonProperty("employeepositionvar")
    public void setEmployeepositionvar(String employeepositionvar) {
        this.employeepositionvar = employeepositionvar;
    }

    /**
     * 
     * @return
     *     The employeeelectronicmailaddressvar
     */
    @JsonProperty("employeeelectronicmailaddressvar")
    public String getEmployeeelectronicmailaddressvar() {
        return employeeelectronicmailaddressvar;
    }

    /**
     * 
     * @param employeeelectronicmailaddressvar
     *     The employeeelectronicmailaddressvar
     */
    @JsonProperty("employeeelectronicmailaddressvar")
    public void setEmployeeelectronicmailaddressvar(String employeeelectronicmailaddressvar) {
        this.employeeelectronicmailaddressvar = employeeelectronicmailaddressvar;
    }

    /**
     * 
     * @return
     *     The employeetelephonevar
     */
    @JsonProperty("employeetelephonevar")
    public String getEmployeetelephonevar() {
        return employeetelephonevar;
    }

    /**
     * 
     * @param employeetelephonevar
     *     The employeetelephonevar
     */
    @JsonProperty("employeetelephonevar")
    public void setEmployeetelephonevar(String employeetelephonevar) {
        this.employeetelephonevar = employeetelephonevar;
    }

    /**
     * 
     * @return
     *     The employeemobilephonevar
     */
    @JsonProperty("employeemobilephonevar")
    public String getEmployeemobilephonevar() {
        return employeemobilephonevar;
    }

    /**
     * 
     * @param employeemobilephonevar
     *     The employeemobilephonevar
     */
    @JsonProperty("employeemobilephonevar")
    public void setEmployeemobilephonevar(String employeemobilephonevar) {
        this.employeemobilephonevar = employeemobilephonevar;
    }

    /**
     * 
     * @return
     *     The employeecompanynumbervar
     */
    @JsonProperty("employeecompanynumbervar")
    public String getEmployeecompanynumbervar() {
        return employeecompanynumbervar;
    }

    /**
     * 
     * @param employeecompanynumbervar
     *     The employeecompanynumbervar
     */
    @JsonProperty("employeecompanynumbervar")
    public void setEmployeecompanynumbervar(String employeecompanynumbervar) {
        this.employeecompanynumbervar = employeecompanynumbervar;
    }

    /**
     * 
     * @return
     *     The employeecompanynamevar
     */
    @JsonProperty("employeecompanynamevar")
    public String getEmployeecompanynamevar() {
        return employeecompanynamevar;
    }

    /**
     * 
     * @param employeecompanynamevar
     *     The employeecompanynamevar
     */
    @JsonProperty("employeecompanynamevar")
    public void setEmployeecompanynamevar(String employeecompanynamevar) {
        this.employeecompanynamevar = employeecompanynamevar;
    }

    /**
     * 
     * @return
     *     The canseeallexpensesheetsvar
     */
    @JsonProperty("canseeallexpensesheetsvar")
    public Boolean getCanseeallexpensesheetsvar() {
        return canseeallexpensesheetsvar;
    }

    /**
     * 
     * @param canseeallexpensesheetsvar
     *     The canseeallexpensesheetsvar
     */
    @JsonProperty("canseeallexpensesheetsvar")
    public void setCanseeallexpensesheetsvar(Boolean canseeallexpensesheetsvar) {
        this.canseeallexpensesheetsvar = canseeallexpensesheetsvar;
    }

    /**
     * 
     * @return
     *     The usersemployeenumbervar
     */
    @JsonProperty("usersemployeenumbervar")
    public String getUsersemployeenumbervar() {
        return usersemployeenumbervar;
    }

    /**
     * 
     * @param usersemployeenumbervar
     *     The usersemployeenumbervar
     */
    @JsonProperty("usersemployeenumbervar")
    public void setUsersemployeenumbervar(String usersemployeenumbervar) {
        this.usersemployeenumbervar = usersemployeenumbervar;
    }

    /**
     * 
     * @return
     *     The lastjobnumbervar
     */
    @JsonProperty("lastjobnumbervar")
    public String getLastjobnumbervar() {
        return lastjobnumbervar;
    }

    /**
     * 
     * @param lastjobnumbervar
     *     The lastjobnumbervar
     */
    @JsonProperty("lastjobnumbervar")
    public void setLastjobnumbervar(String lastjobnumbervar) {
        this.lastjobnumbervar = lastjobnumbervar;
    }

    /**
     * 
     * @return
     *     The lastactivitynumbervar
     */
    @JsonProperty("lastactivitynumbervar")
    public String getLastactivitynumbervar() {
        return lastactivitynumbervar;
    }

    /**
     * 
     * @param lastactivitynumbervar
     *     The lastactivitynumbervar
     */
    @JsonProperty("lastactivitynumbervar")
    public void setLastactivitynumbervar(String lastactivitynumbervar) {
        this.lastactivitynumbervar = lastactivitynumbervar;
    }

    /**
     * 
     * @return
     *     The lasttasknamevar
     */
    @JsonProperty("lasttasknamevar")
    public String getLasttasknamevar() {
        return lasttasknamevar;
    }

    /**
     * 
     * @param lasttasknamevar
     *     The lasttasknamevar
     */
    @JsonProperty("lasttasknamevar")
    public void setLasttasknamevar(String lasttasknamevar) {
        this.lasttasknamevar = lasttasknamevar;
    }

    /**
     * 
     * @return
     *     The removed3var
     */
    @JsonProperty("removed3var")
    public Integer getRemoved3var() {
        return removed3var;
    }

    /**
     * 
     * @param removed3var
     *     The removed3var
     */
    @JsonProperty("removed3var")
    public void setRemoved3var(Integer removed3var) {
        this.removed3var = removed3var;
    }

    /**
     * 
     * @return
     *     The removed2var
     */
    @JsonProperty("removed2var")
    public Integer getRemoved2var() {
        return removed2var;
    }

    /**
     * 
     * @param removed2var
     *     The removed2var
     */
    @JsonProperty("removed2var")
    public void setRemoved2var(Integer removed2var) {
        this.removed2var = removed2var;
    }

    /**
     * 
     * @return
     *     The removed1var
     */
    @JsonProperty("removed1var")
    public Integer getRemoved1var() {
        return removed1var;
    }

    /**
     * 
     * @param removed1var
     *     The removed1var
     */
    @JsonProperty("removed1var")
    public void setRemoved1var(Integer removed1var) {
        this.removed1var = removed1var;
    }

    /**
     * 
     * @return
     *     The lastentrydatevar
     */
    @JsonProperty("lastentrydatevar")
    public String getLastentrydatevar() {
        return lastentrydatevar;
    }

    /**
     * 
     * @param lastentrydatevar
     *     The lastentrydatevar
     */
    @JsonProperty("lastentrydatevar")
    public void setLastentrydatevar(String lastentrydatevar) {
        this.lastentrydatevar = lastentrydatevar;
    }

    /**
     * 
     * @return
     *     The lastcurrencyvar
     */
    @JsonProperty("lastcurrencyvar")
    public String getLastcurrencyvar() {
        return lastcurrencyvar;
    }

    /**
     * 
     * @param lastcurrencyvar
     *     The lastcurrencyvar
     */
    @JsonProperty("lastcurrencyvar")
    public void setLastcurrencyvar(String lastcurrencyvar) {
        this.lastcurrencyvar = lastcurrencyvar;
    }

    /**
     * 
     * @return
     *     The numberoflinesvar
     */
    @JsonProperty("numberoflinesvar")
    public Integer getNumberoflinesvar() {
        return numberoflinesvar;
    }

    /**
     * 
     * @param numberoflinesvar
     *     The numberoflinesvar
     */
    @JsonProperty("numberoflinesvar")
    public void setNumberoflinesvar(Integer numberoflinesvar) {
        this.numberoflinesvar = numberoflinesvar;
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
        return new HashCodeBuilder().append(expensesheetnumber).append(description).append(employeenumber).append(companynumber).append(createdby).append(createddate).append(submitted).append(submittedby).append(datesubmitted).append(transferred).append(transferredby).append(transferdate).append(approved).append(approvedby).append(approvaldate).append(fromdate).append(todate).append(remark1).append(remark2).append(remark3).append(superioremployee).append(secretaryemployee).append(reopened).append(lineapprovalmissing).append(fullyapproved).append(copyfromexpensesheetnumber).append(jobnumber).append(jobname).append(amountbase).append(amountenterprise).append(numberof).append(quantitya).append(quantityb).append(approvalnumber).append(currency).append(exchangerate).append(documentarchivenumber).append(employeename).append(instancekey).append(notenumber).append(tutoremployee).append(transactiontimestamp).append(expensesheettype).append(copyallfields).append(defaulttransactiontype).append(expensesheettext1).append(expensesheettext2).append(expensesheettext3).append(expensesheettext4).append(expensesheettext5).append(expensesheetboolean1).append(expensesheetboolean2).append(expensesheetboolean3).append(expensesheetboolean4).append(expensesheetboolean5).append(expensesheetdate1).append(expensesheetdate2).append(expensesheetdate3).append(expensesheetdate4).append(expensesheetdate5).append(expensesheetpopup1).append(expensesheetpopup2).append(expensesheetpopup3).append(expensesheetpopup4).append(expensesheetpopup5).append(approvalgroupinstancekey).append(approveraccessinstancekey).append(approvalremarkvar).append(companyname1var).append(basecurrencyvar).append(totalvatbasevar).append(superioremployeenamevar).append(secretaryemployeenamevar).append(tutoremployeenamevar).append(employeesubcontractornumbervar).append(documentarchivedescriptionvar).append(isproxycurrentemployeevar).append(registrationnumbervar).append(accountnumbervar).append(vendornumbervar).append(amounttotaltovendorbasevar).append(vendorname1var).append(bankvar).append(notedescriptionvar).append(headerapprovalrelationvar).append(headerapprovalnumbervar).append(headerapprovallinenumbervar).append(headercurrentapprovalstatusvar).append(headercurrentapprovalstatusdescriptionvar).append(headercanbeapprovedbycurrentuservar).append(headerapprovedorrejectedbyvar).append(headerapprovaldatevar).append(headerapprovaltimevar).append(headerremarkvar).append(workflowstatusvar).append(duplicatedexpensesheetnumbervar).append(level1titlenovar).append(level2titlenovar).append(level3titlenovar).append(level4titlenovar).append(level5titlenovar).append(level1titlenamevar).append(level2titlenamevar).append(level3titlenamevar).append(level4titlenamevar).append(level5titlenamevar).append(headercustomernumbervar).append(headercustomernamevar).append(projectmanagernumbervar).append(projectmanagernamevar).append(vendorsettlementstatusvar).append(documentarchivelinecountvar).append(expensesheetheaderstatusvar).append(removeddocumentnamevar).append(receiptnamevar).append(expenseattachmenttypevar).append(attachtolineinstancekeyvar).append(allowincompleteexpensesheetlinevar).append(defaultdescriptionvar).append(employeepositionvar).append(employeeelectronicmailaddressvar).append(employeetelephonevar).append(employeemobilephonevar).append(employeecompanynumbervar).append(employeecompanynamevar).append(canseeallexpensesheetsvar).append(usersemployeenumbervar).append(lastjobnumbervar).append(lastactivitynumbervar).append(lasttasknamevar).append(removed3var).append(removed2var).append(removed1var).append(lastentrydatevar).append(lastcurrencyvar).append(numberoflinesvar).append(additionalProperties).toHashCode();
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
        return new EqualsBuilder().append(expensesheetnumber, rhs.expensesheetnumber).append(description, rhs.description).append(employeenumber, rhs.employeenumber).append(companynumber, rhs.companynumber).append(createdby, rhs.createdby).append(createddate, rhs.createddate).append(submitted, rhs.submitted).append(submittedby, rhs.submittedby).append(datesubmitted, rhs.datesubmitted).append(transferred, rhs.transferred).append(transferredby, rhs.transferredby).append(transferdate, rhs.transferdate).append(approved, rhs.approved).append(approvedby, rhs.approvedby).append(approvaldate, rhs.approvaldate).append(fromdate, rhs.fromdate).append(todate, rhs.todate).append(remark1, rhs.remark1).append(remark2, rhs.remark2).append(remark3, rhs.remark3).append(superioremployee, rhs.superioremployee).append(secretaryemployee, rhs.secretaryemployee).append(reopened, rhs.reopened).append(lineapprovalmissing, rhs.lineapprovalmissing).append(fullyapproved, rhs.fullyapproved).append(copyfromexpensesheetnumber, rhs.copyfromexpensesheetnumber).append(jobnumber, rhs.jobnumber).append(jobname, rhs.jobname).append(amountbase, rhs.amountbase).append(amountenterprise, rhs.amountenterprise).append(numberof, rhs.numberof).append(quantitya, rhs.quantitya).append(quantityb, rhs.quantityb).append(approvalnumber, rhs.approvalnumber).append(currency, rhs.currency).append(exchangerate, rhs.exchangerate).append(documentarchivenumber, rhs.documentarchivenumber).append(employeename, rhs.employeename).append(instancekey, rhs.instancekey).append(notenumber, rhs.notenumber).append(tutoremployee, rhs.tutoremployee).append(transactiontimestamp, rhs.transactiontimestamp).append(expensesheettype, rhs.expensesheettype).append(copyallfields, rhs.copyallfields).append(defaulttransactiontype, rhs.defaulttransactiontype).append(expensesheettext1, rhs.expensesheettext1).append(expensesheettext2, rhs.expensesheettext2).append(expensesheettext3, rhs.expensesheettext3).append(expensesheettext4, rhs.expensesheettext4).append(expensesheettext5, rhs.expensesheettext5).append(expensesheetboolean1, rhs.expensesheetboolean1).append(expensesheetboolean2, rhs.expensesheetboolean2).append(expensesheetboolean3, rhs.expensesheetboolean3).append(expensesheetboolean4, rhs.expensesheetboolean4).append(expensesheetboolean5, rhs.expensesheetboolean5).append(expensesheetdate1, rhs.expensesheetdate1).append(expensesheetdate2, rhs.expensesheetdate2).append(expensesheetdate3, rhs.expensesheetdate3).append(expensesheetdate4, rhs.expensesheetdate4).append(expensesheetdate5, rhs.expensesheetdate5).append(expensesheetpopup1, rhs.expensesheetpopup1).append(expensesheetpopup2, rhs.expensesheetpopup2).append(expensesheetpopup3, rhs.expensesheetpopup3).append(expensesheetpopup4, rhs.expensesheetpopup4).append(expensesheetpopup5, rhs.expensesheetpopup5).append(approvalgroupinstancekey, rhs.approvalgroupinstancekey).append(approveraccessinstancekey, rhs.approveraccessinstancekey).append(approvalremarkvar, rhs.approvalremarkvar).append(companyname1var, rhs.companyname1var).append(basecurrencyvar, rhs.basecurrencyvar).append(totalvatbasevar, rhs.totalvatbasevar).append(superioremployeenamevar, rhs.superioremployeenamevar).append(secretaryemployeenamevar, rhs.secretaryemployeenamevar).append(tutoremployeenamevar, rhs.tutoremployeenamevar).append(employeesubcontractornumbervar, rhs.employeesubcontractornumbervar).append(documentarchivedescriptionvar, rhs.documentarchivedescriptionvar).append(isproxycurrentemployeevar, rhs.isproxycurrentemployeevar).append(registrationnumbervar, rhs.registrationnumbervar).append(accountnumbervar, rhs.accountnumbervar).append(vendornumbervar, rhs.vendornumbervar).append(amounttotaltovendorbasevar, rhs.amounttotaltovendorbasevar).append(vendorname1var, rhs.vendorname1var).append(bankvar, rhs.bankvar).append(notedescriptionvar, rhs.notedescriptionvar).append(headerapprovalrelationvar, rhs.headerapprovalrelationvar).append(headerapprovalnumbervar, rhs.headerapprovalnumbervar).append(headerapprovallinenumbervar, rhs.headerapprovallinenumbervar).append(headercurrentapprovalstatusvar, rhs.headercurrentapprovalstatusvar).append(headercurrentapprovalstatusdescriptionvar, rhs.headercurrentapprovalstatusdescriptionvar).append(headercanbeapprovedbycurrentuservar, rhs.headercanbeapprovedbycurrentuservar).append(headerapprovedorrejectedbyvar, rhs.headerapprovedorrejectedbyvar).append(headerapprovaldatevar, rhs.headerapprovaldatevar).append(headerapprovaltimevar, rhs.headerapprovaltimevar).append(headerremarkvar, rhs.headerremarkvar).append(workflowstatusvar, rhs.workflowstatusvar).append(duplicatedexpensesheetnumbervar, rhs.duplicatedexpensesheetnumbervar).append(level1titlenovar, rhs.level1titlenovar).append(level2titlenovar, rhs.level2titlenovar).append(level3titlenovar, rhs.level3titlenovar).append(level4titlenovar, rhs.level4titlenovar).append(level5titlenovar, rhs.level5titlenovar).append(level1titlenamevar, rhs.level1titlenamevar).append(level2titlenamevar, rhs.level2titlenamevar).append(level3titlenamevar, rhs.level3titlenamevar).append(level4titlenamevar, rhs.level4titlenamevar).append(level5titlenamevar, rhs.level5titlenamevar).append(headercustomernumbervar, rhs.headercustomernumbervar).append(headercustomernamevar, rhs.headercustomernamevar).append(projectmanagernumbervar, rhs.projectmanagernumbervar).append(projectmanagernamevar, rhs.projectmanagernamevar).append(vendorsettlementstatusvar, rhs.vendorsettlementstatusvar).append(documentarchivelinecountvar, rhs.documentarchivelinecountvar).append(expensesheetheaderstatusvar, rhs.expensesheetheaderstatusvar).append(removeddocumentnamevar, rhs.removeddocumentnamevar).append(receiptnamevar, rhs.receiptnamevar).append(expenseattachmenttypevar, rhs.expenseattachmenttypevar).append(attachtolineinstancekeyvar, rhs.attachtolineinstancekeyvar).append(allowincompleteexpensesheetlinevar, rhs.allowincompleteexpensesheetlinevar).append(defaultdescriptionvar, rhs.defaultdescriptionvar).append(employeepositionvar, rhs.employeepositionvar).append(employeeelectronicmailaddressvar, rhs.employeeelectronicmailaddressvar).append(employeetelephonevar, rhs.employeetelephonevar).append(employeemobilephonevar, rhs.employeemobilephonevar).append(employeecompanynumbervar, rhs.employeecompanynumbervar).append(employeecompanynamevar, rhs.employeecompanynamevar).append(canseeallexpensesheetsvar, rhs.canseeallexpensesheetsvar).append(usersemployeenumbervar, rhs.usersemployeenumbervar).append(lastjobnumbervar, rhs.lastjobnumbervar).append(lastactivitynumbervar, rhs.lastactivitynumbervar).append(lasttasknamevar, rhs.lasttasknamevar).append(removed3var, rhs.removed3var).append(removed2var, rhs.removed2var).append(removed1var, rhs.removed1var).append(lastentrydatevar, rhs.lastentrydatevar).append(lastcurrencyvar, rhs.lastcurrencyvar).append(numberoflinesvar, rhs.numberoflinesvar).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
