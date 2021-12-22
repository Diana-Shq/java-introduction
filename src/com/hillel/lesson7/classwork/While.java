package com.hillel.lesson7.classwork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class While {
    public static final BufferedReader READER =new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {


        String input = READER.readLine();

        String number = READER.readLine();
        int sum = 0;
        while (!input.equalsIgnoreCase("sum")) {
            sum += Integer.parseInt(input);
            input = READER.readLine();

        }
        System.out.println("sum: " + sum);
    }

}
