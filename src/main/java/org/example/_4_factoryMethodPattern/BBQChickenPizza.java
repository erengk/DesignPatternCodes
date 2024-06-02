package org.example._4_factoryMethodPattern;

public class BBQChickenPizza extends Pizza {
    public BBQChickenPizza() {
        name = "BBQ Chicken Pizza";
        dough = "Thin crust";
        sauce = "BBQ sauce";
        toppings.add("Grilled chicken");
        toppings.add("Sliced red onion");
        toppings.add("Cilantro");
        toppings.add("Smoked gouda");
        toppings.add("Mozzarella");
    }
}

