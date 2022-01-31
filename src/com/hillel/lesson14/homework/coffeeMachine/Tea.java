package com.hillel.lesson14.homework.coffeeMachine;

public class Tea extends Drink {

    @Override public void makeADrink() {
        System.out.println("Your tea is ready! ");

    }

    @Override public String toString() {
        return "Tea";
    }
    @Override public int getPrice() {
        return price = 30;
    }

}
