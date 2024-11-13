package com.pluralsight;

import java.util.ArrayList;

public class Drinks extends Orderable{
    private int price;
    private String size;
    private String name;

    public Drinks(int price, String size, String name) {
        this.price = price;
        this.size = size;
        this.name = name;
    }

    public int getPrice() {
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
}
