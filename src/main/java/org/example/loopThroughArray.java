package org.example;

import java.util.Scanner;

public class loopThroughArray
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        String[] cars = new String[5];

        for(int i = 0; i < cars.length ; i ++) // take input in loop
        {
            cars[i] = obj.nextLine();
        }

        for (String car : cars) // print loop
        {
            System.out.println(car);
        }

    }

}
