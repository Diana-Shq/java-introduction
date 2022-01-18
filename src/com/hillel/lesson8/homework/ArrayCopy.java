package com.hillel.lesson8.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrayCopy {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Input size big array: ");
        int[] bigArray = create(Integer.parseInt(READER.readLine()));
        fillArray(bigArray);
        int[] smallArray1 = create(bigArray.length / 2);
        int[] smallArray2 = create(bigArray.length / 2);

        for (int i = 0; i < bigArray.length / 2; i++) {
            smallArray1[i] = bigArray[i];

        }

        int j = 0;
        for (int i = bigArray.length / 2; i < bigArray.length; i++) {
            smallArray2[j] = bigArray[i];
            j++;
        }

        print(bigArray);
        print(smallArray1);
        print(smallArray2);
    }

    public static int[] create(int size) {
        int[] array = new int[size];
        return array;
    }

    public static void print(int[] array) {
        System.out.println(Arrays.toString(array));
    }


    public static void fillArray(int[] sequelsOfNumbers) {
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
}






