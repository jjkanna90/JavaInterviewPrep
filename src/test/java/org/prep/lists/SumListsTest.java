package org.prep.lists;

import org.junit.Test;
import org.prep.utility.ListUtility;
import org.prep.utility.SListNode;

import static org.junit.Assert.*;

public class SumListsTest {
    @Test
    public void testDoReverseSum_BaseCase(){
        SListNode a = ListUtility.convArrayToSList(new int[]{7,1,6});
        SListNode b = ListUtility.convArrayToSList(new int[]{5,9,2});

        SListNode c = new SumLists().doRevereseSum(a,b);
        ListUtility.printLinkedList(c);
        assertArrayEquals(new int[]{2,1,9},ListUtility.convSListToIntArray(c));


    }

    @Test
    public void testDoReverseSum_FirstDigCarryCase(){
        SListNode a = ListUtility.convArrayToSList(new int[]{7,1,8});
        SListNode b = ListUtility.convArrayToSList(new int[]{5,9,2});

        SListNode c = new SumLists().doRevereseSum(a,b);
        ListUtility.printLinkedList(c);
        assertArrayEquals(new int[]{2,1,1,1},ListUtility.convSListToIntArray(c));
    }

    @Test
    public void testDoReverseSum_AShorterCase(){
        SListNode a = ListUtility.convArrayToSList(new int[]{7,1});
        SListNode b = ListUtility.convArrayToSList(new int[]{5,9,2});

        SListNode c = new SumLists().doRevereseSum(a,b);
        ListUtility.printLinkedList(c);
        assertArrayEquals(new int[]{2,1,3},ListUtility.convSListToIntArray(c));
    }

    @Test
    public void testDoReverseSum_BShorterCase(){
        SListNode b = ListUtility.convArrayToSList(new int[]{7,1});
        SListNode a = ListUtility.convArrayToSList(new int[]{5,9,2});

        SListNode c = new SumLists().doRevereseSum(a,b);
        ListUtility.printLinkedList(c);
        assertArrayEquals(new int[]{2,1,3},ListUtility.convSListToIntArray(c));
    }


    @Test
    public void testDoForwardSum_BaseCase(){
        SListNode a = ListUtility.convArrayToSList(new int[]{6,1,7});
        SListNode b = ListUtility.convArrayToSList(new int[]{2,9,5});

        SListNode c = new SumLists().doForwardSum(a,b);
        ListUtility.printLinkedList(c);
        assertArrayEquals(new int[]{9,1,2},ListUtility.convSListToIntArray(c));


    }

    @Test
    public void testDoForwardSum_FirstDigCarryCase(){
        SListNode a = ListUtility.convArrayToSList(new int[]{8,1,7});
        SListNode b = ListUtility.convArrayToSList(new int[]{2,9,5});

        SListNode c = new SumLists().doForwardSum(a,b);
        ListUtility.printLinkedList(c);
        assertArrayEquals(new int[]{1,1,1,2},ListUtility.convSListToIntArray(c));
    }

    @Test
    public void testDoForwardSum_AShorterCase(){
        SListNode a = ListUtility.convArrayToSList(new int[]{1,7});
        SListNode b = ListUtility.convArrayToSList(new int[]{2,9,5});

        SListNode c = new SumLists().doForwardSum(a,b);
        ListUtility.printLinkedList(c);
        assertArrayEquals(new int[]{3,1,2},ListUtility.convSListToIntArray(c));
    }

    @Test
    public void testDoForwardSum_BShorterCase(){
        SListNode b = ListUtility.convArrayToSList(new int[]{1,7});
        SListNode a = ListUtility.convArrayToSList(new int[]{2,9,5});

        SListNode c = new SumLists().doForwardSum(a,b);
        ListUtility.printLinkedList(c);
        assertArrayEquals(new int[]{3,1,2},ListUtility.convSListToIntArray(c));
    }

}