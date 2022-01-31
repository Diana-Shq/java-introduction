package com.hillel.lesson14.homework.coffeeMachine;

public class Americano extends Drink {

    @Override public void makeADrink() {
        System.out.println("Your americano is ready! ");

    }

    @Override public String toString() {
        return "Americano";
    }
    @Override public int getPrice() {
        return price = 28;
    }

}
