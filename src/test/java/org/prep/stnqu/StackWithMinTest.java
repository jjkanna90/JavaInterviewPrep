package org.prep.stnqu;

import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.*;

public class StackWithMinTest {

    @Test
    public void pushAndPop() {

        StackWithMin minS = new StackWithMin();
        minS.push(1);
        minS.push(2);
        minS.push(3);
        minS.push(4);

        assertEquals(minS.pop(),Integer.valueOf(4));
        assertEquals(minS.pop(),Integer.valueOf(3));
        assertEquals(minS.pop(),Integer.valueOf(2));
        assertEquals(minS.pop(),Integer.valueOf(1));

    }


    @Test
    public void min() {

        StackWithMin minS = new StackWithMin();
        minS.push(4);
        assertEquals(minS.min(),Integer.valueOf(4));
        minS.push(3);
        assertEquals(minS.min(),Integer.valueOf(3));
        minS.push(2);
        assertEquals(minS.min(),Integer.valueOf(2));
        minS.push(1);

        assertEquals(minS.min(),Integer.valueOf(1));

        minS.pop();
        assertEquals(minS.min(),Integer.valueOf(2));
        minS.pop();
        assertEquals(minS.min(),Integer.valueOf(3));
        minS.pop();
        assertEquals(minS.min(),Integer.valueOf(4));
        minS.pop();
        assertNull(minS.min());
    }

    @Test
    public void minWithReps() {

        StackWithMin minS = new StackWithMin();
        minS.push(4);
        assertEquals(minS.min(),Integer.valueOf(4));
        minS.push(5);
        assertEquals(minS.min(),Integer.valueOf(4));
        minS.push(2);
        assertEquals(minS.min(),Integer.valueOf(2));
        minS.push(3);
        assertEquals(minS.min(),Integer.valueOf(2));
        minS.push(2);
        assertEquals(minS.min(),Integer.valueOf(2));



        minS.pop();
        assertEquals(minS.min(),Integer.valueOf(2));
        minS.pop();
        assertEquals(minS.min(),Integer.valueOf(2));
        minS.pop();
        assertEquals(minS.min(),Integer.valueOf(4));
        minS.pop();
        assertEquals(minS.min(),Integer.valueOf(4));
        minS.pop();
        assertNull(minS.min());
    }

    @Test
    public void peek() {
        StackWithMin minS = new StackWithMin();
        minS.push(1);
        assertEquals(minS.peek(),Integer.valueOf(1));
        assertEquals(minS.pop(),Integer.valueOf(1));
    }

    @Test
    public void isEmpty() {
        StackWithMin minS = new StackWithMin();
        assertEquals(minS.isEmpty(),true);
    }
}