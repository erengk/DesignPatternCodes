package org.example.strategyPattern;

public class FlyRocketPowered implements FlyBehavior{
    public void fly() {
        System.out.println("FlyRocketPowered");
    }
}
