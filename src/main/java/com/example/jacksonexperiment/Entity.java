package com.example.jacksonexperiment;

public class Entity {
    private int someField = 1;

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
