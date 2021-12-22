package com.hillel.lesson6.homework;


public class MinimalNumber {

    public static void main(String[] args) {

        int max = 100;
        int n1 = generateRandom(max);
        int n2 = generateRandom(max);
        int n3 = generateRandom(max);

        printMinimalNumber(n1, n2, n3);
    }

    private static void printMinimalNumber(int n1, int n2, int n3) {
        if (n1 < n2 && n1 < n3) {
            printMinimalNumber(n1);
        } else if (n2 < n1 && n2 < n3) {
            printMinimalNumber(n2);
        } else {
            printMinimalNumber(n3);
        }
    }

    public static int generateRandom(int max) {
        return (int) (Math.random() * max);

    }
    public static void printMinimalNumber (int n){
        System.out.println("Minimal number: " + n);
    }
}
