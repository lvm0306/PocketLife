package com.example.apple.pocketlife.app.ui.bmobbean;

import com.example.apple.pocketlife.lib.base.BaseBean;

import cn.bmob.v3.BmobObject;

/**
 * 登录表
 * Created by apple on 17/4/9.
 */

public class LoginBean extends BaseBean {
    private String name;
    private String psw;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }


}
