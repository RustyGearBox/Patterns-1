package org.example.fields;

import java.util.Scanner;

public enum Size {
    NORMAL("normal"),
    LARGE("large"),
    FAMILIAR("familiar");

    private String size;

    Size(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }
}

static Scanner sc = new Scanner(System.in);

public Size chooseSize() {
    Size size = null;
    boolean valid = false;

    do {
        System.out.println("Choose a size (SMALL, MEDIUM, LARGE):");
        String selectedSize = sc.next();

        if (selectedSize.equalsIgnoreCase("NORMAL")) {
            size = Size.NORMAL;
            valid = true;
        } else if (selectedSize.equalsIgnoreCase("LARGE")) {
            size = Size.LARGE;
            valid = true;
        } else if (selectedSize.equalsIgnoreCase("FAMILIAR")) {
            size = Size.FAMILIAR;
            valid = true;
        } else {
            System.out.println("Invalid size, please select between the options.");
        }
    } while (!valid);

    return size;
}
}

public void main() {
}