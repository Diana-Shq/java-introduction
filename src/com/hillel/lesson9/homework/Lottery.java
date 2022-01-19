package com.hillel.lesson9.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.util.Arrays.sort;

public class Lottery {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int size = 7;
        int min = 0;
        int max = 9;

        int[] lotteryTickets = getArrays(size);
        int[] players = getArrays(size);

        fillTickets(min, max, lotteryTickets);
        fillPlayersTicket(players);


        sort(lotteryTickets);
        sort(players);

        System.out.println(Arrays.toString(lotteryTickets));
        System.out.println(Arrays.toString(players));

        matching(lotteryTickets, players);



    }


    private static void matching(int[] lotteryTickets, int[] players) {
        int counter = 0;
        for (int i = 0; i < lotteryTickets.length; i++) {
            if (lotteryTickets[i] == players[i]) {
                counter++;
            }
        }
        System.out.println("Amount of match: " + counter);
    }

    private static void fillPlayersTicket(int[] players) throws IOException {
        try {
            for (int i = 0; i < players.length; i++) {
                System.out.println("Input " + i + " numbers from 0 to 9: ");
                players[i] = Integer.parseInt(READER.readLine());
            }
        } catch (Exception exception) {
            System.out.println("Error " + exception.getMessage());
            fillPlayersTicket(players);
        }
    }

    private static int[] getArrays(int size) {
        return new int[size];
    }

    private static void fillTickets(int min, int max, int[] lotteryTickets) {
        for (int i = 0; i < lotteryTickets.length; i++) {
            lotteryTickets[i] = (int) ((Math.random() * (max - min)) + min);
        }
    }

}
