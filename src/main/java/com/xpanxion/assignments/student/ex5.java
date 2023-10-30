package com.xpanxion.assignments.student;

import java.util.Scanner;

public class ex5 {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a string to count vowels and consonants.");
       int vowelCount = 0;
       int consCount = 0;
       String str = sc.nextLine();
       str = str.replaceAll(" ", "");
       str = str.replaceAll("\\W", "");
//       System.out.println(str);
       for(char a : str.toCharArray()){
           if(isVowel(a)) {
               vowelCount++;
           } else {
               consCount++;
           }
       }
       System.out.println("Number of vowels: " + vowelCount);
       System.out.println(("Number of consonants: " + consCount));

   }

   private static boolean isVowel(char a) {
        return String.valueOf(a).toLowerCase().matches("[aeiou]");
   }
}
