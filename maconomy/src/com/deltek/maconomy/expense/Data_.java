
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
    "approvalremarkvar",
    "companyname1var",
    "basecurrencyvar",
    "totalvatbasevar",
    "superioremployeenamevar",
    "secretaryemployeenamevar",
    "tutoremployeenamevar",
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
    "vendorsettlementstatusvar",
    "documentarchivelinecountvar",
    "expensesheetheaderstatusvar",
    "removeddocumentnamevar",
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
public class Data_ {

    @JsonProperty("expensesheetnumber")
    private Integer expensesheetnumber;
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
    private Integer copyfromexpensesheetnumber;
    @JsonProperty("jobnumber")
    private String jobnumber;
    @JsonProperty("jobname")
    private String jobname;
    @JsonProperty("amountbase")
    private Integer amountbase;
    @JsonProperty("amountenterprise")
    private Integer amountenterprise;
    @JsonProperty("numberof")
    private Double numberof;
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
    @JsonProperty("duplicatedexpensesheetnumbervar")
    private Integer duplicatedexpensesheetnumbervar;
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
    @JsonProperty("vendorsettlementstatusvar")
    private String vendorsettlementstatusvar;
    @JsonProperty("documentarchivelinecountvar")
    private Integer documentarchivelinecountvar;
    @JsonProperty("expensesheetheaderstatusvar")
    private String expensesheetheaderstatusvar;
    @JsonProperty("removeddocumentnamevar")
    private String removeddocumentnamevar;
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
    public Data_() {
    }

