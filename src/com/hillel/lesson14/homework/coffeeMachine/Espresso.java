package com.hillel.lesson14.homework.coffeeMachine;

public class Espresso extends Drink {


    @Override public void makeADrink() {
        System.out.println("Your espresso is ready! ");

    }

    @Override public String toString() {
        return "Espresso";
    }

    @Override public int getPrice() {
        return price = 25;
    }
}
