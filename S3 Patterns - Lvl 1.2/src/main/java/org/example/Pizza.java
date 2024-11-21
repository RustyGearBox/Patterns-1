package org.example;

import org.example.fields.Dough;
import org.example.fields.Size;
import org.example.fields.Topping;

import java.util.List;
import java.util.stream.Collectors;

public class Pizza {

    private Size size;
    private Dough dough;
    private List<Topping> toppings;

    public Pizza(Size size, Dough dough, List<Topping> toppings) {
        this.size = size;
        this.dough = dough;
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        String toppingsList = toppings.stream()
                .map(Topping::getName)
                .collect(Collectors.joining(", "));
        return "Size: " + size + ", Dough: " + dough + ", Toppings: " + toppingsList + ".";
    }

}
