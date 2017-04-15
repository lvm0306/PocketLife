package com.example.apple.pocketlife.lib.base;


import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;

/**
 * Created by apple on 17/3/14.
 * 加上统计代码
 */
public class BaseFragment extends Fragment {

    public Activity activity;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        activity=(Activity) context;
    }

    public Activity getMyActivity() {
        return activity;
    }


}
