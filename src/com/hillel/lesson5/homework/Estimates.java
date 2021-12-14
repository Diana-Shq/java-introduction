package com.hillel.lesson5.homework;

import java.util.Scanner;

public class Estimates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSubject = 5;
        System.out.println("Input 5 your estimates: ");
        int subject1 = scanner.nextInt();
        int subject2 = scanner.nextInt();
        int subject3 = scanner.nextInt();
        int subject4 = scanner.nextInt();
        int subject5 = scanner.nextInt();

        float averageScore = printAverageScore(subject1, subject2, subject3, subject4, subject5, numberOfSubject);

        if (averageScore > 12 || averageScore < 0){
            System.out.println("Incorrect estimates introduced !!!");
        } else if (averageScore >= 10 ){
            System.out.println("Your average score: " + averageScore);
            System.out.println("You are applying for an increased scholarship");
        } else if(averageScore >= 8 ){
            System.out.println("Your average score: " + averageScore);
            System.out.println("You are applying for a scholarship regular");
        } else {
            System.out.println("Your average score: " + averageScore);
            System.out.println("You are not applying for a scholarship");
        }
    }
    public static float printAverageScore (int subject1, int subject2, int subject3, int subject4, int subject5, int numberOfSubject){
        return  (((float) subject1 + subject2 + subject3 + subject4 + subject5) / numberOfSubject);
    }
}
