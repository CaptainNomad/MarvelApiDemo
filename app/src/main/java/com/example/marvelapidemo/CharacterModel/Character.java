package com.example.marvelapidemo.CharacterModel;

import com.google.gson.annotations.SerializedName;

public class Character {
    @SerializedName("id")
    private int id;
    @SerializedName("name")
    private String name;
    @SerializedName("description")
    private String description;
    @SerializedName("urls")
    private Url urls;
    @SerializedName("thumbnail")
    private Image thumbnail;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Url getUrls() {
        return urls;
    }

    public Image getThumbnail() {
        return thumbnail;
    }
}
