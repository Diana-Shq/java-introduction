package com.hillel.lesson6.classwork;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sum {

    public static void main(String[] args) {


        int i1 = 4;
        int i2 = 5;
        long l1 = 321321321;
        long l2 = 1231231231;

        double i = calculateSum(i1, i2);
        System.out.println(i);
        double l = calculateSum(l1, l2);
        System.out.println(l);
        System.out.println(calculateSum(4, 5));
        System.out.println(calculateSum(40000L, 5000L));
        System.out.println(calculateSum(40.5, 500.0));


    }

    public static double calculateSum(int i1, int i2) {
        return i1 + i2;
    }

    public static double calculateSum(long l1, long l2) {
        return l1 + l2;
    }

    public static double calculateSum(double l1, double l2) {
        return l1 + l2;
    }
}
