package com.example.apple.pocketlife.lib.base;

import android.app.Application;
import android.content.Context;

import com.blankj.utilcode.utils.Utils;
import com.example.apple.pocketlife.lib.utils.PrefrefencesUtil;

import cn.bmob.v3.Bmob;

/**
 * Created by apple on 17/3/14.
 */

public class App extends Application {
    public static App app;
    private Context context;
    public static String useName;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        context = this;
        Utils.init(context);
        Bmob.initialize(this, "13cc0bf61fc3781069d714d94d4782e8");
        checkLogin();
    }

    private void checkLogin() {
        String o = (String) PrefrefencesUtil.get(context, "login", "admin");
        if (o.equals("admin")) {
            useName = "admin";
        } else {
            useName = o;
        }
    }
}
