package org.example.builders;

import org.example.Pizza;
import org.example.fields.Dough;
import org.example.fields.Size;

public interface BuilderPizza {

    public void setSize(Size size);
    public void setDough(Dough dough);
    public void addToppings(String toppings);
    Pizza build();

}
