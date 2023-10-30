package com.xpanxion.assignments.student.Java2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ex7 {
    public static void main(String[] args) {
        var personList = Arrays.asList(
                new Person(1, "Peter", "Jones"),
                new Person(2, "John", "Smith"),
                new Person(3, "Sue", "Anderson")
        );

        var people = personList.stream().map(a -> new Person(a.getId(), a.getFirstName(), "xxx")).collect((Collectors.toList()));

        for (Person p : people) {
            System.out.println(p);
        }
    }
}
