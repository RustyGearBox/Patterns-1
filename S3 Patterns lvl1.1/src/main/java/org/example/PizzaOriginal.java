package org.example;

import org.example.enums.Dough;
import org.example.enums.Size;

import java.util.List;

public class PizzaOriginal {
    public Pizza buildPizza(PizzaBuilder pizzaBuilder, Size size, Dough dough, List<Topping> toppings) {
        pizzaBuilder.setSize(size);
        pizzaBuilder.setDough(dough);
        addTopping.forEach(pizzaBuilder::addToppings);
        return pizzaBuilder.build();
    }
}
