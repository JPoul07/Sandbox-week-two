package org.example;


public class Main {
    public static void main(String[] args) {
        Animal[] farm = new Animal[10];
        farm[0] = new Dog("buddy");
        farm[1] = new Cow("Milk giver");
        farm[2] = new Dog("Beethoven");
        farm[3] = new Rat("Remi");
        farm[4] = new Goat("Osprey");
        farm[5] = new Goat("Lebron");

        for (Animal element : farm) {
            if (element == null) {
                break;
            }
            element.speak();
            int randomNum = (int) (Math.random() * 20);
            if (randomNum % 4 == 0) {
                element.run();
            } else if (randomNum % 3 == 0){
                element.bite();
            } else if (randomNum % 2 == 0){
                element.feed();
            }
        }
    }
}