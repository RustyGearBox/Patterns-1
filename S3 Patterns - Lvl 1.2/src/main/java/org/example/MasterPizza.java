package org.example;

import org.example.builders.BuilderPizza;
import org.example.fields.Dough;
import org.example.fields.Size;

import java.util.List;

public class MasterPizza {

    public Pizza buildPizza(BuilderPizza builder, Size size, Dough dough, List<String> toppings) {
        builder.setSize(size);
        builder.setDough(dough);
        toppings.forEach(builder::addToppings);
        return builder.build();
    }

}
