package org.example;
//Prime Number Detection: Develop a program to determine whether a given number is prime or not.
//2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97

import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter a int: ");
        int num  = myObj.nextInt();
        boolean flag = false;

        for(int i = 2 ; i < num / 2 ; i++)
        {
            if(num % i == 0)
            {
                System.out.println("not a prime number");
                flag = true;
                break;
            }
        }

        if(!flag)
        {
            System.out.println("It is a prime number");
        }

    }




}
