package com.example.tonko_i.a70percent.Entity;

import java.io.Serializable;

/**
 * Created by User on 16.04.2017.
 */

public class Task implements Serializable{
    private int id;
    private double longitude;
    private double latitude;
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
