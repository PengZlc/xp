package com.yaao.ps10.base.model;

import java.io.Serializable;

public class SiteTable implements Serializable {
    private Integer id;

    private String siteName;

    private String spellabbreviation;

    private String siteAlias;

    private String sitecoding;

    private Integer siteType;

    private String address;

    private Integer areaId;

    private Double longitude;

    private Double latitude;

    private Integer serviceLevelType;

    private Integer floorCount;

    private Integer standflag;

    private Integer saveflag;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getSpellabbreviation() {
        return spellabbreviation;
    }

    public void setSpellabbreviation(String spellabbreviation) {
        this.spellabbreviation = spellabbreviation;
    }

    public String getSiteAlias() {
        return siteAlias;
    }

    public void setSiteAlias(String siteAlias) {
        this.siteAlias = siteAlias;
    }

    public String getSitecoding() {
        return sitecoding;
    }

    public void setSitecoding(String sitecoding) {
        this.sitecoding = sitecoding;
    }

    public Integer getSiteType() {
        return siteType;
    }

    public void setSiteType(Integer siteType) {
        this.siteType = siteType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Integer getServiceLevelType() {
        return serviceLevelType;
    }

    public void setServiceLevelType(Integer serviceLevelType) {
        this.serviceLevelType = serviceLevelType;
    }

    public Integer getFloorCount() {
        return floorCount;
    }

    public void setFloorCount(Integer floorCount) {
        this.floorCount = floorCount;
    }

    public Integer getStandflag() {
        return standflag;
    }

    public void setStandflag(Integer standflag) {
        this.standflag = standflag;
    }

    public Integer getSaveflag() {
        return saveflag;
    }

    public void setSaveflag(Integer saveflag) {
        this.saveflag = saveflag;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}