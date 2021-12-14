package com.hillel.lesson5.classwork;

import java.security.PublicKey;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Truck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Input width, height, length: ");
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        int length = scanner.nextInt();

        int maxCargo = 58;

        int volume = calculateVolume(width, height, length);
        System.out.println(volume);

        int totalWeight = calculateTotalWeight(volume, maxCargo);
        System.out.println(totalWeight);
    }
    public  static void print (int volume){
        System.out.println(volume);
    }

    public static int calculateVolume(int width, int height, int length){
        return width * height * length;

    }

    public static int calculateTotalWeight(int volume, int maxCargo) {
        return volume * maxCargo;
    }


}
