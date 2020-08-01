package com.example.marvelapidemo.ComicModel;

import com.google.gson.annotations.SerializedName;

public class  Comic {
    @SerializedName("title")
    private String title;
    @SerializedName("issueNumber")
    private double issueNumber;
    @SerializedName("description")
    private String description;
    @SerializedName("pageCount")
    private int pageCount;
    @SerializedName("urls")
    private Url[] urls;
    @SerializedName("prices")
    private ComicPrice[] prices;
    @SerializedName("thumbnail")
    private Image thumbnail;

    public String getTitle() {
        return title;
    }

    public double getIssueNumber() {
        return issueNumber;
    }

    public String getDescription() {
        return description;
    }

    public int getPageCount() {
        return pageCount;
    }

    public Url[] getUrls() {
        return urls;
    }

    public ComicPrice[] getPrices() {
        return prices;
    }

    public Image getThumbnail() {
        return thumbnail;
    }
}
