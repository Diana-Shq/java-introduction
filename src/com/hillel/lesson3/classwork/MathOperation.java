package com.hillel.lesson3.classwork;

public class MathOperation {

    public static void main(String[] args) {

        int a = 12;
        int b = 3;

        int c = a + b;
        System.out.println("a + b =" + c);
        System.out.println("a - b =" + (a - b));
        System.out.println("a * b =" + (a * b));
        System.out.println("a / b =" + (a / b));
        System.out.println("a % b =" + (a % b));
        System.out.println("a++ " + a++);
        System.out.println(a);

        System.out.println("++a " + ++a);
        System.out.println(a);

        System.out.println("--b " + --b);
        System.out.println(b);

        System.out.println("b-- " + b--);
        System.out.println(b);

    }
}