package org.prep.lists;

import org.junit.Test;
import org.prep.utility.ArrayUtility;
import org.prep.utility.ListUtility;
import org.prep.utility.SListNode;

import static org.junit.Assert.*;

public class ListPartitioningTest {

    @Test
    public void testBaseCase(){
        SListNode head = ListUtility.convArrayToSList(new int[]{3,5,8,5,10,2,1});
        new ListPartitioning().partitionAround(head,5);
        int[] expected = ListUtility.convSListToIntArray(head);
        ArrayUtility.printArray(expected);
    }


}