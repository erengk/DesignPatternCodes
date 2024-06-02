package org.example._1_strategyPattern;

public class Quack implements QuackBehavior{
    public void quack() {
        System.out.println("Quack");
    }
}
