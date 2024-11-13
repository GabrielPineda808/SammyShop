package com.pluralsight.Items;

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

    @Override
    public String toString() {
        return "Chips{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
