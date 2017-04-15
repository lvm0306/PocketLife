package com.example.apple.pocketlife.app.ui.setting;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.apple.pocketlife.R;
import com.example.apple.pocketlife.lib.base.App;
import com.example.apple.pocketlife.lib.utils.PrefrefencesUtil;
import com.example.apple.pocketlife.lib.utils.UIManager;
import com.github.johnpersano.supertoasts.library.Style;
import com.github.johnpersano.supertoasts.library.SuperActivityToast;
import com.github.johnpersano.supertoasts.library.utils.PaletteUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.pedant.SweetAlert.SweetAlertDialog;

/**
 * 设置界面
 */
public class SettingActivity extends AppCompatActivity {

    @BindView(R.id.iv_setting_back)
    ImageView ivSettingBack;
    @BindView(R.id.ll_mine_login)
    LinearLayout llMineLogin;
    @BindView(R.id.ll_mine_love)
    LinearLayout llMineLove;
    @BindView(R.id.ll_mine_history)
    LinearLayout llMineHistory;
    @BindView(R.id.ll_mine_info)
    LinearLayout llMineInfo;
    @BindView(R.id.ll_mine_setting)
    LinearLayout llMineSetting;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        ButterKnife.bind(this);
        context = this;
    }

    @OnClick({R.id.iv_setting_back, R.id.ll_mine_login, R.id.ll_mine_love, R.id.ll_mine_history, R.id.ll_mine_info, R.id.ll_mine_setting})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_setting_back:
                finish();
                break;
            case R.id.ll_mine_login:
                UIManager.LoginSkip(this);
                break;
            case R.id.ll_mine_love:
                if (!App.useName.equals("admin")) {
                    UIManager.MyLoveSkip(this);
                } else {
                    superToast();
                }
                break;
            case R.id.ll_mine_history:
                break;
            case R.id.ll_mine_info:
                break;
            //注销
            case R.id.ll_mine_setting:
                if (!App.useName.equals("admin")) {
                    dialog();
                } else {
                    superToast();
                }
                break;
        }
    }

    private void dialog() {
        new SweetAlertDialog(this, SweetAlertDialog.WARNING_TYPE)
                .setTitleText("真的要注销么 T T" + "\n")
                .setContentText("\n")
                .setConfirmText("确定")
                .setCancelText("取消")
                .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                    @Override
                    public void onClick(SweetAlertDialog sDialog) {
                        logoff();
                        sDialog.dismissWithAnimation();
                    }
                })
                .setCancelClickListener(new SweetAlertDialog.OnSweetClickListener() {
                    @Override
                    public void onClick(SweetAlertDialog sweetAlertDialog) {
                        sweetAlertDialog.dismissWithAnimation();
                    }
                })
                .show();
    }

    private void logoff() {
        App.useName = "admin";
        PrefrefencesUtil.put(context, "login", "admin");
        PrefrefencesUtil.put(context, "login_psw", "admin");
    }

    private void superToast() {
        SuperActivityToast.create(context, new Style(), Style.TYPE_STANDARD)
                .setProgressBarColor(Color.WHITE)
                .setText("您还未登陆哦~")
                .setDuration(Style.DURATION_VERY_SHORT)
                .setFrame(Style.ANIMATIONS_FLY)
                .setColor(PaletteUtils.getSolidColor(PaletteUtils.MATERIAL_GREEN))
                .setAnimations(Style.ANIMATIONS_FLY).show();
    }
}
