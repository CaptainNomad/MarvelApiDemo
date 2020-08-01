package com.example.marvelapidemo.ItemClasses;

public class ComicItem {
    public String comicImg;
    public String comicText;
    private float comicPrice;
    private String comicSummary;

    public ComicItem(String comicImg, String comicText, float comicPrice, String comicSummary) {
        this.comicImg = comicImg;
        this.comicText = comicText;
        this.comicPrice = comicPrice;
        this.comicSummary = comicSummary;
    }

    public String getComicImg() {
        return comicImg;
    }

    public void setComicImg(String comicImg) {
        this.comicImg = comicImg;
    }

    public String getComicText() {
        return comicText;
    }

    public void setComicText(String comicText) {
        this.comicText = comicText;
    }

    public float getComicPrice() { return comicPrice; }

    public void setComicPrice(float comicPrice) { this.comicPrice = comicPrice; }

    public String getComicSummary() {
        return comicSummary;
    }

    public void setComicSummary(String comicSummary) {
        this.comicSummary = comicSummary;
    }
}
