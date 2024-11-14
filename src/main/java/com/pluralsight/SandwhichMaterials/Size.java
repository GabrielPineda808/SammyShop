package com.pluralsight.SandwhichMaterials;

import java.io.IOException;

import static com.pluralsight.GlobalMethods.ans;
import static com.pluralsight.Screens.OrderScreen.order;

public class Size {
    public static int size() throws IOException {
        loop: while (true) {
            int size = ans(
                    "\n What size would you like your sandwich to be? Please enter an option below."+
                    "\n( 1 ) - 4 inch  ($5.50)\n" +
                    "( 2 ) - 8 inch ($7.00)\n" +
                    "( 3 ) - 12 inch  ($8.50)\n" +
                    "( 99 )- Exit\n");

            switch (size) {
                case 1:
                    return 4;
                case 2:
                    return 8;
                case 3:
                    return 12;
                case 99:
                    order();
                    break loop;
                default:
                    System.out.println("\nThat was not a proper size choice. Please enter again :)\n");
            }
        }
        return 0;
    }
}
