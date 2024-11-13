package com.pluralsight.Screens;

import com.pluralsight.Items.Chips;
import com.pluralsight.Items.Drinks;
import com.pluralsight.Items.Sandwich;
import com.pluralsight.adding.AddChips;
import com.pluralsight.adding.AddDrinks;
import com.pluralsight.adding.AddSandwich;

public class Checkout {
    static double total;
    public static void checkout(){

        System.out.println("\nLets make sure everything is right before we checkout :)\n" +
                "\n Please read over your order and order cost before you proceed with checkout.\n");

        for(Sandwich s: AddSandwich.getSandwiches()){
            total += s.getPrice();
            System.out.println(s.toString());
        }
        for (Drinks drink : AddDrinks.getDrinks()){
           total += drink.getPrice();
            System.out.println(drink.toString());
        }
        for(Chips chip: AddChips.getChips()){
            total += chip.getPrice();
            System.out.println(chip.toString());
        }
    }
}