package com.example.apple.pocketlife.app.ui.weather.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by apple on 17/4/4.
 */

public class WeatherBean {


    @SerializedName("HeWeather5")
    private List<HeWeather5Bean> HeWeather5;

    public List<HeWeather5Bean> getHeWeather5() {
        return HeWeather5;
    }

    public void setHeWeather5(List<HeWeather5Bean> HeWeather5) {
        this.HeWeather5 = HeWeather5;
    }

    public static class HeWeather5Bean {
        /**
         * basic : {"city":"沙河口","cnty":"中国","id":"CN101070210","lat":"38.912859","lon":"121.593702","update":{"loc":"2017-04-04 14:52","utc":"2017-04-04 06:52"}}
         * daily_forecast : [{"astro":{"mr":"11:22","ms":"01:04","sr":"05:33","ss":"18:19"},"cond":{"code_d":"101","code_n":"101","txt_d":"多云","txt_n":"多云"},"date":"2017-04-04","hum":"47","pcpn":"0.0","pop":"2","pres":"1019","tmp":{"max":"18","min":"8"},"uv":"5","vis":"20","wind":{"deg":"175","dir":"南风","sc":"3-4","spd":"10"}},{"astro":{"mr":"12:23","ms":"01:56","sr":"05:31","ss":"18:20"},"cond":{"code_d":"104","code_n":"104","txt_d":"阴","txt_n":"阴"},"date":"2017-04-05","hum":"64","pcpn":"4.0","pop":"87","pres":"1019","tmp":{"max":"12","min":"7"},"uv":"5","vis":"12","wind":{"deg":"110","dir":"东南风","sc":"3-4","spd":"13"}},{"astro":{"mr":"13:26","ms":"02:41","sr":"05:30","ss":"18:21"},"cond":{"code_d":"101","code_n":"100","txt_d":"多云","txt_n":"晴"},"date":"2017-04-06","hum":"70","pcpn":"0.7","pop":"27","pres":"1017","tmp":{"max":"13","min":"8"},"uv":"6","vis":"15","wind":{"deg":"248","dir":"东风","sc":"微风","spd":"7"}}]
         * hourly_forecast : [{"cond":{"code":"100","txt":"晴"},"date":"2017-04-04 16:00","hum":"34","pop":"0","pres":"1018","tmp":"16","wind":{"deg":"168","dir":"东南风","sc":"3-4","spd":"19"}},{"cond":{"code":"100","txt":"晴"},"date":"2017-04-04 19:00","hum":"51","pop":"0","pres":"1019","tmp":"11","wind":{"deg":"175","dir":"南风","sc":"3-4","spd":"20"}},{"cond":{"code":"100","txt":"晴"},"date":"2017-04-04 22:00","hum":"63","pop":"0","pres":"1019","tmp":"9","wind":{"deg":"173","dir":"南风","sc":"3-4","spd":"17"}}]
         * now : {"cond":{"code":"101","txt":"多云"},"fl":"11","hum":"56","pcpn":"0","pres":"1018","tmp":"13","vis":"4","wind":{"deg":"110","dir":"东南风","sc":"3-4","spd":"10"}}
         * status : ok
         * suggestion : {"comf":{"brf":"较舒适","txt":"白天天气阴沉，风力较强，这种天气条件下，会感到有点儿凉，但大部分人完全可以接受。"},"cw":{"brf":"较不宜","txt":"较不宜洗车，未来一天无雨，风力较大，如果执意擦洗汽车，要做好蒙上污垢的心理准备。"},"drsg":{"brf":"较冷","txt":"建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。"},"flu":{"brf":"易发","txt":"昼夜温差大，风力较强，易发生感冒，请注意适当增减衣服，加强自我防护避免感冒。"},"sport":{"brf":"较不宜","txt":"天气较好，但风力很大，推荐您进行室内运动，若在户外运动请注意避风和保暖。"},"trav":{"brf":"一般","txt":"天空状况还是比较好的，温度适宜，但风比较大，会对您的出行产生一定的影响。外出请带上防风衣物。"},"uv":{"brf":"弱","txt":"紫外线强度较弱，建议出门前涂擦SPF在12-15之间、PA+的防晒护肤品。"}}
         */

