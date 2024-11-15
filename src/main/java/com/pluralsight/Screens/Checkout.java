package com.pluralsight.Screens;

import com.pluralsight.Items.Chips;
import com.pluralsight.Items.Drinks;
import com.pluralsight.Items.Orderable;
import com.pluralsight.Items.Sandwich;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;

import static com.pluralsight.GlobalMethods.ans;
import static com.pluralsight.Items.Orderable.orderables;
import static com.pluralsight.Screens.HomeScreen.home;
import static com.pluralsight.Screens.OrderScreen.order;
import static com.pluralsight.Screens.Cancel.Cancel;

public class Checkout {
    static double total;
    public static void checkout() throws IOException {
        total = 0;
        System.out.println("\nLets make sure everything is right before we checkout :)\n" +
                "\nPlease read over your order and order cost before you proceed with checkout.\n");

        if(orderables.isEmpty()){
            System.out.println("\nThere is nothing here to checkout! Order before giving your money away ;)\n");
            order();
        }



        for(Orderable o: orderables){
            if( o instanceof Sandwich) {
                total += o.getPrice();
                System.out.println(o.display());
            } else if (o instanceof Drinks) {
                total += (o.getPrice());
                System.out.println(o.display());

            } else if ( o instanceof Chips){
                total += o.getPrice();
                System.out.println(o.display());
            }
        }
        System.out.printf("%-30s: $ %.2f\n" ,"Total",total);

        loop : while (true) {
            int out = ans("\nCheckout is almost complete! Please enter an option below\n" +
                    "\n( 1 ) - Complete Order and Checkout!\n" +
                    "( 2 ) - Order more!\n" +
                    "( 3 ) - Cancel order :(\n");

            switch (out) {
                case 1:
                    System.out.println("\n THANK YOU!\n");
                    Receipt();
                    break loop;
                case 2:
                    order();
                    break loop;
                case 3:
                    Cancel();
                    break loop;
            }
        }
    }

    public static void Receipt() throws IOException {

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        File file = new File("src\\main\\java\\com\\pluralsight\\Receipts", now.format(f) + ".txt" );
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        Formatter formatter = new Formatter();
        bw.write("Receipt for order on " + now +"\n");
        for(Orderable o: orderables){
            if( o instanceof Sandwich) {
                bw.write(o.display());
            } else if (o instanceof Drinks) {
                bw.write(o.display());

            } else if ( o instanceof Chips){
                bw.write(o.display());
            }
        }
        bw.write(String.valueOf(formatter.format("Total: $ %.2f\n" ,total)));
        bw.close();
        orderables.clear();
        home();
    }
}
