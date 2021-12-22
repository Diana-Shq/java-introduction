package com.hillel.lesson7.classwork;

import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoWhile {


    public static void main(String[] args) throws IOException {

        int i = 10;

        do {
            System.out.println("Left before the bomb explosion " + i);
                        i--;
            if (i == 5) {
                System.out.println("Bomb defused");
                break;
            } else if (i == 0) {
                System.out.println("Boom");
            }
        } while (i > 0);

    }
}
