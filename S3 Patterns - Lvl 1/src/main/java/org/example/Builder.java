package org.example;

import org.example.enums.DoughType;
import org.example.enums.PizzaType;
import org.example.enums.SizeType;

public interface Builder {

    void setSize(SizeType size);
    void setDough(DoughType dough);
    void setToppings(PizzaType type);

}