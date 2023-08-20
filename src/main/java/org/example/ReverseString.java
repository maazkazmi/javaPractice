package org.example;

public class ReverseString
{
    // Reverse String: Develop a program that takes a string as input and outputs the reversed version of the string.

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
