package com.hillel.lesson11.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class PasswordGenerator {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int length = getLength();
        String upperCase = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String chr = "_%@";
        String password = "";

        System.out.println(getPassword(length, upperCase, lowerCase, chr, password));


    }

    private static int getLength() throws IOException {
        System.out.println("Input length password");
        int length = Integer.parseInt(READER.readLine());
        return length;
    }

    private static String getPassword(int size, String upperCase, String lowerCase, String chr,
        String password) {
        for (int i = 0; i < size; i++) {
            int random = (int) (Math.random() * 4);

            switch (random) {
                case 0:
                    password += String.valueOf((int) (Math.random() * 9));
                    break;
                case 1:
                    random = (int) (lowerCase.length() * Math.random());
                    password += String.valueOf(lowerCase.charAt(random));
                    break;
                case 2:
                    random = (int) (upperCase.length() * Math.random());
                    password += String.valueOf(upperCase.charAt(random));
                    break;
                case 3:
                    random = (int) (chr.length() * Math.random());
                    password += String.valueOf(chr.charAt(random));
                    break;
            }
        }
        return password;
    }



}
