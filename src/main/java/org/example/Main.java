package org.example;

import java.util.Scanner; // import the Scanner class

class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int grade;

        // Enter grade
        System.out.println  ("Enter your grade: ");
        grade = myObj.nextInt();
        if(grade >= 90 && grade <= 100) {System.out.println("you have an A");}
        else if (grade >= 80 && grade <90){System.out.println("you have an B");}
        else if (grade >= 70 && grade < 80 ) {System.out.println("you have an C");}
        else if (grade >= 60 && grade < 70) {System.out.println("you have an D");}
        else if (grade >= 50 && grade < 60){System.out.println("you have an F");}
        else if (grade < 50){System.out.println("you have an F");}
}}
