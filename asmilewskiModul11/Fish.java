package com.milewskiarkadiuszmodul8.asmilewskiModul11;

public class Fish extends Animal {

   private int fins;

   public Fish (double weight, int fins ) {
       super(AnimalSize.SMALL, weight);
       this.fins = fins;
   }

    public int getFins() {
        return fins;
    }

    public void setFins(int fins) {
        this.fins = fins;
    }

    public void moveFins( int fins){
        System.out.println("Ryba rusza płetwami");
        System.out.println("Liczba płetw: " + fins);
    }
    @Override
    public void speak(){
        System.out.println("Ryba robi bul bul");
    }

    @Override
    public void makeMove(int speed ) {
       super.makeMove(speed);
       moveFins(speed);
    }

    @Override
    public String toString() {
        return "Fish{" +
                "fins=" + fins +
                "} " + super.toString();
    }
}
