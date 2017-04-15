package com.example.apple.pocketlife.app.ui;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

import com.example.apple.pocketlife.R;
import com.example.apple.pocketlife.app.ui.everyday.TwoFragment;
import com.example.apple.pocketlife.app.ui.news.OneFragment;
import com.example.apple.pocketlife.app.ui.weather.ThreeFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * MainActivity
 */
public class MainActivity extends AppCompatActivity {

    @BindView(R.id.fl_main)
    FrameLayout flMain;
    @BindView(R.id.btn_1)
    Button btn1;
    @BindView(R.id.btn_2)
    Button btn2;
    @BindView(R.id.btn_3)
    Button btn3;

    OneFragment oneFragment;
    TwoFragment twoFragment;
    ThreeFragment threeFragment;
    FragmentManager fm;
    Context context;
    @BindView(R.id.rl_main)
    RelativeLayout rlMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        init();
        initFragment();
    }

    private void init() {
        context = this;
        fm = getSupportFragmentManager();
    }

    private void initFragment() {
        oneFragment = OneFragment.newInstance();
        twoFragment = TwoFragment.newInstance();
        threeFragment = ThreeFragment.newInstance();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.fl_main, oneFragment, "OneFragment");
        ft.add(R.id.fl_main, twoFragment, "TwoFragment");
        ft.add(R.id.fl_main, threeFragment, "ThreeFragment");
        ft.hide(twoFragment);
        ft.hide(threeFragment);
        ft.commit();
    }

    public void showFragment(Fragment f) {
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.hide(oneFragment);
        fragmentTransaction.hide(twoFragment);
        fragmentTransaction.hide(threeFragment);
        fragmentTransaction.show(f);
        fragmentTransaction.commit();

    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @OnClick({R.id.btn_1, R.id.btn_2, R.id.btn_3})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_1:
                showFragment(oneFragment);
                changeTextColorAndPic(btn1);
                break;
            case R.id.btn_2:
                showFragment(twoFragment);
                changeTextColorAndPic(btn2);
                break;
            case R.id.btn_3:
                showFragment(threeFragment);
                changeTextColorAndPic(btn3);
                break;
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    private void changeTextColorAndPic(View view) {
        if (view.getId() == R.id.btn_1) {
            btn1.setTextColor(getResources().getColor(R.color.movie_green));
            btn1.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(R.mipmap.news), null, null);
            btn2.setTextColor(getResources().getColor(R.color.movie_main_textcolor));
            btn2.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(R.mipmap.ency_grey), null, null);
            btn3.setTextColor(getResources().getColor(R.color.movie_main_textcolor));
            btn3.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(R.mipmap.home_grey), null, null);
            rlMain.setBackground(getResources().getDrawable(R.color.white));
            changeTextSize();
            btn1.setTextSize(16);
        } else if (view.getId() == R.id.btn_2) {
            btn1.setTextColor(getResources().getColor(R.color.movie_main_textcolor));
            btn1.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(R.mipmap.news_grey), null, null);
            btn2.setTextColor(getResources().getColor(R.color.movie_green));
            btn2.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(R.mipmap.ency), null, null);
            btn3.setTextColor(getResources().getColor(R.color.movie_main_textcolor));
            btn3.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(R.mipmap.home_grey), null, null);
            rlMain.setBackground(getResources().getDrawable(R.mipmap.twobg));
            changeTextSize();
            btn2.setTextSize(16);
        } else if (view.getId() == R.id.btn_3) {
            btn1.setTextColor(getResources().getColor(R.color.movie_main_textcolor));
            btn1.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(R.mipmap.news_grey), null, null);
            btn2.setTextColor(getResources().getColor(R.color.movie_main_textcolor));
            btn2.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(R.mipmap.ency_grey), null, null);
            btn3.setTextColor(getResources().getColor(R.color.movie_green));
            btn3.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(R.mipmap.home), null, null);
            rlMain.setBackground(getResources().getDrawable(R.mipmap.weather_bg3));
            changeTextSize();
            btn3.setTextSize(16);
        }
    }

    public void changeTextSize() {
        btn1.setTextSize(14);
        btn2.setTextSize(14);
        btn3.setTextSize(14);
    }
}
