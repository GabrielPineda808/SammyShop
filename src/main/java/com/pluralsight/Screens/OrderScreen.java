package com.pluralsight.Screens;

import static com.pluralsight.Screens.Checkout.checkout;
import static com.pluralsight.adding.AddChips.addChips;
import static com.pluralsight.adding.AddDrinks.addDrinks;
import static com.pluralsight.adding.AddSandwich.AddSammy;
import static com.pluralsight.GlobalMethods.ans;

public class OrderScreen {
    public static void order(){

        System.out.println("\nHow may we help you today? Please select an option below :)\n" +
                "\n( 1 ) - Add Sandwich\n" +
                "( 2 ) - Add Drink\n" +
                "( 3 ) - Add Chips\n" +
                "( 4 ) - Checkout\n" +
                "( 5 ) - Cancel Order\n");
        int orderChoice = ans("Enter here: \n");
        switch (orderChoice){
            case 1:
                AddSammy();
                break;
            case 2:
                addDrinks();
                break;
            case 3:
                addChips();
                break;
            case 4:
                checkout();
                break;
            case 5:

                break;
            default:
                System.out.println("\nThat is not a proper choice please enter again.");
                order();
        }


    }
}