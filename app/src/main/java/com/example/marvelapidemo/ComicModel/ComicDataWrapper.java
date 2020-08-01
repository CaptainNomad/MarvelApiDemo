package com.example.marvelapidemo.ComicModel;

import com.google.gson.annotations.SerializedName;

public class ComicDataWrapper {
    @SerializedName("code")
    private int code;
    @SerializedName("status")
    private String status;
    @SerializedName("copyright")
    private String copyright;
    @SerializedName("attributionText")
    private String attributionText;
    @SerializedName("attributionHTML")
    private String attributionHTML;
    @SerializedName("data")
    private ComicDataContainer data;
    @SerializedName("etag")
    private String etag;

    public int getCode() {
        return code;
    }

    public String getStatus() {
        return status;
    }

    public String getCopyright() {
        return copyright;
    }

    public String getAttributionText() {
        return attributionText;
    }

    public String getAttributionHTML() {
        return attributionHTML;
    }

    public ComicDataContainer getData() {
        return data;
    }

    public String getEtag() {
        return etag;
    }
}
