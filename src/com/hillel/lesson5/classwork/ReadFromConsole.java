package com.hillel.lesson5.classwork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFromConsole {

    public static void main(String[] args) throws IOException {

        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));

        String str = reader.readLine();
        System.out.println("as string: " + str);


        Integer d = Integer.parseInt(str);
        System.out.println("as Integer: " + d);

        int i = Integer.parseInt(str);
        System.out.println("as int: " + i);
    }
}