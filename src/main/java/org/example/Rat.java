package org.example;

public class Rat extends Animal {
    public Rat(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println("Rat " + name + " says: Lemme make some food yo!");
    }

    @Override
    public void run() {
        System.out.println("Your rat " + name + " is running away!!");
    }
//
//    @Override
//    public void bite() {
//        System.out.println("Your rat " + name + " just bit you!!");
//    }
}
