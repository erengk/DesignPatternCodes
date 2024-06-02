package org.example._1_strategyPattern;

public class Squeak implements QuackBehavior{
    public void quack() {
        System.out.println("Squeak");
    }
}
