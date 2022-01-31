package com.hillel.lesson13.homework.family;

public class Family {
    public static void main(String[] args) {
        Person dadGrandfather = new Person("Dad's grandfather");
        Person dadGrandmother = new Person("Dad's grandmother");
        Person momGrandfather = new Person("Mom's grandfather");
        Person momGrandmother = new Person("Mom's grandmother");
        Person mother = new Person("Mother").setMother(momGrandmother).setFather(momGrandfather);
        Person father = new Person("Father").setMother(dadGrandmother).setFather(dadGrandfather);
        Person son = new Person("Son").setMother(mother).setFather(father);

        System.out.println(son);
        System.out.println(mother);
        System.out.println(father);







    }


    }



