package com.example.apple.pocketlife.app.ui.everyday.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by apple on 17/4/2.
 */

public class BasketTsBean {

    /**
     * reason : 查询成功
     * result : {"title":"NBA2015-2016赛季_休斯敦火箭_赛程赛果_球队阵容","list":[{"time":"04/03 09:00","m_time":"04-03 周一 09:00","player1":"火箭","player2":"太阳","player1logo":"http://mat1.gtimg.com/sports/nba/logo/78/new/10.png","player2logo":"http://mat1.gtimg.com/sports/nba/logo/78/21.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=10","m_player1url":"http://sports.qq.com/kbsweb/kbsshare/team.htm?cid=100000","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=21","m_player2url":"http://sports.qq.com/kbsweb/kbsshare/team.htm?cid=100000","score":"VS","link1text":"视频直播","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1469730","m_link1url":"http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1469730","link2text":"技术统计","link2url":"","m_link2url":"","status":"0"},{"time":"04/06 08:00","m_time":"04-06 周四 08:00","player1":"掘金","player2":"火箭","player1logo":"http://mat1.gtimg.com/sports/nba/logo/78/7.png","player2logo":"http://mat1.gtimg.com/sports/nba/logo/78/new/10.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=7","m_player1url":"http://sports.qq.com/kbsweb/kbsshare/team.htm?cid=100000","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=10","m_player2url":"http://sports.qq.com/kbsweb/kbsshare/team.htm?cid=100000","score":"VS","link1text":"视频直播","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1469745","m_link1url":"http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1469745","link2text":"技术统计","link2url":"","m_link2url":"","status":"0"},{"time":"04/08 08:00","m_time":"04-08 周六 08:00","player1":"活塞","player2":"火箭","player1logo":"http://mat1.gtimg.com/sports/nba/logo/78/8.png","player2logo":"http://mat1.gtimg.com/sports/nba/logo/78/new/10.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=8","m_player1url":"http://sports.qq.com/kbsweb/kbsshare/team.htm?cid=100000","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=10","m_player2url":"http://sports.qq.com/kbsweb/kbsshare/team.htm?cid=100000","score":"VS","link1text":"视频直播","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1469759","m_link1url":"http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1469759","link2text":"技术统计","link2url":"","m_link2url":"","status":"0"},{"time":"04/10 06:00","m_time":"04-10 周一 06:00","player1":"火箭","player2":"国王","player1logo":"http://mat1.gtimg.com/sports/nba/logo/78/new/10.png","player2logo":"http://mat1.gtimg.com/sports/nba/logo/78/23.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=10","m_player1url":"http://sports.qq.com/kbsweb/kbsshare/team.htm?cid=100000","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=23","m_player2url":"http://sports.qq.com/kbsweb/kbsshare/team.htm?cid=100000","score":"VS","link1text":"视频直播","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1469346","m_link1url":"http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1469346","link2text":"技术统计","link2url":"","m_link2url":"","status":"0"},{"time":"04/11 10:30","m_time":"04-11 周二 10:30","player1":"火箭","player2":"快船","player1logo":"http://mat1.gtimg.com/sports/nba/logo/78/new/10.png","player2logo":"http://mat1.gtimg.com/sports/nba/logo/78/new/12.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=10","m_player1url":"http://sports.qq.com/kbsweb/kbsshare/team.htm?cid=100000","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=12","m_player2url":"http://sports.qq.com/kbsweb/kbsshare/team.htm?cid=100000","score":"VS","link1text":"视频直播","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1469356","m_link1url":"http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1469356","link2text":"技术统计","link2url":"","m_link2url":"","status":"0"},{"time":"04/13 08:00","m_time":"04-13 周四 08:00","player1":"森林狼","player2":"火箭","player1logo":"http://mat1.gtimg.com/sports/nba/logo/78/16.png","player2logo":"http://mat1.gtimg.com/sports/nba/logo/78/new/10.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=16","m_player1url":"http://sports.qq.com/kbsweb/kbsshare/team.htm?cid=100000","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=10","m_player2url":"http://sports.qq.com/kbsweb/kbsshare/team.htm?cid=100000","score":"VS","link1text":"视频直播","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1469370","m_link1url":"http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1469370","link2text":"技术统计","link2url":"","m_link2url":"","status":"0"}],"more1":{"link":"http://sports.qq.com/kbsweb/?ptag=360.onebox.team.nba#nba","text":""},"more2":{"link":"http://live.3g.qq.com/g/s?aid=nba","text":""}}
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
        /**
         * title : NBA2015-2016赛季_休斯敦火箭_赛程赛果_球队阵容
         * list : [{"time":"04/03 09:00","m_time":"04-03 周一 09:00","player1":"火箭","player2":"太阳","player1logo":"http://mat1.gtimg.com/sports/nba/logo/78/new/10.png","player2logo":"http://mat1.gtimg.com/sports/nba/logo/78/21.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=10","m_player1url":"http://sports.qq.com/kbsweb/kbsshare/team.htm?cid=100000","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=21","m_player2url":"http://sports.qq.com/kbsweb/kbsshare/team.htm?cid=100000","score":"VS","link1text":"视频直播","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1469730","m_link1url":"http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1469730","link2text":"技术统计","link2url":"","m_link2url":"","status":"0"},{"time":"04/06 08:00","m_time":"04-06 周四 08:00","player1":"掘金","player2":"火箭","player1logo":"http://mat1.gtimg.com/sports/nba/logo/78/7.png","player2logo":"http://mat1.gtimg.com/sports/nba/logo/78/new/10.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=7","m_player1url":"http://sports.qq.com/kbsweb/kbsshare/team.htm?cid=100000","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=10","m_player2url":"http://sports.qq.com/kbsweb/kbsshare/team.htm?cid=100000","score":"VS","link1text":"视频直播","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1469745","m_link1url":"http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1469745","link2text":"技术统计","link2url":"","m_link2url":"","status":"0"},{"time":"04/08 08:00","m_time":"04-08 周六 08:00","player1":"活塞","player2":"火箭","player1logo":"http://mat1.gtimg.com/sports/nba/logo/78/8.png","player2logo":"http://mat1.gtimg.com/sports/nba/logo/78/new/10.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=8","m_player1url":"http://sports.qq.com/kbsweb/kbsshare/team.htm?cid=100000","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=10","m_player2url":"http://sports.qq.com/kbsweb/kbsshare/team.htm?cid=100000","score":"VS","link1text":"视频直播","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1469759","m_link1url":"http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1469759","link2text":"技术统计","link2url":"","m_link2url":"","status":"0"},{"time":"04/10 06:00","m_time":"04-10 周一 06:00","player1":"火箭","player2":"国王","player1logo":"http://mat1.gtimg.com/sports/nba/logo/78/new/10.png","player2logo":"http://mat1.gtimg.com/sports/nba/logo/78/23.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=10","m_player1url":"http://sports.qq.com/kbsweb/kbsshare/team.htm?cid=100000","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=23","m_player2url":"http://sports.qq.com/kbsweb/kbsshare/team.htm?cid=100000","score":"VS","link1text":"视频直播","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1469346","m_link1url":"http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1469346","link2text":"技术统计","link2url":"","m_link2url":"","status":"0"},{"time":"04/11 10:30","m_time":"04-11 周二 10:30","player1":"火箭","player2":"快船","player1logo":"http://mat1.gtimg.com/sports/nba/logo/78/new/10.png","player2logo":"http://mat1.gtimg.com/sports/nba/logo/78/new/12.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=10","m_player1url":"http://sports.qq.com/kbsweb/kbsshare/team.htm?cid=100000","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=12","m_player2url":"http://sports.qq.com/kbsweb/kbsshare/team.htm?cid=100000","score":"VS","link1text":"视频直播","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1469356","m_link1url":"http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1469356","link2text":"技术统计","link2url":"","m_link2url":"","status":"0"},{"time":"04/13 08:00","m_time":"04-13 周四 08:00","player1":"森林狼","player2":"火箭","player1logo":"http://mat1.gtimg.com/sports/nba/logo/78/16.png","player2logo":"http://mat1.gtimg.com/sports/nba/logo/78/new/10.png","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=16","m_player1url":"http://sports.qq.com/kbsweb/kbsshare/team.htm?cid=100000","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=10","m_player2url":"http://sports.qq.com/kbsweb/kbsshare/team.htm?cid=100000","score":"VS","link1text":"视频直播","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1469370","m_link1url":"http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1469370","link2text":"技术统计","link2url":"","m_link2url":"","status":"0"}]
         * more1 : {"link":"http://sports.qq.com/kbsweb/?ptag=360.onebox.team.nba#nba","text":""}
         * more2 : {"link":"http://live.3g.qq.com/g/s?aid=nba","text":""}
         */

