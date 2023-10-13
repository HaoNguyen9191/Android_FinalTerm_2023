package com.example.learnguaue;

public class DB_FlashCard_Info {
    private String firstLanguage;
    private String secondLanguage;

    public DB_FlashCard_Info (String firstLanguage, String secondLanguage)
    {
        this.firstLanguage=firstLanguage;
        this.secondLanguage=secondLanguage;
    }

    public String getFirstLanguage() {
        return firstLanguage;
    }

    public String getSecondLanguage() {
        return secondLanguage;
    }

    public void setFirstLanguage(String firstLanguage) {
        this.firstLanguage = firstLanguage;
    }

    public void setSecondLanguage(String secondLanguage) {
        this.secondLanguage = secondLanguage;
    }
}
