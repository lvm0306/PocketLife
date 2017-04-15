package com.example.apple.pocketlife.app.ui.everyday.bean;

import com.google.gson.annotations.SerializedName;

/**
 * Created by apple on 17/4/8.
 */

public class WanYearBean {
    @Override
    public String toString() {
        return "WanYearBean{" +
                "reason='" + reason + '\'' +
                ", result=" + result +
                ", errorCode=" + errorCode +
                '}';
    }

    /**
     * reason : Success
     * result : {"data":{"avoid":"造桥.安门.理发.造庙.栽种.作灶.","animalsYear":"龙","weekday":"星期三","suit":"祭祀.祈福.求嗣.斋醮.开光.入学.订盟.冠笄.伐木.修造.动土.起基.放水.交易.开池.","lunarYear":"壬辰年","lunar":"十月廿九","year-month":"2012-12","date":"2012-12-12"}}
     * error_code : 0
     */

    @SerializedName("reason")
    private String reason;
    @SerializedName("result")
    private ResultBean result;
    @SerializedName("error_code")
    private int errorCode;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public static class ResultBean {
        @Override
        public String toString() {
            return "ResultBean{" +
                    "data=" + data +
                    '}';
        }

        /**
         * data : {"avoid":"造桥.安门.理发.造庙.栽种.作灶.","animalsYear":"龙","weekday":"星期三","suit":"祭祀.祈福.求嗣.斋醮.开光.入学.订盟.冠笄.伐木.修造.动土.起基.放水.交易.开池.","lunarYear":"壬辰年","lunar":"十月廿九","year-month":"2012-12","date":"2012-12-12"}
         */

        @SerializedName("data")
        private DataBean data;

        public DataBean getData() {
            return data;
        }

        public void setData(DataBean data) {
            this.data = data;
        }

        public static class DataBean {
            @Override
            public String toString() {
                return "DataBean{" +
                        "avoid='" + avoid + '\'' +
                        ", animalsYear='" + animalsYear + '\'' +
                        ", weekday='" + weekday + '\'' +
                        ", suit='" + suit + '\'' +
                        ", lunarYear='" + lunarYear + '\'' +
                        ", lunar='" + lunar + '\'' +
                        ", yearmonth='" + yearmonth + '\'' +
                        ", date='" + date + '\'' +
                        '}';
            }

            /**
             * avoid : 造桥.安门.理发.造庙.栽种.作灶.
             * animalsYear : 龙
             * weekday : 星期三
             * suit : 祭祀.祈福.求嗣.斋醮.开光.入学.订盟.冠笄.伐木.修造.动土.起基.放水.交易.开池.
             * lunarYear : 壬辰年
             * lunar : 十月廿九
             * year-month : 2012-12
             * date : 2012-12-12
             */

            @SerializedName("avoid")
            private String avoid;
            @SerializedName("animalsYear")
            private String animalsYear;
            @SerializedName("weekday")
            private String weekday;
            @SerializedName("suit")
            private String suit;
            @SerializedName("lunarYear")
            private String lunarYear;
            @SerializedName("lunar")
            private String lunar;
            @SerializedName("year-month")
            private String yearmonth;
            @SerializedName("date")
            private String date;

            public String getAvoid() {
                return avoid;
            }

            public void setAvoid(String avoid) {
                this.avoid = avoid;
            }

            public String getAnimalsYear() {
                return animalsYear;
            }

            public void setAnimalsYear(String animalsYear) {
                this.animalsYear = animalsYear;
            }

            public String getWeekday() {
                return weekday;
            }

            public void setWeekday(String weekday) {
                this.weekday = weekday;
            }

            public String getSuit() {
                return suit;
            }

            public void setSuit(String suit) {
                this.suit = suit;
            }

            public String getLunarYear() {
                return lunarYear;
            }

            public void setLunarYear(String lunarYear) {
                this.lunarYear = lunarYear;
            }

            public String getLunar() {
                return lunar;
            }

            public void setLunar(String lunar) {
                this.lunar = lunar;
            }

            public String getYearmonth() {
                return yearmonth;
            }

            public void setYearmonth(String yearmonth) {
                this.yearmonth = yearmonth;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }
        }
    }
}