        @SerializedName("title")
        private String title;
        @SerializedName("more1")
        private More1Bean more1;
        @SerializedName("more2")
        private More2Bean more2;
        @SerializedName("list")
        private List<ListBean> list;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public More1Bean getMore1() {
            return more1;
        }

        public void setMore1(More1Bean more1) {
            this.more1 = more1;
        }

        public More2Bean getMore2() {
            return more2;
        }

        public void setMore2(More2Bean more2) {
            this.more2 = more2;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class More1Bean {
            /**
             * link : http://sports.qq.com/kbsweb/?ptag=360.onebox.team.nba#nba
             * text :
             */

            @SerializedName("link")
            private String link;
            @SerializedName("text")
            private String text;

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }
        }

        public static class More2Bean {
            /**
             * link : http://live.3g.qq.com/g/s?aid=nba
             * text :
             */

            @SerializedName("link")
            private String link;
            @SerializedName("text")
            private String text;

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }
        }

        public static class ListBean {
            /**
             * time : 04/03 09:00
             * m_time : 04-03 周一 09:00
             * player1 : 火箭
             * player2 : 太阳
             * player1logo : http://mat1.gtimg.com/sports/nba/logo/78/new/10.png
             * player2logo : http://mat1.gtimg.com/sports/nba/logo/78/21.png
             * player1url : http://kbs.sports.qq.com/kbsweb/teams.htm?tid=10
             * m_player1url : http://sports.qq.com/kbsweb/kbsshare/team.htm?cid=100000
             * player2url : http://kbs.sports.qq.com/kbsweb/teams.htm?tid=21
             * m_player2url : http://sports.qq.com/kbsweb/kbsshare/team.htm?cid=100000
             * score : VS
             * link1text : 视频直播
             * link1url : http://sports.qq.com/kbsweb/game.htm?mid=100000:1469730
             * m_link1url : http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1469730
             * link2text : 技术统计
             * link2url :
             * m_link2url :
             * status : 0
             */

            @SerializedName("time")
            private String time;
            @SerializedName("m_time")
            private String mTime;
            @SerializedName("player1")
            private String player1;
            @SerializedName("player2")
            private String player2;
            @SerializedName("player1logo")
            private String player1logo;
            @SerializedName("player2logo")
            private String player2logo;
            @SerializedName("player1url")
            private String player1url;
            @SerializedName("m_player1url")
            private String mPlayer1url;
            @SerializedName("player2url")
            private String player2url;
            @SerializedName("m_player2url")
            private String mPlayer2url;
            @SerializedName("score")
            private String score;
            @SerializedName("link1text")
            private String link1text;
            @SerializedName("link1url")
            private String link1url;
            @SerializedName("m_link1url")
            private String mLink1url;
            @SerializedName("link2text")
            private String link2text;
            @SerializedName("link2url")
            private String link2url;
            @SerializedName("m_link2url")
            private String mLink2url;
            @SerializedName("status")
            private String status;

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public String getMTime() {
                return mTime;
            }

            public void setMTime(String mTime) {
                this.mTime = mTime;
            }

            public String getPlayer1() {
                return player1;
            }

            public void setPlayer1(String player1) {
                this.player1 = player1;
            }

            public String getPlayer2() {
                return player2;
            }

            public void setPlayer2(String player2) {
                this.player2 = player2;
            }

            public String getPlayer1logo() {
                return player1logo;
            }

            public void setPlayer1logo(String player1logo) {
                this.player1logo = player1logo;
            }

            public String getPlayer2logo() {
                return player2logo;
            }

            public void setPlayer2logo(String player2logo) {
                this.player2logo = player2logo;
            }

            public String getPlayer1url() {
                return player1url;
            }

            public void setPlayer1url(String player1url) {
                this.player1url = player1url;
            }

            public String getMPlayer1url() {
                return mPlayer1url;
            }

            public void setMPlayer1url(String mPlayer1url) {
                this.mPlayer1url = mPlayer1url;
            }

            public String getPlayer2url() {
                return player2url;
            }

            public void setPlayer2url(String player2url) {
                this.player2url = player2url;
            }

            public String getMPlayer2url() {
                return mPlayer2url;
            }

            public void setMPlayer2url(String mPlayer2url) {
                this.mPlayer2url = mPlayer2url;
            }

            public String getScore() {
                return score;
            }

            public void setScore(String score) {
                this.score = score;
            }

            public String getLink1text() {
                return link1text;
            }

            public void setLink1text(String link1text) {
                this.link1text = link1text;
            }

            public String getLink1url() {
                return link1url;
            }

            public void setLink1url(String link1url) {
                this.link1url = link1url;
            }

            public String getMLink1url() {
                return mLink1url;
            }

            public void setMLink1url(String mLink1url) {
                this.mLink1url = mLink1url;
            }

            public String getLink2text() {
                return link2text;
            }

            public void setLink2text(String link2text) {
                this.link2text = link2text;
            }

            public String getLink2url() {
                return link2url;
            }

            public void setLink2url(String link2url) {
                this.link2url = link2url;
            }

            public String getMLink2url() {
                return mLink2url;
            }

            public void setMLink2url(String mLink2url) {
                this.mLink2url = mLink2url;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }
        }
    }
}
