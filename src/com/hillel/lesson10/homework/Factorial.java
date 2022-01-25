package com.hillel.lesson10.homework;

import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        getFactorial();

    }

    private static int getFactorial() throws IOException {
        try {
            System.out.println("Input N: ");
            int n = Integer.parseInt(READER.readLine());
            System.out.println(factorial(n));
            return Integer.parseInt(String.valueOf(n));
        } catch (Exception exception) {
            System.out.println("Error " + exception.getMessage());
            return getFactorial();
        }


    }

    public static int factorial(int n) {
        if (n < 0){
            System.out.println("Are you sure you need the factorial of a negative number?!");
            try {
                return getFactorial();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (n == 1) {
            System.out.print(n + " = ");
            return n;
        }
        if (n == 0) {
            System.out.print(n + "! = ");
            return 1;
        }
        System.out.print(n + " * ");
        return n * factorial(n - 1);
    }

}
