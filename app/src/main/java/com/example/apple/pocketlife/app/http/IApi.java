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

import retrofit2.http.GET;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;
import rx.Observable;

/**
 * 网络连接接口
 * Created by apple on 17/3/14.
 */

public interface IApi {
    /**
     * 模板、
     *
     * @GET(UrlConstant.Path.ULR_INTHEATERS) Observable<InTheatersBean> getInTheaters();
     * @GET(UrlConstant.Path.ULR_COMEINGSOON) Observable<ComingSoonBean> getComingSoon();
     */
    @GET(UrlConstant.Path.NEWS_INDEX)
    Observable<NewsBean> getNews(@QueryMap Map<String, String> map);

    /**
     * 手机归属地查询
     *
     * @param url
     * @return
     */
    @GET
    Observable<PhoneBean> getPhoneAdress(@Url String url);

    /**
     * 星座查询
     *
     * @param url
     * @return
     */
    @GET
    Observable<StarDayBean> getStarToday(@Url String url);

    /**
     * 星座查询
     *
     * @param url
     * @return
     */
    @GET
    Observable<StarWeekBean> getStarWeek(@Url String url);

    /**
     * 获取常规赛程
     *
     * @param url
     * @return
     */
    @GET
    Observable<BasketNorBean> getBasketNor(@Url String url);

    /**
     * 获取球队赛程
     *
     * @param url
     * @return
     */
    @GET
    Observable<BasketTsBean> getBasketTeamSchedule(@Url String url);

    /**
     * NBA
     *
     * @param url
     * @return
     */
    @GET
    Observable<BasketTmBean> getBasketTeamMatch(@Url String url);

    /**
     * 天气查询
     *
     * @param url
     * @return
     */
    @GET
    Observable<WeatherBean> getWeather(@Url String url);

    /**
     * 万年历
     *
     * @param url
     * @return
     */
    @GET
    Observable<WanYearBean> getWanYear(@Url String url);
}
