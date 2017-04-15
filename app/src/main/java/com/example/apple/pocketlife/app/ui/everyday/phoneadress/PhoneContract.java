package com.example.apple.pocketlife.app.ui.everyday.phoneadress;

import com.example.apple.pocketlife.app.http.NetCallBack;
import com.example.apple.pocketlife.app.ui.everyday.bean.PhoneBean;
import com.example.apple.pocketlife.lib.base.IBaseModel;
import com.example.apple.pocketlife.lib.base.IBasePresenter;
import com.example.apple.pocketlife.lib.base.IBaseView;

import java.util.Map;

import rx.Observable;

/**
 * Created by apple on 17/3/25.
 */

public class PhoneContract {
    public static interface PhoneModel extends IBaseModel {
        Observable<PhoneBean> loadNetworkData(String url);
    }

    public static interface PhonePresenter extends IBasePresenter {
        void loadNetworkData(String url);
    }

    public static interface PhoneView extends IBaseView {
        void showErrorInfo(Exception ex);

        void loadNetworkData(PhoneBean phoneBean);
    }
}
