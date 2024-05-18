package com.example.myapplication.Model;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Types extends MusicObject implements Serializable {
    private String name;
    private String image;

    public Types() {
    }

    public Types(String id, String name, String image) {
        super(id);
        this.name = name;
        this.image = image;
    }

    public void update(String name, String image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @NonNull
    @Override
    public String toString() {
        return "Types{" +
                "key='" + key + '\'' +
                ", id='" + super.getId() + '\'' +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}

