package com.yaao.ps10.base.model;

import java.io.Serializable;

public class NfcRecord implements Serializable {
    private Integer id;

    private String cardnumber;

    private String location;

    private Integer machineroomid;

    private String sitename;

    private String picturepath;

    private String machineroomname;

    private Integer siteid;

    private Integer outincard;

    private String deviceplace;

    private String sourceplace;

    private Integer correlationuserid;

    private Integer areaid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getMachineroomid() {
        return machineroomid;
    }

    public void setMachineroomid(Integer machineroomid) {
        this.machineroomid = machineroomid;
    }

    public String getSitename() {
        return sitename;
    }

    public void setSitename(String sitename) {
        this.sitename = sitename;
    }

    public String getPicturepath() {
        return picturepath;
    }

    public void setPicturepath(String picturepath) {
        this.picturepath = picturepath;
    }

    public String getMachineroomname() {
        return machineroomname;
    }

    public void setMachineroomname(String machineroomname) {
        this.machineroomname = machineroomname;
    }

    public Integer getSiteid() {
        return siteid;
    }

    public void setSiteid(Integer siteid) {
        this.siteid = siteid;
    }

    public Integer getOutincard() {
        return outincard;
    }

    public void setOutincard(Integer outincard) {
        this.outincard = outincard;
    }

    public String getDeviceplace() {
        return deviceplace;
    }

    public void setDeviceplace(String deviceplace) {
        this.deviceplace = deviceplace;
    }

    public String getSourceplace() {
        return sourceplace;
    }

    public void setSourceplace(String sourceplace) {
        this.sourceplace = sourceplace;
    }

    public Integer getCorrelationuserid() {
        return correlationuserid;
    }

    public void setCorrelationuserid(Integer correlationuserid) {
        this.correlationuserid = correlationuserid;
    }

    public Integer getAreaid() {
        return areaid;
    }

    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
    }
}