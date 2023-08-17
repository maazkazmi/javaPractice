package org.example;

import java.util.Scanner;

public class palindrome{
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter a string:  ");
        String palindrome = myObj.nextLine();
        int j = palindrome.length() - 1;
        boolean result = true;

        for(int i = 0; i < palindrome.length()/2 ; i++)
        {
            if(palindrome.charAt(i) != palindrome.charAt(j))
            {
                System.out.println("Not a palindrome");
                result = false;
                break;
            }
            j--;

        }

        if(result)
        {
            System.out.println("It is a palindrome");
        }

        }
    }
