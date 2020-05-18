package org.prep.lists;

import org.junit.Test;
import org.prep.utility.ListUtility;
import org.prep.utility.SListNode;

public class RemoveDupsTest {


    @Test
    public void baseTestSorted(){
        SListNode head = ListUtility.convArrayToSList(new int[]{1,2,3,3,4,4,5});
        ListUtility.printLinkedList(head);
        new RemoveDups().removeDupsWithBuffer(head);
        ListUtility.printLinkedList(head); 
    }


    @Test
    public void baseTestUnSorted(){
        SListNode head = ListUtility.convArrayToSList(new int[]{2,2,1,3,4,2,5,1,3,3,4,4,5});
        ListUtility.printLinkedList(head);
        new RemoveDups().removeDupsWithBuffer(head);
        ListUtility.printLinkedList(head);
    }
}
