package com.pluralsight;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GlobalMethods {
    static Scanner s = new Scanner(System.in);
    public static Integer ans(String message){
        int n = -1;
        do {
            try {
                System.out.println(message);
                n = s.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nPlease enter a number option :)\n");
                s.nextLine();
            }
        }while (n==-1);
        return n;
    }
}
