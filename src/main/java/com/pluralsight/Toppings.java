package com.pluralsight;

import java.util.ArrayList;

import static com.pluralsight.GlobalMethods.ans;

public class Toppings {
    static ArrayList<String> regularToppings = new ArrayList<>();
    public static ArrayList<String> regularToppings(){
        loop: while (true){
            int topping = ans("What regularToppings would you like on your sandwich? \n" +
                    "( 1 ) - Lettuce      ( 6 ) - Cucumbers\n" +
                    "( 2 ) - Peppers      ( 7 ) - Pickles\n" +
                    "( 3 ) - Onions       ( 8 ) - Guacamole\n" +
                    "( 4 ) - Tomatoes     ( 9 ) - Mushrooms\n" +
                    "( 5 ) - Jalapenos    ( 0 ) - Done with Toppings\n");

            switch (topping){
                case 1:
                    regularToppings.add("Lettuce");
                    regularToppings();
                    break;
                case 2:
                    regularToppings.add("Peppers");
                    regularToppings();
                    break;
                case 3:
                    regularToppings.add("Onions");
                    regularToppings();
                    break;
                case 4:
                    regularToppings.add("Tomatoes");
                    regularToppings();
                    break;
                case 5:
                    regularToppings.add("Jalapenos");
                    regularToppings();
                    break;
                case 6:
                    regularToppings.add("Cucumbers");
                    regularToppings();
                    break;
                case 7:
                    regularToppings.add("Pickles");
                    regularToppings();
                    break;
                case 8:
                    regularToppings.add("Guacamole");
                    regularToppings();
                    break;
                case 9:
                    regularToppings.add("Mushrooms");
                    regularToppings();
                    break;
                case 0:
                    System.out.println("All regular regularToppings have been added.");
                    break loop;
                default:
                    System.out.println("That was not a proper regularToppings choice. Enter again :)");
                    regularToppings();
            }
        }

        return regularToppings;
    }
}
