package com.milewskiarkadiuszmodul8.asmilewskiModul11;

import static com.milewskiarkadiuszmodul8.asmilewskiModul11.AnimalSize.BIG;

public class Dog extends Animal {

    private double barkVolume;
    private String breed;

    public Dog () {
        super(AnimalSize.BIG, 30);
        this.barkVolume = 5.5;
        this.breed = "Labrador";

    }

    // przeciążony konstruktor
    public Dog (double weight, double barkVolume, String breed) {
        super (getSizeFromWeight(weight), weight);
        this.barkVolume = barkVolume;
        this.breed = breed;
        weight = 30.00;

    }



    public static AnimalSize getSizeFromWeight(double weight) {
        if (weight <= 10) {
            return AnimalSize.SMALL;
        } else if (weight <= 25) {
            return AnimalSize.MEDIUM;
        } else {
            return AnimalSize.BIG;
        }
    }
    public void bark() {
        if (barkVolume < 3) {
            System.out.println("Cicho szczeka");
        } else if (barkVolume < 7) {
            System.out.println("Normalnie szczeka");
        } else {
            System.out.println("Głośno szczeka");
        }
    }
    public double getBarkVolume() {
        return barkVolume;
    }

    public void setBarkVolume(double barkVolume) {
        this.barkVolume = barkVolume;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void run() {
        System.out.println("Pies śmiga");
    }

    public void walk() {
        System.out.println("Pies spaceruje");
    }

    public void wagTail() {
        System.out.println("Pies merda ogonem");
    }


    //Przesłonięte metody
    @Override
    public void speak() {
        bark();
    }
    @Override
    public void makeMove(int speed) {
        if (speed <= 5) {
            walk();
            wagTail();
        } else {
            run();
            bark();
        }
        super.makeMove(speed);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "barkVolume=" + barkVolume +
                ", breed='" + breed + '\'' +
                "} " + super.toString();
    }
}
