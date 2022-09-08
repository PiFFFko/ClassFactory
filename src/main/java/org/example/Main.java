package org.example;

public class Main {
    public static void main(String[] args) {
    Animal animal = AnimalFactory.createAnimal("Dog");
    System.out.println(animal.makeSound());
    }
}