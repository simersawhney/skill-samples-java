
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
    "employeenumber",
    "instancekey",
    "transactiontimestamp",
    "latestchangetodate",
    "dateoflatestchange",
    "timeoflatestchange",
    "latestchangetoemployeenumber",
    "currentemployeenumbervar",
    "employeenumbervar",
    "employeenamevar",
    "datevar",
    "timesheetstatusvar",
    "timeexpectedvar",
    "selectedtimesheetstatusvar",
    "selectedtimeexpectedvar",
    "isproxycurrentemployeevar",
    "textforlinktojobfavoritesvar",
    "favoritevar",
    "registrationnotevar",
    "numberofvar",
    "dailydescriptionvar",
    "totalnumbervar",
    "copyfromdatevar",
    "fixednumbervar",
    "overtimenumbervar",
    "workingtimenumbervar",
    "workingtimetotalnumbervar",
    "balancequantityvar",
    "differencenumbervar",
    "timeregistrationunitvar",
    "timecheckedinexpectedvar",
    "timecheckedoutexpectedvar",
    "absencenumberexpectedvar",
    "timecheckedinvar",
    "timecheckedoutvar",
    "absencenumbervar",
    "popup1var",
    "timesheetremark1var",
    "timesheetremark2var",
    "externaltimedaytotalvar",
    "internaltimedaytotalvar",
    "invoiceabletimedaytotalvar",
    "approvedbyvar",
    "approvedvar",
    "titletimeproposedvar",
    "departmentvar",
    "dayvar",
    "weekcalendarnumbervar",
    "remark1var",
    "remark2var",
    "remark3var",
    "remark4var",
    "remark5var",
    "numberofexpensesheetsvar",
    "numberofmileagesheetsvar",
    "employeesubcontractornumbervar",
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
    "invoiceablepercentagedayvar",
    "noninvoiceablepercentagedayvar",
    "periodstartvar",
    "periodendvar",
    "defaultjobnumbervar",
    "defaultfavoritevar",
    "resubmissionexplanationrequiredvar",
    "resubmissionexplanationvar",
    "checkinenabledvar",
    "checkintimevar",
    "checkintimeroundedvar",
    "checkinbalancevar",
    "inopenpostingperiodvar",
    "openpostingperiodmessagevar",
    "enterupperpaneforceredrawvar",
    "employeecompanynumbervar",
    "employeetransactiontypevar",
    "employeemaxworkingtimeperdayvar",
    "numberoflinesvar",
    "expectedworkingtimenumbervar",
    "fixedworkingtimeontimesheetsvar",
    "foundfixedworkingtimeontimesheetsvar"
})
public class Data {

