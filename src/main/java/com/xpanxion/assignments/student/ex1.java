package com.xpanxion.assignments.student;

import java.util.Scanner;

//Ex. 1 Uppercase Name
//        Write a Java program that prompts the user to enter their name, and returns their name in upper case.
public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name");
        String input = sc.nextLine();
        System.out.println(input.toUpperCase());
    }
}
