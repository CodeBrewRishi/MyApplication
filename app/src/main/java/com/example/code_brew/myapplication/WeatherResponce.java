package com.example.code_brew.myapplication;

/**
 * Created by code-brew on 11/7/15.
 */
public class WeatherResponce {

    private int cod;
    private String base;
    private Weather main;


    private WeatherResponce() {
    }

    public int getCod() {
        return cod;
    }

    public String getBase() {
        return base;
    }

    public Weather getMain() {
        return main;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public void setMain(Weather main) {
        this.main = main;
    }
}
