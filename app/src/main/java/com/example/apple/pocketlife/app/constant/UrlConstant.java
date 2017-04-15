package com.example.apple.pocketlife.app.constant;

/**
 * 地址工具类
 * Created by apple on 17/3/14.
 */

public class UrlConstant {
    /**
     * url 地址的 工具类
     * 模板
     * public static final String BASE_URL = "https://api.douban.com/v2/movie/";
     * <p>
     * public static class Path {
     * //正在热映
     * public static final String ULR_INTHEATERS = "in_theaters";
     * }
     * public static class Param {
     * public static final String WORD = "word";
     * public static final String DTYPE = "dtype";
     * public static final String KEY = "key";
     * }
     * <p>
     * public static class DefaultValue {
     * public static final String WORD = "成语字典";
     * public static final String DTYPE = "json";
     * public static final String KEY = "fbae115adc9fa0e76e121fc4eb1537d4";
     * }
     */
    public static final String BASE_URL = "https://api.douban.com/v2/movie/";
    public static final String NEWS_BASE_URL = "http://v.juhe.cn/";

    public static class Path {
        //news
        public static final String NEWS_INDEX = "toutiao/index";
        public static final String PHONE_INDEX = "mobile/get";
    }

    public static class Param {
        public static final String type = "type";
        public static final String key = "key";
        public static final String phone = "phone";
        public static final String dtype = "dtype";
    }

    public static class DefaultValue {
        public static final String type = "top";
        public static final String key = "6ea443ef1b0cb86bbaffb97e2674cac4";
    }
}
