package com.example.apple.pocketlife.app.ui.everyday.star;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;

import com.blankj.utilcode.utils.ToastUtils;
import com.example.apple.pocketlife.R;
import com.example.apple.pocketlife.app.ui.everyday.bean.StarDayBean;
import com.example.apple.pocketlife.app.ui.everyday.bean.StarWeekBean;
import com.orhanobut.logger.Logger;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 星座查询
 */
public class StarActivity extends AppCompatActivity implements StarContract.IStarView {

    @BindView(R.id.btn_star_choose)
    Button btnStarChoose;
    @BindView(R.id.rb_star_today)
    RatingBar rbStarToday;
    @BindView(R.id.tv_star_color_today)
    TextView tvStarColorToday;
    @BindView(R.id.tv_star_health_today)
    TextView tvStarHealthToday;
    @BindView(R.id.tv_star_love_today)
    TextView tvStarLoveToday;
    @BindView(R.id.tv_star_money_today)
    TextView tvStarMoneyToday;
    @BindView(R.id.tv_star_friend_today)
    TextView tvStarFriendToday;
    @BindView(R.id.tv_star_work_today)
    TextView tvStarWorkToday;
    @BindView(R.id.tv_star_summary_today)
    TextView tvStarSummaryToday;
    @BindView(R.id.ll_star_today)
    LinearLayout llStarToday;
    @BindView(R.id.tv_star_health_week)
    TextView tvStarHealthWeek;
    @BindView(R.id.tv_star_love_week)
    TextView tvStarLoveWeek;
    @BindView(R.id.tv_star_money_week)
    TextView tvStarMoneyWeek;
    @BindView(R.id.tv_star_work_week)
    TextView tvStarWorkWeek;
    @BindView(R.id.tv_star_job_week)
    TextView tvStarJobWeek;
    @BindView(R.id.ll_star_week)
    LinearLayout llStarWeek;
    @BindView(R.id.tv_star_week)
    TextView tvStarWeek;
    @BindView(R.id.tv_star_today)
    TextView tvStarToday;
    @BindView(R.id.tv_star_tomorrow)
    TextView tvStarTomorrow;
    @BindView(R.id.sp_star)
    Spinner spStar;
    @BindView(R.id.ll_star_bg)
    LinearLayout llStarBg;


    private boolean chooes = false;
    private String starName = "";
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_star);
        ButterKnife.bind(this);
        context = this;
        initSpinner();
    }

    /**
     * 初始化 下拉列表
     */
    private void initSpinner() {
        final String[] starall = getResources().getStringArray(R.array.starall);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, starall);
        spStar.setAdapter(adapter);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spStar.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                starName = starall[position];
                switch (position) {
                    case 0:
                        llStarBg.setBackground(context.getResources().getDrawable(R.drawable.star12_aqaurius));
                        break;
                    case 1:
                        llStarBg.setBackground(context.getResources().getDrawable(R.drawable.star12_pisecs));

                        break;
                    case 2:
                        llStarBg.setBackground(context.getResources().getDrawable(R.drawable.star12_aries));

                        break;
                    case 3:
                        llStarBg.setBackground(context.getResources().getDrawable(R.drawable.star12_taurus));

                        break;
                    case 4:
                        llStarBg.setBackground(context.getResources().getDrawable(R.drawable.star12_gemini));

                        break;
                    case 5:
                        llStarBg.setBackground(context.getResources().getDrawable(R.drawable.star12_cancer));

                        break;
                    case 6:
                        llStarBg.setBackground(context.getResources().getDrawable(R.drawable.star12_leo));

                        break;
                    case 7:
                        llStarBg.setBackground(context.getResources().getDrawable(R.drawable.star12_virgo));

                        break;
                    case 8:
                        llStarBg.setBackground(context.getResources().getDrawable(R.drawable.star12_libra));

                        break;
                    case 9:
                        llStarBg.setBackground(context.getResources().getDrawable(R.drawable.star12_scorpio));

                        break;
                    case 10:
                        llStarBg.setBackground(context.getResources().getDrawable(R.drawable.star12_sgit));

                        break;
                    case 11:
                        llStarBg.setBackground(context.getResources().getDrawable(R.drawable.star12_capricorn));

                        break;

                }
                chooes = true;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    @Override
    public void showErrorInfo(Exception ex) {

    }

    @Override
    public void loadStarDayData(StarDayBean starDayBean) {
        Logger.e(starDayBean.toString());
        llStarToday.setVisibility(View.VISIBLE);
        llStarWeek.setVisibility(View.GONE);
        tvStarColorToday.setText("幸运颜色：" + starDayBean.getColor());
        tvStarHealthToday.setText("健康指数：" + starDayBean.getHealth());
        tvStarFriendToday.setText("最佳拍档：" + starDayBean.getQFriend());
        tvStarLoveToday.setText("爱情指数：" + starDayBean.getLove());
        tvStarMoneyToday.setText("赚钱指数：" + starDayBean.getMoney());
        tvStarWorkToday.setText("工作指数：" + starDayBean.getWork());
        tvStarSummaryToday.setText("今日总结：" + starDayBean.getSummary());
        rbStarToday.setRating(starDayBean.getNumber());

    }

    @Override
    public void loadStarWeekData(StarWeekBean starWeekBean) {
        Logger.e(starWeekBean.toString());
        llStarToday.setVisibility(View.GONE);
        llStarWeek.setVisibility(View.VISIBLE);
        tvStarHealthWeek.setText(starWeekBean.getHealth());
        tvStarLoveWeek.setText(starWeekBean.getLove());
        tvStarMoneyWeek.setText(starWeekBean.getMoney());
        tvStarWorkWeek.setText(starWeekBean.getWork());

    }

    @OnClick({R.id.tv_star_week, R.id.tv_star_today, R.id.tv_star_tomorrow, R.id.btn_star_choose})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_star_week:

                starshow("week");
                break;
            case R.id.tv_star_today:

                starshow("today");
                break;
            case R.id.tv_star_tomorrow:

                starshow("tomorrow");
                break;
            case R.id.btn_star_choose:
                starshow("today");
                break;
        }
    }

    public void starshow(String type) {
        if (chooes) {
            StarPresenter presenter = new StarPresenter(this);
            String url = "http://web.juhe.cn:8080/constellation/getAll?consName=" + starName + "&type=" + type + "&key=88dd08554b74ada0b134b26d53ab8813";
            if (type.equals("today")) {
                presenter.loadStarDayData(url);
            } else if (type.equals("tomorrow")) {
                presenter.loadStarDayData(url);
            } else if (type.equals("week")) {
                presenter.loadStarWeekData(url);
            }
        } else {
            ToastUtils.showShortToast("请先选择星座");
        }
    }
}
