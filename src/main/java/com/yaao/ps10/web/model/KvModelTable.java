package com.yaao.ps10.web.model;

import java.io.Serializable;
import java.util.Date;

public class KvModelTable implements Serializable {
    private Integer id;

    private String modelname;

    private Integer createuserid;

    private String createusername;

    private Date createtime;

    private String modeltype;

    private String roomids;

    private String userids;

    private Integer areaid;

    private String departname;

    private Integer nfcspacetime;

    private String modelcontent;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModelname() {
        return modelname;
    }

    public void setModelname(String modelname) {
        this.modelname = modelname;
    }

    public Integer getCreateuserid() {
        return createuserid;
    }

    public void setCreateuserid(Integer createuserid) {
        this.createuserid = createuserid;
    }

    public String getCreateusername() {
        return createusername;
    }

    public void setCreateusername(String createusername) {
        this.createusername = createusername;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getModeltype() {
        return modeltype;
    }

    public void setModeltype(String modeltype) {
        this.modeltype = modeltype;
    }

    public String getRoomids() {
        return roomids;
    }

    public void setRoomids(String roomids) {
        this.roomids = roomids;
    }

    public String getUserids() {
        return userids;
    }

    public void setUserids(String userids) {
        this.userids = userids;
    }

    public Integer getAreaid() {
        return areaid;
    }

    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
    }

    public String getDepartname() {
        return departname;
    }

    public void setDepartname(String departname) {
        this.departname = departname;
    }

    public Integer getNfcspacetime() {
        return nfcspacetime;
    }

    public void setNfcspacetime(Integer nfcspacetime) {
        this.nfcspacetime = nfcspacetime;
    }

    public String getModelcontent() {
        return modelcontent;
    }

    public void setModelcontent(String modelcontent) {
        this.modelcontent = modelcontent;
    }
}