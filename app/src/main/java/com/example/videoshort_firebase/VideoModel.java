package com.example.videoshort_firebase;

import java.io.Serializable;

public class VideoModel implements Serializable {
    private String title;
    private String desc;
    private String url;
    public VideoModel(){}

    public VideoModel(String desc, String title, String url) {
        this.title = title;
        this.desc = desc;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
