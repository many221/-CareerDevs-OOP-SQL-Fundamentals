package com.careerdevs.abstracttutorial;

interface DogInterface{
    void bark();
    void poop();
}

abstract class Dog{
    String breed;

    public void bark(){
        System.out.println ("Bark!");
    }

    public abstract void poop();
}

class Chihuahau extends Dog{

    @Override
    public void poop() {
        System.out.println ("Dog Pooped");
    }
}

public class AbstractTutorial {

    public static void main(String[] args) {

        Chihuahau d = new Chihuahau ();
        d.bark ();
        d.poop ();
    }
}
