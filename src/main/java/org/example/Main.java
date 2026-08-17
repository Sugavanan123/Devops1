package org.example;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println("     STUDENT MANAGEMENT SYSTEM");
        System.out.println("================================");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Register Number: ");
        String regNo = sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Mark 1: ");
        int mark1 = sc.nextInt();

        System.out.print("Enter Mark 2: ");
        int mark2 = sc.nextInt();

        System.out.print("Enter Mark 3: ");
        int mark3 = sc.nextInt();

        int total = mark1 + mark2 + mark3;
        double average = total / 3.0;

        String grade;

        if (average >= 90)
            grade = "A+";
        else if (average >= 80)
            grade = "A";
        else if (average >= 70)
            grade = "B";
        else if (average >= 60)
            grade = "C";
        else if (average >= 50)
            grade = "D";
        else
            grade = "F";

        System.out.println("\n================================");
        System.out.println("          STUDENT DETAILS");
        System.out.println("================================");

        System.out.println("Name       : " + name);
        System.out.println("Register No: " + regNo);
        System.out.println("Department : " + department);
        System.out.println("Total      : " + total);
        System.out.printf("Average    : %.2f%n", average);
        System.out.println("Grade      : " + grade);

        if (average >= 50)
            System.out.println("Status     : PASS");
        else
            System.out.println("Status     : FAIL");

        System.out.println("================================");
        System.out.println("Application Completed");
        System.out.println("================================");

        sc.close();
    }
}