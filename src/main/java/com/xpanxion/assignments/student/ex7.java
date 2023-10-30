package com.xpanxion.assignments.student;

import java.util.Scanner;

//
//Ex. 7 Full Calculator
//        Write a Java program that prompts the user for two Integers and an operation and returns the result.
public class ex7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter operation (add, subtract, multiply, divide)");
        // sc.nextLine();
        String ops = sc.next();
        int res = calc(num1, num2, ops);
        System.out.println("Result: "+ res);
    }

    private static int calc(int a, int b, String ops) {
        switch (ops) {
            case "add" -> {
                return a + b;
            }
            case "subtract" -> {
                return a - b;
            }
            case "multiply" -> {
                return a * b;
            }
            case "divide" -> {
                try {
                    return a / b;
                } catch (ArithmeticException e) {
                    System.out.println("Cannot divide by 0");
                }
            } default -> System.out.println("Invalid operation");
        }
        return 0;
    }
}
