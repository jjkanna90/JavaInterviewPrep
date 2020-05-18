package org.j8training;


@FunctionalInterface
public interface FunctionalIntfDemo {

    //Functional Interface : interface with a single public abstract method
    // Used with functional programming
    // Also called Single Abstract Method interfaces ( SAM Interfaces )
    // Example is Runnable interface
    // FunctionalInterface annotation is just like a marker which instructs the compiler to flag an error if more than one abstract method is defined.


    public abstract int doOperation(int a, int b);


    // overriding object methods in functional interface does not count
    @Override
    public String toString();
}



