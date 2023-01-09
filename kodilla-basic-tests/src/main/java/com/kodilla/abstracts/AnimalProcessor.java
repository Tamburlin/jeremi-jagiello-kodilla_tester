package com.kodilla.abstracts;

public class AnimalProcessor {

    public void process(Animal animal) {
        System.out.println("Animal has" + animal.getNumberOfLegs() + "legs.");
        animal.giveVoice();
    }

    public static void main(String[] args) {
        Animal dog = new Dog();

        AnimalProcessor processor = new AnimalProcessor();
        processor.process(dog);
    }
}

