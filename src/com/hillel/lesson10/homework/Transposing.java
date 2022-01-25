package com.hillel.lesson10.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Transposing {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {


        int size1 = getSize();
        int size2 = getSize();
        int[][] array = new int[size1][size2];

        fillMatrix(array);
        printMatrix(array);

        int[][] newArray = transfer(size1, size2, array);
        printMatrix(newArray);


    }

    static int getSize() throws IOException {
        try {
            System.out.println("Input size matrix: ");
            return Integer.parseInt(READER.readLine());
        } catch (Exception exception) {
            System.out.println("Error " + exception.getMessage());
            return getSize();
        }
    }

    private static int[][] transfer(int size1, int size2, int[][] array) {
        int[][] newArray = new int[size2][size1];
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                newArray[i][j] = array[j][i];
            }
        }
        return newArray;
    }

    static void printMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "; ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void fillMatrix(int[][] array) throws IOException {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Input " + i + "; " + j + "; element: ");
                array[i][j] = Integer.parseInt(READER.readLine());
            }
        }
    }
}
