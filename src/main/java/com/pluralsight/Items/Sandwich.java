package com.pluralsight.Items;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

import static com.pluralsight.GlobalMethods.ans;
import static com.pluralsight.Screens.OrderScreen.order;

public class Sandwich extends Orderable {
    String bread;
    boolean isToasted = false;
    int size;
    double price;
    List<String> regularTopping = new ArrayList<>();
    List<String> premiumTopping = new ArrayList<>();
    List<String> cheese = new ArrayList<>();

    public Sandwich(String bread,int size ) {
        this.bread = bread;
        this.size = size;
    }

    public Sandwich(String bread, boolean isToasted, int size, List<String> regularTopping, List<String> premiumTopping, List<String> cheese) {
        this.bread = bread;
        this.isToasted = isToasted;
        this.size = size;
        this.regularTopping = regularTopping;
        this.premiumTopping = premiumTopping;
        this.cheese = cheese;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public void toast() throws IOException {
        loop: while(true) {
            int toasted = ans("\nWould like your sandwich toasted? \n" +
                    "\n( 1 ) - Yes \n" +
                    "( 2 ) - No \n" +
                    "( 99 )- Exit\n");
            if (toasted == 1) {
                isToasted = true;
                break;
            }else if(toasted == 99){
                order();
                break ;
            }else if (toasted == 2) {
                break;
            }else{
                System.out.println("\nEnter a proper toasting options :)\n");
            }
        }
    }

    @Override
    public double getPrice() {
        switch (this.size){
            case 4:
                this.price= 5.50;
                if(!premiumTopping.isEmpty()){
                    this.price +=1.00 + ((premiumTopping.size() -1) * 0.50);
                }
                if(!cheese.isEmpty()){
                    this.price += 0.75 + ((cheese.size() -1) * 0.30);
                }
                break;
            case 8:
                this.price= 7.00;
                if(!premiumTopping.isEmpty()){
                    this.price +=2.00+ ((premiumTopping.size())-1 * 1.00);
                }
                if(!cheese.isEmpty()){
                    this.price += 1.50 + ((cheese.size() -1) * 0.60);
                }
                break;
            case 12:
                this.price= 8.50;
                if(!premiumTopping.isEmpty()){
                    this.price +=3.00+ ((premiumTopping.size()) -1 * 1.50);
                }
                if(!cheese.isEmpty()){
                    this.price += 2.25 + ((cheese.size() -1) * 0.90);
                }

                break;
        }
        return price;
    }

    public void addRegularToppings(List<String> toppings){
        regularTopping.addAll(toppings);
    }

    public void addPremiumToppings(List<String> toppings){
        premiumTopping.addAll(toppings);
    }

    public void addCheese(List<String> cheese){
        this.cheese.addAll(cheese);
    }

    public void removeRegularToppings(String topping){
        for(String t : regularTopping){
            regularTopping.remove(topping);
        }
    }

    public void removePremiumToppings(String topping){
        for(String t : premiumTopping){
            premiumTopping.remove(topping);
        }
    }

    @Override
    public String display(){
        StringBuilder newStr = new StringBuilder();
        Formatter formatter = new Formatter(newStr);
        formatter.format("%-30s ----%.2f----\n",size + " inch Sandwich on " + bread ,price);
        if(isToasted){
            newStr.append("   Toasted\n");
        }
        if(!premiumTopping.isEmpty()){newStr.append("   Meat: \n");}
        for(String t : premiumTopping){
            if(!t.equals(" ")) {
                newStr.append("    -" + t + "\n");
            }
        }
        if(!cheese.isEmpty()){newStr.append("   Cheese: \n");}
        for(String c : cheese){
            if(!c.equals(" ")) {
                newStr.append("    -" + c + "\n");
            }
        }
        if(!regularTopping.isEmpty()){newStr.append("   Toppings and Sauce:\n");}
        for (String t : regularTopping){
            if(!t.equals(" ")) {
                newStr.append("    -" + t + "\n");
            }
        }

        newStr.append("\n---------------------\n");

        return newStr.toString();
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "bread='" + bread + '\'' +
                ", isToasted=" + isToasted +
                ", size=" + size +
                ", price=" + getPrice() +
                ", regularTopping=" + regularTopping +
                ", premiumTopping=" + premiumTopping +
                ", cheese=" + cheese +
                '}';
    }
}
