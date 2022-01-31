package com.hillel.lesson14.homework.coffeeMachine;

public class Cappuccino extends Drink {


    @Override public void makeADrink() {
        System.out.println("Your cappuccino is ready! ");

    }

    @Override public String toString() {
        return "Cappuccino";
    }
    @Override public int getPrice() {
        return price = 40;
    }

}
