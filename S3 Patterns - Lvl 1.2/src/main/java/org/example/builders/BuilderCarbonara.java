package org.example.builders;

import org.example.Pizza;
import org.example.fields.Dough;
import org.example.fields.Size;
import org.example.fields.Topping;

import java.util.ArrayList;
import java.util.List;

public class BuilderCarbonara implements BuilderPizza {

    private Size size;
    private Dough dough;
    private List<Topping> toppings = new ArrayList<>();

    public BuilderCarbonara() {
        toppings.add(new Topping("Bacon"));
        toppings.add(new Topping("Onion"));
        toppings.add(new Topping("Mushrooms"));;
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
