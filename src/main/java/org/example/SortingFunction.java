package org.example;

import java.util.Scanner;

public class SortingFunction
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[5]; // assign memory

        // TAKE INPUT FROM USER USING LOOP
        for (int i = 0; i < a.length; i++)
        {
            a[i] = scanner.nextInt();
        }

        // sort the array using func.
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a.length; j++)
            {
                int temp = 0;

                if(a[j] < a[i])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("\nSorted Array:");

        for (int b : a)
        {
            System.out.println(b);
        }





    }


}
