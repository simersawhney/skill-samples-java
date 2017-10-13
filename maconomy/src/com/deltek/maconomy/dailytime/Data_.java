
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
    "initvarsvar",
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
public class Data_ {

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
    private Integer invoiceablepercentagedayvar;
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
    @JsonProperty("initvarsvar")
    private Boolean initvarsvar;
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
    public Data_() {
    }

    /**
     * 
     * @param currentemployeenumbervar
     * @param timesheetremark2var
     * @param weekcalendarnumbervar
     * @param timecheckedoutexpectedvar
     * @param remark3var
     * @param initvarsvar
     * @param timecheckedinvar
     * @param remark1var
     * @param defaultjobnumbervar
     * @param level1titlenovar
     * @param latestchangetoemployeenumber
     * @param datevar
     * @param remark2var
     * @param employeenumber
     * @param level3titlenovar
     * @param inopenpostingperiodvar
     * @param level1titlenamevar
     * @param noninvoiceablepercentagedayvar
     * @param invoiceablepercentagedayvar
     * @param timeexpectedvar
     * @param approvedvar
     * @param selectedtimeexpectedvar
     * @param employeenumbervar
     * @param numberofexpensesheetsvar
     * @param internaltimedaytotalvar
     * @param fixedworkingtimeontimesheetsvar
     * @param dayvar
     * @param selectedtimesheetstatusvar
     * @param timeregistrationunitvar
     * @param timecheckedinexpectedvar
     * @param approvedbyvar
     * @param absencenumbervar
     * @param timesheetremark1var
     * @param numberofmileagesheetsvar
     * @param copyfromdatevar
     * @param totalnumbervar
     * @param invoiceabletimedaytotalvar
     * @param remark4var
     * @param differencenumbervar
     * @param absencenumberexpectedvar
     * @param fixednumbervar
     * @param transactiontimestamp
     * @param employeemaxworkingtimeperdayvar
     * @param dateoflatestchange
     * @param numberoflinesvar
     * @param timesheetstatusvar
     * @param instancekey
     * @param periodendvar
     * @param periodstartvar
     * @param numberofvar
     * @param dailydescriptionvar
     * @param timeoflatestchange
     * @param employeetransactiontypevar
     * @param foundfixedworkingtimeontimesheetsvar
     * @param defaultfavoritevar
     * @param balancequantityvar
     * @param popup1var
     * @param workingtimenumbervar
     * @param level2titlenovar
     * @param registrationnotevar
     * @param textforlinktojobfavoritesvar
     * @param workingtimetotalnumbervar
     * @param level3titlenamevar
     * @param overtimenumbervar
     * @param employeenamevar
     * @param timecheckedoutvar
     * @param employeecompanynumbervar
     * @param isproxycurrentemployeevar
     * @param latestchangetodate
     * @param externaltimedaytotalvar
     * @param level4titlenovar
     * @param level4titlenamevar
     * @param level2titlenamevar
     * @param level5titlenamevar
     * @param openpostingperiodmessagevar
     * @param remark5var
     * @param departmentvar
     * @param level5titlenovar
     * @param expectedworkingtimenumbervar
     * @param enterupperpaneforceredrawvar
     * @param favoritevar
     * @param titletimeproposedvar
     */
    public Data_(String employeenumber, String instancekey, String transactiontimestamp, String latestchangetodate, String dateoflatestchange, String timeoflatestchange, String latestchangetoemployeenumber, String currentemployeenumbervar, String employeenumbervar, String employeenamevar, String datevar, String timesheetstatusvar, String timeexpectedvar, String selectedtimesheetstatusvar, String selectedtimeexpectedvar, Boolean isproxycurrentemployeevar, String textforlinktojobfavoritesvar, String favoritevar, String registrationnotevar, Integer numberofvar, String dailydescriptionvar, Integer totalnumbervar, String copyfromdatevar, Integer fixednumbervar, Integer overtimenumbervar, Integer workingtimenumbervar, Integer workingtimetotalnumbervar, Integer balancequantityvar, Integer differencenumbervar, String timeregistrationunitvar, String timecheckedinexpectedvar, String timecheckedoutexpectedvar, Integer absencenumberexpectedvar, String timecheckedinvar, String timecheckedoutvar, Integer absencenumbervar, String popup1var, String timesheetremark1var, String timesheetremark2var, Integer externaltimedaytotalvar, Integer internaltimedaytotalvar, Integer invoiceabletimedaytotalvar, String approvedbyvar, Boolean approvedvar, String titletimeproposedvar, String departmentvar, String dayvar, String weekcalendarnumbervar, String remark1var, String remark2var, String remark3var, String remark4var, String remark5var, Integer numberofexpensesheetsvar, Integer numberofmileagesheetsvar, String level1titlenovar, String level2titlenovar, String level3titlenovar, String level4titlenovar, String level5titlenovar, String level1titlenamevar, String level2titlenamevar, String level3titlenamevar, String level4titlenamevar, String level5titlenamevar, Integer invoiceablepercentagedayvar, Integer noninvoiceablepercentagedayvar, String periodstartvar, String periodendvar, String defaultjobnumbervar, String defaultfavoritevar, Boolean initvarsvar, Boolean inopenpostingperiodvar, String openpostingperiodmessagevar, Boolean enterupperpaneforceredrawvar, String employeecompanynumbervar, String employeetransactiontypevar, Integer employeemaxworkingtimeperdayvar, Integer numberoflinesvar, Integer expectedworkingtimenumbervar, Boolean fixedworkingtimeontimesheetsvar, Boolean foundfixedworkingtimeontimesheetsvar) {
        super();
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
        this.initvarsvar = initvarsvar;
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

    @JsonProperty("employeenumber")
    public String getEmployeenumber() {
        return employeenumber;
    }

    @JsonProperty("employeenumber")
    public void setEmployeenumber(String employeenumber) {
        this.employeenumber = employeenumber;
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

    @JsonProperty("latestchangetodate")
    public String getLatestchangetodate() {
        return latestchangetodate;
    }

    @JsonProperty("latestchangetodate")
    public void setLatestchangetodate(String latestchangetodate) {
        this.latestchangetodate = latestchangetodate;
    }

    @JsonProperty("dateoflatestchange")
    public String getDateoflatestchange() {
        return dateoflatestchange;
    }

    @JsonProperty("dateoflatestchange")
    public void setDateoflatestchange(String dateoflatestchange) {
        this.dateoflatestchange = dateoflatestchange;
    }

    @JsonProperty("timeoflatestchange")
    public String getTimeoflatestchange() {
        return timeoflatestchange;
    }

    @JsonProperty("timeoflatestchange")
    public void setTimeoflatestchange(String timeoflatestchange) {
        this.timeoflatestchange = timeoflatestchange;
    }

    @JsonProperty("latestchangetoemployeenumber")
    public String getLatestchangetoemployeenumber() {
        return latestchangetoemployeenumber;
    }

    @JsonProperty("latestchangetoemployeenumber")
    public void setLatestchangetoemployeenumber(String latestchangetoemployeenumber) {
        this.latestchangetoemployeenumber = latestchangetoemployeenumber;
    }

    @JsonProperty("currentemployeenumbervar")
    public String getCurrentemployeenumbervar() {
        return currentemployeenumbervar;
    }

    @JsonProperty("currentemployeenumbervar")
    public void setCurrentemployeenumbervar(String currentemployeenumbervar) {
        this.currentemployeenumbervar = currentemployeenumbervar;
    }

    @JsonProperty("employeenumbervar")
    public String getEmployeenumbervar() {
        return employeenumbervar;
    }

    @JsonProperty("employeenumbervar")
    public void setEmployeenumbervar(String employeenumbervar) {
        this.employeenumbervar = employeenumbervar;
    }

    @JsonProperty("employeenamevar")
    public String getEmployeenamevar() {
        return employeenamevar;
    }

    @JsonProperty("employeenamevar")
    public void setEmployeenamevar(String employeenamevar) {
        this.employeenamevar = employeenamevar;
    }

    @JsonProperty("datevar")
    public String getDatevar() {
        return datevar;
    }

    @JsonProperty("datevar")
    public void setDatevar(String datevar) {
        this.datevar = datevar;
    }

    @JsonProperty("timesheetstatusvar")
    public String getTimesheetstatusvar() {
        return timesheetstatusvar;
    }

    @JsonProperty("timesheetstatusvar")
    public void setTimesheetstatusvar(String timesheetstatusvar) {
        this.timesheetstatusvar = timesheetstatusvar;
    }

    @JsonProperty("timeexpectedvar")
    public String getTimeexpectedvar() {
        return timeexpectedvar;
    }

    @JsonProperty("timeexpectedvar")
    public void setTimeexpectedvar(String timeexpectedvar) {
        this.timeexpectedvar = timeexpectedvar;
    }

    @JsonProperty("selectedtimesheetstatusvar")
    public String getSelectedtimesheetstatusvar() {
        return selectedtimesheetstatusvar;
    }

    @JsonProperty("selectedtimesheetstatusvar")
    public void setSelectedtimesheetstatusvar(String selectedtimesheetstatusvar) {
        this.selectedtimesheetstatusvar = selectedtimesheetstatusvar;
    }

    @JsonProperty("selectedtimeexpectedvar")
    public String getSelectedtimeexpectedvar() {
        return selectedtimeexpectedvar;
    }

    @JsonProperty("selectedtimeexpectedvar")
    public void setSelectedtimeexpectedvar(String selectedtimeexpectedvar) {
        this.selectedtimeexpectedvar = selectedtimeexpectedvar;
    }

    @JsonProperty("isproxycurrentemployeevar")
    public Boolean getIsproxycurrentemployeevar() {
        return isproxycurrentemployeevar;
    }

    @JsonProperty("isproxycurrentemployeevar")
    public void setIsproxycurrentemployeevar(Boolean isproxycurrentemployeevar) {
        this.isproxycurrentemployeevar = isproxycurrentemployeevar;
    }

    @JsonProperty("textforlinktojobfavoritesvar")
    public String getTextforlinktojobfavoritesvar() {
        return textforlinktojobfavoritesvar;
    }

    @JsonProperty("textforlinktojobfavoritesvar")
    public void setTextforlinktojobfavoritesvar(String textforlinktojobfavoritesvar) {
        this.textforlinktojobfavoritesvar = textforlinktojobfavoritesvar;
    }

    @JsonProperty("favoritevar")
    public String getFavoritevar() {
        return favoritevar;
    }

    @JsonProperty("favoritevar")
    public void setFavoritevar(String favoritevar) {
        this.favoritevar = favoritevar;
    }

    @JsonProperty("registrationnotevar")
    public String getRegistrationnotevar() {
        return registrationnotevar;
    }

    @JsonProperty("registrationnotevar")
    public void setRegistrationnotevar(String registrationnotevar) {
        this.registrationnotevar = registrationnotevar;
    }

    @JsonProperty("numberofvar")
    public Integer getNumberofvar() {
        return numberofvar;
    }

    @JsonProperty("numberofvar")
    public void setNumberofvar(Integer numberofvar) {
        this.numberofvar = numberofvar;
    }

    @JsonProperty("dailydescriptionvar")
    public String getDailydescriptionvar() {
        return dailydescriptionvar;
    }

    @JsonProperty("dailydescriptionvar")
    public void setDailydescriptionvar(String dailydescriptionvar) {
        this.dailydescriptionvar = dailydescriptionvar;
    }

    @JsonProperty("totalnumbervar")
    public Integer getTotalnumbervar() {
        return totalnumbervar;
    }

    @JsonProperty("totalnumbervar")
    public void setTotalnumbervar(Integer totalnumbervar) {
        this.totalnumbervar = totalnumbervar;
    }

    @JsonProperty("copyfromdatevar")
    public String getCopyfromdatevar() {
        return copyfromdatevar;
    }

    @JsonProperty("copyfromdatevar")
    public void setCopyfromdatevar(String copyfromdatevar) {
        this.copyfromdatevar = copyfromdatevar;
    }

    @JsonProperty("fixednumbervar")
    public Integer getFixednumbervar() {
        return fixednumbervar;
    }

    @JsonProperty("fixednumbervar")
    public void setFixednumbervar(Integer fixednumbervar) {
        this.fixednumbervar = fixednumbervar;
    }

    @JsonProperty("overtimenumbervar")
    public Integer getOvertimenumbervar() {
        return overtimenumbervar;
    }

    @JsonProperty("overtimenumbervar")
    public void setOvertimenumbervar(Integer overtimenumbervar) {
        this.overtimenumbervar = overtimenumbervar;
    }

    @JsonProperty("workingtimenumbervar")
    public Integer getWorkingtimenumbervar() {
        return workingtimenumbervar;
    }

    @JsonProperty("workingtimenumbervar")
    public void setWorkingtimenumbervar(Integer workingtimenumbervar) {
        this.workingtimenumbervar = workingtimenumbervar;
    }

    @JsonProperty("workingtimetotalnumbervar")
    public Integer getWorkingtimetotalnumbervar() {
        return workingtimetotalnumbervar;
    }

    @JsonProperty("workingtimetotalnumbervar")
    public void setWorkingtimetotalnumbervar(Integer workingtimetotalnumbervar) {
        this.workingtimetotalnumbervar = workingtimetotalnumbervar;
    }

    @JsonProperty("balancequantityvar")
    public Integer getBalancequantityvar() {
        return balancequantityvar;
    }

    @JsonProperty("balancequantityvar")
    public void setBalancequantityvar(Integer balancequantityvar) {
        this.balancequantityvar = balancequantityvar;
    }

    @JsonProperty("differencenumbervar")
    public Integer getDifferencenumbervar() {
        return differencenumbervar;
    }

    @JsonProperty("differencenumbervar")
    public void setDifferencenumbervar(Integer differencenumbervar) {
        this.differencenumbervar = differencenumbervar;
    }

    @JsonProperty("timeregistrationunitvar")
    public String getTimeregistrationunitvar() {
        return timeregistrationunitvar;
    }

    @JsonProperty("timeregistrationunitvar")
    public void setTimeregistrationunitvar(String timeregistrationunitvar) {
        this.timeregistrationunitvar = timeregistrationunitvar;
    }

    @JsonProperty("timecheckedinexpectedvar")
    public String getTimecheckedinexpectedvar() {
        return timecheckedinexpectedvar;
    }

    @JsonProperty("timecheckedinexpectedvar")
    public void setTimecheckedinexpectedvar(String timecheckedinexpectedvar) {
        this.timecheckedinexpectedvar = timecheckedinexpectedvar;
    }

    @JsonProperty("timecheckedoutexpectedvar")
    public String getTimecheckedoutexpectedvar() {
        return timecheckedoutexpectedvar;
    }

    @JsonProperty("timecheckedoutexpectedvar")
    public void setTimecheckedoutexpectedvar(String timecheckedoutexpectedvar) {
        this.timecheckedoutexpectedvar = timecheckedoutexpectedvar;
    }

    @JsonProperty("absencenumberexpectedvar")
    public Integer getAbsencenumberexpectedvar() {
        return absencenumberexpectedvar;
    }

    @JsonProperty("absencenumberexpectedvar")
    public void setAbsencenumberexpectedvar(Integer absencenumberexpectedvar) {
        this.absencenumberexpectedvar = absencenumberexpectedvar;
    }

    @JsonProperty("timecheckedinvar")
    public String getTimecheckedinvar() {
        return timecheckedinvar;
    }

    @JsonProperty("timecheckedinvar")
    public void setTimecheckedinvar(String timecheckedinvar) {
        this.timecheckedinvar = timecheckedinvar;
    }

    @JsonProperty("timecheckedoutvar")
    public String getTimecheckedoutvar() {
        return timecheckedoutvar;
    }

    @JsonProperty("timecheckedoutvar")
    public void setTimecheckedoutvar(String timecheckedoutvar) {
        this.timecheckedoutvar = timecheckedoutvar;
    }

    @JsonProperty("absencenumbervar")
    public Integer getAbsencenumbervar() {
        return absencenumbervar;
    }

    @JsonProperty("absencenumbervar")
    public void setAbsencenumbervar(Integer absencenumbervar) {
        this.absencenumbervar = absencenumbervar;
    }

    @JsonProperty("popup1var")
    public String getPopup1var() {
        return popup1var;
    }

    @JsonProperty("popup1var")
    public void setPopup1var(String popup1var) {
        this.popup1var = popup1var;
    }

    @JsonProperty("timesheetremark1var")
    public String getTimesheetremark1var() {
        return timesheetremark1var;
    }

    @JsonProperty("timesheetremark1var")
    public void setTimesheetremark1var(String timesheetremark1var) {
        this.timesheetremark1var = timesheetremark1var;
    }

    @JsonProperty("timesheetremark2var")
    public String getTimesheetremark2var() {
        return timesheetremark2var;
    }

    @JsonProperty("timesheetremark2var")
    public void setTimesheetremark2var(String timesheetremark2var) {
        this.timesheetremark2var = timesheetremark2var;
    }

    @JsonProperty("externaltimedaytotalvar")
    public Integer getExternaltimedaytotalvar() {
        return externaltimedaytotalvar;
    }

    @JsonProperty("externaltimedaytotalvar")
    public void setExternaltimedaytotalvar(Integer externaltimedaytotalvar) {
        this.externaltimedaytotalvar = externaltimedaytotalvar;
    }

    @JsonProperty("internaltimedaytotalvar")
    public Integer getInternaltimedaytotalvar() {
        return internaltimedaytotalvar;
    }

    @JsonProperty("internaltimedaytotalvar")
    public void setInternaltimedaytotalvar(Integer internaltimedaytotalvar) {
        this.internaltimedaytotalvar = internaltimedaytotalvar;
    }

    @JsonProperty("invoiceabletimedaytotalvar")
    public Integer getInvoiceabletimedaytotalvar() {
        return invoiceabletimedaytotalvar;
    }

    @JsonProperty("invoiceabletimedaytotalvar")
    public void setInvoiceabletimedaytotalvar(Integer invoiceabletimedaytotalvar) {
        this.invoiceabletimedaytotalvar = invoiceabletimedaytotalvar;
    }

    @JsonProperty("approvedbyvar")
    public String getApprovedbyvar() {
        return approvedbyvar;
    }

    @JsonProperty("approvedbyvar")
    public void setApprovedbyvar(String approvedbyvar) {
        this.approvedbyvar = approvedbyvar;
    }

    @JsonProperty("approvedvar")
    public Boolean getApprovedvar() {
        return approvedvar;
    }

    @JsonProperty("approvedvar")
    public void setApprovedvar(Boolean approvedvar) {
        this.approvedvar = approvedvar;
    }

    @JsonProperty("titletimeproposedvar")
    public String getTitletimeproposedvar() {
        return titletimeproposedvar;
    }

    @JsonProperty("titletimeproposedvar")
    public void setTitletimeproposedvar(String titletimeproposedvar) {
        this.titletimeproposedvar = titletimeproposedvar;
    }

    @JsonProperty("departmentvar")
    public String getDepartmentvar() {
        return departmentvar;
    }

    @JsonProperty("departmentvar")
    public void setDepartmentvar(String departmentvar) {
        this.departmentvar = departmentvar;
    }

    @JsonProperty("dayvar")
    public String getDayvar() {
        return dayvar;
    }

    @JsonProperty("dayvar")
    public void setDayvar(String dayvar) {
        this.dayvar = dayvar;
    }

    @JsonProperty("weekcalendarnumbervar")
    public String getWeekcalendarnumbervar() {
        return weekcalendarnumbervar;
    }

    @JsonProperty("weekcalendarnumbervar")
    public void setWeekcalendarnumbervar(String weekcalendarnumbervar) {
        this.weekcalendarnumbervar = weekcalendarnumbervar;
    }

    @JsonProperty("remark1var")
    public String getRemark1var() {
        return remark1var;
    }

    @JsonProperty("remark1var")
    public void setRemark1var(String remark1var) {
        this.remark1var = remark1var;
    }

    @JsonProperty("remark2var")
    public String getRemark2var() {
        return remark2var;
    }

    @JsonProperty("remark2var")
    public void setRemark2var(String remark2var) {
        this.remark2var = remark2var;
    }

    @JsonProperty("remark3var")
    public String getRemark3var() {
        return remark3var;
    }

    @JsonProperty("remark3var")
    public void setRemark3var(String remark3var) {
        this.remark3var = remark3var;
    }

    @JsonProperty("remark4var")
    public String getRemark4var() {
        return remark4var;
    }

    @JsonProperty("remark4var")
    public void setRemark4var(String remark4var) {
        this.remark4var = remark4var;
    }

    @JsonProperty("remark5var")
    public String getRemark5var() {
        return remark5var;
    }

    @JsonProperty("remark5var")
    public void setRemark5var(String remark5var) {
        this.remark5var = remark5var;
    }

    @JsonProperty("numberofexpensesheetsvar")
    public Integer getNumberofexpensesheetsvar() {
        return numberofexpensesheetsvar;
    }

    @JsonProperty("numberofexpensesheetsvar")
    public void setNumberofexpensesheetsvar(Integer numberofexpensesheetsvar) {
        this.numberofexpensesheetsvar = numberofexpensesheetsvar;
    }

    @JsonProperty("numberofmileagesheetsvar")
    public Integer getNumberofmileagesheetsvar() {
        return numberofmileagesheetsvar;
    }

    @JsonProperty("numberofmileagesheetsvar")
    public void setNumberofmileagesheetsvar(Integer numberofmileagesheetsvar) {
        this.numberofmileagesheetsvar = numberofmileagesheetsvar;
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

    @JsonProperty("invoiceablepercentagedayvar")
    public Integer getInvoiceablepercentagedayvar() {
        return invoiceablepercentagedayvar;
    }

    @JsonProperty("invoiceablepercentagedayvar")
    public void setInvoiceablepercentagedayvar(Integer invoiceablepercentagedayvar) {
        this.invoiceablepercentagedayvar = invoiceablepercentagedayvar;
    }

    @JsonProperty("noninvoiceablepercentagedayvar")
    public Integer getNoninvoiceablepercentagedayvar() {
        return noninvoiceablepercentagedayvar;
    }

    @JsonProperty("noninvoiceablepercentagedayvar")
    public void setNoninvoiceablepercentagedayvar(Integer noninvoiceablepercentagedayvar) {
        this.noninvoiceablepercentagedayvar = noninvoiceablepercentagedayvar;
    }

    @JsonProperty("periodstartvar")
    public String getPeriodstartvar() {
        return periodstartvar;
    }

    @JsonProperty("periodstartvar")
    public void setPeriodstartvar(String periodstartvar) {
        this.periodstartvar = periodstartvar;
    }

    @JsonProperty("periodendvar")
    public String getPeriodendvar() {
        return periodendvar;
    }

    @JsonProperty("periodendvar")
    public void setPeriodendvar(String periodendvar) {
        this.periodendvar = periodendvar;
    }

    @JsonProperty("defaultjobnumbervar")
    public String getDefaultjobnumbervar() {
        return defaultjobnumbervar;
    }

    @JsonProperty("defaultjobnumbervar")
    public void setDefaultjobnumbervar(String defaultjobnumbervar) {
        this.defaultjobnumbervar = defaultjobnumbervar;
    }

    @JsonProperty("defaultfavoritevar")
    public String getDefaultfavoritevar() {
        return defaultfavoritevar;
    }

    @JsonProperty("defaultfavoritevar")
    public void setDefaultfavoritevar(String defaultfavoritevar) {
        this.defaultfavoritevar = defaultfavoritevar;
    }

    @JsonProperty("initvarsvar")
    public Boolean getInitvarsvar() {
        return initvarsvar;
    }

    @JsonProperty("initvarsvar")
    public void setInitvarsvar(Boolean initvarsvar) {
        this.initvarsvar = initvarsvar;
    }

    @JsonProperty("inopenpostingperiodvar")
    public Boolean getInopenpostingperiodvar() {
        return inopenpostingperiodvar;
    }

    @JsonProperty("inopenpostingperiodvar")
    public void setInopenpostingperiodvar(Boolean inopenpostingperiodvar) {
        this.inopenpostingperiodvar = inopenpostingperiodvar;
    }

    @JsonProperty("openpostingperiodmessagevar")
    public String getOpenpostingperiodmessagevar() {
        return openpostingperiodmessagevar;
    }

    @JsonProperty("openpostingperiodmessagevar")
    public void setOpenpostingperiodmessagevar(String openpostingperiodmessagevar) {
        this.openpostingperiodmessagevar = openpostingperiodmessagevar;
    }

    @JsonProperty("enterupperpaneforceredrawvar")
    public Boolean getEnterupperpaneforceredrawvar() {
        return enterupperpaneforceredrawvar;
    }

    @JsonProperty("enterupperpaneforceredrawvar")
    public void setEnterupperpaneforceredrawvar(Boolean enterupperpaneforceredrawvar) {
        this.enterupperpaneforceredrawvar = enterupperpaneforceredrawvar;
    }

    @JsonProperty("employeecompanynumbervar")
    public String getEmployeecompanynumbervar() {
        return employeecompanynumbervar;
    }

    @JsonProperty("employeecompanynumbervar")
    public void setEmployeecompanynumbervar(String employeecompanynumbervar) {
        this.employeecompanynumbervar = employeecompanynumbervar;
    }

    @JsonProperty("employeetransactiontypevar")
    public String getEmployeetransactiontypevar() {
        return employeetransactiontypevar;
    }

    @JsonProperty("employeetransactiontypevar")
    public void setEmployeetransactiontypevar(String employeetransactiontypevar) {
        this.employeetransactiontypevar = employeetransactiontypevar;
    }

    @JsonProperty("employeemaxworkingtimeperdayvar")
    public Integer getEmployeemaxworkingtimeperdayvar() {
        return employeemaxworkingtimeperdayvar;
    }

    @JsonProperty("employeemaxworkingtimeperdayvar")
    public void setEmployeemaxworkingtimeperdayvar(Integer employeemaxworkingtimeperdayvar) {
        this.employeemaxworkingtimeperdayvar = employeemaxworkingtimeperdayvar;
    }

    @JsonProperty("numberoflinesvar")
    public Integer getNumberoflinesvar() {
        return numberoflinesvar;
    }

    @JsonProperty("numberoflinesvar")
    public void setNumberoflinesvar(Integer numberoflinesvar) {
        this.numberoflinesvar = numberoflinesvar;
    }

    @JsonProperty("expectedworkingtimenumbervar")
    public Integer getExpectedworkingtimenumbervar() {
        return expectedworkingtimenumbervar;
    }

    @JsonProperty("expectedworkingtimenumbervar")
    public void setExpectedworkingtimenumbervar(Integer expectedworkingtimenumbervar) {
        this.expectedworkingtimenumbervar = expectedworkingtimenumbervar;
    }

    @JsonProperty("fixedworkingtimeontimesheetsvar")
    public Boolean getFixedworkingtimeontimesheetsvar() {
        return fixedworkingtimeontimesheetsvar;
    }

    @JsonProperty("fixedworkingtimeontimesheetsvar")
    public void setFixedworkingtimeontimesheetsvar(Boolean fixedworkingtimeontimesheetsvar) {
        this.fixedworkingtimeontimesheetsvar = fixedworkingtimeontimesheetsvar;
    }

    @JsonProperty("foundfixedworkingtimeontimesheetsvar")
    public Boolean getFoundfixedworkingtimeontimesheetsvar() {
        return foundfixedworkingtimeontimesheetsvar;
    }

    @JsonProperty("foundfixedworkingtimeontimesheetsvar")
    public void setFoundfixedworkingtimeontimesheetsvar(Boolean foundfixedworkingtimeontimesheetsvar) {
        this.foundfixedworkingtimeontimesheetsvar = foundfixedworkingtimeontimesheetsvar;
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
        return new HashCodeBuilder().append(weekcalendarnumbervar).append(timesheetremark2var).append(currentemployeenumbervar).append(timecheckedoutexpectedvar).append(remark3var).append(initvarsvar).append(timecheckedinvar).append(remark1var).append(defaultjobnumbervar).append(level1titlenovar).append(datevar).append(latestchangetoemployeenumber).append(remark2var).append(employeenumber).append(level3titlenovar).append(inopenpostingperiodvar).append(level1titlenamevar).append(noninvoiceablepercentagedayvar).append(invoiceablepercentagedayvar).append(approvedvar).append(timeexpectedvar).append(selectedtimeexpectedvar).append(employeenumbervar).append(numberofexpensesheetsvar).append(internaltimedaytotalvar).append(fixedworkingtimeontimesheetsvar).append(dayvar).append(selectedtimesheetstatusvar).append(approvedbyvar).append(timecheckedinexpectedvar).append(timeregistrationunitvar).append(timesheetremark1var).append(absencenumbervar).append(numberofmileagesheetsvar).append(copyfromdatevar).append(invoiceabletimedaytotalvar).append(totalnumbervar).append(remark4var).append(additionalProperties).append(absencenumberexpectedvar).append(differencenumbervar).append(fixednumbervar).append(transactiontimestamp).append(employeemaxworkingtimeperdayvar).append(dateoflatestchange).append(numberoflinesvar).append(timesheetstatusvar).append(instancekey).append(periodendvar).append(periodstartvar).append(numberofvar).append(dailydescriptionvar).append(timeoflatestchange).append(employeetransactiontypevar).append(foundfixedworkingtimeontimesheetsvar).append(defaultfavoritevar).append(balancequantityvar).append(popup1var).append(workingtimenumbervar).append(level2titlenovar).append(registrationnotevar).append(workingtimetotalnumbervar).append(textforlinktojobfavoritesvar).append(level3titlenamevar).append(overtimenumbervar).append(employeenamevar).append(timecheckedoutvar).append(employeecompanynumbervar).append(isproxycurrentemployeevar).append(externaltimedaytotalvar).append(latestchangetodate).append(level4titlenovar).append(level4titlenamevar).append(level2titlenamevar).append(level5titlenamevar).append(openpostingperiodmessagevar).append(remark5var).append(departmentvar).append(level5titlenovar).append(expectedworkingtimenumbervar).append(enterupperpaneforceredrawvar).append(titletimeproposedvar).append(favoritevar).toHashCode();
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
        return new EqualsBuilder().append(weekcalendarnumbervar, rhs.weekcalendarnumbervar).append(timesheetremark2var, rhs.timesheetremark2var).append(currentemployeenumbervar, rhs.currentemployeenumbervar).append(timecheckedoutexpectedvar, rhs.timecheckedoutexpectedvar).append(remark3var, rhs.remark3var).append(initvarsvar, rhs.initvarsvar).append(timecheckedinvar, rhs.timecheckedinvar).append(remark1var, rhs.remark1var).append(defaultjobnumbervar, rhs.defaultjobnumbervar).append(level1titlenovar, rhs.level1titlenovar).append(datevar, rhs.datevar).append(latestchangetoemployeenumber, rhs.latestchangetoemployeenumber).append(remark2var, rhs.remark2var).append(employeenumber, rhs.employeenumber).append(level3titlenovar, rhs.level3titlenovar).append(inopenpostingperiodvar, rhs.inopenpostingperiodvar).append(level1titlenamevar, rhs.level1titlenamevar).append(noninvoiceablepercentagedayvar, rhs.noninvoiceablepercentagedayvar).append(invoiceablepercentagedayvar, rhs.invoiceablepercentagedayvar).append(approvedvar, rhs.approvedvar).append(timeexpectedvar, rhs.timeexpectedvar).append(selectedtimeexpectedvar, rhs.selectedtimeexpectedvar).append(employeenumbervar, rhs.employeenumbervar).append(numberofexpensesheetsvar, rhs.numberofexpensesheetsvar).append(internaltimedaytotalvar, rhs.internaltimedaytotalvar).append(fixedworkingtimeontimesheetsvar, rhs.fixedworkingtimeontimesheetsvar).append(dayvar, rhs.dayvar).append(selectedtimesheetstatusvar, rhs.selectedtimesheetstatusvar).append(approvedbyvar, rhs.approvedbyvar).append(timecheckedinexpectedvar, rhs.timecheckedinexpectedvar).append(timeregistrationunitvar, rhs.timeregistrationunitvar).append(timesheetremark1var, rhs.timesheetremark1var).append(absencenumbervar, rhs.absencenumbervar).append(numberofmileagesheetsvar, rhs.numberofmileagesheetsvar).append(copyfromdatevar, rhs.copyfromdatevar).append(invoiceabletimedaytotalvar, rhs.invoiceabletimedaytotalvar).append(totalnumbervar, rhs.totalnumbervar).append(remark4var, rhs.remark4var).append(additionalProperties, rhs.additionalProperties).append(absencenumberexpectedvar, rhs.absencenumberexpectedvar).append(differencenumbervar, rhs.differencenumbervar).append(fixednumbervar, rhs.fixednumbervar).append(transactiontimestamp, rhs.transactiontimestamp).append(employeemaxworkingtimeperdayvar, rhs.employeemaxworkingtimeperdayvar).append(dateoflatestchange, rhs.dateoflatestchange).append(numberoflinesvar, rhs.numberoflinesvar).append(timesheetstatusvar, rhs.timesheetstatusvar).append(instancekey, rhs.instancekey).append(periodendvar, rhs.periodendvar).append(periodstartvar, rhs.periodstartvar).append(numberofvar, rhs.numberofvar).append(dailydescriptionvar, rhs.dailydescriptionvar).append(timeoflatestchange, rhs.timeoflatestchange).append(employeetransactiontypevar, rhs.employeetransactiontypevar).append(foundfixedworkingtimeontimesheetsvar, rhs.foundfixedworkingtimeontimesheetsvar).append(defaultfavoritevar, rhs.defaultfavoritevar).append(balancequantityvar, rhs.balancequantityvar).append(popup1var, rhs.popup1var).append(workingtimenumbervar, rhs.workingtimenumbervar).append(level2titlenovar, rhs.level2titlenovar).append(registrationnotevar, rhs.registrationnotevar).append(workingtimetotalnumbervar, rhs.workingtimetotalnumbervar).append(textforlinktojobfavoritesvar, rhs.textforlinktojobfavoritesvar).append(level3titlenamevar, rhs.level3titlenamevar).append(overtimenumbervar, rhs.overtimenumbervar).append(employeenamevar, rhs.employeenamevar).append(timecheckedoutvar, rhs.timecheckedoutvar).append(employeecompanynumbervar, rhs.employeecompanynumbervar).append(isproxycurrentemployeevar, rhs.isproxycurrentemployeevar).append(externaltimedaytotalvar, rhs.externaltimedaytotalvar).append(latestchangetodate, rhs.latestchangetodate).append(level4titlenovar, rhs.level4titlenovar).append(level4titlenamevar, rhs.level4titlenamevar).append(level2titlenamevar, rhs.level2titlenamevar).append(level5titlenamevar, rhs.level5titlenamevar).append(openpostingperiodmessagevar, rhs.openpostingperiodmessagevar).append(remark5var, rhs.remark5var).append(departmentvar, rhs.departmentvar).append(level5titlenovar, rhs.level5titlenovar).append(expectedworkingtimenumbervar, rhs.expectedworkingtimenumbervar).append(enterupperpaneforceredrawvar, rhs.enterupperpaneforceredrawvar).append(titletimeproposedvar, rhs.titletimeproposedvar).append(favoritevar, rhs.favoritevar).isEquals();
    }

}
