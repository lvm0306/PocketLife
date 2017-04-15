package com.example.apple.pocketlife.app.ui.everyday.star;

import com.example.apple.pocketlife.app.ui.everyday.bean.StarDayBean;
import com.example.apple.pocketlife.app.ui.everyday.bean.StarWeekBean;
import com.example.apple.pocketlife.lib.base.IBaseModel;
import com.example.apple.pocketlife.lib.base.IBasePresenter;
import com.example.apple.pocketlife.lib.base.IBaseView;

import rx.Observable;

/**
 * Created by apple on 17/3/25.
 */

public class StarContract {
    public static interface IStarModel extends IBaseModel {
        Observable<StarDayBean> loadStarDayData(String url);

        Observable<StarWeekBean> loadStarWeekData(String url);
    }

    public static interface IStarPresenter extends IBasePresenter {

        void loadStarDayData(String url);

        void loadStarWeekData(String url);
    }

    public static interface IStarView extends IBaseView {
        void showErrorInfo(Exception ex);

        void loadStarDayData(StarDayBean starDayBean);

        void loadStarWeekData(StarWeekBean starWeekBean);
    }
}
