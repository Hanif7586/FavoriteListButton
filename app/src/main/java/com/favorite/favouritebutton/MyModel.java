package com.favorite.favouritebutton;

public class MyModel {

    public int id;
    public String hindi;
    public String english;
    public int img; // Added field for the image resource ID

    public MyModel(int id, String hindi, String english, int img) {
        this.id = id;
        this.hindi = hindi;
        this.english = english;
        this.img = img;
    }
}
