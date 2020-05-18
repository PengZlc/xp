package com.yaao.ps10.web.model;

import java.io.Serializable;
import java.util.Date;

public class NfcDataTable implements Serializable {
    private Integer id;

    private Integer roomId;

    private String nfcCode;

    private Date createTime;

    private String processId;

    private Integer state;

    private String creareUser;

    private String roomName;

    private String devicePlace;

    private String sourcePlace;

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

    public String getNfcCode() {
        return nfcCode;
    }

    public void setNfcCode(String nfcCode) {
        this.nfcCode = nfcCode;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getCreareUser() {
        return creareUser;
    }

    public void setCreareUser(String creareUser) {
        this.creareUser = creareUser;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getSourcePlace() {
        return sourcePlace;
    }

    public void setSourcePlace(String sourcePlace) {
        this.sourcePlace = sourcePlace;
    }

    public String getDevicePlace() {
        return devicePlace;
    }

    public void setDevicePlace(String devicePlace) {
        this.devicePlace = devicePlace;
    }
}