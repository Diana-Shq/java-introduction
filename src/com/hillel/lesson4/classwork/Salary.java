package com.hillel.lesson4.classwork;

public class Salary {
    public static void main(String[] args) {

        int employee1 = 3000;
        int employee2 = 4500;
        int employee3 = 5800;
        int month = 120;
        float tax = 0.05f;

        int salary1 = employee1 * month;
        int salary2 = employee2 * month;
        int salary3 = employee3 * month;

        System.out.println("Salary employee1 = " + salary1);
        System.out.println("Salary employee2 = " + salary2);
        System.out.println("Salary employee3 = " + salary3);

        float tax1 = salary1 * tax;
        float tax2 = salary2 * tax;
        float tax3 = salary3 * tax;

        float netselary1 = salary1 - tax1;
        float netselary2 = salary2 - tax2;
        float netselary3 = salary3 - tax3;

        System.out.println("Net salary 1 = " + netselary1);
        System.out.println("Net salary 2 = " + netselary2);
        System.out.println("Net salary 3 = " + netselary3);

        double average = (netselary1 + netselary2 + netselary3) / 3;

        System.out.println( "Average = " + average);







    }
}
