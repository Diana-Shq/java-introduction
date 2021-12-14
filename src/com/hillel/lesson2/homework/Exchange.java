package com.hillel.lesson2.homework;

public class Exchange {

    public static void main(String[] args) {

        int a = 33;
        int b = 44;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a + b - (b = a);

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
