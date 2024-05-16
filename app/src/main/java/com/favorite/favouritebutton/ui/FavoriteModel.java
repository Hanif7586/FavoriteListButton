package com.favorite.favouritebutton.ui;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(tableName = "favorite_table", indices = {@Index(value = {"hindi"}, unique = true), @Index(value = {"english"}, unique = true)})
public class FavoriteModel {

    @ColumnInfo(name = "hindi")
    public String hindi;

    @ColumnInfo(name = "english")
    public String english;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    public int id;

    @ColumnInfo(name = "img")
    public int img; // Added field for the image resource ID

    public FavoriteModel(int id, String hindi, String english, int img) {
        this.id = id;
        this.hindi = hindi;
        this.english = english;
        this.img = img;
    }
}
