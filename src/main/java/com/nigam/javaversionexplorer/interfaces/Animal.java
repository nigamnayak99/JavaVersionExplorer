package com.nigam.javaversionexplorer.interfaces;


public interface Animal {

    boolean canRun = true;
    boolean canSwim = true;
    boolean canFly = false;

    // Static method: Utility behavior common to all animals
    static void describe() {
        System.out.println("Animals are multicellular organisms that form the biological kingdom Animalia.");
    }

    // Default method: General sound for animals
    default void makeSound() {
        System.out.println("Roar / Growl");
    }
}
