package org.example;

public class Break_Continue
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 10; i++)
        {
            if (i == 4)
            {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("\n");

        for (int i = 0; i < 10; i++) {
            if (i == 4)
            {
                break;
            }
            System.out.println(i);
        }
    }
}
