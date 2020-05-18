package com.yaao.ps10.base.model;

import java.io.Serializable;
import java.util.Date;

public class UserTable implements Serializable {
    private Integer memberid;

    private String logname;

    private String username;

    private Integer departmentid;

    private Integer maintflag;

    private Integer ondutyflag;

    private Integer roleid;

    private Integer sroleid;

    private Integer troleid;

    private Integer cardcode;

    private String telphone;

    private Short validflag;

    private Short sex;

    private String pwd;

    private Integer availtime;

    private Date updatetime;

    private String email;

    private String dsc;

    private String picpath;

    private String jobnum;

    private String groupnum;

    private Integer deptid2;

    private Integer deptid3;

    private String departmentName;

    private String roleName;

    private String salt;//盐值

    private static final long serialVersionUID = 1L;

    public Integer getMemberid() {
        return memberid;
    }

    public void setMemberid(Integer memberid) {
        this.memberid = memberid;
    }

    public String getLogname() {
        return logname;
    }

    public void setLogname(String logname) {
        this.logname = logname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public Integer getMaintflag() {
        return maintflag;
    }

    public void setMaintflag(Integer maintflag) {
        this.maintflag = maintflag;
    }

    public Integer getOndutyflag() {
        return ondutyflag;
    }

    public void setOndutyflag(Integer ondutyflag) {
        this.ondutyflag = ondutyflag;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getSroleid() {
        return sroleid;
    }

    public void setSroleid(Integer sroleid) {
        this.sroleid = sroleid;
    }

    public Integer getTroleid() {
        return troleid;
    }

    public void setTroleid(Integer troleid) {
        this.troleid = troleid;
    }

    public Integer getCardcode() {
        return cardcode;
    }

    public void setCardcode(Integer cardcode) {
        this.cardcode = cardcode;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public Short getValidflag() {
        return validflag;
    }

    public void setValidflag(Short validflag) {
        this.validflag = validflag;
    }

    public Short getSex() {
        return sex;
    }

    public void setSex(Short sex) {
        this.sex = sex;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Integer getAvailtime() {
        return availtime;
    }

    public void setAvailtime(Integer availtime) {
        this.availtime = availtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDsc() {
        return dsc;
    }

    public void setDsc(String dsc) {
        this.dsc = dsc;
    }

    public String getPicpath() {
        return picpath;
    }

    public void setPicpath(String picpath) {
        this.picpath = picpath;
    }

    public String getJobnum() {
        return jobnum;
    }

    public void setJobnum(String jobnum) {
        this.jobnum = jobnum;
    }

    public String getGroupnum() {
        return groupnum;
    }

    public void setGroupnum(String groupnum) {
        this.groupnum = groupnum;
    }

    public Integer getDeptid2() {
        return deptid2;
    }

    public void setDeptid2(Integer deptid2) {
        this.deptid2 = deptid2;
    }

    public Integer getDeptid3() {
        return deptid3;
    }

    public void setDeptid3(Integer deptid3) {
        this.deptid3 = deptid3;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    @Override
    public String toString() {
        return "UserTable{" +
                "memberid=" + memberid +
                ", logname='" + logname + '\'' +
                ", username='" + username + '\'' +
                ", departmentid=" + departmentid +
                ", maintflag=" + maintflag +
                ", ondutyflag=" + ondutyflag +
                ", roleid=" + roleid +
                ", sroleid=" + sroleid +
                ", troleid=" + troleid +
                ", cardcode=" + cardcode +
                ", telphone='" + telphone + '\'' +
                ", validflag=" + validflag +
                ", sex=" + sex +
                ", pwd='" + pwd + '\'' +
                ", availtime=" + availtime +
                ", updatetime=" + updatetime +
                ", email='" + email + '\'' +
                ", dsc='" + dsc + '\'' +
                ", picpath='" + picpath + '\'' +
                ", jobnum='" + jobnum + '\'' +
                ", groupnum='" + groupnum + '\'' +
                ", deptid2=" + deptid2 +
                ", deptid3=" + deptid3 +
                ", departmentName='" + departmentName + '\'' +
                ", roleName='" + roleName + '\'' +
                ", salt='" + salt + '\'' +
                '}';
    }
}