    @JsonProperty("employeenumber")
    private String employeenumber;
    @JsonProperty("instancekey")
    private String instancekey;
    @JsonProperty("transactiontimestamp")
    private String transactiontimestamp;
    @JsonProperty("latestchangetodate")
    private String latestchangetodate;
    @JsonProperty("dateoflatestchange")
    private String dateoflatestchange;
    @JsonProperty("timeoflatestchange")
    private String timeoflatestchange;
    @JsonProperty("latestchangetoemployeenumber")
    private String latestchangetoemployeenumber;
    @JsonProperty("currentemployeenumbervar")
    private String currentemployeenumbervar;
    @JsonProperty("employeenumbervar")
    private String employeenumbervar;
    @JsonProperty("employeenamevar")
    private String employeenamevar;
    @JsonProperty("datevar")
    private String datevar;
    @JsonProperty("timesheetstatusvar")
    private String timesheetstatusvar;
    @JsonProperty("timeexpectedvar")
    private String timeexpectedvar;
    @JsonProperty("selectedtimesheetstatusvar")
    private String selectedtimesheetstatusvar;
    @JsonProperty("selectedtimeexpectedvar")
    private String selectedtimeexpectedvar;
    @JsonProperty("isproxycurrentemployeevar")
    private Boolean isproxycurrentemployeevar;
    @JsonProperty("textforlinktojobfavoritesvar")
    private String textforlinktojobfavoritesvar;
    @JsonProperty("favoritevar")
    private String favoritevar;
    @JsonProperty("registrationnotevar")
    private String registrationnotevar;
    @JsonProperty("numberofvar")
    private Integer numberofvar;
    @JsonProperty("dailydescriptionvar")
    private String dailydescriptionvar;
    @JsonProperty("totalnumbervar")
    private Integer totalnumbervar;
    @JsonProperty("copyfromdatevar")
    private String copyfromdatevar;
    @JsonProperty("fixednumbervar")
    private Integer fixednumbervar;
    @JsonProperty("overtimenumbervar")
    private Integer overtimenumbervar;
    @JsonProperty("workingtimenumbervar")
    private Integer workingtimenumbervar;
    @JsonProperty("workingtimetotalnumbervar")
    private Integer workingtimetotalnumbervar;
    @JsonProperty("balancequantityvar")
    private Integer balancequantityvar;
    @JsonProperty("differencenumbervar")
    private Integer differencenumbervar;
    @JsonProperty("timeregistrationunitvar")
    private String timeregistrationunitvar;
    @JsonProperty("timecheckedinexpectedvar")
    private String timecheckedinexpectedvar;
    @JsonProperty("timecheckedoutexpectedvar")
    private String timecheckedoutexpectedvar;
    @JsonProperty("absencenumberexpectedvar")
    private Integer absencenumberexpectedvar;
    @JsonProperty("timecheckedinvar")
    private String timecheckedinvar;
    @JsonProperty("timecheckedoutvar")
    private String timecheckedoutvar;
    @JsonProperty("absencenumbervar")
    private Integer absencenumbervar;
    @JsonProperty("popup1var")
    private String popup1var;
    @JsonProperty("timesheetremark1var")
    private String timesheetremark1var;
    @JsonProperty("timesheetremark2var")
    private String timesheetremark2var;
    @JsonProperty("externaltimedaytotalvar")
    private Integer externaltimedaytotalvar;
    @JsonProperty("internaltimedaytotalvar")
    private Integer internaltimedaytotalvar;
    @JsonProperty("invoiceabletimedaytotalvar")
    private Integer invoiceabletimedaytotalvar;
    @JsonProperty("approvedbyvar")
    private String approvedbyvar;
    @JsonProperty("approvedvar")
    private Boolean approvedvar;
    @JsonProperty("titletimeproposedvar")
    private String titletimeproposedvar;
    @JsonProperty("departmentvar")
    private String departmentvar;
    @JsonProperty("dayvar")
    private String dayvar;
    @JsonProperty("weekcalendarnumbervar")
    private String weekcalendarnumbervar;
    @JsonProperty("remark1var")
    private String remark1var;
    @JsonProperty("remark2var")
    private String remark2var;
    @JsonProperty("remark3var")
    private String remark3var;
    @JsonProperty("remark4var")
    private String remark4var;
    @JsonProperty("remark5var")
    private String remark5var;
    @JsonProperty("numberofexpensesheetsvar")
    private Integer numberofexpensesheetsvar;
    @JsonProperty("numberofmileagesheetsvar")
    private Integer numberofmileagesheetsvar;
    @JsonProperty("employeesubcontractornumbervar")
    private String employeesubcontractornumbervar;
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
    @JsonProperty("invoiceablepercentagedayvar")
    private Double invoiceablepercentagedayvar;
    @JsonProperty("noninvoiceablepercentagedayvar")
    private Integer noninvoiceablepercentagedayvar;
    @JsonProperty("periodstartvar")
    private String periodstartvar;
    @JsonProperty("periodendvar")
    private String periodendvar;
    @JsonProperty("defaultjobnumbervar")
    private String defaultjobnumbervar;
    @JsonProperty("defaultfavoritevar")
    private String defaultfavoritevar;
    @JsonProperty("resubmissionexplanationrequiredvar")
    private Boolean resubmissionexplanationrequiredvar;
    @JsonProperty("resubmissionexplanationvar")
    private String resubmissionexplanationvar;
    @JsonProperty("checkinenabledvar")
    private Boolean checkinenabledvar;
    @JsonProperty("checkintimevar")
    private Integer checkintimevar;
    @JsonProperty("checkintimeroundedvar")
    private Integer checkintimeroundedvar;
    @JsonProperty("checkinbalancevar")
    private Integer checkinbalancevar;
    @JsonProperty("inopenpostingperiodvar")
    private Boolean inopenpostingperiodvar;
    @JsonProperty("openpostingperiodmessagevar")
    private String openpostingperiodmessagevar;
    @JsonProperty("enterupperpaneforceredrawvar")
    private Boolean enterupperpaneforceredrawvar;
    @JsonProperty("employeecompanynumbervar")
    private String employeecompanynumbervar;
    @JsonProperty("employeetransactiontypevar")
    private String employeetransactiontypevar;
    @JsonProperty("employeemaxworkingtimeperdayvar")
    private Integer employeemaxworkingtimeperdayvar;
    @JsonProperty("numberoflinesvar")
    private Integer numberoflinesvar;
    @JsonProperty("expectedworkingtimenumbervar")
    private Integer expectedworkingtimenumbervar;
    @JsonProperty("fixedworkingtimeontimesheetsvar")
    private Boolean fixedworkingtimeontimesheetsvar;
    @JsonProperty("foundfixedworkingtimeontimesheetsvar")
    private Boolean foundfixedworkingtimeontimesheetsvar;
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
     * @param timesheetstatusvar
     * @param remark1var
     * @param remark5var
     * @param absencenumberexpectedvar
     * @param employeesubcontractornumbervar
     * @param selectedtimesheetstatusvar
     * @param level1titlenovar
     * @param latestchangetoemployeenumber
     * @param periodendvar
     * @param inopenpostingperiodvar
     * @param checkintimeroundedvar
     * @param copyfromdatevar
     * @param absencenumbervar
     * @param numberofvar
     * @param numberofexpensesheetsvar
     * @param level4titlenovar
     * @param defaultjobnumbervar
     * @param fixedworkingtimeontimesheetsvar
     * @param overtimenumbervar
     * @param invoiceabletimedaytotalvar
     * @param externaltimedaytotalvar
     * @param instancekey
     * @param textforlinktojobfavoritesvar
     * @param foundfixedworkingtimeontimesheetsvar
     * @param remark4var
     * @param enterupperpaneforceredrawvar
     * @param employeemaxworkingtimeperdayvar
     * @param numberofmileagesheetsvar
     * @param level5titlenovar
     * @param titletimeproposedvar
     * @param resubmissionexplanationrequiredvar
     * @param totalnumbervar
     * @param popup1var
     * @param timesheetremark2var
     * @param invoiceablepercentagedayvar
     * @param approvedbyvar
     * @param checkinenabledvar
     * @param datevar
     * @param timecheckedinvar
     * @param internaltimedaytotalvar
     * @param dayvar
     * @param expectedworkingtimenumbervar
     * @param remark3var
     * @param employeenumber
     * @param resubmissionexplanationvar
     * @param employeenamevar
     * @param employeenumbervar
     * @param selectedtimeexpectedvar
     * @param workingtimetotalnumbervar
     * @param numberoflinesvar
     * @param checkintimevar
     * @param workingtimenumbervar
     * @param timeoflatestchange
     * @param departmentvar
     * @param timesheetremark1var
     * @param transactiontimestamp
     * @param isproxycurrentemployeevar
     * @param level2titlenovar
     * @param weekcalendarnumbervar
     * @param balancequantityvar
     * @param remark2var
     * @param defaultfavoritevar
     * @param level2titlenamevar
     * @param level4titlenamevar
     * @param employeetransactiontypevar
     * @param timeregistrationunitvar
     * @param level3titlenamevar
     * @param currentemployeenumbervar
     * @param openpostingperiodmessagevar
     * @param favoritevar
     * @param timeexpectedvar
     * @param fixednumbervar
     * @param differencenumbervar
     * @param dateoflatestchange
     * @param dailydescriptionvar
     * @param level5titlenamevar
     * @param timecheckedoutvar
     * @param employeecompanynumbervar
     * @param checkinbalancevar
     * @param latestchangetodate
     * @param periodstartvar
     * @param registrationnotevar
     * @param timecheckedinexpectedvar
     * @param level3titlenovar
     * @param approvedvar
     * @param timecheckedoutexpectedvar
     * @param level1titlenamevar
     * @param noninvoiceablepercentagedayvar
     */
    public Data(String employeenumber, String instancekey, String transactiontimestamp, String latestchangetodate, String dateoflatestchange, String timeoflatestchange, String latestchangetoemployeenumber, String currentemployeenumbervar, String employeenumbervar, String employeenamevar, String datevar, String timesheetstatusvar, String timeexpectedvar, String selectedtimesheetstatusvar, String selectedtimeexpectedvar, Boolean isproxycurrentemployeevar, String textforlinktojobfavoritesvar, String favoritevar, String registrationnotevar, Integer numberofvar, String dailydescriptionvar, Integer totalnumbervar, String copyfromdatevar, Integer fixednumbervar, Integer overtimenumbervar, Integer workingtimenumbervar, Integer workingtimetotalnumbervar, Integer balancequantityvar, Integer differencenumbervar, String timeregistrationunitvar, String timecheckedinexpectedvar, String timecheckedoutexpectedvar, Integer absencenumberexpectedvar, String timecheckedinvar, String timecheckedoutvar, Integer absencenumbervar, String popup1var, String timesheetremark1var, String timesheetremark2var, Integer externaltimedaytotalvar, Integer internaltimedaytotalvar, Integer invoiceabletimedaytotalvar, String approvedbyvar, Boolean approvedvar, String titletimeproposedvar, String departmentvar, String dayvar, String weekcalendarnumbervar, String remark1var, String remark2var, String remark3var, String remark4var, String remark5var, Integer numberofexpensesheetsvar, Integer numberofmileagesheetsvar, String employeesubcontractornumbervar, String level1titlenovar, String level2titlenovar, String level3titlenovar, String level4titlenovar, String level5titlenovar, String level1titlenamevar, String level2titlenamevar, String level3titlenamevar, String level4titlenamevar, String level5titlenamevar, Double invoiceablepercentagedayvar, Integer noninvoiceablepercentagedayvar, String periodstartvar, String periodendvar, String defaultjobnumbervar, String defaultfavoritevar, Boolean resubmissionexplanationrequiredvar, String resubmissionexplanationvar, Boolean checkinenabledvar, Integer checkintimevar, Integer checkintimeroundedvar, Integer checkinbalancevar, Boolean inopenpostingperiodvar, String openpostingperiodmessagevar, Boolean enterupperpaneforceredrawvar, String employeecompanynumbervar, String employeetransactiontypevar, Integer employeemaxworkingtimeperdayvar, Integer numberoflinesvar, Integer expectedworkingtimenumbervar, Boolean fixedworkingtimeontimesheetsvar, Boolean foundfixedworkingtimeontimesheetsvar) {
        this.employeenumber = employeenumber;
        this.instancekey = instancekey;
        this.transactiontimestamp = transactiontimestamp;
        this.latestchangetodate = latestchangetodate;
        this.dateoflatestchange = dateoflatestchange;
        this.timeoflatestchange = timeoflatestchange;
        this.latestchangetoemployeenumber = latestchangetoemployeenumber;
        this.currentemployeenumbervar = currentemployeenumbervar;
        this.employeenumbervar = employeenumbervar;
        this.employeenamevar = employeenamevar;
        this.datevar = datevar;
        this.timesheetstatusvar = timesheetstatusvar;
        this.timeexpectedvar = timeexpectedvar;
        this.selectedtimesheetstatusvar = selectedtimesheetstatusvar;
        this.selectedtimeexpectedvar = selectedtimeexpectedvar;
        this.isproxycurrentemployeevar = isproxycurrentemployeevar;
        this.textforlinktojobfavoritesvar = textforlinktojobfavoritesvar;
        this.favoritevar = favoritevar;
        this.registrationnotevar = registrationnotevar;
        this.numberofvar = numberofvar;
        this.dailydescriptionvar = dailydescriptionvar;
        this.totalnumbervar = totalnumbervar;
        this.copyfromdatevar = copyfromdatevar;
        this.fixednumbervar = fixednumbervar;
        this.overtimenumbervar = overtimenumbervar;
        this.workingtimenumbervar = workingtimenumbervar;
        this.workingtimetotalnumbervar = workingtimetotalnumbervar;
        this.balancequantityvar = balancequantityvar;
        this.differencenumbervar = differencenumbervar;
        this.timeregistrationunitvar = timeregistrationunitvar;
        this.timecheckedinexpectedvar = timecheckedinexpectedvar;
        this.timecheckedoutexpectedvar = timecheckedoutexpectedvar;
        this.absencenumberexpectedvar = absencenumberexpectedvar;
        this.timecheckedinvar = timecheckedinvar;
        this.timecheckedoutvar = timecheckedoutvar;
        this.absencenumbervar = absencenumbervar;
        this.popup1var = popup1var;
        this.timesheetremark1var = timesheetremark1var;
        this.timesheetremark2var = timesheetremark2var;
        this.externaltimedaytotalvar = externaltimedaytotalvar;
        this.internaltimedaytotalvar = internaltimedaytotalvar;
        this.invoiceabletimedaytotalvar = invoiceabletimedaytotalvar;
        this.approvedbyvar = approvedbyvar;
        this.approvedvar = approvedvar;
        this.titletimeproposedvar = titletimeproposedvar;
        this.departmentvar = departmentvar;
        this.dayvar = dayvar;
        this.weekcalendarnumbervar = weekcalendarnumbervar;
        this.remark1var = remark1var;
        this.remark2var = remark2var;
        this.remark3var = remark3var;
        this.remark4var = remark4var;
        this.remark5var = remark5var;
        this.numberofexpensesheetsvar = numberofexpensesheetsvar;
        this.numberofmileagesheetsvar = numberofmileagesheetsvar;
        this.employeesubcontractornumbervar = employeesubcontractornumbervar;
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
        this.invoiceablepercentagedayvar = invoiceablepercentagedayvar;
        this.noninvoiceablepercentagedayvar = noninvoiceablepercentagedayvar;
        this.periodstartvar = periodstartvar;
        this.periodendvar = periodendvar;
        this.defaultjobnumbervar = defaultjobnumbervar;
        this.defaultfavoritevar = defaultfavoritevar;
        this.resubmissionexplanationrequiredvar = resubmissionexplanationrequiredvar;
        this.resubmissionexplanationvar = resubmissionexplanationvar;
        this.checkinenabledvar = checkinenabledvar;
        this.checkintimevar = checkintimevar;
        this.checkintimeroundedvar = checkintimeroundedvar;
        this.checkinbalancevar = checkinbalancevar;
        this.inopenpostingperiodvar = inopenpostingperiodvar;
        this.openpostingperiodmessagevar = openpostingperiodmessagevar;
        this.enterupperpaneforceredrawvar = enterupperpaneforceredrawvar;
        this.employeecompanynumbervar = employeecompanynumbervar;
        this.employeetransactiontypevar = employeetransactiontypevar;
        this.employeemaxworkingtimeperdayvar = employeemaxworkingtimeperdayvar;
        this.numberoflinesvar = numberoflinesvar;
        this.expectedworkingtimenumbervar = expectedworkingtimenumbervar;
        this.fixedworkingtimeontimesheetsvar = fixedworkingtimeontimesheetsvar;
        this.foundfixedworkingtimeontimesheetsvar = foundfixedworkingtimeontimesheetsvar;
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
     *     The latestchangetodate
     */
    @JsonProperty("latestchangetodate")
    public String getLatestchangetodate() {
        return latestchangetodate;
    }

    /**
     * 
     * @param latestchangetodate
     *     The latestchangetodate
     */
    @JsonProperty("latestchangetodate")
    public void setLatestchangetodate(String latestchangetodate) {
        this.latestchangetodate = latestchangetodate;
    }

    /**
     * 
     * @return
     *     The dateoflatestchange
     */
    @JsonProperty("dateoflatestchange")
    public String getDateoflatestchange() {
        return dateoflatestchange;
    }

    /**
     * 
     * @param dateoflatestchange
     *     The dateoflatestchange
     */
    @JsonProperty("dateoflatestchange")
    public void setDateoflatestchange(String dateoflatestchange) {
        this.dateoflatestchange = dateoflatestchange;
    }

    /**
     * 
     * @return
     *     The timeoflatestchange
     */
    @JsonProperty("timeoflatestchange")
    public String getTimeoflatestchange() {
        return timeoflatestchange;
    }

    /**
     * 
     * @param timeoflatestchange
     *     The timeoflatestchange
     */
    @JsonProperty("timeoflatestchange")
    public void setTimeoflatestchange(String timeoflatestchange) {
        this.timeoflatestchange = timeoflatestchange;
    }

    /**
     * 
     * @return
     *     The latestchangetoemployeenumber
     */
    @JsonProperty("latestchangetoemployeenumber")
    public String getLatestchangetoemployeenumber() {
        return latestchangetoemployeenumber;
    }

    /**
     * 
     * @param latestchangetoemployeenumber
     *     The latestchangetoemployeenumber
     */
    @JsonProperty("latestchangetoemployeenumber")
    public void setLatestchangetoemployeenumber(String latestchangetoemployeenumber) {
        this.latestchangetoemployeenumber = latestchangetoemployeenumber;
    }

    /**
     * 
     * @return
     *     The currentemployeenumbervar
     */
    @JsonProperty("currentemployeenumbervar")
    public String getCurrentemployeenumbervar() {
        return currentemployeenumbervar;
    }

    /**
     * 
     * @param currentemployeenumbervar
     *     The currentemployeenumbervar
     */
    @JsonProperty("currentemployeenumbervar")
    public void setCurrentemployeenumbervar(String currentemployeenumbervar) {
        this.currentemployeenumbervar = currentemployeenumbervar;
    }

    /**
     * 
     * @return
     *     The employeenumbervar
     */
    @JsonProperty("employeenumbervar")
    public String getEmployeenumbervar() {
        return employeenumbervar;
    }

    /**
     * 
     * @param employeenumbervar
     *     The employeenumbervar
     */
    @JsonProperty("employeenumbervar")
    public void setEmployeenumbervar(String employeenumbervar) {
        this.employeenumbervar = employeenumbervar;
    }

    /**
     * 
     * @return
     *     The employeenamevar
     */
    @JsonProperty("employeenamevar")
    public String getEmployeenamevar() {
        return employeenamevar;
    }

    /**
     * 
     * @param employeenamevar
     *     The employeenamevar
     */
    @JsonProperty("employeenamevar")
    public void setEmployeenamevar(String employeenamevar) {
        this.employeenamevar = employeenamevar;
    }

    /**
     * 
     * @return
     *     The datevar
     */
    @JsonProperty("datevar")
    public String getDatevar() {
        return datevar;
    }

    /**
     * 
     * @param datevar
     *     The datevar
     */
    @JsonProperty("datevar")
    public void setDatevar(String datevar) {
        this.datevar = datevar;
    }

    /**
     * 
     * @return
     *     The timesheetstatusvar
     */
    @JsonProperty("timesheetstatusvar")
    public String getTimesheetstatusvar() {
        return timesheetstatusvar;
    }

    /**
     * 
     * @param timesheetstatusvar
     *     The timesheetstatusvar
     */
    @JsonProperty("timesheetstatusvar")
    public void setTimesheetstatusvar(String timesheetstatusvar) {
        this.timesheetstatusvar = timesheetstatusvar;
    }

    /**
     * 
     * @return
     *     The timeexpectedvar
     */
    @JsonProperty("timeexpectedvar")
    public String getTimeexpectedvar() {
        return timeexpectedvar;
    }

    /**
     * 
     * @param timeexpectedvar
     *     The timeexpectedvar
     */
    @JsonProperty("timeexpectedvar")
    public void setTimeexpectedvar(String timeexpectedvar) {
        this.timeexpectedvar = timeexpectedvar;
    }

    /**
     * 
     * @return
     *     The selectedtimesheetstatusvar
     */
    @JsonProperty("selectedtimesheetstatusvar")
    public String getSelectedtimesheetstatusvar() {
        return selectedtimesheetstatusvar;
    }

    /**
     * 
     * @param selectedtimesheetstatusvar
     *     The selectedtimesheetstatusvar
     */
    @JsonProperty("selectedtimesheetstatusvar")
    public void setSelectedtimesheetstatusvar(String selectedtimesheetstatusvar) {
        this.selectedtimesheetstatusvar = selectedtimesheetstatusvar;
    }

    /**
     * 
     * @return
     *     The selectedtimeexpectedvar
     */
    @JsonProperty("selectedtimeexpectedvar")
    public String getSelectedtimeexpectedvar() {
        return selectedtimeexpectedvar;
    }

    /**
     * 
     * @param selectedtimeexpectedvar
     *     The selectedtimeexpectedvar
     */
    @JsonProperty("selectedtimeexpectedvar")
    public void setSelectedtimeexpectedvar(String selectedtimeexpectedvar) {
        this.selectedtimeexpectedvar = selectedtimeexpectedvar;
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
     *     The textforlinktojobfavoritesvar
     */
    @JsonProperty("textforlinktojobfavoritesvar")
    public String getTextforlinktojobfavoritesvar() {
        return textforlinktojobfavoritesvar;
    }

    /**
     * 
     * @param textforlinktojobfavoritesvar
     *     The textforlinktojobfavoritesvar
     */
    @JsonProperty("textforlinktojobfavoritesvar")
    public void setTextforlinktojobfavoritesvar(String textforlinktojobfavoritesvar) {
        this.textforlinktojobfavoritesvar = textforlinktojobfavoritesvar;
    }

    /**
     * 
     * @return
     *     The favoritevar
     */
    @JsonProperty("favoritevar")
    public String getFavoritevar() {
        return favoritevar;
    }

    /**
     * 
     * @param favoritevar
     *     The favoritevar
     */
    @JsonProperty("favoritevar")
    public void setFavoritevar(String favoritevar) {
        this.favoritevar = favoritevar;
    }

    /**
     * 
     * @return
     *     The registrationnotevar
     */
    @JsonProperty("registrationnotevar")
    public String getRegistrationnotevar() {
        return registrationnotevar;
    }

    /**
     * 
     * @param registrationnotevar
     *     The registrationnotevar
     */
    @JsonProperty("registrationnotevar")
    public void setRegistrationnotevar(String registrationnotevar) {
        this.registrationnotevar = registrationnotevar;
    }

    /**
     * 
     * @return
     *     The numberofvar
     */
    @JsonProperty("numberofvar")
    public Integer getNumberofvar() {
        return numberofvar;
    }

    /**
     * 
     * @param numberofvar
     *     The numberofvar
     */
    @JsonProperty("numberofvar")
    public void setNumberofvar(Integer numberofvar) {
        this.numberofvar = numberofvar;
    }

    /**
     * 
     * @return
     *     The dailydescriptionvar
     */
    @JsonProperty("dailydescriptionvar")
    public String getDailydescriptionvar() {
        return dailydescriptionvar;
    }

    /**
     * 
     * @param dailydescriptionvar
     *     The dailydescriptionvar
     */
    @JsonProperty("dailydescriptionvar")
    public void setDailydescriptionvar(String dailydescriptionvar) {
        this.dailydescriptionvar = dailydescriptionvar;
    }

    /**
     * 
     * @return
     *     The totalnumbervar
     */
    @JsonProperty("totalnumbervar")
    public Integer getTotalnumbervar() {
        return totalnumbervar;
    }

    /**
     * 
     * @param totalnumbervar
     *     The totalnumbervar
     */
    @JsonProperty("totalnumbervar")
    public void setTotalnumbervar(Integer totalnumbervar) {
        this.totalnumbervar = totalnumbervar;
    }

    /**
     * 
     * @return
     *     The copyfromdatevar
     */
    @JsonProperty("copyfromdatevar")
    public String getCopyfromdatevar() {
        return copyfromdatevar;
    }

    /**
     * 
     * @param copyfromdatevar
     *     The copyfromdatevar
     */
    @JsonProperty("copyfromdatevar")
    public void setCopyfromdatevar(String copyfromdatevar) {
        this.copyfromdatevar = copyfromdatevar;
    }

    /**
     * 
     * @return
     *     The fixednumbervar
     */
    @JsonProperty("fixednumbervar")
    public Integer getFixednumbervar() {
        return fixednumbervar;
    }

    /**
     * 
     * @param fixednumbervar
     *     The fixednumbervar
     */
    @JsonProperty("fixednumbervar")
    public void setFixednumbervar(Integer fixednumbervar) {
        this.fixednumbervar = fixednumbervar;
    }

    /**
     * 
     * @return
     *     The overtimenumbervar
     */
    @JsonProperty("overtimenumbervar")
    public Integer getOvertimenumbervar() {
        return overtimenumbervar;
    }

    /**
     * 
     * @param overtimenumbervar
     *     The overtimenumbervar
     */
    @JsonProperty("overtimenumbervar")
    public void setOvertimenumbervar(Integer overtimenumbervar) {
        this.overtimenumbervar = overtimenumbervar;
    }

    /**
     * 
     * @return
     *     The workingtimenumbervar
     */
    @JsonProperty("workingtimenumbervar")
    public Integer getWorkingtimenumbervar() {
        return workingtimenumbervar;
    }

    /**
     * 
     * @param workingtimenumbervar
     *     The workingtimenumbervar
     */
    @JsonProperty("workingtimenumbervar")
    public void setWorkingtimenumbervar(Integer workingtimenumbervar) {
        this.workingtimenumbervar = workingtimenumbervar;
    }

    /**
     * 
     * @return
     *     The workingtimetotalnumbervar
     */
    @JsonProperty("workingtimetotalnumbervar")
    public Integer getWorkingtimetotalnumbervar() {
        return workingtimetotalnumbervar;
    }

    /**
     * 
     * @param workingtimetotalnumbervar
     *     The workingtimetotalnumbervar
     */
    @JsonProperty("workingtimetotalnumbervar")
    public void setWorkingtimetotalnumbervar(Integer workingtimetotalnumbervar) {
        this.workingtimetotalnumbervar = workingtimetotalnumbervar;
    }

    /**
     * 
     * @return
     *     The balancequantityvar
     */
    @JsonProperty("balancequantityvar")
    public Integer getBalancequantityvar() {
        return balancequantityvar;
    }

    /**
     * 
     * @param balancequantityvar
     *     The balancequantityvar
     */
    @JsonProperty("balancequantityvar")
    public void setBalancequantityvar(Integer balancequantityvar) {
        this.balancequantityvar = balancequantityvar;
    }

    /**
     * 
     * @return
     *     The differencenumbervar
     */
    @JsonProperty("differencenumbervar")
    public Integer getDifferencenumbervar() {
        return differencenumbervar;
    }

    /**
     * 
     * @param differencenumbervar
     *     The differencenumbervar
     */
    @JsonProperty("differencenumbervar")
    public void setDifferencenumbervar(Integer differencenumbervar) {
        this.differencenumbervar = differencenumbervar;
    }

    /**
     * 
     * @return
     *     The timeregistrationunitvar
     */
    @JsonProperty("timeregistrationunitvar")
    public String getTimeregistrationunitvar() {
        return timeregistrationunitvar;
    }

    /**
     * 
     * @param timeregistrationunitvar
     *     The timeregistrationunitvar
     */
    @JsonProperty("timeregistrationunitvar")
    public void setTimeregistrationunitvar(String timeregistrationunitvar) {
        this.timeregistrationunitvar = timeregistrationunitvar;
    }

    /**
     * 
     * @return
     *     The timecheckedinexpectedvar
     */
    @JsonProperty("timecheckedinexpectedvar")
    public String getTimecheckedinexpectedvar() {
        return timecheckedinexpectedvar;
    }

    /**
     * 
     * @param timecheckedinexpectedvar
     *     The timecheckedinexpectedvar
     */
    @JsonProperty("timecheckedinexpectedvar")
    public void setTimecheckedinexpectedvar(String timecheckedinexpectedvar) {
        this.timecheckedinexpectedvar = timecheckedinexpectedvar;
    }

    /**
     * 
     * @return
     *     The timecheckedoutexpectedvar
     */
    @JsonProperty("timecheckedoutexpectedvar")
    public String getTimecheckedoutexpectedvar() {
        return timecheckedoutexpectedvar;
    }

    /**
     * 
     * @param timecheckedoutexpectedvar
     *     The timecheckedoutexpectedvar
     */
    @JsonProperty("timecheckedoutexpectedvar")
    public void setTimecheckedoutexpectedvar(String timecheckedoutexpectedvar) {
        this.timecheckedoutexpectedvar = timecheckedoutexpectedvar;
    }

    /**
     * 
     * @return
     *     The absencenumberexpectedvar
     */
    @JsonProperty("absencenumberexpectedvar")
    public Integer getAbsencenumberexpectedvar() {
        return absencenumberexpectedvar;
    }

    /**
     * 
     * @param absencenumberexpectedvar
     *     The absencenumberexpectedvar
     */
    @JsonProperty("absencenumberexpectedvar")
    public void setAbsencenumberexpectedvar(Integer absencenumberexpectedvar) {
        this.absencenumberexpectedvar = absencenumberexpectedvar;
    }

    /**
     * 
     * @return
     *     The timecheckedinvar
     */
    @JsonProperty("timecheckedinvar")
    public String getTimecheckedinvar() {
        return timecheckedinvar;
    }

    /**
     * 
     * @param timecheckedinvar
     *     The timecheckedinvar
     */
    @JsonProperty("timecheckedinvar")
    public void setTimecheckedinvar(String timecheckedinvar) {
        this.timecheckedinvar = timecheckedinvar;
    }

    /**
     * 
     * @return
     *     The timecheckedoutvar
     */
    @JsonProperty("timecheckedoutvar")
    public String getTimecheckedoutvar() {
        return timecheckedoutvar;
    }

    /**
     * 
     * @param timecheckedoutvar
     *     The timecheckedoutvar
     */
    @JsonProperty("timecheckedoutvar")
    public void setTimecheckedoutvar(String timecheckedoutvar) {
        this.timecheckedoutvar = timecheckedoutvar;
    }

    /**
     * 
     * @return
     *     The absencenumbervar
     */
    @JsonProperty("absencenumbervar")
    public Integer getAbsencenumbervar() {
        return absencenumbervar;
    }

    /**
     * 
     * @param absencenumbervar
     *     The absencenumbervar
     */
    @JsonProperty("absencenumbervar")
    public void setAbsencenumbervar(Integer absencenumbervar) {
        this.absencenumbervar = absencenumbervar;
    }

    /**
     * 
     * @return
     *     The popup1var
     */
    @JsonProperty("popup1var")
    public String getPopup1var() {
        return popup1var;
    }

    /**
     * 
     * @param popup1var
     *     The popup1var
     */
    @JsonProperty("popup1var")
    public void setPopup1var(String popup1var) {
        this.popup1var = popup1var;
    }

    /**
     * 
     * @return
     *     The timesheetremark1var
     */
    @JsonProperty("timesheetremark1var")
    public String getTimesheetremark1var() {
        return timesheetremark1var;
    }

    /**
     * 
     * @param timesheetremark1var
     *     The timesheetremark1var
     */
    @JsonProperty("timesheetremark1var")
    public void setTimesheetremark1var(String timesheetremark1var) {
        this.timesheetremark1var = timesheetremark1var;
    }

    /**
     * 
     * @return
     *     The timesheetremark2var
     */
    @JsonProperty("timesheetremark2var")
    public String getTimesheetremark2var() {
        return timesheetremark2var;
    }

    /**
     * 
     * @param timesheetremark2var
     *     The timesheetremark2var
     */
    @JsonProperty("timesheetremark2var")
    public void setTimesheetremark2var(String timesheetremark2var) {
        this.timesheetremark2var = timesheetremark2var;
    }

    /**
     * 
     * @return
     *     The externaltimedaytotalvar
     */
    @JsonProperty("externaltimedaytotalvar")
    public Integer getExternaltimedaytotalvar() {
        return externaltimedaytotalvar;
    }

    /**
     * 
     * @param externaltimedaytotalvar
     *     The externaltimedaytotalvar
     */
    @JsonProperty("externaltimedaytotalvar")
    public void setExternaltimedaytotalvar(Integer externaltimedaytotalvar) {
        this.externaltimedaytotalvar = externaltimedaytotalvar;
    }

    /**
     * 
     * @return
     *     The internaltimedaytotalvar
     */
    @JsonProperty("internaltimedaytotalvar")
    public Integer getInternaltimedaytotalvar() {
        return internaltimedaytotalvar;
    }

    /**
     * 
     * @param internaltimedaytotalvar
     *     The internaltimedaytotalvar
     */
    @JsonProperty("internaltimedaytotalvar")
    public void setInternaltimedaytotalvar(Integer internaltimedaytotalvar) {
        this.internaltimedaytotalvar = internaltimedaytotalvar;
    }

    /**
     * 
     * @return
     *     The invoiceabletimedaytotalvar
     */
    @JsonProperty("invoiceabletimedaytotalvar")
    public Integer getInvoiceabletimedaytotalvar() {
        return invoiceabletimedaytotalvar;
    }

    /**
     * 
     * @param invoiceabletimedaytotalvar
     *     The invoiceabletimedaytotalvar
     */
    @JsonProperty("invoiceabletimedaytotalvar")
    public void setInvoiceabletimedaytotalvar(Integer invoiceabletimedaytotalvar) {
        this.invoiceabletimedaytotalvar = invoiceabletimedaytotalvar;
    }

    /**
     * 
     * @return
     *     The approvedbyvar
     */
    @JsonProperty("approvedbyvar")
    public String getApprovedbyvar() {
        return approvedbyvar;
    }

    /**
     * 
     * @param approvedbyvar
     *     The approvedbyvar
     */
    @JsonProperty("approvedbyvar")
    public void setApprovedbyvar(String approvedbyvar) {
        this.approvedbyvar = approvedbyvar;
    }

    /**
     * 
     * @return
     *     The approvedvar
     */
    @JsonProperty("approvedvar")
    public Boolean getApprovedvar() {
        return approvedvar;
    }

    /**
     * 
     * @param approvedvar
     *     The approvedvar
     */
    @JsonProperty("approvedvar")
    public void setApprovedvar(Boolean approvedvar) {
        this.approvedvar = approvedvar;
    }

    /**
     * 
     * @return
     *     The titletimeproposedvar
     */
    @JsonProperty("titletimeproposedvar")
    public String getTitletimeproposedvar() {
        return titletimeproposedvar;
    }

    /**
     * 
     * @param titletimeproposedvar
     *     The titletimeproposedvar
     */
    @JsonProperty("titletimeproposedvar")
    public void setTitletimeproposedvar(String titletimeproposedvar) {
        this.titletimeproposedvar = titletimeproposedvar;
    }

    /**
     * 
     * @return
     *     The departmentvar
     */
    @JsonProperty("departmentvar")
    public String getDepartmentvar() {
        return departmentvar;
    }

    /**
     * 
     * @param departmentvar
     *     The departmentvar
     */
    @JsonProperty("departmentvar")
    public void setDepartmentvar(String departmentvar) {
        this.departmentvar = departmentvar;
    }

    /**
     * 
     * @return
     *     The dayvar
     */
    @JsonProperty("dayvar")
    public String getDayvar() {
        return dayvar;
    }

    /**
     * 
     * @param dayvar
     *     The dayvar
     */
    @JsonProperty("dayvar")
    public void setDayvar(String dayvar) {
        this.dayvar = dayvar;
    }

    /**
     * 
     * @return
     *     The weekcalendarnumbervar
     */
    @JsonProperty("weekcalendarnumbervar")
    public String getWeekcalendarnumbervar() {
        return weekcalendarnumbervar;
    }

    /**
     * 
     * @param weekcalendarnumbervar
     *     The weekcalendarnumbervar
     */
    @JsonProperty("weekcalendarnumbervar")
    public void setWeekcalendarnumbervar(String weekcalendarnumbervar) {
        this.weekcalendarnumbervar = weekcalendarnumbervar;
    }

    /**
     * 
     * @return
     *     The remark1var
     */
    @JsonProperty("remark1var")
    public String getRemark1var() {
        return remark1var;
    }

    /**
     * 
     * @param remark1var
     *     The remark1var
     */
    @JsonProperty("remark1var")
    public void setRemark1var(String remark1var) {
        this.remark1var = remark1var;
    }

    /**
     * 
     * @return
     *     The remark2var
     */
    @JsonProperty("remark2var")
    public String getRemark2var() {
        return remark2var;
    }

    /**
     * 
     * @param remark2var
     *     The remark2var
     */
    @JsonProperty("remark2var")
    public void setRemark2var(String remark2var) {
        this.remark2var = remark2var;
    }

    /**
     * 
     * @return
     *     The remark3var
     */
    @JsonProperty("remark3var")
    public String getRemark3var() {
        return remark3var;
    }

    /**
     * 
     * @param remark3var
     *     The remark3var
     */
    @JsonProperty("remark3var")
    public void setRemark3var(String remark3var) {
        this.remark3var = remark3var;
    }

    /**
     * 
     * @return
     *     The remark4var
     */
    @JsonProperty("remark4var")
    public String getRemark4var() {
        return remark4var;
    }

    /**
     * 
     * @param remark4var
     *     The remark4var
     */
    @JsonProperty("remark4var")
    public void setRemark4var(String remark4var) {
        this.remark4var = remark4var;
    }

    /**
     * 
     * @return
     *     The remark5var
     */
    @JsonProperty("remark5var")
    public String getRemark5var() {
        return remark5var;
    }

    /**
     * 
     * @param remark5var
     *     The remark5var
     */
    @JsonProperty("remark5var")
    public void setRemark5var(String remark5var) {
        this.remark5var = remark5var;
    }

    /**
     * 
     * @return
     *     The numberofexpensesheetsvar
     */
    @JsonProperty("numberofexpensesheetsvar")
    public Integer getNumberofexpensesheetsvar() {
        return numberofexpensesheetsvar;
    }

    /**
     * 
     * @param numberofexpensesheetsvar
     *     The numberofexpensesheetsvar
     */
    @JsonProperty("numberofexpensesheetsvar")
    public void setNumberofexpensesheetsvar(Integer numberofexpensesheetsvar) {
        this.numberofexpensesheetsvar = numberofexpensesheetsvar;
    }

    /**
     * 
     * @return
     *     The numberofmileagesheetsvar
     */
    @JsonProperty("numberofmileagesheetsvar")
    public Integer getNumberofmileagesheetsvar() {
        return numberofmileagesheetsvar;
    }

    /**
     * 
     * @param numberofmileagesheetsvar
     *     The numberofmileagesheetsvar
     */
    @JsonProperty("numberofmileagesheetsvar")
    public void setNumberofmileagesheetsvar(Integer numberofmileagesheetsvar) {
        this.numberofmileagesheetsvar = numberofmileagesheetsvar;
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
     *     The invoiceablepercentagedayvar
     */
    @JsonProperty("invoiceablepercentagedayvar")
    public Double getInvoiceablepercentagedayvar() {
        return invoiceablepercentagedayvar;
    }

    /**
     * 
     * @param invoiceablepercentagedayvar
     *     The invoiceablepercentagedayvar
     */
    @JsonProperty("invoiceablepercentagedayvar")
    public void setInvoiceablepercentagedayvar(Double invoiceablepercentagedayvar) {
        this.invoiceablepercentagedayvar = invoiceablepercentagedayvar;
    }

    /**
     * 
     * @return
     *     The noninvoiceablepercentagedayvar
     */
    @JsonProperty("noninvoiceablepercentagedayvar")
    public Integer getNoninvoiceablepercentagedayvar() {
        return noninvoiceablepercentagedayvar;
    }

    /**
     * 
     * @param noninvoiceablepercentagedayvar
     *     The noninvoiceablepercentagedayvar
     */
    @JsonProperty("noninvoiceablepercentagedayvar")
    public void setNoninvoiceablepercentagedayvar(Integer noninvoiceablepercentagedayvar) {
        this.noninvoiceablepercentagedayvar = noninvoiceablepercentagedayvar;
    }

    /**
     * 
     * @return
     *     The periodstartvar
     */
    @JsonProperty("periodstartvar")
    public String getPeriodstartvar() {
        return periodstartvar;
    }

    /**
     * 
     * @param periodstartvar
     *     The periodstartvar
     */
    @JsonProperty("periodstartvar")
    public void setPeriodstartvar(String periodstartvar) {
        this.periodstartvar = periodstartvar;
    }

    /**
     * 
     * @return
     *     The periodendvar
     */
    @JsonProperty("periodendvar")
    public String getPeriodendvar() {
        return periodendvar;
    }

    /**
     * 
     * @param periodendvar
     *     The periodendvar
     */
    @JsonProperty("periodendvar")
    public void setPeriodendvar(String periodendvar) {
        this.periodendvar = periodendvar;
    }

    /**
     * 
     * @return
     *     The defaultjobnumbervar
     */
    @JsonProperty("defaultjobnumbervar")
    public String getDefaultjobnumbervar() {
        return defaultjobnumbervar;
    }

    /**
     * 
     * @param defaultjobnumbervar
     *     The defaultjobnumbervar
     */
    @JsonProperty("defaultjobnumbervar")
    public void setDefaultjobnumbervar(String defaultjobnumbervar) {
        this.defaultjobnumbervar = defaultjobnumbervar;
    }

    /**
     * 
     * @return
     *     The defaultfavoritevar
     */
    @JsonProperty("defaultfavoritevar")
    public String getDefaultfavoritevar() {
        return defaultfavoritevar;
    }

    /**
     * 
     * @param defaultfavoritevar
     *     The defaultfavoritevar
     */
    @JsonProperty("defaultfavoritevar")
    public void setDefaultfavoritevar(String defaultfavoritevar) {
        this.defaultfavoritevar = defaultfavoritevar;
    }

    /**
     * 
     * @return
     *     The resubmissionexplanationrequiredvar
     */
    @JsonProperty("resubmissionexplanationrequiredvar")
    public Boolean getResubmissionexplanationrequiredvar() {
        return resubmissionexplanationrequiredvar;
    }

    /**
     * 
     * @param resubmissionexplanationrequiredvar
     *     The resubmissionexplanationrequiredvar
     */
    @JsonProperty("resubmissionexplanationrequiredvar")
    public void setResubmissionexplanationrequiredvar(Boolean resubmissionexplanationrequiredvar) {
        this.resubmissionexplanationrequiredvar = resubmissionexplanationrequiredvar;
    }

    /**
     * 
     * @return
     *     The resubmissionexplanationvar
     */
    @JsonProperty("resubmissionexplanationvar")
    public String getResubmissionexplanationvar() {
        return resubmissionexplanationvar;
    }

    /**
     * 
     * @param resubmissionexplanationvar
     *     The resubmissionexplanationvar
     */
    @JsonProperty("resubmissionexplanationvar")
    public void setResubmissionexplanationvar(String resubmissionexplanationvar) {
        this.resubmissionexplanationvar = resubmissionexplanationvar;
    }

    /**
     * 
     * @return
     *     The checkinenabledvar
     */
    @JsonProperty("checkinenabledvar")
    public Boolean getCheckinenabledvar() {
        return checkinenabledvar;
    }

    /**
     * 
     * @param checkinenabledvar
     *     The checkinenabledvar
     */
    @JsonProperty("checkinenabledvar")
    public void setCheckinenabledvar(Boolean checkinenabledvar) {
        this.checkinenabledvar = checkinenabledvar;
    }

    /**
     * 
     * @return
     *     The checkintimevar
     */
    @JsonProperty("checkintimevar")
    public Integer getCheckintimevar() {
        return checkintimevar;
    }

    /**
     * 
     * @param checkintimevar
     *     The checkintimevar
     */
    @JsonProperty("checkintimevar")
    public void setCheckintimevar(Integer checkintimevar) {
        this.checkintimevar = checkintimevar;
    }

    /**
     * 
     * @return
     *     The checkintimeroundedvar
     */
    @JsonProperty("checkintimeroundedvar")
    public Integer getCheckintimeroundedvar() {
        return checkintimeroundedvar;
    }

    /**
     * 
     * @param checkintimeroundedvar
     *     The checkintimeroundedvar
     */
    @JsonProperty("checkintimeroundedvar")
    public void setCheckintimeroundedvar(Integer checkintimeroundedvar) {
        this.checkintimeroundedvar = checkintimeroundedvar;
    }

    /**
     * 
     * @return
     *     The checkinbalancevar
     */
    @JsonProperty("checkinbalancevar")
    public Integer getCheckinbalancevar() {
        return checkinbalancevar;
    }

    /**
     * 
     * @param checkinbalancevar
     *     The checkinbalancevar
     */
    @JsonProperty("checkinbalancevar")
    public void setCheckinbalancevar(Integer checkinbalancevar) {
        this.checkinbalancevar = checkinbalancevar;
    }

    /**
     * 
     * @return
     *     The inopenpostingperiodvar
     */
    @JsonProperty("inopenpostingperiodvar")
    public Boolean getInopenpostingperiodvar() {
        return inopenpostingperiodvar;
    }

    /**
     * 
     * @param inopenpostingperiodvar
     *     The inopenpostingperiodvar
     */
    @JsonProperty("inopenpostingperiodvar")
    public void setInopenpostingperiodvar(Boolean inopenpostingperiodvar) {
        this.inopenpostingperiodvar = inopenpostingperiodvar;
    }

    /**
     * 
     * @return
     *     The openpostingperiodmessagevar
     */
    @JsonProperty("openpostingperiodmessagevar")
    public String getOpenpostingperiodmessagevar() {
        return openpostingperiodmessagevar;
    }

    /**
     * 
     * @param openpostingperiodmessagevar
     *     The openpostingperiodmessagevar
     */
    @JsonProperty("openpostingperiodmessagevar")
    public void setOpenpostingperiodmessagevar(String openpostingperiodmessagevar) {
        this.openpostingperiodmessagevar = openpostingperiodmessagevar;
    }

    /**
     * 
     * @return
     *     The enterupperpaneforceredrawvar
     */
    @JsonProperty("enterupperpaneforceredrawvar")
    public Boolean getEnterupperpaneforceredrawvar() {
        return enterupperpaneforceredrawvar;
    }

    /**
     * 
     * @param enterupperpaneforceredrawvar
     *     The enterupperpaneforceredrawvar
     */
    @JsonProperty("enterupperpaneforceredrawvar")
    public void setEnterupperpaneforceredrawvar(Boolean enterupperpaneforceredrawvar) {
        this.enterupperpaneforceredrawvar = enterupperpaneforceredrawvar;
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
     *     The employeetransactiontypevar
     */
    @JsonProperty("employeetransactiontypevar")
    public String getEmployeetransactiontypevar() {
        return employeetransactiontypevar;
    }

    /**
     * 
     * @param employeetransactiontypevar
     *     The employeetransactiontypevar
     */
    @JsonProperty("employeetransactiontypevar")
    public void setEmployeetransactiontypevar(String employeetransactiontypevar) {
        this.employeetransactiontypevar = employeetransactiontypevar;
    }

    /**
     * 
     * @return
     *     The employeemaxworkingtimeperdayvar
     */
    @JsonProperty("employeemaxworkingtimeperdayvar")
    public Integer getEmployeemaxworkingtimeperdayvar() {
        return employeemaxworkingtimeperdayvar;
    }

    /**
     * 
     * @param employeemaxworkingtimeperdayvar
     *     The employeemaxworkingtimeperdayvar
     */
    @JsonProperty("employeemaxworkingtimeperdayvar")
    public void setEmployeemaxworkingtimeperdayvar(Integer employeemaxworkingtimeperdayvar) {
        this.employeemaxworkingtimeperdayvar = employeemaxworkingtimeperdayvar;
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

    /**
     * 
     * @return
     *     The expectedworkingtimenumbervar
     */
    @JsonProperty("expectedworkingtimenumbervar")
    public Integer getExpectedworkingtimenumbervar() {
        return expectedworkingtimenumbervar;
    }

    /**
     * 
     * @param expectedworkingtimenumbervar
     *     The expectedworkingtimenumbervar
     */
    @JsonProperty("expectedworkingtimenumbervar")
    public void setExpectedworkingtimenumbervar(Integer expectedworkingtimenumbervar) {
        this.expectedworkingtimenumbervar = expectedworkingtimenumbervar;
    }

    /**
     * 
     * @return
     *     The fixedworkingtimeontimesheetsvar
     */
    @JsonProperty("fixedworkingtimeontimesheetsvar")
    public Boolean getFixedworkingtimeontimesheetsvar() {
        return fixedworkingtimeontimesheetsvar;
    }

    /**
     * 
     * @param fixedworkingtimeontimesheetsvar
     *     The fixedworkingtimeontimesheetsvar
     */
    @JsonProperty("fixedworkingtimeontimesheetsvar")
    public void setFixedworkingtimeontimesheetsvar(Boolean fixedworkingtimeontimesheetsvar) {
        this.fixedworkingtimeontimesheetsvar = fixedworkingtimeontimesheetsvar;
    }

    /**
     * 
     * @return
     *     The foundfixedworkingtimeontimesheetsvar
     */
    @JsonProperty("foundfixedworkingtimeontimesheetsvar")
    public Boolean getFoundfixedworkingtimeontimesheetsvar() {
        return foundfixedworkingtimeontimesheetsvar;
    }

    /**
     * 
     * @param foundfixedworkingtimeontimesheetsvar
     *     The foundfixedworkingtimeontimesheetsvar
     */
    @JsonProperty("foundfixedworkingtimeontimesheetsvar")
    public void setFoundfixedworkingtimeontimesheetsvar(Boolean foundfixedworkingtimeontimesheetsvar) {
        this.foundfixedworkingtimeontimesheetsvar = foundfixedworkingtimeontimesheetsvar;
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
        return new HashCodeBuilder().append(employeenumber).append(instancekey).append(transactiontimestamp).append(latestchangetodate).append(dateoflatestchange).append(timeoflatestchange).append(latestchangetoemployeenumber).append(currentemployeenumbervar).append(employeenumbervar).append(employeenamevar).append(datevar).append(timesheetstatusvar).append(timeexpectedvar).append(selectedtimesheetstatusvar).append(selectedtimeexpectedvar).append(isproxycurrentemployeevar).append(textforlinktojobfavoritesvar).append(favoritevar).append(registrationnotevar).append(numberofvar).append(dailydescriptionvar).append(totalnumbervar).append(copyfromdatevar).append(fixednumbervar).append(overtimenumbervar).append(workingtimenumbervar).append(workingtimetotalnumbervar).append(balancequantityvar).append(differencenumbervar).append(timeregistrationunitvar).append(timecheckedinexpectedvar).append(timecheckedoutexpectedvar).append(absencenumberexpectedvar).append(timecheckedinvar).append(timecheckedoutvar).append(absencenumbervar).append(popup1var).append(timesheetremark1var).append(timesheetremark2var).append(externaltimedaytotalvar).append(internaltimedaytotalvar).append(invoiceabletimedaytotalvar).append(approvedbyvar).append(approvedvar).append(titletimeproposedvar).append(departmentvar).append(dayvar).append(weekcalendarnumbervar).append(remark1var).append(remark2var).append(remark3var).append(remark4var).append(remark5var).append(numberofexpensesheetsvar).append(numberofmileagesheetsvar).append(employeesubcontractornumbervar).append(level1titlenovar).append(level2titlenovar).append(level3titlenovar).append(level4titlenovar).append(level5titlenovar).append(level1titlenamevar).append(level2titlenamevar).append(level3titlenamevar).append(level4titlenamevar).append(level5titlenamevar).append(invoiceablepercentagedayvar).append(noninvoiceablepercentagedayvar).append(periodstartvar).append(periodendvar).append(defaultjobnumbervar).append(defaultfavoritevar).append(resubmissionexplanationrequiredvar).append(resubmissionexplanationvar).append(checkinenabledvar).append(checkintimevar).append(checkintimeroundedvar).append(checkinbalancevar).append(inopenpostingperiodvar).append(openpostingperiodmessagevar).append(enterupperpaneforceredrawvar).append(employeecompanynumbervar).append(employeetransactiontypevar).append(employeemaxworkingtimeperdayvar).append(numberoflinesvar).append(expectedworkingtimenumbervar).append(fixedworkingtimeontimesheetsvar).append(foundfixedworkingtimeontimesheetsvar).append(additionalProperties).toHashCode();
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
        return new EqualsBuilder().append(employeenumber, rhs.employeenumber).append(instancekey, rhs.instancekey).append(transactiontimestamp, rhs.transactiontimestamp).append(latestchangetodate, rhs.latestchangetodate).append(dateoflatestchange, rhs.dateoflatestchange).append(timeoflatestchange, rhs.timeoflatestchange).append(latestchangetoemployeenumber, rhs.latestchangetoemployeenumber).append(currentemployeenumbervar, rhs.currentemployeenumbervar).append(employeenumbervar, rhs.employeenumbervar).append(employeenamevar, rhs.employeenamevar).append(datevar, rhs.datevar).append(timesheetstatusvar, rhs.timesheetstatusvar).append(timeexpectedvar, rhs.timeexpectedvar).append(selectedtimesheetstatusvar, rhs.selectedtimesheetstatusvar).append(selectedtimeexpectedvar, rhs.selectedtimeexpectedvar).append(isproxycurrentemployeevar, rhs.isproxycurrentemployeevar).append(textforlinktojobfavoritesvar, rhs.textforlinktojobfavoritesvar).append(favoritevar, rhs.favoritevar).append(registrationnotevar, rhs.registrationnotevar).append(numberofvar, rhs.numberofvar).append(dailydescriptionvar, rhs.dailydescriptionvar).append(totalnumbervar, rhs.totalnumbervar).append(copyfromdatevar, rhs.copyfromdatevar).append(fixednumbervar, rhs.fixednumbervar).append(overtimenumbervar, rhs.overtimenumbervar).append(workingtimenumbervar, rhs.workingtimenumbervar).append(workingtimetotalnumbervar, rhs.workingtimetotalnumbervar).append(balancequantityvar, rhs.balancequantityvar).append(differencenumbervar, rhs.differencenumbervar).append(timeregistrationunitvar, rhs.timeregistrationunitvar).append(timecheckedinexpectedvar, rhs.timecheckedinexpectedvar).append(timecheckedoutexpectedvar, rhs.timecheckedoutexpectedvar).append(absencenumberexpectedvar, rhs.absencenumberexpectedvar).append(timecheckedinvar, rhs.timecheckedinvar).append(timecheckedoutvar, rhs.timecheckedoutvar).append(absencenumbervar, rhs.absencenumbervar).append(popup1var, rhs.popup1var).append(timesheetremark1var, rhs.timesheetremark1var).append(timesheetremark2var, rhs.timesheetremark2var).append(externaltimedaytotalvar, rhs.externaltimedaytotalvar).append(internaltimedaytotalvar, rhs.internaltimedaytotalvar).append(invoiceabletimedaytotalvar, rhs.invoiceabletimedaytotalvar).append(approvedbyvar, rhs.approvedbyvar).append(approvedvar, rhs.approvedvar).append(titletimeproposedvar, rhs.titletimeproposedvar).append(departmentvar, rhs.departmentvar).append(dayvar, rhs.dayvar).append(weekcalendarnumbervar, rhs.weekcalendarnumbervar).append(remark1var, rhs.remark1var).append(remark2var, rhs.remark2var).append(remark3var, rhs.remark3var).append(remark4var, rhs.remark4var).append(remark5var, rhs.remark5var).append(numberofexpensesheetsvar, rhs.numberofexpensesheetsvar).append(numberofmileagesheetsvar, rhs.numberofmileagesheetsvar).append(employeesubcontractornumbervar, rhs.employeesubcontractornumbervar).append(level1titlenovar, rhs.level1titlenovar).append(level2titlenovar, rhs.level2titlenovar).append(level3titlenovar, rhs.level3titlenovar).append(level4titlenovar, rhs.level4titlenovar).append(level5titlenovar, rhs.level5titlenovar).append(level1titlenamevar, rhs.level1titlenamevar).append(level2titlenamevar, rhs.level2titlenamevar).append(level3titlenamevar, rhs.level3titlenamevar).append(level4titlenamevar, rhs.level4titlenamevar).append(level5titlenamevar, rhs.level5titlenamevar).append(invoiceablepercentagedayvar, rhs.invoiceablepercentagedayvar).append(noninvoiceablepercentagedayvar, rhs.noninvoiceablepercentagedayvar).append(periodstartvar, rhs.periodstartvar).append(periodendvar, rhs.periodendvar).append(defaultjobnumbervar, rhs.defaultjobnumbervar).append(defaultfavoritevar, rhs.defaultfavoritevar).append(resubmissionexplanationrequiredvar, rhs.resubmissionexplanationrequiredvar).append(resubmissionexplanationvar, rhs.resubmissionexplanationvar).append(checkinenabledvar, rhs.checkinenabledvar).append(checkintimevar, rhs.checkintimevar).append(checkintimeroundedvar, rhs.checkintimeroundedvar).append(checkinbalancevar, rhs.checkinbalancevar).append(inopenpostingperiodvar, rhs.inopenpostingperiodvar).append(openpostingperiodmessagevar, rhs.openpostingperiodmessagevar).append(enterupperpaneforceredrawvar, rhs.enterupperpaneforceredrawvar).append(employeecompanynumbervar, rhs.employeecompanynumbervar).append(employeetransactiontypevar, rhs.employeetransactiontypevar).append(employeemaxworkingtimeperdayvar, rhs.employeemaxworkingtimeperdayvar).append(numberoflinesvar, rhs.numberoflinesvar).append(expectedworkingtimenumbervar, rhs.expectedworkingtimenumbervar).append(fixedworkingtimeontimesheetsvar, rhs.fixedworkingtimeontimesheetsvar).append(foundfixedworkingtimeontimesheetsvar, rhs.foundfixedworkingtimeontimesheetsvar).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
