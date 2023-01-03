package com.xpanxion.assignments.stu0;

public class Repository implements DataAccess {

    @Override
    public Person getPerson() {
        return new Person(1, "John", "Doe");
    }
}
