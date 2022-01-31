package com.hillel.lesson14.homework.coffeeMachine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import static com.hillel.lesson14.homework.coffeeMachine.Drinks.*;

public class CoffeeMachine {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        List<Drink> drinks = new ArrayList<>();

        getOrder(drinks);

        confirmation(drinks);




    }

    private static void getOrder(List<Drink> drinks) throws IOException {
        Drinks input;

        System.out.println("Hello! Please, enter your order: ");
        System.out.println("After completing the selection, enter \"OK\":");

        while (!(input = Drinks.valueOf(READER.readLine())).equals(OK)) {
            createDrink(drinks, input);
        }
        System.out.println(totalOrder(drinks));
    }

    private static void confirmation(List<Drink> drinks) throws IOException {
        System.out.println("Do you confirm the order? Enter \"yes\" or \"no\" ");
        String orderConfirmed = READER.readLine();

        if (orderConfirmed.equalsIgnoreCase("yes")) {
            make(drinks);
            System.out.println("Thanks for your order! Have a nice day! ");
        } else {
            System.out.println("Do you want to place a new order?");
        }

    }

    private static String totalOrder(List<Drink> drinks) {
        int sum = 0;
        for (Drink drink : drinks) {
            System.out.println(drink + " cost: " + drink.getPrice() + " uah");
            sum += drink.getPrice();

        }
        return "Total order value: " + sum + " uah";
    }

    private static void make(List<Drink> drinks) {
        for (Drink drink : drinks) {
            drink.makeADrink();
        }
    }

    private static void createDrink(List<Drink> drinks, Drinks input) {

        switch (input) {
            case ESPRESSO:
                Drink espresso = new Espresso();
                drinks.add(espresso);
                break;
            case LATTE:
                Drink latte = new Latte();
                drinks.add(latte);
                break;
            case CAPPUCCINO:
                Drink cappuccino = new Cappuccino();
                drinks.add(cappuccino);
                break;
            case TEA:
                Drink tea = new Tea();
                drinks.add(tea);
                break;
            case AMERICANO:
                Drink americano = new Americano();
                drinks.add(americano);
                break;
            default:
                throw new IllegalArgumentException("Unknown type of drink " + input);
        }

    }

}
