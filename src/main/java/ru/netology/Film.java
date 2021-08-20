package ru.netology;

public class Film {
    private int id;
    private String name;
    private String genre;
    private String pictureUrl;
    private boolean premiereTomorrow;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public boolean isPremiereTomorrow() {
        return premiereTomorrow;
    }

    public void setPremiereTomorrow(boolean premiereTomorrow) {
        this.premiereTomorrow = premiereTomorrow;
    }

    public Film(int id, String name, String genre, String pictureUrl, boolean premiereTomorrow) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.pictureUrl = pictureUrl;
        this.premiereTomorrow = premiereTomorrow;
    }

    public Film() {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.pictureUrl = pictureUrl;
        this.premiereTomorrow = premiereTomorrow;
    }

}
