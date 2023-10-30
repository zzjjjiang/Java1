package com.xpanxion.assignments.student;

import java.util.Scanner;

//Ex. 2 Count Uppers
//        Write a Java program that prompts the user to enter a string and counts the number of uppercase letters.
public class ex2 {
    public static void main(String[] args){
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a phrase");
        String input = sc.nextLine();
        for(int i = 0;i<input.length();i++) {
            if(Character.isUpperCase(input.charAt(i))) {
                count++;
            }
        }
        System.out.println("Number of uppercase letters: " + count);
    }
}
