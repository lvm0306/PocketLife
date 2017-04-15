package com.example.apple.pocketlife.app.ui.everyday.star;

import com.example.apple.pocketlife.app.ui.everyday.bean.StarDayBean;
import com.example.apple.pocketlife.app.ui.everyday.bean.StarWeekBean;
import com.orhanobut.logger.Logger;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by apple on 17/3/25.
 */

public class StarPresenter implements StarContract.IStarPresenter {

    StarActivity starActivity;
    StarModel starModel;

    public StarPresenter(StarActivity starActivity) {
        this.starActivity = starActivity;
        this.starModel = new StarModel();
    }

    @Override
    public void loadStarDayData(String url) {
        starModel.loadStarDayData(url).subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<StarDayBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Logger.e(e.getMessage());
                    }

                    @Override
                    public void onNext(StarDayBean starDayBean) {
                        starActivity.loadStarDayData(starDayBean);
                    }
                });
    }

    @Override
    public void loadStarWeekData(String url) {
        starModel.loadStarWeekData(url).subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<StarWeekBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Logger.e(e.getMessage());
                    }

                    @Override
                    public void onNext(StarWeekBean starWeekBean) {
                        starActivity.loadStarWeekData(starWeekBean);
                    }
                });
    }
}
