package com.hillel.lesson7.classwork;

public class For {

    public static void main(String[] args) {

        for (int i = 100; i > 0; i--){
            System.out.println( "i = " + (i));
        }
        for (int i = 0; i < 100; i++){
            if (((i % 4) == 0) || ((i % 5) == 0)) {
                System.out.println( "i = " + i);
            }

        }
    }
}
