package com.nigam.javaversionexplorer.interfaces;

public interface Bird {

    boolean canRun = false;
    boolean canSwim = false;
    boolean canFly = true;

    default void getSound(){
        System.out.println("Sound : Chirp Chirp");
    }
}
