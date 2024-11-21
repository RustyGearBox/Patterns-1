package org.example;

import org.example.enums.DoughType;
import org.example.enums.PizzaType;
import org.example.enums.SizeType;

public class Pizza {

    private final SizeType size;
    private final DoughType dough;
    private final PizzaType type;

    public Pizza(SizeType size, DoughType dough, PizzaType toppings) {
        this.size = size;
        this.dough = dough;
        this.type = toppings;
    }

    public SizeType getSize() {
        return size;
    }

    public DoughType getDough() {
        return dough;
    }

    public PizzaType getType() {
        return type;
    }
}
