package com.example.marvelapidemo.CharacterModel;

import com.google.gson.annotations.SerializedName;

public class ComicList {
    @SerializedName("available")
    private int available;
    @SerializedName("returned")
    private int returned;
    @SerializedName("collectionURI")
    private String collectionURI;
    @SerializedName("items")
    private ComicSummary[] items;

    public int getAvailable() {
        return available;
    }

    public int getReturned() {
        return returned;
    }

    public String getCollectionURI() {
        return collectionURI;
    }

    public ComicSummary[] getItems() {
        return items;
    }
}
