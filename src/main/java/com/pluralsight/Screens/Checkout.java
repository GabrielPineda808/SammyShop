package com.pluralsight.Screens;

import com.pluralsight.Items.Chips;
import com.pluralsight.Items.Drinks;
import com.pluralsight.Items.Sandwich;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

import static com.pluralsight.GlobalMethods.ans;
import static com.pluralsight.Screens.OrderScreen.order;
import static com.pluralsight.Screens.Cancel.Cancel;
import static com.pluralsight.adding.AddChips.chips;
import static com.pluralsight.adding.AddDrinks.drinks;
import static com.pluralsight.adding.AddSandwich.sandwiches;

public class Checkout {
    static double total;
    public static void checkout() throws IOException {

        System.out.println("\nLets make sure everything is right before we checkout :)\n" +
                "\n Please read over your order and order cost before you proceed with checkout.\n");

        if(chips.isEmpty() && drinks.isEmpty() && sandwiches.isEmpty()){
            System.out.println("\nThere is nothing here to checkout! Order before giving your money away ;)\n");
            order();
        }

        for(Sandwich s: sandwiches){
            total += s.getPrice();
            System.out.println(s.display());

        }
        for (Drinks drink : drinks){
           total += drink.getPrice();
            drink.display();
        }
        for(Chips chip: chips){
            total += chip.getPrice();
            chip.display();
        }
        System.out.printf("Total: $ %.2f\n" ,total);

        int out = ans("Checkout is almost complete! Please enter an option below\n" +
                "( 1 ) - Complete Order and Checkout!\n" +
                "( 2 ) - Order more!\n" +
                "( 3 ) - Cancel order :(\n");

        switch (out){
            case 1:
                Receipt();
                break;
            case 2:
                order();
                break;
            case 3:
                Cancel();
                break;
        }
    }

    public static void Receipt() throws IOException {
        FileWriter fw = new FileWriter(LocalDate.now() + "-"+ LocalTime.now() +".txt");
        BufferedWriter bw = new BufferedWriter(fw);

        for(Sandwich s: sandwiches){
            bw.write(s.display());
        }
        for (Drinks drink : drinks){
            drink.display();
        }
        for(Chips chip: chips){
            total += chip.getPrice();
            chip.display();
        }
    }
}
