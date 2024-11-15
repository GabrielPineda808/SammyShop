package com.pluralsight.adding;
import static com.pluralsight.Items.Orderable.orderables;
import com.pluralsight.Items.Chips;
import com.pluralsight.Items.Orderable;
import com.pluralsight.Items.Sandwich;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.pluralsight.GlobalMethods.ans;
import static com.pluralsight.Screens.OrderScreen.order;

public class AddChips{
    public static void addChips() throws IOException {
        System.out.println("\nHere we will add your chips :) \n");

        Chips chip = new Chips(chipsName());

        orderables.add(chip);

        loop : while (true){
            System.out.println("\nWould you like to more chips? \n");
            int choice = ans("( 1 ) - Yes\n" +
                    "( 2 ) - No\n");
            switch (choice){
                case 1:
                    System.out.println("Lets add more chips :) \n");
                    addChips();
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

    public static String chipsName() throws IOException {
        loop: while (true) {
            int chipsName = ans("Select chips below: \n" +
                    "\n( 1 ) - Hot Cheetos        ( 4 ) - Fritos\n" +
                    "( 2 ) - Doritos            ( 5 ) - Lays\n" +
                    "( 3 ) - Hot Fries          ( 6 ) - Sun Chips\n" +
                    "( 99 ) - Exit\n");
            switch (chipsName) {
                case 1:
                    return "Hot Cheetos";
                case 2:
                    return "Doritos";
                case 3:
                    return "Hot Fries";
                case 4:
                    return "Fritos";
                case 5:
                    return "Lays";
                case 6:
                    return "Sun Chips";
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
