package org.example;

public class Goat extends Animal{
    public Goat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("Goat " + name + " says: I'm the Goat. BAHHH!");
    }

    @Override
    public void run() {
        System.out.println("Your goat " + name + " is running away!!");
    }

    @Override
    public void bite() {
        System.out.println("Your goat " + name + " just bit you!!");
    }
}
