package org.prep.lists;

import org.junit.Test;
import org.prep.utility.ArrayUtility;
import org.prep.utility.ListUtility;
import org.prep.utility.SListNode;

import static org.junit.Assert.*;

public class MiddleNodeDeletionTest {

    @Test
    public void testBaseCase(){
        SListNode head = ListUtility.convArrayToSList(new int[]{1,2,3,4,5,6});
        SListNode nodeToDel = head;
        while(nodeToDel!=null && nodeToDel.value!=4){
            nodeToDel=nodeToDel.next;
        }
        new MiddleNodeDeletion().deleteMiddleNode(nodeToDel);
        int[] actual = ListUtility.convSListToIntArray(head);
        ArrayUtility.printArray(actual);
        int[] expected = new int[]{1,2,3,5,6};
        assertArrayEquals(expected,actual);
    }

}