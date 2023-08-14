package org.example;

public class Loops {

    public static void main(String[] args)
    {
        //Loops:
        //Loops can execute a block of code as long as a specified condition is reached.
        //Loops are handy because they save time, reduce errors, and they make code more readable.

        int i = 0;

        while(i  < 5)
        {
            System.out.println(i);
            i++;
        }

        System.out.println("\n");

        i = 0;

        do
        {
            System.out.println(i);
            i++;
        }
        while(i < 5);

        System.out.println("\n");

        for(int j = 0; j < 5 ; j++)
        {
            System.out.println(j);
        }
    }

}
