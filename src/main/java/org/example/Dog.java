package org.example;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("Dog " + name + " says: Woof!");
    }

    @Override
    public void run() {
        System.out.println("Your dog " + name + " is running away!!");
    }

    @Override
    public void bite() {
        System.out.println("Your dog " + name + " just bit you!!");
    }
}
