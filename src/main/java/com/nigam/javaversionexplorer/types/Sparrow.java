package com.nigam.javaversionexplorer.types;

import com.nigam.javaversionexplorer.interfaces.Bird;

public class Sparrow implements Bird {

    // Overriding the default method for specific behavior
    @Override
    public void makeSound() {
        System.out.println("Squawk");
    }

}
