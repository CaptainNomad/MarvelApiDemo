package com.example.marvelapidemo.ComicModel;

import com.google.gson.annotations.SerializedName;

public class Image {
    @SerializedName("path")
    private String path;
    @SerializedName("extension")
    private String extension;

    public String getPath() {
        return path;
    }

    public String getExtension() {
        return extension;
    }
}
