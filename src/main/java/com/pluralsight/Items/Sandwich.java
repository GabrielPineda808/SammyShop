package com.pluralsight;

import java.util.ArrayList;

import static com.pluralsight.GlobalMethods.ans;

public class Sandwich extends Orderable{
    private String bread;
    private boolean isToasted = false;
    private int size;
    private double price;
    ArrayList<String> regularTopping = new ArrayList<>();
    ArrayList<String> premiumTopping = new ArrayList<>();
    ArrayList<String> cheese = new ArrayList<>();

    public Sandwich(String bread,int size ) {
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

    public void toast() {
        int toasted = ans("\n Would like your sandwich toasted? \n" +
                "( 1 ) - Yes \n" +
                "( 2 ) - No \n");
        if(toasted == 1){
            isToasted= true;
        }else if( toasted != 2) {
            System.out.println("\nEnter a proper toasting options :)\n");
            toast();
        }

    }

    public double getPrice() {
        switch (this.size){
            case 4:
                this.price+= 5.50;
                if(!premiumTopping.isEmpty()){
                    this.price +=1.00 + ((premiumTopping.size() -1) * 0.50);
                }
                if(!cheese.isEmpty()){
                    this.price += 0.75 + ((cheese.size() -1) * 0.30);
                }
                break;
            case 8:
                this.price+= 7.00;
                if(!premiumTopping.isEmpty()){
                    this.price +=2.00+ ((premiumTopping.size())-1 * 1.00);
                }
                if(!cheese.isEmpty()){
                    this.price += 1.50 + ((cheese.size() -1) * 0.60);
                }
                break;
            case 12:
                if(!premiumTopping.isEmpty()){
                    this.price +=3.00+ ((premiumTopping.size()) -1 * 1.50);
                }
                if(!cheese.isEmpty()){
                    this.price += 2.25 + ((cheese.size() -1) * 0.90);
                }
                this.price+= 8.50;
                break;
        }
        return price;
    }

    public void addRegularToppings(ArrayList<String> toppings){
        regularTopping.addAll(toppings);
    }

    public void addPremiumToppings(ArrayList<String> toppings){
        premiumTopping.addAll(toppings);
    }

    public void addCheese(ArrayList<String> cheese){
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

    public void display(){

    }
}