    /**
     * 
     * @param fullyapproved
     * @param headercurrentapprovalstatusdescriptionvar
     * @param expensesheettext4
     * @param expensesheettext5
     * @param vendornumbervar
     * @param exchangerate
     * @param approved
     * @param amountenterprise
     * @param employeenumber
     * @param basecurrencyvar
     * @param datesubmitted
     * @param transferdate
     * @param submitted
     * @param expensesheetpopup5
     * @param createddate
     * @param documentarchivelinecountvar
     * @param expensesheetpopup4
     * @param expensesheetpopup3
     * @param expensesheetpopup2
     * @param expensesheetpopup1
     * @param transactiontimestamp
     * @param superioremployee
     * @param headerapprovaltimevar
     * @param submittedby
     * @param instancekey
     * @param usersemployeenumbervar
     * @param approvaldate
     * @param currency
     * @param reopened
     * @param expensesheetheaderstatusvar
     * @param headerapprovalnumbervar
     * @param quantityb
     * @param quantitya
     * @param level3titlenamevar
     * @param amounttotaltovendorbasevar
     * @param registrationnumbervar
     * @param headerapprovedorrejectedbyvar
     * @param tutoremployee
     * @param vendorsettlementstatusvar
     * @param documentarchivenumber
     * @param notedescriptionvar
     * @param employeename
     * @param approvalnumber
     * @param companyname1var
     * @param headerremarkvar
     * @param lastactivitynumbervar
     * @param secretaryemployee
     * @param headercanbeapprovedbycurrentuservar
     * @param lastcurrencyvar
     * @param totalvatbasevar
     * @param transferred
     * @param expensesheetboolean5
     * @param expensesheetboolean3
     * @param copyfromexpensesheetnumber
     * @param expensesheetboolean4
     * @param transferredby
     * @param expensesheetboolean1
     * @param expensesheetboolean2
     * @param secretaryemployeenamevar
     * @param jobname
     * @param removeddocumentnamevar
     * @param approvalgroupinstancekey
     * @param remark1
     * @param remark3
     * @param remark2
     * @param accountnumbervar
     * @param level1titlenovar
     * @param removed2var
     * @param level3titlenovar
     * @param vendorname1var
     * @param level1titlenamevar
     * @param description
     * @param expensesheetnumber
     * @param companynumber
     * @param createdby
     * @param headerapprovalrelationvar
     * @param superioremployeenamevar
     * @param notenumber
     * @param amountbase
     * @param expensesheetdate3
     * @param expensesheetdate4
     * @param expensesheetdate1
     * @param numberoflinesvar
     * @param expensesheetdate2
     * @param headercurrentapprovalstatusvar
     * @param todate
     * @param lastentrydatevar
     * @param numberof
     * @param approvedby
     * @param copyallfields
     * @param lineapprovalmissing
     * @param removed3var
     * @param level2titlenovar
     * @param expensesheettype
     * @param fromdate
     * @param canseeallexpensesheetsvar
     * @param bankvar
     * @param duplicatedexpensesheetnumbervar
     * @param tutoremployeenamevar
     * @param headerapprovaldatevar
     * @param isproxycurrentemployeevar
     * @param expensesheettext2
     * @param level4titlenovar
     * @param expensesheettext3
     * @param expensesheettext1
     * @param level4titlenamevar
     * @param level2titlenamevar
     * @param removed1var
     * @param lastjobnumbervar
     * @param defaulttransactiontype
     * @param jobnumber
     * @param level5titlenamevar
     * @param lasttasknamevar
     * @param level5titlenovar
     * @param documentarchivedescriptionvar
     * @param approvalremarkvar
     * @param headerapprovallinenumbervar
     * @param expensesheetdate5
     */
    public Data_(Integer expensesheetnumber, String description, String employeenumber, String companynumber, String createdby, String createddate, Boolean submitted, String submittedby, String datesubmitted, Boolean transferred, String transferredby, String transferdate, Boolean approved, String approvedby, String approvaldate, String fromdate, String todate, String remark1, String remark2, String remark3, String superioremployee, String secretaryemployee, Boolean reopened, Boolean lineapprovalmissing, Boolean fullyapproved, Integer copyfromexpensesheetnumber, String jobnumber, String jobname, Integer amountbase, Integer amountenterprise, Double numberof, Integer quantitya, Integer quantityb, Integer approvalnumber, String currency, Integer exchangerate, String documentarchivenumber, String employeename, String instancekey, String notenumber, String tutoremployee, String transactiontimestamp, String expensesheettype, Boolean copyallfields, String defaulttransactiontype, String expensesheettext1, String expensesheettext2, String expensesheettext3, String expensesheettext4, String expensesheettext5, Boolean expensesheetboolean1, Boolean expensesheetboolean2, Boolean expensesheetboolean3, Boolean expensesheetboolean4, Boolean expensesheetboolean5, String expensesheetdate1, String expensesheetdate2, String expensesheetdate3, String expensesheetdate4, String expensesheetdate5, String expensesheetpopup1, String expensesheetpopup2, String expensesheetpopup3, String expensesheetpopup4, String expensesheetpopup5, String approvalgroupinstancekey, String approvalremarkvar, String companyname1var, String basecurrencyvar, Integer totalvatbasevar, String superioremployeenamevar, String secretaryemployeenamevar, String tutoremployeenamevar, String documentarchivedescriptionvar, Boolean isproxycurrentemployeevar, String registrationnumbervar, String accountnumbervar, String vendornumbervar, Integer amounttotaltovendorbasevar, String vendorname1var, String bankvar, String notedescriptionvar, String headerapprovalrelationvar, Integer headerapprovalnumbervar, Integer headerapprovallinenumbervar, String headercurrentapprovalstatusvar, String headercurrentapprovalstatusdescriptionvar, Boolean headercanbeapprovedbycurrentuservar, String headerapprovedorrejectedbyvar, String headerapprovaldatevar, String headerapprovaltimevar, String headerremarkvar, Integer duplicatedexpensesheetnumbervar, String level1titlenovar, String level2titlenovar, String level3titlenovar, String level4titlenovar, String level5titlenovar, String level1titlenamevar, String level2titlenamevar, String level3titlenamevar, String level4titlenamevar, String level5titlenamevar, String vendorsettlementstatusvar, Integer documentarchivelinecountvar, String expensesheetheaderstatusvar, String removeddocumentnamevar, Boolean canseeallexpensesheetsvar, String usersemployeenumbervar, String lastjobnumbervar, String lastactivitynumbervar, String lasttasknamevar, Integer removed3var, Integer removed2var, Integer removed1var, String lastentrydatevar, String lastcurrencyvar, Integer numberoflinesvar) {
        super();
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
        this.approvalremarkvar = approvalremarkvar;
        this.companyname1var = companyname1var;
        this.basecurrencyvar = basecurrencyvar;
        this.totalvatbasevar = totalvatbasevar;
        this.superioremployeenamevar = superioremployeenamevar;
        this.secretaryemployeenamevar = secretaryemployeenamevar;
        this.tutoremployeenamevar = tutoremployeenamevar;
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
        this.vendorsettlementstatusvar = vendorsettlementstatusvar;
        this.documentarchivelinecountvar = documentarchivelinecountvar;
        this.expensesheetheaderstatusvar = expensesheetheaderstatusvar;
        this.removeddocumentnamevar = removeddocumentnamevar;
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

    @JsonProperty("expensesheetnumber")
    public Integer getExpensesheetnumber() {
        return expensesheetnumber;
    }

    @JsonProperty("expensesheetnumber")
    public void setExpensesheetnumber(Integer expensesheetnumber) {
        this.expensesheetnumber = expensesheetnumber;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("employeenumber")
    public String getEmployeenumber() {
        return employeenumber;
    }

    @JsonProperty("employeenumber")
    public void setEmployeenumber(String employeenumber) {
        this.employeenumber = employeenumber;
    }

    @JsonProperty("companynumber")
    public String getCompanynumber() {
        return companynumber;
    }

    @JsonProperty("companynumber")
    public void setCompanynumber(String companynumber) {
        this.companynumber = companynumber;
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

    @JsonProperty("submitted")
    public Boolean getSubmitted() {
        return submitted;
    }

    @JsonProperty("submitted")
    public void setSubmitted(Boolean submitted) {
        this.submitted = submitted;
    }

    @JsonProperty("submittedby")
    public String getSubmittedby() {
        return submittedby;
    }

    @JsonProperty("submittedby")
    public void setSubmittedby(String submittedby) {
        this.submittedby = submittedby;
    }

    @JsonProperty("datesubmitted")
    public String getDatesubmitted() {
        return datesubmitted;
    }

    @JsonProperty("datesubmitted")
    public void setDatesubmitted(String datesubmitted) {
        this.datesubmitted = datesubmitted;
    }

    @JsonProperty("transferred")
    public Boolean getTransferred() {
        return transferred;
    }

    @JsonProperty("transferred")
    public void setTransferred(Boolean transferred) {
        this.transferred = transferred;
    }

    @JsonProperty("transferredby")
    public String getTransferredby() {
        return transferredby;
    }

    @JsonProperty("transferredby")
    public void setTransferredby(String transferredby) {
        this.transferredby = transferredby;
    }

    @JsonProperty("transferdate")
    public String getTransferdate() {
        return transferdate;
    }

    @JsonProperty("transferdate")
    public void setTransferdate(String transferdate) {
        this.transferdate = transferdate;
    }

    @JsonProperty("approved")
    public Boolean getApproved() {
        return approved;
    }

    @JsonProperty("approved")
    public void setApproved(Boolean approved) {
        this.approved = approved;
    }

    @JsonProperty("approvedby")
    public String getApprovedby() {
        return approvedby;
    }

    @JsonProperty("approvedby")
    public void setApprovedby(String approvedby) {
        this.approvedby = approvedby;
    }

    @JsonProperty("approvaldate")
    public String getApprovaldate() {
        return approvaldate;
    }

    @JsonProperty("approvaldate")
    public void setApprovaldate(String approvaldate) {
        this.approvaldate = approvaldate;
    }

    @JsonProperty("fromdate")
    public String getFromdate() {
        return fromdate;
    }

    @JsonProperty("fromdate")
    public void setFromdate(String fromdate) {
        this.fromdate = fromdate;
    }

    @JsonProperty("todate")
    public String getTodate() {
        return todate;
    }

    @JsonProperty("todate")
    public void setTodate(String todate) {
        this.todate = todate;
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

    @JsonProperty("superioremployee")
    public String getSuperioremployee() {
        return superioremployee;
    }

    @JsonProperty("superioremployee")
    public void setSuperioremployee(String superioremployee) {
        this.superioremployee = superioremployee;
    }

    @JsonProperty("secretaryemployee")
    public String getSecretaryemployee() {
        return secretaryemployee;
    }

    @JsonProperty("secretaryemployee")
    public void setSecretaryemployee(String secretaryemployee) {
        this.secretaryemployee = secretaryemployee;
    }

    @JsonProperty("reopened")
    public Boolean getReopened() {
        return reopened;
    }

    @JsonProperty("reopened")
    public void setReopened(Boolean reopened) {
        this.reopened = reopened;
    }

    @JsonProperty("lineapprovalmissing")
    public Boolean getLineapprovalmissing() {
        return lineapprovalmissing;
    }

    @JsonProperty("lineapprovalmissing")
    public void setLineapprovalmissing(Boolean lineapprovalmissing) {
        this.lineapprovalmissing = lineapprovalmissing;
    }

    @JsonProperty("fullyapproved")
    public Boolean getFullyapproved() {
        return fullyapproved;
    }

    @JsonProperty("fullyapproved")
    public void setFullyapproved(Boolean fullyapproved) {
        this.fullyapproved = fullyapproved;
    }

    @JsonProperty("copyfromexpensesheetnumber")
    public Integer getCopyfromexpensesheetnumber() {
        return copyfromexpensesheetnumber;
    }

    @JsonProperty("copyfromexpensesheetnumber")
    public void setCopyfromexpensesheetnumber(Integer copyfromexpensesheetnumber) {
        this.copyfromexpensesheetnumber = copyfromexpensesheetnumber;
    }

    @JsonProperty("jobnumber")
    public String getJobnumber() {
        return jobnumber;
    }

    @JsonProperty("jobnumber")
    public void setJobnumber(String jobnumber) {
        this.jobnumber = jobnumber;
    }

    @JsonProperty("jobname")
    public String getJobname() {
        return jobname;
    }

    @JsonProperty("jobname")
    public void setJobname(String jobname) {
        this.jobname = jobname;
    }

    @JsonProperty("amountbase")
    public Integer getAmountbase() {
        return amountbase;
    }

    @JsonProperty("amountbase")
    public void setAmountbase(Integer amountbase) {
        this.amountbase = amountbase;
    }

    @JsonProperty("amountenterprise")
    public Integer getAmountenterprise() {
        return amountenterprise;
    }

    @JsonProperty("amountenterprise")
    public void setAmountenterprise(Integer amountenterprise) {
        this.amountenterprise = amountenterprise;
    }

    @JsonProperty("numberof")
    public Double getNumberof() {
        return numberof;
    }

    @JsonProperty("numberof")
    public void setNumberof(Double numberof) {
        this.numberof = numberof;
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

    @JsonProperty("approvalnumber")
    public Integer getApprovalnumber() {
        return approvalnumber;
    }

    @JsonProperty("approvalnumber")
    public void setApprovalnumber(Integer approvalnumber) {
        this.approvalnumber = approvalnumber;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("exchangerate")
    public Integer getExchangerate() {
        return exchangerate;
    }

    @JsonProperty("exchangerate")
    public void setExchangerate(Integer exchangerate) {
        this.exchangerate = exchangerate;
    }

    @JsonProperty("documentarchivenumber")
    public String getDocumentarchivenumber() {
        return documentarchivenumber;
    }

    @JsonProperty("documentarchivenumber")
    public void setDocumentarchivenumber(String documentarchivenumber) {
        this.documentarchivenumber = documentarchivenumber;
    }

    @JsonProperty("employeename")
    public String getEmployeename() {
        return employeename;
    }

    @JsonProperty("employeename")
    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    @JsonProperty("instancekey")
    public String getInstancekey() {
        return instancekey;
    }

    @JsonProperty("instancekey")
    public void setInstancekey(String instancekey) {
        this.instancekey = instancekey;
    }

    @JsonProperty("notenumber")
    public String getNotenumber() {
        return notenumber;
    }

    @JsonProperty("notenumber")
    public void setNotenumber(String notenumber) {
        this.notenumber = notenumber;
    }

    @JsonProperty("tutoremployee")
    public String getTutoremployee() {
        return tutoremployee;
    }

    @JsonProperty("tutoremployee")
    public void setTutoremployee(String tutoremployee) {
        this.tutoremployee = tutoremployee;
    }

    @JsonProperty("transactiontimestamp")
    public String getTransactiontimestamp() {
        return transactiontimestamp;
    }

    @JsonProperty("transactiontimestamp")
    public void setTransactiontimestamp(String transactiontimestamp) {
        this.transactiontimestamp = transactiontimestamp;
    }

    @JsonProperty("expensesheettype")
    public String getExpensesheettype() {
        return expensesheettype;
    }

    @JsonProperty("expensesheettype")
    public void setExpensesheettype(String expensesheettype) {
        this.expensesheettype = expensesheettype;
    }

    @JsonProperty("copyallfields")
    public Boolean getCopyallfields() {
        return copyallfields;
    }

    @JsonProperty("copyallfields")
    public void setCopyallfields(Boolean copyallfields) {
        this.copyallfields = copyallfields;
    }

    @JsonProperty("defaulttransactiontype")
    public String getDefaulttransactiontype() {
        return defaulttransactiontype;
    }

    @JsonProperty("defaulttransactiontype")
    public void setDefaulttransactiontype(String defaulttransactiontype) {
        this.defaulttransactiontype = defaulttransactiontype;
    }

    @JsonProperty("expensesheettext1")
    public String getExpensesheettext1() {
        return expensesheettext1;
    }

    @JsonProperty("expensesheettext1")
    public void setExpensesheettext1(String expensesheettext1) {
        this.expensesheettext1 = expensesheettext1;
    }

    @JsonProperty("expensesheettext2")
    public String getExpensesheettext2() {
        return expensesheettext2;
    }

    @JsonProperty("expensesheettext2")
    public void setExpensesheettext2(String expensesheettext2) {
        this.expensesheettext2 = expensesheettext2;
    }

    @JsonProperty("expensesheettext3")
    public String getExpensesheettext3() {
        return expensesheettext3;
    }

    @JsonProperty("expensesheettext3")
    public void setExpensesheettext3(String expensesheettext3) {
        this.expensesheettext3 = expensesheettext3;
    }

    @JsonProperty("expensesheettext4")
    public String getExpensesheettext4() {
        return expensesheettext4;
    }

    @JsonProperty("expensesheettext4")
    public void setExpensesheettext4(String expensesheettext4) {
        this.expensesheettext4 = expensesheettext4;
    }

    @JsonProperty("expensesheettext5")
    public String getExpensesheettext5() {
        return expensesheettext5;
    }

    @JsonProperty("expensesheettext5")
    public void setExpensesheettext5(String expensesheettext5) {
        this.expensesheettext5 = expensesheettext5;
    }

    @JsonProperty("expensesheetboolean1")
    public Boolean getExpensesheetboolean1() {
        return expensesheetboolean1;
    }

    @JsonProperty("expensesheetboolean1")
    public void setExpensesheetboolean1(Boolean expensesheetboolean1) {
        this.expensesheetboolean1 = expensesheetboolean1;
    }

    @JsonProperty("expensesheetboolean2")
    public Boolean getExpensesheetboolean2() {
        return expensesheetboolean2;
    }

    @JsonProperty("expensesheetboolean2")
    public void setExpensesheetboolean2(Boolean expensesheetboolean2) {
        this.expensesheetboolean2 = expensesheetboolean2;
    }

    @JsonProperty("expensesheetboolean3")
    public Boolean getExpensesheetboolean3() {
        return expensesheetboolean3;
    }

    @JsonProperty("expensesheetboolean3")
    public void setExpensesheetboolean3(Boolean expensesheetboolean3) {
        this.expensesheetboolean3 = expensesheetboolean3;
    }

    @JsonProperty("expensesheetboolean4")
    public Boolean getExpensesheetboolean4() {
        return expensesheetboolean4;
    }

    @JsonProperty("expensesheetboolean4")
    public void setExpensesheetboolean4(Boolean expensesheetboolean4) {
        this.expensesheetboolean4 = expensesheetboolean4;
    }

    @JsonProperty("expensesheetboolean5")
    public Boolean getExpensesheetboolean5() {
        return expensesheetboolean5;
    }

    @JsonProperty("expensesheetboolean5")
    public void setExpensesheetboolean5(Boolean expensesheetboolean5) {
        this.expensesheetboolean5 = expensesheetboolean5;
    }

    @JsonProperty("expensesheetdate1")
    public String getExpensesheetdate1() {
        return expensesheetdate1;
    }

    @JsonProperty("expensesheetdate1")
    public void setExpensesheetdate1(String expensesheetdate1) {
        this.expensesheetdate1 = expensesheetdate1;
    }

    @JsonProperty("expensesheetdate2")
    public String getExpensesheetdate2() {
        return expensesheetdate2;
    }

    @JsonProperty("expensesheetdate2")
    public void setExpensesheetdate2(String expensesheetdate2) {
        this.expensesheetdate2 = expensesheetdate2;
    }

    @JsonProperty("expensesheetdate3")
    public String getExpensesheetdate3() {
        return expensesheetdate3;
    }

    @JsonProperty("expensesheetdate3")
    public void setExpensesheetdate3(String expensesheetdate3) {
        this.expensesheetdate3 = expensesheetdate3;
    }

    @JsonProperty("expensesheetdate4")
    public String getExpensesheetdate4() {
        return expensesheetdate4;
    }

    @JsonProperty("expensesheetdate4")
    public void setExpensesheetdate4(String expensesheetdate4) {
        this.expensesheetdate4 = expensesheetdate4;
    }

    @JsonProperty("expensesheetdate5")
    public String getExpensesheetdate5() {
        return expensesheetdate5;
    }

    @JsonProperty("expensesheetdate5")
    public void setExpensesheetdate5(String expensesheetdate5) {
        this.expensesheetdate5 = expensesheetdate5;
    }

    @JsonProperty("expensesheetpopup1")
    public String getExpensesheetpopup1() {
        return expensesheetpopup1;
    }

    @JsonProperty("expensesheetpopup1")
    public void setExpensesheetpopup1(String expensesheetpopup1) {
        this.expensesheetpopup1 = expensesheetpopup1;
    }

    @JsonProperty("expensesheetpopup2")
    public String getExpensesheetpopup2() {
        return expensesheetpopup2;
    }

    @JsonProperty("expensesheetpopup2")
    public void setExpensesheetpopup2(String expensesheetpopup2) {
        this.expensesheetpopup2 = expensesheetpopup2;
    }

    @JsonProperty("expensesheetpopup3")
    public String getExpensesheetpopup3() {
        return expensesheetpopup3;
    }

    @JsonProperty("expensesheetpopup3")
    public void setExpensesheetpopup3(String expensesheetpopup3) {
        this.expensesheetpopup3 = expensesheetpopup3;
    }

    @JsonProperty("expensesheetpopup4")
    public String getExpensesheetpopup4() {
        return expensesheetpopup4;
    }

    @JsonProperty("expensesheetpopup4")
    public void setExpensesheetpopup4(String expensesheetpopup4) {
        this.expensesheetpopup4 = expensesheetpopup4;
    }

    @JsonProperty("expensesheetpopup5")
    public String getExpensesheetpopup5() {
        return expensesheetpopup5;
    }

    @JsonProperty("expensesheetpopup5")
    public void setExpensesheetpopup5(String expensesheetpopup5) {
        this.expensesheetpopup5 = expensesheetpopup5;
    }

    @JsonProperty("approvalgroupinstancekey")
    public String getApprovalgroupinstancekey() {
        return approvalgroupinstancekey;
    }

    @JsonProperty("approvalgroupinstancekey")
    public void setApprovalgroupinstancekey(String approvalgroupinstancekey) {
        this.approvalgroupinstancekey = approvalgroupinstancekey;
    }

    @JsonProperty("approvalremarkvar")
    public String getApprovalremarkvar() {
        return approvalremarkvar;
    }

    @JsonProperty("approvalremarkvar")
    public void setApprovalremarkvar(String approvalremarkvar) {
        this.approvalremarkvar = approvalremarkvar;
    }

    @JsonProperty("companyname1var")
    public String getCompanyname1var() {
        return companyname1var;
    }

    @JsonProperty("companyname1var")
    public void setCompanyname1var(String companyname1var) {
        this.companyname1var = companyname1var;
    }

    @JsonProperty("basecurrencyvar")
    public String getBasecurrencyvar() {
        return basecurrencyvar;
    }

    @JsonProperty("basecurrencyvar")
    public void setBasecurrencyvar(String basecurrencyvar) {
        this.basecurrencyvar = basecurrencyvar;
    }

    @JsonProperty("totalvatbasevar")
    public Integer getTotalvatbasevar() {
        return totalvatbasevar;
    }

    @JsonProperty("totalvatbasevar")
    public void setTotalvatbasevar(Integer totalvatbasevar) {
        this.totalvatbasevar = totalvatbasevar;
    }

    @JsonProperty("superioremployeenamevar")
    public String getSuperioremployeenamevar() {
        return superioremployeenamevar;
    }

    @JsonProperty("superioremployeenamevar")
    public void setSuperioremployeenamevar(String superioremployeenamevar) {
        this.superioremployeenamevar = superioremployeenamevar;
    }

    @JsonProperty("secretaryemployeenamevar")
    public String getSecretaryemployeenamevar() {
        return secretaryemployeenamevar;
    }

    @JsonProperty("secretaryemployeenamevar")
    public void setSecretaryemployeenamevar(String secretaryemployeenamevar) {
        this.secretaryemployeenamevar = secretaryemployeenamevar;
    }

    @JsonProperty("tutoremployeenamevar")
    public String getTutoremployeenamevar() {
        return tutoremployeenamevar;
    }

    @JsonProperty("tutoremployeenamevar")
    public void setTutoremployeenamevar(String tutoremployeenamevar) {
        this.tutoremployeenamevar = tutoremployeenamevar;
    }

    @JsonProperty("documentarchivedescriptionvar")
    public String getDocumentarchivedescriptionvar() {
        return documentarchivedescriptionvar;
    }

    @JsonProperty("documentarchivedescriptionvar")
    public void setDocumentarchivedescriptionvar(String documentarchivedescriptionvar) {
        this.documentarchivedescriptionvar = documentarchivedescriptionvar;
    }

    @JsonProperty("isproxycurrentemployeevar")
    public Boolean getIsproxycurrentemployeevar() {
        return isproxycurrentemployeevar;
    }

    @JsonProperty("isproxycurrentemployeevar")
    public void setIsproxycurrentemployeevar(Boolean isproxycurrentemployeevar) {
        this.isproxycurrentemployeevar = isproxycurrentemployeevar;
    }

    @JsonProperty("registrationnumbervar")
    public String getRegistrationnumbervar() {
        return registrationnumbervar;
    }

    @JsonProperty("registrationnumbervar")
    public void setRegistrationnumbervar(String registrationnumbervar) {
        this.registrationnumbervar = registrationnumbervar;
    }

    @JsonProperty("accountnumbervar")
    public String getAccountnumbervar() {
        return accountnumbervar;
    }

    @JsonProperty("accountnumbervar")
    public void setAccountnumbervar(String accountnumbervar) {
        this.accountnumbervar = accountnumbervar;
    }

    @JsonProperty("vendornumbervar")
    public String getVendornumbervar() {
        return vendornumbervar;
    }

    @JsonProperty("vendornumbervar")
    public void setVendornumbervar(String vendornumbervar) {
        this.vendornumbervar = vendornumbervar;
    }

    @JsonProperty("amounttotaltovendorbasevar")
    public Integer getAmounttotaltovendorbasevar() {
        return amounttotaltovendorbasevar;
    }

    @JsonProperty("amounttotaltovendorbasevar")
    public void setAmounttotaltovendorbasevar(Integer amounttotaltovendorbasevar) {
        this.amounttotaltovendorbasevar = amounttotaltovendorbasevar;
    }

    @JsonProperty("vendorname1var")
    public String getVendorname1var() {
        return vendorname1var;
    }

    @JsonProperty("vendorname1var")
    public void setVendorname1var(String vendorname1var) {
        this.vendorname1var = vendorname1var;
    }

    @JsonProperty("bankvar")
    public String getBankvar() {
        return bankvar;
    }

    @JsonProperty("bankvar")
    public void setBankvar(String bankvar) {
        this.bankvar = bankvar;
    }

    @JsonProperty("notedescriptionvar")
    public String getNotedescriptionvar() {
        return notedescriptionvar;
    }

    @JsonProperty("notedescriptionvar")
    public void setNotedescriptionvar(String notedescriptionvar) {
        this.notedescriptionvar = notedescriptionvar;
    }

    @JsonProperty("headerapprovalrelationvar")
    public String getHeaderapprovalrelationvar() {
        return headerapprovalrelationvar;
    }

    @JsonProperty("headerapprovalrelationvar")
    public void setHeaderapprovalrelationvar(String headerapprovalrelationvar) {
        this.headerapprovalrelationvar = headerapprovalrelationvar;
    }

    @JsonProperty("headerapprovalnumbervar")
    public Integer getHeaderapprovalnumbervar() {
        return headerapprovalnumbervar;
    }

    @JsonProperty("headerapprovalnumbervar")
    public void setHeaderapprovalnumbervar(Integer headerapprovalnumbervar) {
        this.headerapprovalnumbervar = headerapprovalnumbervar;
    }

    @JsonProperty("headerapprovallinenumbervar")
    public Integer getHeaderapprovallinenumbervar() {
        return headerapprovallinenumbervar;
    }

    @JsonProperty("headerapprovallinenumbervar")
    public void setHeaderapprovallinenumbervar(Integer headerapprovallinenumbervar) {
        this.headerapprovallinenumbervar = headerapprovallinenumbervar;
    }

    @JsonProperty("headercurrentapprovalstatusvar")
    public String getHeadercurrentapprovalstatusvar() {
        return headercurrentapprovalstatusvar;
    }

    @JsonProperty("headercurrentapprovalstatusvar")
    public void setHeadercurrentapprovalstatusvar(String headercurrentapprovalstatusvar) {
        this.headercurrentapprovalstatusvar = headercurrentapprovalstatusvar;
    }

    @JsonProperty("headercurrentapprovalstatusdescriptionvar")
    public String getHeadercurrentapprovalstatusdescriptionvar() {
        return headercurrentapprovalstatusdescriptionvar;
    }

    @JsonProperty("headercurrentapprovalstatusdescriptionvar")
    public void setHeadercurrentapprovalstatusdescriptionvar(String headercurrentapprovalstatusdescriptionvar) {
        this.headercurrentapprovalstatusdescriptionvar = headercurrentapprovalstatusdescriptionvar;
    }

    @JsonProperty("headercanbeapprovedbycurrentuservar")
    public Boolean getHeadercanbeapprovedbycurrentuservar() {
        return headercanbeapprovedbycurrentuservar;
    }

    @JsonProperty("headercanbeapprovedbycurrentuservar")
    public void setHeadercanbeapprovedbycurrentuservar(Boolean headercanbeapprovedbycurrentuservar) {
        this.headercanbeapprovedbycurrentuservar = headercanbeapprovedbycurrentuservar;
    }

    @JsonProperty("headerapprovedorrejectedbyvar")
    public String getHeaderapprovedorrejectedbyvar() {
        return headerapprovedorrejectedbyvar;
    }

    @JsonProperty("headerapprovedorrejectedbyvar")
    public void setHeaderapprovedorrejectedbyvar(String headerapprovedorrejectedbyvar) {
        this.headerapprovedorrejectedbyvar = headerapprovedorrejectedbyvar;
    }

    @JsonProperty("headerapprovaldatevar")
    public String getHeaderapprovaldatevar() {
        return headerapprovaldatevar;
    }

    @JsonProperty("headerapprovaldatevar")
    public void setHeaderapprovaldatevar(String headerapprovaldatevar) {
        this.headerapprovaldatevar = headerapprovaldatevar;
    }

    @JsonProperty("headerapprovaltimevar")
    public String getHeaderapprovaltimevar() {
        return headerapprovaltimevar;
    }

    @JsonProperty("headerapprovaltimevar")
    public void setHeaderapprovaltimevar(String headerapprovaltimevar) {
        this.headerapprovaltimevar = headerapprovaltimevar;
    }

    @JsonProperty("headerremarkvar")
    public String getHeaderremarkvar() {
        return headerremarkvar;
    }

    @JsonProperty("headerremarkvar")
    public void setHeaderremarkvar(String headerremarkvar) {
        this.headerremarkvar = headerremarkvar;
    }

    @JsonProperty("duplicatedexpensesheetnumbervar")
    public Integer getDuplicatedexpensesheetnumbervar() {
        return duplicatedexpensesheetnumbervar;
    }

    @JsonProperty("duplicatedexpensesheetnumbervar")
    public void setDuplicatedexpensesheetnumbervar(Integer duplicatedexpensesheetnumbervar) {
        this.duplicatedexpensesheetnumbervar = duplicatedexpensesheetnumbervar;
    }

    @JsonProperty("level1titlenovar")
    public String getLevel1titlenovar() {
        return level1titlenovar;
    }

    @JsonProperty("level1titlenovar")
    public void setLevel1titlenovar(String level1titlenovar) {
        this.level1titlenovar = level1titlenovar;
    }

    @JsonProperty("level2titlenovar")
    public String getLevel2titlenovar() {
        return level2titlenovar;
    }

    @JsonProperty("level2titlenovar")
    public void setLevel2titlenovar(String level2titlenovar) {
        this.level2titlenovar = level2titlenovar;
    }

    @JsonProperty("level3titlenovar")
    public String getLevel3titlenovar() {
        return level3titlenovar;
    }

    @JsonProperty("level3titlenovar")
    public void setLevel3titlenovar(String level3titlenovar) {
        this.level3titlenovar = level3titlenovar;
    }

    @JsonProperty("level4titlenovar")
    public String getLevel4titlenovar() {
        return level4titlenovar;
    }

    @JsonProperty("level4titlenovar")
    public void setLevel4titlenovar(String level4titlenovar) {
        this.level4titlenovar = level4titlenovar;
    }

    @JsonProperty("level5titlenovar")
    public String getLevel5titlenovar() {
        return level5titlenovar;
    }

    @JsonProperty("level5titlenovar")
    public void setLevel5titlenovar(String level5titlenovar) {
        this.level5titlenovar = level5titlenovar;
    }

    @JsonProperty("level1titlenamevar")
    public String getLevel1titlenamevar() {
        return level1titlenamevar;
    }

    @JsonProperty("level1titlenamevar")
    public void setLevel1titlenamevar(String level1titlenamevar) {
        this.level1titlenamevar = level1titlenamevar;
    }

    @JsonProperty("level2titlenamevar")
    public String getLevel2titlenamevar() {
        return level2titlenamevar;
    }

    @JsonProperty("level2titlenamevar")
    public void setLevel2titlenamevar(String level2titlenamevar) {
        this.level2titlenamevar = level2titlenamevar;
    }

    @JsonProperty("level3titlenamevar")
    public String getLevel3titlenamevar() {
        return level3titlenamevar;
    }

    @JsonProperty("level3titlenamevar")
    public void setLevel3titlenamevar(String level3titlenamevar) {
        this.level3titlenamevar = level3titlenamevar;
    }

    @JsonProperty("level4titlenamevar")
    public String getLevel4titlenamevar() {
        return level4titlenamevar;
    }

    @JsonProperty("level4titlenamevar")
    public void setLevel4titlenamevar(String level4titlenamevar) {
        this.level4titlenamevar = level4titlenamevar;
    }

    @JsonProperty("level5titlenamevar")
    public String getLevel5titlenamevar() {
        return level5titlenamevar;
    }

    @JsonProperty("level5titlenamevar")
    public void setLevel5titlenamevar(String level5titlenamevar) {
        this.level5titlenamevar = level5titlenamevar;
    }

    @JsonProperty("vendorsettlementstatusvar")
    public String getVendorsettlementstatusvar() {
        return vendorsettlementstatusvar;
    }

    @JsonProperty("vendorsettlementstatusvar")
    public void setVendorsettlementstatusvar(String vendorsettlementstatusvar) {
        this.vendorsettlementstatusvar = vendorsettlementstatusvar;
    }

    @JsonProperty("documentarchivelinecountvar")
    public Integer getDocumentarchivelinecountvar() {
        return documentarchivelinecountvar;
    }

    @JsonProperty("documentarchivelinecountvar")
    public void setDocumentarchivelinecountvar(Integer documentarchivelinecountvar) {
        this.documentarchivelinecountvar = documentarchivelinecountvar;
    }

    @JsonProperty("expensesheetheaderstatusvar")
    public String getExpensesheetheaderstatusvar() {
        return expensesheetheaderstatusvar;
    }

    @JsonProperty("expensesheetheaderstatusvar")
    public void setExpensesheetheaderstatusvar(String expensesheetheaderstatusvar) {
        this.expensesheetheaderstatusvar = expensesheetheaderstatusvar;
    }

    @JsonProperty("removeddocumentnamevar")
    public String getRemoveddocumentnamevar() {
        return removeddocumentnamevar;
    }

    @JsonProperty("removeddocumentnamevar")
    public void setRemoveddocumentnamevar(String removeddocumentnamevar) {
        this.removeddocumentnamevar = removeddocumentnamevar;
    }

    @JsonProperty("canseeallexpensesheetsvar")
    public Boolean getCanseeallexpensesheetsvar() {
        return canseeallexpensesheetsvar;
    }

    @JsonProperty("canseeallexpensesheetsvar")
    public void setCanseeallexpensesheetsvar(Boolean canseeallexpensesheetsvar) {
        this.canseeallexpensesheetsvar = canseeallexpensesheetsvar;
    }

    @JsonProperty("usersemployeenumbervar")
    public String getUsersemployeenumbervar() {
        return usersemployeenumbervar;
    }

    @JsonProperty("usersemployeenumbervar")
    public void setUsersemployeenumbervar(String usersemployeenumbervar) {
        this.usersemployeenumbervar = usersemployeenumbervar;
    }

    @JsonProperty("lastjobnumbervar")
    public String getLastjobnumbervar() {
        return lastjobnumbervar;
    }

    @JsonProperty("lastjobnumbervar")
    public void setLastjobnumbervar(String lastjobnumbervar) {
        this.lastjobnumbervar = lastjobnumbervar;
    }

    @JsonProperty("lastactivitynumbervar")
    public String getLastactivitynumbervar() {
        return lastactivitynumbervar;
    }

    @JsonProperty("lastactivitynumbervar")
    public void setLastactivitynumbervar(String lastactivitynumbervar) {
        this.lastactivitynumbervar = lastactivitynumbervar;
    }

    @JsonProperty("lasttasknamevar")
    public String getLasttasknamevar() {
        return lasttasknamevar;
    }

    @JsonProperty("lasttasknamevar")
    public void setLasttasknamevar(String lasttasknamevar) {
        this.lasttasknamevar = lasttasknamevar;
    }

    @JsonProperty("removed3var")
    public Integer getRemoved3var() {
        return removed3var;
    }

    @JsonProperty("removed3var")
    public void setRemoved3var(Integer removed3var) {
        this.removed3var = removed3var;
    }

    @JsonProperty("removed2var")
    public Integer getRemoved2var() {
        return removed2var;
    }

    @JsonProperty("removed2var")
    public void setRemoved2var(Integer removed2var) {
        this.removed2var = removed2var;
    }

    @JsonProperty("removed1var")
    public Integer getRemoved1var() {
        return removed1var;
    }

    @JsonProperty("removed1var")
    public void setRemoved1var(Integer removed1var) {
        this.removed1var = removed1var;
    }

    @JsonProperty("lastentrydatevar")
    public String getLastentrydatevar() {
        return lastentrydatevar;
    }

    @JsonProperty("lastentrydatevar")
    public void setLastentrydatevar(String lastentrydatevar) {
        this.lastentrydatevar = lastentrydatevar;
    }

    @JsonProperty("lastcurrencyvar")
    public String getLastcurrencyvar() {
        return lastcurrencyvar;
    }

    @JsonProperty("lastcurrencyvar")
    public void setLastcurrencyvar(String lastcurrencyvar) {
        this.lastcurrencyvar = lastcurrencyvar;
    }

    @JsonProperty("numberoflinesvar")
    public Integer getNumberoflinesvar() {
        return numberoflinesvar;
    }

    @JsonProperty("numberoflinesvar")
    public void setNumberoflinesvar(Integer numberoflinesvar) {
        this.numberoflinesvar = numberoflinesvar;
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
        return new ToStringBuilder(this).append("expensesheetnumber", expensesheetnumber).append("description", description).append("employeenumber", employeenumber).append("companynumber", companynumber).append("createdby", createdby).append("createddate", createddate).append("submitted", submitted).append("submittedby", submittedby).append("datesubmitted", datesubmitted).append("transferred", transferred).append("transferredby", transferredby).append("transferdate", transferdate).append("approved", approved).append("approvedby", approvedby).append("approvaldate", approvaldate).append("fromdate", fromdate).append("todate", todate).append("remark1", remark1).append("remark2", remark2).append("remark3", remark3).append("superioremployee", superioremployee).append("secretaryemployee", secretaryemployee).append("reopened", reopened).append("lineapprovalmissing", lineapprovalmissing).append("fullyapproved", fullyapproved).append("copyfromexpensesheetnumber", copyfromexpensesheetnumber).append("jobnumber", jobnumber).append("jobname", jobname).append("amountbase", amountbase).append("amountenterprise", amountenterprise).append("numberof", numberof).append("quantitya", quantitya).append("quantityb", quantityb).append("approvalnumber", approvalnumber).append("currency", currency).append("exchangerate", exchangerate).append("documentarchivenumber", documentarchivenumber).append("employeename", employeename).append("instancekey", instancekey).append("notenumber", notenumber).append("tutoremployee", tutoremployee).append("transactiontimestamp", transactiontimestamp).append("expensesheettype", expensesheettype).append("copyallfields", copyallfields).append("defaulttransactiontype", defaulttransactiontype).append("expensesheettext1", expensesheettext1).append("expensesheettext2", expensesheettext2).append("expensesheettext3", expensesheettext3).append("expensesheettext4", expensesheettext4).append("expensesheettext5", expensesheettext5).append("expensesheetboolean1", expensesheetboolean1).append("expensesheetboolean2", expensesheetboolean2).append("expensesheetboolean3", expensesheetboolean3).append("expensesheetboolean4", expensesheetboolean4).append("expensesheetboolean5", expensesheetboolean5).append("expensesheetdate1", expensesheetdate1).append("expensesheetdate2", expensesheetdate2).append("expensesheetdate3", expensesheetdate3).append("expensesheetdate4", expensesheetdate4).append("expensesheetdate5", expensesheetdate5).append("expensesheetpopup1", expensesheetpopup1).append("expensesheetpopup2", expensesheetpopup2).append("expensesheetpopup3", expensesheetpopup3).append("expensesheetpopup4", expensesheetpopup4).append("expensesheetpopup5", expensesheetpopup5).append("approvalgroupinstancekey", approvalgroupinstancekey).append("approvalremarkvar", approvalremarkvar).append("companyname1var", companyname1var).append("basecurrencyvar", basecurrencyvar).append("totalvatbasevar", totalvatbasevar).append("superioremployeenamevar", superioremployeenamevar).append("secretaryemployeenamevar", secretaryemployeenamevar).append("tutoremployeenamevar", tutoremployeenamevar).append("documentarchivedescriptionvar", documentarchivedescriptionvar).append("isproxycurrentemployeevar", isproxycurrentemployeevar).append("registrationnumbervar", registrationnumbervar).append("accountnumbervar", accountnumbervar).append("vendornumbervar", vendornumbervar).append("amounttotaltovendorbasevar", amounttotaltovendorbasevar).append("vendorname1var", vendorname1var).append("bankvar", bankvar).append("notedescriptionvar", notedescriptionvar).append("headerapprovalrelationvar", headerapprovalrelationvar).append("headerapprovalnumbervar", headerapprovalnumbervar).append("headerapprovallinenumbervar", headerapprovallinenumbervar).append("headercurrentapprovalstatusvar", headercurrentapprovalstatusvar).append("headercurrentapprovalstatusdescriptionvar", headercurrentapprovalstatusdescriptionvar).append("headercanbeapprovedbycurrentuservar", headercanbeapprovedbycurrentuservar).append("headerapprovedorrejectedbyvar", headerapprovedorrejectedbyvar).append("headerapprovaldatevar", headerapprovaldatevar).append("headerapprovaltimevar", headerapprovaltimevar).append("headerremarkvar", headerremarkvar).append("duplicatedexpensesheetnumbervar", duplicatedexpensesheetnumbervar).append("level1titlenovar", level1titlenovar).append("level2titlenovar", level2titlenovar).append("level3titlenovar", level3titlenovar).append("level4titlenovar", level4titlenovar).append("level5titlenovar", level5titlenovar).append("level1titlenamevar", level1titlenamevar).append("level2titlenamevar", level2titlenamevar).append("level3titlenamevar", level3titlenamevar).append("level4titlenamevar", level4titlenamevar).append("level5titlenamevar", level5titlenamevar).append("vendorsettlementstatusvar", vendorsettlementstatusvar).append("documentarchivelinecountvar", documentarchivelinecountvar).append("expensesheetheaderstatusvar", expensesheetheaderstatusvar).append("removeddocumentnamevar", removeddocumentnamevar).append("canseeallexpensesheetsvar", canseeallexpensesheetsvar).append("usersemployeenumbervar", usersemployeenumbervar).append("lastjobnumbervar", lastjobnumbervar).append("lastactivitynumbervar", lastactivitynumbervar).append("lasttasknamevar", lasttasknamevar).append("removed3var", removed3var).append("removed2var", removed2var).append("removed1var", removed1var).append("lastentrydatevar", lastentrydatevar).append("lastcurrencyvar", lastcurrencyvar).append("numberoflinesvar", numberoflinesvar).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(fullyapproved).append(headercurrentapprovalstatusdescriptionvar).append(expensesheettext4).append(expensesheettext5).append(vendornumbervar).append(exchangerate).append(approved).append(amountenterprise).append(employeenumber).append(basecurrencyvar).append(datesubmitted).append(transferdate).append(submitted).append(expensesheetpopup5).append(createddate).append(documentarchivelinecountvar).append(expensesheetpopup4).append(expensesheetpopup3).append(expensesheetpopup2).append(expensesheetpopup1).append(transactiontimestamp).append(headerapprovaltimevar).append(superioremployee).append(submittedby).append(instancekey).append(usersemployeenumbervar).append(approvaldate).append(currency).append(reopened).append(expensesheetheaderstatusvar).append(headerapprovalnumbervar).append(quantityb).append(quantitya).append(level3titlenamevar).append(amounttotaltovendorbasevar).append(registrationnumbervar).append(headerapprovedorrejectedbyvar).append(tutoremployee).append(vendorsettlementstatusvar).append(notedescriptionvar).append(documentarchivenumber).append(employeename).append(approvalnumber).append(headerremarkvar).append(companyname1var).append(lastactivitynumbervar).append(secretaryemployee).append(headercanbeapprovedbycurrentuservar).append(lastcurrencyvar).append(totalvatbasevar).append(transferred).append(expensesheetboolean5).append(expensesheetboolean3).append(expensesheetboolean4).append(copyfromexpensesheetnumber).append(expensesheetboolean1).append(transferredby).append(expensesheetboolean2).append(secretaryemployeenamevar).append(jobname).append(removeddocumentnamevar).append(approvalgroupinstancekey).append(remark1).append(remark3).append(remark2).append(level1titlenovar).append(accountnumbervar).append(removed2var).append(level3titlenovar).append(vendorname1var).append(level1titlenamevar).append(description).append(expensesheetnumber).append(companynumber).append(createdby).append(headerapprovalrelationvar).append(superioremployeenamevar).append(additionalProperties).append(notenumber).append(amountbase).append(expensesheetdate3).append(expensesheetdate4).append(expensesheetdate1).append(numberoflinesvar).append(expensesheetdate2).append(headercurrentapprovalstatusvar).append(todate).append(lastentrydatevar).append(numberof).append(approvedby).append(copyallfields).append(lineapprovalmissing).append(removed3var).append(level2titlenovar).append(expensesheettype).append(fromdate).append(canseeallexpensesheetsvar).append(bankvar).append(duplicatedexpensesheetnumbervar).append(tutoremployeenamevar).append(headerapprovaldatevar).append(isproxycurrentemployeevar).append(expensesheettext2).append(level4titlenovar).append(expensesheettext3).append(expensesheettext1).append(level4titlenamevar).append(level2titlenamevar).append(removed1var).append(lastjobnumbervar).append(defaulttransactiontype).append(jobnumber).append(level5titlenamevar).append(lasttasknamevar).append(level5titlenovar).append(documentarchivedescriptionvar).append(approvalremarkvar).append(headerapprovallinenumbervar).append(expensesheetdate5).toHashCode();
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
        return new EqualsBuilder().append(fullyapproved, rhs.fullyapproved).append(headercurrentapprovalstatusdescriptionvar, rhs.headercurrentapprovalstatusdescriptionvar).append(expensesheettext4, rhs.expensesheettext4).append(expensesheettext5, rhs.expensesheettext5).append(vendornumbervar, rhs.vendornumbervar).append(exchangerate, rhs.exchangerate).append(approved, rhs.approved).append(amountenterprise, rhs.amountenterprise).append(employeenumber, rhs.employeenumber).append(basecurrencyvar, rhs.basecurrencyvar).append(datesubmitted, rhs.datesubmitted).append(transferdate, rhs.transferdate).append(submitted, rhs.submitted).append(expensesheetpopup5, rhs.expensesheetpopup5).append(createddate, rhs.createddate).append(documentarchivelinecountvar, rhs.documentarchivelinecountvar).append(expensesheetpopup4, rhs.expensesheetpopup4).append(expensesheetpopup3, rhs.expensesheetpopup3).append(expensesheetpopup2, rhs.expensesheetpopup2).append(expensesheetpopup1, rhs.expensesheetpopup1).append(transactiontimestamp, rhs.transactiontimestamp).append(headerapprovaltimevar, rhs.headerapprovaltimevar).append(superioremployee, rhs.superioremployee).append(submittedby, rhs.submittedby).append(instancekey, rhs.instancekey).append(usersemployeenumbervar, rhs.usersemployeenumbervar).append(approvaldate, rhs.approvaldate).append(currency, rhs.currency).append(reopened, rhs.reopened).append(expensesheetheaderstatusvar, rhs.expensesheetheaderstatusvar).append(headerapprovalnumbervar, rhs.headerapprovalnumbervar).append(quantityb, rhs.quantityb).append(quantitya, rhs.quantitya).append(level3titlenamevar, rhs.level3titlenamevar).append(amounttotaltovendorbasevar, rhs.amounttotaltovendorbasevar).append(registrationnumbervar, rhs.registrationnumbervar).append(headerapprovedorrejectedbyvar, rhs.headerapprovedorrejectedbyvar).append(tutoremployee, rhs.tutoremployee).append(vendorsettlementstatusvar, rhs.vendorsettlementstatusvar).append(notedescriptionvar, rhs.notedescriptionvar).append(documentarchivenumber, rhs.documentarchivenumber).append(employeename, rhs.employeename).append(approvalnumber, rhs.approvalnumber).append(headerremarkvar, rhs.headerremarkvar).append(companyname1var, rhs.companyname1var).append(lastactivitynumbervar, rhs.lastactivitynumbervar).append(secretaryemployee, rhs.secretaryemployee).append(headercanbeapprovedbycurrentuservar, rhs.headercanbeapprovedbycurrentuservar).append(lastcurrencyvar, rhs.lastcurrencyvar).append(totalvatbasevar, rhs.totalvatbasevar).append(transferred, rhs.transferred).append(expensesheetboolean5, rhs.expensesheetboolean5).append(expensesheetboolean3, rhs.expensesheetboolean3).append(expensesheetboolean4, rhs.expensesheetboolean4).append(copyfromexpensesheetnumber, rhs.copyfromexpensesheetnumber).append(expensesheetboolean1, rhs.expensesheetboolean1).append(transferredby, rhs.transferredby).append(expensesheetboolean2, rhs.expensesheetboolean2).append(secretaryemployeenamevar, rhs.secretaryemployeenamevar).append(jobname, rhs.jobname).append(removeddocumentnamevar, rhs.removeddocumentnamevar).append(approvalgroupinstancekey, rhs.approvalgroupinstancekey).append(remark1, rhs.remark1).append(remark3, rhs.remark3).append(remark2, rhs.remark2).append(level1titlenovar, rhs.level1titlenovar).append(accountnumbervar, rhs.accountnumbervar).append(removed2var, rhs.removed2var).append(level3titlenovar, rhs.level3titlenovar).append(vendorname1var, rhs.vendorname1var).append(level1titlenamevar, rhs.level1titlenamevar).append(description, rhs.description).append(expensesheetnumber, rhs.expensesheetnumber).append(companynumber, rhs.companynumber).append(createdby, rhs.createdby).append(headerapprovalrelationvar, rhs.headerapprovalrelationvar).append(superioremployeenamevar, rhs.superioremployeenamevar).append(additionalProperties, rhs.additionalProperties).append(notenumber, rhs.notenumber).append(amountbase, rhs.amountbase).append(expensesheetdate3, rhs.expensesheetdate3).append(expensesheetdate4, rhs.expensesheetdate4).append(expensesheetdate1, rhs.expensesheetdate1).append(numberoflinesvar, rhs.numberoflinesvar).append(expensesheetdate2, rhs.expensesheetdate2).append(headercurrentapprovalstatusvar, rhs.headercurrentapprovalstatusvar).append(todate, rhs.todate).append(lastentrydatevar, rhs.lastentrydatevar).append(numberof, rhs.numberof).append(approvedby, rhs.approvedby).append(copyallfields, rhs.copyallfields).append(lineapprovalmissing, rhs.lineapprovalmissing).append(removed3var, rhs.removed3var).append(level2titlenovar, rhs.level2titlenovar).append(expensesheettype, rhs.expensesheettype).append(fromdate, rhs.fromdate).append(canseeallexpensesheetsvar, rhs.canseeallexpensesheetsvar).append(bankvar, rhs.bankvar).append(duplicatedexpensesheetnumbervar, rhs.duplicatedexpensesheetnumbervar).append(tutoremployeenamevar, rhs.tutoremployeenamevar).append(headerapprovaldatevar, rhs.headerapprovaldatevar).append(isproxycurrentemployeevar, rhs.isproxycurrentemployeevar).append(expensesheettext2, rhs.expensesheettext2).append(level4titlenovar, rhs.level4titlenovar).append(expensesheettext3, rhs.expensesheettext3).append(expensesheettext1, rhs.expensesheettext1).append(level4titlenamevar, rhs.level4titlenamevar).append(level2titlenamevar, rhs.level2titlenamevar).append(removed1var, rhs.removed1var).append(lastjobnumbervar, rhs.lastjobnumbervar).append(defaulttransactiontype, rhs.defaulttransactiontype).append(jobnumber, rhs.jobnumber).append(level5titlenamevar, rhs.level5titlenamevar).append(lasttasknamevar, rhs.lasttasknamevar).append(level5titlenovar, rhs.level5titlenovar).append(documentarchivedescriptionvar, rhs.documentarchivedescriptionvar).append(approvalremarkvar, rhs.approvalremarkvar).append(headerapprovallinenumbervar, rhs.headerapprovallinenumbervar).append(expensesheetdate5, rhs.expensesheetdate5).isEquals();
    }

}
