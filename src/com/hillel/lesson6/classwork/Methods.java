package com.hillel.lesson6.classwork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Methods {

    public static void main(String[] args) throws IOException {

        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));

        String string1 = reader.readLine();
        String string2 = reader.readLine();
        String string3 = reader.readLine();
        String number = reader.readLine();

        pasteTogether(string1,string2);
        pasteTogether(string1,string2,string3);
        pasteTogether(string1,number);

    }

    public static void pasteTogether (String string1, String string2) {
        System.out.println(string1 + " " + string2);
    }

    public static void pasteTogether (String string1, String string2, String string3) {
        System.out.println(string1 + " " + string2 + " " + string3);
    }

    public static void pasteTogether (String string1, int number) {
        System.out.println(string1 + " " + number);
    }
}
