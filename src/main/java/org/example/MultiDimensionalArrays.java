package org.example;

import java.util.Scanner;

public class MultiDimensionalArrays
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int[][] myNumbers = new int[3][3];

        for(int i = 0; i < myNumbers.length; i++) // input 2D arrays
        {
            for (int j = 0; j < myNumbers.length ; j++)
            {
                myNumbers[i][j] = scan.nextInt();
            }
        }

        for (int[] myNumber : myNumbers) // print 2D arrays
        {
            for (int j = 0; j < myNumbers.length; j++) {
                System.out.println(myNumber[j]);
            }
        }

        scan.close();
    }
}
