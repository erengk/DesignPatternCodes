package org.example.factoryMethodPattern;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else if (item.equals("bbqchicken")) {
            return new NYStyleBBQChickenPizza();
        } else if (item.equals("margherita")) {
            return new NYStyleMargheritaPizza();
        } else return null;
    }
}

