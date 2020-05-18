package com.yaao.ps10.quartz.model;

import java.io.Serializable;
import java.util.Date;

public class TaskScheduleJob implements Serializable {
    public static final String STATUS_RUNNING = "1";
    public static final String STATUS_NOT_RUNNING = "0";
    public static final String CONCURRENT_IS = "1";
    public static final String CONCURRENT_NOT = "0";

    private Long jobId;

    private Date createTime;

    private Date updateTime;

    private String jobName;

    private String jobGroup;

    private String jobStatus;

    private String cronExpression;

    private String description;

    private String beanClass;

    private String isconcurrent;

    private String springId;

    private String methodName;

    private String jobTyle;

    private String jobSubtype;

    private String actId;

    private Integer period;

    private Integer validuserid;

    private Integer dutyCycle;

    private String roomId;

    private String teamId;

    private String memberId;

    private String devicetypeId;

    private static final long serialVersionUID = 1L;

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobGroup() {
        return jobGroup;
    }

    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup;
    }

    public String getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    public String getCronExpression() {
        return cronExpression;
    }

    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(String beanClass) {
        this.beanClass = beanClass;
    }

    public String getIsconcurrent() {
        return isconcurrent;
    }

    public void setIsconcurrent(String isconcurrent) {
        this.isconcurrent = isconcurrent;
    }

    public String getSpringId() {
        return springId;
    }

    public void setSpringId(String springId) {
        this.springId = springId;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getJobTyle() {
        return jobTyle;
    }

    public void setJobTyle(String jobTyle) {
        this.jobTyle = jobTyle;
    }

    public String getJobSubtype() {
        return jobSubtype;
    }

    public void setJobSubtype(String jobSubtype) {
        this.jobSubtype = jobSubtype;
    }

    public String getActId() {
        return actId;
    }

    public void setActId(String actId) {
        this.actId = actId;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public Integer getValiduserid() {
        return validuserid;
    }

    public void setValiduserid(Integer validuserid) {
        this.validuserid = validuserid;
    }

    public Integer getDutyCycle() {
        return dutyCycle;
    }

    public void setDutyCycle(Integer dutyCycle) {
        this.dutyCycle = dutyCycle;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getDevicetypeId() {
        return devicetypeId;
    }

    public void setDevicetypeId(String devicetypeId) {
        this.devicetypeId = devicetypeId;
    }
}