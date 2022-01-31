package com.hillel.lesson14.homework.coffeeMachine;

public class Latte extends Drink {

    @Override public void makeADrink() {
        System.out.println("Your latte is ready! ");

    }

    @Override public String toString() {
        return "Latte";
    }
    @Override public int getPrice() {
        return price = 35;
    }

}
