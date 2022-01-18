package com.hillel.lesson8.homework;

import com.hillel.lesson6.homework.Calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rugby {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Input the number of players in the team: ");
        int teamSize = Integer.parseInt(READER.readLine());
        int[] firstTeam = new int[teamSize];
        int[] secondTeam = new int[teamSize];

        fillArray(firstTeam);
        fillArray(secondTeam);
        printAge(firstTeam);
        printAge(secondTeam);

        double averageAge1 = calculateAverageAge(firstTeam, teamSize);
        double averageAge2 = calculateAverageAge(secondTeam, teamSize);

        compare(averageAge1, averageAge2);


    }

    public static void fillArray(int[] array) throws IOException {

        System.out.println("Input the minimum age of the team player: ");
        int minAge = Integer.parseInt(READER.readLine());
        System.out.println("Input the maximum age of the team player: ");
        int maxAge = Integer.parseInt(READER.readLine());
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * (maxAge - minAge)) + minAge);

        }
    }

    public static void printAge(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print("Team age: " + array[i] + ", ");
            } else if (i == array.length - 1) {
                System.out.println(array[i] + "; ");
            } else {
                System.out.print(array[i] + ", ");
            }

        }
    }

    public static double calculateAverageAge(int[] array, int teamSize) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double averageAge = (double) sum / teamSize;
        return averageAge;
    }

    public static void compare(double a, double b) {
        if (a > b) {
            System.out.println("The average age of the players is greater in the first team");
        } else if (a < b) {
            System.out.println("The average age of the players is greater in the second team");
        } else {
            System.out.println("The average age of the players on both teams equals");
        }
    }



}
