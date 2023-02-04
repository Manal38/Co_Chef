package com.example.foodplanner_app;

import android.graphics.drawable.Drawable;

public class Model {

    String mealName;
    int favImg,addImg;
    int mealImg;

    public Model() {
    }

    public Model(String mealName, int favImg, int addImg, int mealImg) {
        this.mealName = mealName;
        this.favImg = favImg;
        this.addImg = addImg;
        this.mealImg = mealImg;
    }

    public String getMealName() {
        return mealName;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    public int getFavImg() {
        return favImg;
    }

    public int getMealImg() {
        return mealImg;
    }

    public void setFavImg(int favImg) {
        this.favImg = favImg;
    }

    public void setMealImg(int mealImg) {
        this.mealImg = mealImg;
    }

    public int getAddImg() {
        return addImg;
    }

    public void setAddImg(int addImg) {
        this.addImg = addImg;
    }



}
