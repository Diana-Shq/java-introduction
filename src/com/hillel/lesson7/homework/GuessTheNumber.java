package com.hillel.lesson7.homework;

import java.io.IOException;

import java.util.Scanner;

public class GuessTheNumber {


    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int max = 10;
        int min = 0;
        int hiddenNumber = (int) ((Math.random() * (max - min)) + min);

        System.out.println("Guess the number conceived by the computer: ");
        int userNumber = scanner.nextInt();

        while (hiddenNumber != userNumber) {
            System.out.println("Not try! Enter again: ");
            userNumber = scanner.nextInt();
        }
        System.out.println("You guessed it! Congratulation! ");

    }
}
