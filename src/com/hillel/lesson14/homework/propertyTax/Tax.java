package com.hillel.lesson14.homework.propertyTax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Tax {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));


    public static void main(String[] args) throws IOException {

        List<Realty> realties = new ArrayList<>();

        String input;

        inputType();

        while (!(input = READER.readLine()).equals("ok")) {
            realties.add(createRealty(input));
            inputType();
        }

        print(realties);



    }

    private static void inputType() {
        System.out.println("Input the type of property. Press \"ok\" after input");
    }



    private static Realty createRealty(String input) throws IOException {
        switch (input) {
            case "residential":
                System.out.println(
                    "Input the area of residential property. If there is a subsidy input it, otherwise input \"0\": ");
                Realty residential = new Residential(Double.parseDouble(READER.readLine()),
                    Double.parseDouble((READER.readLine())));
                return residential;
            case "commercial":
                System.out.println("Input the area of commercial property and revenue: ");
                Realty commercial = new Commercial(Double.parseDouble(READER.readLine()),
                    Integer.parseInt(READER.readLine()));
                return commercial;
            case "industrial":
                System.out.println("Input the area of industrial property: ");
                Realty industrial = new Industrial(Double.parseDouble(READER.readLine()));
                return industrial;

            default:
                System.out.println(
                    "The input property type not found. Please, chek the entered data!");
                return createRealty(input);
        }
    }

    private static void print(List<Realty> realties) {
        for (Realty realty : realties) {
            System.out.println(realty + " property tax amounted to UAH: " + realty.getTax());
        }
    }



}
