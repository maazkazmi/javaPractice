package org.example;

public class Array
{
    public static void main(String[] args)
    {
        int i = 0;

        int[] b = {1,2,3,4,5}; // initialize array

        System.out.println(b[0]); // printing value of array at index 0

        b[0] = 11; // change value of array at index 0

        System.out.println(b.length + "/n"); // get the length of array

        // printing whole array

        while(i < 5)
        {
            System.out.println(b[i]);
            i++;
        }

    }
}
