package com.hillel.lesson11.homework;

public class CatMain {

    public static void main(String[] args) {

        Cat firstCat = new Cat("Amy", 5, 6, "bengal");
        Cat secondCat = new Cat("Carrie", 3, 6, "british");




        System.out.println(firstCat.equals(secondCat));

    }
}
