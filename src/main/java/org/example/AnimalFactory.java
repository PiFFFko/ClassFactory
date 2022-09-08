package org.example;

public class AnimalFactory {

    public static Animal createAnimal(String AnimalType){
        switch (AnimalType){
            case ("Dog"):
                return new Dog();
            case("Cat"):
                return new Cat();
            case("Rat"):
                return new Rat();
            default:
                return null;
        }
    }
}
