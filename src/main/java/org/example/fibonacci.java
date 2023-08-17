package org.example;

import java.util.Scanner;
// 0 1 1 2 3 5 8 13 21

public class fibonacci {
    public static void main(String[] args) {
        int f1 = 0;
        int f2 = 1;
        int sum = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print(f1 + " " +f2);
//start from 2
        for(int i = 2;i< 10; i++)
        {
            sum =  f1 + f2;
            System.out.print(" " + sum);
            f1=f2;
            f2=sum;

        }


    }
}
