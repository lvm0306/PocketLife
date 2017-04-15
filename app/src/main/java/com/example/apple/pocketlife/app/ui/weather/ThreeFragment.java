package com.example.apple.pocketlife.app.ui.weather;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.example.apple.pocketlife.R;
import com.example.apple.pocketlife.app.http.HttpUtils;
import com.example.apple.pocketlife.app.ui.weather.bean.WeatherBean;
import com.example.apple.pocketlife.lib.base.BaseFragment;
import com.example.apple.pocketlife.lib.utils.UIManager;
import com.orhanobut.logger.Logger;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * 第三页
 */
public class ThreeFragment extends BaseFragment {

    private static final int WRITE_COARSE_LOCATION_REQUEST_CODE = 1;

    //声明AMapLocationClient类对象
    public AMapLocationClient mLocationClient = null;
    public AMapLocationClientOption mLocationOption = null;
    @BindView(R.id.tv_wt_city)
    TextView tvWtCity;
    @BindView(R.id.tv_wt_temper)
    TextView tvWtTemper;
    @BindView(R.id.tv_wt_pm)
    TextView tvWtPm;
    @BindView(R.id.tv_wt_wind_d)
    TextView tvWtWindD;
    @BindView(R.id.tv_wt_wind_level)
    TextView tvWtWindLevel;
    @BindView(R.id.tv_pollute)
    TextView tvPollute;
    @BindView(R.id.iv_weather_icon)
    ImageView ivWeatherIcon;
    @BindView(R.id.iv_wt_today)
    ImageView ivWtToday;
    @BindView(R.id.tv_wt_today_max)
    TextView tvWtTodayMax;
    @BindView(R.id.tv_wt_today_min)
    TextView tvWtTodayMin;
    @BindView(R.id.tv_wt_today_text)
    TextView tvWtTodayText;
    @BindView(R.id.iv_wt_tomorrow)
    ImageView ivWtTomorrow;
    @BindView(R.id.tv_wt_tomorrow_max)
    TextView tvWtTomorrowMax;
    @BindView(R.id.tv_wt_tomorrow_min)
    TextView tvWtTomorrowMin;
    @BindView(R.id.tv_wt_tomorrow_text)
    TextView tvWtTomorrowText;
    @BindView(R.id.iv_wt_aftom)
    ImageView ivWtAftom;
    @BindView(R.id.tv_wt_aftom_max)
    TextView tvWtAftomMax;
    @BindView(R.id.tv_wt_aftom_min)
    TextView tvWtAftomMin;
    @BindView(R.id.tv_wt_aftom_text)
    TextView tvWtAftomText;
    @BindView(R.id.tv_wt_car)
    TextView tvWtCar;
    @BindView(R.id.tv_wt_close)
    TextView tvWtClose;
    @BindView(R.id.imageView2)
    ImageView imageView2;
    @BindView(R.id.tv_wt_perproline)
    TextView tvWtPerproline;
    @BindView(R.id.tv_wt_healthy)
    TextView tvWtHealthy;
    @BindView(R.id.tv_wt_sport)
    TextView tvWtSport;
    @BindView(R.id.tv_glass)
    TextView tvGlass;
    @BindView(R.id.iv_wt_setting)
    ImageView ivWtSetting;

    public ThreeFragment() {
        // Required empty public constructor
    }


