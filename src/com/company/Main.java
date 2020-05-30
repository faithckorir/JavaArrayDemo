package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.*;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student[] students = new Student[10];
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter the name of the student");
            students[i] = new Student(i, scanner.nextLine());
        }
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getRollNumber()+":"+students[i].getName());
        }


        scanner.close();
    }
}
