package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

import static com.pluralsight.GlobalMethods.ans;

public class AddDrinks {
    static List<Drinks> drinks = new ArrayList<>();
    public static void addDrinks(){
        System.out.println("\nHere we will add your drinks :)\n");
        Drinks drink = new Drinks(drinkSize(),drinkName());

        drinks.add(drink);
    }

    public static String drinkSize(){
        int drinkSize = ans("Select a drink size below \n" +
                "( 1 ) - Small ( $2.00 )\n" +
                "( 2 ) - Medium ( $ 2.50 )\n" +
                "( 3 ) - Large ( $3.00 )\n");
        switch (drinkSize){
            case 1:
                return "Small";
            case 2:
                return "Medium";
            case 3:
                return "Large";
            default:
                System.out.println("That was not a proper choice. Enter again :)\n");
        }
    }
}
