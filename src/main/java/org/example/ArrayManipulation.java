package org.example;

import java.util.Scanner;

public class ArrayManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++)
        {
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        int max = Integer.MIN_VALUE; // Initialize max with the smallest possible integer value
        int min = Integer.MAX_VALUE; // Initialize min with the largest possible integer value

        for (int num : numbers) {
            sum += num;

            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }
        }

        double average = (double) sum / numbers.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}

