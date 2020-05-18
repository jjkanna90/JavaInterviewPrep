package org.prep.lists;

import org.junit.Test;
import org.prep.utility.SListNode;

import static org.junit.Assert.*;

public class CycleDetectionTest {

    @Test
    public void testDetectCycle_base(){
        SListNode a = new SListNode(1,null);
        a.next = new SListNode(2,null);
        a.next.next = new SListNode(3,null);
        a.next.next.next = new SListNode(4,null);
        a.next.next.next.next = new SListNode(5,null);
        a.next.next.next.next.next = new SListNode(6,null);
        a.next.next.next.next.next.next = new SListNode(7,null);
        a.next.next .next.next.next.next.next= new SListNode(8,null);
        a.next.next.next.next.next.next.next.next = a.next.next.next;


        assertEquals(a.next.next.next,new CycleDetection().detectCycle(a));


    }

}