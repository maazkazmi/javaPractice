package org.example;
import java.util.Scanner;
//n! = n * (n-1)*...*1
// Write a program to find the factorial value of any number entered through the keyboard.
public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not found.");
        } else {
            int factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("Factorial is:" + factorial);
        }

}}