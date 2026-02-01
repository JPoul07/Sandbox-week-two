package org.example;

public class Cow extends Animal {
    public Cow(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println("Cow " + name + " says: Mooooo!");
    }

    @Override
    public void run() {
        System.out.println("Your cow " + name + " is running away!!");
    }
//
//    @Override
//    public void bite() {
//        System.out.println("Your cow " + name + " just bit you!!");
//    }
}
