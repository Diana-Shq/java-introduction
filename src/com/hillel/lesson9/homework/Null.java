package com.hillel.lesson9.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Null {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Input array max size: ");
        int max = Integer.parseInt(READER.readLine());
        int size = (int) (Math.random() * max);
        int[] nulls = createAndFill(size);

        System.out.println("Array: " + Arrays.toString(nulls));

        Arrays.sort(nulls);
        matches(nulls);



    }

    private static void matches(int[] nulls) {
        int counter = 0;
        for (int i = 0; i < nulls.length; i++) {
            if (nulls[i] == 0) {
                counter++;
            }
        }
        if (counter != 0) {
            System.out.println("Array sort: " + Arrays.toString(nulls));
        } else {
            System.out.println("There is no 0 in the array: " + Arrays.toString(nulls));
        }
    }

    private static int[] createAndFill(int size) throws IOException {
        int[] array = new int[size];
        System.out.println("Input max number: ");
        int max = Integer.parseInt(READER.readLine());
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * (max - min)) + min);
        }
        return array;
    }

}
