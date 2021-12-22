package com.hillel.lesson6.homework;

import java.io.IOException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        double n1 = scanner.nextDouble();
        System.out.print("Enter operation: ");
        char operation = scanner.next().charAt(0);
        System.out.print("Enter number 2: ");
        double n2 = scanner.nextDouble();
        calculator(n1, operation, n2);
    }

    public static void calculator(double n1, char operation, double n2) {
        double result;
        switch (operation) {
            case '+':
                result = n1 + n2;
                message(result);
                break;
            case '-':
                result = n1 - n2;
                message(result);
                break;
            case '/':
                if (n2 == 0) {
                    System.out.println("Division by 0 is not possible! ");
                } else {
                    result = n1 / n2;
                    message(result);
                }
                break;
            case '*':
                result = n1 * n2;
                message(result);
                break;
            case '%':
                result = n1 % n2;
                message(result);
                break;
            default:
                System.out.println("Operation not recognized. Try again");

        }
    }

    public static void message(double message) {
        System.out.println("Result: " + message);
    }
}
