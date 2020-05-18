package org.prep.stnqu;

import org.junit.Test;

import static org.junit.Assert.*;

public class ThreeStackTest {

    @Test
    public void printStack() {

    }

    @Test
    public void push() throws Exception {
        ThreeStack tS = new ThreeStack(15);
        tS.push(0,1);
        tS.push(0,2);
        tS.push(0,3);
        tS.push(0,4);
        tS.push(0,5);

        tS.push(1,6);
        tS.push(1,7);
        tS.push(1,8);
        tS.push(1,9);
        tS.push(1,10);

        tS.push(2,11);
        tS.push(2,12);
        tS.push(2,13);
        tS.push(2,14);
        tS.push(2,15);

        tS.printStack(0);
        tS.printStack(1);
        tS.printStack(2);

    }

    @Test
    public void pop() throws Exception {

        ThreeStack tS = new ThreeStack(15);
        tS.push(0,1);
        tS.push(0,2);
        tS.push(0,3);
        tS.push(0,4);
        tS.push(0,5);
        System.out.println(tS.pop(0));
        System.out.println(tS.pop(0));
        System.out.println(tS.pop(0));
        System.out.println(tS.pop(0));
        System.out.println(tS.pop(0));



        tS.push(1,6);
        tS.push(1,7);
        tS.push(1,8);
        tS.push(1,9);
        tS.push(1,10);
        System.out.println(tS.pop(1));
        System.out.println(tS.pop(1));
        System.out.println(tS.pop(1));
        System.out.println(tS.pop(1));
        System.out.println(tS.pop(1));


        tS.push(2,11);
        tS.push(2,12);
        tS.push(2,13);
        tS.push(2,14);
        tS.push(2,15);
        System.out.println(tS.pop(2));
        System.out.println(tS.pop(2));
        System.out.println(tS.pop(2));
        System.out.println(tS.pop(2));
        System.out.println(tS.pop(2));

    }

    @Test
    public void peek() {
    }

    @Test
    public void isEmpty() {
    }

    @Test
    public void isFull() {
    }
}