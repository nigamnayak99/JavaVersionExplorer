package com.nigam.javaversionexplorer.java8.default_and_static_method;

import com.nigam.javaversionexplorer.interfaces.Bird;
import com.nigam.javaversionexplorer.types.Sparrow;

public class StaticMethodDemo {

    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        sparrow.makeSound();
        Bird.describe(); // sparrow.describe() is incorrect as there is no overriding for class methods.
    }
}
