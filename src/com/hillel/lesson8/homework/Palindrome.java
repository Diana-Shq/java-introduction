package com.hillel.lesson8.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;


public class Palindrome {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        String str = READER.readLine();
        String str2 = str.replaceAll("\\s", "");
        String[] palindrome = str2.split("");


        isPalindrome(palindrome);
    }

    public static boolean isPalindrome (String[] array) {
        boolean isTrue = true;
        int j = array.length - 1;
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i].equalsIgnoreCase(array[j])) {
                j--;
              isTrue = true;
            } else {
                isTrue = false;
            }

        }
        if (isTrue == true){
            System.out.println("It's palindrome ");
            return true;
        } else {
            System.out.println("It isn't palindrome");
            return false;
        }
    }
}



