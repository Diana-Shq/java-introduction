package com.hillel.lesson4.homework;

import java.util.Scanner;

public class AnimalShelter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of days in a month ");

        int numberOfDogs = 24;
        int numberOfCats = 8;
        double servingSize = 50;
        int servingCost = 2;
        int numberOfMeals = 3;
        int dayInMonth = scanner.nextInt();
        int gramsToKilograms = 1000;

        double catFoodInGrams = calculateCatFoodInMonth(numberOfCats, servingSize, numberOfMeals, dayInMonth);
        double catFoodInKilograms = catFoodInGrams / gramsToKilograms;
        System.out.println("Amount of cat food: " + catFoodInKilograms + " kilograms per month");

        double dogFoodInGrams = calculateDogFoodInMonth(numberOfDogs, servingSize, numberOfMeals, dayInMonth);
        double dogFoodInKilograms = dogFoodInGrams / gramsToKilograms;
        System.out.println("Amount of dog food: " + dogFoodInKilograms + " kilograms per month");

        double costs = calculateCosts(catFoodInKilograms, dogFoodInKilograms, servingCost);
        System.out.println("The shelter needs maintenance: " + costs + " thousand dollars a month");

    }

    public static double calculateCatFoodInMonth(int numberOfCats, double servingSize, int numberOfMeals, int dayInMonth) {
        return numberOfCats * servingSize * numberOfMeals * dayInMonth;
    }

    public static double calculateDogFoodInMonth(int numberOfDogs , double servingSize, int numberOfMeals, int dayInMonth) {
        return  numberOfDogs  * servingSize * numberOfMeals * dayInMonth;
    }

    public static double calculateCosts(double catFood, double dogFood, int servingCost) {
        return ((catFood + dogFood) * servingCost);
    }
}
