package com.example.marvelapidemo.ItemClasses;

public class CharacterItem {
    private String characterImage;
    private String characterName;
    private String characterDescrp;
    private String characterUrl;

    public CharacterItem(String characterImage, String characterName, String characterDescrp) {
        this.characterImage = characterImage;
        this.characterName = characterName;
        this.characterDescrp = characterDescrp;
    }

    public String getCharacterImage() {
        return characterImage;
    }

    public void setCharacterImage(String characterImage) {
        this.characterImage = characterImage;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getCharacterDescrp() { return characterDescrp; }

    public void setCharacterDescrp(String characterDescrp) { this.characterDescrp = characterDescrp; }


}
