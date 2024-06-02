package org.example._1_strategyPattern;

public class MuteQuack implements QuackBehavior{
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
