package org.example;

public class problem1 {
    //Write a program to calculate the sum of first 10 natural number.


    public static void main(String[] args) {
        int x = 10;
        int sum = 0;

        for ( int i = 1; i <= x; i++) {sum += i;}

        System.out.println(sum);
    }
}