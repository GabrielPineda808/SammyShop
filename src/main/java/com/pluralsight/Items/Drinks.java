package com.pluralsight.Items;

import java.util.Formatter;

public class Drinks extends Orderable {
    private double price;
    private String size;
    private String name;

    public Drinks(String size, String name) {
        this.size = size;
        this.name = name;
    }

    public double getPrice() {
        switch (size){
            case "Small":
                price += 2.00;
                break;
            case "Medium":
                price+= 2.50;
                break;
            default:
                price+= 3.00;
                break;
        }

        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String display(){
        StringBuilder newStr = new StringBuilder();
        Formatter formatter = new Formatter(newStr);
        formatter.format(size + " " + name + "    ----%.2f----\n", price);
        newStr.append("\n---------------------\n");
        return newStr.toString();
    }

    @Override
    public String toString() {
        return "Drinks{" +
                "price=" + price +
                ", size='" + size + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
