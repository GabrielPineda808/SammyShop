package com.pluralsight.adding;
import static com.pluralsight.Items.Orderable.orderables;
import com.pluralsight.Items.Drinks;
import com.pluralsight.Items.Orderable;
import com.pluralsight.Items.Sandwich;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.pluralsight.GlobalMethods.ans;
import static com.pluralsight.Screens.OrderScreen.order;

public class AddDrinks {

    public static void addDrinks() throws IOException {
        System.out.println("\nHere we will add your drinks :)\n");
        Drinks drink = new Drinks(drinkSize(),drinkName());

        orderables.add(drink);
        loop : while (true){
            System.out.println("\nWould you like to add another drink? \n");
            int choice = ans("( 1 ) - Yes\n" +
                    "( 2 ) - No\n");
            switch (choice){
                case 1:
                    System.out.println("Lets add another drink :) \n");
                    addDrinks();
                    break loop;
                case 2:
                    System.out.println("Back to the order screen :)\n");
                    order();
                    break loop;
                default:
                    System.out.println("That was not a proper option. Enter again :)\n");
            }
        }
    }

    public static String drinkSize() throws IOException {
       loop: while (true) {
            int drinkSize = ans("Select a drink size below \n" +
                    "\n( 1 ) - Small ( $2.00 )\n" +
                    "( 2 ) - Medium ( $ 2.50 )\n" +
                    "( 3 ) - Large ( $3.00 )\n" +
                    "( 99 ) - Exit");
            switch (drinkSize) {
                case 1:
                    return "Small";
                case 2:
                    return "Medium";
                case 3:
                    return "Large";
                case 99:
                    order();
                    break loop;
                default:
                    System.out.println("That was not a proper choice. Enter again :)\n");
            }
        }
        return "";
    }
    public static String drinkName() throws IOException {
        loop: while (true) {
            int drinkSize = ans("Select a drink below \n" +
                    "\n( 1 ) - Coke           ( 5 ) - Coffee\n" +
                    "( 2 ) - Sprite         ( 6 ) - Tea\n" +
                    "( 3 ) - Dr. Pepper     ( 0 ) - Water\n" +
                    "( 4 ) - Orange Juice   ( 99 )- Exit");
            switch (drinkSize) {
                case 1:
                    return "Coke";
                case 2:
                    return "Sprite";
                case 3:
                    return "Dr. Pepper";
                case 4:
                    return "Orange Juice";
                case 5:
                    return "Coffee";
                case 6:
                    return "Tea";
                case 0:
                    return "Water";
                case 99:
                    order();
                    break loop;
                default:
                    System.out.println("That was not a proper choice. Enter again :)\n");
            }
        }
        return "";
    }

}
