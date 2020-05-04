package com.codegym;

public class Car {
    private String name;
    private String engine;
    public static int numberOfTheCar;
    public Car(String name, String engine){
        this.name = name;
        this.engine = engine;
        numberOfTheCar++;
    }

}
