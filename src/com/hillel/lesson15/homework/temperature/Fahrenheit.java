package com.hillel.lesson15.homework.temperature;

public class Fahrenheit extends TemperatureScale {

    @Override
    public void convert(String scale, double input) {
        this.input = input;
        if (scale.equals("c=f")){
            this.result = (input * 9 / 5) + 32;
        } else {
            this.result = (input - 273.15) * 9 / 5 + 32;
        }
    }

    @Override public String toString(String scale) {
        if (scale.equals("c=f")) {
            return this.input + "° C = " + result + "° F";
        } else {
            return this.input + " K = " + result + "° F";
        }
    }
}
