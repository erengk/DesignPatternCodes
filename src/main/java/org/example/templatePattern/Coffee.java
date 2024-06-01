package org.example.templatePattern;

class Coffee extends Beverage {
    void brew() {
        System.out.println("Dripping coffee through filter");
    }

    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    @Override
    boolean customerWantsCondiments() {
        return true; // or some logic to determine this
    }
}

