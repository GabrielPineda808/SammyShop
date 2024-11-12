package com.pluralsight;

import java.util.ArrayList;

import static com.pluralsight.GlobalMethods.ans;

public class Toppings {
    static ArrayList<String> regularToppings = new ArrayList<>();
    static ArrayList<String> premiumToppings = new ArrayList<>();
    static ArrayList<String> cheeses = new ArrayList<>();

    public static ArrayList<String> regularToppings(){
        System.out.println("\nPlease select your toppings below. They are free with your order!\n");
        loop: while (true) {
            int topping = ans("What toppings would you like on your sandwich? \n" +
                    "( 1 ) - Lettuce      ( 6 ) - Cucumbers\n" +
                    "( 2 ) - Peppers      ( 7 ) - Pickles\n" +
                    "( 3 ) - Onions       ( 8 ) - Guacamole\n" +
                    "( 4 ) - Tomatoes     ( 9 ) - Mushrooms\n" +
                    "( 5 ) - Jalapenos    ( 0 ) - Done with Toppings\n");

            switch (topping) {
                case 1:
                    regularToppings.add("Lettuce");
                    break;
                case 2:
                    regularToppings.add("Peppers");
                    break;
                case 3:
                    regularToppings.add("Onions");
                    break;
                case 4:
                    regularToppings.add("Tomatoes");
                    break;
                case 5:
                    regularToppings.add("Jalapenos");
                    break;
                case 6:
                    regularToppings.add("Cucumbers");
                    break;
                case 7:
                    regularToppings.add("Pickles");
                    break;
                case 8:
                    regularToppings.add("Guacamole");
                    break;
                case 9:
                    regularToppings.add("Mushrooms");
                    break;
                case 0:
                    System.out.println("All regular regularToppings have been added.");
                    break loop;
                default:
                    System.out.println("That was not a proper topping choice. Enter again :)");
            }
        }
        return regularToppings;
    }

    public static ArrayList<String> premiumToppings(){
        System.out.println("\nPlease select your premium toppings below. They do come at an additional cost.\n" +
                "Pricing - 4 inch( $1.00 / $0.50 per extra ) - 8 inch( $2.00 / $1.00 per extra )- 8 inch( $3.00 / $1.50 per extra )\n");

        loop: while (true){
            int topping = ans("What regularToppings would you like on your sandwich? \n" +
                    "( 1 ) - Steak      ( 6 ) - Bacon\n" +
                    "( 2 ) - Ham        ( 0 ) - Done with Toppings\n" +
                    "( 3 ) - Salami\n" +
                    "( 4 ) - Roast Beef\n" +
                    "( 5 ) - Chicken\n");

            switch (topping){
                case 1:
                    premiumToppings.add("Steak");
                    break;
                case 2:
                    premiumToppings.add("Ham");
                    break;
                case 3:
                    premiumToppings.add("Salami");
                    break;
                case 4:
                    premiumToppings.add("Roast Beef");
                    break;
                case 5:
                    premiumToppings.add("Chicken");
                    break;
                case 6:
                    premiumToppings.add("Bacon");
                    break;
                case 0:
                    System.out.println("All premium toppings have been added.");
                    break loop;
                default:
                    System.out.println("That was not a proper topping choice. Enter again :)");
            }
        }

        return premiumToppings;
    }

    public static ArrayList<String> cheese(){
        System.out.println("\nPlease select your cheese below. Cheese comes at an additional cost.\n" +
                "Pricing - 4 inch( $0.75 / $0.30 per extra ) - 8 inch( $1.50 / $0.60 per extra )- 8 inch( $2.25 / $0.90 per extra )\n");

        loop: while (true){
            int c = ans("What regularToppings would you like on your sandwich? \n" +
                    "( 1 ) - American\n" +
                    "( 2 ) - Provolone\n" +
                    "( 3 ) - Cheddar\n" +
                    "( 4 ) - Swiss\n" +
                    "( 0 ) - Done with Toppings\n");

            switch (c){
                case 1:
                    cheeses.add("American");
                    break;
                case 2:
                    cheeses.add("Provolone");
                    break;
                case 3:
                    cheeses.add("Cheddar");
                    break;
                case 4:
                    cheeses.add("Swiss");
                    break;
                case 0:
                    System.out.println("All cheese has been added.");
                    break loop;
                default:
                    System.out.println("That was not a proper cheese choice. Enter again :)");
            }
        }
        return cheeses;
    }
}
