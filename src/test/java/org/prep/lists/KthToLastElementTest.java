package org.prep.lists;

import org.junit.Assert;
import org.junit.Test;
import org.prep.utility.ListUtility;
import org.prep.utility.SListNode;

import static org.junit.Assert.*;

public class KthToLastElementTest {

    @Test
    public void testBaseCase(){
        SListNode head = ListUtility.convArrayToSList(new int[]{1,2,3,4,5,6,7,8});
        int actual = new KthToLastElement().findKthToLastElement(head,2);
        int expected = 7;
        Assert.assertEquals(actual,expected);
    }


    @Test
    public void testFindLastElementCase(){
        SListNode head = ListUtility.convArrayToSList(new int[]{1,2,3,4,5,6,7,8});
        int actual = new KthToLastElement().findKthToLastElement(head,1);
        int expected = 8;
        Assert.assertEquals(actual,expected);
    }

}