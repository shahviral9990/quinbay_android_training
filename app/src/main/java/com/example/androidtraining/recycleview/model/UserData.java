package com.example.androidtraining.recycleview.model;

public class UserData {
    private String name;
    private String imageUrl;
    private boolean isDeveloper;

    public UserData(String name, String imageUrl, boolean isDeveloper) {
        this.name = name;
        this.imageUrl = imageUrl;
        this.isDeveloper = isDeveloper;
    }

    public boolean isDeveloper() {
        return isDeveloper;
    }

    public void setDeveloper(boolean developer) {
        isDeveloper = developer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
