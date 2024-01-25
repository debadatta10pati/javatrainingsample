package com.test.app;

public class Cat {

    private String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void meow() {
        System.out.println("meow");
    }

    public void meow(int num) {
        for(int i =0;i<=num;i++) {
            System.out.println("meow");
        }
    }
}
