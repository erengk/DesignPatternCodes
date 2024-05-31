package org.example.strategyPattern;

public class Squeak implements QuackBehavior{
    public void quack() {
        System.out.println("Squeak");
    }
}
