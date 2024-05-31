package org.example.factoryMethodPattern;

public class MargheritaPizza extends Pizza {
    public MargheritaPizza() {
        name = "Margherita Pizza";
        dough = "Thin crust";
        sauce = "Tomato basil sauce";
        toppings.add("Fresh mozzarella");
        toppings.add("Parmesan");
        toppings.add("Basil");
    }
}

