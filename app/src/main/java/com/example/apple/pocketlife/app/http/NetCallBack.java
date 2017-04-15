package com.example.apple.pocketlife.app.http;

/**
 * Created by apple on 17/3/14.
 * 网络回调，没用
 */

public interface NetCallBack <T>{
    public void onSuccess(T data);
    public void onFail(String error);

}
