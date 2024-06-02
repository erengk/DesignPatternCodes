package org.example._4_factoryMethodPattern;

public class ChicagoStyleMargheritaPizza extends Pizza {
    public ChicagoStyleMargheritaPizza() {
        name = "Chicago Style Margherita Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Tomato Basil Sauce";

        toppings.add("Fresh Mozzarella");
        toppings.add("Parmesan");
        toppings.add("Basil");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}

