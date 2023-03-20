package com.sc_core.entity;

import lombok.ToString;

@ToString
public class CommunityWorker {

    private Integer caregiverWorkerId;

    private String name;

    private String sex;

    private Integer age;

    private String username;

    private String workerCommunity;

    private String telephone;

    public Integer getCaregiverWorkerId() {
        return caregiverWorkerId;
    }

    public void setCaregiverWorkerId(Integer caregiverWorkerId) {
        this.caregiverWorkerId = caregiverWorkerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getWorkerCommunity() {
        return workerCommunity;
    }

    public void setWorkerCommunity(String workerCommunity) {
        this.workerCommunity = workerCommunity;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
