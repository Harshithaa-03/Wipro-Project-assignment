package com.example;


interface Flyable {
    void fly();
}


abstract class Bird {
    public abstract void makeSound();
}


class Sparrow extends Bird implements Flyable {
    public void fly() {
        System.out.println("Sparrow is flying");
    }

    public void makeSound() {
        System.out.println("Sparrow chirps");
    }
}


class Ostrich extends Bird {
    public void makeSound() {
        System.out.println("Ostrich booms");
    }
}


public class LSP {
    public static void main(String[] args) {
        Bird bird1 = new Sparrow();
        Bird bird2 = new Ostrich();

        bird1.makeSound(); 
        bird2.makeSound(); 

        
        Flyable flyingBird = new Sparrow();
        flyingBird.fly(); 
    }
}
