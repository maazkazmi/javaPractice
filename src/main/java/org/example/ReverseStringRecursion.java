package org.example;

public class ReverseStringRecursion
{
    static void ReverseString(String originalStr)
    {
        String reversedStr = "";

        for (int i = 0; i < originalStr.length(); i++)
        {
            reversedStr = originalStr.charAt(i) + reversedStr;
        }

        System.out.println("Reversed string: "+ reversedStr);
    }
    public static void main(String[] args)
    {
        ReverseString("MAAZ");
    }
}
