package org.example;

import org.example.enums.DoughType;
import org.example.enums.PizzaType;
import org.example.enums.SizeType;

public class PizzaBuilder implements Builder {

    private SizeType size;
    private DoughType dough;
    private PizzaType type;

    public void setSize(SizeType size) {
        this.size = size;
    }

    public void setDough(DoughType dough) {
        this.dough = dough;
    }


    public void setToppings(PizzaType type) {
        this.type = type;
    }

    public Pizza getResult() {
        return new Pizza(size, dough, type);
    }

}