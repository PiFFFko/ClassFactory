package org.example;

public class Cat implements Animal {


    @Override
    public String getAnimal() {
        return "Cat";
    }

    @Override
    public String makeSound() {
        return "Meow!";
    }

    @Override
    public String toPet() {
        return "Pur-r-r-r-r!";
    }


}
