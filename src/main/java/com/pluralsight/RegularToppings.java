package com.pluralsight;

import java.util.ArrayList;

import static com.pluralsight.GlobalMethods.ans;

public class RegularToppings {
    static ArrayList<String> toppings = new ArrayList<>();
    public static ArrayList<String> regularToppings(){
        loop: while (true){
            int topping = ans("What toppings would you like on your sandwich? \n" +
                    "( 1 ) - Lettuce      ( 6 ) - Cucumbers\n" +
                    "( 2 ) - Peppers      ( 7 ) - Pickles\n" +
                    "( 3 ) - Onions       ( 8 ) - Guacamole\n" +
                    "( 4 ) - Tomatoes     ( 9 ) - Mushrooms\n" +
                    "( 5 ) - Jalapenos    ( 0 ) - Done with Toppings\n");

            switch (topping){
                case 1:
                    toppings.add("Lettuce");
                    regularToppings();
                    break;
                case 2:
                    toppings.add("Peppers");
                    regularToppings();
                    break;
                case 3:
                    toppings.add("Onions");
                    regularToppings();
                    break;
                case 4:
                    toppings.add("Tomatoes");
                    regularToppings();
                    break;
                case 5:
                    toppings.add("Jalapenos");
                    regularToppings();
                    break;
                case 6:
                    toppings.add("Cucumbers");
                    regularToppings();
                    break;
                case 7:
                    toppings.add("Pickles");
                    regularToppings();
                    break;
                case 8:
                    toppings.add("Guacamole");
                    regularToppings();
                    break;
                case 9:
                    toppings.add("Mushrooms");
                    regularToppings();
                    break;
                case 0:
                    System.out.println("All regular toppings have been added.");
                    break loop;
                default:
                    System.out.println("That was not a proper toppings choice. Enter again :)");
                    regularToppings();
            }
        }

        return toppings;
    }
}
