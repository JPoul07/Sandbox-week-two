package org.example;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("Animal makes a sound!!");
    }

    public void run() {
        System.out.println(name + " is running away!!");
    }

    public void bite() {
        System.out.println(name + " bit you");
    }

    public void feed() {
        System.out.println("You just fed " + name);
    }
}
