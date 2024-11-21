package org.example;

public class Main {
    public static void main(String[] args) {

        Director director = new Director();
        PizzaBuilder builder = new PizzaBuilder();

        director.constructPizzaFreeGluten(builder);

        Pizza pizza = builder.getResult();

        director.

    }
}