package com.nigam.javaversionexplorer.interfaces;


public interface Animal {

    boolean canRun = true;
    boolean canSwim = true;
    boolean canFly = false;

    default void getSound(){
        System.out.println("Sound: Roar/Growll");
    }
}
