package com.example.apple.pocketlife.app.ui.bmobbean;

import com.example.apple.pocketlife.lib.base.BaseBean;

/**
 * 收藏表
 * Created by apple on 17/4/11.
 */

public class WebLikeBean extends BaseBean {
    String url;
    String title;
    String name;

    @Override
    public String toString() {
        return "WebLikeBean{" +
                "url='" + url + '\'' +
                ", title='" + title + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
