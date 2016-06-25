package com.vincent.study.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 家人 Model
 *
 * @author Vincent
 * @version 1.0
 * @since 2016-6-25
 */
public class Family implements Serializable {

    private Long familyId;
    private String familyCall;
    private String familyName;
    private Integer familyAge;
    private Date familyBirth;
    private Date familyAddTime;
    private String userId;

    public Long getFamilyId() {
        return familyId;
    }

    public void setFamilyId(Long familyId) {
        this.familyId = familyId;
    }

    public String getFamilyCall() {
        return familyCall;
    }

    public void setFamilyCall(String familyCall) {
        this.familyCall = familyCall;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public Integer getFamilyAge() {
        return familyAge;
    }

    public void setFamilyAge(Integer familyAge) {
        this.familyAge = familyAge;
    }

    public Date getFamilyBirth() {
        return familyBirth;
    }

    public void setFamilyBirth(Date familyBirth) {
        this.familyBirth = familyBirth;
    }

    public Date getFamilyAddTime() {
        return familyAddTime;
    }

    public void setFamilyAddTime(Date familyAddTime) {
        this.familyAddTime = familyAddTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}