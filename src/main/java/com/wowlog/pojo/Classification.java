package com.wowlog.pojo;

import java.util.Date;

public class Classification {
    private Long classificationId;

    private String classificationName;

    private Byte status;

    private Date createDate;

    private Date modifiedDate;

    public Classification(Long classificationId, String classificationName, Byte status, Date createDate, Date modifiedDate) {
        this.classificationId = classificationId;
        this.classificationName = classificationName;
        this.status = status;
        this.createDate = createDate;
        this.modifiedDate = modifiedDate;
    }

    public Classification() {
        super();
    }

    public Long getClassificationId() {
        return classificationId;
    }

    public void setClassificationId(Long classificationId) {
        this.classificationId = classificationId;
    }

    public String getClassificationName() {
        return classificationName;
    }

    public void setClassificationName(String classificationName) {
        this.classificationName = classificationName == null ? null : classificationName.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
}