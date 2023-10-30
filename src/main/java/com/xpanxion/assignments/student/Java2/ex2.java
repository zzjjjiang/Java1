package com.xpanxion.assignments.student.Java2;

import java.util.HashMap;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Person> people = new HashMap<Integer, Person>();
        Person peter = new Person(1, "Peter", "Jones");
        Person john = new Person(2, "John", "Smith");
        Person mary = new Person(3, "Mary", "Jane");
        people.put(peter.getId(), peter);
        people.put(john.getId(), john);
        people.put(mary.getId(), mary);
        while (true) {
            System.out.println("Enter an id to look up person");
            String input = sc.next();
            if(input.toLowerCase().equals("done")){
                break;
            } else {
                int id = Integer.parseInt(input);
                System.out.println(people.get(id));
            }
        }
    }
}
