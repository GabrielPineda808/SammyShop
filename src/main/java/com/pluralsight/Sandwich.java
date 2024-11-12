package com.pluralsight;

import java.util.ArrayList;

public class Sandwich {
    private String bread;
    private boolean isToasted = false;
    private int size;
    private double price;
    ArrayList<String> regularTopping;
    ArrayList<String> premiumTopping;

    public Sandwich(int size ,String bread) {
        this.bread = bread;
        this.size = size;
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

    public boolean isToasted() {
        return isToasted;
    }

    public void setToasted(boolean toasted) {
        isToasted = toasted;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice() {
        switch (this.size){
            case 4:
                this.price+= 5.50;
                if(!premiumTopping.isEmpty()){
                    this.price +=1.00 + (premiumTopping.size() -1 * .50);
                }
                break;
            case 8:
                this.price+= 7.00;
                if(!premiumTopping.isEmpty()){
                    this.price +=2.00+ (premiumTopping.size() -1 * 1.00);
                }
                break;
            case 12:
                if(!premiumTopping.isEmpty()){
                    this.price +=3.00+ (premiumTopping.size() -1 * 1.50);
                }
                this.price+= 8.50;
                break;
        }
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
