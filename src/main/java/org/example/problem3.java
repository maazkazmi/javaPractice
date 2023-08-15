package org.example;

import java.util.Scanner;
// Write a program that prompts the user to input an
// integer and then outputs the number with the digits reversed.
// For example, if the input is 12345, the output should be 54321.
public class problem3
{
    public static void main(String[] args)
    {

      Scanner myObj = new Scanner(System.in);
      int number;

      System.out.println("enter number: ");
      number = myObj.nextInt(); // 2785

      int reverse = 0; // 0

      while(number != 0)
      {
          int digit = number % 10; // 5 8 7 2
          reverse = reverse * 10  + digit; // 5 58 587 5872
          number /= 10; // 278 27 2 0
      }

      System.out.print(reverse);

    }
}
