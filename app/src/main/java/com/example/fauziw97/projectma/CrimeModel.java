package com.example.fauziw97.projectma;

/**
 * Created by Fauziw97 on 21/02/18.
 */

public class CrimeModel {
    private String title;
    private String desc;
    private String image;

    public CrimeModel (String title, String desc, String image) {
        this.title = title;
        this.desc = desc;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
