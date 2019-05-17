package com.tjl.credit.domain;

import java.sql.Date;

/**
 * @Author PengBo
 * @CreateTime 2019/5/17 16:20
 * @Version 1.0.0
 */
public class CreditAndCheck {

    private Integer creditId;

    private String checkUserId;

    private String result;

    private String opinion;
    //-----------------------------------------

    private Integer id;

    private String username;

    private Date atime;

    private String ctype;

    private String state;

    private String note;

    private String file;
    private String tempcollege;

    public Integer getCreditId() {
        return creditId;
    }

    public void setCreditId(Integer creditId) {
        this.creditId = creditId;
    }

    public String getCheckUserId() {
        return checkUserId;
    }

    public void setCheckUserId(String checkUserId) {
        this.checkUserId = checkUserId;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getAtime() {
        return atime;
    }

    public void setAtime(Date atime) {
        this.atime = atime;
    }

    public String getCtype() {
        return ctype;
    }

    public void setCtype(String ctype) {
        this.ctype = ctype;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getTempcollege() {
        return tempcollege;
    }

    public void setTempcollege(String tempcollege) {
        this.tempcollege = tempcollege;
    }
}
