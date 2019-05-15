package com.tjl.credit.domain;

import java.util.Date;
import java.util.List;

public class Credit {
    private Integer id;

    private String username;

    private Date atime;

    private String ctype;

    private String state;

    private String note;

    private String file;
    private String tempcollege;

    public String getTempcollege() {
        return tempcollege;
    }

    public void setTempcollege(String tempcollege) {
        this.tempcollege = tempcollege;
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
        this.ctype = ctype == null ? null : ctype.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file == null ? null : file.trim();
    }

}