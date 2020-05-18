package com.yaao.ps10.web.model;

public class RoomState {

    private Integer id;

    private Integer inspectId;

    private Integer roomId;

    private Integer state;

    private String roomName;

    private Integer roomType;

    private String dataJson;

    private String userName;

    private String picNames;

    private Integer isNotExcep;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInspectId() {
        return inspectId;
    }

    public void setInspectId(Integer inspectId) {
        this.inspectId = inspectId;
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

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public Integer getRoomType() {
        return roomType;
    }

    public void setRoomType(Integer roomType) {
        this.roomType = roomType;
    }

    public String getDataJson() {
        return dataJson;
    }

    public void setDataJson(String dataJson) {
        this.dataJson = dataJson;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPicNames() {
        return picNames;
    }

    public void setPicNames(String picNames) {
        this.picNames = picNames;
    }

    public Integer getIsNotExcep() {
        return isNotExcep;
    }

    public void setIsNotExcep(Integer isNotExcep) {
        this.isNotExcep = isNotExcep;
    }
}
