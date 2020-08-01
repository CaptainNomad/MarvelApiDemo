package com.example.marvelapidemo.ComicModel;

import com.google.gson.annotations.SerializedName;

public class ComicDataContainer {
    @SerializedName("offset")
    private int offset;
    @SerializedName("limit")
    private int limit;
    @SerializedName("count")
    private int count;
    @SerializedName("total")
    private int total;
    @SerializedName("results")
    private Comic[] results;

    public int getOffset() {
        return offset;
    }

    public int getLimit() {
        return limit;
    }

    public int getCount() {
        return count;
    }

    public int getTotal() {
        return total;
    }

    public Comic[] getResults() {
        return results;
    }
}
