package org.example._1_strategyPattern;

public class FlyNoWay implements FlyBehavior{
    public void fly() {
        System.out.println("I can not fly");
    }
}
