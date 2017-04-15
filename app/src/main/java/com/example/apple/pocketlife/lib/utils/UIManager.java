package com.example.apple.pocketlife.lib.utils;

import android.content.Context;
import android.content.Intent;

import com.example.apple.pocketlife.app.ui.everyday.basketball.BasketballActivity;
import com.example.apple.pocketlife.app.ui.everyday.calendar.CalendarActivity;
import com.example.apple.pocketlife.app.ui.everyday.phoneadress.PhoneAdressActivity;
import com.example.apple.pocketlife.app.ui.everyday.star.StarActivity;
import com.example.apple.pocketlife.app.ui.login.LoginActivity;
import com.example.apple.pocketlife.app.ui.regist.RegistActivity;
import com.example.apple.pocketlife.app.ui.setting.MyloveActivity;
import com.example.apple.pocketlife.app.ui.setting.SettingActivity;

/**
 * Created by apple on 17/3/14.
 * 负责跳转页面的
 */

public class UIManager {
    public static void starSkip(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, StarActivity.class);
        context.startActivity(intent);

    }

    public static void basketballSkip(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, BasketballActivity.class);
        context.startActivity(intent);

    }

    public static void phoneadressSkip(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, PhoneAdressActivity.class);
        context.startActivity(intent);

    }

    public static void calendarSkip(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, CalendarActivity.class);
        context.startActivity(intent);

    }

    public static void SettingSkip(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, SettingActivity.class);
        context.startActivity(intent);

    }

    public static void LoginSkip(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, LoginActivity.class);
        context.startActivity(intent);

    }

    public static void RegistSkip(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, RegistActivity.class);
        context.startActivity(intent);

    }

    public static void MyLoveSkip(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, MyloveActivity.class);
        context.startActivity(intent);

    }

}
