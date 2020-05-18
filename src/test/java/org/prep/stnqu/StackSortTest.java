package org.prep.stnqu;

import org.junit.Test;
import org.prep.utility.MyStack;

import static org.junit.Assert.*;

public class StackSortTest {

    @Test
    public void sortAscending() {

        MyStack<Integer> iStack = new MyStack<>();
        iStack.push(4);
        iStack.push(2);
        iStack.push(3);
        iStack.push(1);

        new StackSort().sortAscending(iStack);
        iStack.printStack();;
    }
}