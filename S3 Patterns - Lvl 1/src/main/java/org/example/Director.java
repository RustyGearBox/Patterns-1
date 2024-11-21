package org.example;

import org.example.enums.DoughType;
import org.example.enums.PizzaType;
import org.example.enums.SizeType;

public class Director {

    public void constructPizzaFreeGluten(Builder builder) {
        builder.setSize(SizeType.NORMAL);
        builder.setDough(DoughType.FREE_GLUTEN);
        builder.setToppings(PizzaType.MARGARITA);
    }

    public void constructPizzaMonster(Builder builder) {
        builder.setSize(SizeType.MONSTER);
        builder.setDough(DoughType.NEAPOLITAN);
        builder.setToppings(PizzaType.BBQ);
    }

}