package com.xpanxion.assignments.student;


import java.util.Scanner;

//Ex. 4 Classic Palidrome
//        A palidrome is a word, phrase, or sequence that reads the same backward as forward (e.g. radar, madam).
//
//        Write a Java program that tests if a word is a palidrome or not.
public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a word ");
        String input = sc.nextLine();
        System.out.println(isPalindrome(input) ? "Yes" : "No");

    }

    public static boolean isPalindrome(String word) {
        int start = 0;
        int end = word.length() - 1;
        while (start < end) {
            if(word.toUpperCase().charAt(start) != word.toUpperCase().charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
