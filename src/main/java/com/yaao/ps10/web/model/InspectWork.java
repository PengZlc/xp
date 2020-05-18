package com.yaao.ps10.web.model;

import java.io.Serializable;
import java.util.Date;

public class InspectWork implements Serializable {
    private Integer id;

    private String name;

    private String piid;

    private Integer siteid;

    private Integer roomid;

    private Integer teamid;

    private String userid;

    private Integer flag;

    private String note;

    private Date starttime;

    private Date endtime;

    private Date requiredstarttime;

    private Date requiredendtime;

    private Date actualstarttime;

    private String grade;

    private String username;

    private Integer validinstate;

    private Integer validinflag;

    private String validinstruction;

    private Integer usercount;

    private Integer istempinsp;

    private String businesskey;

    private String taskdefkey;

    private String initiateuser;

    private Integer nfccode;

    private Integer validinuserid;

    private String uncompletereason;
    /*自定义，超时时间*/
    private String overTime;

    /*自定义，完成率*/
    private String rate;

    /*自定义，巡检区域*/
    private String sitename;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPiid() {
        return piid;
    }

    public void setPiid(String piid) {
        this.piid = piid;
    }

    public Integer getSiteid() {
        return siteid;
    }

    public void setSiteid(Integer siteid) {
        this.siteid = siteid;
    }

    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public Integer getTeamid() {
        return teamid;
    }

    public void setTeamid(Integer teamid) {
        this.teamid = teamid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Date getRequiredstarttime() {
        return requiredstarttime;
    }

    public void setRequiredstarttime(Date requiredstarttime) {
        this.requiredstarttime = requiredstarttime;
    }

    public Date getRequiredendtime() {
        return requiredendtime;
    }

    public void setRequiredendtime(Date requiredendtime) {
        this.requiredendtime = requiredendtime;
    }

    public Date getActualstarttime() {
        return actualstarttime;
    }

    public void setActualstarttime(Date actualstarttime) {
        this.actualstarttime = actualstarttime;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getValidinstate() {
        return validinstate;
    }

    public void setValidinstate(Integer validinstate) {
        this.validinstate = validinstate;
    }

    public Integer getValidinflag() {
        return validinflag;
    }

    public void setValidinflag(Integer validinflag) {
        this.validinflag = validinflag;
    }

    public String getValidinstruction() {
        return validinstruction;
    }

    public void setValidinstruction(String validinstruction) {
        this.validinstruction = validinstruction;
    }

    public Integer getUsercount() {
        return usercount;
    }

    public void setUsercount(Integer usercount) {
        this.usercount = usercount;
    }

    public Integer getIstempinsp() {
        return istempinsp;
    }

    public void setIstempinsp(Integer istempinsp) {
        this.istempinsp = istempinsp;
    }

    public String getBusinesskey() {
        return businesskey;
    }

    public void setBusinesskey(String businesskey) {
        this.businesskey = businesskey;
    }

    public String getTaskdefkey() {
        return taskdefkey;
    }

    public void setTaskdefkey(String taskdefkey) {
        this.taskdefkey = taskdefkey;
    }

    public String getInitiateuser() {
        return initiateuser;
    }

    public void setInitiateuser(String initiateuser) {
        this.initiateuser = initiateuser;
    }

    public Integer getNfccode() {
        return nfccode;
    }

    public void setNfccode(Integer nfccode) {
        this.nfccode = nfccode;
    }

    public Integer getValidinuserid() {
        return validinuserid;
    }

    public void setValidinuserid(Integer validinuserid) {
        this.validinuserid = validinuserid;
    }

    public String getUncompletereason() {
        return uncompletereason;
    }

    public void setUncompletereason(String uncompletereason) {
        this.uncompletereason = uncompletereason;
    }

    public String getOverTime() {
        return overTime;
    }

    public void setOverTime(String overTime) {
        this.overTime = overTime;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getSitename() {
        return sitename;
    }

    public void setSitename(String sitename) {
        this.sitename = sitename;
    }
}