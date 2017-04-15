package com.example.apple.pocketlife.app.ui.everyday.bean;

import com.google.gson.annotations.SerializedName;

/**
 * Created by apple on 17/3/25.
 */

public class StarDayBean  {


    /**
     * date : 20170326
     * name : 双鱼座
     * datetime : 2017年03月26日
     * all : 60%
     * color : 黑
     * health : 70%
     * love : 60%
     * money : 80%
     * number : 6
     * QFriend : 双子
     * summary : 恋爱中的双鱼座今天能感受到恋人的体贴和温柔，感情不断升温。有比较好的投资运，可以做这方面的计划。最近你的身体可能一直有些小毛病，注意保护好自己的肝胆，早点睡。
     * work : 80%
     * resultcode : 200
     * error_code : 0
     */

    @SerializedName("date")
    private int date;
    @SerializedName("name")
    private String name;
    @SerializedName("datetime")
    private String datetime;
    @SerializedName("all")
    private String all;
    @SerializedName("color")
    private String color;
    @SerializedName("health")
    private String health;
    @SerializedName("love")
    private String love;
    @SerializedName("money")
    private String money;
    @SerializedName("number")
    private int number;
    @SerializedName("QFriend")
    private String QFriend;
    @SerializedName("summary")
    private String summary;
    @SerializedName("work")
    private String work;
    @SerializedName("resultcode")
    private String resultcode;
    @SerializedName("error_code")
    private int errorCode;

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getAll() {
        return all;
    }

    public void setAll(String all) {
        this.all = all;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public String getLove() {
        return love;
    }

    public void setLove(String love) {
        this.love = love;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getQFriend() {
        return QFriend;
    }

    public void setQFriend(String QFriend) {
        this.QFriend = QFriend;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public String toString() {
        return "StarDayBean{" +
                "date=" + date +
                ", name='" + name + '\'' +
                ", datetime='" + datetime + '\'' +
                ", all='" + all + '\'' +
                ", color='" + color + '\'' +
                ", health='" + health + '\'' +
                ", love='" + love + '\'' +
                ", money='" + money + '\'' +
                ", number=" + number +
                ", QFriend='" + QFriend + '\'' +
                ", summary='" + summary + '\'' +
                ", work='" + work + '\'' +
                ", resultcode='" + resultcode + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
