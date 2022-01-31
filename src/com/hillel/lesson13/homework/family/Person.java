package com.hillel.lesson13.homework.family;

import static java.util.Objects.nonNull;

public class Person {
    String name;
    Person mother;
    Person father;

    public Person(String name) {
        this.name = name;
    }

    public Person setMother(Person mother) {
        this.mother = mother;
        return this;
    }

    public Person setFather(Person father) {
        this.father = father;
        return this;
    }
    public String toString() {
        String s = name + " - ";
        if (nonNull(mother)) {
            s += mother.name + "; ";
        }

        if (nonNull(father)) {
            s += father.name;
        }
        return s;
    }




}
