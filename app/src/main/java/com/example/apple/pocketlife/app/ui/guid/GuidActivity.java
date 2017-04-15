package com.example.apple.pocketlife.app.ui.guid;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.apple.pocketlife.app.ui.MainActivity;
import com.example.apple.pocketlife.R;
import com.gastudio.gabottleloading.library.GABottleLoadingView;
import com.hanks.htextview.HTextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 导航页
 */
public class GuidActivity extends AppCompatActivity {
    Context context;
    @BindView(R.id.tv_guid_num)
    TextView tvGuidNum;
    @BindView(R.id.tv_guid_text)
    TextView tvGuidText;
    @BindView(R.id.ga_bottle_loading_view)
    GABottleLoadingView gaBottleLoadingView;
    @BindView(R.id.htv_guid)
    HTextView htvGuid;
    int num = 0;
    Handler handler = new Handler();
    String[] appName = new String[]{"最xin的新闻", "最new的天气预报", "最close的帮助", "一切尽在！", "口袋生活"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guid);
        ButterKnife.bind(this);
        context = this;
        gaBottleLoadingView.performAnimation();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent();
                i.setClass(context, MainActivity.class);
                startActivity(i);
                finish();
            }
        }, 5000);
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (; num < 5; num++) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            tvGuidNum.setText((5 - num) + "");
                            htvGuid.animateText(appName[num]);

                        }
                    });
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        initHtext();
    }

    private void initHtext() {
        htvGuid.setTextColor(Color.WHITE);
        htvGuid.setTypeface(null);
//        htvGuid.setAnimateType(HTextViewType.SPARKLE);
    }

    @OnClick({R.id.tv_guid_num, R.id.tv_guid_text})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_guid_num:
                Intent i2 = new Intent();
                i2.setClass(context, MainActivity.class);
                startActivity(i2);
                finish();
                break;
            case R.id.tv_guid_text:
                Intent i1 = new Intent();
                i1.setClass(context, MainActivity.class);
                startActivity(i1);
                finish();

                break;
        }
    }
}
