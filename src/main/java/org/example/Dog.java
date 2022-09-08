package org.example;

public class Dog implements Animal{
    @Override
    public String getAnimal() {
        return "Dog";
    }

    @Override
    public String makeSound() {
        return "Woof-Woof!";
    }

    @Override
    public String toPet() {
        return "Kaifofo";
    }
}
