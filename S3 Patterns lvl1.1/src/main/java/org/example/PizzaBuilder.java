package org.example;

import org.example.enums.Size;
import org.example.enums.Dough;

public interface PizzaBuilder {

    void setSize(Size size);
    void setDough(Dough dough);
    void addToppings(String toppings);
    Pizza.build();
}