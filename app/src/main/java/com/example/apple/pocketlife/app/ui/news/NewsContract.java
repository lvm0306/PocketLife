package com.example.apple.pocketlife.app.ui.news;

import com.example.apple.pocketlife.app.http.NetCallBack;
import com.example.apple.pocketlife.lib.base.IBaseModel;
import com.example.apple.pocketlife.lib.base.IBasePresenter;
import com.example.apple.pocketlife.lib.base.IBaseView;

/**
 * Created by apple on 17/3/18.
 */

public class NewsContract {
    public static interface RegisterModel extends IBaseModel {
        public void register(String user,String pasd,NetCallBack<String> callback);
        public void loadList();
    }

    public static interface RegisterPresenter extends IBasePresenter {
        public void register(String user,String pasd);
        public void loadList();
    }

    public static interface RegisterView extends IBaseView {
        public void registerOk(String msg);
        public void registerFail(String msg);
        public void loadListOK(String data);
        public void loadListFail(String msg);
    }
}
