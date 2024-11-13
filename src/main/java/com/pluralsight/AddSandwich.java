package com.pluralsight;

import static com.pluralsight.Bread.bread;
import static com.pluralsight.Size.size;
import static com.pluralsight.Toppings.*;

public class AddSandwich {
    public static void AddSammy(){
        System.out.println("\nHey there! Lets go ahead and make that sandwich for you!\n");

        Sandwich sandwich = new Sandwich(bread(),size());


        sandwich.addPremiumToppings(premiumToppings());
        sandwich.addCheese(cheese());
        sandwich.addRegularToppings(regularToppings());
        sandwich.addRegularToppings(sauces());
        sandwich.toast();

    }
}
