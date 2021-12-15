package com.hillel.lesson4.homework;

public class Airplane {
    public static void main(String[] args) {

        String airplaneType1 = "Fighter";
        String airplaneType2 = "Embraer";
        String airplaneType3 = "Boeing";
        String model1 = "Cy-27";
        String model2 = "190";
        String model3 = "777-200 ER";
        int economyClassSeats2 = 160;
        int economyClassSeats3 = 200;
        int businessClassSeats3 = 104;

        printAirplaneInfo(airplaneType1, model1);
        printAirplaneInfo(airplaneType2, model2, economyClassSeats2);
        printAirplaneInfo(airplaneType3, model3, economyClassSeats3, businessClassSeats3);

    }

    public static void printAirplaneInfo(String airplaneType1, String model1) {
        System.out.println("Type airplane: " + airplaneType1 + ", Model: " + model1);

    }

    public static void printAirplaneInfo(String airplaneType2, String model2, int economyClassSeats2) {
        System.out.println("Type airplane: " + airplaneType2 + ", Model: " + model2 + ", Economy Class seats: " + economyClassSeats2);

    }

    public static void printAirplaneInfo(String airplaneType3, String model3, int economyClassSeats3, int businessClassSeats3) {
        System.out.println("Type airplane: " + airplaneType3 + ", Model: " + model3 + ", Economy Class seats: " + economyClassSeats3 + ", Business Class seats: " + businessClassSeats3);

    }
}
