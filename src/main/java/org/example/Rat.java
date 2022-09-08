package org.example;

public class Rat implements Animal{
    @Override
    public String getAnimal() {
        return "Rat";
    }

    @Override
    public String makeSound() {
        return "Ps-ps-ps";
    }

    @Override
    public String toPet() {
        return "Cannot pet, just bite!";
    }
}
