package com.pluralsight.Menu;

import com.pluralsight.Items.Sandwich;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.pluralsight.GlobalMethods.ans;
import static com.pluralsight.SandwhichMaterials.Toppings.premiumToppings;
import static com.pluralsight.SandwhichMaterials.Toppings.regularToppings;
import static com.pluralsight.Screens.OrderScreen.order;


public class Custom extends Sandwich {
    public static List<String> top = new ArrayList<>();

    public Custom(String bread, boolean isToasted, int size, List<String> regularTopping, List<String> premiumTopping, List<String> cheese) {
        super(bread, isToasted, size, regularTopping, premiumTopping, cheese);
    }

    public static Sandwich addCustom(int sam) throws IOException {

        switch (sam){
            case 1:
                top.addAll(List.of("Lettuce","Tomatoes","Ranch"));
                aorTop();
                return new Custom("White", true, 8,top,List.of("Bacon"),List.of("Cheddar"));
            case 2:
                top.addAll(List.of("Peppers", "Mayo"));
                aorTop();
                return new Custom("White", true, 8,top,List.of("Steak"),List.of("American Cheese"));
        }

        return new Custom("White", true, 8,top,List.of("Bacon"),List.of("Cheddar"));
    }


    public static void addTopping() throws IOException {
        regularToppings(top);
    }

    public static void removeTopping(){
        if(top.isEmpty()){
            System.out.println("There are no toppings to remove.");
            return;
        }
        loop: while (true) {
            System.out.println("\nWhich topping would you like to remove ?\n");
            for (String t : top) {
                System.out.println("( " + (top.indexOf(t) + 1) + " ) - " + t);
            }
            System.out.println("( 99 )- Exit\n");
            int ans = ans("Enter here:\n");
            if(ans == 99){
               return;
            }
            try {
                top.remove((ans - 1));
                int done = ans("\nWould you like to remove another topping?\n" +
                        "( 1 ) - Yes\n" +
                        "( 2 ) - No\n" +
                        "( 99 )- Exit\n");
               switch (done) {
                   case 1:
                       break;
                   case 2:
                       break loop;
                   case 99:
                       order();
                       break loop;
                   default:
                       System.out.println("\nThat was not an option.\n");

               }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("\nThat is not a proper topping choice to remove.\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void aorTop() throws IOException {
        loop: while (true){
            int aor = ans("\nWould you like to add or remove any toppings? \n" +
                    "\n( 1 ) - Add Toppings\n" +
                    "( 2 ) - Remove Toppings\n" +
                    "( 3 ) - Done with toppings\n" +
                    "( 99 )- Exit\n");
            switch (aor){
                case 1:
                    addTopping();
                    break;
                case 2:
                    removeTopping();
                    break;
                case 3:
                    break loop;
                case 99 :
                    order();
                    break loop;
                default:
                    System.out.println("\nThat was not an option.\n");
            }
        }
    }

}
