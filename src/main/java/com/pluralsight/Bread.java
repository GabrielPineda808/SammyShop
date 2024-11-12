package com.pluralsight;

import static com.pluralsight.GlobalMethods.ans;

public class Bread {
    public static String bread(){
        int breadChoice = ans("What bread would you like today? Please enter below.\n" +
                "( 1 ) - White\n" +
                "( 2 ) - Wheat\n" +
                "( 3 ) - Rye\n" +
                "( 4 ) - Wrap\n");

        switch (breadChoice){
            case 1 :
                return "White";
            case 2 :
                return "Wheat";
            case 3 :
                return "Rye";
            case 4:
                return "Wrap";
            default:
                System.out.println("That was not a proper bread choice! Please enter again :)\n");
                bread();
        }


        return "";
    }
}
