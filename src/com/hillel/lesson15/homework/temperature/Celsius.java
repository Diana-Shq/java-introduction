package com.hillel.lesson15.homework.temperature;

public class Celsius extends TemperatureScale {

    @Override
    public void convert(String scale, double input) {
        this.input = input;
        if (scale.equals("f=c")){
            this.result = (input - 32) * 5 / 9;
        } else {
            this.result = input - 273.15;
        }

    }
    @Override public String toString(String scale) {
        if (scale.equals("f=c")) {
            return this.input + "° F = " + result + "° C";
        } else {
            return this.input + " K = " + result + "° C";
        }
    }
}
