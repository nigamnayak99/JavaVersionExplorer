package com.nigam.javaversionexplorer.types;

import com.nigam.javaversionexplorer.interfaces.Animal;
import com.nigam.javaversionexplorer.interfaces.Bird;

public class Ostrich implements Bird, Animal {


    @Override
    public void getSound() {
        Bird.super.getSound();     //Resolving Diamond Problem
    }
}