        @SerializedName("basic")
        private BasicBean basic;
        @SerializedName("now")
        private NowBean now;
        @SerializedName("status")
        private String status;
        @SerializedName("suggestion")
        private SuggestionBean suggestion;
        @SerializedName("daily_forecast")
        private List<DailyForecastBean> dailyForecast;
        @SerializedName("hourly_forecast")
        private List<HourlyForecastBean> hourlyForecast;

        public BasicBean getBasic() {
            return basic;
        }

        public void setBasic(BasicBean basic) {
            this.basic = basic;
        }

        public NowBean getNow() {
            return now;
        }

        public void setNow(NowBean now) {
            this.now = now;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public SuggestionBean getSuggestion() {
            return suggestion;
        }

        public void setSuggestion(SuggestionBean suggestion) {
            this.suggestion = suggestion;
        }

        public List<DailyForecastBean> getDailyForecast() {
            return dailyForecast;
        }

        public void setDailyForecast(List<DailyForecastBean> dailyForecast) {
            this.dailyForecast = dailyForecast;
        }

        public List<HourlyForecastBean> getHourlyForecast() {
            return hourlyForecast;
        }

        public void setHourlyForecast(List<HourlyForecastBean> hourlyForecast) {
            this.hourlyForecast = hourlyForecast;
        }

        public static class BasicBean {
            /**
             * city : 沙河口
             * cnty : 中国
             * id : CN101070210
             * lat : 38.912859
             * lon : 121.593702
             * update : {"loc":"2017-04-04 14:52","utc":"2017-04-04 06:52"}
             */

            @SerializedName("city")
            private String city;
            @SerializedName("cnty")
            private String cnty;
            @SerializedName("id")
            private String id;
            @SerializedName("lat")
            private String lat;
            @SerializedName("lon")
            private String lon;
            @SerializedName("update")
            private UpdateBean update;

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getCnty() {
                return cnty;
            }

            public void setCnty(String cnty) {
                this.cnty = cnty;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getLat() {
                return lat;
            }

            public void setLat(String lat) {
                this.lat = lat;
            }

            public String getLon() {
                return lon;
            }

            public void setLon(String lon) {
                this.lon = lon;
            }

            public UpdateBean getUpdate() {
                return update;
            }

            public void setUpdate(UpdateBean update) {
                this.update = update;
            }

            public static class UpdateBean {
                /**
                 * loc : 2017-04-04 14:52
                 * utc : 2017-04-04 06:52
                 */

                @SerializedName("loc")
                private String loc;
                @SerializedName("utc")
                private String utc;

                public String getLoc() {
                    return loc;
                }

                public void setLoc(String loc) {
                    this.loc = loc;
                }

                public String getUtc() {
                    return utc;
                }

                public void setUtc(String utc) {
                    this.utc = utc;
                }
            }
        }

        public static class NowBean {
            /**
             * cond : {"code":"101","txt":"多云"}
             * fl : 11
             * hum : 56
             * pcpn : 0
             * pres : 1018
             * tmp : 13
             * vis : 4
             * wind : {"deg":"110","dir":"东南风","sc":"3-4","spd":"10"}
             */

            @SerializedName("cond")
            private CondBean cond;
            @SerializedName("fl")
            private String fl;
            @SerializedName("hum")
            private String hum;
            @SerializedName("pcpn")
            private String pcpn;
            @SerializedName("pres")
            private String pres;
            @SerializedName("tmp")
            private String tmp;
            @SerializedName("vis")
            private String vis;
            @SerializedName("wind")
            private WindBean wind;

            public CondBean getCond() {
                return cond;
            }

            public void setCond(CondBean cond) {
                this.cond = cond;
            }

            public String getFl() {
                return fl;
            }

            public void setFl(String fl) {
                this.fl = fl;
            }

            public String getHum() {
                return hum;
            }

            public void setHum(String hum) {
                this.hum = hum;
            }

            public String getPcpn() {
                return pcpn;
            }

            public void setPcpn(String pcpn) {
                this.pcpn = pcpn;
            }

            public String getPres() {
                return pres;
            }

            public void setPres(String pres) {
                this.pres = pres;
            }

            public String getTmp() {
                return tmp;
            }

            public void setTmp(String tmp) {
                this.tmp = tmp;
            }

            public String getVis() {
                return vis;
            }

            public void setVis(String vis) {
                this.vis = vis;
            }

            public WindBean getWind() {
                return wind;
            }

            public void setWind(WindBean wind) {
                this.wind = wind;
            }

            public static class CondBean {
                /**
                 * code : 101
                 * txt : 多云
                 */

                @SerializedName("code")
                private String code;
                @SerializedName("txt")
                private String txt;

                public String getCode() {
                    return code;
                }

                public void setCode(String code) {
                    this.code = code;
                }

                public String getTxt() {
                    return txt;
                }

                public void setTxt(String txt) {
                    this.txt = txt;
                }
            }

            public static class WindBean {
                /**
                 * deg : 110
                 * dir : 东南风
                 * sc : 3-4
                 * spd : 10
                 */

                @SerializedName("deg")
                private String deg;
                @SerializedName("dir")
                private String dir;
                @SerializedName("sc")
                private String sc;
                @SerializedName("spd")
                private String spd;

                public String getDeg() {
                    return deg;
                }

                public void setDeg(String deg) {
                    this.deg = deg;
                }

                public String getDir() {
                    return dir;
                }

                public void setDir(String dir) {
                    this.dir = dir;
                }

                public String getSc() {
                    return sc;
                }

                public void setSc(String sc) {
                    this.sc = sc;
                }

                public String getSpd() {
                    return spd;
                }

                public void setSpd(String spd) {
                    this.spd = spd;
                }
            }
        }

        public static class SuggestionBean {
            /**
             * comf : {"brf":"较舒适","txt":"白天天气阴沉，风力较强，这种天气条件下，会感到有点儿凉，但大部分人完全可以接受。"}
             * cw : {"brf":"较不宜","txt":"较不宜洗车，未来一天无雨，风力较大，如果执意擦洗汽车，要做好蒙上污垢的心理准备。"}
             * drsg : {"brf":"较冷","txt":"建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。"}
             * flu : {"brf":"易发","txt":"昼夜温差大，风力较强，易发生感冒，请注意适当增减衣服，加强自我防护避免感冒。"}
             * sport : {"brf":"较不宜","txt":"天气较好，但风力很大，推荐您进行室内运动，若在户外运动请注意避风和保暖。"}
             * trav : {"brf":"一般","txt":"天空状况还是比较好的，温度适宜，但风比较大，会对您的出行产生一定的影响。外出请带上防风衣物。"}
             * uv : {"brf":"弱","txt":"紫外线强度较弱，建议出门前涂擦SPF在12-15之间、PA+的防晒护肤品。"}
             */

            @SerializedName("comf")
            private ComfBean comf;
            @SerializedName("cw")
            private CwBean cw;
            @SerializedName("drsg")
            private DrsgBean drsg;
            @SerializedName("flu")
            private FluBean flu;
            @SerializedName("sport")
            private SportBean sport;
            @SerializedName("trav")
            private TravBean trav;
            @SerializedName("uv")
            private UvBean uv;

            public ComfBean getComf() {
                return comf;
            }

            public void setComf(ComfBean comf) {
                this.comf = comf;
            }

            public CwBean getCw() {
                return cw;
            }

            public void setCw(CwBean cw) {
                this.cw = cw;
            }

            public DrsgBean getDrsg() {
                return drsg;
            }

            public void setDrsg(DrsgBean drsg) {
                this.drsg = drsg;
            }

            public FluBean getFlu() {
                return flu;
            }

            public void setFlu(FluBean flu) {
                this.flu = flu;
            }

            public SportBean getSport() {
                return sport;
            }

            public void setSport(SportBean sport) {
                this.sport = sport;
            }

            public TravBean getTrav() {
                return trav;
            }

            public void setTrav(TravBean trav) {
                this.trav = trav;
            }

            public UvBean getUv() {
                return uv;
            }

            public void setUv(UvBean uv) {
                this.uv = uv;
            }

            public static class ComfBean {
                /**
                 * brf : 较舒适
                 * txt : 白天天气阴沉，风力较强，这种天气条件下，会感到有点儿凉，但大部分人完全可以接受。
                 */

                @SerializedName("brf")
                private String brf;
                @SerializedName("txt")
                private String txt;

                public String getBrf() {
                    return brf;
                }

                public void setBrf(String brf) {
                    this.brf = brf;
                }

                public String getTxt() {
                    return txt;
                }

                public void setTxt(String txt) {
                    this.txt = txt;
                }
            }

            public static class CwBean {
                /**
                 * brf : 较不宜
                 * txt : 较不宜洗车，未来一天无雨，风力较大，如果执意擦洗汽车，要做好蒙上污垢的心理准备。
                 */

                @SerializedName("brf")
                private String brf;
                @SerializedName("txt")
                private String txt;

                public String getBrf() {
                    return brf;
                }

                public void setBrf(String brf) {
                    this.brf = brf;
                }

                public String getTxt() {
                    return txt;
                }

                public void setTxt(String txt) {
                    this.txt = txt;
                }
            }

            public static class DrsgBean {
                /**
                 * brf : 较冷
                 * txt : 建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。
                 */

                @SerializedName("brf")
                private String brf;
                @SerializedName("txt")
                private String txt;

                public String getBrf() {
                    return brf;
                }

                public void setBrf(String brf) {
                    this.brf = brf;
                }

                public String getTxt() {
                    return txt;
                }

                public void setTxt(String txt) {
                    this.txt = txt;
                }
            }

            public static class FluBean {
                /**
                 * brf : 易发
                 * txt : 昼夜温差大，风力较强，易发生感冒，请注意适当增减衣服，加强自我防护避免感冒。
                 */

                @SerializedName("brf")
                private String brf;
                @SerializedName("txt")
                private String txt;

                public String getBrf() {
                    return brf;
                }

                public void setBrf(String brf) {
                    this.brf = brf;
                }

                public String getTxt() {
                    return txt;
                }

                public void setTxt(String txt) {
                    this.txt = txt;
                }
            }

            public static class SportBean {
                /**
                 * brf : 较不宜
                 * txt : 天气较好，但风力很大，推荐您进行室内运动，若在户外运动请注意避风和保暖。
                 */

                @SerializedName("brf")
                private String brf;
                @SerializedName("txt")
                private String txt;

                public String getBrf() {
                    return brf;
                }

                public void setBrf(String brf) {
                    this.brf = brf;
                }

                public String getTxt() {
                    return txt;
                }

                public void setTxt(String txt) {
                    this.txt = txt;
                }
            }

            public static class TravBean {
                /**
                 * brf : 一般
                 * txt : 天空状况还是比较好的，温度适宜，但风比较大，会对您的出行产生一定的影响。外出请带上防风衣物。
                 */

                @SerializedName("brf")
                private String brf;
                @SerializedName("txt")
                private String txt;

                public String getBrf() {
                    return brf;
                }

                public void setBrf(String brf) {
                    this.brf = brf;
                }

                public String getTxt() {
                    return txt;
                }

                public void setTxt(String txt) {
                    this.txt = txt;
                }
            }

            public static class UvBean {
                /**
                 * brf : 弱
                 * txt : 紫外线强度较弱，建议出门前涂擦SPF在12-15之间、PA+的防晒护肤品。
                 */

                @SerializedName("brf")
                private String brf;
                @SerializedName("txt")
                private String txt;

                public String getBrf() {
                    return brf;
                }

                public void setBrf(String brf) {
                    this.brf = brf;
                }

                public String getTxt() {
                    return txt;
                }

                public void setTxt(String txt) {
                    this.txt = txt;
                }
            }
        }

        public static class DailyForecastBean {
            /**
             * astro : {"mr":"11:22","ms":"01:04","sr":"05:33","ss":"18:19"}
             * cond : {"code_d":"101","code_n":"101","txt_d":"多云","txt_n":"多云"}
             * date : 2017-04-04
             * hum : 47
             * pcpn : 0.0
             * pop : 2
             * pres : 1019
             * tmp : {"max":"18","min":"8"}
             * uv : 5
             * vis : 20
             * wind : {"deg":"175","dir":"南风","sc":"3-4","spd":"10"}
             */

            @SerializedName("astro")
            private AstroBean astro;
            @SerializedName("cond")
            private CondBeanX cond;
            @SerializedName("date")
            private String date;
            @SerializedName("hum")
            private String hum;
            @SerializedName("pcpn")
            private String pcpn;
            @SerializedName("pop")
            private String pop;
            @SerializedName("pres")
            private String pres;
            @SerializedName("tmp")
            private TmpBean tmp;
            @SerializedName("uv")
            private String uv;
            @SerializedName("vis")
            private String vis;
            @SerializedName("wind")
            private WindBeanX wind;

            public AstroBean getAstro() {
                return astro;
            }

            public void setAstro(AstroBean astro) {
                this.astro = astro;
            }

            public CondBeanX getCond() {
                return cond;
            }

            public void setCond(CondBeanX cond) {
                this.cond = cond;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getHum() {
                return hum;
            }

            public void setHum(String hum) {
                this.hum = hum;
            }

            public String getPcpn() {
                return pcpn;
            }

            public void setPcpn(String pcpn) {
                this.pcpn = pcpn;
            }

            public String getPop() {
                return pop;
            }

            public void setPop(String pop) {
                this.pop = pop;
            }

            public String getPres() {
                return pres;
            }

            public void setPres(String pres) {
                this.pres = pres;
            }

            public TmpBean getTmp() {
                return tmp;
            }

            public void setTmp(TmpBean tmp) {
                this.tmp = tmp;
            }

            public String getUv() {
                return uv;
            }

            public void setUv(String uv) {
                this.uv = uv;
            }

            public String getVis() {
                return vis;
            }

            public void setVis(String vis) {
                this.vis = vis;
            }

            public WindBeanX getWind() {
                return wind;
            }

            public void setWind(WindBeanX wind) {
                this.wind = wind;
            }

            public static class AstroBean {
                /**
                 * mr : 11:22
                 * ms : 01:04
                 * sr : 05:33
                 * ss : 18:19
                 */

                @SerializedName("mr")
                private String mr;
                @SerializedName("ms")
                private String ms;
                @SerializedName("sr")
                private String sr;
                @SerializedName("ss")
                private String ss;

                public String getMr() {
                    return mr;
                }

                public void setMr(String mr) {
                    this.mr = mr;
                }

                public String getMs() {
                    return ms;
                }

                public void setMs(String ms) {
                    this.ms = ms;
                }

                public String getSr() {
                    return sr;
                }

                public void setSr(String sr) {
                    this.sr = sr;
                }

                public String getSs() {
                    return ss;
                }

                public void setSs(String ss) {
                    this.ss = ss;
                }
            }

            public static class CondBeanX {
                /**
                 * code_d : 101
                 * code_n : 101
                 * txt_d : 多云
                 * txt_n : 多云
                 */

                @SerializedName("code_d")
                private String codeD;
                @SerializedName("code_n")
                private String codeN;
                @SerializedName("txt_d")
                private String txtD;
                @SerializedName("txt_n")
                private String txtN;

                public String getCodeD() {
                    return codeD;
                }

                public void setCodeD(String codeD) {
                    this.codeD = codeD;
                }

                public String getCodeN() {
                    return codeN;
                }

                public void setCodeN(String codeN) {
                    this.codeN = codeN;
                }

                public String getTxtD() {
                    return txtD;
                }

                public void setTxtD(String txtD) {
                    this.txtD = txtD;
                }

                public String getTxtN() {
                    return txtN;
                }

                public void setTxtN(String txtN) {
                    this.txtN = txtN;
                }
            }

            public static class TmpBean {
                /**
                 * max : 18
                 * min : 8
                 */

                @SerializedName("max")
                private String max;
                @SerializedName("min")
                private String min;

                public String getMax() {
                    return max;
                }

                public void setMax(String max) {
                    this.max = max;
                }

                public String getMin() {
                    return min;
                }

                public void setMin(String min) {
                    this.min = min;
                }
            }

            public static class WindBeanX {
                /**
                 * deg : 175
                 * dir : 南风
                 * sc : 3-4
                 * spd : 10
                 */

                @SerializedName("deg")
                private String deg;
                @SerializedName("dir")
                private String dir;
                @SerializedName("sc")
                private String sc;
                @SerializedName("spd")
                private String spd;

                public String getDeg() {
                    return deg;
                }

                public void setDeg(String deg) {
                    this.deg = deg;
                }

                public String getDir() {
                    return dir;
                }

                public void setDir(String dir) {
                    this.dir = dir;
                }

                public String getSc() {
                    return sc;
                }

                public void setSc(String sc) {
                    this.sc = sc;
                }

                public String getSpd() {
                    return spd;
                }

                public void setSpd(String spd) {
                    this.spd = spd;
                }
            }
        }

        public static class HourlyForecastBean {
            /**
             * cond : {"code":"100","txt":"晴"}
             * date : 2017-04-04 16:00
             * hum : 34
             * pop : 0
             * pres : 1018
             * tmp : 16
             * wind : {"deg":"168","dir":"东南风","sc":"3-4","spd":"19"}
             */

            @SerializedName("cond")
            private CondBeanXX cond;
            @SerializedName("date")
            private String date;
            @SerializedName("hum")
            private String hum;
            @SerializedName("pop")
            private String pop;
            @SerializedName("pres")
            private String pres;
            @SerializedName("tmp")
            private String tmp;
            @SerializedName("wind")
            private WindBeanXX wind;

            public CondBeanXX getCond() {
                return cond;
            }

            public void setCond(CondBeanXX cond) {
                this.cond = cond;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getHum() {
                return hum;
            }

            public void setHum(String hum) {
                this.hum = hum;
            }

            public String getPop() {
                return pop;
            }

            public void setPop(String pop) {
                this.pop = pop;
            }

            public String getPres() {
                return pres;
            }

            public void setPres(String pres) {
                this.pres = pres;
            }

            public String getTmp() {
                return tmp;
            }

            public void setTmp(String tmp) {
                this.tmp = tmp;
            }

            public WindBeanXX getWind() {
                return wind;
            }

            public void setWind(WindBeanXX wind) {
                this.wind = wind;
            }

            public static class CondBeanXX {
                /**
                 * code : 100
                 * txt : 晴
                 */

                @SerializedName("code")
                private String code;
                @SerializedName("txt")
                private String txt;

                public String getCode() {
                    return code;
                }

                public void setCode(String code) {
                    this.code = code;
                }

                public String getTxt() {
                    return txt;
                }

                public void setTxt(String txt) {
                    this.txt = txt;
                }
            }

            public static class WindBeanXX {
                /**
                 * deg : 168
                 * dir : 东南风
                 * sc : 3-4
                 * spd : 19
                 */

                @SerializedName("deg")
                private String deg;
                @SerializedName("dir")
                private String dir;
                @SerializedName("sc")
                private String sc;
                @SerializedName("spd")
                private String spd;

                public String getDeg() {
                    return deg;
                }

                public void setDeg(String deg) {
                    this.deg = deg;
                }

                public String getDir() {
                    return dir;
                }

                public void setDir(String dir) {
                    this.dir = dir;
                }

                public String getSc() {
                    return sc;
                }

                public void setSc(String sc) {
                    this.sc = sc;
                }

                public String getSpd() {
                    return spd;
                }

                public void setSpd(String spd) {
                    this.spd = spd;
                }
            }
        }
    }
}
