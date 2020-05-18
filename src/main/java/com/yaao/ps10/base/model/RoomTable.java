package com.yaao.ps10.base.model;

import java.io.Serializable;

public class RoomTable implements Serializable {
    private Integer id;

    private String roomName;

    private String abbreviation;

    private String roomAlias;

    private Integer roomType;

    private Integer serviceLevelType;

    private Integer siteId;

    private Integer floorNumber;

    private Float roomLength;

    private Float roomHeight;

    private Float roomWidth;

    private Integer rowStartNum;

    private Integer rowEndNum;

    private Integer colStartNum;

    private Integer colEndNum;

    private Integer rowDirection;

    private Integer colDirection;

    private Boolean isAltogether;

    private String altogetherUnit;

    private Boolean isSharing;

    private String sharingUnit;

    private String roomNote;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getRoomAlias() {
        return roomAlias;
    }

    public void setRoomAlias(String roomAlias) {
        this.roomAlias = roomAlias;
    }

    public Integer getRoomType() {
        return roomType;
    }

    public void setRoomType(Integer roomType) {
        this.roomType = roomType;
    }

    public Integer getServiceLevelType() {
        return serviceLevelType;
    }

    public void setServiceLevelType(Integer serviceLevelType) {
        this.serviceLevelType = serviceLevelType;
    }

    public Integer getSiteId() {
        return siteId;
    }

    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    public Integer getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(Integer floorNumber) {
        this.floorNumber = floorNumber;
    }

    public Float getRoomLength() {
        return roomLength;
    }

    public void setRoomLength(Float roomLength) {
        this.roomLength = roomLength;
    }

    public Float getRoomHeight() {
        return roomHeight;
    }

    public void setRoomHeight(Float roomHeight) {
        this.roomHeight = roomHeight;
    }

    public Float getRoomWidth() {
        return roomWidth;
    }

    public void setRoomWidth(Float roomWidth) {
        this.roomWidth = roomWidth;
    }

    public Integer getRowStartNum() {
        return rowStartNum;
    }

    public void setRowStartNum(Integer rowStartNum) {
        this.rowStartNum = rowStartNum;
    }

    public Integer getRowEndNum() {
        return rowEndNum;
    }

    public void setRowEndNum(Integer rowEndNum) {
        this.rowEndNum = rowEndNum;
    }

    public Integer getColStartNum() {
        return colStartNum;
    }

    public void setColStartNum(Integer colStartNum) {
        this.colStartNum = colStartNum;
    }

    public Integer getColEndNum() {
        return colEndNum;
    }

    public void setColEndNum(Integer colEndNum) {
        this.colEndNum = colEndNum;
    }

    public Integer getRowDirection() {
        return rowDirection;
    }

    public void setRowDirection(Integer rowDirection) {
        this.rowDirection = rowDirection;
    }

    public Integer getColDirection() {
        return colDirection;
    }

    public void setColDirection(Integer colDirection) {
        this.colDirection = colDirection;
    }

    public Boolean getIsAltogether() {
        return isAltogether;
    }

    public void setIsAltogether(Boolean isAltogether) {
        this.isAltogether = isAltogether;
    }

    public String getAltogetherUnit() {
        return altogetherUnit;
    }

    public void setAltogetherUnit(String altogetherUnit) {
        this.altogetherUnit = altogetherUnit;
    }

    public Boolean getIsSharing() {
        return isSharing;
    }

    public void setIsSharing(Boolean isSharing) {
        this.isSharing = isSharing;
    }

    public String getSharingUnit() {
        return sharingUnit;
    }

    public void setSharingUnit(String sharingUnit) {
        this.sharingUnit = sharingUnit;
    }

    public String getRoomNote() {
        return roomNote;
    }

    public void setRoomNote(String roomNote) {
        this.roomNote = roomNote;
    }
}