package com.test.app;

public class Car {

    private String name;

    private int yearOfMake;

    public Car(String name, int yearOfMake) {
        this.name = name;
        this.yearOfMake = yearOfMake;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfMake() {
        return yearOfMake;
    }

    public void setYearOfMake(int yearOfMake) {
        this.yearOfMake = yearOfMake;
    }
}
