package com.hillel.lesson3.homework;

import java.math.MathContext;

public class Snowman {

    public static void main(String[] args) {

        int r1 = 1;
        float r2 = 0.5f;
        float r3 = 0.2f;
        float p = 0.7f;
        float a = 4/3f;


        double pi = Math.PI;
        double m1 = (p * a * pi * (Math.pow(r1, 3)));
        double m2 = (p * a * pi * (Math.pow(r2, 3)));
        double m3 = (p * a * pi * (Math.pow(r3, 3)));

        System.out.println("m = " + (m1 + m2 + m3));



    }
}
