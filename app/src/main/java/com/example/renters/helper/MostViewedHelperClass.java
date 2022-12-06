package com.example.renters.helper;

public class MostViewedHelperClass
{
    int image;
    String title;

    public MostViewedHelperClass(int image, String title)
    {
        this.image=image;
        this.title=title;
    }


    public int getImageView() {
        return image;
    }

    public void setImageView(int image) {
        this.image = image;
    }

    public void setTextView(String title) {
        this.title = title;
    }

    public String getTextView() {
        return title;
    }

}
