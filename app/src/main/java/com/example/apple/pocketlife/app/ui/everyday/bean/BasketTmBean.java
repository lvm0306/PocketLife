package com.example.apple.pocketlife.app.ui.everyday.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by apple on 17/4/3.
 */

public class BasketTmBean {

    /**
     * reason : 查询成功
     * result : {"title":"NBA2016-2017赛季_火箭VS灰熊赛程赛果","list":[{"time":"10/16 08:00","m_time":"10-16 周日 08:00","player1":"灰熊","player2":"火箭","player1logo":"http://p7.qhmsg.com/t01c6cd06b91021cabb.png?size=78x78","player2logo":"http://p5.qhmsg.com/t01b24bc0916fceab4a.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=29","m_player1url":"http://sports.qq.com/kbsweb/kbsshare/team.htm?cid=100000","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=10","m_player2url":"http://sports.qq.com/kbsweb/kbsshare/team.htm?cid=100000","score":"134-125","link1text":"视频集锦","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1469934","m_link1url":"http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1469934","link2text":"数据统计","link2url":"http://nba.stats.qq.com/nbascore/?mid=1469934","m_link2url":"http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1469934","status":"2"},{"time":"12/24 09:00","m_time":"12-24 周六 09:00","player1":"火箭","player2":"灰熊","player1logo":"http://p5.qhmsg.com/t01b24bc0916fceab4a.png?size=78x78","player2logo":"http://p7.qhmsg.com/t01c6cd06b91021cabb.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=10","m_player1url":"http://sports.qq.com/kbsweb/kbsshare/team.htm?cid=100000","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=29","m_player2url":"http://sports.qq.com/kbsweb/kbsshare/team.htm?cid=100000","score":"109-115","link1text":"视频集锦","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1469625","m_link1url":"http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1469625","link2text":"数据统计","link2url":"http://nba.stats.qq.com/nbascore/?mid=1469625","m_link2url":"http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1469625","status":"2"},{"time":"01/14 09:00","m_time":"01-14 周六 09:00","player1":"灰熊","player2":"火箭","player1logo":"http://p7.qhmsg.com/t01c6cd06b91021cabb.png?size=78x78","player2logo":"http://p5.qhmsg.com/t01b24bc0916fceab4a.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=29","m_player1url":"http://sports.qq.com/kbsweb/kbsshare/team.htm?cid=100000","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=10","m_player2url":"http://sports.qq.com/kbsweb/kbsshare/team.htm?cid=100000","score":"110-105","link1text":"视频集锦","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1469672","m_link1url":"http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1469672","link2text":"数据统计","link2url":"http://nba.stats.qq.com/nbascore/?mid=1469672","m_link2url":"http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1469672","status":"2"},{"time":"01/22 09:00","m_time":"01-22 周日 09:00","player1":"火箭","player2":"灰熊","player1logo":"http://p5.qhmsg.com/t01b24bc0916fceab4a.png?size=78x78","player2logo":"http://p7.qhmsg.com/t01c6cd06b91021cabb.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=10","m_player1url":"http://sports.qq.com/kbsweb/kbsshare/team.htm?cid=100000","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=29","m_player2url":"http://sports.qq.com/kbsweb/kbsshare/team.htm?cid=100000","score":"119-95","link1text":"视频集锦","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1469291","m_link1url":"http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1469291","link2text":"数据统计","link2url":"http://nba.stats.qq.com/nbascore/?mid=1469291","m_link2url":"http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1469291","status":"2"},{"time":"03/05 10:00","m_time":"03-05 周日 10:00","player1":"灰熊","player2":"火箭","player1logo":"http://p7.qhmsg.com/t01c6cd06b91021cabb.png?size=78x78","player2logo":"http://p5.qhmsg.com/t01b24bc0916fceab4a.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=29","m_player1url":"http://sports.qq.com/kbsweb/kbsshare/team.htm?cid=100000","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=10","m_player2url":"http://sports.qq.com/kbsweb/kbsshare/team.htm?cid=100000","score":"108-123","link1text":"视频集锦","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1469514","m_link1url":"http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1469514","link2text":"数据统计","link2url":"http://nba.stats.qq.com/nbascore/?mid=1469514","m_link2url":"http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1469514","status":"2"}],"more1":{"link":"","text":""},"more2":{"link":"","text":""}}
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
         * title : NBA2016-2017赛季_火箭VS灰熊赛程赛果
         * list : [{"time":"10/16 08:00","m_time":"10-16 周日 08:00","player1":"灰熊","player2":"火箭","player1logo":"http://p7.qhmsg.com/t01c6cd06b91021cabb.png?size=78x78","player2logo":"http://p5.qhmsg.com/t01b24bc0916fceab4a.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=29","m_player1url":"http://sports.qq.com/kbsweb/kbsshare/team.htm?cid=100000","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=10","m_player2url":"http://sports.qq.com/kbsweb/kbsshare/team.htm?cid=100000","score":"134-125","link1text":"视频集锦","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1469934","m_link1url":"http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1469934","link2text":"数据统计","link2url":"http://nba.stats.qq.com/nbascore/?mid=1469934","m_link2url":"http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1469934","status":"2"},{"time":"12/24 09:00","m_time":"12-24 周六 09:00","player1":"火箭","player2":"灰熊","player1logo":"http://p5.qhmsg.com/t01b24bc0916fceab4a.png?size=78x78","player2logo":"http://p7.qhmsg.com/t01c6cd06b91021cabb.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=10","m_player1url":"http://sports.qq.com/kbsweb/kbsshare/team.htm?cid=100000","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=29","m_player2url":"http://sports.qq.com/kbsweb/kbsshare/team.htm?cid=100000","score":"109-115","link1text":"视频集锦","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1469625","m_link1url":"http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1469625","link2text":"数据统计","link2url":"http://nba.stats.qq.com/nbascore/?mid=1469625","m_link2url":"http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1469625","status":"2"},{"time":"01/14 09:00","m_time":"01-14 周六 09:00","player1":"灰熊","player2":"火箭","player1logo":"http://p7.qhmsg.com/t01c6cd06b91021cabb.png?size=78x78","player2logo":"http://p5.qhmsg.com/t01b24bc0916fceab4a.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=29","m_player1url":"http://sports.qq.com/kbsweb/kbsshare/team.htm?cid=100000","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=10","m_player2url":"http://sports.qq.com/kbsweb/kbsshare/team.htm?cid=100000","score":"110-105","link1text":"视频集锦","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1469672","m_link1url":"http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1469672","link2text":"数据统计","link2url":"http://nba.stats.qq.com/nbascore/?mid=1469672","m_link2url":"http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1469672","status":"2"},{"time":"01/22 09:00","m_time":"01-22 周日 09:00","player1":"火箭","player2":"灰熊","player1logo":"http://p5.qhmsg.com/t01b24bc0916fceab4a.png?size=78x78","player2logo":"http://p7.qhmsg.com/t01c6cd06b91021cabb.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=10","m_player1url":"http://sports.qq.com/kbsweb/kbsshare/team.htm?cid=100000","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=29","m_player2url":"http://sports.qq.com/kbsweb/kbsshare/team.htm?cid=100000","score":"119-95","link1text":"视频集锦","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1469291","m_link1url":"http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1469291","link2text":"数据统计","link2url":"http://nba.stats.qq.com/nbascore/?mid=1469291","m_link2url":"http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1469291","status":"2"},{"time":"03/05 10:00","m_time":"03-05 周日 10:00","player1":"灰熊","player2":"火箭","player1logo":"http://p7.qhmsg.com/t01c6cd06b91021cabb.png?size=78x78","player2logo":"http://p5.qhmsg.com/t01b24bc0916fceab4a.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=29","m_player1url":"http://sports.qq.com/kbsweb/kbsshare/team.htm?cid=100000","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=10","m_player2url":"http://sports.qq.com/kbsweb/kbsshare/team.htm?cid=100000","score":"108-123","link1text":"视频集锦","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1469514","m_link1url":"http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1469514","link2text":"数据统计","link2url":"http://nba.stats.qq.com/nbascore/?mid=1469514","m_link2url":"http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1469514","status":"2"}]
         * more1 : {"link":"","text":""}
         * more2 : {"link":"","text":""}
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
             * link :
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
             * link :
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
             * time : 10/16 08:00
             * m_time : 10-16 周日 08:00
             * player1 : 灰熊
             * player2 : 火箭
             * player1logo : http://p7.qhmsg.com/t01c6cd06b91021cabb.png?size=78x78
             * player2logo : http://p5.qhmsg.com/t01b24bc0916fceab4a.png?size=78x78
             * player1url : http://kbs.sports.qq.com/kbsweb/teams.htm?tid=29
             * m_player1url : http://sports.qq.com/kbsweb/kbsshare/team.htm?cid=100000
             * player2url : http://kbs.sports.qq.com/kbsweb/teams.htm?tid=10
             * m_player2url : http://sports.qq.com/kbsweb/kbsshare/team.htm?cid=100000
             * score : 134-125
             * link1text : 视频集锦
             * link1url : http://sports.qq.com/kbsweb/game.htm?mid=100000:1469934
             * m_link1url : http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1469934
             * link2text : 数据统计
             * link2url : http://nba.stats.qq.com/nbascore/?mid=1469934
             * m_link2url : http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1469934
             * status : 2
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
