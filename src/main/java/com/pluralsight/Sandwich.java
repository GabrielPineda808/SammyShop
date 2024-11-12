package com.pluralsight;

import java.util.ArrayList;

public class Sandwich {
    private String bread;
    private boolean isToasted = false;
    private double price;
    ArrayList<String> regularTopping;
    ArrayList<String> premiumTopping;

    public Sandwich(String bread, boolean isToasted, double price) {
        this.bread = bread;
        this.isToasted = isToasted;
        this.price = price;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public boolean isToasted() {
        return isToasted;
    }

    public void setToasted(boolean toasted) {
        isToasted = toasted;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void addRegularToppings(ArrayList<String> toppings){
        for(String t : toppings){
            regularTopping.add(t);
        }
    }

    public void addPremiumToppings(ArrayList<String> toppings){
        for(String t : toppings){
            premiumTopping.add(t);
        }
    }

    public void removeRegulareToppings(String topping){
        for(String t : regularTopping){
            regularTopping.remove(topping);
        }
    }

    public void removePremiumToppings(String topping){
        for(String t : premiumTopping){
            premiumTopping.remove(topping);
        }
    }
}
