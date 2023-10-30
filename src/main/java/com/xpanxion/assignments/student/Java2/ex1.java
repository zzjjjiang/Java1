package com.xpanxion.assignments.student.Java2;

//import com.xpanxion.assignments.shared.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args){
        int counter = 1;
        ArrayList<Person> arr = new ArrayList<>();
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Person: " + counter + ", ");
            String input = sc.nextLine();
            if(input.toLowerCase().equals("done")) {
                break;
            } else if (input.split(" ").length == 2) {
                String[] str = input.split(" ");
                arr.add(new Person(counter, str[0], str[1]));
            } else {
                System.out.println("incorrect input");
            }
            counter++;
        }



        for (Person person : arr) {
            System.out.println(person.toString());
        }
    }
}
