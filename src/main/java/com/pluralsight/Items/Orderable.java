package com.pluralsight.Items;

import java.util.ArrayList;

public class Orderable {
    static double price;
    public static ArrayList<Orderable> orderables = new ArrayList<>();

    public double getPrice(){
        return price;
    };
    public String display(){return "";}

}
