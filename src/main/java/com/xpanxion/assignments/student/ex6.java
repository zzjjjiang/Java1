package com.xpanxion.assignments.student;

import java.util.Scanner;

//Ex. 6 Add Only Calculator
//        Write a Java program that prompts the user for two Integers and adds them.
public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println(num1+num2);
    }
}
