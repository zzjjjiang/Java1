package com.xpanxion.assignments.student;

//Ex. 9 Random Number Game
//        Write a Java program that generates a random number between 1 through 5.
//        The program prompts the user to guess the number. The program loops forever until the number is guessed.

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 0;
        int ans = (int)(Math.random() * 5);

        do {
            System.out.println("Enter a number: ");
            input = sc.nextInt();
            if(input == ans) {
                System.out.println("You guessed it!!!");
            } else {
                System.out.println("Try Again");
            }
        }
        while (input != ans);

    }
}
