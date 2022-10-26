package com.example.jacksonexperiment;

import java.util.HashSet;
import java.util.Set;

public class Entity {
    private int someField = 1;
//    private final Set<Integer> integers = new HashSet<>();

//    public Entity() {
//        System.out.println("Constructor without args");
//        this.someField = 1;
//    }
//
//    public Entity(int someField) {
//        this.someField = someField;
//    }
//
//    public Entity(int someField, Set<Integer> integers) {
//        this.someField = someField;
//        this.integers = integers;
//    }

    @Override
    public String toString() {
        return "Entity{" +
                "someField=" + someField +
//                ", integers=" + integers +
                '}';
    }

//    public int getSomeField() {
//        return someField;
//    }

//    public void setSomeField(int someField) {
//        System.out.println("Getter for field");
//        this.someField = someField;
//    }
}
