package com.yaao.ps10.web.model;

import java.io.Serializable;
import java.util.Date;

public class KvRoomException implements Serializable {
    private Integer id;

    private Integer roomId;

    private String procInstId;

    private Date submitTime;

    private String dataContext;

    private String roomName;

    private Integer isnotexcep;

    private String username;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public String getProcInstId() {
        return procInstId;
    }

    public void setProcInstId(String procInstId) {
        this.procInstId = procInstId;
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    public String getDataContext() {
        return dataContext;
    }

    public void setDataContext(String dataContext) {
        this.dataContext = dataContext;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public Integer getIsnotexcep() {
        return isnotexcep;
    }

    public void setIsnotexcep(Integer isnotexcep) {
        this.isnotexcep = isnotexcep;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}