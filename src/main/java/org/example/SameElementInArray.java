package org.example;

public class SameElementInArray {
    public static void main(String[] args) {

        int[] a = {10, 30, 11, 50};
        int[] b = {10, 30, 11, 50};
        boolean flag = true;

        if (a.length == b.length)
        {
            for(int i = 0; i < a.length; i ++)
            {
                if(a[i] != b[i])
                {
                    System.out.println("Arrays are not equal");
                    flag = false;
                    break;
                }
            }

            if (flag)
            {
                System.out.println("Arrays are equal");
            }
        }
        else
        {
            System.out.println("Arrays are not equal");
        }
    }
}
