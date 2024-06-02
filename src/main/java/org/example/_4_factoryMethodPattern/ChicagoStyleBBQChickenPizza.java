package org.example._4_factoryMethodPattern;

public class ChicagoStyleBBQChickenPizza extends Pizza {
    public ChicagoStyleBBQChickenPizza() {
        name = "Chicago Style BBQ Chicken Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "BBQ Sauce";

        toppings.add("Grilled Chicken");
        toppings.add("Red Onions");
        toppings.add("Cilantro");
        toppings.add("Smoked Gouda");
        toppings.add("Mozzarella");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}

