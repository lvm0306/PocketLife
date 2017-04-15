package com.example.apple.pocketlife.app.ui.everyday.phoneadress;

import android.app.Activity;

import com.example.apple.pocketlife.app.ui.everyday.bean.PhoneBean;
import com.orhanobut.logger.Logger;

import java.util.Map;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by apple on 17/3/25.
 */

public class PhonePresenter implements PhoneContract.PhonePresenter {
    PhoneModel model;
    PhoneAdressActivity activity;

    public PhonePresenter(PhoneAdressActivity activity) {
        model = new PhoneModel();
        this.activity = activity;
    }

    @Override
    public void loadNetworkData(String url) {
        model.loadNetworkData(url)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<PhoneBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        activity.showErrorInfo((Exception) e);
                        Logger.e(e.getMessage());
                    }

                    @Override
                    public void onNext(PhoneBean phoneBean) {
                        activity.loadNetworkData(phoneBean);
                    }
                });
    }
}
