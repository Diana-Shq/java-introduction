package com.hillel.lesson13.homework.Person;

import static java.lang.Math.*;

public class Person {

    int age;
    int weight;
    int height;
    String name;
    String surname;

     public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.age = getAge();
        this.weight = getWeight(this.age);
        this.height = getHeight(this.weight);

    }

    int getAge() {
        return age = (int) (random() * 100);
    }

    int getWeight(int age) {
        if (age == 0) {
            return getAge();
        } else if (age > 0 && age <= 5) {
            return weight = (int) (random() * (18 - 9) + 9);
        } else if (age > 5 && age <= 10) {
            return weight = (int) (random() * (30 - 20) + 20);
        } else if (age > 10 && age <= 15) {
            return weight = (int) (random() * (50 - 35) + 35);
        }
        return weight = (int) (random() * (100 - 50) + 50);
    }

    int getHeight(int weight) {
        if (weight > 9 && weight <= 18) {
            return height = (int) (random() * (100 - 75) + 75);
        } else if (weight > 18 && weight <= 30) {
            return height = (int) (random() * (130 - 101) + 101);
        } else if (weight > 30 && weight <= 45) {
            return height = (int) (random() * (150 - 131) + 131);
        } else if (weight > 45 && weight <= 55) {
            return height = (int) (random() * (170 - 151) + 151);
        } else if (weight > 55 && weight <= 70) {
            return height = (int) (random() * (185 - 171) + 171);
        }
        return height = (int) (random() * (200 - 186) + 186);
    }
    @Override
    public String toString() {
        System.out.println();
        return "Name: " + name + "; \nSurname: " + surname + "; \nAge: " + age + "; \nWeight: " + weight + "; \nHeight: " + height + ";";
    }
}
