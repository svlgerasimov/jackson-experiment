package com.example.jacksonexperiment;

public class Entity {
    private int someField = 1;

    public Entity() {
        System.out.println("Constructor without args");
        this.someField = 3;
    }

    public Entity(int someField) {
        this.someField = someField;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "someField=" + someField +
                '}';
    }

//    public void setSomeField(int someField) {
//        System.out.println("Getter for field");
//        this.someField = someField;
//    }
}
