package com.example.apple.pocketlife.app.ui.everyday.star;

import com.example.apple.pocketlife.app.http.HttpUtils;
import com.example.apple.pocketlife.app.ui.everyday.bean.StarDayBean;
import com.example.apple.pocketlife.app.ui.everyday.bean.StarWeekBean;

import rx.Observable;

/**
 * Created by apple on 17/3/25.
 */

public class StarModel implements StarContract.IStarModel {
    @Override
    public Observable<StarDayBean> loadStarDayData(String url) {
        return HttpUtils.Newinstance().getStarToday(url);
    }

    @Override
    public Observable<StarWeekBean> loadStarWeekData(String url) {

        return HttpUtils.Newinstance().getStarWeek(url);
    }
}
