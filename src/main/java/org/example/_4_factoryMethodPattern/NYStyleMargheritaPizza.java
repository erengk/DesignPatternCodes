package org.example._4_factoryMethodPattern;

public class NYStyleMargheritaPizza extends Pizza {
    public NYStyleMargheritaPizza() {
        name = "NY Style Margherita Pizza";
        dough = "Thin Crust Dough";
        sauce = "Tomato Basil Sauce";

        toppings.add("Fresh Mozzarella");
        toppings.add("Parmesan");
        toppings.add("Basil");
    }
}

