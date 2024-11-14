package com.pluralsight.Screens;

import com.pluralsight.Items.Sandwich;

import java.io.IOException;

import static com.pluralsight.GlobalMethods.ans;
import static com.pluralsight.Screens.HomeScreen.home;
import static com.pluralsight.Screens.OrderScreen.order;
import static com.pluralsight.adding.AddChips.chips;
import static com.pluralsight.adding.AddDrinks.drinks;
import static com.pluralsight.adding.AddSandwich.sandwiches;

public class Cancel {
    public static void Cancel() throws IOException {
        int cancel = ans("\nAre you sure you want to cancel the order? \n" +
                "( 1 ) - Yes\n" +
                "( 2 ) - No\n");

        switch (cancel){
            case 1:
                System.out.println("Cancelling order\n");
                sandwiches.clear();
                drinks.clear();
                chips.clear();
                home();
                break;
            case 2:
                System.out.println("Lets go ahead and order more !\n");
                order();
                break;
            default:
                System.out.println("That was not an option. Enter again.\n");

        }
    }
}
