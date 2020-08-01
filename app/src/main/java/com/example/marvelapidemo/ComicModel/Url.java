package com.example.marvelapidemo.ComicModel;

import com.google.gson.annotations.SerializedName;

public class Url {
    @SerializedName("type")
    private String type;
    @SerializedName("url")
    private String url;

    public String getType() {
        return type;
    }

    public String getUrl() {
        return url;
    }
}
