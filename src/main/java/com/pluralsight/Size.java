package com.pluralsight;

import static com.pluralsight.GlobalMethods.ans;

public class Size {
    public static int size(){
        System.out.println("\n What size would you like your sandwich to be? Please enter an option below. \n");

        int size = ans("( 4 ) - 4 inch ($5.50)\n" +
                "( 8 ) - 8 inch ($7.00)\n" +
                "( 12 ) - 12 inch ($8.50)\n");

        switch (size){
            case 4:
                return 4;
            case 8:
                return 8;
            case 12:
                return 12;
        }

        return size;
    }
}
