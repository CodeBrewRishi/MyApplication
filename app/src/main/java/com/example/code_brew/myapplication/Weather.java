package com.example.code_brew.myapplication;

import java.util.List;

/**
 * Created by code-brew on 11/7/15.
 */
public class Weather {
    private int id;
    private String mainS;
    private String description;


    private Weather() {
    }

    public int getId() {
        return id;
    }

    public String getMainS() {
        return mainS;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMainS(String mainS) {
        this.mainS = mainS;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;

    }
}
