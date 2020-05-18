package org.prep.lists;

import org.junit.Test;
import org.prep.utility.SListNode;

import static org.junit.Assert.*;

public class ListIntersectionTest {


    @Test
    public void testCheckIntersection_SameLength(){
        SListNode a = new SListNode(1,null);
        a.next = new SListNode(2,null);
        a.next.next = new SListNode(3,null);
        a.next.next.next = new SListNode(4,null);


        SListNode b = new SListNode(5,null);
        b.next = new SListNode(6,null);
        b.next.next = a.next.next;
        assertEquals(a.next.next,new ListIntersection().checkIntersection(a,b));
    }


    @Test
    public void testCheckIntersection_BShorter(){
        SListNode a = new SListNode(1,null);
        a.next = new SListNode(2,null);
        a.next.next = new SListNode(3,null);
        a.next.next.next = new SListNode(4,null);


        SListNode b = new SListNode(5,null);
        b.next = a.next.next;

        assertEquals(a.next.next,new ListIntersection().checkIntersection(a,b));
    }

    @Test
    public void testCheckIntersection_AShorter(){
        SListNode b = new SListNode(1,null);
        b.next = new SListNode(2,null);
        b.next.next = new SListNode(3,null);
        b.next.next.next = new SListNode(4,null);


        SListNode a = new SListNode(5,null);
        a.next = b.next.next;

        assertEquals(b.next.next,new ListIntersection().checkIntersection(a,b));
    }


    @Test
    public void testCheckIntersection_BInsideA(){
        SListNode a = new SListNode(1,null);
        a.next = new SListNode(2,null);
        a.next.next = new SListNode(3,null);
        a.next.next.next = new SListNode(4,null);


        SListNode b = a.next;

        assertEquals(a.next,new ListIntersection().checkIntersection(a,b));
    }


    @Test
    public void testCheckIntersection_LastElementIntersection(){
        SListNode a = new SListNode(1,null);
        a.next = new SListNode(2,null);
        a.next.next = new SListNode(3,null);
        a.next.next.next = new SListNode(4,null);


        SListNode b = new SListNode(5,null);
        b.next = new SListNode(6,null);
        b.next.next = new SListNode(7,null);
        b.next.next.next = new SListNode(8,null);
        b.next.next.next.next = a.next.next.next;
        assertEquals(a.next.next.next,new ListIntersection().checkIntersection(a,b));
    }


    @Test
    public void testCheckIntersection_NoIntersection(){
        SListNode a = new SListNode(1,null);
        a.next = new SListNode(2,null);
        a.next.next = new SListNode(3,null);
        a.next.next.next = new SListNode(4,null);


        SListNode b = new SListNode(5,null);
        b.next = new SListNode(6,null);
        b.next.next = new SListNode(7,null);
        b.next.next.next = new SListNode(8,null);


        assertNull(new ListIntersection().checkIntersection(a,b));
    }

}