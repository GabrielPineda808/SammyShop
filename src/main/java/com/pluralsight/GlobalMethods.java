package com.pluralsight;

import java.util.Scanner;

public class GlobalMethods {
    static Scanner s = new Scanner(System.in);
    public static String ans(String message){
        System.out.println(message);
        return s.nextLine();
    }
}
