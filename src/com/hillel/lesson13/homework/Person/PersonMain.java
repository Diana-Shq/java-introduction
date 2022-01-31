package com.hillel.lesson13.homework.Person;


import static java.lang.Math.*;

public class PersonMain {

    public static void main(String[] args) {
        String[] names = {"Alica", "Marina", "Victor", "Victoria", "Adda", "Adam", "Andrey", "Adriana", "Tom", "Max", "Bred", "John", "Elizabet", "Olga", "Mary"};
        String[] surnames = {"Black", "Adams", "Allen", "Ford", "Green", "Jackson", "Johnson", "King", "Miller", "Scott", "Smith", "Williams", "Gibson", "Grant", "Morgan"};
        String name = names[(int) (random() * names.length)];
        String surname = surnames[(int) (random() * surnames.length)];

        Person[] persons = new Person[100];

        getArrayPersons(name, surname, persons);
        fillArrayPersons(names, surnames, persons);
        printArrayPersons(persons);

    }

    private static void printArrayPersons(Person[] persons) {
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }
    }

    private static void fillArrayPersons(String[] names, String[] surnames, Person[] persons) {
        for (Person person : persons) {
            person.name = names[(int) (random() * names.length)];
            person.surname = surnames[(int) (random() * surnames.length)];
            person.age = person.getAge();
            person.weight = person.getWeight(person.age);
            person.height = person.getHeight(person.weight);
        }
    }

    private static void getArrayPersons(String name, String surname, Person[] persons) {
        for (int i = 0; i < persons.length; i++) {
            persons[i] = new Person(name, surname);
        }
    }



}
