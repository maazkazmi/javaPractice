package org.example;

import java.util.Scanner;

//How do you find the second-largest number in an array in Java?
public class secoundnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] a = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        int secoundlargest = Integer.MAX_VALUE;

        for (int h : a) {
            if (h > largest){
                secoundlargest = largest;
                largest = h;

            }
            else if (h > secoundlargest && h < largest)
            {
                secoundlargest = h;
            }
        }
        System.out.println(largest);
        System.out.println("This is the secound largest number "  +secoundlargest);

    }
}
