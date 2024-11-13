package com.pluralsight;

import java.util.ArrayList;

import static com.pluralsight.Bread.bread;
import static com.pluralsight.GlobalMethods.ans;
import static com.pluralsight.OrderScreen.order;
import static com.pluralsight.Size.size;
import static com.pluralsight.Toppings.*;

public class AddSandwich extends Orderable{
    static ArrayList<Sandwich> sandwiches = new ArrayList<>();
    public static void AddSammy(){
        System.out.println("\nHey there! Lets go ahead and make that sandwich for you!\n");

        Sandwich sandwich = new Sandwich(bread(),size());


        sandwich.addPremiumToppings(premiumToppings());
        sandwich.addCheese(cheese());
        sandwich.addRegularToppings(regularToppings());
        sandwich.addRegularToppings(sauces());
        sandwich.toast();

        sandwiches.add(sandwich);

        loop : while (true){
            System.out.println("\nWould you like to add another sandwich? \n");
            int choice = ans("( 1 ) - Yes\n" +
                    "( 2 ) - No\n");
            switch (choice){
                case 1:
                    System.out.println("Time to make another sandwich :) \n");
                    AddSammy();
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

    public static ArrayList<Sandwich> getSandwiches(){
        return sandwiches;
    }
}