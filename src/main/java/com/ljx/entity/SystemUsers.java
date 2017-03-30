package com.ljx.entity;

import javax.persistence.*;

@Table(name = "SYSTEM_USERS")
public class SystemUsers {
    @Id
    @Column(name = "USERID")
    private String userid;

    @Column(name = "ORGID")
    private String orgid;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "USERTEL")
    private String usertel;

    @Column(name = "USEREMAIL")
    private String useremail;

    @Column(name = "USERUNIT")
    private String userunit;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "USERRIGHT")
    private String userright;

    /**
     * @return USERID
     */
    public String getUserid() {
        return userid;
    }

    /**
     * @param userid
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * @return ORGID
     */
    public String getOrgid() {
        return orgid;
    }

    /**
     * @param orgid
     */
    public void setOrgid(String orgid) {
        this.orgid = orgid;
    }

    /**
     * @return USERNAME
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return USERTEL
     */
    public String getUsertel() {
        return usertel;
    }

    /**
     * @param usertel
     */
    public void setUsertel(String usertel) {
        this.usertel = usertel;
    }

    /**
     * @return USEREMAIL
     */
    public String getUseremail() {
        return useremail;
    }

    /**
     * @param useremail
     */
    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    /**
     * @return USERUNIT
     */
    public String getUserunit() {
        return userunit;
    }

    /**
     * @param userunit
     */
    public void setUserunit(String userunit) {
        this.userunit = userunit;
    }

    /**
     * @return PASSWORD
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return USERRIGHT
     */
    public String getUserright() {
        return userright;
    }

    /**
     * @param userright
     */
    public void setUserright(String userright) {
        this.userright = userright;
    }
}