package org.example;

import java.util.Scanner;

//Write a Java program to check if a vowel is present in a string.
public class Vowel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String a = scanner.nextLine();
        boolean flag = false;

        for(int i = 0; i < a.length(); i++)
        {
            char b = a.charAt(i);
            if( b == 'a' ||  b == 'e'||  b == 'i'|| b == 'o'|| b == 'u') {
                System.out.print("This contains a vowel ");
                flag = true;
                break;
            }
        }

        if(flag == false)
        {
            System.out.print("This doesn't contain any vowels");
        }

    }
}

