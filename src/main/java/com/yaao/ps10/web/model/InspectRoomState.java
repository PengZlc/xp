package com.yaao.ps10.web.model;

import java.io.Serializable;

public class InspectRoomState implements Serializable {
    private Integer id;

    private Integer workId;

    private Integer roomId;

    private Integer state;

    private Integer workType;

    private String piid;

    private Integer roomType;

    private Integer userId;

    private Integer isnotexception;

    private String reasondata;

    private String appDatajson;

    private String datacontent;

    private String appnfcaccount;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWorkId() {
        return workId;
    }

    public void setWorkId(Integer workId) {
        this.workId = workId;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getWorkType() {
        return workType;
    }

    public void setWorkType(Integer workType) {
        this.workType = workType;
    }

    public String getPiid() {
        return piid;
    }

    public void setPiid(String piid) {
        this.piid = piid;
    }

    public Integer getRoomType() {
        return roomType;
    }

    public void setRoomType(Integer roomType) {
        this.roomType = roomType;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getIsnotexception() {
        return isnotexception;
    }

    public void setIsnotexception(Integer isnotexception) {
        this.isnotexception = isnotexception;
    }

    public String getReasondata() {
        return reasondata;
    }

    public void setReasondata(String reasondata) {
        this.reasondata = reasondata;
    }

    public String getAppDatajson() {
        return appDatajson;
    }

    public void setAppDatajson(String appDatajson) {
        this.appDatajson = appDatajson;
    }

    public String getDatacontent() {
        return datacontent;
    }

    public void setDatacontent(String datacontent) {
        this.datacontent = datacontent;
    }

    public String getAppnfcaccount() {
        return appnfcaccount;
    }

    public void setAppnfcaccount(String appnfcaccount) {
        this.appnfcaccount = appnfcaccount;
    }
}