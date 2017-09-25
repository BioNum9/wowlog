package com.wowlog.pojo;

import java.util.Date;

public class User {
    private Long userId;

    private String username;

    private String password;

    private String email;

    private String mobile;

    private Byte status;

    private Date createDate;

    public User(Long userId, String username, String password, String email, String mobile, Byte status, Date createDate) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.email = email;
        this.mobile = mobile;
        this.status = status;
        this.createDate = createDate;
    }

    public User() {
        super();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
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
}