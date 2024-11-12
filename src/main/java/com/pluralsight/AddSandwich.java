package com.pluralsight;

import static com.pluralsight.Bread.bread;
import static com.pluralsight.Size.size;
import static com.pluralsight.Toppings.*;

public class AddSandwich {
    public static void AddSammy(){
        System.out.println("\nHey there! Lets go ahead and make that sandwich for you!\n");

        Sandwich sandwich = new Sandwich(size(),bread());

        sandwich.addRegularToppings(regularToppings());
        sandwich.addPremiumToppings(premiumToppings());
        sandwich.addCheese(cheese());
        sandwich.toast();

    }
}
