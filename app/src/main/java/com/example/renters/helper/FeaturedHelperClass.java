package com.example.renters.helper;

public class FeaturedHelperClass {

int image;
String title,description;

public FeaturedHelperClass(int image, String title, String description)
{
    this.image=image;
    this.title=title;
    this.description=description;
}


    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }
}
