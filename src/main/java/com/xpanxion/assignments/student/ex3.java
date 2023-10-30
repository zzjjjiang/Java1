package com.xpanxion.assignments.student;

import java.util.Scanner;

//Ex. 3 Capitalize Words
//        Write a Java program that prompts the user to enter a string and
//        capitalizes every other word, starting with the first word.
//        HINT: The StringTokenizer object or String.split() method might be useful.
public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string ");
        String input = sc.nextLine();
        String[] arrs = input.split(" ");
        for(int i = 0;i<arrs.length;i++) {
            if(i%2 == 0) {
                arrs[i] = arrs[i].toUpperCase();
            }
        }
        System.out.println(String.join(" ", arrs));
    }
}
