package com.pluralsight.SandwhichMaterials;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.pluralsight.GlobalMethods.ans;
import static com.pluralsight.Screens.OrderScreen.order;

public class Toppings {
    public static List<String> regularToppings = new ArrayList<>();
    public static List<String> premiumToppings = new ArrayList<>();
    public static List<String> cheeses = new ArrayList<>();

    public static List<String> regularToppings() throws IOException {
        System.out.println("\nPlease select your toppings below. They are free with your order!\n");
        loop: while (true) {
            int topping = ans("What toppings would you like on your sandwich? \n" +
                    "\n( 1 ) - Lettuce      ( 6 ) - Cucumbers\n" +
                    "( 2 ) - Peppers      ( 7 ) - Pickles\n" +
                    "( 3 ) - Onions       ( 8 ) - Guacamole\n" +
                    "( 4 ) - Tomatoes     ( 9 ) - Mushrooms\n" +
                    "( 5 ) - Jalapenos    ( 0 ) - DONE WITH TOPPINGS\n" +
                    "( 99 ) - Exit\n");


            switch (topping) {
                case 1:
                    checkTopping(regularToppings,"Lettuce");
                    break;
                case 2:
                    checkTopping(regularToppings,"Peppers ");
                    break;
                case 3:
                    checkTopping(regularToppings,"Onions");
                    break;
                case 4:
                    checkTopping(regularToppings,"Tomatoes");
                    break;
                case 5:
                    checkTopping(regularToppings,"Jalapenos");
                    break;
                case 6:
                    checkTopping(regularToppings,"Cucumbers");
                    break;
                case 7:
                    checkTopping(regularToppings,"Pickles");
                    break;
                case 8:
                    checkTopping(regularToppings,"Guacamole");
                    break;
                case 9:
                    checkTopping(regularToppings,"Mushrooms");
                    break;
                case 0:
                    System.out.println("All toppings have been added.\n");
                    break loop;
                case 99:
                    order();
                    break loop;
                default:
                    System.out.println("That was not a proper topping choice. Enter again :)\n");
            }
        }

        System.out.println("\nPlease select any sauces or sides below. They are free with your order!\n");
        loop: while (true) {
            int topping = ans("What sauce or side would you like on your sandwich? \n" +
                    "\n( 1 ) - Mayo               ( 6 ) - Vinaigrette\n" +
                    "( 2 ) - Mustard            ( 7 ) - Au Jus\n" +
                    "( 3 ) - Ketchup            ( 8 ) - Sauce\n" +
                    "( 4 ) - Ranch              ( 0 ) - DONE WITH SAUCE\n" +
                    "( 5 ) - Thousand Islands   ( 99 )- Exit\n");

            switch (topping) {
                case 1:
                    checkTopping(regularToppings,"Mayo");
                    break;
                case 2:
                    checkTopping(regularToppings,"Mustard");
                    break;
                case 3:
                    checkTopping(regularToppings,"Ketchup");
                    break;
                case 4:
                    checkTopping(regularToppings,"Ranch");
                    break;
                case 5:
                    checkTopping(regularToppings,"Thousand Islands");
                    break;
                case 6:
                    checkTopping(regularToppings,"Vinaigrette");
                    break;
                case 7:
                    checkTopping(regularToppings,"Side of Au jus");
                    break;
                case 8:
                    checkTopping(regularToppings,"Side of Sauce");
                    break;
                case 0:
                    System.out.println("\nAll sauces have been added.");
                    break loop;
                case 99:
                    order();
                    break loop;
                default:
                    System.out.println("\nThat was not a proper choice. Enter again :)");
            }
        }
        return regularToppings;
    }

    public static List<String> premiumToppings() throws IOException {
        System.out.println("\nPlease select your meats below. They do come at an additional cost.\n" +
                "Pricing - 4 inch( $1.00 / $0.50 per extra ) - 8 inch( $2.00 / $1.00 per extra )- 8 inch( $3.00 / $1.50 per extra )\n");

        loop: while (true){
            int topping = ans("What meat would you like on your sandwich? \n" +
                    "\n( 1 ) - Steak      ( 6 ) - Bacon\n" +
                    "( 2 ) - Ham        ( 0 ) - DONE WITH MEAT\n" +
                    "( 3 ) - Salami     ( 99 )- Exit\n" +
                    "( 4 ) - Roast Beef\n" +
                    "( 5 ) - Chicken\n");

            switch (topping){
                case 1:
                    checkTopping(premiumToppings,"Steak");
                    break;
                case 2:
                    checkTopping(premiumToppings,"Ham");
                    break;
                case 3:
                    checkTopping(premiumToppings,"Salami");
                    break;
                case 4:
                    checkTopping(premiumToppings,"Roast Beef");
                    break;
                case 5:
                    checkTopping(premiumToppings,"Chicken");
                    break;
                case 6:
                    checkTopping(premiumToppings,"Bacon");
                    break;
                case 0:
                    System.out.println("All meat has been added.");
                    break loop;
                case 99:
                    order();
                    break loop;
                default:
                    System.out.println("\nThat was not a proper meat choice. Enter again :)\n");
            }
        }

        return premiumToppings;
    }

    public static List<String> cheese() throws IOException {
        System.out.println("\nPlease select your cheese below. Cheese comes at an additional cost.\n" +
                "Pricing - 4 inch( $0.75 / $0.30 per extra ) - 8 inch( $1.50 / $0.60 per extra )- 8 inch( $2.25 / $0.90 per extra )\n");

        loop: while (true){
            int c = ans("What cheese would you like on your sandwich? \n" +
                    "\n( 1 ) - American\n" +
                    "( 2 ) - Provolone\n" +
                    "( 3 ) - Cheddar\n" +
                    "( 4 ) - Swiss\n" +
                    "( 0 ) - DONE WITH CHEESE\n" +
                    "( 99 )- Exit\n");

            switch (c){
                case 1:
                    checkTopping(cheeses,"American");
                    break;
                case 2:
                    checkTopping(cheeses,"Provolone");
                    break;
                case 3:
                    checkTopping(cheeses,"Cheddar");
                    break;
                case 4:
                    checkTopping(cheeses,"Swiss");
                    break;
                case 0:
                    System.out.println("All cheese has been added.");
                    break loop;
                case 99:
                    order();
                    break loop;
                default:
                    System.out.println("\nThat was not a proper cheese choice. Enter again :)\n");
            }
        }
        return cheeses;
    }

    public static void checkTopping (List<String> list, String topping){
        if(!list.contains(topping)){
            list.add(topping);
        }else {
            list.set(list.indexOf(topping), topping + " (Extra)" );
        }
    }
}
