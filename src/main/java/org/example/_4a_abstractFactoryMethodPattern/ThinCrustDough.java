package org.example._4a_abstractFactoryMethodPattern;

public class ThinCrustDough implements Dough{
    @Override
    public String getDoughType() {
        return "Thin Crust Dough";
    }
}
