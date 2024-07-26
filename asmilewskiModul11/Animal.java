package com.milewskiarkadiuszmodul8.asmilewskiModul11;

enum AnimalSize {
    SMALL, MEDIUM, BIG
}
// Animal class
public class Animal {
    private AnimalSize size;
    private double weight;

    // Constructor
    public Animal(AnimalSize size, double weight) {
        this.size = size;
        this.weight = weight;
    }

    public Animal() {

    }

    public Animal(double weight) {
    }

    // Dodaję gettery i settery

    public AnimalSize getSize() {
        return size;
    }

    public void setSize(AnimalSize size) {
        this.size = size;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight ( double Weight) {
        this.weight = weight;
    }

    // METHODS
    public void speak () {
        System.out.println("Zwierzak wydaje dźwięk");
    }

    public void makeMove (int speed) {
        System.out.println(" Zwierze porusza się z prędkością " + speed );
    }

    @Override
    public String toString() {
        return "Animal{" +
                "size=" + size +
                ", weight=" + weight +
                '}';
    }


}