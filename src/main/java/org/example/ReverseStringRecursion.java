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

    static String ReverseStringRecursion(String str)
    {
        if(str.isEmpty())
        {
            return str;
        }
        else
        {
          return ReverseStringRecursion(str.substring(1)) + str.charAt(0);
        }
    }

    public static void main(String[] args)
    {
        System.out.println(ReverseStringRecursion("MAAZ"));
    }
}
