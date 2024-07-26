package com.milewskiarkadiuszmodul8.asmilewskiModul11;

public class Zoo {
    private Animal[] animals;

    public Zoo( Animal[] animals) {
        this.animals = animals;
    }

    public void testAllAnimals() {
        for (Animal animal : animals) {
            animal.speak();
            animal.makeMove(10);
            System.out.println(animal.toString());
            System.out.println("-------------------------");
        }
    }
}
