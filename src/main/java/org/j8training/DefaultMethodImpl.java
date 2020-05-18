package org.j8training;

public class DefaultMethodImpl implements DefaultMethodDemo {

    public void printme(){
        //To call the interface metohod inside the implementation
        DefaultMethodDemo.super.printme();
        System.out.println("Overriden method");
    }

    public static void main(String args[]){
        new DefaultMethodImpl().printme();
        //to call the interface method


    }
}
