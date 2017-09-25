package com.wowlog.pojo;

import java.util.Date;

public class Content {
    private Long contentId;

    private String title;

    private String content;

    private Integer classification;

    private Byte status;

    private Integer hits;

    private Date createDate;

    private Date modifiedDate;

    public Content(Long contentId, String title, String content, Integer classification, Byte status, Integer hits, Date createDate, Date modifiedDate) {
        this.contentId = contentId;
        this.title = title;
        this.content = content;
        this.classification = classification;
        this.status = status;
        this.hits = hits;
        this.createDate = createDate;
        this.modifiedDate = modifiedDate;
    }

    public Content() {
        super();
    }

    public Long getContentId() {
        return contentId;
    }

    public void setContentId(Long contentId) {
        this.contentId = contentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getClassification() {
        return classification;
    }

    public void setClassification(Integer classification) {
        this.classification = classification;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
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