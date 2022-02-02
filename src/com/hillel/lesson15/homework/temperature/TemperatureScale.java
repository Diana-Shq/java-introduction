package com.hillel.lesson15.homework.temperature;


public abstract class TemperatureScale implements Converter{
    protected String scale;
    protected double input;
    protected double result;

    public String toString(String scale) {
        return result + "°";
    }

}
