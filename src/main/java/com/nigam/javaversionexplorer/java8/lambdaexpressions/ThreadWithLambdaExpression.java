package com.nigam.javaversionexplorer.java8.lambdaexpressions;

public class ThreadWithLambdaExpression {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Create a thread using Lambda Expression.");
            }
        });
        t.start();
    }
}
