package com.hillel.lesson15.homework.temperature;

public class Kelvin extends TemperatureScale {

    @Override
    public void convert(String scale, double input) {
        this.input = input;
        if (scale.equals("c=k")){
            this.result = input + 273.15;
        } else {
            this.result = (input - 32) * 5 / 9 + 273.15;
        }
    }
    @Override
    public String toString(String scale) {
        if (scale.equals("c=k")) {
            return this.input + "° C = " + result + " K";
        } else {
            return this.input + " F = " + result + " K";
        }
    }
}
