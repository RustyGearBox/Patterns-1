package org.example.builders;

import org.example.Pizza;
import org.example.fields.Dough;
import org.example.fields.Size;
import org.example.fields.Topping;

import java.util.ArrayList;
import java.util.List;

public class BuilderPepperoni implements BuilderPizza {

    private Size size;
    private Dough dough;
    private List<Topping> toppings = new ArrayList<>();

    public BuilderPepperoni() {
        toppings.add(new Topping("Cheese"));
        toppings.add(new Topping("Pepperoni"));
        toppings.add(new Topping("Red Pepper"));
    }

    @Override
    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public void setDough(Dough dough) {
        this.dough = dough;
    }

    @Override
    public void addToppings(String topping) {
        toppings.add(new Topping(topping));
    }

    @Override
    public Pizza build() {
        return new Pizza(size, dough, toppings);
    }

}