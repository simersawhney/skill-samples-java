
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
    "linenumber",
    "thedate",
    "jobnumber",
    "activitynumber",
    "taskname",
    "numberof",
    "entrytext",
    "activitytype",
    "numbertransferred",
    "remark",
    "description",
    "internaljob",
    "locationname",
    "entityname",
    "projectname",
    "purposename",
    "localspec1name",
    "localspec2name",
    "localspec3name",
    "specification1name",
    "specification2name",
    "specification3name",
    "companynumber",
    "transferredforposting",
    "costtype",
    "approvedbysuperior",
    "releasedbysuperior",
    "uniquelinenumber",
    "permanentline",
    "plannedfortheperiod",
    "estimatedtimetocompletion",
    "executed",
    "instancekey",
    "overtimetype",
    "submitted",
    "favorite",
    "registrationnote",
    "estimatedtimetocompletionmandays",
    "dailydescription",
    "transactiontimestamp",
    "numberproposed",
    "transactiontype",
    "invoiceable",
    "billingpricecurrency",
    "billingpricebase",
    "billingpriceenterprise",
    "employeecategorynumber",
    "absencetype",
    "timeregistrationunit",
    "optionlistnumber1",
    "selectedoption1",
    "optionlistnumber2",
    "selectedoption2",
    "optionlistnumber3",
    "selectedoption3",
    "optionlistnumber4",
    "selectedoption4",
    "optionlistnumber5",
    "selectedoption5",
    "jobnamevar",
    "customernumbervar",
    "customernamevar",
    "taskdescriptionvar",
    "taskpathvar",
    "activitytextvar",
    "weeklineapprovalstatusvar",
    "weeklineapprovedorrejectedbyvar",
    "weeklineapprovaldatevar",
    "weeklinecommentprojectmanagervar",
    "tooltipjobvar",
    "tooltiptaskvar",
    "tooltiptasklinebreakvar",
    "tooltipactivityvar",
    "tooltipconclusionvar",
    "linedetailsvar",
    "linedetailstypevar",
    "usesdailydescriptionsvar",
    "billingpricetotalcurrencyvar",
    "billingpricetotalbasevar",
    "billingpricetotalenterprisevar",
    "expenseamountbasetotalvar",
    "mileageamountbasetotalvar",
    "mileagenumberoftotalvar",
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
    "weektextheaderinstancekeyvar",
    "daytextheaderinstancekeyvar",
    "weektextheaderhastextvar",
    "daytextheaderhastextvar"
})
public class Data {

