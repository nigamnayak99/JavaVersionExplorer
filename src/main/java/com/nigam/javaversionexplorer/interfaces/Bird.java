package com.nigam.javaversionexplorer.interfaces;

public interface Bird {

    boolean canRun = false;
    boolean canSwim = false;
    boolean canFly = true;

    // Static method: Utility behavior common to all birds
    static void describe() {
        System.out.println("Birds are warm-blooded vertebrates characterized by feathers, beaks, and laying eggs.");
    }

    // Default method: General sound for birds
    default void makeSound() {
        System.out.println("Tweet-tweet");
    }
}
