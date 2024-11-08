package com.pluralsight;


import static com.pluralsight.GlobalMethods.ans;

public class HomeScreen {
    public static void main(String[] args) {
        System.out.println("Welcome to our SammyShop\n");

        String option = ans("Please select one of the following options below\n" +
                "( 1 ) - Create New Order\n" +
                "( 2 ) - Exit Application\n");

    }
}
