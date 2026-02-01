package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animal[] farm = new Animal[10];
        farm[0] = new Dog("buddy", 7);
        farm[1] = new Cow("Milk giver", 10);
        farm[2] = new Dog("Beethoven", 6);
        farm[3] = new Rat("Remi", 2);
        farm[4] = new Goat("Osprey", 25);
        farm[5] = new Goat("Lebron", 52);

//        for (Animal element : farm) {
//            if (element == null) {
//                break;
//            }
//            element.speak();
//            int randomNum = (int) (Math.random() * 20);
//            if (randomNum % 4 == 0) {
//                element.run();
//            } else if (randomNum % 3 == 0){
//                element.bite();
//            } else if (randomNum % 2 == 0){
//                element.feed();
//            }
//        }
        String close = "no";
        do {
            Scanner inputScanner = new Scanner(System.in);
            System.out.println("What animal do you wish to interact with?");
            String input = inputScanner.nextLine();
            Animal chosenAnimal = farm[0];
            for (Animal element: farm) {
                if (element == null){
                    throw new IllegalArgumentException("Your animal  does not exist");
                } else if (element.name.equalsIgnoreCase(input)){
                    chosenAnimal = element;
                    break;
                }
            }

            System.out.println("What action do you want to do?");
            String action = inputScanner.nextLine();
            switch (action.toLowerCase()){
                case "feed":
                    chosenAnimal.feed();
                    break;
                case "speak":
                    chosenAnimal.speak();
                    break;
                case "rename":
                    chosenAnimal.rename();
                    break;
                case "show name":
                    chosenAnimal.displayName();
                    break;
                case "check age":
                    chosenAnimal.checkAge();
                    break;
                case "change age":
                    chosenAnimal.changeAge();
                    break;
                case "pet":
                    chosenAnimal.pet();
            }
            do {
                System.out.println("Do you want to go to another animal?");
                close = inputScanner.nextLine();
            } while (!close.equalsIgnoreCase("yes") && !close.equalsIgnoreCase("no"));
            int randomNum = (int) (Math.random() * 20);
            if (randomNum % 3 == 0) {
                chosenAnimal.run();
            }
        } while (close.equalsIgnoreCase("yes") );
    }
}