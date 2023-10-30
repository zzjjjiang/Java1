package com.xpanxion.assignments.student;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String[] strArr = str.split(" ");
        for(String substr : strArr) {
            // System.out.println(substr);
            for(int i = 0; i<substr.length();i++) {
                for(int j = 0;j<i;j++) {
                    System.out.print(" ");
                }
                System.out.print(substr.charAt(i));
                System.out.println();
            }
        }

    }
}
