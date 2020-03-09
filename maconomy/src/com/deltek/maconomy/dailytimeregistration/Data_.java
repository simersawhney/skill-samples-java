
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
    "daytextheaderhastextvar",
    "timeroundingunitvar",
    "conversationinstancekeyvar",
    "starttime",
    "stoptime",
    "starttimemillis",
    "stoptimemillis",
    "totalelapsedtime",
    "timerrunning",
    "transferred",
    "timeremployeenumber",
    "timerdate",
    "timerstartdate",
    "timerenddate",
    "elapsedtime"
})
public class Data_ {

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
    private Double numberof;
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
    @JsonProperty("timeroundingunitvar")
    private Integer timeroundingunitvar;
    @JsonProperty("conversationinstancekeyvar")
    private String conversationinstancekeyvar;
    @JsonProperty("starttime")
    private String starttime;
    @JsonProperty("stoptime")
    private String stoptime;
    @JsonProperty("starttimemillis")
    private Integer starttimemillis;
    @JsonProperty("stoptimemillis")
    private Integer stoptimemillis;
    @JsonProperty("totalelapsedtime")
    private Integer totalelapsedtime;
    @JsonProperty("timerrunning")
    private Boolean timerrunning;
    @JsonProperty("transferred")
    private Boolean transferred;
    @JsonProperty("timeremployeenumber")
    private String timeremployeenumber;
    @JsonProperty("timerdate")
    private String timerdate;
    @JsonProperty("timerstartdate")
    private String timerstartdate;
    @JsonProperty("timerenddate")
    private String timerenddate;
    @JsonProperty("elapsedtime")
    private Integer elapsedtime;
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
     * @param customernumbervar
     * @param companynumber
     * @param taskname
     * @param absencetype
     * @param starttime
     * @param numberproposed
     * @param tooltipactivityvar
     * @param tooltiptaskvar
     * @param level3customernamevar
     * @param thedate
     * @param localspec4name
     * @param internaljob
     * @param specification4name
     * @param instancekey
     * @param specification8name
     * @param projectname
     * @param linedetailstypevar
     * @param releasedbysuperior
     * @param localspec10name
     * @param weektextheaderhastextvar
     * @param approvedbysuperior
     * @param taskdescriptionvar
     * @param mileageamountbasetotalvar
     * @param tooltiptasklinebreakvar
     * @param optionlistnumber1
     * @param localspec6name
     * @param optionlistnumber2
     * @param submitted
     * @param optionlistnumber3
     * @param purchaseorderlinenumber
     * @param jobnumber
     * @param timerenddate
     * @param activitynumber
     * @param costtype
     * @param optionlistnumber4
     * @param favorite
     * @param optionlistnumber5
     * @param level2customernumbervar
     * @param specification6name
     * @param weeklineapprovalstatusvar
     * @param timerdate
     * @param level4customernumbervar
     * @param level4customernamevar
     * @param specification1name
     * @param entityname
     * @param executed
     * @param localspec9name
     * @param expenseamountbasetotalvar
     * @param level5customernumbervar
     * @param transactiontype
     * @param starttimemillis
     * @param billingpricetotalbasevar
     * @param locationname
     * @param estimatedtimetocompletion
     * @param estimatedtimetocompletionmandays
     * @param billingpricetotalenterprisevar
     * @param localspec2name
     * @param weeklinecommentprojectmanagervar
     * @param specification3name
     * @param elapsedtime
     * @param level1customernumbervar
     * @param numberof
     * @param specification10name
     * @param activitytextvar
     * @param overtimetype
     * @param daytextheaderinstancekeyvar
     * @param plannedfortheperiod
     * @param mileagenumberoftotalvar
     * @param transferred
     * @param timeregistrationunit
     * @param localspec5name
     * @param timerstartdate
     * @param stoptime
     * @param specification5name
     * @param weeklineapprovaldatevar
     * @param transferredforposting
     * @param localspec3name
     * @param registrationnote
     * @param taskpathvar
     * @param timerrunning
     * @param billingpriceenterprise
     * @param invoiceable
     * @param localspec7name
     * @param level1customernamevar
     * @param conversationinstancekeyvar
     * @param timeremployeenumber
     * @param specification7name
     * @param jobnamevar
     * @param customerlevelnamevar
     * @param daytextheaderhastextvar
     * @param level2customernamevar
     * @param linedetailsvar
     * @param selectedoption2
     * @param linenumber
     * @param selectedoption3
     * @param weektextheaderinstancekeyvar
     * @param timeroundingunitvar
     * @param selectedoption1
     * @param tooltipjobvar
     * @param employeenumber
     * @param purchaseordernumber
     * @param purposename
     * @param selectedoption4
     * @param selectedoption5
     * @param description
     * @param remark
     * @param dailydescription
     * @param tooltipconclusionvar
     * @param stoptimemillis
     * @param billingpricetotalcurrencyvar
     * @param numbertransferred
     * @param billingpricebase
     * @param localspec8name
     * @param transactiontimestamp
     * @param weeklineapprovedorrejectedbyvar
     * @param usesdailydescriptionsvar
     * @param entrytext
     * @param uniquelinenumber
     * @param specification9name
     * @param activitytype
     * @param billingpricecurrency
     * @param level3customernumbervar
     * @param specification2name
     * @param employeecategorynumber
     * @param totalelapsedtime
     * @param level5customernamevar
     * @param localspec1name
     * @param permanentline
     * @param customernamevar
     */
    public Data_(String employeenumber, Integer linenumber, String thedate, String jobnumber, String activitynumber, String taskname, Double numberof, String entrytext, String activitytype, Integer numbertransferred, String remark, String description, Boolean internaljob, String locationname, String entityname, String projectname, String purposename, String localspec1name, String localspec2name, String localspec3name, String specification1name, String specification2name, String specification3name, String companynumber, Boolean transferredforposting, String costtype, Boolean approvedbysuperior, Boolean releasedbysuperior, Integer uniquelinenumber, Boolean permanentline, Integer plannedfortheperiod, Integer estimatedtimetocompletion, Boolean executed, String instancekey, String overtimetype, Boolean submitted, String favorite, String registrationnote, Integer estimatedtimetocompletionmandays, String dailydescription, String transactiontimestamp, Integer numberproposed, String transactiontype, Boolean invoiceable, Integer billingpricecurrency, Integer billingpricebase, Integer billingpriceenterprise, String employeecategorynumber, String absencetype, String timeregistrationunit, String optionlistnumber1, String selectedoption1, String optionlistnumber2, String selectedoption2, String optionlistnumber3, String selectedoption3, String optionlistnumber4, String selectedoption4, String optionlistnumber5, String selectedoption5, String specification4name, String specification5name, String specification6name, String specification7name, String specification8name, String specification9name, String specification10name, String localspec4name, String localspec5name, String localspec6name, String localspec7name, String localspec8name, String localspec9name, String localspec10name, String purchaseordernumber, Integer purchaseorderlinenumber, String jobnamevar, String customernumbervar, String customernamevar, String taskdescriptionvar, String taskpathvar, String activitytextvar, String weeklineapprovalstatusvar, String weeklineapprovedorrejectedbyvar, String weeklineapprovaldatevar, String weeklinecommentprojectmanagervar, String tooltipjobvar, String tooltiptaskvar, String tooltiptasklinebreakvar, String tooltipactivityvar, String tooltipconclusionvar, String linedetailsvar, String linedetailstypevar, Boolean usesdailydescriptionsvar, Integer billingpricetotalcurrencyvar, Integer billingpricetotalbasevar, Integer billingpricetotalenterprisevar, Integer expenseamountbasetotalvar, Integer mileageamountbasetotalvar, Integer mileagenumberoftotalvar, String customerlevelnamevar, String level1customernumbervar, String level2customernumbervar, String level3customernumbervar, String level4customernumbervar, String level5customernumbervar, String level1customernamevar, String level2customernamevar, String level3customernamevar, String level4customernamevar, String level5customernamevar, String weektextheaderinstancekeyvar, String daytextheaderinstancekeyvar, Boolean weektextheaderhastextvar, Boolean daytextheaderhastextvar, Integer timeroundingunitvar, String conversationinstancekeyvar, String starttime, String stoptime, Integer starttimemillis, Integer stoptimemillis, Integer totalelapsedtime, Boolean timerrunning, Boolean transferred, String timeremployeenumber, String timerdate, String timerstartdate, String timerenddate, Integer elapsedtime) {
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
        this.timeroundingunitvar = timeroundingunitvar;
        this.conversationinstancekeyvar = conversationinstancekeyvar;
        this.starttime = starttime;
        this.stoptime = stoptime;
        this.starttimemillis = starttimemillis;
        this.stoptimemillis = stoptimemillis;
        this.totalelapsedtime = totalelapsedtime;
        this.timerrunning = timerrunning;
        this.transferred = transferred;
        this.timeremployeenumber = timeremployeenumber;
        this.timerdate = timerdate;
        this.timerstartdate = timerstartdate;
        this.timerenddate = timerenddate;
        this.elapsedtime = elapsedtime;
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
     *     The thedate
     */
    @JsonProperty("thedate")
    public String getThedate() {
        return thedate;
    }

    /**
     * 
     * @param thedate
     *     The thedate
     */
    @JsonProperty("thedate")
    public void setThedate(String thedate) {
        this.thedate = thedate;
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
     *     The activitytype
     */
    @JsonProperty("activitytype")
    public String getActivitytype() {
        return activitytype;
    }

    /**
     * 
     * @param activitytype
     *     The activitytype
     */
    @JsonProperty("activitytype")
    public void setActivitytype(String activitytype) {
        this.activitytype = activitytype;
    }

    /**
     * 
     * @return
     *     The numbertransferred
     */
    @JsonProperty("numbertransferred")
    public Integer getNumbertransferred() {
        return numbertransferred;
    }

    /**
     * 
     * @param numbertransferred
     *     The numbertransferred
     */
    @JsonProperty("numbertransferred")
    public void setNumbertransferred(Integer numbertransferred) {
        this.numbertransferred = numbertransferred;
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
     *     The internaljob
     */
    @JsonProperty("internaljob")
    public Boolean getInternaljob() {
        return internaljob;
    }

    /**
     * 
     * @param internaljob
     *     The internaljob
     */
    @JsonProperty("internaljob")
    public void setInternaljob(Boolean internaljob) {
        this.internaljob = internaljob;
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
     *     The uniquelinenumber
     */
    @JsonProperty("uniquelinenumber")
    public Integer getUniquelinenumber() {
        return uniquelinenumber;
    }

    /**
     * 
     * @param uniquelinenumber
     *     The uniquelinenumber
     */
    @JsonProperty("uniquelinenumber")
    public void setUniquelinenumber(Integer uniquelinenumber) {
        this.uniquelinenumber = uniquelinenumber;
    }

    /**
     * 
     * @return
     *     The permanentline
     */
    @JsonProperty("permanentline")
    public Boolean getPermanentline() {
        return permanentline;
    }

    /**
     * 
     * @param permanentline
     *     The permanentline
     */
    @JsonProperty("permanentline")
    public void setPermanentline(Boolean permanentline) {
        this.permanentline = permanentline;
    }

    /**
     * 
     * @return
     *     The plannedfortheperiod
     */
    @JsonProperty("plannedfortheperiod")
    public Integer getPlannedfortheperiod() {
        return plannedfortheperiod;
    }

    /**
     * 
     * @param plannedfortheperiod
     *     The plannedfortheperiod
     */
    @JsonProperty("plannedfortheperiod")
    public void setPlannedfortheperiod(Integer plannedfortheperiod) {
        this.plannedfortheperiod = plannedfortheperiod;
    }

    /**
     * 
     * @return
     *     The estimatedtimetocompletion
     */
    @JsonProperty("estimatedtimetocompletion")
    public Integer getEstimatedtimetocompletion() {
        return estimatedtimetocompletion;
    }

    /**
     * 
     * @param estimatedtimetocompletion
     *     The estimatedtimetocompletion
     */
    @JsonProperty("estimatedtimetocompletion")
    public void setEstimatedtimetocompletion(Integer estimatedtimetocompletion) {
        this.estimatedtimetocompletion = estimatedtimetocompletion;
    }

    /**
     * 
     * @return
     *     The executed
     */
    @JsonProperty("executed")
    public Boolean getExecuted() {
        return executed;
    }

    /**
     * 
     * @param executed
     *     The executed
     */
    @JsonProperty("executed")
    public void setExecuted(Boolean executed) {
        this.executed = executed;
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
     *     The overtimetype
     */
    @JsonProperty("overtimetype")
    public String getOvertimetype() {
        return overtimetype;
    }

    /**
     * 
     * @param overtimetype
     *     The overtimetype
     */
    @JsonProperty("overtimetype")
    public void setOvertimetype(String overtimetype) {
        this.overtimetype = overtimetype;
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
     *     The registrationnote
     */
    @JsonProperty("registrationnote")
    public String getRegistrationnote() {
        return registrationnote;
    }

    /**
     * 
     * @param registrationnote
     *     The registrationnote
     */
    @JsonProperty("registrationnote")
    public void setRegistrationnote(String registrationnote) {
        this.registrationnote = registrationnote;
    }

    /**
     * 
     * @return
     *     The estimatedtimetocompletionmandays
     */
    @JsonProperty("estimatedtimetocompletionmandays")
    public Integer getEstimatedtimetocompletionmandays() {
        return estimatedtimetocompletionmandays;
    }

    /**
     * 
     * @param estimatedtimetocompletionmandays
     *     The estimatedtimetocompletionmandays
     */
    @JsonProperty("estimatedtimetocompletionmandays")
    public void setEstimatedtimetocompletionmandays(Integer estimatedtimetocompletionmandays) {
        this.estimatedtimetocompletionmandays = estimatedtimetocompletionmandays;
    }

    /**
     * 
     * @return
     *     The dailydescription
     */
    @JsonProperty("dailydescription")
    public String getDailydescription() {
        return dailydescription;
    }

    /**
     * 
     * @param dailydescription
     *     The dailydescription
     */
    @JsonProperty("dailydescription")
    public void setDailydescription(String dailydescription) {
        this.dailydescription = dailydescription;
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
     *     The employeecategorynumber
     */
    @JsonProperty("employeecategorynumber")
    public String getEmployeecategorynumber() {
        return employeecategorynumber;
    }

    /**
     * 
     * @param employeecategorynumber
     *     The employeecategorynumber
     */
    @JsonProperty("employeecategorynumber")
    public void setEmployeecategorynumber(String employeecategorynumber) {
        this.employeecategorynumber = employeecategorynumber;
    }

    /**
     * 
     * @return
     *     The absencetype
     */
    @JsonProperty("absencetype")
    public String getAbsencetype() {
        return absencetype;
    }

    /**
     * 
     * @param absencetype
     *     The absencetype
     */
    @JsonProperty("absencetype")
    public void setAbsencetype(String absencetype) {
        this.absencetype = absencetype;
    }

    /**
     * 
     * @return
     *     The timeregistrationunit
     */
    @JsonProperty("timeregistrationunit")
    public String getTimeregistrationunit() {
        return timeregistrationunit;
    }

    /**
     * 
     * @param timeregistrationunit
     *     The timeregistrationunit
     */
    @JsonProperty("timeregistrationunit")
    public void setTimeregistrationunit(String timeregistrationunit) {
        this.timeregistrationunit = timeregistrationunit;
    }

    /**
     * 
     * @return
     *     The optionlistnumber1
     */
    @JsonProperty("optionlistnumber1")
    public String getOptionlistnumber1() {
        return optionlistnumber1;
    }

    /**
     * 
     * @param optionlistnumber1
     *     The optionlistnumber1
     */
    @JsonProperty("optionlistnumber1")
    public void setOptionlistnumber1(String optionlistnumber1) {
        this.optionlistnumber1 = optionlistnumber1;
    }

    /**
     * 
     * @return
     *     The selectedoption1
     */
    @JsonProperty("selectedoption1")
    public String getSelectedoption1() {
        return selectedoption1;
    }

    /**
     * 
     * @param selectedoption1
     *     The selectedoption1
     */
    @JsonProperty("selectedoption1")
    public void setSelectedoption1(String selectedoption1) {
        this.selectedoption1 = selectedoption1;
    }

    /**
     * 
     * @return
     *     The optionlistnumber2
     */
    @JsonProperty("optionlistnumber2")
    public String getOptionlistnumber2() {
        return optionlistnumber2;
    }

    /**
     * 
     * @param optionlistnumber2
     *     The optionlistnumber2
     */
    @JsonProperty("optionlistnumber2")
    public void setOptionlistnumber2(String optionlistnumber2) {
        this.optionlistnumber2 = optionlistnumber2;
    }

    /**
     * 
     * @return
     *     The selectedoption2
     */
    @JsonProperty("selectedoption2")
    public String getSelectedoption2() {
        return selectedoption2;
    }

    /**
     * 
     * @param selectedoption2
     *     The selectedoption2
     */
    @JsonProperty("selectedoption2")
    public void setSelectedoption2(String selectedoption2) {
        this.selectedoption2 = selectedoption2;
    }

    /**
     * 
     * @return
     *     The optionlistnumber3
     */
    @JsonProperty("optionlistnumber3")
    public String getOptionlistnumber3() {
        return optionlistnumber3;
    }

    /**
     * 
     * @param optionlistnumber3
     *     The optionlistnumber3
     */
    @JsonProperty("optionlistnumber3")
    public void setOptionlistnumber3(String optionlistnumber3) {
        this.optionlistnumber3 = optionlistnumber3;
    }

    /**
     * 
     * @return
     *     The selectedoption3
     */
    @JsonProperty("selectedoption3")
    public String getSelectedoption3() {
        return selectedoption3;
    }

    /**
     * 
     * @param selectedoption3
     *     The selectedoption3
     */
    @JsonProperty("selectedoption3")
    public void setSelectedoption3(String selectedoption3) {
        this.selectedoption3 = selectedoption3;
    }

    /**
     * 
     * @return
     *     The optionlistnumber4
     */
    @JsonProperty("optionlistnumber4")
    public String getOptionlistnumber4() {
        return optionlistnumber4;
    }

    /**
     * 
     * @param optionlistnumber4
     *     The optionlistnumber4
     */
    @JsonProperty("optionlistnumber4")
    public void setOptionlistnumber4(String optionlistnumber4) {
        this.optionlistnumber4 = optionlistnumber4;
    }

    /**
     * 
     * @return
     *     The selectedoption4
     */
    @JsonProperty("selectedoption4")
    public String getSelectedoption4() {
        return selectedoption4;
    }

    /**
     * 
     * @param selectedoption4
     *     The selectedoption4
     */
    @JsonProperty("selectedoption4")
    public void setSelectedoption4(String selectedoption4) {
        this.selectedoption4 = selectedoption4;
    }

    /**
     * 
     * @return
     *     The optionlistnumber5
     */
    @JsonProperty("optionlistnumber5")
    public String getOptionlistnumber5() {
        return optionlistnumber5;
    }

    /**
     * 
     * @param optionlistnumber5
     *     The optionlistnumber5
     */
    @JsonProperty("optionlistnumber5")
    public void setOptionlistnumber5(String optionlistnumber5) {
        this.optionlistnumber5 = optionlistnumber5;
    }

    /**
     * 
     * @return
     *     The selectedoption5
     */
    @JsonProperty("selectedoption5")
    public String getSelectedoption5() {
        return selectedoption5;
    }

    /**
     * 
     * @param selectedoption5
     *     The selectedoption5
     */
    @JsonProperty("selectedoption5")
    public void setSelectedoption5(String selectedoption5) {
        this.selectedoption5 = selectedoption5;
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
     *     The taskdescriptionvar
     */
    @JsonProperty("taskdescriptionvar")
    public String getTaskdescriptionvar() {
        return taskdescriptionvar;
    }

    /**
     * 
     * @param taskdescriptionvar
     *     The taskdescriptionvar
     */
    @JsonProperty("taskdescriptionvar")
    public void setTaskdescriptionvar(String taskdescriptionvar) {
        this.taskdescriptionvar = taskdescriptionvar;
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
     *     The weeklineapprovalstatusvar
     */
    @JsonProperty("weeklineapprovalstatusvar")
    public String getWeeklineapprovalstatusvar() {
        return weeklineapprovalstatusvar;
    }

    /**
     * 
     * @param weeklineapprovalstatusvar
     *     The weeklineapprovalstatusvar
     */
    @JsonProperty("weeklineapprovalstatusvar")
    public void setWeeklineapprovalstatusvar(String weeklineapprovalstatusvar) {
        this.weeklineapprovalstatusvar = weeklineapprovalstatusvar;
    }

    /**
     * 
     * @return
     *     The weeklineapprovedorrejectedbyvar
     */
    @JsonProperty("weeklineapprovedorrejectedbyvar")
    public String getWeeklineapprovedorrejectedbyvar() {
        return weeklineapprovedorrejectedbyvar;
    }

    /**
     * 
     * @param weeklineapprovedorrejectedbyvar
     *     The weeklineapprovedorrejectedbyvar
     */
    @JsonProperty("weeklineapprovedorrejectedbyvar")
    public void setWeeklineapprovedorrejectedbyvar(String weeklineapprovedorrejectedbyvar) {
        this.weeklineapprovedorrejectedbyvar = weeklineapprovedorrejectedbyvar;
    }

    /**
     * 
     * @return
     *     The weeklineapprovaldatevar
     */
    @JsonProperty("weeklineapprovaldatevar")
    public String getWeeklineapprovaldatevar() {
        return weeklineapprovaldatevar;
    }

    /**
     * 
     * @param weeklineapprovaldatevar
     *     The weeklineapprovaldatevar
     */
    @JsonProperty("weeklineapprovaldatevar")
    public void setWeeklineapprovaldatevar(String weeklineapprovaldatevar) {
        this.weeklineapprovaldatevar = weeklineapprovaldatevar;
    }

    /**
     * 
     * @return
     *     The weeklinecommentprojectmanagervar
     */
    @JsonProperty("weeklinecommentprojectmanagervar")
    public String getWeeklinecommentprojectmanagervar() {
        return weeklinecommentprojectmanagervar;
    }

    /**
     * 
     * @param weeklinecommentprojectmanagervar
     *     The weeklinecommentprojectmanagervar
     */
    @JsonProperty("weeklinecommentprojectmanagervar")
    public void setWeeklinecommentprojectmanagervar(String weeklinecommentprojectmanagervar) {
        this.weeklinecommentprojectmanagervar = weeklinecommentprojectmanagervar;
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
     *     The usesdailydescriptionsvar
     */
    @JsonProperty("usesdailydescriptionsvar")
    public Boolean getUsesdailydescriptionsvar() {
        return usesdailydescriptionsvar;
    }

    /**
     * 
     * @param usesdailydescriptionsvar
     *     The usesdailydescriptionsvar
     */
    @JsonProperty("usesdailydescriptionsvar")
    public void setUsesdailydescriptionsvar(Boolean usesdailydescriptionsvar) {
        this.usesdailydescriptionsvar = usesdailydescriptionsvar;
    }

    /**
     * 
     * @return
     *     The billingpricetotalcurrencyvar
     */
    @JsonProperty("billingpricetotalcurrencyvar")
    public Integer getBillingpricetotalcurrencyvar() {
        return billingpricetotalcurrencyvar;
    }

    /**
     * 
     * @param billingpricetotalcurrencyvar
     *     The billingpricetotalcurrencyvar
     */
    @JsonProperty("billingpricetotalcurrencyvar")
    public void setBillingpricetotalcurrencyvar(Integer billingpricetotalcurrencyvar) {
        this.billingpricetotalcurrencyvar = billingpricetotalcurrencyvar;
    }

    /**
     * 
     * @return
     *     The billingpricetotalbasevar
     */
    @JsonProperty("billingpricetotalbasevar")
    public Integer getBillingpricetotalbasevar() {
        return billingpricetotalbasevar;
    }

    /**
     * 
     * @param billingpricetotalbasevar
     *     The billingpricetotalbasevar
     */
    @JsonProperty("billingpricetotalbasevar")
    public void setBillingpricetotalbasevar(Integer billingpricetotalbasevar) {
        this.billingpricetotalbasevar = billingpricetotalbasevar;
    }

    /**
     * 
     * @return
     *     The billingpricetotalenterprisevar
     */
    @JsonProperty("billingpricetotalenterprisevar")
    public Integer getBillingpricetotalenterprisevar() {
        return billingpricetotalenterprisevar;
    }

    /**
     * 
     * @param billingpricetotalenterprisevar
     *     The billingpricetotalenterprisevar
     */
    @JsonProperty("billingpricetotalenterprisevar")
    public void setBillingpricetotalenterprisevar(Integer billingpricetotalenterprisevar) {
        this.billingpricetotalenterprisevar = billingpricetotalenterprisevar;
    }

    /**
     * 
     * @return
     *     The expenseamountbasetotalvar
     */
    @JsonProperty("expenseamountbasetotalvar")
    public Integer getExpenseamountbasetotalvar() {
        return expenseamountbasetotalvar;
    }

    /**
     * 
     * @param expenseamountbasetotalvar
     *     The expenseamountbasetotalvar
     */
    @JsonProperty("expenseamountbasetotalvar")
    public void setExpenseamountbasetotalvar(Integer expenseamountbasetotalvar) {
        this.expenseamountbasetotalvar = expenseamountbasetotalvar;
    }

    /**
     * 
     * @return
     *     The mileageamountbasetotalvar
     */
    @JsonProperty("mileageamountbasetotalvar")
    public Integer getMileageamountbasetotalvar() {
        return mileageamountbasetotalvar;
    }

    /**
     * 
     * @param mileageamountbasetotalvar
     *     The mileageamountbasetotalvar
     */
    @JsonProperty("mileageamountbasetotalvar")
    public void setMileageamountbasetotalvar(Integer mileageamountbasetotalvar) {
        this.mileageamountbasetotalvar = mileageamountbasetotalvar;
    }

    /**
     * 
     * @return
     *     The mileagenumberoftotalvar
     */
    @JsonProperty("mileagenumberoftotalvar")
    public Integer getMileagenumberoftotalvar() {
        return mileagenumberoftotalvar;
    }

    /**
     * 
     * @param mileagenumberoftotalvar
     *     The mileagenumberoftotalvar
     */
    @JsonProperty("mileagenumberoftotalvar")
    public void setMileagenumberoftotalvar(Integer mileagenumberoftotalvar) {
        this.mileagenumberoftotalvar = mileagenumberoftotalvar;
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
     *     The weektextheaderinstancekeyvar
     */
    @JsonProperty("weektextheaderinstancekeyvar")
    public String getWeektextheaderinstancekeyvar() {
        return weektextheaderinstancekeyvar;
    }

    /**
     * 
     * @param weektextheaderinstancekeyvar
     *     The weektextheaderinstancekeyvar
     */
    @JsonProperty("weektextheaderinstancekeyvar")
    public void setWeektextheaderinstancekeyvar(String weektextheaderinstancekeyvar) {
        this.weektextheaderinstancekeyvar = weektextheaderinstancekeyvar;
    }

    /**
     * 
     * @return
     *     The daytextheaderinstancekeyvar
     */
    @JsonProperty("daytextheaderinstancekeyvar")
    public String getDaytextheaderinstancekeyvar() {
        return daytextheaderinstancekeyvar;
    }

    /**
     * 
     * @param daytextheaderinstancekeyvar
     *     The daytextheaderinstancekeyvar
     */
    @JsonProperty("daytextheaderinstancekeyvar")
    public void setDaytextheaderinstancekeyvar(String daytextheaderinstancekeyvar) {
        this.daytextheaderinstancekeyvar = daytextheaderinstancekeyvar;
    }

    /**
     * 
     * @return
     *     The weektextheaderhastextvar
     */
    @JsonProperty("weektextheaderhastextvar")
    public Boolean getWeektextheaderhastextvar() {
        return weektextheaderhastextvar;
    }

    /**
     * 
     * @param weektextheaderhastextvar
     *     The weektextheaderhastextvar
     */
    @JsonProperty("weektextheaderhastextvar")
    public void setWeektextheaderhastextvar(Boolean weektextheaderhastextvar) {
        this.weektextheaderhastextvar = weektextheaderhastextvar;
    }

    /**
     * 
     * @return
     *     The daytextheaderhastextvar
     */
    @JsonProperty("daytextheaderhastextvar")
    public Boolean getDaytextheaderhastextvar() {
        return daytextheaderhastextvar;
    }

    /**
     * 
     * @param daytextheaderhastextvar
     *     The daytextheaderhastextvar
     */
    @JsonProperty("daytextheaderhastextvar")
    public void setDaytextheaderhastextvar(Boolean daytextheaderhastextvar) {
        this.daytextheaderhastextvar = daytextheaderhastextvar;
    }

    /**
     * 
     * @return
     *     The timeroundingunitvar
     */
    @JsonProperty("timeroundingunitvar")
    public Integer getTimeroundingunitvar() {
        return timeroundingunitvar;
    }

    /**
     * 
     * @param timeroundingunitvar
     *     The timeroundingunitvar
     */
    @JsonProperty("timeroundingunitvar")
    public void setTimeroundingunitvar(Integer timeroundingunitvar) {
        this.timeroundingunitvar = timeroundingunitvar;
    }

    /**
     * 
     * @return
     *     The conversationinstancekeyvar
     */
    @JsonProperty("conversationinstancekeyvar")
    public String getConversationinstancekeyvar() {
        return conversationinstancekeyvar;
    }

    /**
     * 
     * @param conversationinstancekeyvar
     *     The conversationinstancekeyvar
     */
    @JsonProperty("conversationinstancekeyvar")
    public void setConversationinstancekeyvar(String conversationinstancekeyvar) {
        this.conversationinstancekeyvar = conversationinstancekeyvar;
    }

    /**
     * 
     * @return
     *     The starttime
     */
    @JsonProperty("starttime")
    public String getStarttime() {
        return starttime;
    }

    /**
     * 
     * @param starttime
     *     The starttime
     */
    @JsonProperty("starttime")
    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    /**
     * 
     * @return
     *     The stoptime
     */
    @JsonProperty("stoptime")
    public String getStoptime() {
        return stoptime;
    }

    /**
     * 
     * @param stoptime
     *     The stoptime
     */
    @JsonProperty("stoptime")
    public void setStoptime(String stoptime) {
        this.stoptime = stoptime;
    }

    /**
     * 
     * @return
     *     The starttimemillis
     */
    @JsonProperty("starttimemillis")
    public Integer getStarttimemillis() {
        return starttimemillis;
    }

    /**
     * 
     * @param starttimemillis
     *     The starttimemillis
     */
    @JsonProperty("starttimemillis")
    public void setStarttimemillis(Integer starttimemillis) {
        this.starttimemillis = starttimemillis;
    }

    /**
     * 
     * @return
     *     The stoptimemillis
     */
    @JsonProperty("stoptimemillis")
    public Integer getStoptimemillis() {
        return stoptimemillis;
    }

    /**
     * 
     * @param stoptimemillis
     *     The stoptimemillis
     */
    @JsonProperty("stoptimemillis")
    public void setStoptimemillis(Integer stoptimemillis) {
        this.stoptimemillis = stoptimemillis;
    }

    /**
     * 
     * @return
     *     The totalelapsedtime
     */
    @JsonProperty("totalelapsedtime")
    public Integer getTotalelapsedtime() {
        return totalelapsedtime;
    }

    /**
     * 
     * @param totalelapsedtime
     *     The totalelapsedtime
     */
    @JsonProperty("totalelapsedtime")
    public void setTotalelapsedtime(Integer totalelapsedtime) {
        this.totalelapsedtime = totalelapsedtime;
    }

    /**
     * 
     * @return
     *     The timerrunning
     */
    @JsonProperty("timerrunning")
    public Boolean getTimerrunning() {
        return timerrunning;
    }

    /**
     * 
     * @param timerrunning
     *     The timerrunning
     */
    @JsonProperty("timerrunning")
    public void setTimerrunning(Boolean timerrunning) {
        this.timerrunning = timerrunning;
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
     *     The timeremployeenumber
     */
    @JsonProperty("timeremployeenumber")
    public String getTimeremployeenumber() {
        return timeremployeenumber;
    }

    /**
     * 
     * @param timeremployeenumber
     *     The timeremployeenumber
     */
    @JsonProperty("timeremployeenumber")
    public void setTimeremployeenumber(String timeremployeenumber) {
        this.timeremployeenumber = timeremployeenumber;
    }

    /**
     * 
     * @return
     *     The timerdate
     */
    @JsonProperty("timerdate")
    public String getTimerdate() {
        return timerdate;
    }

    /**
     * 
     * @param timerdate
     *     The timerdate
     */
    @JsonProperty("timerdate")
    public void setTimerdate(String timerdate) {
        this.timerdate = timerdate;
    }

    /**
     * 
     * @return
     *     The timerstartdate
     */
    @JsonProperty("timerstartdate")
    public String getTimerstartdate() {
        return timerstartdate;
    }

    /**
     * 
     * @param timerstartdate
     *     The timerstartdate
     */
    @JsonProperty("timerstartdate")
    public void setTimerstartdate(String timerstartdate) {
        this.timerstartdate = timerstartdate;
    }

    /**
     * 
     * @return
     *     The timerenddate
     */
    @JsonProperty("timerenddate")
    public String getTimerenddate() {
        return timerenddate;
    }

    /**
     * 
     * @param timerenddate
     *     The timerenddate
     */
    @JsonProperty("timerenddate")
    public void setTimerenddate(String timerenddate) {
        this.timerenddate = timerenddate;
    }

    /**
     * 
     * @return
     *     The elapsedtime
     */
    @JsonProperty("elapsedtime")
    public Integer getElapsedtime() {
        return elapsedtime;
    }

    /**
     * 
     * @param elapsedtime
     *     The elapsedtime
     */
    @JsonProperty("elapsedtime")
    public void setElapsedtime(Integer elapsedtime) {
        this.elapsedtime = elapsedtime;
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
        return new HashCodeBuilder().append(employeenumber).append(linenumber).append(thedate).append(jobnumber).append(activitynumber).append(taskname).append(numberof).append(entrytext).append(activitytype).append(numbertransferred).append(remark).append(description).append(internaljob).append(locationname).append(entityname).append(projectname).append(purposename).append(localspec1name).append(localspec2name).append(localspec3name).append(specification1name).append(specification2name).append(specification3name).append(companynumber).append(transferredforposting).append(costtype).append(approvedbysuperior).append(releasedbysuperior).append(uniquelinenumber).append(permanentline).append(plannedfortheperiod).append(estimatedtimetocompletion).append(executed).append(instancekey).append(overtimetype).append(submitted).append(favorite).append(registrationnote).append(estimatedtimetocompletionmandays).append(dailydescription).append(transactiontimestamp).append(numberproposed).append(transactiontype).append(invoiceable).append(billingpricecurrency).append(billingpricebase).append(billingpriceenterprise).append(employeecategorynumber).append(absencetype).append(timeregistrationunit).append(optionlistnumber1).append(selectedoption1).append(optionlistnumber2).append(selectedoption2).append(optionlistnumber3).append(selectedoption3).append(optionlistnumber4).append(selectedoption4).append(optionlistnumber5).append(selectedoption5).append(specification4name).append(specification5name).append(specification6name).append(specification7name).append(specification8name).append(specification9name).append(specification10name).append(localspec4name).append(localspec5name).append(localspec6name).append(localspec7name).append(localspec8name).append(localspec9name).append(localspec10name).append(purchaseordernumber).append(purchaseorderlinenumber).append(jobnamevar).append(customernumbervar).append(customernamevar).append(taskdescriptionvar).append(taskpathvar).append(activitytextvar).append(weeklineapprovalstatusvar).append(weeklineapprovedorrejectedbyvar).append(weeklineapprovaldatevar).append(weeklinecommentprojectmanagervar).append(tooltipjobvar).append(tooltiptaskvar).append(tooltiptasklinebreakvar).append(tooltipactivityvar).append(tooltipconclusionvar).append(linedetailsvar).append(linedetailstypevar).append(usesdailydescriptionsvar).append(billingpricetotalcurrencyvar).append(billingpricetotalbasevar).append(billingpricetotalenterprisevar).append(expenseamountbasetotalvar).append(mileageamountbasetotalvar).append(mileagenumberoftotalvar).append(customerlevelnamevar).append(level1customernumbervar).append(level2customernumbervar).append(level3customernumbervar).append(level4customernumbervar).append(level5customernumbervar).append(level1customernamevar).append(level2customernamevar).append(level3customernamevar).append(level4customernamevar).append(level5customernamevar).append(weektextheaderinstancekeyvar).append(daytextheaderinstancekeyvar).append(weektextheaderhastextvar).append(daytextheaderhastextvar).append(timeroundingunitvar).append(conversationinstancekeyvar).append(starttime).append(stoptime).append(starttimemillis).append(stoptimemillis).append(totalelapsedtime).append(timerrunning).append(transferred).append(timeremployeenumber).append(timerdate).append(timerstartdate).append(timerenddate).append(elapsedtime).append(additionalProperties).toHashCode();
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
        return new EqualsBuilder().append(employeenumber, rhs.employeenumber).append(linenumber, rhs.linenumber).append(thedate, rhs.thedate).append(jobnumber, rhs.jobnumber).append(activitynumber, rhs.activitynumber).append(taskname, rhs.taskname).append(numberof, rhs.numberof).append(entrytext, rhs.entrytext).append(activitytype, rhs.activitytype).append(numbertransferred, rhs.numbertransferred).append(remark, rhs.remark).append(description, rhs.description).append(internaljob, rhs.internaljob).append(locationname, rhs.locationname).append(entityname, rhs.entityname).append(projectname, rhs.projectname).append(purposename, rhs.purposename).append(localspec1name, rhs.localspec1name).append(localspec2name, rhs.localspec2name).append(localspec3name, rhs.localspec3name).append(specification1name, rhs.specification1name).append(specification2name, rhs.specification2name).append(specification3name, rhs.specification3name).append(companynumber, rhs.companynumber).append(transferredforposting, rhs.transferredforposting).append(costtype, rhs.costtype).append(approvedbysuperior, rhs.approvedbysuperior).append(releasedbysuperior, rhs.releasedbysuperior).append(uniquelinenumber, rhs.uniquelinenumber).append(permanentline, rhs.permanentline).append(plannedfortheperiod, rhs.plannedfortheperiod).append(estimatedtimetocompletion, rhs.estimatedtimetocompletion).append(executed, rhs.executed).append(instancekey, rhs.instancekey).append(overtimetype, rhs.overtimetype).append(submitted, rhs.submitted).append(favorite, rhs.favorite).append(registrationnote, rhs.registrationnote).append(estimatedtimetocompletionmandays, rhs.estimatedtimetocompletionmandays).append(dailydescription, rhs.dailydescription).append(transactiontimestamp, rhs.transactiontimestamp).append(numberproposed, rhs.numberproposed).append(transactiontype, rhs.transactiontype).append(invoiceable, rhs.invoiceable).append(billingpricecurrency, rhs.billingpricecurrency).append(billingpricebase, rhs.billingpricebase).append(billingpriceenterprise, rhs.billingpriceenterprise).append(employeecategorynumber, rhs.employeecategorynumber).append(absencetype, rhs.absencetype).append(timeregistrationunit, rhs.timeregistrationunit).append(optionlistnumber1, rhs.optionlistnumber1).append(selectedoption1, rhs.selectedoption1).append(optionlistnumber2, rhs.optionlistnumber2).append(selectedoption2, rhs.selectedoption2).append(optionlistnumber3, rhs.optionlistnumber3).append(selectedoption3, rhs.selectedoption3).append(optionlistnumber4, rhs.optionlistnumber4).append(selectedoption4, rhs.selectedoption4).append(optionlistnumber5, rhs.optionlistnumber5).append(selectedoption5, rhs.selectedoption5).append(specification4name, rhs.specification4name).append(specification5name, rhs.specification5name).append(specification6name, rhs.specification6name).append(specification7name, rhs.specification7name).append(specification8name, rhs.specification8name).append(specification9name, rhs.specification9name).append(specification10name, rhs.specification10name).append(localspec4name, rhs.localspec4name).append(localspec5name, rhs.localspec5name).append(localspec6name, rhs.localspec6name).append(localspec7name, rhs.localspec7name).append(localspec8name, rhs.localspec8name).append(localspec9name, rhs.localspec9name).append(localspec10name, rhs.localspec10name).append(purchaseordernumber, rhs.purchaseordernumber).append(purchaseorderlinenumber, rhs.purchaseorderlinenumber).append(jobnamevar, rhs.jobnamevar).append(customernumbervar, rhs.customernumbervar).append(customernamevar, rhs.customernamevar).append(taskdescriptionvar, rhs.taskdescriptionvar).append(taskpathvar, rhs.taskpathvar).append(activitytextvar, rhs.activitytextvar).append(weeklineapprovalstatusvar, rhs.weeklineapprovalstatusvar).append(weeklineapprovedorrejectedbyvar, rhs.weeklineapprovedorrejectedbyvar).append(weeklineapprovaldatevar, rhs.weeklineapprovaldatevar).append(weeklinecommentprojectmanagervar, rhs.weeklinecommentprojectmanagervar).append(tooltipjobvar, rhs.tooltipjobvar).append(tooltiptaskvar, rhs.tooltiptaskvar).append(tooltiptasklinebreakvar, rhs.tooltiptasklinebreakvar).append(tooltipactivityvar, rhs.tooltipactivityvar).append(tooltipconclusionvar, rhs.tooltipconclusionvar).append(linedetailsvar, rhs.linedetailsvar).append(linedetailstypevar, rhs.linedetailstypevar).append(usesdailydescriptionsvar, rhs.usesdailydescriptionsvar).append(billingpricetotalcurrencyvar, rhs.billingpricetotalcurrencyvar).append(billingpricetotalbasevar, rhs.billingpricetotalbasevar).append(billingpricetotalenterprisevar, rhs.billingpricetotalenterprisevar).append(expenseamountbasetotalvar, rhs.expenseamountbasetotalvar).append(mileageamountbasetotalvar, rhs.mileageamountbasetotalvar).append(mileagenumberoftotalvar, rhs.mileagenumberoftotalvar).append(customerlevelnamevar, rhs.customerlevelnamevar).append(level1customernumbervar, rhs.level1customernumbervar).append(level2customernumbervar, rhs.level2customernumbervar).append(level3customernumbervar, rhs.level3customernumbervar).append(level4customernumbervar, rhs.level4customernumbervar).append(level5customernumbervar, rhs.level5customernumbervar).append(level1customernamevar, rhs.level1customernamevar).append(level2customernamevar, rhs.level2customernamevar).append(level3customernamevar, rhs.level3customernamevar).append(level4customernamevar, rhs.level4customernamevar).append(level5customernamevar, rhs.level5customernamevar).append(weektextheaderinstancekeyvar, rhs.weektextheaderinstancekeyvar).append(daytextheaderinstancekeyvar, rhs.daytextheaderinstancekeyvar).append(weektextheaderhastextvar, rhs.weektextheaderhastextvar).append(daytextheaderhastextvar, rhs.daytextheaderhastextvar).append(timeroundingunitvar, rhs.timeroundingunitvar).append(conversationinstancekeyvar, rhs.conversationinstancekeyvar).append(starttime, rhs.starttime).append(stoptime, rhs.stoptime).append(starttimemillis, rhs.starttimemillis).append(stoptimemillis, rhs.stoptimemillis).append(totalelapsedtime, rhs.totalelapsedtime).append(timerrunning, rhs.timerrunning).append(transferred, rhs.transferred).append(timeremployeenumber, rhs.timeremployeenumber).append(timerdate, rhs.timerdate).append(timerstartdate, rhs.timerstartdate).append(timerenddate, rhs.timerenddate).append(elapsedtime, rhs.elapsedtime).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
