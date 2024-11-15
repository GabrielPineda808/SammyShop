package com.pluralsight.adding;

import com.pluralsight.Items.Orderable;
import com.pluralsight.Items.Sandwich;
import com.pluralsight.SandwhichMaterials.Toppings;

import java.io.IOException;
import java.util.ArrayList;

import static com.pluralsight.Items.Orderable.orderables;
import static com.pluralsight.SandwhichMaterials.Bread.bread;
import static com.pluralsight.GlobalMethods.ans;
import static com.pluralsight.Screens.MenuScreen.viewMenu;
import static com.pluralsight.Screens.OrderScreen.order;
import static com.pluralsight.SandwhichMaterials.Size.size;
import static com.pluralsight.SandwhichMaterials.Toppings.*;

public class AddSandwich  {
    public static void AddSammy() throws IOException {
        System.out.println("\nHey there! Lets go ahead and make that sandwich for you!\n");
        Sandwich sandwich = new Sandwich(bread(),size());


        sandwich.addPremiumToppings(premiumToppings());
        premiumToppings.clear();

        sandwich.addCheese(cheese());
        cheeses.clear();

        regularToppings(regularToppings);
        sandwich.addRegularToppings(regularToppings);
        regularToppings.clear();

        sandwich.toast();

        orderables.add(sandwich);

        loop : while (true){
            System.out.println("\nWould you like to add another sandwich? \n");
            int choice = ans("( 1 ) - Yes\n" +
                    "( 2 ) - No\n");
            switch (choice){
                case 1:
                    System.out.println("Time to make another sandwich :) \n");
                    regularToppings.clear();
                    premiumToppings.clear();
                    cheeses.clear();
                    viewMenu();
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
}
