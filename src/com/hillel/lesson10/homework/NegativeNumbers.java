package com.hillel.lesson10.homework;

import java.io.IOException;

import static com.hillel.lesson10.homework.Transposing.getSize;


public class NegativeNumbers {
    public static void main(String[] args) throws IOException {

        int size1 = getSize();
        int size2 = getSize();
        int[][] array = getArray(size1, size2);

        fillArray(array);
        printNegativeNumbers(array);
    }

    private static int[][] getArray(int size1, int size2) {
        int[][] array = new int[size1][size2];
        return array;
    }

    private static void printNegativeNumbers(int[][] array) {
        System.out.println("Index negative numbers: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0) {
                    System.out.print("(" + i + "; " + j + ";) ");
                }
            }
        }
    }

    private static void fillArray(int[][] array) {
        int max = 50;
        int min = -50;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) ((Math.random() * (max - min)) + min);
            }
        }
    }
}
