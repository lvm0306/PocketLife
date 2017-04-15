package com.example.apple.pocketlife.app.ui.everyday.calendar;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.apple.pocketlife.R;
import com.example.apple.pocketlife.app.http.HttpUtils;
import com.example.apple.pocketlife.app.ui.everyday.bean.WanYearBean;
import com.orhanobut.logger.Logger;
import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import com.prolificinteractive.materialcalendarview.OnDateSelectedListener;

import butterknife.BindView;
import butterknife.ButterKnife;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * 万年历
 */
public class CalendarActivity extends AppCompatActivity {

    @BindView(R.id.calendarView)
    MaterialCalendarView calendarView;
    @BindView(R.id.tv_cale_day)
    TextView tvCaleDay;
    @BindView(R.id.tv_cale_mouth)
    TextView tvCaleMouth;
    @BindView(R.id.tv_cale_date)
    TextView tvCaleDate;
    @BindView(R.id.tv_cale_animals)
    TextView tvCaleAnimals;
    @BindView(R.id.tv_cale_suit)
    TextView tvCaleSuit;
    @BindView(R.id.tv_cale_avoid)
    TextView tvCaleAvoid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        ButterKnife.bind(this);
        calendarView.setOnDateChangedListener(new OnDateSelectedListener() {
            @Override
            public void onDateSelected(@NonNull MaterialCalendarView widget, @NonNull final CalendarDay date, boolean selected) {
                String url = date.getYear() + "-" + (date.getMonth() + 1) + "-" + date.getDay();
                Logger.e(url);
                String url1 = "http://v.juhe.cn/calendar/day?date=" + url + "&key=487cc26fcca63fb9b10b2ce4c82d2979";
                HttpUtils.Newinstance().getWanYear(url1).subscribeOn(Schedulers.newThread())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(new Subscriber<WanYearBean>() {
                            @Override
                            public void onCompleted() {

                            }

                            @Override
                            public void onError(Throwable e) {
                                Logger.e(e.getMessage());
                            }

                            @Override
                            public void onNext(WanYearBean wanYearBean) {
                                Logger.e(wanYearBean.toString() + "");

                                WanYearBean.ResultBean.DataBean data = wanYearBean.getResult().getData();
                                tvCaleAnimals.setText(data.getLunarYear() + " 属" + data.getAnimalsYear());
                                tvCaleAvoid.setText(data.getAvoid());
                                tvCaleSuit.setText(data.getSuit());
                                tvCaleDay.setText(date.getDay() + "");
                                tvCaleMouth.setText(data.getLunar());
                                tvCaleDate.setText(data.getWeekday());
                            }
                        });
            }
        });
    }
}
