package com.xpanxion.assignments.stu0;

public class Cat {

    //
    // Data members
    //

    private String name;

    //
    // Constructors
    //

    public Cat(String name) {
        this.name = name;
    }

    //
    // Accessors
    //

    public String getName() {
        return name;
    }

    //
    // Overrides
    //

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
