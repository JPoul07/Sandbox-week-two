package org.example;

import java.util.Scanner;

public class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void run(){
        System.out.println(name + " just ran away");
    }


    public void speak() {
        System.out.println("Animal makes a sound!!");
    }

    public void pet() {
        System.out.println(name + " just got pet!!");
    }

    public void rename() {
        Scanner rename = new Scanner(System.in);
        System.out.println("What do you wish to rename your animal to?");
        this.name = rename.nextLine();

        System.out.println("Perfect!! Your animal's new name is " + name);
    }

    public void displayName() {
        System.out.println("Your animal's name is " + name);
    }

    public void checkAge(){
        System.out.println("Your animal is " + age);
    }

    public void changeAge(){
        System.out.println("Your animal's  current age is " + age);

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your animal's new age?");
        this.age = scan.nextInt();

        System.out.println("Perfect!! " + name + "'s new age is " + age);
    }

    public void feed() {
        System.out.println("You just fed " + name);
    }
}
