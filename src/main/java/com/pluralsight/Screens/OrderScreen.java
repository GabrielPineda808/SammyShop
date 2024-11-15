package com.pluralsight.Screens;

import java.io.IOException;

import static com.pluralsight.Menu.Custom.top;
import static com.pluralsight.Screens.MenuScreen.viewMenu;
import static com.pluralsight.SandwhichMaterials.Toppings.*;
import static com.pluralsight.Screens.Checkout.checkout;
import static com.pluralsight.adding.AddChips.addChips;
import static com.pluralsight.adding.AddDrinks.addDrinks;
import static com.pluralsight.GlobalMethods.ans;

public class OrderScreen {
    public static void order() throws IOException {
        regularToppings.clear();
        premiumToppings.clear();
        cheeses.clear();
        loop : while (true) {
            int orderChoice = ans("\nHow may we help you today? Please select an option below :)\n" +
                    "\n( 1 ) - Add Sandwich\n" +
                    "( 2 ) - Add Drink\n" +
                    "( 3 ) - Add Chips\n" +
                    "( 4 ) - Checkout\n" +
                    "( 5 ) - Cancel Order\n");
            switch (orderChoice) {
                case 1:
                    viewMenu();
                    break loop;
                case 2:
                    addDrinks();
                    break loop;
                case 3:
                    addChips();
                    break loop;
                case 4:
                    checkout();
                    break loop;
                case 5:
                    Cancel.Cancel();
                    break loop;
                default:
                    System.out.println("\nThat is not a proper choice please enter again.");
            }
        }
    }
}
