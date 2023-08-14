package org.example;

import java.util.Scanner;

public class NumberParity {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = myObj.nextInt();

        if (number % 2 == 0) {
            System.out.println("your  num is even");
        } else {
            System.out.println("your num is odd");
        }

        myObj.close();
    }
}