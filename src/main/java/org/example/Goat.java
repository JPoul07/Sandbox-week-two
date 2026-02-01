package org.example;

public class Goat extends Animal{

public Goat(String name, int age){
    super(name, age);
}


@Override
    public void run() {
        System.out.println("Your goat " + name + " is running away!!");
    }
}
//
//    @Override
//    public void bite() {
//        System.out.println("Your goat " + name + " just bit you!!");
//    }
//}
