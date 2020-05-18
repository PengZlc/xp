package com.yaao.ps10.web.model;

import java.io.Serializable;
import java.util.Date;

public class KvEvaluate implements Serializable {
    private Integer id;

    private String processid;

    private Integer roomid;

    private Integer userid;

    private String usercontext;

    private Date createtime;

    private Integer nouserid;

    private String roomName;

    private String userName;

    private String noUserName;

    private Integer taskId;

    private String taskName;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProcessid() {
        return processid;
    }

    public void setProcessid(String processid) {
        this.processid = processid;
    }

    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsercontext() {
        return usercontext;
    }

    public void setUsercontext(String usercontext) {
        this.usercontext = usercontext;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getNouserid() {
        return nouserid;
    }

    public void setNouserid(Integer nouserid) {
        this.nouserid = nouserid;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNoUserName() {
        return noUserName;
    }

    public void setNoUserName(String noUserName) {
        this.noUserName = noUserName;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }
}