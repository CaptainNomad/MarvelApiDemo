package com.example.marvelapidemo.ComicModel;

import com.google.gson.annotations.SerializedName;

public class ComicPrice {
    @SerializedName("type")
    private String type;
    @SerializedName("price")
    private float price;

    public String getType() {
        return type;
    }

    public float getPrice() {
        return price;
    }
}
