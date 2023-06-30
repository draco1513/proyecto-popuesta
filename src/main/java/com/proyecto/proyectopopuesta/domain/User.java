package com.proyecto.proyectopopuesta.domain;

import java.util.Date;

public class User {
    private String userId;
    private String pass;
    private int personId;
    private  int active;
    private String   userAdd;
    private Date dateUserAdd;
    private String userMod;
    private Date dateUserMod;
    private String bPass;
    private int numberDay;
    private int blockNumber;
    private int level;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public String getUserAdd() {
        return userAdd;
    }

    public void setUserAdd(String userAdd) {
        this.userAdd = userAdd;
    }

    public Date getDateUserAdd() {
        return dateUserAdd;
    }

    public void setDateUserAdd(Date dateUserAdd) {
        this.dateUserAdd = dateUserAdd;
    }

    public String getUserMod() {
        return userMod;
    }

    public void setUserMod(String userMod) {
        this.userMod = userMod;
    }

    public Date getDateUserMod() {
        return dateUserMod;
    }

    public void setDateUserMod(Date dateUserMod) {
        this.dateUserMod = dateUserMod;
    }

    public String getbPass() {
        return bPass;
    }

    public void setbPass(String bPass) {
        this.bPass = bPass;
    }

    public int getNumberDay() {
        return numberDay;
    }

    public void setNumberDay(int numberDay) {
        this.numberDay = numberDay;
    }

    public int getBlockNumber() {
        return blockNumber;
    }

    public void setBlockNumber(int blockNumber) {
        this.blockNumber = blockNumber;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
