package com.pluralsight.Screens;

import java.io.IOException;

import static com.pluralsight.GlobalMethods.ans;
import static com.pluralsight.Menu.Custom.*;
import static com.pluralsight.Screens.OrderScreen.order;
import static com.pluralsight.adding.AddSandwich.AddSammy;

public class MenuScreen {

   public static void Menu() throws IOException {
       loop:while (true) {
           int subChoice = ans("\nHere is our current menu offerings :)\n" +
                   "\n( 1 ) - BLT - 8 inch toasted sub on white bread with Bacon, Cheddar, Lettuce, Tomatoes, and Ranch.\n" +
                   "( 2 ) - Philly Cheese Steak - 8 inch toasted sub on white bread with Steak, American Cheese, Peppers, and Mayo.\n" +
                   "( 99 )- Exit\n");

           switch (subChoice) {
               case 1:
                   addCustom(1);
                   order();
                   break loop;
               case 2:
                   addCustom(2);
                   order();
                   break loop;
               case 99:
                   order();
                   break loop;
               default:
                   System.out.println("That was not a proper choice. Try again :)");

           }
       }
   }

   public static void viewMenu() throws IOException {
       loop: while (true){
            int view = ans("\nWould you like to create a custom sandwich or view our menu?\n" +
                    "\n( 1 ) - Create custom\n" +
                    "( 2 ) - View Menu\n" +
                    "( 99 )- Exit\n");

            switch (view){
                case 1:
                    AddSammy();
                    break loop;
                case 2:
                    Menu();
                    break loop;
                case 99:
                    order();
                    break loop;
                default:
                    System.out.println("That was not a proper choice. Try again :)");
            }
       }
   }
}
