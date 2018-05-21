package com.example.adriana.tourguideapp;

public class CityAttraction {
    private int image;
    private String name;
    private String location;

    public CityAttraction(int image, String name, String location) {
        this.image = image;
        this.name = name;
        this.location = location;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }
}