package com.example.renters.helper;

import android.graphics.drawable.GradientDrawable;

public class CategoriesHelperClass {

    GradientDrawable gradient2;
    int propeprty;
    String description;
    public CategoriesHelperClass(GradientDrawable gradient2, int property, String title) {
    this.gradient2=gradient2;
    this.propeprty=property;
    this.description=title;

    }

    public String getDescription() {
        return description;
    }

    public GradientDrawable getGradient2() {
        return gradient2;
    }

    public int getPropeprty() {
        return propeprty;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setGradient2(GradientDrawable gradient2) {
        this.gradient2 = gradient2;
    }

    public void setPropeprty(int propeprty) {
        this.propeprty = propeprty;
    }
}
