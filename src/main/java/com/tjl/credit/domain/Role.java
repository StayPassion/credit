package com.tjl.credit.domain;

public class Role {
    private Integer id;

    private Integer personmanage;

    private Integer rolemmanage;

    private Integer usermanage;

    private Integer noticemanage;

    private Integer auditmanage;

    private Integer creditsmanage;

    private Integer applymanage;

    private String rolename;

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public Integer getApplymanage() {
        return applymanage;
    }

    public void setApplymanage(Integer applymanage) {
        this.applymanage = applymanage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getPersonmanage() {
        return personmanage;
    }

    public void setPersonmanage(Integer personmanage) {
        this.personmanage = personmanage;
    }

    public Integer getRolemmanage() {
        return rolemmanage;
    }

    public void setRolemmanage(Integer rolemmanage) {
        this.rolemmanage = rolemmanage;
    }

    public Integer getUsermanage() {
        return usermanage;
    }

    public void setUsermanage(Integer usermanage) {
        this.usermanage = usermanage;
    }

    public Integer getNoticemanage() {
        return noticemanage;
    }

    public void setNoticemanage(Integer noticemanage) {
        this.noticemanage = noticemanage;
    }

    public Integer getAuditmanage() {
        return auditmanage;
    }

    public void setAuditmanage(Integer auditmanage) {
        this.auditmanage = auditmanage;
    }

    public Integer getCreditsmanage() {
        return creditsmanage;
    }

    public void setCreditsmanage(Integer creditsmanage) {
        this.creditsmanage = creditsmanage;
    }
}