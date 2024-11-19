package com.nigam.javaversionexplorer.java8.default_and_static_method;

import com.nigam.javaversionexplorer.interfaces.Animal;
import com.nigam.javaversionexplorer.interfaces.Bird;
import com.nigam.javaversionexplorer.types.Ostrich;

public class DiamondProblem {

    public static void main(String[] args) {
        Ostrich ostrich = new Ostrich();
        ostrich.makeSound();
        System.out.println("Can Fly : " + Animal.canFly);
        System.out.println("Can RUn : " + Bird.canRun);
    }
}
