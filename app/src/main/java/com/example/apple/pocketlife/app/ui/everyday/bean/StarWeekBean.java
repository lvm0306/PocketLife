package com.example.apple.pocketlife.app.ui.everyday.bean;

import com.google.gson.annotations.SerializedName;

/**
 * Created by apple on 17/3/25.
 */

public class StarWeekBean {


    /**
     * name : 双鱼座
     * weekth : 12
     * date : 2017年03月20日-2017年03月26日
     * health : 健康：本周双鱼人的食欲会比较旺盛，身体也自然更加壮实。 作者：星言，forseiya
     * job : 求职：本周双鱼人的求职机会带有不错的财运属性，但现有的工作也做的热火朝天，不得不狠心下决定。
     * love : 恋爱：本周双鱼人单身的双鱼人恋爱会感觉难于表达，有伴的最近有话唠的倾向，可能会让另一半吃不消。
     * money : 财运：本周双鱼人的财运更加旺盛，但也存在着鱼和熊掌不可兼得的问题想，需要双鱼人好好思考财富的配置。
     * work : 工作：本周双鱼人的工作进入新一轮的加速中，显得热情更加高涨 。
     * resultcode : 200
     * error_code : 0
     */

    @SerializedName("name")
    private String name;
    @SerializedName("weekth")
    private int weekth;
    @SerializedName("date")
    private String date;
    @SerializedName("health")
    private String health;
    @SerializedName("job")
    private String job;
    @SerializedName("love")
    private String love;
    @SerializedName("money")
    private String money;
    @SerializedName("work")
    private String work;
    @SerializedName("resultcode")
    private String resultcode;
    @SerializedName("error_code")
    private int errorCode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeekth() {
        return weekth;
    }

    public void setWeekth(int weekth) {
        this.weekth = weekth;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
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
        return "StarWeekBean{" +
                "name='" + name + '\'' +
                ", weekth=" + weekth +
                ", date='" + date + '\'' +
                ", health='" + health + '\'' +
                ", job='" + job + '\'' +
                ", love='" + love + '\'' +
                ", money='" + money + '\'' +
                ", work='" + work + '\'' +
                ", resultcode='" + resultcode + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
