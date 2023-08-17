package org.example;

import java.util.Scanner;

public class TrianglePattern
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt();

        for(int i = 0; i < size ; i++)
        {
            for (int j = 0; j <= i; j ++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
