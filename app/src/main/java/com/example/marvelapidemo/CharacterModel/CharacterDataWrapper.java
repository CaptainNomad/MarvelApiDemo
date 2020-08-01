package com.example.marvelapidemo.CharacterModel;

import com.google.gson.annotations.SerializedName;

public class CharacterDataWrapper {
    @SerializedName("code")
    private int code;
    @SerializedName("status")
    private String status;
    @SerializedName("attributionText")
    private String attributionText;
    @SerializedName("attributionHTML")
    private String attributionHTML;
    @SerializedName("data")
    private CharacterDataContainer data;
    @SerializedName("etag")
    private String etag;

    public int getCode() {
        return code;
    }

    public String getStatus() {
        return status;
    }

    public String getAttributionText() {
        return attributionText;
    }

    public String getAttributionHTML() {
        return attributionHTML;
    }

    public CharacterDataContainer getData() {
        return data;
    }

    public String getEtag() {
        return etag;
    }
}
