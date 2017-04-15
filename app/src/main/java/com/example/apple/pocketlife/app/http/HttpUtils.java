package com.example.apple.pocketlife.app.http;

import com.example.apple.pocketlife.app.constant.UrlConstant;
import com.example.apple.pocketlife.app.ui.everyday.bean.BasketNorBean;
import com.example.apple.pocketlife.app.ui.everyday.bean.BasketTmBean;
import com.example.apple.pocketlife.app.ui.everyday.bean.BasketTsBean;
import com.example.apple.pocketlife.app.ui.everyday.bean.PhoneBean;
import com.example.apple.pocketlife.app.ui.everyday.bean.StarDayBean;
import com.example.apple.pocketlife.app.ui.everyday.bean.StarWeekBean;
import com.example.apple.pocketlife.app.ui.everyday.bean.WanYearBean;
import com.example.apple.pocketlife.app.ui.news.bean.NewsBean;
import com.example.apple.pocketlife.app.ui.weather.bean.WeatherBean;

import java.util.Map;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;

/**
 * 网络连接
 * Created by apple on 17/3/14.
 */

public class HttpUtils {
    private static HttpUtils mHttpUtils;
    private Retrofit mRetrofit;
    private IApi mApi;

    private HttpUtils() {
        //retrofit 初始化
        mRetrofit = new Retrofit.Builder()
                .baseUrl(UrlConstant.NEWS_BASE_URL)//公共地址
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())//类型转换工厂
                .build();
        mApi = mRetrofit.create(IApi.class);
    }

    public synchronized static HttpUtils Newinstance() {
        if (mHttpUtils == null) {
            mHttpUtils = new HttpUtils();
        }
        return mHttpUtils;
    }

    //头条新闻
    public Observable<NewsBean> getNews(Map<String, String> map) {
        return mApi.getNews(map);
    }

    //手机归属地
    public Observable<PhoneBean> getPhoneAdress(String url) {
        return mApi.getPhoneAdress(url);
    }

    //星座日指数
    public Observable<StarDayBean> getStarToday(String url) {
        return mApi.getStarToday(url);
    }

    //星座周指数
    public Observable<StarWeekBean> getStarWeek(String url) {
        return mApi.getStarWeek(url);
    }

    //获取常规赛程
    public Observable<BasketNorBean> getBasketNor(String url) {
        return mApi.getBasketNor(url);
    }

    //获取球队赛程
    public Observable<BasketTsBean> getBasketTeamSchedule(String url) {
        return mApi.getBasketTeamSchedule(url);
    }    //获取球队赛程

    //获取球队pk
    public Observable<BasketTmBean> getBasketTeamMatch(String url) {
        return mApi.getBasketTeamMatch(url);
    }

    //获取天气
    public Observable<WeatherBean> getWeather(String url) {
        return mApi.getWeather(url);
    }

    //万年历
    public Observable<WanYearBean> getWanYear(String url) {
        return mApi.getWanYear(url);
    }
}
