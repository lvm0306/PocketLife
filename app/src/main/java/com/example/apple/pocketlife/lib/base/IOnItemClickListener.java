package com.example.apple.pocketlife.lib.base;

import android.view.View;

/**
 * Created by apple on 17/4/13.
 */

public interface IOnItemClickListener {
    void onItemClick(View view, int position, String url, String title);

    void onLongClick(View view, int posotion, String url);
}
