package com.pluralsight.Screens;


import java.io.IOException;

import static com.pluralsight.GlobalMethods.ans;
import static com.pluralsight.Screens.OrderScreen.order;
import static java.lang.System.exit;

public class HomeScreen {
    public static void home() throws IOException {
        System.out.println("Welcome to our SammyShop\n");

        loop: while (true) {
            int option = ans(
                    "Please select one of the following options below\n" +
                            "\n( 1 ) - Create New Order\n" +
                            "( 2 ) - Exit Application\n"
            );


            switch (option) {
                case 1:
                    order();
                    break loop;
                case 2:
                    System.out.println("Thank you for visiting SammyShop! Have a great day!\n");
                    exit(1);
                    break loop;
                default:
                    System.out.println("Unfortunately that was not a valid option. Try again.\n");

            }
        }
    }
}