    @JsonProperty("employeenumber")
    private String employeenumber;
    @JsonProperty("linenumber")
    private Integer linenumber;
    @JsonProperty("thedate")
    private String thedate;
    @JsonProperty("jobnumber")
    private String jobnumber;
    @JsonProperty("activitynumber")
    private String activitynumber;
    @JsonProperty("taskname")
    private String taskname;
    @JsonProperty("numberof")
    private Integer numberof;
    @JsonProperty("entrytext")
    private String entrytext;
    @JsonProperty("activitytype")
    private String activitytype;
    @JsonProperty("numbertransferred")
    private Integer numbertransferred;
    @JsonProperty("remark")
    private String remark;
    @JsonProperty("description")
    private String description;
    @JsonProperty("internaljob")
    private Boolean internaljob;
    @JsonProperty("locationname")
    private String locationname;
    @JsonProperty("entityname")
    private String entityname;
    @JsonProperty("projectname")
    private String projectname;
    @JsonProperty("purposename")
    private String purposename;
    @JsonProperty("localspec1name")
    private String localspec1name;
    @JsonProperty("localspec2name")
    private String localspec2name;
    @JsonProperty("localspec3name")
    private String localspec3name;
    @JsonProperty("specification1name")
    private String specification1name;
    @JsonProperty("specification2name")
    private String specification2name;
    @JsonProperty("specification3name")
    private String specification3name;
    @JsonProperty("companynumber")
    private String companynumber;
    @JsonProperty("transferredforposting")
    private Boolean transferredforposting;
    @JsonProperty("costtype")
    private String costtype;
    @JsonProperty("approvedbysuperior")
    private Boolean approvedbysuperior;
    @JsonProperty("releasedbysuperior")
    private Boolean releasedbysuperior;
    @JsonProperty("uniquelinenumber")
    private Integer uniquelinenumber;
    @JsonProperty("permanentline")
    private Boolean permanentline;
    @JsonProperty("plannedfortheperiod")
    private Integer plannedfortheperiod;
    @JsonProperty("estimatedtimetocompletion")
    private Integer estimatedtimetocompletion;
    @JsonProperty("executed")
    private Boolean executed;
    @JsonProperty("instancekey")
    private String instancekey;
    @JsonProperty("overtimetype")
    private String overtimetype;
    @JsonProperty("submitted")
    private Boolean submitted;
    @JsonProperty("favorite")
    private String favorite;
    @JsonProperty("registrationnote")
    private String registrationnote;
    @JsonProperty("estimatedtimetocompletionmandays")
    private Integer estimatedtimetocompletionmandays;
    @JsonProperty("dailydescription")
    private String dailydescription;
    @JsonProperty("transactiontimestamp")
    private String transactiontimestamp;
    @JsonProperty("numberproposed")
    private Integer numberproposed;
    @JsonProperty("transactiontype")
    private String transactiontype;
    @JsonProperty("invoiceable")
    private Boolean invoiceable;
    @JsonProperty("billingpricecurrency")
    private Integer billingpricecurrency;
    @JsonProperty("billingpricebase")
    private Integer billingpricebase;
    @JsonProperty("billingpriceenterprise")
    private Integer billingpriceenterprise;
    @JsonProperty("employeecategorynumber")
    private String employeecategorynumber;
    @JsonProperty("absencetype")
    private String absencetype;
    @JsonProperty("timeregistrationunit")
    private String timeregistrationunit;
    @JsonProperty("optionlistnumber1")
    private String optionlistnumber1;
    @JsonProperty("selectedoption1")
    private String selectedoption1;
    @JsonProperty("optionlistnumber2")
    private String optionlistnumber2;
    @JsonProperty("selectedoption2")
    private String selectedoption2;
    @JsonProperty("optionlistnumber3")
    private String optionlistnumber3;
    @JsonProperty("selectedoption3")
    private String selectedoption3;
    @JsonProperty("optionlistnumber4")
    private String optionlistnumber4;
    @JsonProperty("selectedoption4")
    private String selectedoption4;
    @JsonProperty("optionlistnumber5")
    private String optionlistnumber5;
    @JsonProperty("selectedoption5")
    private String selectedoption5;
    @JsonProperty("jobnamevar")
    private String jobnamevar;
    @JsonProperty("customernumbervar")
    private String customernumbervar;
    @JsonProperty("customernamevar")
    private String customernamevar;
    @JsonProperty("taskdescriptionvar")
    private String taskdescriptionvar;
    @JsonProperty("taskpathvar")
    private String taskpathvar;
    @JsonProperty("activitytextvar")
    private String activitytextvar;
    @JsonProperty("weeklineapprovalstatusvar")
    private String weeklineapprovalstatusvar;
    @JsonProperty("weeklineapprovedorrejectedbyvar")
    private String weeklineapprovedorrejectedbyvar;
    @JsonProperty("weeklineapprovaldatevar")
    private String weeklineapprovaldatevar;
    @JsonProperty("weeklinecommentprojectmanagervar")
    private String weeklinecommentprojectmanagervar;
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
    @JsonProperty("usesdailydescriptionsvar")
    private Boolean usesdailydescriptionsvar;
    @JsonProperty("billingpricetotalcurrencyvar")
    private Integer billingpricetotalcurrencyvar;
    @JsonProperty("billingpricetotalbasevar")
    private Integer billingpricetotalbasevar;
    @JsonProperty("billingpricetotalenterprisevar")
    private Integer billingpricetotalenterprisevar;
    @JsonProperty("expenseamountbasetotalvar")
    private Integer expenseamountbasetotalvar;
    @JsonProperty("mileageamountbasetotalvar")
    private Integer mileageamountbasetotalvar;
    @JsonProperty("mileagenumberoftotalvar")
    private Integer mileagenumberoftotalvar;
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
    @JsonProperty("weektextheaderinstancekeyvar")
    private String weektextheaderinstancekeyvar;
    @JsonProperty("daytextheaderinstancekeyvar")
    private String daytextheaderinstancekeyvar;
    @JsonProperty("weektextheaderhastextvar")
    private Boolean weektextheaderhastextvar;
    @JsonProperty("daytextheaderhastextvar")
    private Boolean daytextheaderhastextvar;
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
     * @param weeklineapprovedorrejectedbyvar
     * @param billingpricebase
     * @param transactiontype
     * @param customernumbervar
     * @param releasedbysuperior
     * @param employeenumber
     * @param activitytype
     * @param estimatedtimetocompletionmandays
     * @param billingpricetotalbasevar
     * @param submitted
     * @param customernamevar
     * @param level5customernamevar
     * @param projectname
     * @param favorite
     * @param weeklineapprovaldatevar
     * @param registrationnote
     * @param localspec1name
     * @param entityname
     * @param invoiceable
     * @param transactiontimestamp
     * @param entrytext
     * @param weektextheaderhastextvar
     * @param instancekey
     * @param permanentline
     * @param level3customernumbervar
     * @param executed
     * @param activitytextvar
     * @param internaljob
     * @param usesdailydescriptionsvar
     * @param level1customernamevar
     * @param tooltipconclusionvar
     * @param tooltipjobvar
     * @param specification1name
     * @param specification3name
     * @param expenseamountbasetotalvar
     * @param level4customernumbervar
     * @param specification2name
     * @param plannedfortheperiod
     * @param purposename
     * @param localspec3name
     * @param billingpricetotalcurrencyvar
     * @param mileagenumberoftotalvar
     * @param uniquelinenumber
     * @param taskname
     * @param level4customernamevar
     * @param weektextheaderinstancekeyvar
     * @param remark
     * @param level2customernumbervar
     * @param numberproposed
     * @param linenumber
     * @param level1customernumbervar
     * @param description
     * @param level2customernamevar
     * @param jobnamevar
     * @param billingpricetotalenterprisevar
     * @param taskpathvar
     * @param level5customernumbervar
     * @param dailydescription
     * @param overtimetype
     * @param companynumber
     * @param approvedbysuperior
     * @param employeecategorynumber
     * @param weeklinecommentprojectmanagervar
     * @param timeregistrationunit
     * @param costtype
     * @param estimatedtimetocompletion
     * @param selectedoption5
     * @param selectedoption4
     * @param optionlistnumber4
     * @param optionlistnumber5
     * @param billingpriceenterprise
     * @param selectedoption1
     * @param daytextheaderhastextvar
     * @param selectedoption3
     * @param tooltipactivityvar
     * @param billingpricecurrency
     * @param selectedoption2
     * @param optionlistnumber2
     * @param optionlistnumber3
     * @param optionlistnumber1
     * @param numberof
     * @param customerlevelnamevar
     * @param thedate
     * @param locationname
     * @param mileageamountbasetotalvar
     * @param level3customernamevar
     * @param tooltiptasklinebreakvar
     * @param transferredforposting
     * @param activitynumber
     * @param localspec2name
     * @param daytextheaderinstancekeyvar
     * @param tooltiptaskvar
     * @param numbertransferred
     * @param jobnumber
     * @param linedetailsvar
     * @param absencetype
     * @param linedetailstypevar
     * @param weeklineapprovalstatusvar
     * @param taskdescriptionvar
     */
    public Data(String employeenumber, Integer linenumber, String thedate, String jobnumber, String activitynumber, String taskname, Integer numberof, String entrytext, String activitytype, Integer numbertransferred, String remark, String description, Boolean internaljob, String locationname, String entityname, String projectname, String purposename, String localspec1name, String localspec2name, String localspec3name, String specification1name, String specification2name, String specification3name, String companynumber, Boolean transferredforposting, String costtype, Boolean approvedbysuperior, Boolean releasedbysuperior, Integer uniquelinenumber, Boolean permanentline, Integer plannedfortheperiod, Integer estimatedtimetocompletion, Boolean executed, String instancekey, String overtimetype, Boolean submitted, String favorite, String registrationnote, Integer estimatedtimetocompletionmandays, String dailydescription, String transactiontimestamp, Integer numberproposed, String transactiontype, Boolean invoiceable, Integer billingpricecurrency, Integer billingpricebase, Integer billingpriceenterprise, String employeecategorynumber, String absencetype, String timeregistrationunit, String optionlistnumber1, String selectedoption1, String optionlistnumber2, String selectedoption2, String optionlistnumber3, String selectedoption3, String optionlistnumber4, String selectedoption4, String optionlistnumber5, String selectedoption5, String jobnamevar, String customernumbervar, String customernamevar, String taskdescriptionvar, String taskpathvar, String activitytextvar, String weeklineapprovalstatusvar, String weeklineapprovedorrejectedbyvar, String weeklineapprovaldatevar, String weeklinecommentprojectmanagervar, String tooltipjobvar, String tooltiptaskvar, String tooltiptasklinebreakvar, String tooltipactivityvar, String tooltipconclusionvar, String linedetailsvar, String linedetailstypevar, Boolean usesdailydescriptionsvar, Integer billingpricetotalcurrencyvar, Integer billingpricetotalbasevar, Integer billingpricetotalenterprisevar, Integer expenseamountbasetotalvar, Integer mileageamountbasetotalvar, Integer mileagenumberoftotalvar, String customerlevelnamevar, String level1customernumbervar, String level2customernumbervar, String level3customernumbervar, String level4customernumbervar, String level5customernumbervar, String level1customernamevar, String level2customernamevar, String level3customernamevar, String level4customernamevar, String level5customernamevar, String weektextheaderinstancekeyvar, String daytextheaderinstancekeyvar, Boolean weektextheaderhastextvar, Boolean daytextheaderhastextvar) {
        super();
        this.employeenumber = employeenumber;
        this.linenumber = linenumber;
        this.thedate = thedate;
        this.jobnumber = jobnumber;
        this.activitynumber = activitynumber;
        this.taskname = taskname;
        this.numberof = numberof;
        this.entrytext = entrytext;
        this.activitytype = activitytype;
        this.numbertransferred = numbertransferred;
        this.remark = remark;
        this.description = description;
        this.internaljob = internaljob;
        this.locationname = locationname;
        this.entityname = entityname;
        this.projectname = projectname;
        this.purposename = purposename;
        this.localspec1name = localspec1name;
        this.localspec2name = localspec2name;
        this.localspec3name = localspec3name;
        this.specification1name = specification1name;
        this.specification2name = specification2name;
        this.specification3name = specification3name;
        this.companynumber = companynumber;
        this.transferredforposting = transferredforposting;
        this.costtype = costtype;
        this.approvedbysuperior = approvedbysuperior;
        this.releasedbysuperior = releasedbysuperior;
        this.uniquelinenumber = uniquelinenumber;
        this.permanentline = permanentline;
        this.plannedfortheperiod = plannedfortheperiod;
        this.estimatedtimetocompletion = estimatedtimetocompletion;
        this.executed = executed;
        this.instancekey = instancekey;
        this.overtimetype = overtimetype;
        this.submitted = submitted;
        this.favorite = favorite;
        this.registrationnote = registrationnote;
        this.estimatedtimetocompletionmandays = estimatedtimetocompletionmandays;
        this.dailydescription = dailydescription;
        this.transactiontimestamp = transactiontimestamp;
        this.numberproposed = numberproposed;
        this.transactiontype = transactiontype;
        this.invoiceable = invoiceable;
        this.billingpricecurrency = billingpricecurrency;
        this.billingpricebase = billingpricebase;
        this.billingpriceenterprise = billingpriceenterprise;
        this.employeecategorynumber = employeecategorynumber;
        this.absencetype = absencetype;
        this.timeregistrationunit = timeregistrationunit;
        this.optionlistnumber1 = optionlistnumber1;
        this.selectedoption1 = selectedoption1;
        this.optionlistnumber2 = optionlistnumber2;
        this.selectedoption2 = selectedoption2;
        this.optionlistnumber3 = optionlistnumber3;
        this.selectedoption3 = selectedoption3;
        this.optionlistnumber4 = optionlistnumber4;
        this.selectedoption4 = selectedoption4;
        this.optionlistnumber5 = optionlistnumber5;
        this.selectedoption5 = selectedoption5;
        this.jobnamevar = jobnamevar;
        this.customernumbervar = customernumbervar;
        this.customernamevar = customernamevar;
        this.taskdescriptionvar = taskdescriptionvar;
        this.taskpathvar = taskpathvar;
        this.activitytextvar = activitytextvar;
        this.weeklineapprovalstatusvar = weeklineapprovalstatusvar;
        this.weeklineapprovedorrejectedbyvar = weeklineapprovedorrejectedbyvar;
        this.weeklineapprovaldatevar = weeklineapprovaldatevar;
        this.weeklinecommentprojectmanagervar = weeklinecommentprojectmanagervar;
        this.tooltipjobvar = tooltipjobvar;
        this.tooltiptaskvar = tooltiptaskvar;
        this.tooltiptasklinebreakvar = tooltiptasklinebreakvar;
        this.tooltipactivityvar = tooltipactivityvar;
        this.tooltipconclusionvar = tooltipconclusionvar;
        this.linedetailsvar = linedetailsvar;
        this.linedetailstypevar = linedetailstypevar;
        this.usesdailydescriptionsvar = usesdailydescriptionsvar;
        this.billingpricetotalcurrencyvar = billingpricetotalcurrencyvar;
        this.billingpricetotalbasevar = billingpricetotalbasevar;
        this.billingpricetotalenterprisevar = billingpricetotalenterprisevar;
        this.expenseamountbasetotalvar = expenseamountbasetotalvar;
        this.mileageamountbasetotalvar = mileageamountbasetotalvar;
        this.mileagenumberoftotalvar = mileagenumberoftotalvar;
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
        this.weektextheaderinstancekeyvar = weektextheaderinstancekeyvar;
        this.daytextheaderinstancekeyvar = daytextheaderinstancekeyvar;
        this.weektextheaderhastextvar = weektextheaderhastextvar;
        this.daytextheaderhastextvar = daytextheaderhastextvar;
    }

