package com.hillel.lesson5.homework;

import java.util.Scanner;

public class CaryOnBaggage {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input width: ");
        int width = scanner.nextInt();
        System.out.println("Input length: ");
        int length = scanner.nextInt();
        System.out.println("Input height: ");
        int height = scanner.nextInt();

        if (width <= 0 || length <= 0 || height <= 0) {
            System.out.println("The entered data is incorrect");
        } else if (width <= 20 && length <= 55 && height <= 40) {
            System.out.println("Your baggage goes like carry-on luggage !");
        } else if (width <= 22 && length <= 40 && height <= 53){
            System.out.println("Your baggage goes like carry-on luggage !");
        } else {
            System.out.println("Your baggage doesn't like carry-on luggage !");
        }

    }

}
