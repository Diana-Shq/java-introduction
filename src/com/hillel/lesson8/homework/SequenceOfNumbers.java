package com.hillel.lesson8.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SequenceOfNumbers {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Input the number of numbers in the sequence: ");

        int sequelsOfNumbers[] = createAndFill(Integer.parseInt(READER.readLine()));

        boolean arrayIncreasing = true;
        for (int i = 1; i < sequelsOfNumbers.length; i++) {
            if (sequelsOfNumbers[i] <= sequelsOfNumbers[i-1]) {
                arrayIncreasing = false;
                break;
            }
        }
        if (arrayIncreasing) {
            System.out.println("Increasing sequence of numbers");
        } else {
            System.out.println("Non-increasing sequence of numbers");
        }


    }


    public static void fillArray(int[] sequelsOfNumbers) throws IOException {

            try {
                for (int i = 0; i < sequelsOfNumbers.length; i++) {
                    System.out.println("Input " + i + " element");
                    sequelsOfNumbers[i] = Integer.parseInt(READER.readLine());
                }
            } catch (Exception exception) {
                System.out.println("Error " + exception.getMessage());
                fillArray(sequelsOfNumbers);
            }


    }
    public static int[] createAndFill(int size) throws IOException {
        int[] array = new int[size];
        fillArray(array);
        return array;

    }
}
