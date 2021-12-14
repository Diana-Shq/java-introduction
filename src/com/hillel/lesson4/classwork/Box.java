package com.hillel.lesson4.classwork;

import java.util.Scanner;

public class Box {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);


        System.out.println("Input width, height, depth: ");
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        int depth = scanner.nextInt();

        int volume = calculateVolume(width, height, depth);
        System.out.println(volume);

        System.out.println(calculateVolume(345, 666, 344));
    }

        // Расчитать объем коробки width, height, depth
        public static int calculateVolume (int width, int height, int depth) {
                return width * height * depth;

        }

    }

