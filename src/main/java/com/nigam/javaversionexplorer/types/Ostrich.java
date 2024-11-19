package com.nigam.javaversionexplorer.types;

import com.nigam.javaversionexplorer.interfaces.Animal;
import com.nigam.javaversionexplorer.interfaces.Bird;

public class Ostrich implements Bird, Animal {

    //Overriding default method for specific behaviour.
    @Override
    public void makeSound() {
        Bird.super.makeSound();
    }
}
