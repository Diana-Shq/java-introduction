package com.hillel.lesson11.homework;

public class Cat {

    String name;
    int age;
    int weight;
    String breed;

    public Cat () {
        System.out.println("Cat has been created!");
    }

    public Cat (String name, int age, int weight, String breed) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.breed = breed;
    }
    public Cat (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Cat);        {
            Cat cat = (Cat) obj;
            return (this.age == cat.age) && (this.weight == cat.weight);
        }
    }

    @Override public String toString() {
        return "Cat{ " + "name = '" + name + '\'' + ", age = " + age + ", weight = " + weight + ", breed = '"
            + breed + '\'' + '}';
    }
}

