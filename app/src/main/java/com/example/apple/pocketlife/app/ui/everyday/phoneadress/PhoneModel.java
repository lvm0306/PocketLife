package com.example.apple.pocketlife.app.ui.everyday.phoneadress;

import com.example.apple.pocketlife.app.http.HttpUtils;
import com.example.apple.pocketlife.app.http.NetCallBack;
import com.example.apple.pocketlife.app.ui.everyday.bean.PhoneBean;

import java.util.Map;

import rx.Observable;

/**
 * Created by apple on 17/3/25.
 */

public class PhoneModel implements PhoneContract.PhoneModel {

    @Override
    public Observable<PhoneBean> loadNetworkData(String url) {
        return HttpUtils.Newinstance().getPhoneAdress(url);
    }
}
