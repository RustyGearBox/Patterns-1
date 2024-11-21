package org.example;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    private MasterPizza masterPizza = new MasterPizza();

    public static void main(String[] args) {

        System.out.println("Select the pizza: \n"
                + "1. Carbonara.\n"
                + "2. Pepperoni.\n");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                makeCarbonara();
                break;
            case 2:
                makePepperoni();
                break;
            default:
                System.out.println("Select one of the valid options");
        }

    }
}
