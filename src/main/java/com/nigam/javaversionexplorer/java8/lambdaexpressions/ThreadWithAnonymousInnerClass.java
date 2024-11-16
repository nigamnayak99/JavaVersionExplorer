package com.nigam.javaversionexplorer.java8.lambdaexpressions;

public class ThreadWithAnonymousInnerClass {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Creating thread by Anonymous Inner Class");
            }
        };
        Thread t = new Thread(runnable);
        t.start();
    }
}
