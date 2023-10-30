package com.xpanxion.assignments.student;

import java.util.Scanner;

//Write a Java program that calculates the total price for a carpet installation job.
//        The program prompts the user to enter the price of the carpet per square feet,
//        then prompts the user to enter the width and length of all the rooms.
//        When the user enters "done", the program returns the total price of the carpet installation job.
public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of carpet: ");
        double price = sc.nextInt();
        System.out.println("Enter the width of the rooms ");
        int width = sc.nextInt();
        System.out.println("Enter the length of the rooms ");
        int length = sc.nextInt();
        System.out.println("Total cost " + calc(price, width, length));

    }

    public static double calc(double price, int width, int length) {
        int floorSurface = width * length;
        return price * floorSurface;
    }
}
