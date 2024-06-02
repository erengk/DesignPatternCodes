package org.example._4_factoryMethodPattern;

public class NYStyleBBQChickenPizza extends Pizza {
    public NYStyleBBQChickenPizza() {
        name = "NY Style BBQ Chicken Pizza";
        dough = "Thin Crust Dough";
        sauce = "BBQ Sauce";

        toppings.add("Grilled Chicken");
        toppings.add("Red Onions");
        toppings.add("Cilantro");
        toppings.add("Smoked Gouda");
        toppings.add("Mozzarella");
    }
}

