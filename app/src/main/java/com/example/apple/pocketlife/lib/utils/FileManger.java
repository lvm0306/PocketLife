package com.example.apple.pocketlife.lib.utils;

import android.os.Environment;

import com.example.apple.pocketlife.lib.base.App;

import java.io.File;

/**
 * Created by apple on 17/3/14.
 */

public class FileManger {

    public  static File getRootCacheFile(){
        if(Environment.getExternalStorageState()
                .equals(Environment.MEDIA_MOUNTED)){
            return App.app.getExternalCacheDir();
        }else {
            return App.app.getCacheDir();
        }
    }


    public static File getImageCacheFile(){
        return new File(getRootCacheFile(),"image");
    }


    public static File getHttpCache(){
        return new File(getRootCacheFile(),"http");
    }
}