    public static ThreeFragment newInstance() {
        ThreeFragment fragment = new ThreeFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (ContextCompat.checkSelfPermission(getMyActivity(), Manifest.permission.ACCESS_COARSE_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {
            //申请WRITE_EXTERNAL_STORAGE权限
            ActivityCompat.requestPermissions(getMyActivity(), new String[]{Manifest.permission.ACCESS_COARSE_LOCATION},
                    WRITE_COARSE_LOCATION_REQUEST_CODE);//自定义的code
        }
        initGPS();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_three, container, false);
        ButterKnife.bind(this, view);
        initView();

        return view;
    }

    private void initView() {
        ivWtSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UIManager.SettingSkip(getMyActivity());
            }
        });
    }

    private void initGPS() {
        //初始化定位
        mLocationClient = new AMapLocationClient(getActivity().getApplicationContext());

        //异步获取定位结果
        AMapLocationListener mLocationListener = new AMapLocationListener() {
            @Override
            public void onLocationChanged(AMapLocation amapLocation) {
                if (amapLocation != null) {
                    if (amapLocation.getErrorCode() == 0) {
                        //解析定位结果
                        double latitude = amapLocation.getLatitude();//获取纬度
                        double longitude = amapLocation.getLongitude();//获取经度
                        Logger.e(latitude + "----" + longitude);
                        initWeather(latitude, longitude);
                    } else {
                        Logger.e(amapLocation.getErrorInfo());
                    }
                }
            }
        };
        //设置定位回调监听
        mLocationClient.setLocationListener(mLocationListener);
        mLocationOption = new AMapLocationClientOption();
        mLocationOption.setLocationMode(AMapLocationClientOption.AMapLocationMode.Hight_Accuracy);
        mLocationOption.setOnceLocationLatest(true);
        mLocationOption.setOnceLocation(true);
        mLocationClient.setLocationOption(mLocationOption);
        //启动定位
        mLocationClient.startLocation();
    }

    private void initWeather(double latitude, double longitude) {
        String url = "https://free-api.heweather.com/v5/weather?city=" + longitude + "," + latitude + "&key=9e75b0d5f11341ae934af6eb2729d3fe";
        HttpUtils.Newinstance().getWeather(url)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<WeatherBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Logger.e(e.getMessage());
                    }

                    @Override
                    public void onNext(WeatherBean weatherBean) {
                        Logger.e(weatherBean.getHeWeather5().get(0).getStatus() + "");
                        WeatherBean.HeWeather5Bean heWeather5Bean = weatherBean.getHeWeather5().get(0);

                        List<WeatherBean.HeWeather5Bean.DailyForecastBean> dailyForecast = heWeather5Bean.getDailyForecast();
                        WeatherBean.HeWeather5Bean.BasicBean basic = heWeather5Bean.getBasic();
                        List<WeatherBean.HeWeather5Bean.HourlyForecastBean> hourlyForecast = heWeather5Bean.getHourlyForecast();
                        WeatherBean.HeWeather5Bean.NowBean now = heWeather5Bean.getNow();
                        WeatherBean.HeWeather5Bean.SuggestionBean suggestion = heWeather5Bean.getSuggestion();
                        //天气导航
                        tvWtCity.setText("当前城市：" + heWeather5Bean.getBasic().getCity());
                        tvWtTemper.setText("当前气温：" + now.getTmp());
                        tvWtPm.setText("湿度：" + now.getHum() + "%");
                        tvWtWindD.setText("风向：" + now.getWind().getDir());
                        tvWtWindLevel.setText("风力等级：" + now.getWind().getSc());
                        tvPollute.setText("天气状况：" + now.getCond().getTxt());
                        ivWeatherIcon.setImageDrawable(getResources().getDrawable(getSrc(now.getCond().getCode())));
                        //今天
                        tvWtTodayMax.setText(dailyForecast.get(0).getTmp().getMax() + "℃");
                        tvWtTodayMin.setText(dailyForecast.get(0).getTmp().getMin() + "℃");
                        tvWtTodayText.setText(dailyForecast.get(0).getCond().getTxtD());
                        ivWtToday.setImageDrawable(getResources().getDrawable(getSrc(dailyForecast.get(0).getCond().getCodeD())));
                        //今天
                        tvWtTomorrowMax.setText(dailyForecast.get(1).getTmp().getMax() + "℃");
                        tvWtTomorrowMin.setText(dailyForecast.get(1).getTmp().getMin() + "℃");
                        tvWtTomorrowText.setText(dailyForecast.get(1).getCond().getTxtD());
                        ivWtTomorrow.setImageDrawable(getResources().getDrawable(getSrc(dailyForecast.get(1).getCond().getCodeD())));
                        //今天
                        tvWtAftomMax.setText(dailyForecast.get(2).getTmp().getMax() + "℃");
                        tvWtAftomMin.setText(dailyForecast.get(2).getTmp().getMin() + "℃");
                        tvWtAftomText.setText(dailyForecast.get(2).getCond().getTxtD());
                        ivWtAftom.setImageDrawable(getResources().getDrawable(getSrc(dailyForecast.get(0).getCond().getCodeD())));
                        //生活指数
                        tvWtCar.setText(suggestion.getCw().getBrf());
                        tvWtClose.setText(suggestion.getDrsg().getBrf());
                        tvWtHealthy.setText(suggestion.getFlu().getBrf());
                        tvGlass.setText(suggestion.getComf().getBrf());
                        tvWtSport.setText(suggestion.getSport().getBrf());
                        tvWtPerproline.setText(suggestion.getUv().getBrf());
                    }
                });
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        //可在此继续其他操作。
    }

    public int getSrc(String code) {
        switch (code) {
            case "100":
                return R.mipmap.w_100;
            case "101":
                return R.mipmap.w_101;
            case "102":
                return R.mipmap.w_102;
            case "103":
                return R.mipmap.w_103;
            case "104":
                return R.mipmap.w_104;
            case "200":
                return R.mipmap.w_200;
            case "201":
                return R.mipmap.w_201;
            case "202":
                return R.mipmap.w_202;
            case "203":
                return R.mipmap.w_203;
            case "204":
                return R.mipmap.w_204;
            case "205":
                return R.mipmap.w_205;
            case "206":
                return R.mipmap.w_206;
            case "207":
                return R.mipmap.w_207;
            case "208":
                return R.mipmap.w_208;
            case "209":
                return R.mipmap.w_209;
            case "210":
                return R.mipmap.w_210;
            case "211":
                return R.mipmap.w_211;
            case "212":
                return R.mipmap.w_212;
            case "213":
                return R.mipmap.w_213;
            case "300":
                return R.mipmap.w_300;
            case "301":
                return R.mipmap.w_301;
            case "302":
                return R.mipmap.w_302;
            case "303":
                return R.mipmap.w_303;
            case "304":
                return R.mipmap.w_304;
            case "305":
                return R.mipmap.w_305;
            case "306":
                return R.mipmap.w_306;
            case "307":
                return R.mipmap.w_307;
            case "308":
                return R.mipmap.w_308;
            case "309":
                return R.mipmap.w_309;
            case "310":
                return R.mipmap.w_310;
            case "311":
                return R.mipmap.w_311;
            case "312":
                return R.mipmap.w_312;
            case "313":
                return R.mipmap.w_313;
            case "400":
                return R.mipmap.w_400;
            case "401":
                return R.mipmap.w_401;
            case "402":
                return R.mipmap.w_402;
            case "403":
                return R.mipmap.w_403;
            case "404":
                return R.mipmap.w_404;
            case "405":
                return R.mipmap.w_405;
            case "406":
                return R.mipmap.w_406;
            case "407":
                return R.mipmap.w_407;
            case "500":
                return R.mipmap.w_500;
            case "501":
                return R.mipmap.w_501;
            case "502":
                return R.mipmap.w_502;
            case "503":
                return R.mipmap.w_503;
            case "504":
                return R.mipmap.w_504;
            case "507":
                return R.mipmap.w_507;
            case "508":
                return R.mipmap.w_508;
            case "900":
                return R.mipmap.w_900;
            case "901":
                return R.mipmap.w_901;
            case "999":
                return R.mipmap.w_999;
        }
        return R.mipmap.w_999;
    }
}
