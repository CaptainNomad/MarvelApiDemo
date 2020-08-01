package com.example.marvelapidemo.CharacterModel;

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