    @JsonProperty("employeenumber")
    public String getEmployeenumber() {
        return employeenumber;
    }

    @JsonProperty("employeenumber")
    public void setEmployeenumber(String employeenumber) {
        this.employeenumber = employeenumber;
    }

    @JsonProperty("linenumber")
    public Integer getLinenumber() {
        return linenumber;
    }

    @JsonProperty("linenumber")
    public void setLinenumber(Integer linenumber) {
        this.linenumber = linenumber;
    }

    @JsonProperty("thedate")
    public String getThedate() {
        return thedate;
    }

    @JsonProperty("thedate")
    public void setThedate(String thedate) {
        this.thedate = thedate;
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

    @JsonProperty("taskname")
    public String getTaskname() {
        return taskname;
    }

    @JsonProperty("taskname")
    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }

    @JsonProperty("numberof")
    public Integer getNumberof() {
        return numberof;
    }

    @JsonProperty("numberof")
    public void setNumberof(Integer numberof) {
        this.numberof = numberof;
    }

    @JsonProperty("entrytext")
    public String getEntrytext() {
        return entrytext;
    }

    @JsonProperty("entrytext")
    public void setEntrytext(String entrytext) {
        this.entrytext = entrytext;
    }

    @JsonProperty("activitytype")
    public String getActivitytype() {
        return activitytype;
    }

