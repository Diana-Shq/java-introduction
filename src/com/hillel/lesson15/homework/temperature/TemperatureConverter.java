package com.hillel.lesson15.homework.temperature;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TemperatureConverter {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Input degrees:");
        double input = Double.parseDouble(READER.readLine());

        System.out.println("Input the system to which you want to convert in the format \"c=f/k=f/f=c\"");
        String scale = READER.readLine();

        System.out.println(create(scale, input));

    }

    public static String create(String scale, double input) {
        switch (scale) {
            case "c=k":
            case "f=k":
                TemperatureScale celsiusToKelvin = new Kelvin();
                celsiusToKelvin.convert(scale, input);
                return celsiusToKelvin.toString(scale);
            case "c=f":
            case "k=f":
                TemperatureScale celsiusToFahrenheit = new Fahrenheit();
                celsiusToFahrenheit.convert(scale, input);
                return celsiusToFahrenheit.toString(scale);
            case "f=c":
            case "k=c":
                TemperatureScale fahrenheitToCelsius = new Celsius();
                fahrenheitToCelsius.convert(scale, input);
                return fahrenheitToCelsius.toString(scale);
            default:
                throw new IllegalArgumentException("Unknown scale " + scale);
        }
    }
}

