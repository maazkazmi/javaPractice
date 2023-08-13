package org.example;

import java.util.Scanner;

public class GradingClassification {

    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        int grade;

        System.out.println  ("Enter your grade: ");
        grade = myObj.nextInt();

        if(grade >= 90 && grade <= 100)
        {
            System.out.println("you have an A");
        }
        else if (grade >= 80 && grade <90)
        {
            System.out.println("you have an B");
        }
        else if (grade >= 60 && grade < 70)
        {
            System.out.println("you have an D");
        }
        else if (grade >= 50 && grade < 60)
        {
            System.out.println("you have an F");
        }
        else if (grade < 50)
        {
            System.out.println("you have an F");
        }
    }

}
