package com.pluralsight.Items;

import java.util.Formatter;

public class Chips extends Orderable {
    private String name;
    private double price = 1.50;

    public Chips(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String display(){
        StringBuilder newStr = new StringBuilder();
        Formatter formatter = new Formatter(newStr);
        formatter.format(name + "     ----%.2f----\n",price);
        newStr.append("\n---------------------\n");
        return newStr.toString();
    }

    @Override
    public String toString() {
        return "Chips{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