    @JsonProperty("activitytype")
    public void setActivitytype(String activitytype) {
        this.activitytype = activitytype;
    }

    @JsonProperty("numbertransferred")
    public Integer getNumbertransferred() {
        return numbertransferred;
    }

    @JsonProperty("numbertransferred")
    public void setNumbertransferred(Integer numbertransferred) {
        this.numbertransferred = numbertransferred;
    }

    @JsonProperty("remark")
    public String getRemark() {
        return remark;
    }

    @JsonProperty("remark")
    public void setRemark(String remark) {
        this.remark = remark;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("internaljob")
    public Boolean getInternaljob() {
        return internaljob;
    }

    @JsonProperty("internaljob")
    public void setInternaljob(Boolean internaljob) {
        this.internaljob = internaljob;
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

    @JsonProperty("companynumber")
    public String getCompanynumber() {
        return companynumber;
    }

    @JsonProperty("companynumber")
    public void setCompanynumber(String companynumber) {
        this.companynumber = companynumber;
    }

    @JsonProperty("transferredforposting")
    public Boolean getTransferredforposting() {
        return transferredforposting;
    }

    @JsonProperty("transferredforposting")
    public void setTransferredforposting(Boolean transferredforposting) {
        this.transferredforposting = transferredforposting;
    }

    @JsonProperty("costtype")
    public String getCosttype() {
        return costtype;
    }

    @JsonProperty("costtype")
    public void setCosttype(String costtype) {
        this.costtype = costtype;
    }

    @JsonProperty("approvedbysuperior")
    public Boolean getApprovedbysuperior() {
        return approvedbysuperior;
    }

    @JsonProperty("approvedbysuperior")
    public void setApprovedbysuperior(Boolean approvedbysuperior) {
        this.approvedbysuperior = approvedbysuperior;
    }

    @JsonProperty("releasedbysuperior")
    public Boolean getReleasedbysuperior() {
        return releasedbysuperior;
    }

    @JsonProperty("releasedbysuperior")
    public void setReleasedbysuperior(Boolean releasedbysuperior) {
        this.releasedbysuperior = releasedbysuperior;
    }

    @JsonProperty("uniquelinenumber")
    public Integer getUniquelinenumber() {
        return uniquelinenumber;
    }

    @JsonProperty("uniquelinenumber")
    public void setUniquelinenumber(Integer uniquelinenumber) {
        this.uniquelinenumber = uniquelinenumber;
    }

    @JsonProperty("permanentline")
    public Boolean getPermanentline() {
        return permanentline;
    }

    @JsonProperty("permanentline")
    public void setPermanentline(Boolean permanentline) {
        this.permanentline = permanentline;
    }

    @JsonProperty("plannedfortheperiod")
    public Integer getPlannedfortheperiod() {
        return plannedfortheperiod;
    }

    @JsonProperty("plannedfortheperiod")
    public void setPlannedfortheperiod(Integer plannedfortheperiod) {
        this.plannedfortheperiod = plannedfortheperiod;
    }

    @JsonProperty("estimatedtimetocompletion")
    public Integer getEstimatedtimetocompletion() {
        return estimatedtimetocompletion;
    }

    @JsonProperty("estimatedtimetocompletion")
    public void setEstimatedtimetocompletion(Integer estimatedtimetocompletion) {
        this.estimatedtimetocompletion = estimatedtimetocompletion;
    }

    @JsonProperty("executed")
    public Boolean getExecuted() {
        return executed;
    }

    @JsonProperty("executed")
    public void setExecuted(Boolean executed) {
        this.executed = executed;
    }

    @JsonProperty("instancekey")
    public String getInstancekey() {
        return instancekey;
    }

    @JsonProperty("instancekey")
    public void setInstancekey(String instancekey) {
        this.instancekey = instancekey;
    }

    @JsonProperty("overtimetype")
    public String getOvertimetype() {
        return overtimetype;
    }

    @JsonProperty("overtimetype")
    public void setOvertimetype(String overtimetype) {
        this.overtimetype = overtimetype;
    }

    @JsonProperty("submitted")
    public Boolean getSubmitted() {
        return submitted;
    }

    @JsonProperty("submitted")
    public void setSubmitted(Boolean submitted) {
        this.submitted = submitted;
    }

    @JsonProperty("favorite")
    public String getFavorite() {
        return favorite;
    }

    @JsonProperty("favorite")
    public void setFavorite(String favorite) {
        this.favorite = favorite;
    }

    @JsonProperty("registrationnote")
    public String getRegistrationnote() {
        return registrationnote;
    }

    @JsonProperty("registrationnote")
    public void setRegistrationnote(String registrationnote) {
        this.registrationnote = registrationnote;
    }

    @JsonProperty("estimatedtimetocompletionmandays")
    public Integer getEstimatedtimetocompletionmandays() {
        return estimatedtimetocompletionmandays;
    }

    @JsonProperty("estimatedtimetocompletionmandays")
    public void setEstimatedtimetocompletionmandays(Integer estimatedtimetocompletionmandays) {
        this.estimatedtimetocompletionmandays = estimatedtimetocompletionmandays;
    }

    @JsonProperty("dailydescription")
    public String getDailydescription() {
        return dailydescription;
    }

    @JsonProperty("dailydescription")
    public void setDailydescription(String dailydescription) {
        this.dailydescription = dailydescription;
    }

    @JsonProperty("transactiontimestamp")
    public String getTransactiontimestamp() {
        return transactiontimestamp;
    }

    @JsonProperty("transactiontimestamp")
    public void setTransactiontimestamp(String transactiontimestamp) {
        this.transactiontimestamp = transactiontimestamp;
    }

    @JsonProperty("numberproposed")
    public Integer getNumberproposed() {
        return numberproposed;
    }

    @JsonProperty("numberproposed")
    public void setNumberproposed(Integer numberproposed) {
        this.numberproposed = numberproposed;
    }

    @JsonProperty("transactiontype")
    public String getTransactiontype() {
        return transactiontype;
    }

    @JsonProperty("transactiontype")
    public void setTransactiontype(String transactiontype) {
        this.transactiontype = transactiontype;
    }

    @JsonProperty("invoiceable")
    public Boolean getInvoiceable() {
        return invoiceable;
    }

    @JsonProperty("invoiceable")
    public void setInvoiceable(Boolean invoiceable) {
        this.invoiceable = invoiceable;
    }

    @JsonProperty("billingpricecurrency")
    public Integer getBillingpricecurrency() {
        return billingpricecurrency;
    }

    @JsonProperty("billingpricecurrency")
    public void setBillingpricecurrency(Integer billingpricecurrency) {
        this.billingpricecurrency = billingpricecurrency;
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

    @JsonProperty("employeecategorynumber")
    public String getEmployeecategorynumber() {
        return employeecategorynumber;
    }

    @JsonProperty("employeecategorynumber")
    public void setEmployeecategorynumber(String employeecategorynumber) {
        this.employeecategorynumber = employeecategorynumber;
    }

    @JsonProperty("absencetype")
    public String getAbsencetype() {
        return absencetype;
    }

    @JsonProperty("absencetype")
    public void setAbsencetype(String absencetype) {
        this.absencetype = absencetype;
    }

    @JsonProperty("timeregistrationunit")
    public String getTimeregistrationunit() {
        return timeregistrationunit;
    }

    @JsonProperty("timeregistrationunit")
    public void setTimeregistrationunit(String timeregistrationunit) {
        this.timeregistrationunit = timeregistrationunit;
    }

    @JsonProperty("optionlistnumber1")
    public String getOptionlistnumber1() {
        return optionlistnumber1;
    }

    @JsonProperty("optionlistnumber1")
    public void setOptionlistnumber1(String optionlistnumber1) {
        this.optionlistnumber1 = optionlistnumber1;
    }

    @JsonProperty("selectedoption1")
    public String getSelectedoption1() {
        return selectedoption1;
    }

    @JsonProperty("selectedoption1")
    public void setSelectedoption1(String selectedoption1) {
        this.selectedoption1 = selectedoption1;
    }

    @JsonProperty("optionlistnumber2")
    public String getOptionlistnumber2() {
        return optionlistnumber2;
    }

    @JsonProperty("optionlistnumber2")
    public void setOptionlistnumber2(String optionlistnumber2) {
        this.optionlistnumber2 = optionlistnumber2;
    }

    @JsonProperty("selectedoption2")
    public String getSelectedoption2() {
        return selectedoption2;
    }

    @JsonProperty("selectedoption2")
    public void setSelectedoption2(String selectedoption2) {
        this.selectedoption2 = selectedoption2;
    }

    @JsonProperty("optionlistnumber3")
    public String getOptionlistnumber3() {
        return optionlistnumber3;
    }

    @JsonProperty("optionlistnumber3")
    public void setOptionlistnumber3(String optionlistnumber3) {
        this.optionlistnumber3 = optionlistnumber3;
    }

    @JsonProperty("selectedoption3")
    public String getSelectedoption3() {
        return selectedoption3;
    }

    @JsonProperty("selectedoption3")
    public void setSelectedoption3(String selectedoption3) {
        this.selectedoption3 = selectedoption3;
    }

    @JsonProperty("optionlistnumber4")
    public String getOptionlistnumber4() {
        return optionlistnumber4;
    }

    @JsonProperty("optionlistnumber4")
    public void setOptionlistnumber4(String optionlistnumber4) {
        this.optionlistnumber4 = optionlistnumber4;
    }

    @JsonProperty("selectedoption4")
    public String getSelectedoption4() {
        return selectedoption4;
    }

    @JsonProperty("selectedoption4")
    public void setSelectedoption4(String selectedoption4) {
        this.selectedoption4 = selectedoption4;
    }

    @JsonProperty("optionlistnumber5")
    public String getOptionlistnumber5() {
        return optionlistnumber5;
    }

    @JsonProperty("optionlistnumber5")
    public void setOptionlistnumber5(String optionlistnumber5) {
        this.optionlistnumber5 = optionlistnumber5;
    }

    @JsonProperty("selectedoption5")
    public String getSelectedoption5() {
        return selectedoption5;
    }

    @JsonProperty("selectedoption5")
    public void setSelectedoption5(String selectedoption5) {
        this.selectedoption5 = selectedoption5;
    }

    @JsonProperty("jobnamevar")
    public String getJobnamevar() {
        return jobnamevar;
    }

    @JsonProperty("jobnamevar")
    public void setJobnamevar(String jobnamevar) {
        this.jobnamevar = jobnamevar;
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

    @JsonProperty("taskdescriptionvar")
    public String getTaskdescriptionvar() {
        return taskdescriptionvar;
    }

    @JsonProperty("taskdescriptionvar")
    public void setTaskdescriptionvar(String taskdescriptionvar) {
        this.taskdescriptionvar = taskdescriptionvar;
    }

    @JsonProperty("taskpathvar")
    public String getTaskpathvar() {
        return taskpathvar;
    }

    @JsonProperty("taskpathvar")
    public void setTaskpathvar(String taskpathvar) {
        this.taskpathvar = taskpathvar;
    }

    @JsonProperty("activitytextvar")
    public String getActivitytextvar() {
        return activitytextvar;
    }

    @JsonProperty("activitytextvar")
    public void setActivitytextvar(String activitytextvar) {
        this.activitytextvar = activitytextvar;
    }

    @JsonProperty("weeklineapprovalstatusvar")
    public String getWeeklineapprovalstatusvar() {
        return weeklineapprovalstatusvar;
    }

    @JsonProperty("weeklineapprovalstatusvar")
    public void setWeeklineapprovalstatusvar(String weeklineapprovalstatusvar) {
        this.weeklineapprovalstatusvar = weeklineapprovalstatusvar;
    }

    @JsonProperty("weeklineapprovedorrejectedbyvar")
    public String getWeeklineapprovedorrejectedbyvar() {
        return weeklineapprovedorrejectedbyvar;
    }

    @JsonProperty("weeklineapprovedorrejectedbyvar")
    public void setWeeklineapprovedorrejectedbyvar(String weeklineapprovedorrejectedbyvar) {
        this.weeklineapprovedorrejectedbyvar = weeklineapprovedorrejectedbyvar;
    }

    @JsonProperty("weeklineapprovaldatevar")
    public String getWeeklineapprovaldatevar() {
        return weeklineapprovaldatevar;
    }

    @JsonProperty("weeklineapprovaldatevar")
    public void setWeeklineapprovaldatevar(String weeklineapprovaldatevar) {
        this.weeklineapprovaldatevar = weeklineapprovaldatevar;
    }

    @JsonProperty("weeklinecommentprojectmanagervar")
    public String getWeeklinecommentprojectmanagervar() {
        return weeklinecommentprojectmanagervar;
    }

    @JsonProperty("weeklinecommentprojectmanagervar")
    public void setWeeklinecommentprojectmanagervar(String weeklinecommentprojectmanagervar) {
        this.weeklinecommentprojectmanagervar = weeklinecommentprojectmanagervar;
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

    @JsonProperty("usesdailydescriptionsvar")
    public Boolean getUsesdailydescriptionsvar() {
        return usesdailydescriptionsvar;
    }

    @JsonProperty("usesdailydescriptionsvar")
    public void setUsesdailydescriptionsvar(Boolean usesdailydescriptionsvar) {
        this.usesdailydescriptionsvar = usesdailydescriptionsvar;
    }

    @JsonProperty("billingpricetotalcurrencyvar")
    public Integer getBillingpricetotalcurrencyvar() {
        return billingpricetotalcurrencyvar;
    }

    @JsonProperty("billingpricetotalcurrencyvar")
    public void setBillingpricetotalcurrencyvar(Integer billingpricetotalcurrencyvar) {
        this.billingpricetotalcurrencyvar = billingpricetotalcurrencyvar;
    }

    @JsonProperty("billingpricetotalbasevar")
    public Integer getBillingpricetotalbasevar() {
        return billingpricetotalbasevar;
    }

    @JsonProperty("billingpricetotalbasevar")
    public void setBillingpricetotalbasevar(Integer billingpricetotalbasevar) {
        this.billingpricetotalbasevar = billingpricetotalbasevar;
    }

    @JsonProperty("billingpricetotalenterprisevar")
    public Integer getBillingpricetotalenterprisevar() {
        return billingpricetotalenterprisevar;
    }

    @JsonProperty("billingpricetotalenterprisevar")
    public void setBillingpricetotalenterprisevar(Integer billingpricetotalenterprisevar) {
        this.billingpricetotalenterprisevar = billingpricetotalenterprisevar;
    }

    @JsonProperty("expenseamountbasetotalvar")
    public Integer getExpenseamountbasetotalvar() {
        return expenseamountbasetotalvar;
    }

    @JsonProperty("expenseamountbasetotalvar")
    public void setExpenseamountbasetotalvar(Integer expenseamountbasetotalvar) {
        this.expenseamountbasetotalvar = expenseamountbasetotalvar;
    }

    @JsonProperty("mileageamountbasetotalvar")
    public Integer getMileageamountbasetotalvar() {
        return mileageamountbasetotalvar;
    }

    @JsonProperty("mileageamountbasetotalvar")
    public void setMileageamountbasetotalvar(Integer mileageamountbasetotalvar) {
        this.mileageamountbasetotalvar = mileageamountbasetotalvar;
    }

    @JsonProperty("mileagenumberoftotalvar")
    public Integer getMileagenumberoftotalvar() {
        return mileagenumberoftotalvar;
    }

    @JsonProperty("mileagenumberoftotalvar")
    public void setMileagenumberoftotalvar(Integer mileagenumberoftotalvar) {
        this.mileagenumberoftotalvar = mileagenumberoftotalvar;
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

    @JsonProperty("weektextheaderinstancekeyvar")
    public String getWeektextheaderinstancekeyvar() {
        return weektextheaderinstancekeyvar;
    }

    @JsonProperty("weektextheaderinstancekeyvar")
    public void setWeektextheaderinstancekeyvar(String weektextheaderinstancekeyvar) {
        this.weektextheaderinstancekeyvar = weektextheaderinstancekeyvar;
    }

    @JsonProperty("daytextheaderinstancekeyvar")
    public String getDaytextheaderinstancekeyvar() {
        return daytextheaderinstancekeyvar;
    }

    @JsonProperty("daytextheaderinstancekeyvar")
    public void setDaytextheaderinstancekeyvar(String daytextheaderinstancekeyvar) {
        this.daytextheaderinstancekeyvar = daytextheaderinstancekeyvar;
    }

    @JsonProperty("weektextheaderhastextvar")
    public Boolean getWeektextheaderhastextvar() {
        return weektextheaderhastextvar;
    }

    @JsonProperty("weektextheaderhastextvar")
    public void setWeektextheaderhastextvar(Boolean weektextheaderhastextvar) {
        this.weektextheaderhastextvar = weektextheaderhastextvar;
    }

    @JsonProperty("daytextheaderhastextvar")
    public Boolean getDaytextheaderhastextvar() {
        return daytextheaderhastextvar;
    }

    @JsonProperty("daytextheaderhastextvar")
    public void setDaytextheaderhastextvar(Boolean daytextheaderhastextvar) {
        this.daytextheaderhastextvar = daytextheaderhastextvar;
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
        return new HashCodeBuilder().append(weeklineapprovedorrejectedbyvar).append(billingpricebase).append(transactiontype).append(customernumbervar).append(releasedbysuperior).append(employeenumber).append(activitytype).append(estimatedtimetocompletionmandays).append(billingpricetotalbasevar).append(customernamevar).append(submitted).append(level5customernamevar).append(projectname).append(favorite).append(weeklineapprovaldatevar).append(registrationnote).append(localspec1name).append(entityname).append(invoiceable).append(transactiontimestamp).append(entrytext).append(weektextheaderhastextvar).append(instancekey).append(permanentline).append(level3customernumbervar).append(executed).append(activitytextvar).append(usesdailydescriptionsvar).append(internaljob).append(level1customernamevar).append(tooltipconclusionvar).append(tooltipjobvar).append(specification1name).append(specification3name).append(expenseamountbasetotalvar).append(level4customernumbervar).append(specification2name).append(plannedfortheperiod).append(localspec3name).append(purposename).append(billingpricetotalcurrencyvar).append(mileagenumberoftotalvar).append(uniquelinenumber).append(taskname).append(level4customernamevar).append(weektextheaderinstancekeyvar).append(remark).append(level2customernumbervar).append(numberproposed).append(linenumber).append(level1customernumbervar).append(level2customernamevar).append(description).append(jobnamevar).append(billingpricetotalenterprisevar).append(taskpathvar).append(level5customernumbervar).append(dailydescription).append(overtimetype).append(companynumber).append(approvedbysuperior).append(employeecategorynumber).append(additionalProperties).append(weeklinecommentprojectmanagervar).append(timeregistrationunit).append(costtype).append(selectedoption5).append(estimatedtimetocompletion).append(selectedoption4).append(optionlistnumber4).append(optionlistnumber5).append(selectedoption1).append(billingpriceenterprise).append(daytextheaderhastextvar).append(tooltipactivityvar).append(selectedoption3).append(selectedoption2).append(billingpricecurrency).append(optionlistnumber2).append(optionlistnumber3).append(optionlistnumber1).append(numberof).append(customerlevelnamevar).append(thedate).append(level3customernamevar).append(mileageamountbasetotalvar).append(locationname).append(tooltiptasklinebreakvar).append(transferredforposting).append(activitynumber).append(localspec2name).append(daytextheaderinstancekeyvar).append(tooltiptaskvar).append(numbertransferred).append(jobnumber).append(linedetailsvar).append(linedetailstypevar).append(absencetype).append(weeklineapprovalstatusvar).append(taskdescriptionvar).toHashCode();
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
        return new EqualsBuilder().append(weeklineapprovedorrejectedbyvar, rhs.weeklineapprovedorrejectedbyvar).append(billingpricebase, rhs.billingpricebase).append(transactiontype, rhs.transactiontype).append(customernumbervar, rhs.customernumbervar).append(releasedbysuperior, rhs.releasedbysuperior).append(employeenumber, rhs.employeenumber).append(activitytype, rhs.activitytype).append(estimatedtimetocompletionmandays, rhs.estimatedtimetocompletionmandays).append(billingpricetotalbasevar, rhs.billingpricetotalbasevar).append(customernamevar, rhs.customernamevar).append(submitted, rhs.submitted).append(level5customernamevar, rhs.level5customernamevar).append(projectname, rhs.projectname).append(favorite, rhs.favorite).append(weeklineapprovaldatevar, rhs.weeklineapprovaldatevar).append(registrationnote, rhs.registrationnote).append(localspec1name, rhs.localspec1name).append(entityname, rhs.entityname).append(invoiceable, rhs.invoiceable).append(transactiontimestamp, rhs.transactiontimestamp).append(entrytext, rhs.entrytext).append(weektextheaderhastextvar, rhs.weektextheaderhastextvar).append(instancekey, rhs.instancekey).append(permanentline, rhs.permanentline).append(level3customernumbervar, rhs.level3customernumbervar).append(executed, rhs.executed).append(activitytextvar, rhs.activitytextvar).append(usesdailydescriptionsvar, rhs.usesdailydescriptionsvar).append(internaljob, rhs.internaljob).append(level1customernamevar, rhs.level1customernamevar).append(tooltipconclusionvar, rhs.tooltipconclusionvar).append(tooltipjobvar, rhs.tooltipjobvar).append(specification1name, rhs.specification1name).append(specification3name, rhs.specification3name).append(expenseamountbasetotalvar, rhs.expenseamountbasetotalvar).append(level4customernumbervar, rhs.level4customernumbervar).append(specification2name, rhs.specification2name).append(plannedfortheperiod, rhs.plannedfortheperiod).append(localspec3name, rhs.localspec3name).append(purposename, rhs.purposename).append(billingpricetotalcurrencyvar, rhs.billingpricetotalcurrencyvar).append(mileagenumberoftotalvar, rhs.mileagenumberoftotalvar).append(uniquelinenumber, rhs.uniquelinenumber).append(taskname, rhs.taskname).append(level4customernamevar, rhs.level4customernamevar).append(weektextheaderinstancekeyvar, rhs.weektextheaderinstancekeyvar).append(remark, rhs.remark).append(level2customernumbervar, rhs.level2customernumbervar).append(numberproposed, rhs.numberproposed).append(linenumber, rhs.linenumber).append(level1customernumbervar, rhs.level1customernumbervar).append(level2customernamevar, rhs.level2customernamevar).append(description, rhs.description).append(jobnamevar, rhs.jobnamevar).append(billingpricetotalenterprisevar, rhs.billingpricetotalenterprisevar).append(taskpathvar, rhs.taskpathvar).append(level5customernumbervar, rhs.level5customernumbervar).append(dailydescription, rhs.dailydescription).append(overtimetype, rhs.overtimetype).append(companynumber, rhs.companynumber).append(approvedbysuperior, rhs.approvedbysuperior).append(employeecategorynumber, rhs.employeecategorynumber).append(additionalProperties, rhs.additionalProperties).append(weeklinecommentprojectmanagervar, rhs.weeklinecommentprojectmanagervar).append(timeregistrationunit, rhs.timeregistrationunit).append(costtype, rhs.costtype).append(selectedoption5, rhs.selectedoption5).append(estimatedtimetocompletion, rhs.estimatedtimetocompletion).append(selectedoption4, rhs.selectedoption4).append(optionlistnumber4, rhs.optionlistnumber4).append(optionlistnumber5, rhs.optionlistnumber5).append(selectedoption1, rhs.selectedoption1).append(billingpriceenterprise, rhs.billingpriceenterprise).append(daytextheaderhastextvar, rhs.daytextheaderhastextvar).append(tooltipactivityvar, rhs.tooltipactivityvar).append(selectedoption3, rhs.selectedoption3).append(selectedoption2, rhs.selectedoption2).append(billingpricecurrency, rhs.billingpricecurrency).append(optionlistnumber2, rhs.optionlistnumber2).append(optionlistnumber3, rhs.optionlistnumber3).append(optionlistnumber1, rhs.optionlistnumber1).append(numberof, rhs.numberof).append(customerlevelnamevar, rhs.customerlevelnamevar).append(thedate, rhs.thedate).append(level3customernamevar, rhs.level3customernamevar).append(mileageamountbasetotalvar, rhs.mileageamountbasetotalvar).append(locationname, rhs.locationname).append(tooltiptasklinebreakvar, rhs.tooltiptasklinebreakvar).append(transferredforposting, rhs.transferredforposting).append(activitynumber, rhs.activitynumber).append(localspec2name, rhs.localspec2name).append(daytextheaderinstancekeyvar, rhs.daytextheaderinstancekeyvar).append(tooltiptaskvar, rhs.tooltiptaskvar).append(numbertransferred, rhs.numbertransferred).append(jobnumber, rhs.jobnumber).append(linedetailsvar, rhs.linedetailsvar).append(linedetailstypevar, rhs.linedetailstypevar).append(absencetype, rhs.absencetype).append(weeklineapprovalstatusvar, rhs.weeklineapprovalstatusvar).append(taskdescriptionvar, rhs.taskdescriptionvar).isEquals();
    }

}
