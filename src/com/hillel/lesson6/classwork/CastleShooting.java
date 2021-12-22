package com.hillel.lesson6.classwork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CastleShooting {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input core: ");
        int core = scanner.nextInt();
        int start = 1000;
        int end = 1500;

        if (((core < 1000) || (core > 1500)) || ((core > 1000) && (core < 1500))){
            System.out.println("Not");
        } else {
            System.out.println("Yes");
        }
    }
}
